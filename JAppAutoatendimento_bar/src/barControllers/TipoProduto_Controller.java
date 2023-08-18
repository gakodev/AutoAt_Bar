package barControllers;

import barModels.TipoProduto;

/**
 *
 * @author Gabriel Rosa
 */
public class TipoProduto_Controller {
    
    private int idTipoProduto;
    private String tipo;

    public TipoProduto_Controller(String tipo) {
        this.tipo = tipo;
    }
    
    public void cadastrar () {
    TipoProduto t = new TipoProduto(this.tipo);
    t.cadastrar();
    }
    
    
}
