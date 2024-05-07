package exemplos;

public class TesteConta {
    public static void main(String[] args) {
        Conta c = new Conta();
        c.depositar(100);
        c.depositar(50);
     c.setNomeTitular("Kelli");
     c.setNumero(2000);
     
        boolean saque_efetuado = c.sacar(120);
        if (saque_efetuado){
            System.out.println ("Saque Efetuado cam Sucesso");
    } else {
            System.out.println ("Saque não efetuado! Saldo insuficiente!");
        
    }
  System.out.println("Saldo:" + c.getSaldo());
System.out.println("NomeTitular:"+ c.getNomeTitular());
System.out.println("Numero:"+ c.getNumero());
}
}