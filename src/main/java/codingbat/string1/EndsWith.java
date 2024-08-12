package codingbat.string1;

public class EndsWith {
    public boolean endsLy(String str) {
        if (str == null) {
            return false;
        }
        return str.endsWith("ly");
    }
}
