public class ResultadoEscolar {
    
    
    /*public static void main(String[] args) {
        
        int nota = 6;

        if(nota >= 7)
            System.out.println("Aprovado");

        else if(nota >=5 && nota < 7)
            System.out.println("Reccuperação");
        
        else
            System.out.println("Reprovado");

    }*/

    public static void main(String[] args) {
       
       //Cenário 1 - Condição ternária
        
       int nota = 7;

        String resultado = nota >=7 ? "Aprovado" : "Reprovado";

        System.out.println(resultado);

        //Cenário 2 - Condição ternária aninhada

        int notaFinal = 6;

        String resultadoFinal = notaFinal >= 7 ? "Aprovado" : notaFinal >=5 && notaFinal < 7 ? "Recuperação" :"Reprovado";

        System.out.println(resultadoFinal);
    }
}
