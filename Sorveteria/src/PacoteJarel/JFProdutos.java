/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacoteJarel;

/**
 *
 * @author manager
 */
public class JFProdutos extends javax.swing.JFrame {

    /**
     * Creates new form JFProdutos
     */
    public JFProdutos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_usuarioPro = new javax.swing.JLabel();
        lbl_empresaPro = new javax.swing.JLabel();
        lbl_picolePro = new javax.swing.JLabel();
        lbl_menuPro = new javax.swing.JLabel();
        lbl_menuIconPro = new javax.swing.JLabel();
        lbl_sairPro = new javax.swing.JLabel();
        lbl_sairIconPro = new javax.swing.JLabel();
        lbl_sorveteIconPro = new javax.swing.JLabel();
        lbl_produtosPro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1010, 700));

        jPanel1.setBackground(new java.awt.Color(255, 252, 237));
        jPanel1.setMaximumSize(new java.awt.Dimension(1010, 700));
        jPanel1.setMinimumSize(new java.awt.Dimension(1010, 700));
        jPanel1.setPreferredSize(new java.awt.Dimension(983, 638));

        lbl_usuarioPro.setFont(new java.awt.Font("Times New Roman", 2, 20)); // NOI18N
        lbl_usuarioPro.setText("Usuário X");

        lbl_empresaPro.setFont(new java.awt.Font("Monotype Corsiva", 2, 48)); // NOI18N
        lbl_empresaPro.setText("Jarel Sorvetes");

        lbl_picolePro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PacoteJarel/Icons/picole.png"))); // NOI18N

        lbl_menuPro.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        lbl_menuPro.setText("Menu");
        lbl_menuPro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_menuProMouseClicked(evt);
            }
        });

        lbl_menuIconPro.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        lbl_menuIconPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PacoteJarel/Icons/menu.png"))); // NOI18N
        lbl_menuIconPro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_menuIconProMouseClicked(evt);
            }
        });

        lbl_sairPro.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        lbl_sairPro.setText("Sair");

        lbl_sairIconPro.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        lbl_sairIconPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PacoteJarel/Icons/exit-to-app (1).png"))); // NOI18N

        lbl_sorveteIconPro.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        lbl_sorveteIconPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PacoteJarel/Icons/ice-cream (1).png"))); // NOI18N

        lbl_produtosPro.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        lbl_produtosPro.setText("Produtos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_usuarioPro)
                        .addGap(191, 191, 191)
                        .addComponent(lbl_empresaPro, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(lbl_picolePro, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_sairPro))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_sorveteIconPro)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_produtosPro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_menuPro)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_menuIconPro, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_sairIconPro))
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lbl_sairIconPro)
                        .addComponent(lbl_picolePro)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(lbl_usuarioPro))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(lbl_empresaPro))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(lbl_sairPro)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_menuPro)
                                .addComponent(lbl_menuIconPro))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_sorveteIconPro)
                                .addGap(8, 8, 8))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lbl_produtosPro)))
                .addContainerGap(553, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_menuProMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_menuProMouseClicked
        // TODO add your handling code here:
        JFMenu menu = new JFMenu();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_lbl_menuProMouseClicked

    private void lbl_menuIconProMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_menuIconProMouseClicked
        // TODO add your handling code here:
        JFMenu menu = new JFMenu();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_lbl_menuIconProMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_empresaPro;
    private javax.swing.JLabel lbl_menuIconPro;
    private javax.swing.JLabel lbl_menuPro;
    private javax.swing.JLabel lbl_picolePro;
    private javax.swing.JLabel lbl_produtosPro;
    private javax.swing.JLabel lbl_sairIconPro;
    private javax.swing.JLabel lbl_sairPro;
    private javax.swing.JLabel lbl_sorveteIconPro;
    private javax.swing.JLabel lbl_usuarioPro;
    // End of variables declaration//GEN-END:variables
}
