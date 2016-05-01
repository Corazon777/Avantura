package vander.decken;

import java.io.IOException;
import java.util.Arrays;
import java.lang.ArrayIndexOutOfBoundsException;

public class Test2 {
    public static void main(String[] args)throws IOException {
        Test2.exp();
    }

    public static void sortAndConcat ()throws IOException{
        String[] strList = new String[10];
        int a=1;
        int i=0;
        while (true) {
            System.out.print("Введите строку "+a+": ");
            String r = Program.stdIn.readLine();
            if (r.length() == 0) break;
            strList[i] = r;
            a=a+1;
            i=i+1;
        }

        Arrays.sort(strList,0,i);
        System.out.print("Введите разделитель ");
        String x = Program.stdIn.readLine();
        int b=1;
        String res = strList[0];
        while (b < i){
            res=res+x+strList[b];
            b=b+1;
        }
        System.out.format(res);
    }

    public static void charDemo()throws IOException{
        System.out.print("Введите строку: ");
        String x = Program.stdIn.readLine();
        int b = x.length();
        int d=0;
        while(d<b){
            char c=x.charAt(d);
            System.out.format("[%s]='%s' %s '%s'\n",d,c, (int)c, (char)(c+1));
            d=d+1;
        }
    }
    public static void concatChar()throws IOException{
        System.out.print("Введите текст: ");
        String x = Program.stdIn.readLine();
        System.out.print("Введите начальный индекс: ");
        String q = Program.stdIn.readLine();

        int a = 0;
        try {
            a = Integer.parseInt(q);
        } catch (NumberFormatException e) {
            System.out.print("error");
        }

        System.out.print("Введите конечный индекс: ");
        String w = Program.stdIn.readLine();
        int b = 0;
        try {
            b = Integer.parseInt(w);
        } catch (NumberFormatException e) {
            System.out.print("error");
        }
        String res="";

        for(; a<b; res+=x.charAt(a++));
        System.out.println(res);
    }



    public static void substringDemo()throws IOException{
        System.out.print("Введите текст: ");
        String x = Program.stdIn.readLine();
        System.out.print("Введите начальный индекс: ");
        String q = Program.stdIn.readLine();

        int a = 0;
        try {
            a = Integer.parseInt(q);
        } catch (NumberFormatException e) {
            System.out.print("error");
        }

        System.out.print("Введите конечный индекс: ");
        String w = Program.stdIn.readLine();
        int b = 0;
        try {
            b = Integer.parseInt(w);
        } catch (NumberFormatException e) {
            System.out.print("error");
        }
        String g=x.substring(a,b);
        System.out.println(g);
    }

    public static void exp()throws IOException, ArrayIndexOutOfBoundsException{


        String[] strList = new String[10];
        int i=0;
        while (true) {
            System.out.print("Введите строку "+(i+1)+": ");
            String y = Program.stdIn.readLine();
            if (y.length() == 0) break;
            y = Test2.check(y);
            strList[i] = y;
            i=i+1;
        }

        Arrays.sort(strList,0,i);
        System.out.print("Введите разделитель ");
        String x = Program.stdIn.readLine();
        int b=1;
        String res = strList[0];
        while (b < i){
            res=res+x+strList[b];
            b=b+1;
        }
        System.out.format(res);
    }

    public static String check(String y) {
        int strIndex = 0;
        int strLen = y.length();
        int intIndex = 0;
        char[] intList = new char[y.length()];
        while (strIndex < strLen) {
            char a = y.charAt(strIndex);
            if (a != 32) {
                intList[intIndex] =  a;
                intIndex++;
            }
            strIndex++;

        }
        String d ="";
        int f=0;
        while (f < intIndex) {
            d= d + intList[f];
            f++;
        }
        return d;
    }
}



// a=a / <expr>   -->  a /= <expr>
// a=a * <expr>   -->  a *= <expr>