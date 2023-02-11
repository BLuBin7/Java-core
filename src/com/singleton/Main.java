package com.singleton;

/**
 * Created by Binh
 * Date : 2/11/2023 - 5:42 PM
 * Description :
 */
public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();

    }
}

class Singleton {
    public static Singleton singleton = new Singleton();

    private Singleton(){ 
        System.out.println("asa");
    }

    public static Singleton getInstance()
    {
        singleton = new Singleton();
        return  singleton;
    }
}
