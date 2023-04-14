public class AvaliacaoRU {
    String data;
    String turno;
    String proteina;
    int nota;
    String comentario;

    public AvaliacaoRU(String data, String turno, String proteina, int nota, String comentario) {
        this.data = data;
        this.turno = turno;
        this.proteina = proteina;
        this.nota = nota;
        this.comentario = comentario;
    }

    public String getComentario() {
        return this.comentario;
    }

    public String getData() {
        return this.data;
    }

    public int getNota() {
        return this.nota;
    }

    public String getProteina() {
        return this.proteina;
    }

    public String getTurno() {
        return this.turno;
    }
}
