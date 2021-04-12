package aps;

public class BSequencial {

  public void buscar(int numB, int numT) {
   
    long t1 = System.nanoTime();
    int[] x = new int[numT];
    for (int i = 0; i < x.length; i++) {
      int num = 1 + (int) (Math.random() * numT); // gerar um número aleatorio 
      x[i] = num;
    }

    long t2 = System.nanoTime();
    double tempoT = (t1 - t2) / 1_000_000_000.0; //tempo em segundos

    System.out.printf("\nO tempo de criação do vetor com os números aleatórios foi de: " + tempoT + "segundos\n");

    boolean numE = false; 

    long tempoIB = System.nanoTime();

    System.out.printf("Número De busca é %s%n", numB);

    for (int i = 0; i < x.length; i++) 
    {
      if (numB == x[i]) // operação que vai buscar o número
      {
        System.out.printf("Numero encontrado, ele está na posição %s  ", i);
        numE = true;
        break;
      }
    }

    if (numE == false) // para saber que encontro ou não, pelo if (numE == false)
    {
      System.out.println("Numero não está na lista");
    }

    long tempoFB = System.nanoTime();
    double tempoT1 =  (tempoFB - tempoIB)/ 1_000_000_000.0;
    System.out.printf("\nO tempo de busca foi de: " + tempoT1 + " Milissegundos\n");
  }

  public void imprimir (int num) // mostrar na tela
  {
    switch (num) 
    {
      case 1:
        System.out.println("\n\n1-Busca Sequencial\n2-Busca Binaria árvore rubro-negra");
      break;
      case 2:
        System.out.println("1 - Buscar em um array com 1000 Números\n"
                + "2 - Buscar em um array com 10000 Números\n"
                + "3 - Buscar em um array com 100000 Números\n"
                + "4 - Buscar em um array com 1000000 Números\n"
                + "5 - Buscar em um array com 10000000 Números");
      break;
      default:
        System.out.println("1 - Buscar em uma árvore rubro-negra com 1000 Números\n"
                + "2 - Buscar em uma árvore rubro-negra com 10000 Números\n"
                + "3 - Buscar em uma árvore rubro-negra com 100000 Números\n"
                + "4 - Buscar em uma árvore rubro-negra com 1000000 Números\n"
                + "5 - Buscar em uma árvore rubro-negra com 10000000 Números");
      break;
    }
  }
}