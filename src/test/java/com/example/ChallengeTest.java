package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ChallengeTest {
    
    @Test
    void testIsPalindrome() {
        Challenge ch = new Challenge();
        assertEquals(true, ch.isPalindrome(""));
        assertEquals(true, ch.isPalindrome("n"));
        assertEquals(true, ch.isPalindrome("nn"));
        assertEquals(false, ch.isPalindrome("no"));
        assertEquals(true, ch.isPalindrome("non"));
        assertEquals(true, ch.isPalindrome("noon"));
        assertEquals(false, ch.isPalindrome("nylon"));
    }

    @Test
    void testChallenge() {
        Challenge ch = new Challenge();
        assertEquals("No file found.", ch.challenge(""));
        assertEquals("No file found.", ch.challenge(" "));
        assertEquals("word count: 0\ncharacter count: 0\npalindrome count: 0\npalindrome list: []", ch.challenge("nothing.txt"));
        assertEquals("word count: 1\ncharacter count: 4\npalindrome count: 1\npalindrome list: [noon]", ch.challenge("enterenternoon.txt"));
        assertEquals("word count: 5\ncharacter count: 45\npalindrome count: 5\npalindrome list: [racecar, rotor, pollop, qwewq, 123321]", ch.challenge("punctuation.txt"));
    }


}
