package com.sparta.hc.palindrome;

import java.util.Arrays;

public class Palindrome {
    public static boolean isPalindrome(String stringToTest) {

        char[] charArray = stringToTest.toCharArray();
        int lengthString = charArray.length;
        char[] charReverse = new char[lengthString];

        for (int i = lengthString - 1; i >= 0; i--) {
            charReverse[i] = charArray[lengthString - 1 - i];
        }

        if (Arrays.equals(charArray, charReverse)) {
            return true;
        } else {
            return false;
        }

//        for (int i = 0; i < lengthString; i++) {
//            if(charArray[i] != charReverse[i]) {
//                return false;
//            }
//        }
//        return true;
    }

    public static String findLongestPalindrome(String sentence) {
        if(sentence == null || sentence.isEmpty()) {
            return "";
        }

        String[] words = sentence.split("\\s+");
        String longestPalindrome = "";

        for (String word : words) {
            if (isPalindromeStringBuilder(word) == true) {
                String currentPalindrome = word;
                if (currentPalindrome.length() > longestPalindrome.length()) {
                    longestPalindrome = currentPalindrome;
                }
            }
//                String currentPalindrome = String.valueOf(isPalindromeStringBuilder(word));

        } return longestPalindrome;
    }

    public static boolean isPalindromeStringBuilder(String string) {
        StringBuilder reversedString = new StringBuilder(string).reverse();

        return string.equals(reversedString.toString());
    }

    public static void main( String[] args ) {
        System.out.println(isPalindrome("deified"));
        System.out.println(isPalindromeStringBuilder("mom"));
        System.out.println(findLongestPalindrome("madam mum redivider"));

    }
}
