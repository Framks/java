public class Runner{

    public static void main(String[] args) {
        Historico navegador = new Historico();
        if(navegador.voltar() != null){
            System.out.println("1-erro, não era pra voltar");
        }else{
            System.out.println("1-ok");
        }
        navegador.visitar("https://www.google.com");
        navegador.visitar("https://www.facebook.com");
        if(navegador.voltar() != ""){
            System.out.println("2-ok");
        }else{
            System.out.println("2-erro, era pra ta retornando algo");
        }
        if(navegador.avancar() != ""){
            System.out.println("3-ok");
        }else{
            System.out.println("3-erro, era pra ta retornando algo");
        }
    }
}