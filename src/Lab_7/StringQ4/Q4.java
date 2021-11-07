
package Lab_7.StringQ4;

import java.util.Scanner;

class Q4 {

    static int size = 26;

    static boolean isLetter(char ch) {
        if (!Character.isLetter(ch))
            return false;

        return true;
    }

    static boolean allLetter(String str, int len) {
        str = str.toLowerCase();

        boolean[] present = new boolean[size];

        for (int i = 0; i < len; i++) {

            if (isLetter(str.charAt(i))) {

                int letter = str.charAt(i) - 'a';
                present[letter] = true;
            }
        }

        for (int i = 0; i < size; i++) {

            if (!present[i])
                return false;
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = in.nextLine();
        int len = str.length();
        if (allLetter(str, len))
            System.out.println("Yes");
        else
            System.out.println("No");
        in.close();
    }
}