import java.util.Scanner;
import java.util.Date;


public class pessoa {

    private static String nome;
    private Date data;
    private static float idade;
    

    public static String getNome(){
        return nome;
    }

    public void setNome(String nome){
        pessoa.nome = nome;
    }

    public Date getData() {
        return this.data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public static float getIdade(){
        return idade;
    }

    public void setIdade(float idade){
        pessoa.idade = idade;
    }

    public static Scanner entrada;

//FALTA FAZER O CALCULO PARA A IDADE

    public static void main(String[] args) {
        entrada = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = entrada.nextLine();

        System.out.println("Digite sua Data de Nascimento: ");
        Date = new Date(entrada.nextLine());
    }
    public static void main1(String[] args) {
        System.out.println("Seu nome e: " + nome);
        System.out.println("Sua idade e: " + idade);

    }


}