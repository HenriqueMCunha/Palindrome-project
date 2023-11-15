package com.sparta.hc;


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
        Assertions.assertEquals(true, App.isPalindrome("deified"));
    }

    @Test
    public void checkIsPalindromeWithStringBuilder() {
        Assertions.assertEquals(true, App.isPalindromeStringBuilder("madam"));
    }

    @ParameterizedTest
    @ValueSource(strings = {"madam", "mom", "racecar"})
    public void checkSeveralPalindromes(String string) {
        Assertions.assertEquals(true, App.isPalindrome(string));
    }

    @ParameterizedTest
    @ValueSource(strings = {"madam", "mom", "racecar"})
    public void checkSeveralPalindromesStringBuilder(String string) {
        Assertions.assertEquals(true, App.isPalindromeStringBuilder(string));
    }
}
