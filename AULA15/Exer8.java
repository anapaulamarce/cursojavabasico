// Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar,
// sabendo que a decisão é sempre pelo mais barato

import java.util.Scanner;

public class Exer8 {
    
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com primeiro preço: ");
        double preco1 = scan.nextDouble();

        System.out.println("Entre coom segundo preço: ");
        double preco2 = scan.nextDouble();

        System.out.println("Entre com terceiro preço: ");
        double preco3 = scan.nextDouble();

        if (preco1 <= preco2 && preco1 <= preco3){
            System.out.println("Compre o produto 1");
        } else if (preco2 <= preco1 && preco2 <= preco3){
            System.out.println("Compre o produto 2");
        } else if (preco3 <= preco1 && preco3 <= preco2){
            System.out.println("Compre o produto 3");
        }
    }
}
