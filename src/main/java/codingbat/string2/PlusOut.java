package codingbat.string2;

public class PlusOut {
    public String plusOut(String str, String word) {
        StringBuilder result = new StringBuilder();
        int wordLength = word.length();
        for (int i = 0; i < str.length(); i++) {
            if (i + wordLength <= str.length() && str.startsWith(word, i)) {
                result.append(word);
                i += wordLength - 1; // Skip past the matched word
            } else {
                result.append('+');
            }
        }
        return result.toString();
    }
}
