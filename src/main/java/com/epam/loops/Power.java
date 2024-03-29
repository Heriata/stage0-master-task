package com.epam.loops;

public class Power {

    public void printPower(int n, int power) {
        int res = 1;
        for(int i = 1; i <= power; i++){
            res *= n;
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }

}
