package com.sparta.hc;


import com.sparta.hc.palindrome.Palindrome;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void checkIsPalindrome() {
        Assertions.assertEquals(true, Palindrome.isPalindrome("deified"));
    }

    @Test
    public void checkIsPalindromeWithStringBuilder() {
        Assertions.assertEquals(true, Palindrome.isPalindromeStringBuilder("madam"));
    }

    @ParameterizedTest
    @ValueSource(strings = {"madam", "mom", "racecar"})
    public void checkSeveralPalindromes(String string) {
        Assertions.assertEquals(true, Palindrome.isPalindrome(string));
    }

    @ParameterizedTest
    @ValueSource(strings = {"madam", "mom", "racecar"})
    public void checkSeveralPalindromesStringBuilder(String string) {
        Assertions.assertEquals(true, Palindrome.isPalindromeStringBuilder(string));
    }
}
