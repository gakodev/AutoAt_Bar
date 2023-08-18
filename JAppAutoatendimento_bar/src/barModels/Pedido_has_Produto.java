package barModels;

import barModels.Pedido;

/**
 *
 * @author Gabriel Rosa
 */
public class Pedido_has_Produto {
    
    private int idPedido_has_Produto;
    private Pedido Pedido_idPedido;
    private Produto Produto_idProduto;
    private int quantidade;

    public int getIdPedido_has_Produto() {
        return idPedido_has_Produto;
    }

    public void setIdPedido_has_Produto(int idPedido_has_Produto) {
        this.idPedido_has_Produto = idPedido_has_Produto;
    }

    public Pedido getPedido_idPedido() {
        return Pedido_idPedido;
    }

    public void setPedido_idPedido(Pedido Pedido_idPedido) {
        this.Pedido_idPedido = Pedido_idPedido;
    }

    public Produto getProduto_idProduto() {
        return Produto_idProduto;
    }

    public void setProduto_idProduto(Produto Produto_idProduto) {
        this.Produto_idProduto = Produto_idProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
    
    
}
