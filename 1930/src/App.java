import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {

      System.out.println(countPalindromicSubsequence("bbcbaba"));  
    }

    public static int countPalindromicSubsequence(String s) {

        List<String> letter = Arrays.asList(s.split(""));

        List<String> result = new ArrayList<>();
        for (int i = 0; i < 100; i++) {

           String res = looping(letter);
            if (res.subSequence(0, 1).equals(res.subSequence(2, 3))) {
            result.add(res);

            }

        }

        Set<String> norepeat = new LinkedHashSet<String>();

        for (String r : result) {
            norepeat.add(r);
        }
        System.out.println(norepeat);
        return norepeat.size();

    }

    private static String looping(List<String> s) {

        Collections.shuffle(s);
        StringBuilder t = new StringBuilder();
          
        for (int i = 0; i < 3; i++) {
    
            t.append(s.get(i));

        }
        System.out.print(" "+t.toString()+" ");
        return t.toString();
    }
}
