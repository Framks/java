import java.util.List;
import java.util.ArrayList;

/**
 *  Agenda();
 *  addContato(Contato novo) : void
 *  removeContato(String nome) : void
 *  imprimirAgenda() : void
 */

public class Agenda {
    public List<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<Contato>();
    }

    // Adiciona um contato se ele não existir e se ele tiver numero.
    // caso ela exista lança uma exceção e não adiciona.
    public void addContato(Contato novo) {
        for (Contato c : contatos) {
            if(c.nome.equals(novo.nome)){
                throw new IllegalArgumentException("Contato ja existe");
            }
        }
        if (novo.numeros.isEmpty()) {
            throw new IllegalArgumentException("Numero nao pode ser vazio");
        }
        this.contatos.add(novo);
    }

    // imprimir a agenda de contatos com os idetificadores e os numeros.
    // ordenado de forma alfabetica.
    public void imprimirAgenda(){
       for (Contato c : contatos) {
            System.out.println(c.imprimir());
       }
    }

    // Remove um contato passando o identificador. que é o nome dele
    public void removerContato(String nome){
        if(nome == null){
            throw new IllegalArgumentException("Nome nao pode ser vazio");
        }
        for (Contato c : contatos) {
            if(c.nome.equals(nome)){
                contatos.remove(c);
            }
        }
    }
}
