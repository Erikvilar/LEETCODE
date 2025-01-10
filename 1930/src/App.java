
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class App {

    public static void main(String[] args) throws Exception {

        System.out.println(countPalindromicSubsequence("aaabbca"));
    }

    public static int countPalindromicSubsequence(String s) {

        List<String> letter = Arrays.asList(s.split(""));

        List<String> result = new ArrayList<>();
        int count = letter.size();
        Set<String> norepeat = new LinkedHashSet<String>();

        for (int i = 0; i < letter.size(); i++) {
            String res = looping(letter, count);

            if (!res.isEmpty()) {
                result.add(res);
            }
            count--;
        }
        for (String r : result) {
            norepeat.add(r);
        }
        System.out.println(norepeat);

        return norepeat.size();

    }

    private static String looping(List<String> s, int count) {
        StringBuilder t = new StringBuilder(3);
        for (int i = 0; i < s.size(); i++) {
            if (s.get(i).equals(s.get(count - 1)) && i != count - 1) {
                return s.get(i) +s.get((int) Math.round((Math.floor(count - 1 + i) / 2)))
                + s.get(count - 1);
            }
        }

        return t.toString();
    }

}
