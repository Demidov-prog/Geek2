package Demidov;

import java.util.Scanner;

public class Geek4
{
    public static void main(String[] args)
    {
        Scanner num = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = num.nextInt();
        System.out.print("Введите второе число: ");
        int b = num.nextInt();
        if ((10 <= (a + b)) && ((a + b) <= 20))
        {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
