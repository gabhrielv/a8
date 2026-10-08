package a8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlacaTest {

    Placa placa;

    @BeforeEach
    public void setUp() {
        placa = new Placa("ABC1234");
    }

    // Placa antiga

    @Test
    public void deveConverterPlacaAntiga() {
        placa.setEstado(PlacaEstadoAntiga.getInstance());
        assertTrue(placa.converter());
        assertEquals(PlacaEstadoMercosul.getInstance(), placa.getEstado());
    }

    @Test
    public void deveInvalidarPlacaAntiga() {
        placa.setEstado(PlacaEstadoAntiga.getInstance());
        assertTrue(placa.invalidar());
        assertEquals(PlacaEstadoInvalida.getInstance(), placa.getEstado());
    }

    // Placa mercosul

    @Test
    public void deveInvalidarPlacaMercosul() {
        placa.setEstado(PlacaEstadoMercosul.getInstance());
        assertTrue(placa.invalidar());
        assertEquals(PlacaEstadoInvalida.getInstance(), placa.getEstado());
    }

    @Test
    public void deveRetornarPaisPlacaMercosul() {
        assertEquals("Brasil", PlacaEstadoMercosul.getInstance().getPais());
    }


}
