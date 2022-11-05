package com.codewars;

public class JadenCasingStrings {

    public static void main(String[] args) {
        String string = "hello, my name is natalie";
        System.out.println(toJadenCase(string));
    }

    // makes first symbols of every word to uppercase
    public static String toJadenCase(String phrase) {

        if (phrase == null || phrase.isEmpty() || phrase.length() == 0) {
            return null;
        }

        else {
            char [] result = phrase.toCharArray();
            result [0] = Character.toUpperCase(result[0]);

            for (int i = 0; i < result.length - 1; i++) {
                if (result[i] == ' ') {
                    result[i + 1] = Character.toUpperCase(result[i + 1]);
                }
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < result.length; i++) {
                sb.append(result[i]);
            }
            return sb.toString();

        }

    }

}
