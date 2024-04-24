public class SmartTV {

    String marca = "";
    boolean ligada = false;
    int canal = 1;
    int volume = 0;
    
    public void ligar() {
        ligada=true;
    }
    public void desligar() {
        ligada=false;
    }

    public void aumentarVolume() {
        volume++;
    }
    public void diminuirVolume() {
        volume--;
    }
    public void mudarCanal(int valor) {
        canal = valor;
    }
    public void aumentaCanal() {
        canal++;
    }
    public void diminuiCanal() {
        canal--;
    }

}
