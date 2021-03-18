/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2dpbo;

// mengimport library untuk membuat arrayList
import java.util.ArrayList;
// mengimport library untuk membuat tulisan di dalam row tabel menjadi ke tengah
import javax.swing.table.DefaultTableCellRenderer;
// mengimport library untuk mengeset konfigurasi dalam suatu kolom di tabel
import javax.swing.table.TableColumnModel;
// mengimport library untuk untuk mengimplementasikan model tabel
import javax.swing.table.DefaultTableModel;
// mengimport package untuk melakukan koneksi dengan database
import Konfigurasi.Koneksi;
// mengimport library untuk melakukan proses dalam database SQL
import java.sql.*;
// mengimport library untuk mengeset horizontal alignment (alias untuk menengahkan) tulisan
import javax.swing.JLabel;


/**
 *
 * @author REPUBLIC OF GAMERS
 */
public class main extends javax.swing.JFrame {
    // membuat arraylist objek mobil
    ArrayList<Mobil> listMobil;
    // menentukan nama-nama pada kolom header tabel
    String header[] =  new String[] {"No", "Merk", "Plat", "Warna", "Jenis"};
    // deklarasi default table model
    DefaultTableModel dtm;
    // deklarasi variabel iterasi untuk melakukan perulangan pada data yang ada di dalam database
    int i = 0;

    /**
     * Creates new form main
     */
    public main() {
        initComponents();
        
        // membuat arrayList mobil
        listMobil = new ArrayList<>();
        // menentukan default table model dengan kolom dari array header dan jumlah kolom diset 0 terlebih dahulu
        dtm = new DefaultTableModel(header, 0);
        // set model dari tabel
        jTable1.setModel(dtm);
        // set lokasi munculnya window agar berada di tengah
        this.setLocationRelativeTo(null);
        
        // mengeset tombol form untuk dapat dilihat, selebihnya (tombol lain) di-hide terlebih dahulu
        jButtonForm.setVisible(true);
        jButtonTable.setVisible(false);
        jButtonInfo.setVisible(false);
        
        // dan visibility dari segala panel dinonaktifkan dulu
        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
        jPanel4.setVisible(false);
        
        // mengeset combo box jenis mobil sebagai -1 terlebih dahulu (alias kosong)
        jComboBoxJenis.setSelectedIndex(-1);
        
        // deklarasi model kolom pada tabel
        TableColumnModel columns = jTable1.getColumnModel();
        // mengeset cell pada tabel secara individual
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        // bahwa tulisan di dalam cell harus berada di tengah (agar lebih estetik)
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        // dengan cara mengeset cell untuk kolom ke-0, 3, dan 4. (kolom-kolom sisanya ngga, karena bakal jelek)
        columns.getColumn(0).setCellRenderer(centerRenderer);
        columns.getColumn(3).setCellRenderer(centerRenderer);
        columns.getColumn(4).setCellRenderer(centerRenderer);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonForm = new javax.swing.JButton();
        jButtonInfo = new javax.swing.JButton();
        jButtonTable = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabelMerk = new javax.swing.JLabel();
        jLabelPlat = new javax.swing.JLabel();
        jLabelWarna = new javax.swing.JLabel();
        jLabelJenis = new javax.swing.JLabel();
        jTextFieldMerk = new javax.swing.JTextField();
        jTextFieldPlat = new javax.swing.JTextField();
        jTextFieldWarna = new javax.swing.JTextField();
        jComboBoxJenis = new javax.swing.JComboBox<>();
        jButtonSubmit = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Selamat Datang");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(187, 109, 95));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("di Aplikasi Pendataan Mobil");

        jPanel1.setBackground(new java.awt.Color(187, 109, 95));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(252, 250, 235));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("D A T A    M O B I L");

        jButtonForm.setBackground(new java.awt.Color(157, 212, 206));
        jButtonForm.setForeground(new java.awt.Color(102, 102, 102));
        jButtonForm.setText("F o r m");
        jButtonForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFormActionPerformed(evt);
            }
        });

        jButtonInfo.setBackground(new java.awt.Color(157, 212, 206));
        jButtonInfo.setForeground(new java.awt.Color(102, 102, 102));
        jButtonInfo.setText("I n f o");
        jButtonInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInfoActionPerformed(evt);
            }
        });

        jButtonTable.setBackground(new java.awt.Color(157, 212, 206));
        jButtonTable.setForeground(new java.awt.Color(102, 102, 102));
        jButtonTable.setText("T a b l e");
        jButtonTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonForm, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonTable, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jButtonInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE))
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonForm, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonTable, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(252, 250, 235));

        jLabelMerk.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelMerk.setForeground(new java.awt.Color(51, 51, 51));
        jLabelMerk.setText("Merk    :");

        jLabelPlat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelPlat.setForeground(new java.awt.Color(51, 51, 51));
        jLabelPlat.setText("Plat      :");

        jLabelWarna.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelWarna.setForeground(new java.awt.Color(51, 51, 51));
        jLabelWarna.setText("Warna  :");

        jLabelJenis.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelJenis.setForeground(new java.awt.Color(51, 51, 51));
        jLabelJenis.setText("Jenis     :");

        jComboBoxJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Biasa", "Balap", "Sport", "Truck" }));

        jButtonSubmit.setBackground(new java.awt.Color(157, 212, 206));
        jButtonSubmit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonSubmit.setText("S U B M I T");
        jButtonSubmit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelPlat, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldPlat, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelMerk, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldMerk, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelWarna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelJenis, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldWarna, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                                    .addComponent(jComboBoxJenis, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jButtonSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMerk, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMerk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPlat, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPlat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelWarna, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldWarna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxJenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(101, 101, 101)
                .addComponent(jButtonSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(237, 159, 97));

        jTable1.setBackground(new java.awt.Color(252, 250, 235));
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
        jTable1.setGridColor(new java.awt.Color(187, 109, 95));
        jTable1.setRowHeight(20);
        jTable1.setSelectionBackground(new java.awt.Color(187, 109, 95));
        jTable1.setSelectionForeground(new java.awt.Color(252, 250, 235));
        jTable1.setShowGrid(true);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 170, 156));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Created by:");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Hikmawati Fajriah Ayu Wardana");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("1903510");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/MyProfile_Resize.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(211, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(70, 70, 70)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE))
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(263, 263, 263)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(282, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 136, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 136, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // prosedur untuk memproses ketika button form diklik user
    private void jButtonFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFormActionPerformed
        // TODO add your handling code here:
        // menampilkan panel 2 (alias panel form) dan menyembunyikan panel lainnya
        jPanel2.setVisible(true);
        jPanel3.setVisible(false);
        jPanel4.setVisible(false);
        
        // menyembunyikan label 2 dan label 3 (ucapan selamat datang di pendataan mobil)
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
    }//GEN-LAST:event_jButtonFormActionPerformed

    // prosedur untuk memproses ketika button table diklik user
    private void jButtonTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTableActionPerformed
        // TODO add your handling code here:
        // menampilkan panel 3 (alias panel table) dan menyembunyikan panel lainnya
        jPanel3.setVisible(true);
        jPanel2.setVisible(false);
        jPanel4.setVisible(false);

        bacaData();
    }//GEN-LAST:event_jButtonTableActionPerformed

    // prosedur untuk memproses ketika button info diklik user
    private void jButtonInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInfoActionPerformed
        // TODO add your handling code here:
        // menampilkan panel 4 (alias panel info) dan menyembunyikan panel lainnya
        jPanel4.setVisible(true);
        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
    }//GEN-LAST:event_jButtonInfoActionPerformed

    // prosedur untuk memproses ketika button submit pada panel form diklik user
    private void jButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitActionPerformed
        // TODO add your handling code here:
        // mengambil merk yg diinputkan user dari text field
        String merk = jTextFieldMerk.getText();
        // mengambil plat yg diinputkan user dari text field
        String plat = jTextFieldPlat.getText();
        // mengambil warna yg diinputkan user dari text field
        String warna = jTextFieldWarna.getText();
        // mengambil jenis yg dipilih user dari combo box
        String jenis = (String) jComboBoxJenis.getSelectedItem();
           
        // jika user menekan tombol submit padahal isi dari text field masih ada yg kosong dan combo box belum dipilih
        if(merk.isEmpty() || plat.isEmpty() || warna.isEmpty() || jenis == null){
            // return 0 alias tindakan user tidak diproses lebih lanjut
            return;
        }
        
        // memanggil prosedur untuk menambahkan data inputan user di atas ke database
        tambahData(merk, plat, warna, jenis);
        
        // mereset text field dan combobox menjadi kosong kembali seperti awal mula
        jTextFieldMerk.setText("");
        jTextFieldPlat.setText("");
        jTextFieldWarna.setText("");
        jComboBoxJenis.setSelectedIndex(-1);
        
        // menampilkan tombol table dan tombol info
        jButtonTable.setVisible(true);
        jButtonInfo.setVisible(true);
    }//GEN-LAST:event_jButtonSubmitActionPerformed

    // prosedur untuk menambahkan data inputan user ke database
    private void tambahData(String merk, String plat, String warna, String jenis){
        try {
            // melakukan koneksi ke database
            Connection conn = Koneksi.getConnection();
            // melakukan query insert data ke tabel di database 
            // dimana query yg digunakan menggunakan PreparedStatement karena isi dari syntax sql bagian VALUES nya belum dapat diisi
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO tb_mobil(merk, plat, warna, jenis) VALUES (?, ?, ?, ?)");
            // mengeset nilai dari syntax VALUES mysql yg belun diisi di atas
            stmt.setString(1, merk); // isi value merk
            stmt.setString(2, plat); // isi value plat
            stmt.setString(3, warna); // isi value warna
            stmt.setString(4, jenis); // isi value jenis
            // mendapatkan affected rows
            stmt.executeUpdate();
        } catch(SQLException e){
            // kalau terjadi error maka menampilkan pesan bawaannya
            System.out.println(e.getMessage());
        }
    }
    
    private void bacaData(){
        try{
            // melakukan koneksi ke database
            Connection conn = Koneksi.getConnection();
            // melakukan query ke tabel dalam database 
            Statement stmt = conn.createStatement();
            // menuliskan syntax query select sql
            String query = "SELECT * FROM tb_mobil";
            // mengeksekusi query
            ResultSet res = stmt.executeQuery(query);
            
            // mengeset jumlah row menjadi 0 setiap kali button table dieksekusi (agar jumlah row tidak duplicate terus menerus)
            dtm.setRowCount(0);
            // set variabel idx sebagai penomoran pada tabel, yg dimulai dari 0
            int idx = 0;
            // menampilkan data hasil query dari database
            while(res.next()){
                // menampung value merk, plat, warna, dan jenis
                String dtMerk = res.getString("merk");
                String dtPlat = res.getString("plat");
                String dtWarna = res.getString("warna");
                String dtJenis = res.getString("jenis");
                
                // instansiasi objek  mobil dengan memasukkan value atribut dari hasil query database ke dalam objek Mobil
                Mobil oMobil = new Mobil(dtMerk, dtPlat, dtWarna, dtJenis);
                // memasukkan objek mobil ke arrayList objek mobil
                listMobil.add(oMobil); 
                // deklarasi array of object untuk menampung data berupa nomor tabel beserta nilai atribut objek Mobil untuk dimasukkan sbg record di tabel
                Object[] objs = {idx+1, listMobil.get(i).getMerk(), listMobil.get(i).getPlat(), listMobil.get(i).getWarna(), listMobil.get(i).getJenis()};
                // memasukkan data objs sebagai record untuk tampilan tabel di panel tabel
                dtm.addRow(objs);
                // iterasi nilai i untuk menampilkan atribut dari objek mobil selanjutnya
                i++;
                // iterasi nilai idx sebagai penomoran pada tabel
                idx++;
            }
        }
        catch (SQLException e){
            // kalau terjadi error maka menampilkan pesan bawaannya
            System.out.println(e.getMessage());
        }
    }
    
    
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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonForm;
    private javax.swing.JButton jButtonInfo;
    private javax.swing.JButton jButtonSubmit;
    private javax.swing.JButton jButtonTable;
    private javax.swing.JComboBox<String> jComboBoxJenis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelJenis;
    private javax.swing.JLabel jLabelMerk;
    private javax.swing.JLabel jLabelPlat;
    private javax.swing.JLabel jLabelWarna;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldMerk;
    private javax.swing.JTextField jTextFieldPlat;
    private javax.swing.JTextField jTextFieldWarna;
    // End of variables declaration//GEN-END:variables
}
