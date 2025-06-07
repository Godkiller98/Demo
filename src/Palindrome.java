public class Palindrome {
    public static void main(String[] args) {
        int t=1221;
int original=t;
int total =0;
while(t>0){
    int r=t%10;
    total=total*10+r;
    t=t/10;
}
System.out.println(total==original);
    }
}
