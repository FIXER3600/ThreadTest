package controller;

import java.util.Random;

public class ThreadVetor extends Thread{
    public int n;
    public int vet[]=new int[0];
    public ThreadVetor(int n, int vet[]){

    }

    @Override
    public void run() {

        double tempoInicial = System.nanoTime();
        if(this.n%2==0){
            for (int i = 0 ; i < vet.length; i++){
                //
            }
            double tempoFinal = System.nanoTime();
            double tempoTotal = (tempoFinal - tempoInicial) / Math.pow(10, 9);
            System.out.println("Tempo total:"+tempoTotal + " s.");
        }else{
            tempoInicial = System.nanoTime();
            for (int i:this.vet) {
                //
            }
            double tempoFinal = System.nanoTime();
            double tempoTotal = (tempoFinal - tempoInicial) / Math.pow(10, 9);
            System.out.println("Tempo total:"+tempoTotal + " s.");
        }
        super.run();
    }


}
