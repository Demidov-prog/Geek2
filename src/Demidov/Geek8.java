package Demidov;

import java.util.Scanner;

public class Geek8
{
    public static void main(String[] args)
    {
        Scanner num = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = num.nextInt();
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
            {
                System.out.println("Високосный год");
            }
            else {
                System.out.println("Невисокосный год");

            }
    }
}
