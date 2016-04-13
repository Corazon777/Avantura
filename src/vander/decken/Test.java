package vander.decken;

import jdk.nashorn.internal.ir.WhileNode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws IOException {
        Test.doWhileDemo();
    }

    public static void SplitTest() throws IOException {
        System.out.println("Введите текст");
        String r = Program.stdIn.readLine();
        String[] e = r.split(" ");
        int i = 0;
        double[] dblList = new double[100];
        String[] strList = new String[100];
        int m = 0;
        int n = 0;
        while (i < e.length) {
            if(e[i].length()>0) {
                //System.out.format("[%s]='%s'",i,e[i]);
                try {
                    dblList[m] = Double.parseDouble(e[i]);
                    m = m+1;
                }catch (NumberFormatException ex){
                    strList[n] = e[i];
                    n=n+1;
                }
            }
            i=i+1;
        }
        Arrays.sort(dblList,0,m);
        Arrays.sort(strList,0,n);
        int a = 0;
        while(a<m){
            System.out.format("[%s]='%s'\n",a+1,dblList[a]);
            a=a+1;
        }
        a=0;
        while(a<n){
            System.out.format("[%s]='%s'\n",a+1,strList[a]);
            a=a+1;
        }
    }


    public static void readAndParse() throws IOException {
        System.out.println("Введите число");
        String r = Program.stdIn.readLine();
        double k = 0;
        boolean isNumber;
        try {
            k = Double.parseDouble(r);
            isNumber = true;
        } catch (NumberFormatException e) {
            isNumber = false;
        }
        if (isNumber) {
            System.out.println("Вы ввели" + k);
        } else {
            System.out.println("Введите число,а не строку");
        }
    }

    public static void loop() {
        int i = 0;
        int a = 3446;
        int b = 233;
        while (i < 10) {
            System.out.format("i=%s a=%s b=%s Нормалды\n", i, a, b);
            i = i + 1;
            a = a - 2 * i;
            b = 2 * a + 43 - 2 * i;
        }
        System.out.println("End of while");
    }

    public static void stringArray() throws IOException {
        String[] strList = new String[100];
        int i = 0;
        while (true) {
            System.out.format("Введите строку номер %s ", i + 1);
            String d = Program.stdIn.readLine();
            if (d.length() == 0) break;
            strList[i] = d;
            i = i + 1;
        }

        while (true) {
            System.out.println("Введите номер строки. Если хотите закончить,введите stop");
            String e = Program.stdIn.readLine();
            int k = 0;
            if (e.equals("stop")) break;
            try {
                k = Integer.parseInt(e);
            }
            catch (NumberFormatException d) {
                System.out.println("Ошибка");
                continue;
            }
            if (k < 1 || k > i) {
                System.out.println("Неправильное значение");
                continue;
            }
            System.out.println(strList[k - 1]);
            continue;
        }
    }

    public static void array() {
        String[] strList = new String[100];
        String[] strList2 = null;
        strList[10] = "РНК";
        System.out.println(strList[10]);
        strList2 = strList;
        System.out.println(strList2[10]);
        strList2[20] = "CNA";
        System.out.println(strList[20]);
    }

    public static void concat() throws IOException {
        String s = "";
        String w = " ";
        while (true) {
            System.out.println("Введите строку");
            String r = Program.stdIn.readLine();
            s = s + w + r;
            if (r.length() == 0) break;
        }
        System.out.println(s);
    }

    public static void forDemo() {
        for(int a=1; a<11; a++){
            System.out.println(a+". HelloWorld!");
        }
    }

    public static void whileDemo() {
        int a = 1;
        while (a<11){
            System.out.println(a+". HelloWorld!");
            a++;
        }
    }

    public static void doWhileDemo () {
        int a=20;
        do{
            System.out.println(a+". HelloWorld!");
            a++;
        }
        while(a<1);
    }
}