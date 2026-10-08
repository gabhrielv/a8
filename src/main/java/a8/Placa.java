package a8;

import java.util.Observable;

public class Placa extends Observable {
    
    private String numero;
    private PlacaEstado estado;    

    public Placa(String numero) {
        this.numero = numero;
        this.estado = PlacaEstadoAntiga.getInstance();
    }
    
    public void setEstado(PlacaEstado estado) {
        this.estado = estado;
        setChanged();
        notifyObservers();
    }
    
    public boolean converter() {
        return estado.converter(this);
    }
    
    public boolean invalidar() {
        return estado.invalidar(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }
    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public PlacaEstado getEstado() {
        return estado;
    }    

    @Override
    public String toString() {
        return "Placa: " +
                "numero:'" + numero + '\'' +
                ", estado:'" + estado.getEstado() + '\'' +
                '}';
    }
}
