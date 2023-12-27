
package javaapplication3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
class Clubbed {
   
    Map<Character, Clubbed> children;
    boolean isEndOfWord;

    Clubbed() {
        this.children = new HashMap<>();
        this.isEndOfWord = false;
    }
}

public class Clubbedwords {
    static Clubbed root;

    public static List<String> findAllClubbedWords(String[] words) {
        List<String> result = new ArrayList<>();

        root = new Clubbed();

        // Insert all words into the Trie
        for (String word : words) {
            insertWord(word);
        }

        // Check if each word is a clubbed word
        for (String word : words) {
            if (isClubbedWord(word, 0, 0)) {
                result.add(word);
            }
        }

        return result;
    }

    private static void insertWord(String word) {
        Clubbed current = root;
        for (char ch : word.toCharArray()) {
            current.children.putIfAbsent(ch, new Clubbed());
            current = current.children.get(ch);
        }
        current.isEndOfWord = true;
    }

    private static boolean isClubbedWord(String word, int start, int count) {
        Clubbed current = root;

        for (int i = start; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (!current.children.containsKey(ch)) {
                return false;
            }

            current = current.children.get(ch);

            if (current.isEndOfWord) {
                if (i == word.length() - 1) {
                    return count >= 1;
                }

                if (isClubbedWord(word, i + 1, count + 1)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String[] words = {"mat", "mate", "matbellmates", "bell", "bellmatesbell", "butterribbon", "butter", "ribbon"};

        List<String> clubbedWords = findAllClubbedWords(words);

        System.out.println("Clubbed Words: " + clubbedWords);
    }
}
