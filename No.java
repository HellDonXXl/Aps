package aps;

public class No
{
  int valor;
  No esq,dir,pai;
  Cor cor;
  
  public No ()
  {
    valor = 0;
    esq = dir = pai = null;
    cor = Cor.preto;
  }
  
  public No(int dado)
  {
    this.valor = dado;
    esq = dir = pai = null;
    cor = Cor.preto;
  }
}
  

  
  
