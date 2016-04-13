package vander.decken;

import santa.claus.MyMath;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Program {
    public static double readDouble (String prompt, String error) throws IOException {
        System.out.println(prompt);
        String s=Program.stdIn.readLine();
        double t;
        try {
            t=Double.parseDouble(s);
            return t;
        }
        catch (NumberFormatException e){
            System.out.println(error);
            System.exit(1);
            return 0;
        }
    }
    static BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        double a = readDouble("Введите a", "Ошибка");
        double b = readDouble("Введите b", "Ошибка");
        double c = readDouble("Введите c", "Ошибка");

        double d= MyMath.Descr(a,b,c);
        System.out.format("%sx^2+%sx+%s\n",a,b,c);
        System.out.format("d=%s\n",d);

        if(d<0){
            System.out.println("D<0");
        }
        else if(d==0){
            double x=(-b/(2*a));
            System.out.println(x);
        }
        else {
            double x1=(-b + Math.sqrt(d))/(2 * a);
            double x2=(-b - Math.sqrt(d))/(2 * a);
            System.out.println(x1);
            System.out.println(x2);
            System.out.println("Отлично");
        }
    }
}