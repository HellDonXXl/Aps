package aps;

import java.util.Random;
import java.util.Scanner;

public class Principal
{
  public static void main(String[] args)
  { 
    
    BSequencial bs;
    bs = new BSequencial();
    
    Scanner scanner = new Scanner(System.in);
    boolean loop = true;
    int op,op2,num;
  
    do
    {
      bs.imprimir(1);
      System.out.print("Digite sua opção: ");
      op = Integer.parseInt(scanner.nextLine());
      
      switch (op) {
        case 1:
          System.out.println("Busca Sequencial");
          bs.imprimir(2);
          System.out.print("Digite sua opção:");
          op2 = Integer.parseInt(scanner.nextLine());
          
            switch(op2)
            {
              case 1:
               System.out.print("Digite o número:");
               num = Integer.parseInt(scanner.nextLine());
               bs.buscar(num,1000);
              break;
              case 2:
               System.out.print("Digite o número:");
               num = Integer.parseInt(scanner.nextLine());
               bs.buscar(num, 10000);
              break;
              case 3:
               System.out.print("Digite o número:");
               num = Integer.parseInt(scanner.nextLine());
               bs.buscar(num, 100000);
              break;
              case 4:
               System.out.print("Digite o número:");
               num = Integer.parseInt(scanner.nextLine());
               bs.buscar(num, 1000000);
              break;
              case 5:
               System.out.print("Digite o número:");
               num = Integer.parseInt(scanner.nextLine());
               bs.buscar(num, 10000000);
              break;
              case 6:
               System.out.print("Digite o número:");
               num = Integer.parseInt(scanner.nextLine());;
               bs.buscar(num,100000000);
              break;
              default:
               System.out.println("opção não encontrada");
               loop = false;
              break;
            }
        break;
        case 2:
          System.out.println("\n\n Busca Binaria árvore rubro-negra");
          bs.imprimir(3);
          System.out.print("Digite sua opção:");
          op2 = Integer.parseInt(scanner.nextLine());
          
            switch(op2)
            {
              case 1:
               System.out.print("Digite o número:");
               num = Integer.parseInt(scanner.nextLine());
               buscar(num,1000);
              break;
              case 2:
               System.out.print("Digite o número:");
               num = Integer.parseInt(scanner.nextLine());
               buscar(num,10_000);
              break;
              case 3:
               System.out.print("Digite o número:");
               num = Integer.parseInt(scanner.nextLine());
               buscar(num,100_000);
              break;
              case 4:
               System.out.print("Digite o número:");
               num = Integer.parseInt(scanner.nextLine());
               buscar(num,1_000_000);
              break;
              case 5:
               System.out.print("Digite o número:");
               num = Integer.parseInt(scanner.nextLine());
               buscar(num,10_000_000);
              break;
              case 6:
               System.out.print("Digite o número:");
               num = Integer.parseInt(scanner.nextLine());;
               buscar(num,100_000_000);
              break;
              default:
               System.out.println("opção não encontrada");
               loop = false;
              break;
            }
        break;
        default:
          System.out.println("opção não encontrada ");
          loop = false;
        break;
      }
    }
    while(loop);
  }
  public static void  buscar(int num1,int numR)
  { 
    long tempoIR = System.currentTimeMillis();
    
    ArvoreRN arvore = new ArvoreRN();
    arvore.raiz =  arvore.empty; 
    
    Random num = new Random();
   
    
    
    
    for(int i = 0 ; i < numR;i++)
    {
     int r = num.nextInt(numR)+1;
     arvore.inserir(r);
     
    }
 
   
    
    long tempoFR = System.currentTimeMillis();
    long tempoT = tempoFR - tempoIR;
    System.out.printf("\nO tempo de criação da arvore rubro-negro com os números aleatórios foi de: " + tempoT + " Milissegundos\n");
    
    long tempoIB = System.currentTimeMillis(); 
    arvore.mostrar(num1);
    
    long tempoFB = System.currentTimeMillis();
    long tempoT1 = tempoFB - tempoIB;
    System.out.printf("\nO tempo de busca foi de: " + tempoT1 + " Milissegundos\n");
  }
}   
          