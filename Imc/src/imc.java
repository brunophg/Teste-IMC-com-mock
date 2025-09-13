public class imc {

    private double peso;
    private double altura;
    private String sexo; // "homem" ou "mulher"

    public imc(double peso, double altura, String sexo) {
        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo.toLowerCase();
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public String classificar() {
        double imc = calcularIMC();

        if (sexo.equals("mulher")) { 
            if (imc < 19.1) return "Abaixo do peso"; 
            else if (imc < 25.8) return "Peso normal"; 
            else if (imc < 27.3) return "Marginalmente acima do peso"; 
            else if (imc < 32.3) return "Acima do peso ideal"; 
            else return "Obeso"; 
        } else { // homem 
            if (imc < 20.7) return "Abaixo do peso"; 
            else if (imc < 26.4) return "Peso normal"; 
            else if (imc < 27.8) return "Marginalmente acima do peso"; 
            else if (imc < 31.1) return "Acima do peso ideal"; 
            else return "Obeso"; 
        }
    }

}
