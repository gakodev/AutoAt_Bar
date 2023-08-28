package barControllers;

import barModels.Produto;
import java.util.ArrayList;

/**
 *
 * @author Gabriel Rosa
 */
public class Pedido_Controller {
    
    private int idPedido;
    private int pay;
    private ArrayList<Produto> produtos;
    private float valorTotal;

    
    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getPay() {
        return pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
    
}
