/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogodavelha;

import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class egg2 extends JFrame{
    
    egg2(){
        this.setLocation(660,340);
        this.setSize(420,420);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }
    
    Image img;
    
    public void paint(Graphics g){
        
        try {
            img = ImageIO.read(getClass().getResource("hmmm.jpg"));
            img = img.getScaledInstance(420, 420, Image.SCALE_DEFAULT);
            g.drawImage(img, 0, 0, this);
        } catch (IOException ex) {
            Logger.getLogger(egg.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
