
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    public void deveVerificarPesoInvalido() {
        try {
            Pessoa pessoa = new Pessoa();
            pessoa.setPeso(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Peso inválido", e.getMessage());
        }

    }

    @Test
    public void deveVerificarAlturaInvalida() {
        try {
            Pessoa pessoa = new Pessoa();
            pessoa.setAltura(0);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Altura inválida", e.getMessage());
        }
    }

    @Test
    public void deveVerificarSexoInvalido() {
        try {
            Pessoa pessoa = new Pessoa();
            pessoa.setSexo("E");
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Sexo inválido", e.getMessage());
        }
    }

    @Test
    public void deveVerificarMulherAbaixoPeso() {
        Pessoa pessoa = new Pessoa();
        pessoa.setPeso(19.0f);
        pessoa.setAltura(1f);
        pessoa.setSexo("F");
        assertEquals("Abaixo do Peso", pessoa.classificar());
    }

    @Test
    public void deveVerificarMulherNoPeso() {
        Pessoa pessoa = new Pessoa();
        pessoa.setPeso(19.1d);
        pessoa.setAltura(1d);
        pessoa.setSexo("F");
        assertEquals("Peso normal", pessoa.classificar());
    }
    @Test
    public void deveVerificarMulherMarginalmenteAcima() {
        Pessoa pessoa = new Pessoa();
        pessoa.setPeso(25.8d);
        pessoa.setAltura(1d);
        pessoa.setSexo("F");
        assertEquals("Marginalmente acima do peso", pessoa.classificar());
    }
    @Test
    public void deveVerificarMulherAcimaPeso() {
        Pessoa pessoa = new Pessoa();
        pessoa.setPeso(27.3d);
        pessoa.setAltura(1d);
        pessoa.setSexo("F");
        assertEquals("Acima do peso", pessoa.classificar());
    }
    @Test
    public void deveVerificarMulherObesa() {
        Pessoa pessoa = new Pessoa();
        pessoa.setPeso(32.3d);
        pessoa.setAltura(1d);
        pessoa.setSexo("F");
        assertEquals("Obesa", pessoa.classificar());
    }
    @Test
    public void deveVerificarHomemAbaixo() {
        Pessoa pessoa = new Pessoa();
        pessoa.setPeso(20.6d);
        pessoa.setAltura(1d);
        pessoa.setSexo("M");
        assertEquals("Abaixo do peso", pessoa.classificar());
    }
    @Test
    public void deveVerificarHomemNoPesoNormal() {
        Pessoa pessoa = new Pessoa();
        pessoa.setPeso(20.7d);
        pessoa.setAltura(1d);
        pessoa.setSexo("M");
        assertEquals("Peso normal", pessoa.classificar());
    }
    @Test
    public void deveVerificarHomemMarginalmenteAcima() {
        Pessoa pessoa = new Pessoa();
        pessoa.setPeso(26.4d);
        pessoa.setAltura(1d);
        pessoa.setSexo("M");
        assertEquals("Marginalmente acima do peso", pessoa.classificar());
    }
    @Test
    public void deveVerificarHomemAcimaPesoIdeal() {
        Pessoa pessoa = new Pessoa();
        pessoa.setPeso(27.8d);
        pessoa.setAltura(1d);
        pessoa.setSexo("M");
        assertEquals("Acima do peso", pessoa.classificar());
    }
    @Test
    public void deveVerificarHomemObeso() {
        Pessoa pessoa = new Pessoa();
        pessoa.setPeso(31.1);
        pessoa.setAltura(1d);
        pessoa.setSexo("M");
        assertEquals("Obeso", pessoa.classificar());
    }
}
