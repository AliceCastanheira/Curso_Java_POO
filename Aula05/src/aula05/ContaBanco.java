
package aula05;

public class ContaBanco {
    
    //Atributos
    public int nunConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public void estadoAtual()
    {
        System.out.println("______________________________________");
        System.out.println("Conta: " + this.getNunconta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());  
    }
    
    //Métodos Personalizados
    public void abriConta(String t) 
    {
        this.setTipo(t);
        this.setStatus(true);
        if ("CC".equals(t)) {
            this.setSaldo(50);
        } else if ( "CP".equals(t)) {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso");
    }

    public void fecharConta() 
    {
        if (this.getSaldo() > 0) 
        {
            System.out.println("Conta não pode ser fechada pois ainda possui crédito");
        } else if (this.getSaldo() < 0)
        {
            System.out.println("Conta não pode ser fechada pois tem debitos a pagar");
        } else 
        {
            this.setStatus(false);
            System.out.println("Conta fechada com o sucesso");
        }
    }
    
    public void depositar(float v) 
    {
        if (this.getStatus())
        {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado com sucesso na conta " + this.getDono());
        } else 
        {
            System.out.println("Impossível depoistar em uma conta fechada");
        }    
    }
    
    public void sacar(float v) 
    {
        if (this.getStatus())
        {
            if(this.getSaldo() >= v)
            {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saldo realizado na conta de " + this.getDono());
            }else 
            {
                System.out.println("Saldo insuficiente para saque");
            }
        } else 
        {
            System.out.println("Impossivel sacar de uma conta fechada");
        }
    }
    public void pagarMensal() 
    {
        int v = 0;
        if (this.getTipo() == "CC")
        {
            v = 12;
        } else if (this.getTipo() == "CP")
        {
            v = 20;
        }
        if (this.getStatus())
        {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        } else
        {
            System.out.println("Impossivel pagar uma conta fechada");
        }
    }
    
    
    //Métodos Especiais 
    public void ContaBanco()
    {
        this.saldo = 0;
        this.status = false;
    }
    
    //Métodos Especiais = Getters e Setters
    public int getNunconta() {
        return nunConta;
    }

    public void setNunconta(int nunconta) {
        this.nunConta = nunconta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
