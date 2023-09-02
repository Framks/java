public class Inventario {
    private BemMovel[] bens;

    public Inventario() {

    }

    public Boolean adicionar(BemMovel bem) {
        if (bens == null) {
            bens = new BemMovel[1];
            bens[0] = bem;
            return true;
        } else {
            for (int i = 0; i < bens.length; i++) {
                if (bens[i].getId() == bem.getId()) {
                    return false;
                }
            }
            BemMovel[] listasDeBens = new BemMovel[bens.length + 1];
            for (int i = 0; i < bens.length; i++) {
                listasDeBens[i] = bens[i];
            }
            listasDeBens[bens.length] = bem;
            bens = listasDeBens;
            return true;
        }
    }

    public String getDescricaoDoBem(String id) {
        BemMovel achado = buscar(id);
        if (achado == null) {
            return "nao existe";
        }
        return achado.getDesc();
    }

    public Double getValorDoBem(String id) {
        BemMovel achado = buscar(id);
        if (achado == null) {
            return 0.0;
        }
        return achado.getValor();
    }

    public Double getTotalBens() {
        Double total = 0.0;
        for (int i = 0; i < bens.length; i++) {
            total += bens[i].getValor();
        }
        return total;
    }

    private BemMovel buscar(String id) {
        BemMovel b = null;
        for (int i = 0; i < bens.length; i++) {
            if (bens[i].getId() == id) {
                b = bens[i];
            }

        }
        return b;
    }
}
