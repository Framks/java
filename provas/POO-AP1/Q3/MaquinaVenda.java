public class MaquinaVenda {

    private Produto[] produtos;

    public MaquinaVenda() {

    }

    public void adicionarEstoque(String nome, Integer estoque, Double preco) {
        Produto novo = new Produto(nome, estoque, preco);
        if (produtos == null) {
            produtos = new Produto[1];
            produtos[0] = novo;

        } else {
            Produto achado = buscar(nome);
            if (achado != null) {
                achado.adicionarEstoque(achado.getEstoque() + estoque);
                achado.setPreco(preco);
            } else {
                Produto[] listasDeProduto = new Produto[produtos.length + 1];
                for (int i = 0; i < produtos.length; i++) {
                    listasDeProduto[i] = produtos[i];
                }
                listasDeProduto[produtos.length] = novo;
                produtos = listasDeProduto;
            }

        }
    }

    public Boolean vender(String nome) {
        Produto achado = buscar(nome);
        if (achado != null) {

            if (achado.getEstoque() > 0) {
                achado.removerEstoque();
                return true;
            }
        }
        return false;
    }

    public Double getPreco(String nome) {
        Produto achado = buscar(nome);
        if (achado == null) {
            return 0.0;
        }
        return achado.getPreco();
    }

    public Integer getEstoque(String nome) {
        Produto achado = buscar(nome);
        if (achado == null) {
            return 0;
        }
        return achado.getEstoque();
    }

    private Produto buscar(String nome) {
        Produto a = null;
        for (int i = 0; i < this.produtos.length; i++) {
            if (this.produtos[i].getNome() == nome) {
                a = this.produtos[i];
            }
        }
        return a;
    }
}
