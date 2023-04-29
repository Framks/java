public class ControladorAvalicoes {
    AvaliacaoRU[] avaliacoes;

    // construtor que ao instanciar uma classe cria um array com tamanho 50 para
    // armazenar as avaliações
    public ControladorAvalicoes() {
        this.avaliacoes = new AvaliacaoRU[50];
    }

    // função que adiciona uma avaliação no vetor de avaliações
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

    // media das avaliações sem restrições
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

    // função que retorna a media de todas avaliações baseada por tipo de proteina
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

    // função que retorna a media de todas as avaliações baseada no turno
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

    // função que retorna a media de todas as avaliações baseada na data
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

    // função que retorna todos os comentarios das avaliações
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