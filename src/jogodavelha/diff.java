package jogodavelha;

import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.metal.DefaultMetalTheme;
import javax.swing.plaf.metal.MetalLookAndFeel;

public class diff extends javax.swing.JFrame{
    
    public diff(){

        this.setUndecorated(true);
        initComponents();

        MetalLookAndFeel.setCurrentTheme(new MyDefaultMetalTheme());
        
        buttonGroup1.add(comBot);
        buttonGroup1.add(semBot);
        
        this.setLocationRelativeTo(this);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Iniciar = new javax.swing.JButton();
        comBot = new javax.swing.JRadioButton();
        semBot = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Sair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(27, 27, 27));
        jPanel1.setFocusable(false);

        Iniciar.setBackground(new java.awt.Color(9, 9, 9));
        Iniciar.setForeground(new java.awt.Color(255, 255, 235));
        Iniciar.setText("Iniciar jogo");
        Iniciar.setFocusable(false);
        Iniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IniciarMouseClicked(evt);
            }
        });
        Iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarActionPerformed(evt);
            }
        });

        comBot.setBackground(new java.awt.Color(27, 27, 27));
        comBot.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        comBot.setForeground(new java.awt.Color(255, 255, 235));
        comBot.setText("1 Jogador");
        comBot.setFocusable(false);
        comBot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comBotMouseClicked(evt);
            }
        });
        comBot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comBotActionPerformed(evt);
            }
        });

        semBot.setBackground(new java.awt.Color(27, 27, 27));
        semBot.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        semBot.setForeground(new java.awt.Color(255, 255, 235));
        semBot.setText("2 Jogadores");
        semBot.setFocusable(false);
        semBot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                semBotMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 235));
        jLabel1.setText("Selecione o modo de jogo:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 235));
        jLabel2.setText("Jogo da Velha");

        Sair.setBackground(new java.awt.Color(9, 9, 9));
        Sair.setForeground(new java.awt.Color(255, 255, 235));
        Sair.setText("Sair");
        Sair.setFocusable(false);
        Sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SairMouseClicked(evt);
            }
        });
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comBot)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(semBot))
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel2)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(comBot)
                    .addComponent(Iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(semBot)
                    .addComponent(Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comBotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comBotActionPerformed
        
    }//GEN-LAST:event_comBotActionPerformed

    private void comBotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comBotMouseClicked

    }//GEN-LAST:event_comBotMouseClicked

    private void semBotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_semBotMouseClicked

    }//GEN-LAST:event_semBotMouseClicked

    private void IniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IniciarMouseClicked
        if(comBot.isSelected()){
            new MyFrame2(true);
            this.dispose();
        }if(semBot.isSelected()){
            new MyFrame2(false);
            this.dispose();
        }
    }//GEN-LAST:event_IniciarMouseClicked

    private void IniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IniciarActionPerformed

    private void SairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SairMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_SairMouseClicked

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SairActionPerformed
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Iniciar;
    private javax.swing.JButton Sair;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton comBot;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton semBot;
    // End of variables declaration//GEN-END:variables
}

class MyDefaultMetalTheme extends DefaultMetalTheme {
  public ColorUIResource getControlHighlight() {
    return new ColorUIResource(java.awt.Color.yellow);
  }
  public ColorUIResource getControlDarkShadow() {
    return new ColorUIResource(java.awt.Color.orange);
  }
}
