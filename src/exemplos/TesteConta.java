package exemplos;

public class TesteConta {
    public static void main(String[] args) {
        Conta c = new Conta();
        c.depositar(100);
        c.depositar(50);
        System.out.println("Saldo: " + c.saldo);
        boolean saque_efetuado = c.sacar(120);
        if (saque_efetuado)
            System.out.println ("Saque Efetuado cam Sucesso");
        else
            System.out.println ("Saque não efetuado! Saldo insuficiente!");
    }
}
