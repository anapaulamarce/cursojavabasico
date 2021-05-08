// Faça um programa que verifique se uma letra digitada é vogal ou consoante
import java.util.Scanner;

public class Exer4 {

    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com uma letra: ");
        String letra = scan.next();

        /* Primeiro método de fazer
        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") ||
         letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
             System.out.println("vogal");
         } else {
             System.out.println("consoante");
         }
         */

        if (letra.length() > 1){ // se tiver mais de uma letra 
            System.out.println("Não é uma letra válida"); // não é uma letra válida 
        }else { // se tiver menos, executar o switch 
            switch(letra){
             case "a":
             case "e":
             case "i":
             case "o":
             case "u": 
             case "A":
             case "E":
             case "I":
             case "O":
             case "U": System.out.println("vogal"); break; // parar a vogal no u, colocar letra minuscula e maiuscula
             default: System.out.println("consoante"); // se nao for nenhum deles é consoante
            }
         }
    }
    
}
