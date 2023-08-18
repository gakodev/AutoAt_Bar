package barDao;

import barModels.*;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gabriel Rosa
 */
public class Produto_Dao {
    
    private int tipo;
    private String nome;
    private String descricao;
    private float valor;

    public Produto_Dao() {
    }
    
    public Produto_Dao(int tipo, String nome, String descricao, float valor) {
        this.tipo = tipo;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }
    
   public void cadastrar () {
        String sql = "INSERT INTO produto (TipoProduto_idTipoProduto, nome, descricao, valor) VALUES ("
                + "'" + this.tipo + "',"
                + "'" + this.nome + "',"
                + "'" + this.descricao + "',"
                + "'" + this.valor + "')";
        Conexao.executar(sql);
        JOptionPane.showMessageDialog(null, "Produto cadastrado, faça login novamente para atualizar a tabela!");
    }
   
   public ArrayList<Produto> listarProdutos (JTable table) {
        String sql = "SELECT idProduto, nome, TipoProduto_idTipoProduto, descricao, valor FROM produto";
        ResultSet rs = Conexao.consultar(sql);
        ArrayList<Produto> listaDeProdutos = new ArrayList<Produto>();
        
        try{
            while (rs.next()) {
            
                int idProduto, TipoProduto_idTipoProduto;
                String nome, descricao;
                float valor;

                idProduto = rs.getInt("idProduto");
                TipoProduto_idTipoProduto = rs.getInt("TipoProduto_idTipoProduto");
                nome = rs.getString("nome");
                descricao = rs.getString("descricao");
                valor = rs.getFloat("valor");

                Produto p = new Produto(idProduto, TipoProduto_idTipoProduto, nome, descricao, valor);
                listaDeProdutos.add(p);

                    DefaultTableModel model = (DefaultTableModel) table.getModel();
                    String[] coluna ={"","","","",""};
                    coluna[0] = String.valueOf(p.getIdProduto());
                    coluna[1] = String.valueOf(p.getTipo());
                    coluna[2] = p.getNome();
                    coluna[3] = p.getDescricao();
                    coluna[4] = String.valueOf(p.getValor());

                    model.addRow(coluna);
            }
        }catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro na busca");
        }
        return listaDeProdutos;
   } 
   
   public void editar (int id) {
       String sql = "UPDATE produto SET "
                + "TipoProduto_idTipoProduto = " + this.tipo + ","
                + "nome = '" + this.nome + "',"
                + "descricao = '" + this.descricao + "',"
                + "valor = " + this.valor + ""
                + " WHERE idProduto = " + id;
        Conexao.executar(sql);
        JOptionPane.showMessageDialog(null, "Produto alterado!");
        
   }
   
   public void excluir (int id) {
        String sql = "DELETE FROM produto WHERE idProduto = " + id;
        Conexao.executar(sql);
        JOptionPane.showMessageDialog(null, "Produto deletado!");
   }
}