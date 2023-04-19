package org.sahil.LLD.OOP.Abstract;


public class RSAEncoder extends PasswordEncoder {
    @Override
    public String encode(String str) {
        StringBuilder reverseStr = new StringBuilder(str);
        return reverseStr.reverse().toString();
    }
}
