package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int c) {

        for(int i = 1; i <= c; i++){
            for (int o = c; o > i; o--) System.out.print(" ");
            for(int o = i; o >= 1; o--) System.out.print("*");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
