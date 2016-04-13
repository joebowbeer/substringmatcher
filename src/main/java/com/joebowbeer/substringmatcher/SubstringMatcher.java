package com.joebowbeer.substringmatcher;

import java.util.HashMap;
import java.util.Map;

/**
 * Given string a and b, with b containing all distinct characters,
 * finds length of longest common subsequence. 
 */
public class SubstringMatcher {

    private SubstringMatcher() {
        // Do not instantiate
    }

    public static int findLongest(String a, String b) {
        int len = b.length();
        Map<Character, Integer> pos = new HashMap<>(len);
        for (int i = 0; i < len; i++) {
            if (pos.put(b.charAt(i), i) != null) {
                throw new IllegalArgumentException(b);
            }
        }
        int longest = 0;
        int previousIndex = -1;
        int substringLength = 0;
        for (char c : a.toCharArray()) {
            Integer index = pos.get(c);
            if (index != null) {
                if (previousIndex == -1 || index == previousIndex + 1) {
                    // extend substring
                    previousIndex = index;
                    substringLength++;
                    continue;
                }
            }
            // finish substring and update longest
            if (substringLength > longest) {
                longest = substringLength;
            }
            previousIndex = -1;
            substringLength = 0;
        }
        return longest;
    }
}
