package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String Name, Hobby;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, what is your name?");
        Name = scanner.nextLine();

        System.out.println("What is your hobby?");
        Hobby = scanner.nextLine();

        System.out.println("Hello "+ Name + " , I also enjoy " + Hobby +"!!!");
    }
}