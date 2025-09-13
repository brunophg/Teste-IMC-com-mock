import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExameTest {

    @Test
    void deveVerificarTrigliceridesInvalido() {
        try {
            Exame exame = new Exame();
            exame.setNivelTriglicerides(0);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Valor Invalido", e.getMessage());
        }

    }

    @Test
    void deveVerificarColesterolTotalInvalido() {
        try {
            Exame exame = new Exame();
            exame.setNivelColesterolTotal(0);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Valor Invalido", e.getMessage());
        }
    }

    @Test
    void deveVerificarTColesterolHDLInvalido() {
        try {
            Exame exame = new Exame();
            exame.setNivelColesterolHDL(0);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Valor Invalido", e.getMessage());
        }

    }
    @Test
    void deveVerificarValorColesterolHDLValido() {
        Exame exame = new Exame();
        exame.setNivelColesterolHDL(1);
        assertEquals(1, exame.getNivelColesterolHDL());
    }

    @Test
    void deveVerificarColesterolLDLInvalido() {
        try {
            Exame exame = new Exame();
            exame.setNivelColesterolLDL(0);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Valor Invalido", e.getMessage());
        }

    }

    @Test
    void deveVerificarColesterolVLDLInvalido() {
        try {
            Exame exame = new Exame();
            exame.setNivelColesterolVLDL(0);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Valor Invalido", e.getMessage());
        }

    }

    @Test
    void deveVerificarGlicoseInvalida() {
        try {
            Exame exame = new Exame();
            exame.setNivelGlicose(0);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Glicose Invalida", e.getMessage());
        }

    }

    @Test
    void deveVerificarNivelTrigliceridesDesejavel() {
        Exame exame = new Exame();
        exame.setNivelTriglicerides(149);
        assertEquals("Nivel desejavel", exame.classificarTriglicerides());
    }

    @Test
    void deveVerificarNivelTrigliceridesLimitrofe() {
        Exame exame = new Exame();
        exame.setNivelTriglicerides(150);
        assertEquals("Nivel limitrofe", exame.classificarTriglicerides());
    }

    @Test
    void deveVerificarNivelTrigliceridesAlto() {
        Exame exame = new Exame();
        exame.setNivelTriglicerides(200);
        assertEquals("Nivel alto", exame.classificarTriglicerides());
    }

    @Test
    void deveVerificarNivelTrigliceridesMuitoAlto() {
        Exame exame = new Exame();
        exame.setNivelTriglicerides(500);
        assertEquals("Nivel muito alto", exame.classificarTriglicerides());
    }

    @Test
    void deveVerificarNivelColesterolTotalDesejavel() {
        Exame exame = new Exame();
        exame.setNivelColesterolTotal(199);
        assertEquals("Desejavel", exame.classificarColesterolTotal());
    }

    @Test
    void deveVerificarNivelColesterolTotalLimitrofe() {
        Exame exame = new Exame();
        exame.setNivelColesterolTotal(200);
        assertEquals("Limitrofe", exame.classificarColesterolTotal());
    }

    @Test
    void deveVerificarNivelColesterolTotalElevado() {
        Exame exame = new Exame();
        exame.setNivelColesterolTotal(240);
        assertEquals("Elevado", exame.classificarColesterolTotal());
    }

    @Test
    void deveVerificarColesterolHDLBaixo() {
        Exame exame = new Exame();
        exame.setNivelColesterolHDL(39);
        assertEquals("Baixo", exame.classificarColesterolHDL());
    }

    @Test
    void deveVerificarColesterolHDLNormal() {
        Exame exame = new Exame();
        exame.setNivelColesterolHDL(40);
        assertEquals("Normal", exame.classificarColesterolHDL());
    }

    @Test
    void deveVerificarColesterolHDLDesejavel() {
        Exame exame = new Exame();
        exame.setNivelColesterolHDL(61);
        assertEquals("Desejavel", exame.classificarColesterolHDL());
    }

    @Test
    void deveVerificarColesterolLDLOtimo() {
        Exame exame = new Exame();
        exame.setNivelColesterolLDL(99);
        assertEquals("Otimo", exame.classificarColesterolLDL());
    }

    @Test
    void deveVerificarColesterolLDLDesejavel() {
        Exame exame = new Exame();
        exame.setNivelColesterolLDL(100);
        assertEquals("Desejavel", exame.classificarColesterolLDL());
    }

    @Test
    void deveVerificarColesterolLDLlimitrofe() {
        Exame exame = new Exame();
        exame.setNivelColesterolLDL(130);
        assertEquals("Limitrofe", exame.classificarColesterolLDL());
    }

    @Test
    void deveVerificarColesterolLDLAlto() {
        Exame exame = new Exame();
        exame.setNivelColesterolLDL(160);
        assertEquals("Alto", exame.classificarColesterolLDL());
    }

    @Test
    void deveVerificarColesterolLDLMuitoAlto() {
        Exame exame = new Exame();
        exame.setNivelColesterolLDL(190);
        assertEquals("Muito alto", exame.classificarColesterolLDL());
    }

    @Test
    void deveVerificarColesterolVLDLdesejavel() {
        Exame exame = new Exame();
        exame.setNivelColesterolVLDL(29);
        assertEquals("Desejavel", exame.classificarColesterolVLDL());
    }

    @Test
    void deveVerificarColesterolVLDLlimitrofe() {
        Exame exame = new Exame();
        exame.setNivelColesterolVLDL(30);
        assertEquals("Limitrofe", exame.classificarColesterolVLDL());
    }

    @Test
    void deveVerificarColesterolVLDLelevado() {
        Exame exame = new Exame();
        exame.setNivelColesterolVLDL(41);
        assertEquals("Elevado", exame.classificarColesterolVLDL());
    }

    @Test
    void deveVerificarHipoglicemia() {
        Exame exame = new Exame();
        exame.setNivelGlicose(59);
        assertEquals("Hipoglicemia", exame.classificarGlicose());
    }

    @Test
    void deveVerificarGlicoseDesejavel() {
        Exame exame = new Exame();
        exame.setNivelGlicose(60);
        assertEquals("Desejavel", exame.classificarGlicose());
    }

    @Test
    void deveVerificarGlicemiaInapropriada() {
        Exame exame = new Exame();
        exame.setNivelGlicose(100);
        assertEquals("Glicemia de jejum inapropriada", exame.classificarGlicose());
    }

    @Test
    void deveVerificarDiabetes() {
        Exame exame = new Exame();
        exame.setNivelGlicose(126);
        assertEquals("Diabetes", exame.classificarGlicose());
    }
}