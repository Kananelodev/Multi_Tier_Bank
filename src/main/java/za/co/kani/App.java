package za.co.kani;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args )
    {
        Bank first = new Bank("Kani", 100);
        first.deposit(50);
        System.out.println(first.getBalance());
    }
}
