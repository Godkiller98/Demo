import java.util.HashSet;
import java.util.Set;

public class targetNum {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 5, 6, 1, 7};
        int target = 8;
        HashSet<Integer> set=new HashSet<>();
        int sub=0;
        for(int arrs:arr){
            sub=target-arrs;
            if(set.contains(sub)){
                System.out.println("COmpliement" + sub + "e" + arrs);
            }set.add(arrs);
        }
    }
}
