
public class Main {

    public static void main(String[] args) {
        
        Calculator calc1 = new Calculator();

        System.out.println(calc1.add(10, 25));
        System.out.println(calc1.add(10, 25, 50));

        System.out.println(calc1.subtract(25, 10));
        System.out.println(calc1.subtract(50, 10d));
    }
}