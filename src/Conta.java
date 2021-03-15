public class Conta {

    int agencia;
    int numeroConta;
    String nomeTitular;
    String cpfTitular;
    double saldo;
    String dataNascimentoTitular;

    public String emitirExtrato(){
        return "Vazio";
    }

    public String sacar(double valorSaque){
        saldo = saldo - valorSaque;
        return "Saque realizado com sucesso. Saldo Atual: R$ " + saldo;
    }

}
