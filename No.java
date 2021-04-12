package aps;

public class No
{
  int valor;
  No esq,dir,pai; // uma arvore binaria RN é balanceada por esquerda e direita cada numero sem ser a raiz tem um "pai" 
  Cor cor; // é separado organizado pela cor também
  
  public No ()
  {
    valor = 0;
    esq = dir = pai = null; // inicia nulo
    cor = Cor.preto; // o primeiro número que é a raiz é preto
  }
  
  public No (int dado)
  {
    this.valor = dado;
    esq = dir = pai = null;
    cor = Cor.preto;
  }
}
  

  
  
