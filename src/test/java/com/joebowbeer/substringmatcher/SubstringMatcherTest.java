package com.joebowbeer.substringmatcher;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SubstringMatcherTest {
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of findLongest method, of class SubstringMatcher.
     */
    @Test
    public void testFindLongest() {
        assertEquals(0, SubstringMatcher.findLongest(
                "abc", ""));
        assertEquals(0, SubstringMatcher.findLongest(
                "abc", "def"));
        assertEquals(1, SubstringMatcher.findLongest(
                "aaa", "abc"));
        assertEquals(2, SubstringMatcher.findLongest(
                "abracadabra", "crab"));
        assertEquals(9, SubstringMatcher.findLongest(
                "abcdefggghijklmnnnopqrstuvvvwxyz",
                "abcdefghijklmnopqrstuvwxyz"));
        assertEquals(7, SubstringMatcher.findLongest(
                "abcdefhijklmopqrstuwxyz",
                "abcdefghijklmnopqrstuvwxyz"));
    }

    /**
     * Test of findLongest method, of class SubstringMatcher.
     */
    @Test (expected = IllegalArgumentException.class)
    public void testFindLongestNonDistinct() {
        assertEquals(9, SubstringMatcher.findLongest(
                "abcdefghijklmnopqrstuvwxyz",
                "abcdefggghijklmnnnopqrstuvvvwxyz"));
    }
}
