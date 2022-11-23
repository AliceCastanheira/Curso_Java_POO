
package aula02.pkg1;


public class Mouse {
        
    //Atributos
    String cor;
    int botao;
    boolean clique;
    
    void status()
    {
        System.out.println("O mouse e da cor " + this.cor);  
        System.out.println("O mouse tem " + this.botao + " botoes");
    }
    void conectado()
    {
        if (this.clique == true){
          System.out.println("Posso clicar");
      } else {
          System.out.println("ERRO: Nao posso clicar pois estou desligado");
      }   
    }
    void ligado()
    {
      this.clique = true;
    }
    void desligado()
    {
      this.clique = false;
    }
}
