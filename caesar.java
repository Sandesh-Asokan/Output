public class caesar {
    public static String encrypt(String txt, int s) {
        String result = "";
        char ch;
        char text[] = txt.toCharArray();
        for (int i = 0; i < text.length; i++) {
            if (Character.isUpperCase(text[i])) {
                ch = (char) ((text[i] + s - 'A') % 26 + 'A');
            } else {
                ch = (char) ((text[i] + s - 'a') % 26 + 'a');
            }
            result += ch;
        }
        return result;
    }

    public static void main(String[] args) {
        String text = "ATTACKATONCE";
        int s = 4;
        System.out.println("Text  : " + text);
        System.out.println("Shift : " + s);
        System.out.println("Cipher: " + encrypt(text, s));
    }
}