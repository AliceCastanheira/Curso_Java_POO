
package aula02;

public class Aula02 {

    public static void main(String[] args) 
    {
     Caneta c1 = new Caneta();    //Objeto está instaciado
     
     c1.cor = "Azul";
     c1.ponta = 0.5f;
     c1.modelo = "Big";
     c1.carga = 10;
     
     c1.status();
     c1.tampar();
     c1.rabiscar();
     
     Caneta c2= new Caneta();
     c2.cor = "Vermelho";
     c2.ponta = 0.10f;
     c2.modelo = "Compacto";
     c2.carga = 7;
     
     c2.status();
     c2.destampar();
     c2.rabiscar();
     
     Caneta c3= new Caneta();
     c3.cor = "Verde";
     c3.ponta = 0.7f;
     c3.modelo = "Big";
     c3.carga = 9;
     
     c3.status();
     c3.tampar();
     c3.rabiscar();
    }
    
}
