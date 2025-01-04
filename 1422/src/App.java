
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.List;

public class App {

    public static void main(String[] args) throws Exception {

        String beforeReplace = "00111";

        String replaced = beforeReplace.replace("", ",");
        String replacedf = replaced.replaceFirst(",", "");
        String out = replacedf.substring(0, replacedf.length() - 1);

        String[] build = out.split(",");

        List<String> listArr = Arrays.asList(build);
        List<String> correct_order = new ArrayList<String>();
        try {
            if (listArr.size() >= 2 && listArr.size() <= 500) {
                for (String num : listArr) {
                    if (num.equals("0") || num.equals("1")) {

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
       
        int total =0;
        for (int i=0; i < correct_order.size() -1 ;i++) {

            int points = 0;
            for (int j = 0; j <= i; j++) {
                if (correct_order.get(j).equals("0")) {
                    points++;
                  
                }

            }
        
            for (int j = i + 1; j < correct_order.size(); j++) {
                if (correct_order.get(i).equals("1")) {
                    points++;
              
                }

            }
          
          total = Math.max(total, points);


        }
        System.out.println(total);
    }

}