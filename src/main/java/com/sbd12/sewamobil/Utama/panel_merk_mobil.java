/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbd12.sewamobil.Utama;




import java.util.logging.Level;
import java.util.logging.Logger;

import java.util.List;
import javax.swing.JOptionPane;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.sbd12.sewamobil.Pkg_Merk_Mobil.*;
import com.sbd12.sewamobil.Pkg_ProdusenMobil.*;
import com.sbd12.sewamobil.Pkg_Data_Mobil.*;
import com.sbd12.sewamobil.Pkg_Jenis_Mobil.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author ArieDZ 2
 */
public class panel_merk_mobil extends javax.swing.JPanel {

    /**
     * Creates new form panel_data_barang
     */
    public JenisMobilTableModel tabelJenis;
    public ProdusenTableModel tabelProdusen;
    public MerkMobilTableModel tableMerk;
    public DataMobilTableModel tableMobil;
    
    public frm_Utama_metro form_parent;
    
    public List<JenisMobil> jeniss;
    public List<ProdusenMobil> produsens ;
    public List<MerkMobil> merk_Mobils ;
    public List<DataMobil> data_mobil;
    public MerkMobilJDBCTemplate db;
    public DataMobilJDBCTemplate produsenmobilJDBCTemplate;
    public MerkMobilJDBCTemplate merk_mobilJDBCTemplate;
    public DataMobilJDBCTemplate data_mobilJDBCTemplate;

    public panel_merk_mobil() throws ClassNotFoundException {
        initComponents();
        ApplicationContext context = new ClassPathXmlApplicationContext("Config-Spring.xml");
         merk_mobilJDBCTemplate = (MerkMobilJDBCTemplate)
                context.getBean("merkMobilJDBCTemplate");


        merk_Mobils = merk_mobilJDBCTemplate.listSemua();
        
        
           jTable1.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getClickCount() >= 1) {
                    int baris = jTable1.getSelectedRow();
                    String id_mobil = (String) tableMerk.getValueAt(baris, 0);
                    System.out.println("id =" + id_mobil);
                    MerkMobil mm =merk_mobilJDBCTemplate.pilih_data(id_mobil);
                    tf_id_merk.setText(mm.getId_merk_mobil());
                    jCb_produsen.setSelectedItem(mm.getNama_produsen_mobil());
                    jCb_jenis.setSelectedItem(mm.getNama_jenis());
                    tf_nama_merk.setText(mm.getNama_Merk_Mobil()); 
                
                
                }
            }
        });
        tampilData_merk();
        
        produsens=merk_mobilJDBCTemplate.combo_box_produsen_mobil(jCb_produsen);
        jeniss=merk_mobilJDBCTemplate.combo_box_jenis_mobil(jCb_jenis);
        refreshData();
    }
    public void tampilData_produsen() throws ClassNotFoundException
    {

        tabelProdusen = new ProdusenTableModel();
        tabelProdusen.setData(produsens);
        jTable1.setModel(tabelProdusen);

    }
    
    public void tampilData_merk() throws ClassNotFoundException
    {

        tableMerk = new MerkMobilTableModel();
        tableMerk.setData(merk_Mobils);
        jTable1.setModel(tableMerk);

    }
    
    public void TampilData_mobil() throws ClassNotFoundException
    {
        tableMobil = new DataMobilTableModel();
        tableMobil.setData(data_mobil);
        jTable1.setModel(tableMobil);
        
    }
    
    public void tampilJenisMobil() throws ClassNotFoundException
    {

        tabelJenis = new JenisMobilTableModel();
        tabelJenis.setData(jeniss);
        jTable1.setModel(tabelJenis);

    }


    public void refreshData() throws ClassNotFoundException
    {   
        merk_Mobils = merk_mobilJDBCTemplate.listSemua();
        tableMerk.setData(merk_Mobils);
        tableMerk.fireTableDataChanged();
        jTable1.changeSelection(0, 0, false, false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BtTambah = new javax.swing.JButton();
        BtEdit = new javax.swing.JButton();
        BtHapus = new javax.swing.JButton();
        BtRefresh = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tf_id_merk = new javax.swing.JTextField();
        tf_nama_merk = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCb_produsen = new javax.swing.JComboBox<>();
        jCb_jenis = new javax.swing.JComboBox<>();
        BtCari = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(960, 720));
        setMinimumSize(new java.awt.Dimension(960, 720));
        setPreferredSize(new java.awt.Dimension(960, 720));

        bg.setBackground(new java.awt.Color(204, 204, 204));
        bg.setMaximumSize(new java.awt.Dimension(960, 720));
        bg.setMinimumSize(new java.awt.Dimension(960, 720));
        bg.setPreferredSize(new java.awt.Dimension(960, 720));

        jScrollPane1.setOpaque(false);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(768, 331));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        BtTambah.setText("Tambah");
        BtTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtTambahActionPerformed(evt);
            }
        });

        BtEdit.setText("Edit");
        BtEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtEditActionPerformed(evt);
            }
        });

        BtHapus.setText("Hapus");
        BtHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtHapusActionPerformed(evt);
            }
        });

        BtRefresh.setText("Refresh");
        BtRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtRefreshActionPerformed(evt);
            }
        });

        jLabel2.setText("ID Merk");

        tf_id_merk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_id_merkActionPerformed(evt);
            }
        });

        jLabel3.setText("Nama Merk");

        jLabel4.setText("Produsen");

        jLabel5.setText("Jenis");

        jCb_produsen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jCb_jenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2))
                            .addGap(78, 78, 78))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(68, 68, 68)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(102, 102, 102)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCb_jenis, 0, 150, Short.MAX_VALUE)
                    .addComponent(tf_id_merk)
                    .addComponent(tf_nama_merk)
                    .addComponent(jCb_produsen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(616, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_id_merk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jCb_produsen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jCb_jenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_nama_merk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        BtCari.setText("Cari");
        BtCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtTambah)
                            .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(BtEdit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtHapus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtRefresh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(BtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(BtTambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtHapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtRefresh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtCari))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtTambahActionPerformed
        // TODO add your handling code here:
         System.out.println("Menekan Tombol Tambah");
         
       String nama_produsenPilih = jCb_produsen.getSelectedItem().toString();
       String id_produsenPilih = "-";
       String nama_jenisPilih = jCb_jenis.getSelectedItem().toString();
       String id_jenisPilih="-";
       
       if((!nama_jenisPilih.equalsIgnoreCase("Pilih"))&&(!nama_produsenPilih.equalsIgnoreCase("Pilih"))){
       for(ProdusenMobil produsenMobil:produsens)
       {
           if (produsenMobil.getNama_produsen().equals(nama_produsenPilih))
           {
               id_produsenPilih=produsenMobil.getId_produsen();
           }
       }
       for(JenisMobil jenisMobil:jeniss)
       {
           if (jenisMobil.getNama_jenis_mobil().equals(nama_jenisPilih))
           {
               id_jenisPilih=jenisMobil.getId_jenis_mobil();
           }
       }
       
       System.out.println("nama : "+nama_produsenPilih+" id : "+id_produsenPilih);
       System.out.println("nama : "+nama_jenisPilih+" id : "+id_jenisPilih);
       merk_mobilJDBCTemplate.create(tf_id_merk.getText(), id_produsenPilih, id_jenisPilih, tf_nama_merk.getText());
       }
       else{
           System.out.println("Dihentikan -ComboBox produsen:"+nama_produsenPilih+", -ComboBox Jenis:"+nama_jenisPilih);
        }
       
      
        try {
            refreshData();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(panel_merk_mobil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtTambahActionPerformed

    private void BtEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtEditActionPerformed
            System.out.println("Menekan tombol edit");
            
            int baris = jTable1.getSelectedRow();
       String id=(String)tableMerk.getValueAt(baris, 0);            
       String nama_produsenPilih = jCb_produsen.getSelectedItem().toString();
       String id_produsenPilih = "-";
       String nama_jenisPilih = jCb_jenis.getSelectedItem().toString();
       String id_jenisPilih="-";
       
       if((!nama_jenisPilih.equalsIgnoreCase("Pilih"))&&(!nama_produsenPilih.equalsIgnoreCase("Pilih"))){
       for(ProdusenMobil produsenMobil:produsens)
       {
           if (produsenMobil.getNama_produsen().equals(nama_produsenPilih))
           {
               id_produsenPilih=produsenMobil.getId_produsen();
           }
       }
       for(JenisMobil jenisMobil:jeniss)
       {
           if (jenisMobil.getNama_jenis_mobil().equals(nama_jenisPilih))
           {
               id_jenisPilih=jenisMobil.getId_jenis_mobil();
           }
       }
       merk_mobilJDBCTemplate.edit(tf_id_merk.getText(), id_produsenPilih, id_jenisPilih, tf_nama_merk.getText());
        }
       
        try {
            refreshData();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(panel_merk_mobil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtEditActionPerformed

    private void BtHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtHapusActionPerformed
        // TODO add your handling code here:

        
            int baris = jTable1.getSelectedRow();
            String id=(String)tableMerk.getValueAt(baris, 0);
            merk_mobilJDBCTemplate.delete(id);
            System.out.println("Menekan tombol hapus");
            System.out.println(id);
           /* Object[] pilihan ={"Ya","Tidak"};
            int jawaban= JOptionPane.showOptionDialog(null, "Anda yakin data "
                +"Barang dengan Kode"+nim+" dengan nama Barang "+nama+" akan"
                +"dihapus? ","Peringatan",JOptionPane.DEFAULT_OPTION,
                JOptionPane.WARNING_MESSAGE,null,pilihan,pilihan[0]);
            if(jawaban==0)
            {
                
            }*/
        try {
            refreshData();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(panel_merk_mobil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtHapusActionPerformed

    private void BtRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtRefreshActionPerformed
        try {
            // TODO add your handling code here:
            refreshData();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(panel_merk_mobil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtRefreshActionPerformed

    private void BtCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCariActionPerformed
        // TODO add your handling code here:
        String katakunci;
        katakunci=JOptionPane.showInputDialog(null,"Nama barang yang di cari?","Filter/Pencarian",JOptionPane.QUESTION_MESSAGE);
        if(katakunci!=null)
        {
            merk_Mobils =  merk_mobilJDBCTemplate.pilih_data_like(katakunci);
            tableMerk.setData(merk_Mobils);
            tableMerk.fireTableDataChanged();
            jTable1.changeSelection(0, 0, false, false);
        }
    }//GEN-LAST:event_BtCariActionPerformed

    private void tf_id_merkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_id_merkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_id_merkActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtCari;
    private javax.swing.JButton BtEdit;
    private javax.swing.JButton BtHapus;
    private javax.swing.JButton BtRefresh;
    private javax.swing.JButton BtTambah;
    private javax.swing.JPanel bg;
    private javax.swing.JComboBox<String> jCb_jenis;
    private javax.swing.JComboBox<String> jCb_produsen;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField tf_id_merk;
    private javax.swing.JTextField tf_nama_merk;
    // End of variables declaration//GEN-END:variables
}
