public class OperadoresCont1 {

    public static void main(String[] args) {
        
        //Operadores Ternários

        int a, b;

        a = 6;
        b = 6;

        /* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        String resultado = "";
        if(a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";*/
        
        //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        
        String resultado = (a==b) ? "verdadeiro" : "false";

        System.out.println(resultado);

        //operadores relacionais

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("Numero1 é igual ao Numero2?:" + simNao);

        simNao = numero1 != numero2;

        System.out.println("Numero1 é diferente do Numero2?:" + simNao);

        simNao = numero1 > numero2;

        System.out.println("Numero1 é maior que o Numero2?:" + simNao);

        if (numero1 < numero2) {

            System.out.println("a nossa condição é verdadeira");
            
        }

        if (numero1 == numero2) {

            System.out.println("a nossa condição é verdadeira");
            
        }

        String nomeUm = "Eliesel";
        String nomeDois = new String("Eliesel");

        System.out.println(nomeUm.equals(nomeDois)); //estrutura melhor para comparar objetos e strings

        //Operadores Lógicos && e ||
    }
    
}
