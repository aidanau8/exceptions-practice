package com.pluralsight;

public class QuotesPractice {
    public static void main(String[] args) {
        String[] quotes = {
                "Never give up.",
                "Keep learning.",
                "Believe in yourself."
        };

        try {
            System.out.println(quotes[1]);
            System.out.println("After accessing the array");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index: " + e.getMessage());
        }

        System.out.println("Program continues");
    }
}