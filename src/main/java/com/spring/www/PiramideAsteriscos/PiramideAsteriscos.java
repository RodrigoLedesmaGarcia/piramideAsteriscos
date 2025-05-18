package com.spring.www.PiramideAsteriscos;

import java.util.Random;

public class PiramideAsteriscos {
    public static void main(String[] args) {

        Random random = new Random();
        int altura = random.nextInt(21);

        System.out.println(" ");
        if (altura < 5){
            altura += 6;
            piramide(altura);
        } else {
            piramide(altura);
        }
        System.out.println(" ");
    }
    public static void piramide(int altura){
        for (int i = 1; i <= altura; i++){
            for (int k = 1; k <= altura - i; k++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println(" "+i);
        }
    }
}
