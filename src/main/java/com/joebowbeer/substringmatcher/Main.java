package com.joebowbeer.substringmatcher;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int longest = SubstringMatcher.findLongest(args[0], args[1]);
        System.out.println("Longest common sequence is " + longest + " chars");
    }
}
