package jogodavelha;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame2 implements ActionListener{
    
    //variaveis
    JFrame frame = new JFrame();
    JPanel titlePanel = new JPanel();
    JPanel buttonPanel = new JPanel();
    JLabel title = new JLabel();
    JButton[][] buttons = new JButton[3][3];
    JButton reiniciar = new JButton("Clear");
    JButton voltar = new JButton("Menu");
    int turno = 1;
    boolean win = false;
    boolean bot;
    Random random = new Random();
    int easterEGG, easterEGG2, easterEGG3 = 0;
    
    MyFrame2(boolean bot){
        
        initComp();
        
        this.bot = bot;
        if(bot==true){
            botTurn();
        }
    }

    public void initComp(){        
        
        
        //config do fram
        frame.setSize(320, 500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(frame);
        frame.getContentPane().setBackground(new Color(27, 27, 27));
        frame.setVisible(true);
        
        //config do titulo
        title.setText("X começa...");
        title.setForeground(new Color(252,204,4));
        title.setBackground(new Color(9,9,9));
        title.setFont(new Font("Comic Sans MS",Font.BOLD,20));
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setOpaque(true);
        
        //config do titlePanel
        titlePanel.setLayout(new BorderLayout());
        titlePanel.setBounds(0,0, 324, 53);
        titlePanel.add(title);
        
        //config do buttonPanel
        buttonPanel.setLayout(new GridLayout(3,3));
        buttonPanel.setBounds(10, 80, 285, 300);
        
        //adicionar botoes ao buttonPanel
        for(int i = 0; i<3; i++){
            for(int x = 0;x<3;x++){
            buttons[i][x] = new JButton();
            buttonPanel.add(buttons[i][x]);
            buttons[i][x].setFont(new Font("Comic Sans", Font.BOLD, 60));
            buttons[i][x].setBackground(new Color(9,9,9));
            buttons[i][x].setForeground(new Color(200,200,200));
            buttons[i][x].setFocusable(false);
            buttons[i][x].addActionListener(this);
            }
        }
        
        //resetar
        reiniciar.setBounds(10, 395, 130, 50);
        reiniciar.setBackground(new Color(9,9,9));
        reiniciar.setForeground(new Color(255,255,235));
        reiniciar.setFocusable(false);
        reiniciar.addActionListener(this);
        
        //voltar        
        voltar.setBounds(165, 395, 130, 50);
        voltar.setBackground(new Color(9,9,9));
        voltar.setForeground(new Color(255,255,235));
        voltar.setFocusable(false);
        voltar.addActionListener(this);
        
        //juntando componentes
        frame.add(titlePanel);
        frame.add(buttonPanel);
        frame.add(reiniciar);
        frame.add(voltar);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == reiniciar){
            for(int i = 0;i<3;i++){
                for(int x = 0;x<3;x++){
                    buttons[i][x].setText("");
                    buttons[i][x].setEnabled(true);
                    buttons[i][x].setBackground(new Color(9,9,9));
                    buttons[i][x].setForeground(new Color(200,200,200));
                    turno = 1;
                    title.setText("X começa...");
                    easterEGG  =0;
                    easterEGG2 =0;
                    easterEGG3 =0;
                    win=false;
                }
            }
            if (bot == true) {
                botTurn();
            }
        }
        
        if(e.getSource() == voltar){
            new diff();
            frame.dispose();
        }
        
        for(int i = 0; i<3; i++){
            for(int x = 0;x<3;x++){
                buttonAction(i,x,e);
            }
        }

        if(e.getSource()==buttons[1][1]){
            easterEGG++;
            if(easterEGG==5){
                easterEGG=0;
                new egg();
            }
        }
        if(e.getSource()==buttons[0][0]){
            easterEGG2++;
            if(easterEGG2==5){
                easterEGG2=0;
                new egg2();
            }
        }
        if(e.getSource()==buttons[2][2]){
            easterEGG3++;
            if(easterEGG3==5){
                easterEGG3=0;
                new egg3();
            }
        }
    }
    
    public void buttonAction(int i,int x, ActionEvent e){
        if (bot == true) {
            if (e.getSource() == buttons[i][x]) {
                if (buttons[i][x].getText() == "") {
                    turno++;
                    buttons[i][x].setText("O");
                    title.setText("Vez do X...");
                    check();
                    botTurn();
                }
            }
        } else {
            if (e.getSource() == buttons[i][x]) {
                if (buttons[i][x].getText() == "") {
                    if (turno%2!=0) {
                        turno++;
                        buttons[i][x].setText("X");
                        title.setText("Vez do O...");
                        check();
                    } else {
                        turno++;
                        buttons[i][x].setText("O");
                        title.setText("Vez do X...");
                        check();
                    }
                }
            }
        }
    }
        
    public void botTurn(){
        while(turno%2!=0){
                
                int i = random.nextInt(3);
                int x = random.nextInt(3);
                
                if(buttons[i][x].isEnabled()==false){
                    break;
                }
                if(buttons[i][x].getText()==""){
                    turno++;
                    buttons[i][x].setText("X");
                    title.setText("Vez do O...");
                    check();
                }
        }
    }
    
    public void check(){

            vitoria(0,0,0,1,0,2);
            /*  OOO
                ***
                ***    */
            vitoria(1,0,1,1,1,2);
            /*  ***
                OOO
                ***    */
            vitoria(2,0,2,1,2,2);
            /*  ***
                ***
                OOO    */
            vitoria(0,0,1,0,2,0);
            /*  O**
                O**
                O**    */
            vitoria(0,1,1,1,2,1);
            /*  *O*
                *O*
                *O*    */
            vitoria(0,2,1,2,2,2);
            /*  **O
                **O
                **O    */
            vitoria(0,0,1,1,2,2);
            /*  O**
                *O*
                **O    */
            vitoria(0,2,1,1,2,0);
            /*
                **O
                *O*
                O**    */
        
        //empate
        if(turno>=10&&win==false){
            disable();
            title.setText("Empate :(");
        }   
    }
    
    public void vitoria(int btn1I, int btn1X, int btn2I, int btn2X, int btn3I, int btn3X){
                if(
                        (
                         (buttons[btn1I][btn1X].getText()==buttons[btn2I][btn2X].getText())&&
                         (buttons[btn2I][btn2X].getText()==buttons[btn3I][btn3X].getText())&&
                         (buttons[btn1I][btn1X].getText()!=""&&buttons[btn2I][btn2X].getText()!=""&&buttons[btn3I][btn3X].getText()!="")
                        )
                )
                {
                    title.setText("O ganhador foi o "+ buttons[btn1I][btn1X].getText());
                    buttons[btn1I][btn1X].setBackground(new Color(0,192,26));
                    buttons[btn2I][btn2X].setBackground(new Color(0,192,26));
                    buttons[btn3I][btn3X].setBackground(new Color(0,192,26));                    
                    disable();
                    win=true;
                }
    }
    
    public void disable(){
        for(int i =0;i<3;i++){
            for(int x =0;x<3;x++){
                buttons[i][x].setEnabled(false);
            }
        }
    }
}