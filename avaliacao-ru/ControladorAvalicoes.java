public class ControladorAvalicoes {
    AvaliacaoRU[] avaliacoes;

    public ControladorAvalicoes() {
        this.avaliacoes = new AvaliacaoRU[50];
    }

    public boolean adicionarAvaliacao(AvaliacaoRU avalia) {
        if (avalia.getData() != "" && (avalia.getNota() >= 1 && avalia.getNota() <= 5) && avalia.getProteina() != ""
                && avalia.getTurno() != "") {
            if (((avalia.getNota() == 1 || avalia.getNota() == 2) && avalia.getComentario() == "")) {
                return false;
            }
            for (int i = 0; i < this.avaliacoes.length; i++) {
                if (this.avaliacoes[i] == null) {
                    this.avaliacoes[i] = avalia;
                    return true;
                }
            }
        }
        return false;
    }

    public float getMediaAvaliacoes() {
        float media = 0, quant = 0;
        for (int i = 0; i < 50; i++) {
            if (this.avaliacoes[i] != null) {
                media += this.avaliacoes[i].getNota();
                quant += 1;
            }
        }
        if (quant > 0)
            media = media / quant;
        return media;
    }

    public float getMediaAvaliacoesPorProteina(String test) {
        float media = 0, quant = 0;
        for (int i = 0; i < 50; i++) {
            if (this.avaliacoes[i] != null) {
                if (this.avaliacoes[i].getProteina().equals(test)) {
                    media += this.avaliacoes[i].getNota();
                    quant += 1;
                }
            }
        }
        if (quant > 0)
            media = media / quant;
        return media;
    }

    public float getMediaAvaliacoesPorTurno(String test) {
        float media = 0, quant = 0;
        for (int i = 0; i < 50; i++) {
            if (this.avaliacoes[i] != null) {
                if (this.avaliacoes[i].getTurno().equals(test)) {
                    media += this.avaliacoes[i].getNota();
                    quant += 1;
                }
            }
        }
        if (quant > 0)
            media = media / quant;
        return media;
    }

    public float getMediaAvaliacoesPorData(String test) {
        float media = 0, quant = 0;
        for (int i = 0; i < 50; i++) {
            if (this.avaliacoes[i] != null) {
                if (this.avaliacoes[i].getData().equals(test)) {
                    media += this.avaliacoes[i].getNota();
                    quant += 1;
                }
            }
        }
        if (quant > 0)
            media = media / quant;
        return media;
    }

    public String getTodosComentarios() {
        String result = "";
        for (int i = 0; i < 50; i++) {
            if (this.avaliacoes[i] != null) {
                if (this.avaliacoes[i].getComentario() != "") {
                    result += this.avaliacoes[i].getComentario() + "\n";
                }
            } else {
                break;
            }
        }
        return result;
    }

}