public class ContaCorrente {

    int numConta;
    String dataNascimentoTitular;
    String cpfTitular;
    String nomeTitular;
    double saldo;

    public String emitirExtrato(){
        return "Vazio";
    }

    public String sacar(double valorSaque){
        saldo = saldo - valorSaque;
        return "Saque realizado com sucesso. Saldo Atual: R$ " + saldo;
    }

}
