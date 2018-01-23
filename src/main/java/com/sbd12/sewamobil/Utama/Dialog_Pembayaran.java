/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbd12.sewamobil.Utama;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ArieDZ_2
 */
public class Dialog_Pembayaran extends javax.swing.JDialog {

    /**
     * Creates new form dialog_pembayaran
     */
    private double harga_Sebelum_diskon=0;
    private double harga_diskon=0;
    private double harga_total=0;
    private double uangdiBayar=0;
    private double kembalian=0;
    private boolean isTombolBatal=false;

    private DecimalFormat kursIndonesia;
    private DecimalFormatSymbols formatRp;

    public double getHarga_Sebelum_diskon() {
        return harga_Sebelum_diskon;
    }

    public void setHarga_Sebelum_diskon(double harga_Sebelum_diskon) {
        this.harga_Sebelum_diskon = harga_Sebelum_diskon;
    }

    public double getHarga_diskon() {
        return harga_diskon;
    }

    public void setHarga_diskon(double harga_diskon) {
        this.harga_diskon = harga_diskon;
    }

    public double getHarga_total() {
        return harga_total;
    }

    public void setHarga_total(double harga_total) {
        this.harga_total = harga_total;
    }

    public double getUangdiBayar() {
        return uangdiBayar;
    }

    public void setUangdiBayar(double uangdiBayar) {
        this.uangdiBayar = uangdiBayar;
    }

    public boolean isIsTombolBatal() {
        return isTombolBatal;
    }

    public void setIsTombolBatal(boolean isTombolBatal) {
        this.isTombolBatal = isTombolBatal;
    }
    

    public Dialog_Pembayaran(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        formatCurrency();
        
         
        
    }

    public void setForm(double harga_Sebelum_diskon, double harga_diskon, double harga_total) {
        setHarga_Sebelum_diskon(harga_Sebelum_diskon);
        setHarga_diskon(harga_diskon);
        setHarga_total(harga_total);

        tf_hargaSeebelumDiskon.setText(kursIndonesia.format(this.harga_Sebelum_diskon));
        tf_hargadiskon.setText(kursIndonesia.format(this.harga_diskon));
        tf_hargatotal.setText(kursIndonesia.format(this.harga_total));
    }

    public void formatCurrency() {
        kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bt_simpan = new javax.swing.JButton();
        bt_batal = new javax.swing.JButton();
        tf_hargaSeebelumDiskon = new javax.swing.JFormattedTextField();
        tf_hargadiskon = new javax.swing.JFormattedTextField();
        tf_hargatotal = new javax.swing.JFormattedTextField();
        tf_uangdiBayar = new javax.swing.JFormattedTextField();
        tf_kembali = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Harga");

        jLabel2.setText("Diskon");

        jLabel3.setText("Total");

        jLabel4.setText("Uang yg diBayar");

        jLabel5.setText("Kembali");

        bt_simpan.setText("Simpan");
        bt_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_simpanActionPerformed(evt);
            }
        });

        bt_batal.setText("Batal");
        bt_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_batalActionPerformed(evt);
            }
        });

        tf_hargaSeebelumDiskon.setEditable(false);
        tf_hargaSeebelumDiskon.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        tf_hargaSeebelumDiskon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tf_hargaSeebelumDiskon.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);

        tf_hargadiskon.setEditable(false);
        tf_hargadiskon.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        tf_hargadiskon.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);

        tf_hargatotal.setEditable(false);
        tf_hargatotal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        tf_hargatotal.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);

        tf_uangdiBayar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        tf_uangdiBayar.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);

        tf_kembali.setEditable(false);
        tf_kembali.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        tf_kembali.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(bt_simpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bt_batal, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(tf_kembali)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_hargadiskon, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tf_hargatotal)
                            .addComponent(tf_hargaSeebelumDiskon)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(5, 5, 5)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(11, 11, 11)))
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf_uangdiBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(104, 104, 104))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_hargaSeebelumDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_hargadiskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_hargatotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_uangdiBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_kembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_simpan)
                    .addComponent(bt_batal))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        tf_hargaSeebelumDiskon.setEditable(false);
        tf_hargadiskon.setEditable(false);
        tf_hargatotal.setEditable(false);
        tf_kembali.setEditable(false);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_simpanActionPerformed
        // TODO add your handling code here:
        
        
        if (!tf_uangdiBayar.getText().isEmpty()) {
                uangdiBayar = Double.parseDouble(tf_uangdiBayar.getText());
        }

        if (uangdiBayar < harga_total) {
            JOptionPane.showMessageDialog(this, "Uang yg dibayar harus lebih sama dengan dari Harga Total =" + harga_total);
        } else {
            kembalian = uangdiBayar - harga_total;
            tf_kembali.setText(kursIndonesia.format(kembalian));
            tf_uangdiBayar.setText(kursIndonesia.format(uangdiBayar));
            int reply = JOptionPane.showConfirmDialog(this, "Uang yg dibayar :" + uangdiBayar + "\nKembaliian :" + kembalian + "\nTekan 'Yes' u/melanjutkan dan 'No' u/Input kembali", "Pembayaran", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) {
                uangdiBayar-=kembalian;
                setVisible(false);
            } else {
                uangdiBayar = 0;
                kembalian = 0;
                tf_uangdiBayar.setText("");
                tf_kembali.setText("");
            }
        }


    }//GEN-LAST:event_bt_simpanActionPerformed

    private void bt_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_batalActionPerformed
        // TODO add your handling code here:
        
        uangdiBayar = 0;
        kembalian = 0;
        
        isTombolBatal = true;
        tf_uangdiBayar.setText("");
        tf_kembali.setText("");
        setVisible(false);
    }//GEN-LAST:event_bt_batalActionPerformed

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
            java.util.logging.Logger.getLogger(Dialog_Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dialog_Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dialog_Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dialog_Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Dialog_Pembayaran dialog = new Dialog_Pembayaran(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_batal;
    private javax.swing.JButton bt_simpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JFormattedTextField tf_hargaSeebelumDiskon;
    private javax.swing.JFormattedTextField tf_hargadiskon;
    private javax.swing.JFormattedTextField tf_hargatotal;
    private javax.swing.JFormattedTextField tf_kembali;
    private javax.swing.JFormattedTextField tf_uangdiBayar;
    // End of variables declaration//GEN-END:variables
}
