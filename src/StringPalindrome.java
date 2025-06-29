import java.util.Arrays;
import java.util.Comparator;

public class StringPalindrome {
    public static void main(String[] args) {
        System.out.println(isPlain("aba"));
        System.out.println(isPlain("Rohit"));
        int[] a={3,1,2,4,5,5,4,3,2,6,7};
        int[] tar= Arrays.stream(a).sorted().distinct().toArray();
        System.out.println(Arrays.toString(tar));

//int evenCount =0,oddCount=0,t=0;
//int result =12345;
//while(result>0){
//    t=result%10;
//    result = result/10;
//    if(t%2==0)evenCount++;
//    else oddCount++;
//}   System.out.println("EVEN count is" + evenCount);
//        System.out.println("ODD count is" + oddCount);
//        System.out.println("total count is"+ evenCount+oddCount);
//        String tar = "aba  98 , + ";
//        String tar2 = new StringBuffer(tar).reverse().toString();
//        System.out.println(tar2.replaceAll("[,+\\s0-9]",""));
//        System.out.println(tar.replaceAll("[,+\\s0-9]",""));
//        System.out.println(tar.replaceAll("[,+\\s0-9]","").equals(tar2.replaceAll("[,+\\s0-9]","")));
//        String tar3="Rohit";
//        String tar4="tiorh";
//        if(tar3.length()==tar4.length()){
//            char[] c1 = tar3.toLowerCase().toCharArray();
//            char[] c3 = tar4.toLowerCase().toCharArray();
//            Arrays.sort(c1);
//            Arrays.sort(c3);
//            System.out.println("Working");
//            if (Arrays.equals(c1,c3)){
//                System.out.println("Done");
//            }
//        }
    }    public static boolean isPlain(String s){
        String s3=new StringBuffer(s).reverse().toString();
        return s.equals(s3);
    }

}

