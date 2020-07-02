package Demidov;

import java.util.Scanner;

public class Geek6
{
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = num.nextInt();
        boolean x;
        if (a >= 0)
        {
            x = false;
        }
        else
        {
            x = true;
        }
        System.out.println("" + x);
    }
}
