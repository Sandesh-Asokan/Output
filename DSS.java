import java.security.*;
import java.util.*;

public class DSS {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text");
        String msg = sc.nextLine();

        KeyPairGenerator keypairgen = KeyPairGenerator.getInstance("DSA");
        keypairgen.initialize(2048);
        KeyPair keypair = keypairgen.generateKeyPair();
        PrivateKey pkey = keypair.getPrivate();
        Signature sign = Signature.getInstance("SHA256withDSA");
        sign.initSign(pkey);
        byte[] b = msg.getBytes();
        sign.update(b);
        byte[] signature = sign.sign();
        System.out.println(new String(signature, "UTF8"));
        sc.close();
    }
}
