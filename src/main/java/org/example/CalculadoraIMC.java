package org.example;

public class CalculadoraIMC implements ICalculadora {

    private double peso;
    private double altura;
    private String sexo;

    public String getSexo() {
        return this.sexo;
    }


    public void setSexo(String sexo) {
        if (!sexo.equals("M") && !sexo.equals("F")) {
            throw new IllegalArgumentException("Sexo inválido");
        }
        this.sexo = sexo;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("Peso inválido");
        }
        this.peso = peso;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("Altura inválida");
        }
        this.altura = altura;
    }

    @Override
    public double calcularIMC() {
        return this.peso / (this.altura * this.altura);
    }
}
