// Faça uum programa para o calculo de uma folha de pagamento, sabendo que os descontos são do 
// imposto de renda, que depende do salário bruto (conforme tabela abaixo) e 3% para o sindicado
// e que o FGTS corresponde a 11% do salário burno, mas não é descontado (é a empresa que deposita).
// o salário liquido corresponde ao salário bruto menos os descontos.
// o programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.
// Descontos do IR;
// Salário bruto até 900 (inclusive) - isento
// Salário bruto até 1500 (inclusive) - desconto de 5%
// Salário bruto até 2500 (inclusive) - desconto de 10%
// Sal´-ario bruto acima de 2500 - desconto de 20%, imprima na tela as informações, dispostas 
// conforme o exemplo abaixo.
// No exemplo, o valor da hora é 5 e a quantidade de horas é 220. 

import java.util.Scanner;

public class Exer12 {

    public static void main (String[] args){

    Scanner scan = new Scanner(System.in);

    System.out.println("Entre com o valor/hora: ");
    double valorHora = scan.nextDouble();

    System.out.println("Entre com as horas trabalhadas no mês: ");
    double qtdHoras = scan.nextDouble();

    double salarioBruto = valorHora * qtdHoras;

    int percentualIR = 0;
    if (salarioBruto <= 900){
        percentualIR = 0;
    } else if (salarioBruto > 900 && salarioBruto <= 1500){
        percentualIR = 5;
    } else if (salarioBruto > 1500 && salarioBruto <= 2500){
        percentualIR = 10;
    } else if (salarioBruto > 2500){
        percentualIR = 20;
    }

    double ir = (salarioBruto / 100) + percentualIR;
    double inss = (salarioBruto / 100) + 10;
    double fgts = (salarioBruto / 100) * 11;
    double totalDescontos = ir + inss;
    double salarioLiquido = salarioBruto - totalDescontos;

    System.out.println("Salario Bruto: (" + valorHora + " + " + qtdHoras + "): " + salarioBruto);
    System.out.println("(-) IR (" + percentualIR + "%):" + ir);
    System.out.println("(-) INSS (10%): " + inss);
    System.out.println("FGTS (!!%: " + totalDescontos);
    System.out.println("Salário Liquido: " + salarioLiquido);
    }
}
