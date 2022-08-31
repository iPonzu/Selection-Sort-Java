import java.io.File;    
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class source {
    public static void main(String[] args) {
         
    System.out.println("Atividade com Selection Sort");
        String numeros = new String();
        String arq = "C:/Users/João/OneDrive/Área de Trabalho/Java/listaNumeros.txt";
       
        File scan = new File (arq);

        while(scan.exists()){
            try{
                FileReader ler = new FileReader(arq);
                BufferedReader bufferReader = new BufferedReader(ler);
            } catch (IOException e) {
                System.out.println("Erro, tente novamente!");
            }
        }
       
    }
}