public class SistemaPlanoTelefonico {
    /** Este programa descreve o que tem no plano telefônico
    //O sistema terá 03 planos: BASIC, MIDIA , TURBO;
    //BASIC: 100 minutos de ligação;
    //MÍDIA: 100 minutos de ligação + WhatsApp e Instagram grátis;
    //TURBO: 100 minutos de ligação + WhatsApp e Instagram grátis + 5 GB Youtube.
   */
   
   /* 
    // Modo condicional convencional
        public static void main(String[] args) {
        String plano = "M"; //M / T
		
		if(plano == "B") {
			System.out.println("100 minutos de ligação");
		}else if(plano == "M") {
			System.out.println("100 minutos de ligação");
			System.out.println("WhatsApp e Instagram grátis");	
		}else if(plano == "T") {
			System.out.println("100 minutos de ligação");
			System.out.println("WhatsApp e Instagram grátis");	
			System.out.println("5Gb Youtube");	
		}
    }*/

    // Modo condicional switch/case

	public static void main(String[] args) {
		String plano = "T"; // M / T

		switch (plano) {
			case "T": {
				System.out.println("5Gb Youtube");
			}
			case "M": {
				System.out.println("WhatsApp e Instagram grátis");
			}
			case "B": {
				System.out.println("100 minutos de ligação");
			}
		}
	}

}
