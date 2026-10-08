package a8;

public class PlacaEstadoMercosul extends PlacaEstado {

    private PlacaEstadoMercosul() {};
    private static PlacaEstadoMercosul instance = new PlacaEstadoMercosul();
    public static PlacaEstadoMercosul getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Mercosul";
    }

    public String getPais() {
        return "Brasil";
    }

    public boolean invalidar(Placa placa) {
        placa.setEstado(PlacaEstadoInvalida.getInstance());
        return true;
    }

}
