
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.stream.Collectors;



public class App {

    public static void main(String[] args) throws Exception {

      
        String [] s ={"1,1,1,1"};
        String teste = "11111";
        String replaced = teste.replace("", ",");
        String replacedf= replaced.replaceFirst(",", "");
     
        System.out.println(teste.replace("", ","));
        int toNum = Integer.parseInt(replacedf.substring(0, replacedf.length()-1));
        
        System.out.println();
   

    List<String> listArr = Arrays.asList(s);
        List<String> correct_order = new ArrayList<String>();
        try {
            if (listArr.size() >= 2 && listArr.size() <= 500) {
                for (Integer num : listArr.stream().map(Integer::parseInt).collect(Collectors.toList())) {
                    if (num <= 1 && num >= 0) {
                        correct_order.add(num.toString());
                    } else {
                        System.out.println("entrada invalida");
                    }
                }
            } else {
                System.exit(0);
            }
        } catch (ConcurrentModificationException c) {
            throw new ConcurrentModificationException(c);
        }

        List<String> left = correct_order.subList(0, 1);

        List<String> right = correct_order.subList(1, correct_order.size());
        int pointsFrom0 = 0;
        int pointsFrom1 = 0;
        for (String x : left) {
            if (x.contains("0")) {
                pointsFrom0++;
            }

        }
        for (String x : right) {
            if (x.contains("1")) {
                pointsFrom1++;
            }
        }

        System.out.println(pointsFrom0 + pointsFrom1);
        System.out.println("left assign " + left);
        System.out.println("right assign " + right);

    }

}