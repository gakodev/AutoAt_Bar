package barModels;

import barDao.TipoProduto_Dao;

/**
 *
 * @author Gabriel Rosa
 */
public class TipoProduto {
    
    private int idTipoProduto;
    private String tipo;

    public TipoProduto(int idTipoProduto, String tipo) {
        this.idTipoProduto = idTipoProduto;
        this.tipo = tipo;
    }

    public TipoProduto(String tipo) {
        this.tipo = tipo;
    }
    
    public int getIdTipoProduto() {
        return idTipoProduto;
    }

    public void setIdTipoProduto(int idTipoProduto) {
        this.idTipoProduto = idTipoProduto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void cadastrar() {
        TipoProduto_Dao tpd = new TipoProduto_Dao(this.tipo);
        tpd.cadastrar();
    }
    
    
    
}
