/**
 * @Author: Francisco Gabriel Alves Nunes, Matricula: 497357 
 * @Date: 11/11/2022
 * @Description: classe Tentativa, que armazena a tentativa e os acertos de cada jogada
 * @Version: unica
 * 
 */

public class Tentativa {
    private String chute;
    private String acertos;

    public Tentativa(String chute){
        this.chute = chute;
    }

    //verifica as letras que foram acertadas e as que foram erradas
    public void calcularAcertos(String palavraSecreta){
        if(chute.equalsIgnoreCase(palavraSecreta)){
            this.acertos = "+++++";
        }else{
            this.acertos = "";
            char [] chuteArray = this.chute.toCharArray();
            char [] palavraSecretaArray = palavraSecreta.toCharArray();
            char [] result =  new char[5];
            for (int i = 0; i < 5; i++) {
                result[i] = '*';
                for(int j = 0; j < 5; j++){
                    if(chuteArray[i] == palavraSecretaArray[j]){
                        if(i == j){
                            result[i] = '+';
                        }else if(i != j){
                            result[i] = '-';
                        }
                    }
                }                             
            }
            this.acertos = new String(result);
        }
    }

    // retorna o resultado do chute
    public String getacertos(){
        return this.acertos;
    }

}