package model;

public class Conta {

    public int agencia;
    public int numeroConta;
    public String nomeTitular;
    public String cpfTitular;
    public double saldo;
    public String dataNascimentoTitular;

    public String emitirExtrato(){
        return "Vazio";
    }

    public String sacar(double valorSaque){
        saldo = saldo - valorSaque;
        return "Saque realizado com sucesso. Saldo Atual: R$ " + saldo;
    }

}
