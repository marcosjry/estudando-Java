public class OperadorTernario {
    
    public static void main(String[] args) {
        
        /* 
        Boolean careca = true;
        careca = !careca;
        System.out.println(careca);
        */

        String nome = "Marcos";
        String novoNome = new String("Marcos");

        System.out.println(novoNome.equals(nome));

        //Ao utilizar objetos é necessário mudar a dinâmica de comparação

        int valor = 20;
        boolean resultado = valor % 2 == 0 ? true : false;
        System.out.println("\n"+resultado);

    }
}
