package view;

import controller.ThreadVetor;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int array[] = new int[1000];

        for (int i=0; i<array.length; i++) {
            array[i] = 1 + random.nextInt(100); 
            System.out.println(array[i]);
        }
        Thread t=new ThreadVetor(1,array);
        Thread t2=new ThreadVetor(2,array);
        t.start();
        t2.start();

    }
}
