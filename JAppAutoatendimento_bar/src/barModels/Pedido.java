package barModels;


import barDao.Pedido_Dao;
import java.util.ArrayList;

/**
 *
 * @author Gabriel Rosa
 */
public class Pedido {
    
    private int idPedido;
    private int pay;
    private ArrayList<Produto> produtos;
    private float valorTotal;

    public Pedido(int pay, ArrayList<Produto> produtos, float valorTotal) {
        this.pay = pay;
        this.produtos = produtos;
        this.valorTotal = valorTotal;
    }

    public Pedido() {
    }
    
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
    
    public void fechaPedido () {
    Pedido_Dao pDao = new Pedido_Dao(this.pay, this.produtos, this.valorTotal);
    pDao.fechaPedido();
    }
    
    
}
