package venda_simples;

public class ItemDeVenda {

    String codigo;
    String descricao;
    Double quantidade;
    String unidade;
    Double valorUnitario;

    public ItemDeVenda(String codigo, String descricao, Double quantidade, String unidade, Double valorUinitario) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.unidade = unidade;
        this.valorUnitario = valorUinitario;
    }

    String imprimir() {

        return this.codigo + " " + this.descricao + " " + this.quantidade + " " + this.unidade + " "
                + this.valorUnitario + " " + String.format("%.3f", getValorTotal()) + "\n";
    }

    Double getValorTotal() {
        return this.valorUnitario * this.quantidade;
    }
}
