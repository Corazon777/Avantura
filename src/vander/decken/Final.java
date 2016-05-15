package vander.decken;


import java.io.IOException;
import java.util.Arrays;

public class Final {
    public static void main(String[] args) throws IOException {
        Final.great();
    }

    public static void great() throws IOException {
        String[] strListx = new String[10];
        int i = 0;
        while (true) {
            System.out.print("Введите строку " + (i + 1) + ": ");
            String y = Program.stdIn.readLine();
            if (y.length() == 0) break;
            y = Final.check(y);
            strListx[i] = y;
            i = i + 1;
        }
        Arrays.sort(strListx, 0, i);
        System.out.print("Введите разделитель ");
        String x = Program.stdIn.readLine();
        int b = 1;
        String res = strListx[0];
        while (b < i) {
            res = res + x + strListx[b];
            b = b + 1;
        }
        System.out.format(res);
    }

        public static String check(String y){
            int startIndex = 0;

            while (true) {
                char a = y.charAt(startIndex);
                if (a != ' ' && a != '_') break;
                if (startIndex>y.length()) return "";
                startIndex++;
            }
            int endIndex = y.length()-1;
            while (endIndex>0) {
                char b = y.charAt(endIndex);
                if (b != ' ' && b != '_') break;
                endIndex--;
            }
            return y.substring(startIndex, endIndex+1);
        }
}