// Faça um programa para a leittura de duas notas parciais de um aluno
// O programa deve calcular a média alcançada por aluno e apresentar:
// - a mensagem: "aprovado" se a média alcançada for mais ou igual a 7
// - a mensagem: "reprovado" se a média for menor do que 7
// - a mensagem: "aprovado com distinção", se a média for igual a dez.

import java.util.Scanner;

public class Exer5 {
        
        public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a primeira nota: ");
        double nota1 = scan.nextDouble();

        System.out.println("Entre com a segunda nota: ");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2; // media    


        if (media == 10){
            System.out.println("Aprovado com distinção!");
        } else if (media >= 7){
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }
    }
}