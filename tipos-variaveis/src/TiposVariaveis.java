public class TiposVariaveis {
    public static void main(String[] args) {
        
        // TiposEVariaveis.java

        /*short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; // (short) força uma mudança de tipo*/

        int numero = 5;
        
        numero = 10;

		System.out.print(numero);

        //final double VALOR_DE_PI = 3.14;
		
        double VALOR_DE_PI = 3.14;
		//VALOR_DE_PI=3.15; //Esta linha vai apresentar erro de compilação! O IDE solicita que seja subtraída o termo 'final' na declaração da variável
        //declarar uma variável como uma constante, utilizamos a palavra 'final', mas por convenção, esta variável deverá ser escrita toda em CAIXA ALTA.
    }
}
