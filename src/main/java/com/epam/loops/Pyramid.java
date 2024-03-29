package com.epam.loops;

public class Pyramid {

    public void printPyramid(int c) {
        for(int i = 1; i <= c; i++){
            for(int o = c; o > i; o--) System.out.print(" ");
            for(int o = i; o >= 1; o--) System.out.print(o);
            for(int o = 2; o <= i; o++) System.out.print(o);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
