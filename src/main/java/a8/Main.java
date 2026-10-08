package a8;

public class Main {
    public static void main(String[] args) {
        // Criar observadores (Radares)
        Radar radar1 = new Radar("1");
        Radar radar2 = new Radar("2");
        
        // Criar Observable (Placa) - estado inicial: Antiga
        Placa placa = new Placa("ABC1234");
        
        // Registrar observadores
        radar1.monitorar(placa);
        radar2.monitorar(placa);
        
        System.out.println("Placa " + placa.getNomeEstado());
        System.out.println(placa);
        
        System.out.println("\nConvertendo para Placa Mercosul");
        System.out.println("Convertendo: " + placa.converter());
        System.out.println(radar1.getUltimaNotificacao());
        System.out.println(radar2.getUltimaNotificacao());
        
        System.out.println("\nInvalidando a Placa");
        System.out.println("Invalidando: " + placa.invalidar());
        System.out.println(radar1.getUltimaNotificacao());
        System.out.println(radar2.getUltimaNotificacao());

        System.out.println("\nTentando converter Placa Inválida ");
        System.out.println("Convertendo: " + placa.converter());
        System.out.println("Estado atual: " + placa.getNomeEstado());
    }
}
