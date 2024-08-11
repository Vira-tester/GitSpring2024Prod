package codingbat.string2;

public class XyBalance {
    public boolean xyBalance(String str) {
        boolean foundX = false;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') {
                foundX = true;
            } else if (str.charAt(i) == 'y') {
                if (foundX) {
                    foundX = false;
                }
            }
        }

        return !foundX;
    }
}
