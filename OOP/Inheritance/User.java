package org.sahil.LLD.OOP.Inheritance;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private static long count=0;
    private long id;
    private String name;
    private String email;

    public User(String name,String email){
        this.name = name;
        this.email = email;
        this.id = count++;
    }
    public void changeEmail(String email){
        this.email = email;
    }
}
