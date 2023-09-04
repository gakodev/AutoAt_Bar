/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barDao;

import barModels.Produto;
import java.util.ArrayList;
import javax.swing.JOptionPane;

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
        String sql = "INSERT INTO pedido (formaPagamento, valorTotal) VALUES ("
                + "" + this.pay + ","
                + "'" + this.valorTotal + "')";
        Conexao.executar(sql);
        System.out.println(sql);
        JOptionPane.showMessageDialog(null, "ok PEDIDO");
    
        for(Produto p : produtos){
        String sqlPedido_has_produto = "INSERT INTO pedido_has_produto (Pedido_idPedido, Produto_idProduto, quantidade) VALUES ("
                + "" + this.idPedido + ","
                + "" + p.getIdProduto() + ","
                + "" + p.getQnt() + ")";
            System.out.println(sqlPedido_has_produto);
        Conexao.executar(sqlPedido_has_produto);
        };
        
        
    }
    
}
