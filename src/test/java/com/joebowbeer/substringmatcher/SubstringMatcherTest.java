package com.joebowbeer.substringmatcher;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

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
        System.out.println("findLongest");
        String a = "abracadabra";
        String b = "crab";
        int expResult = 2;
        int result = SubstringMatcher.findLongest(a, b);
        assertEquals(expResult, result);
    }
}
