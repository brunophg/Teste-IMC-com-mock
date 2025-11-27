package org.example;

public class Pessoa {





    public String classificar(ICalculadora calculadora) {
        double imc = calculadora.calcularIMC();

        if (calculadora.getSexo().equals("F")) {
            if (imc < 19.1) {
                return "Abaixo do Peso";
            } else if (imc < 25.8) {
                return "Peso normal";
            } else if (imc < 27.3) {
                return "Marginalmente acima do peso";
            } else if (imc < 32.3) {
                return "Acima do peso";
            } else {
                return "Obesa";
            }
        } else {
            if (imc < 20.7) {
                return "Abaixo do peso";
            } else if (imc < 26.4) {
                return "Peso normal";
            } else if (imc < 27.8) {
                return "Marginalmente acima do peso";
            } else if (imc < 31.1) {
                return "Acima do peso";
            } else {
                return "Obeso";
            }
        }
    }
}


