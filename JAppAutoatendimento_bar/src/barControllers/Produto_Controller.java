package barControllers;

import barModels.*;
import java.util.ArrayList;
import javax.swing.JTable;

/**
 *
 * @author Gabriel Rosa
 */
public class Produto_Controller {
    
    private int idProduto;
    private int tipo;
    private String nome;
    private String descricao;
    private float valor;

    public Produto_Controller() {
    }
    
    public Produto_Controller(int idProduto, int tipo, String nome, String descricao, float valor) {
        this.idProduto = idProduto;
        this.tipo = tipo;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }
    
    public Produto_Controller(int tipo, String nome, String descricao, float valor) {
        this.tipo = tipo;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }
    
    public void cadastrar () {
    Produto p = new Produto(this.tipo, this.nome, this.descricao, this.valor);
    p.cadastrar();
    }
    
    public ArrayList<Produto> listarProdutos (JTable table) {
        Produto p = new Produto();
        return p.listarProdutos(table);
    }
    
    public static int retornaId (JTable table) {
       int index = table.getSelectedRow();
       int id = Integer.parseInt(table.getValueAt(index, 0).toString());
        return id;
    }
    
    public void editar (int id) {
    Produto p = new Produto(this.tipo, this.nome, this.descricao, this.valor);
    p.editar(id);
    }
    
    public void excluir (int id) {
    Produto p = new Produto();
    p.excluir(id);
    }
    
}
