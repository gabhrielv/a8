package a8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadarTest {

    @Test
    void deveNotificarUmRadar() {
        Placa placa = new Placa("ABC1234");
        Radar radar = new Radar("Radar 1");
        radar.monitorar(placa);
        placa.converter();
        assertEquals("Radar 1, estado alterado na Placa: numero:'ABC1234', estado:'Mercosul'}", radar.getUltimaNotificacao());
    }

    @Test
    void deveNotificarRadares() {
        Placa placa = new Placa("ABC1234");
        Radar radar1 = new Radar("Radar 1");
        Radar radar2 = new Radar("Radar 2");
        radar1.monitorar(placa);
        radar2.monitorar(placa);
        placa.converter();
        assertEquals("Radar 1, estado alterado na Placa: numero:'ABC1234', estado:'Mercosul'}", radar1.getUltimaNotificacao());
        assertEquals("Radar 2, estado alterado na Placa: numero:'ABC1234', estado:'Mercosul'}", radar2.getUltimaNotificacao());
    }

    @Test
    void deveNotificarRadarPlacaA() {
        Placa placaA = new Placa("AAA1111");
        Placa placaB = new Placa("BBB2222");
        Radar radar1 = new Radar("Radar 1");
        Radar radar2 = new Radar("Radar 2");
        radar1.monitorar(placaA);
        radar2.monitorar(placaB);
        placaA.converter();
        assertEquals("Radar 1, estado alterado na Placa: numero:'AAA1111', estado:'Mercosul'}", radar1.getUltimaNotificacao());
        assertEquals(null, radar2.getUltimaNotificacao());
    }
}
