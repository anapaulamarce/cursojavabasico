public class OperadoresAritmeticos {

    public static void main(String[] args) {

        int resultado = 1 + 2;
        System.out.println(resultado);

        resultado = resultado - 1;
        System.out.println(resultado);

        resultado = resultado * 2;
        System.out.println(resultado);

        resultado = resultado / 2;
        System.out.print(resultado);

        resultado = resultado +  8;
        System.out.print(resultado);

        resultado = resultado % 7;
        System.out.println(resultado);

        String primeiroNome = "Esta e";
        String segundoNome = " uma String concatenada.";
        String terceiroNome = primeiroNome + segundoNome;
        System.out.println(terceiroNome);

        resultado = resultado + 1;
        System.out.println(resultado);

        resultado++; // esse ++ significa que estou adicionando 1, era 4, agora é 5
        System.out.println(resultado++); // primeiro imprime o valor, depois adiciona 1 
        System.out.println(++resultado); // aqui primeiro adiciona o valor, depois adiciona 1 
        

        System.out.println(resultado++);
        /*
        mesma coisa que 
        System.out.println(resultado);
        resultado = resultado + 1;
        */


        System.out.println(++resultado);
        /* 
        mesma coisa que 
        System.out.println(resultado);
        resultado += 1;
        System.out.println(resultado);
        */

        resultado--;
        System.out.println(resultado);

        System.out.println(resultado--); // primeiro imprime, depois retira 1
        System.out.println(--resultado); // primeiro retira 1, depois imprime 
    }
    
}

/*
Operadores Aritméricos
+   adição
-   subtração
*   multiplicação
/   divisão
%   módulo
++  incrimento (pos ou pré fix)
--  decremento (pos ou pré fix)
*/
