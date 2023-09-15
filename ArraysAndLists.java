import java.util.*;
import java.lang.*;


public class ArraysAndLists {
    public static void main(String[] args) {
        String str1 = "ryan";
        String str2 = "nyar";
        String str3 = "john";

        boolean answer = isPermutated(str1, str3);
        System.out.println("Permutated? " + answer);
    }

    /*
     * IS UNIQUE: MY ATTEMPT
     * Implement an algorithm to determine if a string has all unique characters. What if you cannot
     * use additional data structures?
     */
    public static boolean isUnique(String str) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int count = 0;
        map.put(str.charAt(0), count);
        for (int i = 1; i < str.length(); ++i) {
            Character c = str.charAt(i);
            if (map.containsKey(c)) {
                return false;
            }
            map.put(c, 1);
        }
        return true;
    }

    /*
     * IS UNIQUE SOLUTION
     * First ask interviewer if the string is in ASCII or a Unicode string.
     * Asking this question will show an eye for detail and a solid foundation in CS.
     * Assume it's ASCII.
     * One solution is to create an array of boolean values, where the falg at index i indicates
     * whether a character i in the alphabet is contained in the string.
     * The second time you see this character you can immediately return false.
     * We can also immediately return false if the string length exceeds the number of unique
     * characters in the alphabet. 
     * After all, you can't form a string of 280 unique characters out of a 128 character alphabet.
     */
    public static boolean IsUnqiueChars(String str) {
        if (str.length() > 128) return false;

        boolean[] char_set = new boolean[128];
        for (int i = 0; i < str.length(); ++i) {
            int val = str.charAt(i);
            if (char_set[i]) { // already found this char in string
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }

    
    /*
     * CHECK PERMUTATION: MY ATTEMPT (FAILED)
     * Given two strings, write a method to decide if one is a permutation of the other
     */
    public static boolean isPermutated(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
        
        
        for (int i = 0; i < str1.length(); ++i) {
            map1.put(str1.charAt(i), 0);
            map2.put(str1.charAt(i), 0);
        }
       
        boolean answer = true;
        for (Character key : map1.keySet()) {
            if (map2.containsKey(key)) {
                answer = true;
            } else {
                return false;
            }
        }
        return true;
    }
    

    /*
     * CHECK PERMUTATION SOLUTION
     * Confirm details with interviewer, are the permutations case sensitive?
     * Is whitespace significant?
     * There are two solutions:
     * (1) Sort the strings
     * (2) Check if the two strings have identical character counts
     */
   
    /* Sort the strings */
    public static boolean permutation1(String s, String t) {
        
        // check if the lengths of the strings are equal, return false if not equal
        if (s.length() != t.length()) {
            return false;
        }
        
        // convert strings into primitive character arrays using toCharArray()
        char[] s_sort = s.toCharArray();
        char[] t_sort = t.toCharArray();

        // sort the arrays using the java.util.Arrays.sort() method
        java.util.Arrays.sort(s_sort);
        java.util.Arrays.sort(t_sort);
        
        // return boolean value of equal condition
        return s_sort.equals(t_sort);
    }

    /* Check if they have identical characters */
    public static boolean permutation2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] letters = new int[128]; // Assumption that character set is ASCII
        
        char[] s_array = s.toCharArray(); // converts string to primiate character array
        for (char c : s_array) { // count number of each char in s
            letters[c]++;
        }

        for (int i = 0; i < t.length(); ++i) {
            int c = (int) t.charAt(i);
            letters[c]--;
            if (letters[c] < 0) {
                return false;
            }
        }
        
        return true;
    }
    
    
}
