package src;

import java.util.Map;

public class BalancedWordsCounter {
    public static int count(String str) {
        Map<String, Boolean> map = new java.util.HashMap<>();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                String sub = str.substring(i, j + 1);
                if (map.containsKey(sub)) 
                    count += map.get(sub) ? 1 : 0;
                else {
                    boolean isBalanced = isBalanced(sub);
                    map.put(sub, isBalanced);
                    count += isBalanced ? 1 : 0;
                }
            }
        }
        return count;
    }

    static boolean isBalanced(String str) {
        Map<Character, Integer> map = new java.util.HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        int val = -1;
        for (int value : map.values()) {
            if (val == -1) 
                val = value;
            else if (val != value) 
                return false;
        }
        return true;
    }
}
