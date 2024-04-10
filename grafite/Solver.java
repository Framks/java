
public class Solver {
    public static void main(String args[]) {
        ControladorLapizeira controlador = new ControladorLapizeira(new Pencil(0.5f));
        InputOutput inOut = new InputOutput();
        while (true) {
            String line = inOut.input();
            String[] entrada = line.split(" ");
            inOut.write('$' + line);

            if("end".equals(entrada[0])   ){
                break;
            }
            else if("init".equals(entrada[0])  ){
                // iniciar uma lapezeira nova
                controlador.setPincel(new Pencil(inOut.stringTofloat(entrada[1])));
            }
            else if("insert".equals(entrada[0])){ 
                // inserir um grafite la lapiseira
                controlador.insertGrafite(new Grafite(inOut.stringTofloat(entrada[1]),
                                                      entrada[2],
                                                      inOut.stringToInt(entrada[3])
                                                    )
                                          );
            }
            else if("remove".equals(entrada[0])){ 
                // remover o grafite atual
                controlador.removeGrafite();
            }
            else if("write".equals(entrada[0]) ){ 
                // escrever na pagina
                controlador.write();
            }
            else if("show".equals(entrada[0])  ){ 
                // mostrar na tela 
                inOut.write(controlador.showPencil());
            }
        }
    }
}
