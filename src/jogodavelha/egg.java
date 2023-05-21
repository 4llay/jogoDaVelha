package jogodavelha;

import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;


public class egg extends JFrame{
        
    egg(){
        this.setLocation(660,340);
        this.setResizable(false);
        this.setSize(420,420);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }
    
    Image img;
    
    public void paint(Graphics g){
        
        try {
            img = ImageIO.read(getClass().getResource("egg.jpg"));
            g.drawImage(img, 0, 0, this);
        } catch (IOException ex) {
            Logger.getLogger(egg.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
