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
        int substringLength = 0;
        Integer previousIndex = null;
        for (char c : a.toCharArray()) {
            Integer index = pos.get(c);
            if (index != null && previousIndex != null && index == previousIndex + 1) {
              // extend substring
              substringLength++;
            } else {
              // update longest and maybe start a new substring
              if (substringLength > longest) {
                longest = substringLength;
              }
              substringLength = (index == null) ? 0 : 1;
            }
            // advance previous index
            previousIndex = index;
        }
        return longest;
    }
}
