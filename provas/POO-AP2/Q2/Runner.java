import java.util.ArrayList;
import java.util.Scanner;

// comandos para usar a interface do Runner.
// exit                   = sair do programa
// printAgenda [a]        = imprimir a agenda [a]
// newAgenda              = criar agenda
// addContato  [c] [a]    = adicionar contato c na agenda ad
// removeContato [n] [a]  = remover contato n (n é o nome do contato) da agenda [a]
// newContato [n]         = criar contato n (n é o nome do contato)
// addNumero [i] [n] [t]  = adicionar numero n e com identificador i para contato t (t é o nome do contato)



public class Runner {

    public static void main(String[] args) {
        ArrayList<Agenda> agendas = new ArrayList<>();
        ArrayList<Contato> contatos = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String in = "";
        System.out.println("comandos para usar a interface do Runner.\r\n" + 
                            "exit                   = sair do programa\r\n" + 
                            "printAgenda [a]        = imprimir a agenda [a]\r\n" +
                            "newAgenda              = criar agenda\r\n" + 
                            "addContato  [c] [a]    = adicionar contato c na agenda a\r\n" + 
                            "removeContato [n] [a]  = remover contato n (n \u00E9 o nome do contato) da agenda [a]\r\n" + 
                            "newContato [n]         = criar contato n (n \u00E9 o nome do contato)\r\n" + 
                            "addNumero [i] [n] [t]  = adicionar numero n e com identificador i para contato t (t \u00E9 o nome do contato)");
        while(true){
            in = input.nextLine();
            if(in.equalsIgnoreCase("exit")){
                break;
            }else{
                String comando[] = in.split(" ");
                // printAgenda [agenda]
                if(comando[0].equalsIgnoreCase("printAgenda")){
                    try{
                        Integer i = Integer.parseInt(comando[1]);
                        if(i < agendas.size()){
                            agendas.get(i).imprimirAgenda();
                        }else{
                            System.out.println("Agenda inexistente!");
                        }
                    }catch(NumberFormatException e){
                        System.out.println("Agenda inexistente!");
                    }
                } 
                // newAgenda
                else if(comando[0].equalsIgnoreCase("newAgenda")){
                    try {
                        agendas.add(new Agenda());
                        System.out.println("Agenda criada! index da agenda: " + (agendas.size()-1));
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                // addContato [index do contato] [index da agenda] 
                else if(comando[0].equalsIgnoreCase("addContato")){
                    try {
                        int indexCont = Integer.parseInt(comando[1]);
                        int indexAg = Integer.parseInt(comando[2]);
                        if(indexCont < contatos.size() && indexAg < agendas.size()){
                            agendas.get(indexAg).addContato(contatos.get(indexCont));
                            System.out.println("Contato adicionado!");
                        }else{
                            System.out.println("Agenda ou contato inexistente!");
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                // removeContato [nome] [agenda]
                else if(comando[0].equalsIgnoreCase("removeContato")){
                    try {
                        String nome = comando[1];
                        Integer agend = Integer.parseInt(comando[2]);
                        if(nome != null && agend < agendas.size()){
                            agendas.get(agend).removerContato(nome);
                            System.out.println("Contato removido!");
                        }else{
                            System.out.println("Agenda ou contato inexistente!");
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                // newContato [nome]
                else if(comando[0].equalsIgnoreCase("newContato")){
                    try{
                        String nome = comando[1];
                        if(nome != null){
                            contatos.add(new Contato(nome));
                            System.out.println("Contato criado! index do contato: " + (contatos.size()-1));                        
                        }else{
                            System.out.println("Nome nao pode ser vazio!");
                        }
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                    
                }
                // addNumero [identificador] [numero] [contato]
                else if(comando[0].equalsIgnoreCase("addNumero")){
                    try {
                        String identificador = comando[1];
                        String numero = comando[2];
                        String nome = comando[3];
                        for (Contato c : contatos) {
                            if(c.nome.equalsIgnoreCase(nome)){
                                c.addNumero(identificador, numero);
                                System.out.println("Numero adicionado!");
                                break;
                            }
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                // help
                else if(comando[0].equalsIgnoreCase("help")){
                    System.out.println("comandos para usar a interface do Runner.\r\n" + 
                            "exit                   = sair do programa\r\n" + 
                            "printAgenda [a]        = imprimir a agenda [a]\r\n" +
                            "newAgenda              = criar agenda\r\n" + 
                            "addContato  [c] [a]    = adicionar contato c na agenda a\r\n" + 
                            "removeContato [n] [a]  = remover contato n (n \u00E9 o nome do contato) da agenda [a]\r\n" + 
                            "newContato [n]         = criar contato n (n \u00E9 o nome do contato)\r\n" + 
                            "addNumero [i] [n] [t]  = adicionar numero n e com identificador i para contato t (t \u00E9 o nome do contato)");
                }else{
                    System.out.println("Comando inexistente!");
                }
            }
        }
    }
}