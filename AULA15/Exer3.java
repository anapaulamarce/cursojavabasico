// Faça um programa que verifique se uma letra digitado é "F" ou "M"
// Conforme a letra escrever, F - Feminino, M - Masculino, Sexo inválido

import java.util.Scanner;

public class Exer3 {
    
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com uma letra (F ou M): ");
        String input = scan.next(); 

        /*
        if (input == "f" || input == "m"){ // string é um objeto e objeto não usa || para comparar
            System.out.println("F - Feminino");
        } else if (input == "m"){
            System.out.println("M - Masculino");
        } else {
            System.out.println("Sexo inválido"); // método errado, sempre vai dar sexo inválido 
        }
        */

        if (input.equalsIgnoreCase("f")){ // equalsignore não precisa saber se é letra maiuscula ou minuscula, aceita os 2
            System.out.println("F - Feminino");
        } else if (input.equalsIgnoreCase("m")){
            System.out.println("M - Masculino");
        } else {
            System.out.println("Sexo inválido"); // metodo correto 
        }  
    }
}
