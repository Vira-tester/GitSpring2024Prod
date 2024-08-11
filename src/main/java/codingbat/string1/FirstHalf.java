package codingbat.string1;

public class FirstHalf {
    public String firstHalf(String str) {
        int midpoint = str.length() / 2;
        return str.substring(0, midpoint);
    }
}
