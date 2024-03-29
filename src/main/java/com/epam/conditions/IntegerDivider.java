package com.epam.conditions;

public class IntegerDivider {

    public void printCompletelyDivided(int d, int dr) {
        if (dr != 0) {
            int x = d / dr;

            if ((x * dr) == d) System.out.println("can be divided completely");
            else System.out.println("cannot be divided completely");
        }else {
            System.out.println("division by zero");
        }
    }

}
