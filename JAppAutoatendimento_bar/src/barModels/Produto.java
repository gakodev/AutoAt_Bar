package barModels;

import barDao.*;
import java.util.ArrayList;
import javax.swing.JTable;
/**
 *
 * @author Gabriel Rosa
 */
public class Produto {
    
    private int idProduto;
    private int tipo;
    private String nome;
    private String descricao;
    private float valor;
    private int qnt;
    

    public Produto() {
    }
    
    public Produto(int idProduto, int tipo, String nome, String descricao, float valor) {
        this.idProduto = idProduto;
        this.tipo = tipo;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }

    public Produto(String nome, float valor, int qnt) {
        this.nome = nome;
        this.valor = valor;
        this.qnt = qnt;
    }
    
    
    
    public Produto(int tipo, String nome, String descricao, float valor) {
        this.tipo = tipo;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }
    
    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getQnt() {
        return qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }
    
    
    
     public void cadastrar() {
        Produto_Dao pDao = new Produto_Dao(this.tipo, this.nome, this.descricao, this.valor);
        pDao.cadastrar();
    }
     
      public ArrayList<Produto> listarProdutos (JTable table) {
        Produto_Dao pDao = new Produto_Dao();
        return pDao.listarProdutos(table);
    } 
    
      public void editar (int id) {
        Produto_Dao pDao = new Produto_Dao(this.tipo, this.nome, this.descricao, this.valor);
        pDao.editar(id);
      }
      
      public void excluir (int id) {
        Produto_Dao pDao = new Produto_Dao();
        pDao.excluir(id);
      }
    
    
}
