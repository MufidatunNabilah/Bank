
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mufidatun Nabilah
 */
public class Frame2 extends javax.swing.JFrame {
    Tarik tarik;
    /**
     * Creates new form Frame2
     */
    public Frame2() {
        int saldo = 0;
        tarik = new Tarik(saldo);
        initComponents();
    }

    Frame2(int saldo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setText("Informasi Saldo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(40, 40, 150, 23);

        jButton2.setText("Transfer");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(40, 80, 150, 23);

        jButton3.setText("Penarikan");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(40, 120, 150, 23);

        jButton4.setText("Kembali");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(220, 120, 150, 23);

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 410, 180);

        setSize(new java.awt.Dimension(423, 216));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       JOptionPane.showMessageDialog(null, "Jumlah saldo anda = "+tarik.getSaldo(), "", 1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String pesan = JOptionPane.showInputDialog(null,"Masukkan nomor rekening","Transfer",3);
        
        try{
            int choice = Integer.parseInt(pesan);
            pesan = JOptionPane.showInputDialog(null,"Masukkan jumlah yang ingin ditransfer","Transfer",3);
            choice = Integer.parseInt(pesan);
            if(tarik.penarikan(choice)){
                JOptionPane.showMessageDialog(null, "Transfer Berhasil", "Transfer", 1);
                int input = JOptionPane.showOptionDialog(null, "Apa anda ingin melanjutkan transaksi?", "Transfer", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
                if(input == JOptionPane.NO_OPTION)
                {
                    JOptionPane.showMessageDialog(null, "Silahkan ambil kartu anda", "Transfer", 1);
                    System.exit(0);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Transfer gagal", "Perhatian", 0);
            }
        }catch(NumberFormatException e) {
            if(e.toString().toLowerCase().indexOf("null".toLowerCase()) == -1){
                JOptionPane.showMessageDialog(null, "Anda harus memasukkan angka", "Perhatian", 0);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String pesan = JOptionPane.showInputDialog(null,"Masukkan jumlah yang ingin diambil","Transfer",3);
        
        try{
            int choice = Integer.parseInt(pesan);
            if(tarik.penarikan(choice)){
                JOptionPane.showMessageDialog(null, "Jumlah saldo = "+tarik.getSaldo(), "Berhasil", 1);
                int input = JOptionPane.showOptionDialog(null, "Apa anda ingin melanjutkan transaksi?", "Penarikan", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
                if(input == JOptionPane.NO_OPTION)
                {
                    JOptionPane.showMessageDialog(null, "Silahkan ambil kartu anda", "Penarikan", 1);
                    System.exit(0);
                }
            }else{
                if(choice>50000){
                    JOptionPane.showMessageDialog(null, "Saldo tidak mencukupi", "Perhatian", 0);
                }else{
                    JOptionPane.showMessageDialog(null, "Nominal harus lebih dari Rp50.000,00", "Perhatian", 0);
                }
            }
        }catch(NumberFormatException e) {
            if(e.toString().toLowerCase().indexOf("null".toLowerCase()) == -1){
                JOptionPane.showMessageDialog(null, "Anda harus memasukkan angka", "Perhatian", 0);
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new Frame3(tarik.getSaldo()).setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
