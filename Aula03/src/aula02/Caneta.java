
package aula02;
public class Caneta {
    
    //Atributos
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    public void status(){
        System.out.println("Uma caneta com o modelo " + this.modelo);
        System.out.println("Uma caneta da cor " + this.cor);  
        System.out.println("Uma caneta com a ponta " + this.ponta);
        System.out.println("Uma caneta com a carga  " + this.carga);
        System.out.println("Uma caneta esta tampada? " + this.tampada);
    }
    //Métodos
    public void rabiscar() 
    {
      if (this.tampada == true){
          System.out.println("ERRO: Nao posso rabiscar");
      } else {
          System.out.println("Estou Rabiscando");
      }
    }
    public void tampar()
    {
      this.tampada = true;
    }
    public void destampar()
    {
      this.tampada = false;
    }
}
