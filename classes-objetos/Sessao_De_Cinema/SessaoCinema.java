public class SessaoCinema {
    String data;
    String horario;
    String filme;
    Cliente[] assentos;

    public SessaoCinema(String data, String horario, String filme, Integer capacidade) {
        this.data = data;
        this.horario = horario;
        this.filme = filme;
        assentos = new Cliente[capacidade];
    }

    public Boolean reservar(Cliente c, Integer assento) {
        if (this.assentos[assento - 1] == null) {
            for (int i = 0; i < this.assentos.length; i++) {
                if (this.assentos[i] != null) {
                    if (this.assentos[i].getCpf() == c.getCpf()) {
                        return false;
                    }
                }
            }
            this.assentos[assento - 1] = c;
            return true;
        } else {
            return false;
        }
    }

    public void cancelarReserva(String cpf) {
        for (int i = 0; i < this.assentos.length; i++) {
            if (this.assentos[i] != null) {
                if (this.assentos[i].getCpf() == cpf) {
                    this.assentos[i] = null;
                }
            }
        }
    }

    public String getMapaReservas() {
        String mapa = "";
        for (int i = 0; i < this.assentos.length; i++) {
            if (this.assentos[i] == null) {
                mapa += "Assento " + (i + 1) + ": livre\n";
            } else {
                mapa += "Assento " + (i + 1) + ": ocupado por " + this.assentos[i].getCpf() + "\n";
            }
        }
        return mapa;
    }
}
