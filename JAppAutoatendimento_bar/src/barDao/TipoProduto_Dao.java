package barDao;

import barModels.TipoProduto;

/**
 *
 * @author Gabriel Rosa
 */
public class TipoProduto_Dao {
    
    private int idTipoProduto;
    private String tipo;

    public TipoProduto_Dao(String tipo) {
        this.tipo = tipo;
    }
    
    public void cadastrar () {
        String sql = "INSERT INTO TipoProduto (tipo) VALUES ("
                +" '" + this.tipo+ "')";
        Conexao.executar(sql);
    }
    
}
