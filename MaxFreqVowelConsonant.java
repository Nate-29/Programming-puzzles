import java.util.HashMap;
import java.util.Map;

public class MaxFreqVowelConsonant {
    public static void main(String [] args) {
        String str = "successes";
        System.out.println(count(str));
    }

    static int count(String str) {
        if(str.isEmpty()) {
            return 0;
        }

        Map<Character, Integer> vowelsMap = new HashMap<>();
        vowelsMap.put('a', 0);
        vowelsMap.put('e', 0);
        vowelsMap.put('i', 0);
        vowelsMap.put('o', 0);
        vowelsMap.put('u', 0);

        Map<Character, Integer> standardMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (vowelsMap.containsKey(ch)) {
                vowelsMap.put(ch, vowelsMap.get(ch) + 1);
            } else {
                standardMap.put(ch, standardMap.getOrDefault(ch, 0) + 1);
            }
        }

        int maxVowel = 0;
        for (int value : vowelsMap.values()) {
            maxVowel = Math.max(maxVowel, value);
        }

        int maxStandard = 0;
        for (int value : standardMap.values()) {
            maxStandard = Math.max(maxStandard, value);
        }
        return maxStandard + maxVowel;
    }
}