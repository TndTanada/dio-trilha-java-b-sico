public class App {
    public static void main(String[] args){
        
            SmartTv smartTv = new SmartTv();
    
            smartTv.aumentarCanal();
            smartTv.mudarCanal(13);
            smartTv.diminuirCanal();
    
            smartTv.diminuirVolume();
            smartTv.diminuirVolume();
            smartTv.diminuirVolume();
            smartTv.aumentarVolume();
    
            System.out.println("Volume Atual? :" + smartTv.volume);
    
            System.out.println("Tv ligada? :" + smartTv.ligada);
            System.out.println("Canal Atual? :" + smartTv.canal);
            System.out.println("Volume Atual? :" + smartTv.volume);
    
            smartTv.ligar();
            System.out.println("Novo Status -->> Tv ligada? :" + smartTv.ligada);
       
            smartTv.desligar();
            System.out.println("Novo Status -->> Tv ligada? :" + smartTv.ligada);
    }
}
