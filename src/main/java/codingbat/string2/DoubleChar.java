package codingbat.string2;

public class DoubleChar {
    public String doubleChar(String str) {
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            result.append(c).append(c);
        }

        return result.toString();
    }
}
