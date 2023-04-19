package org.sahil.LLD.OOP.Inheritance;

import lombok.Getter;

@Getter
public class Student extends User {
    private double psp;
    private studentStatus status = studentStatus.ACTIVE;

    public Student(String name,String email){
        super(name,email);
        this.psp = 0;
    }


    public studentStatus changeStatus(studentStatus status) {
        if(status == studentStatus.DONE){
            return studentStatus.DONE;
        }
        this.status = status;
        return this.status;
    }
}
