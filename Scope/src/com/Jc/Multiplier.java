package com.Jc;

/**
 * Created by priyaranjanjc on  ${date}.
 */
public class Multiplier {

    private int x;

    public Multiplier(int x) {
        this.x = x;
        mutliples();
    }

    public void mutliples(){
        for(int x=1;x <13;x++){
            System.out.println(x*this.x);
        }
    }
}
