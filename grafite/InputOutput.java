
import java.util.Scanner;

public class InputOutput {
    private Scanner scanner;

    public InputOutput(){
        this.scanner = new Scanner(System.in);
    }

    public String input()           { 
        return scanner.nextLine();    
    }

    public void write(String value) { 
        System.out.println(value);    
    }

    public void close(){
        this.scanner.close();
    }

    public Integer stringToInt(String input){
        return Integer.parseInt(input);
    }

    public float stringTofloat(String input){
        return Float.parseFloat(input);
    }
}
