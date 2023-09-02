/**
 * @Author: Francisco Gabriel Alves Nunes, Matricula: 497357 
 * @Date: 11/11/2022
 * @Description: classe Dicionario, ela é a classe responsavel por retornar uma 
 *               palavra aleatoria e verificar se a palavra da jogada existe
 * @Version: unica
 * 
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.ArrayList;

public class Dicionario {
    private ArrayList<String> palavras;

    // se não for possivel ler o arquivo, ele retorna uma exceção
    public Dicionario(String nomeArquivo) throws IOException {
        palavras = new ArrayList<>();
        try {
            palavras = lerArquivo(nomeArquivo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // pega uma palavra aleatoria do dicionario. 
    // retorna a palavra aleatoria
    public String getAleatorio(){
        Random numeroRandomico = new Random();
        numeroRandomico.setSeed(System.currentTimeMillis());
        Integer indice= numeroRandomico.nextInt(palavras.size());
        return palavras.get(indice);
    }

    // checa se a palavra existe dentro do dicionario
    public Boolean checarExistencia(String tentativa){
        if (tentativa == null) {
            return false;
        }
        return palavras.contains(tentativa);
    }

    // esta ler o arquivo e retorna um arraylist de strings com as palavras de dentro do arquivo
    private ArrayList<String> lerArquivo(String nomeArquivo) throws IOException {
        ArrayList<String> teste = new ArrayList<>();
        try (BufferedReader buff = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha = "";
            while ((linha = buff.readLine()) != null) {
                teste.add(linha);
            }
            buff.close();
        }
        return teste;
    }
}
