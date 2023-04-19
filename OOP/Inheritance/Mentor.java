package org.sahil.LLD.OOP.Inheritance;

public class Mentor extends User{
    private double experience;

    public Mentor(String name, String email,double experience){
        super(name,email);
        this.experience = experience;
    }

}
