

public class Tutorial {

    public static void main(String[] args) {
        
    }
    
    /*
     * Concatenating strings has a runtime of O(xn^2)
     * StringBuilder() can help avoid this problem by creating a resiable array of all the strings
     * copying them back to a string only when necessary.
     */
    String joinWords(String[] args) {
        StringBuilder sentence = new StringBuilder();
        for String w : words) {
            sentence.append(w);
        }
        return sentence.toString();
    }

    /*
     * When you need an array-like data structure that offers dynamic resizing, you would
     * usually use an ArrayList.
     * An ArrayList is an array that resizes itself as needed while still providing O(1) access.
     * Each resizing takes O(n) time, but happens so rarely that its amortized insertion time is
     * O(1).
     * This is an essential data structure for interviews.
     * Be sure you are comofortable with dynamically resizable arrays/lists in whatever langauge you
     * will be working with.
     */
    public ArrayList<String> mergeList(ArrayList<String> words, ArrayList<String> moreWords) {
        ArrayList<String> resultSentence = new ArrayList<String>();
        for (String word : words) resultSentence.add(word);
        for (String word : moreWords) resultSentence.add(word);
        return sentence;
    }
    
}


