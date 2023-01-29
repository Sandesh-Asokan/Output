import java.util.*;

class railFenceCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter plain text: ");
        String pt = sc.nextLine();
        System.out.print("Enter key/depth: ");
        int key = sc.nextInt();
        int c = 0, c1 = 0, k = 0;
        char[][] m = new char[key][pt.length()];
        while (k < pt.length() - 1) {
            while (c < key) {
                if (c == -1) {
                    c = 1;
                }
                m[c][k] = pt.charAt(c1);
                c++;
                k++;
                c1++;
            }
            c -= 1;
            while (c > 0) {
                c--;
                m[c][k] = pt.charAt(c1);
                k++;
                c1++;
            }
            c += 1;
        }
        String enc = "";
        for (int i = 0; i < key; i++) {
            for (int j = 0; j < pt.length(); j++) {
                enc += m[i][j];
            }
        }
        System.out.println(enc);
        sc.close();
    }
}