package org.sahil.JAVA_INTERNALS;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Stack;

/**
 * covariance, contravariance and invariance
 *
 * y = f(x) f ->List List<X>
 *          f -> add()
 * A, B; where A extends B
 *
 * covariance
 * f(A) extends f(B)
 *
 * contravariance
 * f(B) extends from f(A)
 *
 */


public class Generics {
    public static void main(String[] args){

        Truck t1 = new Truck();
        //Invariance
        Sand s1 = new Sand();
        Sand s2 = new Sand();
        Cement c1 = new Cement();
        t1.insert(s1);
        t1.insert(s2);
        t1.insert(c1);

        //Covariance
        Truck t2 = new Truck();
        ArrayList<Sand> sandArrayList = new ArrayList<>();
        sandArrayList.add(s1);
        sandArrayList.add(s2);
        //t2.insertAll(sandArrayList);   // this will not work insertAll(ArrayList<T> goods) will not be generic
        t2.insertAll(sandArrayList);  // we have used <? extends T> means any obj extended by goods can be stored in t2 list
        //contravariance
        //List<Sand> sandList = new ArrayList<Goods>();   // This line will not compile because we are storing supertype list into subtype list datatype
        List<? super Sand> sandList = new ArrayList<Goods>(); // using <? super Sand> we can store any obj which is super class of Sand class
        //we can't access from sandList it is write-only
        //Sand g1 = sandList.get(0);  // This will not work
        sandList.add(s1);
        Goods g1 = new Goods();
        //sandList.add(g1);

    }


    static class Goods{}
    static class Sand extends Goods{}
    static class Cement extends Goods{}
    static class Vehicle<T>{
        Stack<T> items = new Stack<>();
        int capacity = 10;
        int filled = 0;

        void print(){
            items.forEach(System.out::println);
        }

        void insertAll(ArrayList<? extends T> items){
            if(filled<capacity && items.size()<=capacity-filled){
                items.forEach(item -> this.items.push(item));
            }
            else {
                System.out.println("Container in bigger than capacity");
            }
        }

        void insert(T item){
            if(filled<capacity){
                filled++;
                items.push(item);
            }
            else{
                System.out.println("Vehicle is full");
            }
        }
    }

    static class Person{}

    static class SchoolBus extends Vehicle<Person>{}

    static class Truck extends Vehicle<Goods>{}

}
