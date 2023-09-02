public class Runner {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        Contato c1 = new Contato("Joao");

        c1.addTelefone("identificador", "numero");
        c1.addTelefone("identificador2", "numero2");
        agenda.addContato(c1);
        
        Contato c2 = new Contato("Joao");
        c2.addTelefone("identificador", "numero");

        agenda.addContato(c2); // erro

        Contato c3 = new Contato("maria");
        agenda.addContato(c3); // erro

        Contato c4 = new Contato("tico");
        c4.addTelefone("identificador", "numero");

        Contato c5 = new Contato("ana");
        c5.addTelefone("identificador", "numero");
        
        agenda.addContato(c4);
        agenda.addContato(c5);

        System.out.println("Contatos: ana, joao, maria, tico" + agenda.imprimir());
        
        agenda.removerContato("joao");
        System.out.println("Contatos: ana, maria, tico" + agenda.imprimir());

        agenda.addContato(c2);
        System.out.println("Contatos: ana, joao, maria, tico" + agenda.imprimir());

    }
}