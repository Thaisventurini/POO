import java.util.Date;

public class CartaoDebito {

    String nomeTitular;
    int numero;
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

}
