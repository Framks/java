package venda_simples;

public class Venda {

    ItemDeVenda[] items;
    String numeroNotaFiscal;

    public Venda(String numeroNotaFiscal) {
        this.numeroNotaFiscal = numeroNotaFiscal;
    }

    String adicionarItem(String codigo, String descrisao, Double quantidade, String unidade, Double valorUnitario) {
        if (codigo != "" && descrisao != "" && quantidade > 0.0 && unidade != "" && valorUnitario > 0.0) {
            ItemDeVenda novo = new ItemDeVenda(codigo, descrisao, quantidade, unidade, valorUnitario);
            if (items == null) {
                items = new ItemDeVenda[1];
                items[0] = novo;
            } else {
                ItemDeVenda[] lista = new ItemDeVenda[items.length + 1];
                for (int i = 0; i < items.length; i++) {
                    lista[i] = items[i];
                }
                lista[items.length] = novo;
                items = lista;
            }
            return "";
        } else {
            return "";
        }
    }

    Double getValorTotal() {
        Double total_valor = 0.0;
        if (items != null) {
            for (int i = 0; i < items.length; i++) {
                total_valor += items[i].getValorTotal();
            }
        } else {

        }

        return total_valor;
    }

    String imprimir() {
        String saida = "";
        if (items[0] != null) {
            for (int i = 0; i < this.items.length; i++) {
                saida += items[i].imprimir();
            }
            saida += "Valor total " + getValorTotal() + "\nNota fiscal " + this.numeroNotaFiscal;
        } else {

        }
        return saida;
    }

}
