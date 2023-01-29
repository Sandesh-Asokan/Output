import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Scanner;

public class shanew {
	public static String encrypt(String text) throws Exception {
		MessageDigest crypt = MessageDigest.getInstance("SHA-1");
		return new BigInteger(1, crypt.digest(text.getBytes())).toString(16);
	}
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		String ip = sc.nextLine();
		System.out.println(encrypt(ip));
		sc.close();
	}
}