public class Principal {

    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente();
        conta.nomeTitular = "Du Baldassari";
        conta.numConta = 123;
        conta.cpfTitular = "12345678946";
        conta.dataNascimentoTitular = "10/08/2000";
        conta.saldo = 1000000.00;

        System.out.println(conta.saldo);

        String saquei = conta.sacar(1520.00);

        System.out.println(saquei);

    }

}
