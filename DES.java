import javax.crypto.*;

public class DES {
    public static void main(String args[]) throws Exception {
        // Main
        KeyGenerator keygenerator = KeyGenerator.getInstance("DES");
        SecretKey myDesKey = keygenerator.generateKey();
        Cipher desCipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
        // Declaration
        byte[] text = "Secret Information ".getBytes();
        System.out.println("Message : " + new String(text));
        // Initialization
        desCipher.init(Cipher.ENCRYPT_MODE, myDesKey);
        byte[] textEncrypted = desCipher.doFinal(text);
        System.out.println("Encrypted Message: " + textEncrypted);
        // Encryption
        desCipher.init(Cipher.DECRYPT_MODE, myDesKey);
        byte[] textDecrypted = desCipher.doFinal(textEncrypted);
        System.out.println("Decrypted Message: " + new String(textDecrypted));
        // Decryption
    }
}
