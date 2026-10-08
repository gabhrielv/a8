package a8;

public class PlacaEstadoAntiga extends PlacaEstado {

    private PlacaEstadoAntiga() {};
    private static PlacaEstadoAntiga instance = new PlacaEstadoAntiga();
    public static PlacaEstadoAntiga getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Antiga";
    }
    
    public boolean converter(Placa placa) {
        placa.setEstado(PlacaEstadoMercosul.getInstance());
        return true;
    }
    
    public boolean invalidar(Placa placa) {
        placa.setEstado(PlacaEstadoInvalida.getInstance());
        return true;
    }

}
