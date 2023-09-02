public class DiscenteTurma {
    private String matricula;
    private String nomeCompleto;
    private Double[] avaliacoes;
    private Integer faltas;

    public DiscenteTurma(String matricula, String nomeCompleto) {
        this.matricula = matricula;
        this.nomeCompleto = nomeCompleto;
        this.avaliacoes = new Double[3];
        this.faltas = 0;
    }

    public void setFaltas(Integer faltas) {
        this.faltas = faltas;
    }

    public void setNota(Integer ap, Double nota) {
        this.avaliacoes[ap] = nota;
    }

    public Double getMedia() {
        if (this.faltas <= 16) {
            return (this.avaliacoes[0] + this.avaliacoes[1] + this.avaliacoes[2]) / 3;
        } else {
            return 0.0;
        }
    }

    public String getResultado() {
        if (this.faltas > 16) {
            return "REPF";
        } else if (this.getMedia() < 5.0) {
            return "REPM";
        }
        return "APROV";
    }
}
