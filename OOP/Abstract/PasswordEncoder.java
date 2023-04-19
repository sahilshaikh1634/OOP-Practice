package org.sahil.LLD.OOP.Abstract;

public abstract class PasswordEncoder{
    private String publicKey = "hellohibyby"; //We can have attribute

    //We can have non implementation method which will be imposed to child
    public abstract String encode(String str);

    //We can have implementation method
    public String getPublicKey(){
        return this.publicKey;
    }

}

