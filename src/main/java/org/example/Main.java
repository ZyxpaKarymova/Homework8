package org.example;

public class Main {
    public static void main(String[] args) {
        int[] weight = new int[]{-1, 2, 3};
        float[] fractions = new float[]{1.57f, 7.654f, 9.986f};
        String[] daysOfWeek = new String[]{
                "sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday"
        };
        System.out.println("Задача 2");
        int i;
        for (i = 0; i < weight.length - 1; i++) {
            System.out.print(weight[i] + ", ");
        }
        System.out.print(weight[i]);
        System.out.println("");

        for (i = 0; i < fractions.length - 1; i++) {
            System.out.print(fractions[i] + ", ");

        }
        System.out.print(fractions[i]);
        System.out.println("");
        for (i = 0; i < daysOfWeek.length - 1; i++) {
            System.out.print(daysOfWeek[i] + ", ");
        }
        System.out.print(daysOfWeek[i]);
        System.out.println("");

        System.out.println("Задача 3");
        for (i = weight.length - 1; i > 0; i--) {
            System.out.print(weight[i] + ", ");
        }
        System.out.print(weight[0]);
        System.out.println("");

        for (i = fractions.length - 1; i > 0; i--) {
            System.out.print(fractions[i] + ", ");
            System.out.print(fractions[0]);
        }
        System.out.println("");
        for (i = daysOfWeek.length - 1; i > 0; i--) {
            System.out.print(daysOfWeek[i] + ", ");
        }
        System.out.print(daysOfWeek[0]);
        System.out.println("");

        System.out.println("Задача 4");
        for (i = 0; i < weight.length; i++)
            if (weight[i] % 2 == 0) {
                weight[i] = weight[i] + 1;
            }

        for (i = 0; i < weight.length - 1; i++) {
            System.out.print(weight[i] + ", ");
        }
        System.out.print(weight[i]);
    }
}