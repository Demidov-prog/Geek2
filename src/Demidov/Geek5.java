package Demidov;

import java.util.Scanner;

public class Geek5
{
    public static void main(String[] args)
    {
        Scanner num = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = num.nextInt();
        if (a >= 0){
            System.out.println("Число положительное");
        }
        else
        {
            System.out.println("Число отрицательное");
        }
    }
}
