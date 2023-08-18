package barModels;

/**
 *
 * @author Gabriel Rosa
 */
public class Admin {
    
    private int idAdmin;
    private String user;
    private String senha;

    public Admin(int idAdmin, String user, String senha) {
        this.idAdmin = idAdmin;
        this.user = user;
        this.senha = senha;
    }

    

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
    
}
