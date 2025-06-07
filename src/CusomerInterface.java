import java.util.function.Consumer;

public class CusomerInterface
{
    public static void main(String[] args) {
        Consumer<String> c1 = (s)-> System.out.println("Hello "+s);
        c1.accept("Rohit");
    }
}
