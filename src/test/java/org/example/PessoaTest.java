package org.example;

import org.junit.jupiter.api.Test;

import static org.easymock.EasyMock.*;
import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    public void deveVerificarMulherAbaixoPeso() {
        Pessoa pessoa = new Pessoa();
        ICalculadora calculadora = new CalculadoraIMC();
        calculadora.setPeso(19.0f);
        calculadora.setAltura(1f);
        calculadora.setSexo("F");
        assertEquals("Abaixo do Peso", pessoa.classificar(calculadora));
    }

    @Test
    public void deveVerificarMulherPesoIdeal() {
        Pessoa pessoa = new Pessoa();
        ICalculadora calculadora = new CalculadoraIMC();
        calculadora.setPeso(19.1f);
        calculadora.setAltura(1f);
        calculadora.setSexo("F");
        assertEquals("Peso normal", pessoa.classificar(calculadora));
    }

    @Test
    public void deveVerificarMulherMarginalmenteAcima() {
        Pessoa pessoa = new Pessoa();
        ICalculadora calculadora = new CalculadoraIMC();
        calculadora.setPeso(26.4);
        calculadora.setAltura(1f);
        calculadora.setSexo("F");
        assertEquals("Marginalmente acima do peso", pessoa.classificar(calculadora));
    }
    @Test
    public void deveVerificarMulherAcimaPeso() {
        Pessoa pessoa = new Pessoa();
        ICalculadora calculadora = new CalculadoraIMC();
        calculadora.setPeso(27.8f);
        calculadora.setAltura(1f);
        calculadora.setSexo("F");
        assertEquals("Acima do peso", pessoa.classificar(calculadora));
    }

    @Test
    public void deveVerificarMulherObesa() {
        Pessoa pessoa = new Pessoa();
        ICalculadora calculadora = new CalculadoraIMC();
        calculadora.setPeso(32.3d);
        calculadora.setAltura(1d);
        calculadora.setSexo("F");
        assertEquals("Obesa", pessoa.classificar(calculadora));
    }
    @Test
    public void deveVerificarHomemAbaixo() {
        Pessoa pessoa = new Pessoa();
        ICalculadora calculadora = new CalculadoraIMC();
        calculadora.setPeso(20.6d);
        calculadora.setAltura(1d);
        calculadora.setSexo("M");
        assertEquals("Abaixo do peso", pessoa.classificar(calculadora));
    }
    @Test
    public void deveVerificarHomemNoPesoNormal() {
        Pessoa pessoa = new Pessoa();
        ICalculadora calculadora = new CalculadoraIMC();
        calculadora.setPeso(20.7d);
        calculadora.setAltura(1d);
        calculadora.setSexo("M");
        assertEquals("Peso normal", pessoa.classificar(calculadora));
    }
    @Test
    public void deveVerificarHomemMarginalmenteAcima() {
        Pessoa pessoa = new Pessoa();
        ICalculadora calculadora = new CalculadoraIMC();
        calculadora.setPeso(26.4d);
        calculadora.setAltura(1d);
        calculadora.setSexo("M");
        assertEquals("Marginalmente acima do peso", pessoa.classificar(calculadora));
    }
    @Test
    public void deveVerificarHomemAcimaPeso() {
        Pessoa pessoa = new Pessoa();
        ICalculadora calculadora = new CalculadoraIMC();
        calculadora.setPeso(27.8d);
        calculadora.setAltura(1d);
        calculadora.setSexo("M");
        assertEquals("Acima do peso", pessoa.classificar(calculadora));
    }
    @Test
    public void deveVerificarHomemObeso() {
        Pessoa pessoa = new Pessoa();
        ICalculadora calculadora = new CalculadoraIMC();
        calculadora.setPeso(31.1);
        calculadora.setAltura(1d);
        calculadora.setSexo("M");
        assertEquals("Obeso", pessoa.classificar(calculadora));
    }
    @Test
    void deveVerificarMulherMockAbaixoPeso() {
        ICalculadora calculadoraMock = createMock(ICalculadora.class);
        expect(calculadoraMock.calcularIMC()).andReturn(19.0);
        expect(calculadoraMock.getSexo()).andReturn("F");
        replay(calculadoraMock);
        Pessoa pessoa = new Pessoa();
        assertEquals("Abaixo do Peso", pessoa.classificar(calculadoraMock));

    }
    @Test
    void deveVerificarMulherMockNoPesoIdeal() {
        ICalculadora calculadoraMock = createMock(ICalculadora.class);
        expect(calculadoraMock.calcularIMC()).andReturn(19.1);
        expect(calculadoraMock.getSexo()).andReturn("F");
        replay(calculadoraMock);
        Pessoa pessoa = new Pessoa();
        assertEquals("Peso normal", pessoa.classificar(calculadoraMock));
    }
    @Test
    void deveVerificarMulherMockMarginalmenteAcima() {
        ICalculadora calculadoraMock = createMock(ICalculadora.class);
        expect(calculadoraMock.calcularIMC()).andReturn(26.4);
        expect(calculadoraMock.getSexo()).andReturn("F");
        replay(calculadoraMock);
        Pessoa pessoa = new Pessoa();
        assertEquals("Marginalmente acima do peso", pessoa.classificar(calculadoraMock));
    }

    @Test
    void deveVerificarMulherMockAcimaPeso() {
        ICalculadora calculadoraMock = createMock(ICalculadora.class);
        expect(calculadoraMock.calcularIMC()).andReturn(27.8);
        expect(calculadoraMock.getSexo()).andReturn("F");
        replay(calculadoraMock);
        Pessoa pessoa = new Pessoa();
        assertEquals("Acima do peso", pessoa.classificar(calculadoraMock));
    }

    @Test
    void deveVerificarMulherMockObesa() {
        ICalculadora calculadoraMock = createMock(ICalculadora.class);
        expect(calculadoraMock.calcularIMC()).andReturn(32.3);
        expect(calculadoraMock.getSexo()).andReturn("F");
        replay(calculadoraMock);
        Pessoa pessoa = new Pessoa();
        assertEquals("Obesa", pessoa.classificar(calculadoraMock));
    }

    @Test
    void deveVerificarHomemMockAbaixoPeso() {
        ICalculadora calculadoraMock = createMock(ICalculadora.class);
        expect(calculadoraMock.calcularIMC()).andReturn(20.6);
        expect(calculadoraMock.getSexo()).andReturn("M");
        replay(calculadoraMock);
        Pessoa pessoa = new Pessoa();
        assertEquals("Abaixo do peso", pessoa.classificar(calculadoraMock));
    }

    @Test
    void deveVerificarHomemMockPesoNormal() {
        ICalculadora calculadoraMock = createMock(ICalculadora.class);
        expect(calculadoraMock.calcularIMC()).andReturn(20.7);
        expect(calculadoraMock.getSexo()).andReturn("M");
        replay(calculadoraMock);
        Pessoa pessoa = new Pessoa();
        assertEquals("Peso normal", pessoa.classificar(calculadoraMock));
    }

    @Test
    void deveVerificarHomemMockMarginalmenteAcima() {
        ICalculadora calculadoraMock = createMock(ICalculadora.class);
        expect(calculadoraMock.calcularIMC()).andReturn(26.4);
        expect(calculadoraMock.getSexo()).andReturn("M");
        replay(calculadoraMock);
        Pessoa pessoa = new Pessoa();
        assertEquals("Marginalmente acima do peso", pessoa.classificar(calculadoraMock));
    }

    @Test
    void deveVerificarHomemMockAcimaPeso() {
        ICalculadora calculadoraMock = createMock(ICalculadora.class);
        expect(calculadoraMock.calcularIMC()).andReturn(27.8);
        expect(calculadoraMock.getSexo()).andReturn("M");
        replay(calculadoraMock);
        Pessoa pessoa = new Pessoa();
        assertEquals("Acima do peso", pessoa.classificar(calculadoraMock));
    }

    @Test
    void deveVerificarHomemMockObeso() {
        ICalculadora calculadoraMock = createMock(ICalculadora.class);
        expect(calculadoraMock.calcularIMC()).andReturn(31.1);
        expect(calculadoraMock.getSexo()).andReturn("M");
        replay(calculadoraMock);
        Pessoa pessoa = new Pessoa();
        assertEquals("Obeso", pessoa.classificar(calculadoraMock));
    }
}





