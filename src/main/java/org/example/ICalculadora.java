package org.example;

public interface ICalculadora {
    double calcularIMC();

    void setPeso(double peso);
    void setAltura(double altura);
    String getSexo();
    void setSexo(String sexo);
}