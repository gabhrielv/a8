package a8;

import java.util.Observable;
import java.util.Observer;

public class Radar implements Observer {

    private String nome;
    private String ultimaNotificacao;

    public Radar(String nome) {
        this.nome = nome;
    }

    public String getUltimaNotificacao() {
        return this.ultimaNotificacao;
    }

    public void monitorar(Placa placa) {
        placa.addObserver(this);
    }

    public void update(Observable placa, Object arg1) {
        this.ultimaNotificacao = this.nome + ", estado alterado na " + placa.toString();
        // System.out.println(this.ultimaNotificacao);
    }
}
