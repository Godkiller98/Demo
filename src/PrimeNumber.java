public class PrimeNumber {
    public static void main(String[] args) {
        int t=4;
boolean isPrime=true;
for(int i=2;i<t;i++){
    if(t%i==0){
        isPrime=false;
        break;
    }else{
        isPrime=true;
    }
}   if(isPrime==true){
    System.out.println("It's a prime number");
        }else{
            System.out.println("It's not prime number");
        }
    }
}
