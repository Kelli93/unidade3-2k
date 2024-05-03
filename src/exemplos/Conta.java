package exemplos;

public class Conta {
    int numero;
    String nomeTitular;
    double saldo;
    
    void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }
    boolean sacar(double Valor) {
            if (this.saldo>=Valor){
        this.saldo-=Valor;
    return(true);
}
else
      return false;
    }
}