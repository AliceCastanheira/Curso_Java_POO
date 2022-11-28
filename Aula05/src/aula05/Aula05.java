
package aula05;

public class Aula05 {

    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNunconta(1111);
        p1.setDono("Jubileo");
        p1.abriConta("CC");
        
        ContaBanco p2 = new ContaBanco();
        p2.setNunconta(2222);
        p2.setDono("Creuza");
        p2.abriConta("CP");
        
        p1.depositar(300);
        p2.depositar(500);
        p2.sacar(100);
        
        p1.sacar(350);
        p1.fecharConta();
        
        
        p1.estadoAtual();
        p2.estadoAtual();
    }
    
}
