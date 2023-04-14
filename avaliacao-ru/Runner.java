public class Runner {

    public static void main(final String[] args) {

        ControladorAvalicoes controlador = new ControladorAvalicoes();

        AvaliacaoRU avaliacao0 = new AvaliacaoRU("01/04/2023", "almoco", "animal", 0, "");// invalida

        AvaliacaoRU avaliacao1 = new AvaliacaoRU("01/04/2023", "almoco", "animal", 3, "");
        AvaliacaoRU avaliacao2 = new AvaliacaoRU("01/04/2023", "almoco", "animal", 4, "para ficar melhor blah blah...");
        AvaliacaoRU avaliacao3 = new AvaliacaoRU("01/04/2023", "jantar", "vegetal", 5, "");

        AvaliacaoRU avaliacao4 = new AvaliacaoRU("01/04/2023", "jantar", "animal", 2, ""); // invalida

        AvaliacaoRU avaliacao5 = new AvaliacaoRU("01/04/2023", "jantar", "animal", 2, "comida fria");
        AvaliacaoRU avaliacao6 = new AvaliacaoRU("02/04/2023", "almoco", "vegetal", 5, "");

        AvaliacaoRU avaliacao7 = new AvaliacaoRU("02/04/2023", "almoco", "", 4, ""); // invalida

        AvaliacaoRU avaliacao8 = new AvaliacaoRU("02/04/2023", "almoco", "animal", 3, "");
        AvaliacaoRU avaliacao9 = new AvaliacaoRU("02/04/2023", "almoco", "animal", 3, "");

        AvaliacaoRU avaliacao10 = new AvaliacaoRU("03/04/2023", "", "animal", 3, ""); // invalida

        AvaliacaoRU avaliacao11 = new AvaliacaoRU("03/04/2023", "almoco", "animal", 3, "");
        AvaliacaoRU avaliacao12 = new AvaliacaoRU("03/04/2023", "almoco", "vegetal", 3, "");
        AvaliacaoRU avaliacao13 = new AvaliacaoRU("03/04/2023", "jantar", "vegetal", 5, "bom demais");

        AvaliacaoRU avaliacao14 = new AvaliacaoRU("03/04/2023", "almoco", "animal", 6, ""); // invalida

        // checar invalidos
        if (controlador.adicionarAvaliacao(avaliacao0)) {
            System.out.println("erro - NAO deveria aceitar avaliacao0");
        }
        if (controlador.adicionarAvaliacao(avaliacao4)) {
            System.out.println("erro - NAO deveria aceitar avaliacao4");
        }
        if (controlador.adicionarAvaliacao(avaliacao7)) {
            System.out.println("erro - NAO deveria aceitar avaliacao7");
        }
        if (controlador.adicionarAvaliacao(avaliacao10)) {
            System.out.println("erro - NAO deveria aceitar avaliacao10");
        }
        if (controlador.adicionarAvaliacao(avaliacao14)) {
            System.out.println("erro - NAO deveria aceitar avaliacao14");
        }

        System.out.println("esperado = 0.0, atual = " + controlador.getMediaAvaliacoes());
        System.out.println("esperado = 0.0, atual = " + controlador.getMediaAvaliacoesPorProteina("animal"));
        System.out.println("esperado = 0.0, atual = " + controlador.getMediaAvaliacoesPorProteina("vegetal"));
        System.out.println("esperado = 0.0, atual = " + controlador.getMediaAvaliacoesPorTurno("almoco"));
        System.out.println("esperado = 0.0, atual = " + controlador.getMediaAvaliacoesPorTurno("jantar"));
        System.out.println("esperado = 0.0, atual = " + controlador.getMediaAvaliacoesPorData("02/04/2023"));
        System.out.println("esperado = , atual = " + controlador.getTodosComentarios());

        // adicionar validos
        if (controlador.adicionarAvaliacao(avaliacao1) == false) {
            System.out.println("erro - deveria aceitar avaliacao1");
        }
        if (controlador.adicionarAvaliacao(avaliacao2) == false) {
            System.out.println("erro - deveria aceitar avaliacao2");
        }
        if (controlador.adicionarAvaliacao(avaliacao3) == false) {
            System.out.println("erro - deveria aceitar avaliacao3");
        }
        if (controlador.adicionarAvaliacao(avaliacao5) == false) {
            System.out.println("erro - deveria aceitar avaliacao5");
        }
        if (controlador.adicionarAvaliacao(avaliacao6) == false) {
            System.out.println("erro - deveria aceitar avaliacao6");
        }
        if (controlador.adicionarAvaliacao(avaliacao8) == false) {
            System.out.println("erro - deveria aceitar avaliacao8");
        }
        if (controlador.adicionarAvaliacao(avaliacao9) == false) {
            System.out.println("erro - deveria aceitar avaliacao9");
        }
        if (controlador.adicionarAvaliacao(avaliacao11) == false) {
            System.out.println("erro - deveria aceitar avaliacao11");
        }
        if (controlador.adicionarAvaliacao(avaliacao12) == false) {
            System.out.println("erro - deveria aceitar avaliacao12");
        }
        if (controlador.adicionarAvaliacao(avaliacao13) == false) {
            System.out.println("erro - deveria aceitar avaliacao13");
        }

        // realizar processamentos
        System.out.println("esperado = 3.6, atual = " + controlador.getMediaAvaliacoes());
        System.out.println("esperado = 3.0, atual = " + controlador.getMediaAvaliacoesPorProteina("animal"));
        System.out.println("esperado = 4.5, atual = " + controlador.getMediaAvaliacoesPorProteina("vegetal"));
        System.out.println("esperado = 3.42, atual = " + controlador.getMediaAvaliacoesPorTurno("almoco"));
        System.out.println("esperado = 4.0, atual = " + controlador.getMediaAvaliacoesPorTurno("jantar"));
        System.out.println("esperado = 3.66, atual = " + controlador.getMediaAvaliacoesPorData("02/04/2023"));
        System.out.println("esperado = 0.0, atual = " + controlador.getMediaAvaliacoesPorData("05/04/2023"));
        System.out.println("deve imprimir 3 comentarios:\n atual = " + controlador.getTodosComentarios());

    }
}