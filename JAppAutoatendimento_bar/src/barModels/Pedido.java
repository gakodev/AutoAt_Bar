package barModels;

import barModels.FormaPagamento;

/**
 *
 * @author Gabriel Rosa
 */
public class Pedido {
    
    private int idPedido;
    private FormaPagamento pay;
    private float valorTotal;

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public FormaPagamento getPay() {
        return pay;
    }

    public void setPay(FormaPagamento pay) {
        this.pay = pay;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    
    
}
