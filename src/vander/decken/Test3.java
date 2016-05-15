package vander.decken;

import java.io.IOException;

public class Test3 {
    public static void main(String[] args)throws IOException {
        Test3.start();
    }

    public static void start()throws IOException {
        System.out.print("Введите строку: ");
        String y = Program.stdIn.readLine();
        y = Test3.check(y);
        System.out.println(y);
    }
    public static String check(String y){
        int strIndex = 0;
        int intIndex = 0;
        char[] intList = new char[y.length()];
        while (true) {
            char a = y.charAt(strIndex);
            if (a != 32 && a != 95) break;
            intList[intIndex]=a;
            strIndex++;
            intIndex++;
        }
        int d=strIndex;
        int strIndex2 = y.length()-1;
        int intIndex2 = 0;
        char[] intList2 = new char[y.length()];
        while (true) {
            char b = y.charAt(strIndex2);
            if (b != 32 && b != 95) break;
            intList2[intIndex2]=b;
            strIndex2--;
            intIndex2++;
        }
        int e=strIndex2+1;
        String res="";

        for(; d<e; res+=y.charAt(d++));
        return res;
    }
}