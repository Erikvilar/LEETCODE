
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira 0 ou 1");
        System.out.println(maxScore(scan.nextLine()));
        scan.close();
    }

    public static String maxScore(String s) {
        String[] str = s.split("[0]");
        if(isValid(str)){
            
                return "valid";
        }
        return "invalid";      
    }

    public static Boolean isValid(String[] s) {
        for (String valid : s) {
            if (valid.contains("1") || valid.contains("0")){
                return true;
            }
            return false;
        }
        return true;
    }
}