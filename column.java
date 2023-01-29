
public class column {
    public static void main(String args[]) {
        char key[] = "BACD".toCharArray();
        char plainText[] = "ATTACK".toCharArray();
        char cipherText[] = new char[6];

        int len = plainText.length;
        int keyLen = key.length;
        int i, j, k, col, row;

        // Creating the matrix for the plain text
        col = (int) keyLen;
        row = (int) len / keyLen;
        if (len % keyLen != 0) {
            row++;
        }
        char matrix[][] = new char[row][col];

        // Filling the matrix with plain text
        k = 0;
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                if (k < len) {
                    matrix[i][j] = plainText[k++];
                } else {
                    matrix[i][j] = '_';
                }
            }
        }
        // Creating the cipher text
        k = 0;
        for (i = 0; i < keyLen; i++) {
            for (j = 0; j < keyLen; j++) {
                if (key[j] == (i + 'A')) {
                    for (int r = 0; r < row; r++)
                        if (matrix[r][j] != '_')
                            cipherText[k++] = matrix[r][j];
                }
            }
        }

        System.out.println("Plain Text : " + String.valueOf(plainText));
        System.out.println("Key : " + String.valueOf(key));
        System.out.println("Cipher Text: " + String.valueOf(cipherText));
    }
}