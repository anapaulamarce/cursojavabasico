// faça um programa que leia 3 números e mostre o menor deles. 

import java.util.Scanner;

public class Exer7 {
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o primeiro número: ");
        int num1= scan.nextInt();

        System.out.println("Entre com o segundo número: ");
        int num2= scan.nextInt();

        System.out.println("Entre com o terceiro número: ");
        int num3= scan.nextInt();

        if (num1 <= num2 && num1 <= num3){
            System.out.println("Numero 1 é menor: " + num1);
        } else if (num2 <= num1 && num2 <= num3){
            System.out.println("Numero 2 é menor: " + num2);
        } else if (num3 <= num1 && num3 <= num2){
            System.out.println("Numero 3 é menor: " + num3);
        }
    }
}
