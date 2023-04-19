package org.sahil.LLD.OOP.INTERFACE;

public class RSAEncoder implements PasswordEncoder{
    @Override
    public String encode(String str) {
        StringBuilder reverseStr = new StringBuilder(str);
        return reverseStr.reverse().toString();
    }
}
