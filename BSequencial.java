package aps;

import java.util.Random;

public class BSequencial
{
  public  void buscar(int numB,int numT)
  {
    //Criar um programa que faz uma busca sequencial.
    long tempoIR = System.currentTimeMillis();
    int [] x = new int[numT];
    Random num = new Random();
    for (int i = 0 ; i < x.length;++i)
    {
     x[i] = num.nextInt(numT)+0;
    }
   
    long tempoFR = System.currentTimeMillis();
    long tempoT = tempoFR - tempoIR;
    
    System.out.printf("\nO tempo de criação do vetor com os números aleatórios foi de: " + tempoT + " Milissegundos\n");
           
    boolean numE = false;
        
    long tempoIB = System.currentTimeMillis();
    
    System.out.printf("Número De busca é %s%n",numB);
   
    for(int i = 0 ; i < x.length; i++)
    {
     if(numB == x[i]){ System.out.printf("Numero encontrado, ele está na posição %s  ", i); numE = true; break;}
    }
   
    if(numE == false) System.out.println("Numero não está na lista");
    
    long tempoFB = System.currentTimeMillis();
    long tempoT1 = tempoFB - tempoIB;
    System.out.printf("\nO tempo de busca foi de: " + tempoT1 + " Milissegundos\n");
  }
    
  public void imprimir  (int num)
  {
    if(num ==1 )
    {
      System.out.println("\n\n1-Busca Sequencial\n2-Busca Binaria árvore rubro-negra");
    }
    
    else if(num == 2)
    { 
      System.out.println("1 - Buscar em um array com 1000 Números\n"
                       +"2 - Buscar em um array com 10000 Números\n"
                       +"3 - Buscar em um array com 100000 Números\n"
                       +"4 - Buscar em um array com 1000000 Números\n"
                       +"5 - Buscar em um array com 10000000 Números\n"
                       +"6 - Buscar em um array com 100000000 Números");
    }
    else
    {
      System.out.println("1 - Buscar em uma árvore rubro-negra com 1000 Números\n"
                        +"2 - Buscar em uma árvore rubro-negra com 10000 Números\n"
                        +"3 - Buscar em uma árvore rubro-negra com 100000 Números\n"
                        +"4 - Buscar em uma árvore rubro-negra com 1000000 Números\n"
                        +"5 - Buscar em uma árvore rubro-negra com 10000000 Números\n"
                        +"6 - Buscar em uma árvore rubro-negra com 100000000 Números");
      
      
    }
  }
}