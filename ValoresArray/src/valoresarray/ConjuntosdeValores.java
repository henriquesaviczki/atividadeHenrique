/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valoresarray;
import java.util.Scanner;
        

public class ConjuntosdeValores {

    int[] valores;
    double somatorio;
    
    public ConjuntosdeValores(int i){
        valores = new int[i];
    }
    
    public void cadastrar(int endereco, int valor){
        valores[endereco] = valor;
    }
    
    public int maiorValor(){
        for (int i =0; i< 10; i++){
            
        }
        return 0;
    }
    
    public int menorValor(){
        for (int i= 0; i< 10; i++){
            
        }
        return 0;
    }
    
    public double Media(){
        for (int i= 0; i< valores.length; i++){
            somatorio += valores[i];
        }
        return somatorio / valores.length;
    }

 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao = 0;
        int espacos;
        int valor;
        System.out.println("Entre a quantidade de valores:");
        espacos = entrada.nextInt();
        ConjuntosdeValores conjunto = new ConjuntosdeValores(espacos);
        
        while (true) {
            System.out.println("0  Menu");
            System.out.println("1-----  Cadastrar Valor");
            System.out.println("2-----  Maior Valor");
            System.out.println("3-----  Menor Valor");
            System.out.println("4-----  Ler Média");
            System.out.println("5-----  Sair");
            opcao = entrada.nextInt();
            
            switch (opcao) {
                case 0:
                    System.out.println("Menu");
                    break;
                case 1:
                    System.out.println("Cadastrar Valor");
                    for (int i = 0; i < espacos; i++) {
                        System.out.println("Entre o número " + (i + 1) + ":");
                        valor = entrada.nextInt();
                        conjunto.cadastrar(i, valor);
                    }
                    break;
                case 2:
                    System.out.println("Maior Valor");
                    System.out.println( conjunto.maiorValor());
                    break;
                case 3:
                    System.out.println("Menor Valor");
                    System.out.println( conjunto.menorValor());
                    break;
                case 4:
                    System.out.println("Ler Média");
                  
                    System.out.println( conjunto.Media() 
                    );
                        
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("opção invalida");

            }
        }
        
    }
    
}
