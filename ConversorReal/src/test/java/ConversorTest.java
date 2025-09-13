import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ConversorTest {

    @Test
     void deveVerificarOrigemInvalida() {
        try {
            Conversor c = new Conversor();
            c.setOrigem("");
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Origem Inválida", e.getMessage());
        }
    }

    @Test
    void deveVerificarDestinoInvalido() {
        try {
            Conversor c = new Conversor();
            c.setOrigem("BRL");
            c.setDestino("YYZ");
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Destino Inválido", e.getMessage());
        }
    }
    @Test
    void deveVerificarValorInvalido() {
        try {
            Conversor c = new Conversor();
            c.setOrigem("BRL");
            c.setDestino("USD");
            c.setValor(0);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Valor Inválido", e.getMessage());
        }
    }

    @Test
    public void deveConverterBRLparaUSD() {
        Conversor c = new Conversor();
        c.setOrigem("BRL");
        c.setDestino("USD");
        c.setValor(100d);
        assertEquals(20d, c.converter(), 0.01);
    }
    @Test
    public void deveConverterBRLparaEUR() {
        Conversor c = new Conversor();
        c.setOrigem("BRL");
        c.setDestino("EUR");
        c.setValor(100d);
        assertEquals(16, c.converter(), 1);
    }
    @Test
    public void deveConverterBRLparaGBP() {
        Conversor c = new Conversor();
        c.setOrigem("BRL");
        c.setDestino("GBP");
        c.setValor(100d);
        assertEquals(15, c.converter(), 0.01);
    }
    @Test
    public void deveConverterBRLparaJPY() {
        Conversor c = new Conversor();
        c.setOrigem("BRL");
        c.setDestino("JPY");
        c.setValor(100d);
        assertEquals(2700, c.converter(), 0.01);
    }
    @Test
    public void deveConverterBRLparaAUD() {
        Conversor c = new Conversor();
        c.setOrigem("BRL");
        c.setDestino("AUD");
        c.setValor(100d);
        assertEquals(35, c.converter(), 0.01);
    }
    @Test
    public void deveConverterUSDparaBRL() {
        Conversor c = new Conversor();
        c.setOrigem("USD");
        c.setDestino("BRL");
        c.setValor(100d);
        assertEquals(500, c.converter(), 0.01);
    }
    @Test
    public void deveConverterEURparaBRL() {
        Conversor c = new Conversor();
        c.setOrigem("EUR");
        c.setDestino("BRL");
        c.setValor(100d);
        assertEquals(625, c.converter(), 1);
    }

    @Test
    public void deveConverterGBPparaBRL() {
        Conversor c = new Conversor();
        c.setOrigem("GBP");
        c.setDestino("BRL");
        c.setValor(100d);
        assertEquals(666, c.converter(), 1);
    }
    @Test
    public void deveConverterJPYparaBRL() {
        Conversor c = new Conversor();
        c.setOrigem("JPY");
        c.setDestino("BRL");
        c.setValor(1000d);
        assertEquals(37, c.converter(), 1);
    }
    @Test
    public void deveConverterAUDparaBRL() {
        Conversor c = new Conversor();
        c.setOrigem("AUD");
        c.setDestino("BRL");
        c.setValor(100d);
        assertEquals(285, c.converter(), 1);
    }
}