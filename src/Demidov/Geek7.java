package Demidov;

import java.util.Scanner;

public class Geek7
{
    public static void main(String[] args)
    {
        Scanner num = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = num.nextLine();
        System.out.print("Привет, " + name + "!");
    }
}
