
package aula02.pkg1;

public class Aula021 {


    public static void main(String[] args) {
       Mouse m1 = new Mouse();
        
       m1.cor = "Azul";
       m1.botao = 2;
       m1.status();
       m1.ligado();
       m1.conectado();
       
       Teclado t1 = new Teclado();
       
       t1.cor = "Preto";
       t1.teclado = 27;
       t1.status();
       t1.desligado();
       t1.conectado();
    }
    
}
