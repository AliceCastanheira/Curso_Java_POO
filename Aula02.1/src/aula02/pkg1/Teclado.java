
package aula02.pkg1;

public class Teclado {
        
    //Atributos
    String cor;
    int teclado;
    boolean escrever;
    
    void status()
    {
        System.out.println("O teclado e da cor " + this.cor);  
        System.out.println("O teclado tem " + this.teclado + " letras");
    }
    void conectado()
    {
        if (this.escrever == true){
          System.out.println("Digitando...");
      } else {
          System.out.println("ERRO: Nao posso digitar pois estou desligado");
      }   
    }
    void ligado()
    {
      this.escrever = true;
    }
    void desligado()
    {
      this.escrever = false;
    }

}
