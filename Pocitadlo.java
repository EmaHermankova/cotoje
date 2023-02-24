package org.example;

public class Pocitadlo {
    public static void main(String[] args) throws InterruptedException {
        VelkePole v = new VelkePole();

        System.out.println(v.secti());

        Thread t = new MojeV1(v);
        t.start();

        t.join();
        System.out.println(v.secti());
    }
}
