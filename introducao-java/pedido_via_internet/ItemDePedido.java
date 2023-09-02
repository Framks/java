public class ItemDePedido {
    String codigo;
    String descricao;
    Integer quantidade;
    Double peso;
    Double valorUnitario;

    public ItemDePedido(String codigo, String descricao, Integer quantidade, Double peso, Double valorUnitario) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.peso = peso;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    Double getValorTotal() {
        return this.quantidade * this.valorUnitario;
    }

    Double getPesoTotal() {
        return this.quantidade * this.peso;
    }
}
