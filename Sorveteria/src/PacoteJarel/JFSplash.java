/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacoteJarel;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

/**
 *
 * @author manager
 */
public class JFSplash extends javax.swing.JFrame {

    
    /**
     * Creates new form JFSplash
     */
    public JFSplash() {
        initComponents();
        
        URL url = this.getClass().getResource("icons/icone.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(iconeTitulo);        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        pnl_img = new javax.swing.JPanel();
        lbl_load = new javax.swing.JLabel();
        pgb_load = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnl_img.setBackground(new java.awt.Color(255, 252, 237));

        lbl_load.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        lbl_load.setText("carregando");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PacoteJarel/Icons/logo.png"))); // NOI18N

        javax.swing.GroupLayout pnl_imgLayout = new javax.swing.GroupLayout(pnl_img);
        pnl_img.setLayout(pnl_imgLayout);
        pnl_imgLayout.setHorizontalGroup(
            pnl_imgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_imgLayout.createSequentialGroup()
                .addGroup(pnl_imgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_imgLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_imgLayout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(lbl_load))
                    .addGroup(pnl_imgLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pgb_load, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnl_imgLayout.setVerticalGroup(
            pnl_imgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_imgLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_load)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pgb_load, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_img, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(JFSplash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFSplash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFSplash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFSplash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFSplash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    public javax.swing.JLabel lbl_load;
    public javax.swing.JProgressBar pgb_load;
    private javax.swing.JPanel pnl_img;
    // End of variables declaration//GEN-END:variables
}
