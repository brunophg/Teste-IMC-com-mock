public class Conversor {

    private String origem;
    private String destino;
    private double valor;

    private static final double TAXA_USD = 0.20;
    private static final double TAXA_EUR = 0.16;
    private static final double TAXA_GBP = 0.15;
    private static final double TAXA_JPY = 27.00;
    private static final double TAXA_AUD = 0.35;

    public Conversor() {

    }


    public void setOrigem(String origem) {
        if (origem == null || !(origem.equals("BRL") || origem.equals("USD") || origem.equals("EUR")
                || origem.equals("GBP") || origem.equals("JPY") || origem.equals("AUD"))) {
            throw new IllegalArgumentException("Origem Inválida");
        }
        this.origem = origem;
    }

    public void setDestino(String destino) {
        if (destino == null ||
                !(destino.equals("BRL") || destino.equals("USD") || destino.equals("EUR")
                        || destino.equals("GBP") || destino.equals("JPY") || destino.equals("AUD"))) {
            throw new IllegalArgumentException("Destino Inválido");
        }
        this.destino = destino;
    }

    public void setValor(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor Inválido");
        }
        this.valor = valor;
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    public double getValor() {
        return valor;
    }

    public Conversor(String origem, String destino, double valor) {
        this.setOrigem(origem);
        this.setDestino(destino);
        this.setValor(valor);
    }

    public double converter() {
        double resultado;

        if (origem.equals("BRL")) {
            if (destino.equals("USD")) {
                resultado = valor * TAXA_USD;
                return resultado;
            } else if (destino.equals("EUR")) {
                resultado = valor * TAXA_EUR;
                return resultado;
            } else if (destino.equals("GBP")) {
                resultado = valor * TAXA_GBP;
                return resultado;
            } else if (destino.equals("JPY")) {
                resultado = valor * TAXA_JPY;
                return resultado;
            } else {
                resultado = valor * TAXA_AUD;
                return resultado;
            }
        } else {
            if (origem.equals("USD")) {
                resultado = valor / TAXA_USD;
                return resultado;
            } else if (origem.equals("EUR")) {
                resultado = valor / TAXA_EUR;
                return resultado;
            } else if (origem.equals("GBP")) {
                resultado = valor / TAXA_GBP;
                return resultado;
            } else if (origem.equals("JPY")) {
                resultado = valor / TAXA_JPY;
                return resultado;
            } else {
                resultado = valor / TAXA_AUD;
                return resultado;
            }
        }


    }
}
