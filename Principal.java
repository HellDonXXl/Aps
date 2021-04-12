package aps;

import java.util.Scanner;

public class Principal
{
  
  public static void main(String[] args)
  {
    BSequencial bs;
    bs = new BSequencial();
    Scanner scanner = new Scanner(System.in);
    boolean loop = true;
    int op, op2, num;

    do 
    {
      bs.imprimir(1);
      System.out.print("Digite sua opção: ");
      op = Integer.parseInt(scanner.nextLine());

      switch (op) 
      {
        case 1:
          System.out.println("Busca Sequencial");
          bs.imprimir(2);
          System.out.print("Digite sua opção:");
          op2 = Integer.parseInt(scanner.nextLine());

          switch (op2) 
          {
            case 1:
              System.out.print("Digite o número:");
              num = Integer.parseInt(scanner.nextLine());
              bs.buscar(num, 1_000);
            break;

            case 2:
              System.out.print("Digite o número:");
              num = Integer.parseInt(scanner.nextLine());
              bs.buscar(num, 10_000);
            break;
            
            case 3:
              System.out.print("Digite o número:");
              num = Integer.parseInt(scanner.nextLine());
              bs.buscar(num, 100_000);
            break;
            
            case 4:
              System.out.print("Digite o número:");
              num = Integer.parseInt(scanner.nextLine());
              bs.buscar(num, 1_000_000);
            break;
            
            case 5:
              System.out.print("Digite o número:");
              num = Integer.parseInt(scanner.nextLine());
              bs.buscar(num, 10_000_000);
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

          switch (op2) 
          {
            case 1:
              System.out.print("Digite o número:");
              num = Integer.parseInt(scanner.nextLine());
              arvoreBuscar(num, 1_000);
            break;
            
            case 2:
              System.out.print("Digite o número:");
              num = Integer.parseInt(scanner.nextLine());
              arvoreBuscar(num, 10_000);
            break;
            
            case 3:
              System.out.print("Digite o número:");
              num = Integer.parseInt(scanner.nextLine());
              arvoreBuscar(num, 100_000);
            break;
            
            case 4:
              System.out.print("Digite o número:");
              num = Integer.parseInt(scanner.nextLine());
              arvoreBuscar(num, 1_000_000);
            break;
            
            case 5:
              System.out.print("Digite o número:");
              num = Integer.parseInt(scanner.nextLine());
              arvoreBuscar(num, 10_000_000);
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
    } while (loop);
  }

  public static void arvoreBuscar(int num1, int numR)
  {
    long tempoIR = System.nanoTime();

    ArvoreRN arvore = new ArvoreRN();
    arvore.raiz = arvore.empty; // inicia a arvore sempre vazia, foi uma forma que encontrei para sempre iniciar nulo em um do while

    for (int i = 0; i < numR; ++i) 
    {
      int num = 1 + (int) (Math.random() * numR); 

      arvore.inserir(num); // adicionar número aleatorio na arvore
    }


    long tempoFR = System.nanoTime();
    double tempoT = (tempoFR - tempoIR)/1_000_000_000.0;
    System.out.printf("\nO tempo de criação da arvore rubro-negro com os números aleatórios foi de: " + tempoT + " segundos\n");

    long tempoIB = System.nanoTime();
    arvore.mostrar(num1); // buscar o número na arvore

    long tempoFB = System.nanoTime();
    double tempoT1 = (tempoFB - tempoIB)/ 1_000_000_000.0;
    System.out.printf("\nO tempo de busca foi de: " + tempoT1 + " segundos\n");
  }
}

