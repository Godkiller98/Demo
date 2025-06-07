import java.util.Arrays;

public class StringPalindrome {
    public static void main(String[] args) {
        System.out.println(isPlain("aba"));
        System.out.println(isPlain("Rohit"));
//        int[] a={3,1,2,4,5,5,4,3,2,6,7};
//        int[] tar= Arrays.stream(a).sorted().distinct().toArray();
//        System.out.println(Arrays.toString(tar));


    }
    public static boolean isPlain(String s){
        String sb1 = new StringBuffer(s).reverse().toString();
    return s.equals(sb1);
    }
}

