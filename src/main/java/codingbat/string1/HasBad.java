package codingbat.string1;

public class HasBad {
    public boolean hasBad(String str) {
        return str != null && (str.startsWith("bad") || (str.length() >= 4 && "bad".equals(str.substring(1, 4))));
    }

}
