package Demidov;

import java.util.Scanner;

public class Geek3
{
 public static void main(String[] args)
 {
     int x;
     Scanner num = new Scanner(System.in);
     System.out.print("Введите a: ");
     int  a = num.nextInt();
     System.out.print("Введите b: ");
     int  b = num.nextInt();
     System.out.print("Введите d: ");
     int  c = num.nextInt();
     System.out.print("Введите c: ");
     int  d = num.nextInt();
     x = a * (b + (c / d));
     System.out.println("x = " + x);
 }
}
