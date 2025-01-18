public class App {
    public static void main(String[] args) throws Exception {

        System.out.println(reverseWords("a good   example"));
    }


    public static String reverseWords(String s) {
        StringBuilder sBuilder = new StringBuilder();

        String [] strim = s.trim().split("\\s+");
        for(int i = strim.length -1; i >= 0; i--){
          
          
                sBuilder.append(strim[i].trim()).append(" ");
            }
   
        
        return sBuilder.toString().trim();
    }
}
