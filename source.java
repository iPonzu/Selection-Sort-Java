import java.io.File;    
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.nio.channels.SelectionKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.function.Function;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class source {
    private static int i;

    public static void main(String[] args) {
         
    System.out.println("Atividade com Selection Sort");

        String numeros = new String();
        String arq = "C:/Users/João/OneDrive/Área de Trabalho/Java/listaNumeros.txt"; // string indicatido de diretório

        File file = new File (arq);

        if(file.exists()){ 
            try{
                FileReader ler = new FileReader(arq); 
                BufferedReader bufferReader = new BufferedReader(ler); // leitura do arquivo 
                int linhas = 0;
                while(bufferReader.readLine() != null) { // leitura do arquivo até ele se tornar nulo
                    linhas++;
                }
                bufferReader.close();                                   

                int[] lista = new int[linhas];
                ler = new FileReader(arq); // ler arquivo designado
                bufferReader = new BufferedReader(ler); // relendo o arquivo
                linhas = 0;
                String linha = ""; // leitura linha por linha do arquivo de texto
                while((linha = bufferReader.readLine()) != null) { // ler até se tornar nulo (fim das linhas)
                    lista[linhas] = Integer.parseInt(linha); // conversão para int
                    linhas++;
                }
                bufferReader.close(); // fecha reader
                System.out.println("Array desordenado: ");
                System.out.println(Arrays.toString(lista)); // conversão de array para string
                SortedSet<Integer> list = new TreeSet<Integer>(); // metodo selection
                for (int i = 0; i < lista.length; i++){
                    list.add(lista[i]);
                }
                System.out.println();

                System.out.println("Ordenação: ");    // ordenação da lista
                int n = lista.length;
                for (int i = 0; i < n - 1; i++)
                    for (int j = 0; j < n - i - 1; j++)
                    if (lista[j] > lista[j + 1]) {
                        // troca de lista lista[j+1] and lista[j]
                        int temp = lista[j];
                        lista[j] = lista[j + 1];
                        lista[j + 1] = temp;

                    System.out.println(Arrays.toString(lista)); // impressão da ordem
                
                }


                System.out.println("Collection ordenada: ");
                System.out.println(list); // imprime lista
                 

                for(int i = 0; i< lista.length; i++){
                    int min = i;

                    for(int j = i + 1; j <lista.length; j++){
                        if(lista[j] < lista[min]){
                            min = j;
                        }
                    }
                    if(i != min){
                        int temp = lista[i];
                        lista[i] = lista[min];
                        lista[min] = temp;
                    }
                }

                System.out.println("Array ordenado: ");
                System.out.println(Arrays.toString(lista));
               
            } catch (IOException e) {
                System.out.println("Erro, tente novamente!" + e.getMessage()); //"mostra o erro junto com a mensagem"
            }
            
        }
         
    }
}


