package atividade1;
import java.util.Scanner;

public class atividade1 {
    
    public int[] valor;
    
    
    
    public void VerificaMaior(int valorMaior){
        
    }
    public void VerificaMenor(int valorMenor){
        
    }
    
    public void VerificaMedia(int ValorMedia){
        
    }
    
    public void AdicionarNovoValor(int valor){
        
    }
    
    
    public class Operacao {
        
        
        public int CadastrarValor;
        public int BuscarMaior;
        public int BuscaMenor;
        public int AdicionarNovoValor;
        
    }
    
        
   
    
    
    
    public static void main(String[]args){
         Scanner input = new Scanner(System.in);
         
         int opcao;
         int i;
         
         Opcoes[] opcoes = new Opcoes[5];
         
         System.out.println("");
         
         System.out.println("=====MENU=====");
         
         System.out.println("1. Cadastrar Valor");
                 
         System.out.println("2. Buscar Maior");
         
         System.out.println("3. Buscar Menor");
         
         System.out.println("4. Ler Media");        
         
         System.out.println("5. sair");
         
         System.out.println("Digite a opcao desejada");
         
         opcao = input.nextInt();
         
         System.out.println("");
         
         if(opcao == 1){
             for(int i=0; i<5; i++){
                 
             System.out.println("_____Cadastros de Valores____" +(i+1)+"____");
             
             System.out.println("Valor 1: "); float valor1 = input.nextFloat();
             
             System.out.println("Valor 2: "); float valor2 = input.nextFloat();
             
             System.out.println("Valor 3: "); float valor3 = input.nextFloat();
             }
             }
             
         if(opcao == 2){
               System.out.println("____Buscar Maior____");
               System.out.println();
             }
             
         if(opcao == 3){
               System.out.println("____Buscar Menor____");    
               System.out.print("");
             
         }
         if(opcao == 4){
               System.out.println("Sair");
          
         }
         if(opcao >= 5){
               System.out.println("(x) Opcao invalida");
    }
    }
