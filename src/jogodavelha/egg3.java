package jogodavelha;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class egg3 extends JFrame {
    
    egg3(){
        
        JLabel label = new JLabel("Eu perdi :)");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setFont(new Font("Comic Sans",Font.BOLD,60));

        this.add(label);
        this.setLocation(660,340);
        this.setResizable(false);
        this.setSize(420,420);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }
}
