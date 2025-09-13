public class Pessoa {
    private double peso;
    private double altura;
    private String sexo;

    public ImcRefeito(double peso, double altura, String sexo) {
        this.setPeso(peso);
        this.setAltura(altura);
        this.setSexo(sexo);
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

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        if (!sexo.equals("M") && !sexo.equals("F")) {
            throw new IllegalArgumentException("Sexo inválido (use M ou F)");
        }
        this.sexo = sexo;
    }

    public double calcularIMC() {
        return this.peso / (this.altura * this.altura);
    }

    public String classificar() {
        double imc = calcularIMC();

        if (sexo.equals("F")) {
            if (imc < 19.1) {
                return "Abaixo do peso";
            } else if (imc < 25.8) {
                return "Peso normal";
            } else if (imc < 27.3) {
                return "Marginalmente acima do peso";
            } else if (imc < 32.3) {
                return "Acima do peso";
            } else {
                return "Obeso";
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
