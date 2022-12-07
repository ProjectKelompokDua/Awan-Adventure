import com.mysql.cj.jdbc.Driver;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import koneksi.Connect;

public class DataBarang extends javax.swing.JFrame {
    
    private void bersih(){
    txt_cari.setText("");
    txt_stok.setText("");
    txt_harga1.setText("");
    txt_harga2.setText("");
    Terang.setText("");
}

   
        private void load_table(){
            
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("No");
            model.addColumn("ID Barang");
            model.addColumn("Nama Barang");
            model.addColumn("Stok");
            model.addColumn("Harga 1 Hari");
            model.addColumn("Harga < 2 Hari");
            model.addColumn("Keterangan");
            
            try{
                int no = 1;
                String sql = "SELECT * FROM data_barang";
                java.sql.Connection conn=(Connection)Connect.GetConnection();
                java.sql.Statement pst = conn.createStatement();
                java.sql.ResultSet res = pst.executeQuery(sql);
                while(res.next()){
                    model.addRow(new Object[]{no++,res.getString(1),res.getString(2),res.getString(3)
                    ,res.getString(4),res.getString(5),res.getString(6)
                    });
                }
                table_barang.setModel(model);
              
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            
            
        }
            private void kosong(){
                txt_namaBarang.setText(null);
                txt_stok.setText(null);
                txt_harga1.setText(null);
                txt_harga2.setText(null);
                Terang.setText(null);
            }
    
    public DataBarang() {
        initComponents();
        load_table();
        kosong();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        id_barang = new javax.swing.JLabel();
        btn_cari = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_tambah = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        txt_stok = new javax.swing.JTextField();
        txt_namaBarang = new javax.swing.JTextField();
        txt_harga1 = new javax.swing.JTextField();
        txt_harga2 = new javax.swing.JTextField();
        Terang = new javax.swing.JTextField();
        txt_cari = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        btn_beranda = new javax.swing.JButton();
        btn_databarang = new javax.swing.JButton();
        btn_datasewa = new javax.swing.JButton();
        btn_pengguna = new javax.swing.JButton();
        btn_kasir = new javax.swing.JButton();
        btn_pengembalian = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_barang = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Proses");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(690, 160, 40, 16);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Keterangan");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(220, 340, 80, 16);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Harga < 2 hari");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(220, 290, 90, 16);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Harga 1 Hari");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(220, 240, 70, 16);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Stok");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(220, 200, 30, 16);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Nama Barang");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(220, 160, 100, 20);

        id_barang.setForeground(new java.awt.Color(242, 242, 242));
        id_barang.setText("jLabel21");
        getContentPane().add(id_barang);
        id_barang.setBounds(870, 290, 45, 16);

        btn_cari.setBackground(new java.awt.Color(252, 191, 74));
        btn_cari.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_cari.setText("Cari");
        getContentPane().add(btn_cari);
        btn_cari.setBounds(1040, 540, 80, 30);

        btn_edit.setBackground(new java.awt.Color(252, 191, 74));
        btn_edit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_edit.setText("Edit");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        getContentPane().add(btn_edit);
        btn_edit.setBounds(800, 200, 80, 30);

        btn_tambah.setBackground(new java.awt.Color(252, 191, 74));
        btn_tambah.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_tambah.setText("Tambah");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });
        getContentPane().add(btn_tambah);
        btn_tambah.setBounds(690, 200, 100, 30);

        btn_hapus.setBackground(new java.awt.Color(252, 191, 74));
        btn_hapus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_hapus.setText("Hapus");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });
        getContentPane().add(btn_hapus);
        btn_hapus.setBounds(890, 200, 80, 30);
        getContentPane().add(txt_stok);
        txt_stok.setBounds(330, 200, 310, 30);
        getContentPane().add(txt_namaBarang);
        txt_namaBarang.setBounds(330, 160, 310, 30);
        getContentPane().add(txt_harga1);
        txt_harga1.setBounds(330, 240, 310, 30);
        getContentPane().add(txt_harga2);
        txt_harga2.setBounds(330, 290, 310, 30);
        getContentPane().add(Terang);
        Terang.setBounds(330, 340, 310, 120);

        txt_cari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_cariKeyReleased(evt);
            }
        });
        getContentPane().add(txt_cari);
        txt_cari.setBounds(730, 540, 240, 30);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 0, 51));
        jLabel14.setText("Logout");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        getContentPane().add(jPanel2);
        jPanel2.setBounds(860, 0, 150, 60);

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        jPanel1.setLayout(null);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/home.png"))); // NOI18N
        jPanel1.add(jLabel21);
        jLabel21.setBounds(10, 0, 72, 60);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/trolley-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel22);
        jLabel22.setBounds(10, 80, 50, 40);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/rent-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel23);
        jLabel23.setBounds(10, 230, 70, 30);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/package.png"))); // NOI18N
        jPanel1.add(jLabel24);
        jLabel24.setBounds(10, 150, 72, 50);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/product-return-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel25);
        jLabel25.setBounds(10, 280, 80, 60);

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel26);
        jLabel26.setBounds(10, 360, 72, 50);

        btn_beranda.setBackground(new java.awt.Color(255, 204, 102));
        btn_beranda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_beranda.setText("Beranda");
        btn_beranda.setBorder(null);
        btn_beranda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_berandaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_beranda);
        btn_beranda.setBounds(0, 0, 200, 70);

        btn_databarang.setBackground(new java.awt.Color(255, 204, 102));
        btn_databarang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_databarang.setText("Data Barang");
        btn_databarang.setBorder(null);
        jPanel1.add(btn_databarang);
        btn_databarang.setBounds(0, 140, 200, 70);

        btn_datasewa.setBackground(new java.awt.Color(255, 204, 102));
        btn_datasewa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_datasewa.setText("Data Penyewaan");
        btn_datasewa.setBorder(null);
        jPanel1.add(btn_datasewa);
        btn_datasewa.setBounds(10, 210, 200, 70);

        btn_pengguna.setBackground(new java.awt.Color(255, 204, 102));
        btn_pengguna.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_pengguna.setText("Pengguna");
        btn_pengguna.setBorder(null);
        btn_pengguna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_penggunaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_pengguna);
        btn_pengguna.setBounds(0, 350, 200, 70);

        btn_kasir.setBackground(new java.awt.Color(255, 204, 102));
        btn_kasir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_kasir.setText("Form Kasir");
        btn_kasir.setBorder(null);
        btn_kasir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kasirActionPerformed(evt);
            }
        });
        jPanel1.add(btn_kasir);
        btn_kasir.setBounds(0, 70, 200, 70);

        btn_pengembalian.setBackground(new java.awt.Color(255, 204, 102));
        btn_pengembalian.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_pengembalian.setText("Pengembalian");
        btn_pengembalian.setBorder(null);
        jPanel1.add(btn_pengembalian);
        btn_pengembalian.setBounds(0, 280, 200, 70);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 120, 200, 610);

        table_barang.setModel(new javax.swing.table.DefaultTableModel(
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
        table_barang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_barangMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table_barang);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(240, 600, 730, 390);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dataBarang.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -30, 1270, 720);

        setSize(new java.awt.Dimension(1030, 692));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
try{
        String sql = "DELETE FROM data_barang Where id_barang ='"+id_barang.getText()+"'";
        java.sql.Connection conn=(Connection)Connect.GetConnection();
        java.sql.PreparedStatement pst=conn.prepareStatement(sql);
        pst.execute();
        JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
        kosong();
        load_table();
                       
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
    }        
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
    try{
        String sql = "INSERT INTO data_barang VALUES (null,'"+txt_namaBarang.getText()+"','"
                +txt_stok.getText()+"','"+txt_harga1.getText()+"','"+txt_harga2.getText()+"','"
                +Terang.getText()+"')";
        java.sql.Connection conn=(Connection)Connect.GetConnection();
        java.sql.PreparedStatement pst=conn.prepareStatement(sql);
        pst.execute();
        JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
                       
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
    }
    load_table();
    kosong();
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void txt_cariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cariKeyReleased

        
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("ID Barang");
        dtm.addColumn("Nama Barang");
        dtm.addColumn("Stok");
        dtm.addColumn("harga 1 hari");
        dtm.addColumn("harga < 2 hari");
        dtm.addColumn("keterangan");
        table_barang.setModel(dtm);
        
        try { 
            Statement statement = (Statement)Connect.GetConnection().createStatement(); 
            ResultSet res = statement.executeQuery("select * from data_barang where id_barang like '%"+txt_cari.getText()+"%' or nama_barang like '%"+txt_cari.getText()+"%' or stok like '%"+txt_cari.getText()+"%'or harga_hari like '%"+txt_cari.getText()+"%'or harga_2hari like '%"+txt_cari.getText()+"%'"); 
             
            while(res.next()){ 
                dtm.addRow(new Object[]{ 
                    res.getString("ID Barang"), 
                    res.getString("Nama Barang"), 
                    res.getString("Stok"), 
                    res.getString("Harga 1 Hari"), 
                    res.getString("Harga 2 Hari"),
                    res.getString("Keterangan")
                }); 
                table_barang.setModel(dtm); 
            } 
        } catch(Exception e) { 

}
    }//GEN-LAST:event_txt_cariKeyReleased

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
     try{ 
            if(txt_namaBarang.getText().equals("")){ 
                JOptionPane.showMessageDialog(rootPane, "Data Nama harus diisi"); 
                txt_namaBarang.requestFocus(); 
            }else if(txt_stok.getText().equals("")){ 
                JOptionPane.showMessageDialog(rootPane, "Data Stok harus diisi"); 
                txt_stok.requestFocus(); 
            }else if(txt_harga1.getText().equals("")){ 
                JOptionPane.showMessageDialog(rootPane, "Data Harga 1 hari harus diisi"); 
                txt_harga1.requestFocus(); 
            }else if(txt_harga2.getText().equals("")){ 
                JOptionPane.showMessageDialog(rootPane, "Data Alamat harus diisi"); 
                txt_harga2.requestFocus(); 
            }else if(Terang.getText().equals("")){ 
                JOptionPane.showMessageDialog(rootPane, "Data Password harus diisi"); 
            }else{ 
                String insertdata = "update data_barang set nama_barang='"+ txt_namaBarang.getText() 
                        +"',stok='"+ txt_stok.getText() +"', harga_hari='"+ txt_harga1.getText() 
                        +"', harga_2hari='"+ txt_harga2.getText() +"', keterangan='"+ Terang.getText() 
                        +"', where id_barang='"+id_barang.getText()+"'";
                
                Connection connect = koneksi.Connect.GetConnection(); 
                PreparedStatement ps = connect.prepareStatement(insertdata); 
                ps.executeUpdate(); 
                 
                JOptionPane.showMessageDialog(rootPane, "Data Barang berhasil diperbarui"); 
                 } 
        }catch(Exception e){ 
            JOptionPane.showMessageDialog(rootPane, "Error"); 
            System.out.println(e.getMessage()); 
        }
          
        
    }//GEN-LAST:event_btn_editActionPerformed
    
    private void table_barangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_barangMouseClicked
int i = table_barang.getSelectedRow(); 
        TableModel tbl = table_barang.getModel(); 
         
        String field1 = tbl.getValueAt(i, 1).toString(); 
        String field2 = tbl.getValueAt(i, 2).toString(); 
        String field3 = tbl.getValueAt(i, 3).toString(); 
        String field4 = tbl.getValueAt(i, 4).toString(); 
        String field5 = tbl.getValueAt(i, 5).toString(); 
        String field6 = tbl.getValueAt(i, 6).toString(); 
        
        
        txt_namaBarang.setText(field2); 
        txt_stok.setText(field3);
        txt_harga1.setText(field4); 
        txt_harga2.setText(field5); 
        Terang.setText(field6); 
        
        try{
        String sql = "SELECT * FROM data_barang WHERE nama_barang ='"+field2+"'";
        Connection conn = koneksi.Connect.GetConnection();
        PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        rs.next();
        id_barang.setText(rs.getString("id_barang"));
        } catch(Exception e){
            
        }
    }//GEN-LAST:event_table_barangMouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
      int confirmLogout = JOptionPane.showConfirmDialog(rootPane, "Yakin ingin logout ?", "Logout", JOptionPane.YES_NO_OPTION);
        if(confirmLogout == JOptionPane.YES_OPTION){
            this.setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_jLabel14MouseClicked

    private void btn_berandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_berandaActionPerformed
       this.setVisible(false);
        new Dashboard().setVisible(true);
    }//GEN-LAST:event_btn_berandaActionPerformed

    private void btn_penggunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_penggunaActionPerformed
        this.setVisible(false);
        new Pengguna().setVisible(true);
    }//GEN-LAST:event_btn_penggunaActionPerformed

    private void btn_kasirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kasirActionPerformed
        this.setVisible(false);
        new FormKasir().setVisible(true);
    }//GEN-LAST:event_btn_kasirActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Terang;
    private javax.swing.JButton btn_beranda;
    private javax.swing.JButton btn_cari;
    private javax.swing.JButton btn_databarang;
    private javax.swing.JButton btn_datasewa;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_kasir;
    private javax.swing.JButton btn_pengembalian;
    private javax.swing.JButton btn_pengguna;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JLabel id_barang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table_barang;
    private javax.swing.JTextField txt_cari;
    private javax.swing.JTextField txt_harga1;
    private javax.swing.JTextField txt_harga2;
    private javax.swing.JTextField txt_namaBarang;
    private javax.swing.JTextField txt_stok;
    // End of variables declaration//GEN-END:variables
}
