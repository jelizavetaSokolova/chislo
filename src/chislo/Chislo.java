/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chislo;

import java.util.Scanner;

/**
 *
 * @author 37253
 */
public class Chislo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввидите трёхзначное число: ");
        int x = scanner.nextInt();
        int a = x % 10;
        int b = x / 10 % 10;
        int c = x / 100;
        int sum = a + b + c;
        System.out.println("Единиц: " + a);
        System.out.println("Десятков: " + b);
        System.out.println("Сотен: " + c);
        System.out.println("Сумма цифр: "+ sum);
    }
    
}
