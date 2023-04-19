package org.sahil.JAVA_INTERNALS;

public class StringPool {
    public static void main(String[] args) {


        //Stored in StringPool
        String s1 = "java";
        String s2 = "java";
        String s3 = "javascript";

        // comparing addresses
        System.out.println(s1==s2); // java == java -> true

        System.out.println(s2==s3); // java == javascript -> false cause different address

        //stored in heap
        String s4 = new String("java");

        System.out.println(s1==s4); //comparing addresses -> false

        System.out.println(s4.equals(s1)); //comparing actual string literal -> true

        //created in heap and then put in into string pool
        String s5 = new String("java").intern();

        System.out.println(s1==s5); // both have same address and same literal stored in string pool -> true

        //when we make change to literal it stores in heap.
        String s6 = s1 + "script";

        System.out.println(s3==s6); //same literal but different addresses -> false

    }
}
