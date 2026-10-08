package a8;

public class PlacaEstadoInvalida extends PlacaEstado {

    private PlacaEstadoInvalida() {};
    private static PlacaEstadoInvalida instance = new PlacaEstadoInvalida();
    public static PlacaEstadoInvalida getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Inválida";
    }


}
