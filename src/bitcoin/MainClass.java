package bitcoin;

import bitcoin.gui.UserInfo;
import bitcoin.pn.MulticastPeer;

public class MainClass {
    
    
    public static void main(String[] args) {
        
        BitCoin b = new BitCoin();
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
 
            public void run() {
                UserInfo tela_login = new UserInfo(b);
            }
        });
        
        b.conexao = new MulticastPeer(b);
   
    }
}
