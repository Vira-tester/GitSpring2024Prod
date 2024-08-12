package codingbat.string2;

public class OneTwo {
    public String oneTwo(String str) {
        StringBuilder result = new StringBuilder();
        int length = str.length();

        // Iterate over the string in steps of 3 characters
        for (int i = 0; i + 2 < length; i += 3) {
            String substring = str.substring(i, i + 3);
            result.append(substring.substring(1)).append(substring.charAt(0));
        }

        return result.toString();
    }
}
