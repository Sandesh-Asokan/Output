public class VigenereCipher {
    public static void main(String arg[]) {
        String plaintext = "JAVAHUNGRYBLOG";
        String keyword = "LEMON";
        // Converting plaintext to char array
        char msg[] = plaintext.toCharArray();
        int msgLen = msg.length;
        int i, j;
        // Creating new char array
        char key[] = new char[msgLen];
        char encryptedMsg[] = new char[msgLen];
        char decryptedMsg[] = new char[msgLen];

        for (i = 0, j = 0; i < msgLen; ++i, ++j) {
            if (j == keyword.length()) {
                j = 0;
            }
            key[i] = keyword.charAt(j);
        }

        for (i = 0; i < msgLen; ++i)
            encryptedMsg[i] = (char) (((msg[i] + key[i]) % 26) + 'A');

        for (i = 0; i < msgLen; ++i)
            decryptedMsg[i] = (char) ((((encryptedMsg[i] - key[i]) + 26) % 26) + 'A');

        System.out.println("Original Message: " + plaintext);
        System.out.println("Keyword: " + keyword);
        System.out.println("Key: " + String.valueOf(key));
        System.out.println("Encrypted Message: " + String.valueOf(encryptedMsg));
        System.out.println("Decrypted Message: " + String.valueOf(decryptedMsg));
    }
}
