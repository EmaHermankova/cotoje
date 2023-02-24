package org.example;

public class MojeVlakno {


    public static void main(String[] args) {
        int max = 3;

          Runnable vlakno = new Runnable(){
            public void run(){
                for (int i = 0; i < max; i++) {
                    System.out.println("a");
                }
            }
        };

        Runnable vlakno2 = () -> {
            for (int i = 0; i < max; i++) {
                System.out.println(i);
            }
        };

        Thread tr = new Thread(vlakno);
        Thread tr2 = new Thread(vlakno2);

        tr.start();
        tr2.start();
    }
}