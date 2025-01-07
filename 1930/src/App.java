
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;


public class App {
    public static void main(String[] args) throws Exception {

        System.out.println(countPalindromicSubsequence("adc"));
    }

    public static int countPalindromicSubsequence(String s) {

        List<String> letter = Arrays.asList(s.split(""));

        List<String> result = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            String res = looping(letter);

            result.add(res);
        }

        Set<String> norepeat = new LinkedHashSet<String>();

        for (String r : result) {
            norepeat.add(r);
        }
        System.out.println(norepeat);
        return norepeat.size();

    }




    private static String looping(List<String> s) {

        StringBuilder t = new StringBuilder(3);
        int count = s.size();
        ListIterator l = s.listIterator();
        for (int i = 0; i < s.size(); i++) {
            System.out.print(s.get(i) + "==  ");
            if (s.get(i).equals(s.get(count - 1)) )  {
                    t.append(s.get(i) + s.get(l.next() != s.get(i)? l.nextIndex() :i) + s.get(count - 1)+ "-");
                    System.out.println("igualdade encontrada " + s.get(i) + "==" + s.get(count - 1));
                    count--;
            }
        }
            return t.toString();
    }}




