/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barDao;

import barModels.Produto;
import java.util.ArrayList;

/**
 *
 * @author 182210123
 */
public class Pedido_Dao {
    private int idPedido;
    private int pay;
    private ArrayList<Produto> produtos;
    private float valorTotal;

    public Pedido_Dao(int pay, ArrayList<Produto> produtos, float valorTotal) {
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
    
    public void fechaPedido () {
    
    
    
    }
    
}
