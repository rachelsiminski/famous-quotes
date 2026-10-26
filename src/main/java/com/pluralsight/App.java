package com.pluralsight;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        String[] quotes = {
                "The only way to do great work is to love what you do. - Steve Jobs",
                "In the middle of difficulty lies opportunity. - Albert Einstein",
                "It always seems impossible until it's done. - Nelson Mandela",
                "The journey of a thousand miles begins with a single step. - Lao Tzu",
                "Whether you think you can, or you think you can't, you're right. - Henry Ford",
                "Imagination is more important than knowledge. - Albert Einstein",
                "Well done is better than well said. - Benjamin Franklin",
                "The best way to predict the future is to invent it. - Alan Kay",
                "Talk is cheap. Show me the code. - Linus Torvalds",
                "Programs must be written for people to read, and only incidentally for machines to execute. - Harold Abelson"
        };

        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a quote (1-10): ");
        String userChoice = scanner.nextLine();;

        for (int i = 0; i < quotes.length - 1; i++) {

        }
    }
}
