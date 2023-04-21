package Sessao_De_Cinema;

public class Cliente {
    String cpf;
    String telefone;

    public Cliente(String cpf, String telefone) {
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }
}
