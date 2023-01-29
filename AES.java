import javax.crypto.*;

public class AES {
    public static void main(String args[]) throws Exception {
        // Main
        KeyGenerator keygenerator = KeyGenerator.getInstance("AES");
        SecretKey myAESKey = keygenerator.generateKey();
        Cipher AESCipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        // Declaration
        byte[] text = "Secret Information ".getBytes();
        System.out.println("Message : " + new String(text));
        // Initialization
        AESCipher.init(Cipher.ENCRYPT_MODE, myAESKey);
        byte[] textEncrypted = AESCipher.doFinal(text);
        System.out.println("Encrypted Message: " + textEncrypted);
        // Encryption
        AESCipher.init(Cipher.DECRYPT_MODE, myAESKey);
        byte[] textDecrypted = AESCipher.doFinal(textEncrypted);
        System.out.println("Decrypted Message: " + new String(textDecrypted));
        // Decryption
    }
}
