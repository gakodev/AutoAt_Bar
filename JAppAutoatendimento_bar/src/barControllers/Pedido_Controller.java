package barControllers;

import barModels.Pedido;
import barModels.Produto;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Rosa
 */
public class Pedido_Controller {
    
    private int idPedido;
    private int pay;
    private ArrayList<Produto> produtos;
    private float valorTotal;

    public Pedido_Controller(int pay, ArrayList<Produto> produtos, float valorTotal) {
        this.pay = pay;
        this.produtos = produtos;
        this.valorTotal = valorTotal;
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
    
    public boolean fechaPedido () {
        if(this.pay == 0 ){
            return false;
        } else {
            Pedido p = new Pedido(this.pay, this.produtos, this.valorTotal);
           return p.fechaPedido();
        }
         
    }
}
