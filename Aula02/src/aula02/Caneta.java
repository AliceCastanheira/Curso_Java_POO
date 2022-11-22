
package aula02;
public class Caneta {
    
    //Atributos
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("Uma caneta da cor " + this.cor);  
        System.out.println("Uma caneta com o modelo " + this.modelo);
        System.out.println("Uma caneta com a ponta " + this.ponta);
        System.out.println("Uma caneta com a carga  " + this.carga);
        System.out.println("Uma caneta esta tampada? " + this.tampada);
    }
    //Métodos
    void rabiscar() 
    {
      if (this.tampada == true){
          System.out.println("ERRO: Nao posso rabiscar");
      } else {
          System.out.println("Estou Rabiscando");
      }
    }
    void tampar()
    {
      this.tampada = true;
    }
    void destampar()
    {
      this.tampada = false;
    }
}
