import java.util.Comparator;

public class RunnableInterface {
    public static void main(String[] args) {
    Runnable runnable = ()->{
        System.out.println("Inside Runnable Interface");
    };
    new Thread(runnable).start();
    Comparator<Integer> ca = (a, b)->{return a.compareTo(b);};
        System.out.println(ca.compare(1,2));
    }
}
