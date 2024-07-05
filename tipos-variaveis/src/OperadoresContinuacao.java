public class OperadoresContinuacao {

    public static void main(String[] args) {
        
        int numero = 5;
        //x repeticao

        //numero = numero + 1;

        numero++;// numero = numero + 1;

        System.out.println(numero);

        //ATENÇÃO aos detalhes do operador incrementador como argumento em System.out.printl()(???????)
        int numero1 = 0;

        System.out.println(numero1++); //Não "funciona", mas incrementa 1
        System.out.println(numero1);

        numero1 = 0; //Reinicia após a última incrementação
        System.out.println( numero1 ++ ); //Imprime o valor e depois incrementa, armazenando o valor
        System.out.println(numero1);//Imprime o valor armazenado após o comando println

        numero1 = 0; //Reinicia após a última incrementação
        System.out.println( ++ numero1); //Incrementa e depois imprime o valor

        boolean variavel = true;

        System.out.println(!variavel);// Isso não altera o valor da variavel
        System.out.println(variavel);// manutenção do valor da variável 

        variavel = !variavel;//Altera o valor da variável, sendo '!' o operador de negação
        System.out.println(variavel);
    }
    
}
