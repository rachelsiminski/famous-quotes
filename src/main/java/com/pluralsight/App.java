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

        System.out.println("Welcome to Quotesy!");
        System.out.println("Choose a quote from the list, or enter '0' to quit!");
        System.out.println("Select a quote (1-10): ");
        int userChoice = scanner.nextInt();
        scanner.nextLine();

        try {
            while (userChoice != 0) {
//                switch (userChoice) {
//                    case 1 -> System.out.println(quotes[0]);
//                    case 2 -> System.out.println(quotes[1]);
//                    case 3 -> System.out.println(quotes[2]);
//                    case 4 -> System.out.println(quotes[3]);
//                    case 5 -> System.out.println(quotes[4]);
//                    case 6 -> System.out.println(quotes[5]);
//                    case 7 -> System.out.println(quotes[6]);
//                    case 8 -> System.out.println(quotes[7]);
//                    case 9 -> System.out.println(quotes[8]);
//                    case 10 -> System.out.println(quotes[9]);
//                    default -> System.out.println("Invalid input, please choose 1-10. or enter '0' to quit.");
//                }

                int i = userChoice - 1;

                System.out.println(quotes[i]);
                System.out.println();

                System.out.println("Choose another quote from the list, or enter '0' to quit!");
                userChoice = scanner.nextInt();
                scanner.nextLine();
            }
        } catch (Exception e) {
            // throw new RuntimeException(e);
            e.printStackTrace();
        }

        System.out.println("Thanks for joining us today!");
        scanner.close();
    }
}
