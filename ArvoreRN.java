package aps;

public class ArvoreRN 
{
  No raiz,empty;
  
  public ArvoreRN()
  {
    empty = new No();
    raiz = empty;
  }
  
  void rotacaoEsq(No x)
  { 
    No y = x.dir;
    x.dir = y.esq;
    
    if(y.esq != empty)y.esq.pai = x;
    
    y.pai = x.pai;
    
    if(x.pai == empty) raiz = y;
    else
    {
      if(x == x.pai.esq)x.pai.esq = y;
      else x.pai.dir = y;
    }
    y.esq = x;
    x.pai = y;
  }
       
  void rotacaoDir(No y)
  {
    No x = y.esq;
    y.esq = x.dir;
    
    if(x.dir != empty)x.dir.pai = y;
    
    x.pai = y.pai;
    
    if(y.pai == empty)raiz = x;
    else
    {
      if(y == y.pai.esq)y.pai.esq = x;
      else y.pai.dir = x;
    }
    x.dir = y;
    y.pai = x;
  }
      
  void inserir(int valor)
  {
    No ant,p;
    ant = empty;
    p = raiz;
    
    while(p != empty)
    {
      ant = p;
      
      if(valor < p.valor)p = p.esq;
      else if (valor > p.valor)p = p.dir;
      else if (valor == p.valor)return;
    }
      
    No novo =new No(valor);
    novo.pai = ant;
    novo.esq = novo.dir = empty;
    novo.cor = Cor.vermelho;
      
    if(raiz == empty)raiz = novo;
    else
    {
      if(valor < ant.valor)ant.esq = novo;
      else ant.dir = novo;
    }
    restauraPropriedade(novo);
  }

  void restauraPropriedade(No x) 
  {
    No y;
    
    while(x.pai.cor == Cor.vermelho)
    {
      if(x.pai == x.pai.pai.esq)
      {
        y = x.pai.pai.dir;
        if(y.cor == Cor.vermelho) //CASO 1
        {
         y.cor = Cor.preto;
         x.pai.cor = Cor.preto;
         x.pai.pai.cor = Cor.vermelho;
         x = x.pai.pai;
        }
        else
        {
          if(x == x.pai.dir) //CASO 2 
          {
            x = x.pai;
            rotacaoEsq(x);
          }
          x.pai.cor = Cor.preto; //caso 3
          x.pai.pai.cor = Cor.vermelho;
          rotacaoDir(x.pai.pai);
        }
      }
      else
      {
        y = x.pai.pai.esq;
         
        if(y.cor == Cor.vermelho) //CASO 1
        {
          y.cor = Cor.preto;
          x.pai.cor = Cor.preto;
          x.pai.pai.cor = Cor.vermelho;
          x = x.pai.pai;
        }
        else
        {
          if(x == x.pai.esq) //caso 2
          {
            x = x.pai;
            rotacaoDir(x);
          }
          x.pai.cor = Cor.preto; //caso 3
          x.pai.pai.cor = Cor.vermelho;
          rotacaoEsq(x.pai.pai);
        }
      }
    }
    raiz.cor = Cor.preto;
  }
           
  public No buscar(int dado) 
  { 
    return buscar(new No(dado), raiz);
  }
      
  private No buscar(No no, No no2)
  {
    if (raiz == empty)return null;
    if (no.valor < no2.valor)
    {
      if (no2.esq != empty)return buscar(no, no2.esq);
    }
    else if (no.valor > no2.valor) 
    {
      if (no2.dir != empty)return buscar(no, no2.dir);
    } 
    else if (no.valor == no2.valor)return no2;
    return null;
  }
     
  public int altura (No r)
  {
   if (r == empty) return -1; // altura da árvore vazia
   else 
   {
      int he = altura (r.esq);
      int hd = altura (r.dir);
      if (he < hd) return hd + 1;
      else return he + 1;
   }
  } 
    
  void mostrar(int x)
  {
    No a = buscar(x);
    if(a == null)System.out.println("Número não está na raiz");
    else
    {
      int d = altura(a);
      int s = altura(raiz);
      System.out.println("O Número é: " + a.valor + "\nA cor é: " + a.cor + "\nNa altura: " + d  +" de uma arvore com altura de " + s );
    }
  }
}
  
