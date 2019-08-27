package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Здраствуйте, введите выше имя: ");
        String name = sc.nextLine();
        System.out.println("Здраствуйте " + name);

        final String  H = "Привет,";
        String w = "мир!";
        String hw = H + " " + w;
        System.out.println(hw);
        System.out.println(H);
    }
}
