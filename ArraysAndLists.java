


public class ArraysAndLists {
    public static void main(String[] args) {
        
    }

    /*
     * IS UNIQUE
     * Implement an algorithm to determine if a string has all unique characters. What if you cannot
     * use additional data structures?
     */
    public Boolean isUnique(String str) {
        // if no duplicates, return true
        // else, return false

        // store each iterated character into a hash table
        // if map.HasKey(str.get(ch)), return true
        // else, continue
        
        // key = ch
        // value = count(ch)
        HashMap<String> map = new HashMap<String>();
        
        for (int i = 0; i < str.length(); ++i) {
            char c = str.charAt(i);
        }

        return true;
    }
}
