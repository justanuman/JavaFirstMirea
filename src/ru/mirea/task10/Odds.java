package ru.mirea.task10;

public class Odds {
        public static void odds() {
            java.util.Scanner in = new java.util.Scanner(System.in);
            int n = in.nextInt();
            if (n > 0) {
                if (n % 2 == 1) {
                    System.out.println(n);
                    odds();
                } else {
                    odds();
                }
            }
        }
        public static void main(String[] args) {
            odds();
        }
    }
