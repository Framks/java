/**
 * @Author: Francisco Gabriel Alves Nunes, Matricula: 497357 
 * @Date: 11/11/2022
 * @Description: classe Letrexto onde se encontra a main para executar o programa
 * @Version: unica
 * 
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Letrexto {
    public static void main(String[] args) {
        ArrayList<Tentativa> palavras = new ArrayList<Tentativa>();
        Integer numTentativas = 1;
        Dicionario dicionario;
        String palavraSecreta;
        Scanner ler;
        try {
            dicionario = new Dicionario("br_utf8.txt");
            ler = new Scanner(System.in);
            System.out.println("=====================");
            System.out.println("BEM-VINDO AO LETREXTO");
            System.out.println("=====================");
            System.out.println("Instru\u00E7\u00F5es:");
            System.out.println("- O computador escolher\u00E1 uma palavra aleat\u00F3ria de cinco letras.");
            System.out.println("- Voc\u00EA tem seis tentativas para adivinhar a palavra.");
            System.out.println("- Ap\u00F3s cada palpite, voc\u00EA receber\u00E1 feedback sobre o seu palpite:");
            System.out.println("\t - Um \"+\" indica uma letra correta na posi\u00E7\u00E3o correta.");
            System.out.println("\t - Um \"-\" indica uma letra correta na posi\u00E7\u00E3o errada.");
            System.out.println("\t - Um \"*\" indica uma letra incorreta.");
            System.out.println("\n Vamos come\u00E7ar!\n");
            
            palavraSecreta = dicionario.getAleatorio();
            while(numTentativas <= 6){
                System.out.print("Digite palpite #"+numTentativas+": ");
                String tentativa = ler.nextLine();
                if(dicionario.checarExistencia(tentativa)){
                    palavras.add(new Tentativa(tentativa));
                    palavras.get(numTentativas-1).calcularAcertos(palavraSecreta);
                    if(palavras.get(numTentativas-1).getacertos() == "+++++"){
                        numTentativas++;
                        break;
                    }else{
                        System.out.println("Palpite:\t" + tentativa);
                        System.out.println("resultado:\t"+ palavras.get(numTentativas-1).getacertos()+"\n");
                    }
                    numTentativas++;
                }else{
                    System.out.println("Digite uma palavra valida!");
                }
            }
            if(palavras.get(numTentativas-2).getacertos() == "+++++"){
                System.out.println("Parab\u00E9ns! Voc\u00EA adivinhou a palavra \""+palavraSecreta+"\" corretamente!");
            }else{
                System.out.println("A palavra secreta era \""+palavraSecreta+"\"!");
            }
            System.out.println("Obrigado por jogar Letrexto!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }
}