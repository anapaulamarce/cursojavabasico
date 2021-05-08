// faça um programa que reebe o salário de um colaborador e o reajuste segundo o seguinte criterio
// baseado no salário atual:
// salários até 280,00 (incluindo): aumento de 20%
// swalários entre 280 e 700: aumento de 10%
// salários de 1500 em diante: aumento de 5% após o aumento ser realizado, informe na tela:
// o salário antes do reajuste;
// o percentual de aumento aplicado;
// o valor do aumento;
// o novo salário, após o aumento

import java.util.Scanner;

public class Exer11 {
    
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o salário: ");
        double salario = scan.nextDouble();

        int percentual = 0;
        if (salario <= 280){
            percentual = 20;
        } else if (salario > 280 && salario <= 700){
            percentual = 15; 
        } else if (salario >= 700 && salario < 1500){
            percentual = 10;
        } else if (salario >= 1500){
            percentual = 5;
        }

        double aumento = (salario / 100) + percentual; // porcentagem 
        double salarioAjustado = salario + aumento;

        System.out.println("Salário: " + salario);
        System.out.println("Percentual: " + percentual);
        System.out.println("Aumento: " + aumento);
        System.out.println("Salário ajustado: " + salarioAjustado);
    }
}
