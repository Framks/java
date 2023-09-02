import java.io.IOException;

class Runner{
    public static void main(String[] args){
        
        try {
            Leitor l = new Leitor("texto.txt");
            System.out.println(l.getTexto());
        } catch ( IOException e) {
            System.out.println("file not found, resetting score.");
        } 
    }
}