import java.security.PublicKey;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("Aumentando Canal: " + canal);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("Diminuindo Canal: " + canal);
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando Volume: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo Volume: " + volume);
    }

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }
}
