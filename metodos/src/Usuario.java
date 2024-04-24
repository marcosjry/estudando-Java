public class Usuario {
 
    public static void main(String[] args) {
        
        SmartTV smartTv = new SmartTV();

        System.out.println("\nTv Ligada: ? " +smartTv.ligada);
        System.out.println("\nCanal atual: ? " +smartTv.canal);
        System.out.println("\nVolume Atual:? " +smartTv.volume);

        smartTv.ligar();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.mudarCanal(10);

        System.out.println("\nTv Ligada: ? " +smartTv.ligada);
        System.out.println("\nCanal atual: ? " +smartTv.canal);
        System.out.println("\nVolume Atual:? " +smartTv.volume);
    }

}
