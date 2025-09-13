public class Exame {
    private double nivelTriglicerides;
    private double nivelColesterolTotal;
    private double nivelColesterolHDL;
    private double nivelColesterolLDL;
    private double nivelColesterolVLDL;
    private double nivelGlicose;


    public Exame() {

    }

    public void setNivelTriglicerides(double nivelTriglicerides) {
        if (nivelTriglicerides <= 0) {
            throw new IllegalArgumentException("Valor Invalido");
        }
        this.nivelTriglicerides = nivelTriglicerides;
    }

    public void setNivelColesterolTotal(double nivelColesterolTotal) {
        if (nivelColesterolTotal <= 0) {
            throw new IllegalArgumentException("Valor Invalido");
        }
        this.nivelColesterolTotal = nivelColesterolTotal;
    }

    public void setNivelColesterolHDL(double nivelColesterolHDL) {
        if (nivelColesterolHDL <= 0) {
            throw new IllegalArgumentException("Valor Invalido");
        }
        this.nivelColesterolHDL = nivelColesterolHDL;
    }

    public void setNivelColesterolLDL(double nivelColesterolLDL) {
        if (nivelColesterolLDL <= 0) {
            throw new IllegalArgumentException("Valor Invalido");
        }
        this.nivelColesterolLDL = nivelColesterolLDL;
    }

    public void setNivelColesterolVLDL(double nivelColesterolVLDL) {
        if (nivelColesterolVLDL <= 0) {
            throw new IllegalArgumentException("Valor Invalido");
        }
        this.nivelColesterolVLDL = nivelColesterolVLDL;
    }

    public void setNivelGlicose(double nivelGlicose) {
        if (nivelGlicose <= 0) {
            throw new IllegalArgumentException("Glicose Invalida");
        }
        this.nivelGlicose = nivelGlicose;
    }

    public double getNivelTriglicerides() {
        return nivelTriglicerides;
    }

    public double getNivelColesterolTotal() {
        return nivelColesterolTotal;
    }

    public double getNivelColesterolHDL() {
        return nivelColesterolHDL;
    }

    public double getNivelColesterolLDL() {
        return nivelColesterolLDL;
    }

    public double getNivelColesterolVLDL() {
        return nivelColesterolVLDL;
    }

    public double getNivelGlicose() {
        return nivelGlicose;
    }

    public String classificarTriglicerides() {
        if (nivelTriglicerides < 150) {
            return "Nivel desejavel";
        } else if (nivelTriglicerides <= 199) {
            return "Nivel limitrofe";
        } else if (nivelTriglicerides <= 499) {
            return "Nivel alto";
        }else {
            return "Nivel muito alto";
        }
    }

    public String classificarColesterolTotal() {
        if (nivelColesterolTotal < 200) {
            return "Desejavel";
        } else if (nivelColesterolTotal <= 239) {
            return "Limitrofe";
        } else {
            return "Elevado";
        }
    }

    public String classificarColesterolHDL() {
        if (nivelColesterolHDL < 40) {
            return "Baixo";
        } else if (nivelColesterolHDL <= 60) {
            return "Normal";
        } else {
            return "Desejavel";
        }
    }

    public String classificarColesterolLDL() {
        if (nivelColesterolLDL < 100) {
            return "Otimo";
        } else if (nivelColesterolLDL <= 129) {
            return "Desejavel";
        } else if (nivelColesterolLDL <= 159) {
            return "Limitrofe";
        } else if (nivelColesterolLDL <= 189) {
            return "Alto";
        } else {
            return "Muito alto";
        }
    }

    public String classificarColesterolVLDL() {
        if (nivelColesterolVLDL < 30) {
            return "Desejavel";
        } else if (nivelColesterolVLDL <= 40) {
            return "Limitrofe";
        } else {
            return "Elevado";
        }
    }

    public String classificarGlicose() {
        if (nivelGlicose < 60) {
            return "Hipoglicemia";
        } else if (nivelGlicose <= 99) {
            return "Desejavel";
        } else if (nivelGlicose <= 125) {
            return "Glicemia de jejum inapropriada";
        } else {
            return "Diabetes";
        }
    }
}

