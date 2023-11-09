/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package modul5;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author asus
 */
public class penjualan extends javax.swing.JFrame {
    DefaultComboBoxModel<String> modelcb = new DefaultComboBoxModel<>();
    int hargaBarang;
    /**
     * Creates new form penjualan
     */
    public penjualan() {
        initComponents();
        cbBarang.setModel(modelcb);
        modelcb.addElement(">>>> Pilih Barang <<<<");
        fillComboBox();
        tampil_data();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        NoPembelian = new javax.swing.JTextField();
        NamaBarang = new javax.swing.JTextField();
        NamaPembeli = new javax.swing.JTextField();
        KodeBarang = new javax.swing.JTextField();
        JumlahBarang = new javax.swing.JTextField();
        TotalHarga = new javax.swing.JTextField();
        TotalPembayaran = new javax.swing.JTextField();
        Kembalian = new javax.swing.JTextField();
        btDelete = new javax.swing.JButton();
        btUpdate = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        HargaBarang = new javax.swing.JTextField();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jData = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        cbBarang = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        tfKembalian = new javax.swing.JTextField();
        tfTotalHarga = new javax.swing.JTextField();
        tfTotalPembayaran = new javax.swing.JTextField();
        btReset = new javax.swing.JButton();
        btHitung = new javax.swing.JButton();
        btSimpan = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfHargaBarang = new javax.swing.JTextField();
        tfJumlahBarang = new javax.swing.JTextField();
        tfNoPembelian = new javax.swing.JTextField();
        tfKodeBarang = new javax.swing.JTextField();
        tfNamaPembeli = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        NoPembelian.setEditable(false);

        NamaBarang.setEditable(false);
        NamaBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaBarangActionPerformed(evt);
            }
        });

        NamaPembeli.setEditable(false);

        KodeBarang.setEditable(false);

        JumlahBarang.setEditable(false);

        TotalHarga.setEditable(false);

        TotalPembayaran.setEditable(false);

        Kembalian.setEditable(false);

        btDelete.setText("DELETE");
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });

        btUpdate.setText("UPDATE");
        btUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpdateActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("No Pembelian");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Nama Barang");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Kode Barang");

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Nama Pembeli");

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Jumlah Barang");

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Total Harga");

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Kembalian");

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Total Pembayaran");

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Harga Barang");

        HargaBarang.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12)
                            .addComponent(jLabel18))
                        .addGap(0, 59, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NoPembelian, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(KodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NamaPembeli, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btDelete)
                                .addGap(52, 52, 52)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel16))
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btUpdate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TotalPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JumlahBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(HargaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NoPembelian, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JumlahBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TotalPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NamaPembeli, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HargaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btUpdate)
                    .addComponent(btDelete))
                .addGap(24, 24, 24))
        );

        jInternalFrame1.setVisible(true);

        jData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No Pembeleian", "Nama Barang", "Kode Barang", "Nama Pembeli", "Harga Barang", "Jumlah Barang", "Total Harga", "Total Pembayaran", "Kembalian"
            }
        ));
        jData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jData);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jInternalFrame1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Informasi Data", jPanel3);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbBarang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ">>>> Pilih Barang <<<<" }));
        cbBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBarangActionPerformed(evt);
            }
        });
        jPanel2.add(cbBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 170, 36));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PILIH BARANG");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, -1, 36));

        tfKembalian.setEditable(false);
        tfKembalian.setBackground(new java.awt.Color(0, 204, 204));
        tfKembalian.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(tfKembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 144, 35));

        tfTotalHarga.setEditable(false);
        tfTotalHarga.setBackground(new java.awt.Color(0, 204, 204));
        tfTotalHarga.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(tfTotalHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 144, 35));
        jPanel2.add(tfTotalPembayaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 144, 35));

        btReset.setText("RESET");
        btReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResetActionPerformed(evt);
            }
        });
        jPanel2.add(btReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, -1, 30));

        btHitung.setText("HITUNG");
        btHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHitungActionPerformed(evt);
            }
        });
        jPanel2.add(btHitung, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, -1, 30));

        btSimpan.setText("SIMPAN");
        btSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSimpanActionPerformed(evt);
            }
        });
        jPanel2.add(btSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, -1, 30));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Kembalian");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 85, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Harga Barang");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 85, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nama Pembeli");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 85, -1));
        jPanel2.add(tfHargaBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 144, 35));
        jPanel2.add(tfJumlahBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 144, 35));
        jPanel2.add(tfNoPembelian, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 144, 35));
        jPanel2.add(tfKodeBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 144, 35));
        jPanel2.add(tfNamaPembeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 144, 35));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Kode Barang");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 85, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("No Pembelian");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 85, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Jumlah Barang");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 85, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Total Harga");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 85, -1));

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Total Pembayaran");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 110, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modul5/pngegg (38) (1).png"))); // NOI18N
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 140, 110));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modul5/pngegg (39) (1).png"))); // NOI18N
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 340, 420, 120));

        jTabbedPane1.addTab("Penjualan", jPanel2);

        jTabbedPane1.setSelectedIndex(1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NamaBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamaBarangActionPerformed

    private void btResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResetActionPerformed
        tfNoPembelian.setText("");
        tfKodeBarang.setText("");
        tfNamaPembeli.setText("");
        tfHargaBarang.setText("");
        tfJumlahBarang.setText("");
        tfTotalHarga.setText("");
        tfTotalPembayaran.setText("");
        tfKembalian.setText("");
        cbBarang.setSelectedIndex(0);
    }//GEN-LAST:event_btResetActionPerformed
    
    
    private void fillComboBox() {
        try {
            java.sql.Connection conn = modul5.Modul5.koneksiDB();
            String query = "SELECT nama_barang FROM data_barang";
            java.sql.PreparedStatement pst = conn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String item = rs.getString(1);
                if (!containsItem(item)) {
                    modelcb.addElement(item);
                }
            }
            
            rs.close();
            pst.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        
    }
    
    private boolean containsItem(String item) {
        for (int i = 0; i < modelcb.getSize(); i++) {
            if (modelcb.getElementAt(i).equals(item)) {
                return true;
            }
        }
        return false;
    }
    
    private void cbBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBarangActionPerformed
        String selectedBarang = (String) cbBarang.getSelectedItem();
        try {
            java.sql.Connection conn = modul5.Modul5.koneksiDB();
            String query = "SELECT kode_barang, harga_barang FROM data_barang WHERE nama_barang = ?";
            java.sql.PreparedStatement pst = conn.prepareStatement(query);
            pst.setString(1, selectedBarang);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                tfKodeBarang.setText(rs.getString("kode_barang"));
                hargaBarang = rs.getInt("harga_barang");
                tfHargaBarang.setText(String.valueOf(hargaBarang));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_cbBarangActionPerformed

    private void btHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHitungActionPerformed
        if (tfJumlahBarang.getText().isEmpty() || tfTotalPembayaran.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Masukkan Jumlah Pembelian dan Jumlah Pembayaran", "Tidak Boleh Kosong", JOptionPane.ERROR_MESSAGE);
        }else{
            int jumlahbeli = Integer.parseInt(tfJumlahBarang.getText());
            int totalharga = hargaBarang * jumlahbeli;
            int totalbayar = Integer.parseInt(tfTotalPembayaran.getText());
            int kembalian = totalbayar - totalharga;
            tfTotalHarga.setText(Integer.toString(totalharga));
            tfKembalian.setText(Integer.toString(kembalian));
        }
    }//GEN-LAST:event_btHitungActionPerformed

    private void btSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSimpanActionPerformed
        try{
            String sql = "insert into dbmodul5 values('"+tfNoPembelian.getText()+"', '"+tfKodeBarang.getText()+"', '"+cbBarang.getSelectedItem()+"', '"+tfHargaBarang.getText()+"', '"+tfNamaPembeli.getText()+"', '"+tfJumlahBarang.getText()+"', '"+tfTotalHarga.getText()+"', '"+tfTotalPembayaran.getText()+"', '"+tfKembalian.getText()+"')";
            java.sql.Connection conn = (java.sql.Connection)modul5.Modul5.koneksiDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil disimpan");
            btResetActionPerformed(evt);
            tampil_data();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Gagal disimpan");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btSimpanActionPerformed

    private void jDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDataMouseClicked
        DefaultTableModel modeldata = (DefaultTableModel) jData.getModel();
        int selectedRow = jData.getSelectedRow();
        if (selectedRow != -1) {
            NoPembelian.setText(modeldata.getValueAt(selectedRow, 0).toString());
            KodeBarang.setText(modeldata.getValueAt(selectedRow, 1).toString()); 
            NamaBarang.setText(modeldata.getValueAt(selectedRow, 2).toString());
            HargaBarang.setText(modeldata.getValueAt(selectedRow, 3).toString());
            NamaPembeli.setText(modeldata.getValueAt(selectedRow, 4).toString());
            JumlahBarang.setText(modeldata.getValueAt(selectedRow, 5).toString()); 
            TotalHarga.setText(modeldata.getValueAt(selectedRow, 6).toString()); 
            TotalPembayaran.setText(modeldata.getValueAt(selectedRow, 7).toString()); 
            Kembalian.setText(modeldata.getValueAt(selectedRow, 8).toString());
        }
    }//GEN-LAST:event_jDataMouseClicked

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        DefaultTableModel modeldata = (DefaultTableModel) jData.getModel();
        int selectedRow = jData.getSelectedRow();
        if (selectedRow != -1){
            try{
                String sql = "DELETE FROM dbmodul5 WHERE NoPembelian = '"+modeldata.getValueAt(selectedRow, 0)+"' ";
                java.sql.Connection conn = (java.sql.Connection)modul5.Modul5.koneksiDB();
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
                tampil_data();
                NoPembelian.setText("");
                KodeBarang.setText("");
                HargaBarang.setText("");
                NamaPembeli.setText("");
                JumlahBarang.setText("");
                TotalHarga.setText("");
                TotalPembayaran.setText("");
                Kembalian.setText("");
                NamaBarang.setText("");
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, "Gagal Dihapus");
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_btDeleteActionPerformed

    private void btUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateActionPerformed
        DefaultTableModel modeldata = (DefaultTableModel) jData.getModel();
        int selectedRow = jData.getSelectedRow();
        if (selectedRow != -1){
            try{
                String sql = "UPDATE dbmodul5 SET NoPembelian = '"+NoPembelian.getText()+"', KodeBarang = '"+KodeBarang.getText()+"',"
                        + "NamaBarang = '"+NamaBarang.getText()+"', HargaBarang = '"+HargaBarang.getText()+"', "
                        + "NamaPembeli = '"+NamaPembeli.getText()+"', JumlahPembelian = '"+JumlahBarang.getText()+"', "
                        + "TotalHarga = '"+TotalHarga.getText()+"', TotalPembayaran = '"+TotalPembayaran.getText()+"', "
                        + "Kembalian = '"+Kembalian.getText()+"'";
                java.sql.Connection conn = (java.sql.Connection)modul5.Modul5.koneksiDB();
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Berhasil Diupdate");
                tampil_data();
                NoPembelian.setText("");
                KodeBarang.setText("");
                HargaBarang.setText("");
                NamaPembeli.setText("");
                JumlahBarang.setText("");
                TotalHarga.setText("");
                TotalPembayaran.setText("");
                Kembalian.setText("");
                NamaBarang.setText("");
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, "Gagal Diupdate");
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_btUpdateActionPerformed
    
    public void tampil_data(){
        DefaultTableModel tabeldata = new DefaultTableModel();
        tabeldata.addColumn("No Pembelian");
        tabeldata.addColumn("Kode Barang");
        tabeldata.addColumn("Nama Barang");
        tabeldata.addColumn("Harga Barang");
        tabeldata.addColumn("Nama Pembeli");
        tabeldata.addColumn("Jumlah Pembelian");
        tabeldata.addColumn("Total Harga");
        tabeldata.addColumn("Total Bayar");
        tabeldata.addColumn("Kembalian");
        
        try{
            java.sql.Connection conn = modul5.Modul5.koneksiDB();
            String query = "select * from dbmodul5";
            java.sql.PreparedStatement pst = conn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()){
                Object[] row = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9)};
                tabeldata.addRow(row);
            }
            jData.setModel(tabeldata);
        }catch (Exception e){
            e.printStackTrace();
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
            java.util.logging.Logger.getLogger(penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new penjualan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField HargaBarang;
    private javax.swing.JTextField JumlahBarang;
    private javax.swing.JTextField Kembalian;
    private javax.swing.JTextField KodeBarang;
    private javax.swing.JTextField NamaBarang;
    private javax.swing.JTextField NamaPembeli;
    private javax.swing.JTextField NoPembelian;
    private javax.swing.JTextField TotalHarga;
    private javax.swing.JTextField TotalPembayaran;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btHitung;
    private javax.swing.JButton btReset;
    private javax.swing.JButton btSimpan;
    private javax.swing.JButton btUpdate;
    private javax.swing.JComboBox<String> cbBarang;
    private javax.swing.JTable jData;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField tfHargaBarang;
    private javax.swing.JTextField tfJumlahBarang;
    private javax.swing.JTextField tfKembalian;
    private javax.swing.JTextField tfKodeBarang;
    private javax.swing.JTextField tfNamaPembeli;
    private javax.swing.JTextField tfNoPembelian;
    private javax.swing.JTextField tfTotalHarga;
    private javax.swing.JTextField tfTotalPembayaran;
    // End of variables declaration//GEN-END:variables

    
}