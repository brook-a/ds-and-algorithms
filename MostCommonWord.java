/*
  easy
  given a paragraph and a list of banned words, return the most frequent word that is not in the list of
  banned words.  tt is guaranteed there is at least one word that isn't banned, and that the answer is unique.
  words in the list of banned words are given in lowercase, and free of punctuation. words in the paragraph
  are not case sensitive. the answer is in lowercase.
 */


import java.util.*;

public class MostCommonWord {
    public static void main(String[] args) {
        String[] banned = {"hit"};
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        System.out.printf("the most common word is : %s", mostCommonWord(paragraph, banned));
    }

    static String mostCommonWord(String para, String[] banned) {

        String[] words = para.toLowerCase().split("\\W+");
        Set<String> banned_set = new HashSet<>();
        Map<String, Integer> frequency = new HashMap<>();

        for (String s : banned) {
            banned_set.add(s);
        }

        for (String w : words) {
            if (frequency.containsKey(w)) {
                frequency.put(w, frequency.get(w) + 1);
            } else {
                frequency.put(w, 1);
            }
        }

        String common = "";
        int max = 0;

        for (String s : frequency.keySet()) {
            if (banned_set.contains(s)) {
                continue;
            }
            if (frequency.get(s) > max) {
                max = frequency.get(s);
                common = s;
            }
        }

        return common;
    }
}
