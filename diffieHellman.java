import java.util.*;

public class diffieHellman {
    public static int Power(int a, int b, int c) {
        return (int) (((long) Math.pow(a, b)) % c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter q's value(prime no): ");
        int q = sc.nextInt();
        System.out.print("Enter p's value(primitive root): ");
        int p = sc.nextInt();
        System.out.print("Enter private key of a: ");
        int xa = sc.nextInt();
        System.out.print("Enter private key of b: ");
        int xb = sc.nextInt();
        int ya = Power(p, xa, q); // ya=(p^xa)modq
        int yb = Power(p, xb, q); // yb=(p^xb)modq
        int k1 = Power(yb, xa, q);
        int k2 = Power(ya, xb, q);
        if (k1 == k2) {
            System.out.println("The secret key of a and b matches!");
            System.out.println("The secret key of a k1=" + k1);
            System.out.println("The secret key of b k2=" + k2);
        }
        sc.close();
    }
}
