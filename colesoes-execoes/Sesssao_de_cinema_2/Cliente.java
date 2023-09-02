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

    public boolean equals(Object o){
        if(o.getClass() == this.getClass()){
            Cliente a = (Cliente)o;
            if (this.getCpf().equals(a.getCpf())){
                return true;
            }
        }
        return false;
    }
}