import java.util.Date;

public class CartaoCredito {

    String nomeTitular;
    double limite;
    double saldo;
    double fatura;
    int cvv;
    Date dataValidade;
    String status;

    public String desloquear(){
        status = "ATIVO";
        return "Cartão desloqueado com sucesso";
    }

    public String cancelar(){
        status = "CANCELADO";
        return "Cartão cancelado com sucesso";
    }

    public String pagarFatura(double valorPago){
        saldo = saldo + valorPago;
        fatura = fatura - valorPago;

        return "Valor de R$ " + valorPago + " foi abatido de sua fatura.";
    }

    public String sacar(double valorSaque){
        saldo = saldo - valorSaque;
        fatura = fatura + valorSaque;
        return "Saque realizado com sucesso. Saldo Atual: R$ " + saldo;
    }



}
