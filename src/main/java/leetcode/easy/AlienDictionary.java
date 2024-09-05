package leetcode.easy;

public class AlienDictionary {
    public boolean isAlienSorted(String[] words, String order) {
        for (int i = 0; i < words.length - 1; i++) {
            if ((words[i + 1].indexOf(words[i]) == 0 || words[i].indexOf(words[i + 1]) == 0) && words[i].length() > words[i + 1].length())
                return false;
            else {
                for (int j = 0; j < words[i].length(); j++) {
                    char firstChar = words[i].charAt(j);
                    char secondChar = words[i + 1].charAt(j);
                    if ((firstChar < secondChar || firstChar > secondChar)) {
                        if(order.indexOf(firstChar) > order.indexOf(secondChar)) return false;
                        else break; // because both are different letters and first letter order is satisfied
                    }
                }
            }
        }
        return true;
    }
}
