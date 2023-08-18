package barControllers;

import barViews.admFrame;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Rosa
 */
public class Admin_Controller {
    
    private String user;
    private String senha;

    public Admin_Controller() {
    }

    public Admin_Controller(String user, String senha) {
        this.user = user;
        this.senha = senha;
    }
    
    public void validaLogin () {
    
     if(user.equals("Adm") && senha.equals("12345")){
         
            admFrame frame = new admFrame();
            frame.setSize(476, 555);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            
        } else { JOptionPane.showMessageDialog(null, "Usuário e senha incorreta");
        } 
     }  
    
    
    }
    
     
    

