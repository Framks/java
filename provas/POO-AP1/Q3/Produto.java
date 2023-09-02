public class Produto {
    private String nome;
    private Integer estoque;
    private Double preco;

    public Produto(String nome, Integer estoque, Double preco) {
        this.estoque = estoque;
        this.nome = nome;
        this.preco = preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void adicionarEstoque(Integer estoque) {
        this.estoque = estoque;
    }

    public void removerEstoque() {
        this.estoque = getEstoque() - 1;
    }

    public String getNome() {
        return this.nome;
    }

    public Double getPreco() {
        return this.preco;
    }

    public Integer getEstoque() {
        return this.estoque;
    }
}
