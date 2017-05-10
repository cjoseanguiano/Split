package com.devix.company;

public class Main {

    public static void main(String[] args) {

        String value = "A,B,C";
        String part[] = value.split(",");

        for (String parts : part) {
            System.out.println(parts);
        }

    }
}
