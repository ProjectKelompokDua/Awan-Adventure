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

        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_stok = new javax.swing.JTextField();
        txt_namaBarang = new javax.swing.JTextField();
        txt_harga1 = new javax.swing.JTextField();
        txt_harga2 = new javax.swing.JTextField();
        txt_cari = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_barang = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        btn_beranda = new javax.swing.JButton();
        btn_kasir = new javax.swing.JButton();
        btn_dataBarang = new javax.swing.JButton();
        btn_sewa = new javax.swing.JButton();
        btn_return = new javax.swing.JButton();
        btn_pengguna = new javax.swing.JButton();
        btn_report = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Terang = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        btn_tambah = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel6.setFont(new java.awt.Font("Outfit", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Keterangan");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(250, 320, 100, 21);

        jLabel5.setFont(new java.awt.Font("Outfit", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Harga < 2 hari");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(250, 280, 110, 30);

        jLabel4.setFont(new java.awt.Font("Outfit", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Harga 1 Hari");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(250, 240, 100, 30);

        jLabel3.setFont(new java.awt.Font("Outfit", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Stok");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(250, 200, 40, 30);

        jLabel2.setFont(new java.awt.Font("Outfit", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nama Barang");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(250, 160, 100, 30);

        txt_stok.setBackground(new java.awt.Color(255, 255, 255));
        txt_stok.setFont(new java.awt.Font("Outfit", 0, 16)); // NOI18N
        txt_stok.setForeground(new java.awt.Color(0, 0, 0));
        txt_stok.setBorder(null);
        getContentPane().add(txt_stok);
        txt_stok.setBounds(400, 200, 310, 30);

        txt_namaBarang.setBackground(new java.awt.Color(255, 255, 255));
        txt_namaBarang.setFont(new java.awt.Font("Outfit", 0, 16)); // NOI18N
        txt_namaBarang.setForeground(new java.awt.Color(0, 0, 0));
        txt_namaBarang.setBorder(null);
        getContentPane().add(txt_namaBarang);
        txt_namaBarang.setBounds(400, 160, 310, 30);

        txt_harga1.setBackground(new java.awt.Color(255, 255, 255));
        txt_harga1.setFont(new java.awt.Font("Outfit", 0, 16)); // NOI18N
        txt_harga1.setForeground(new java.awt.Color(0, 0, 0));
        txt_harga1.setBorder(null);
        getContentPane().add(txt_harga1);
        txt_harga1.setBounds(400, 240, 310, 30);

        txt_harga2.setBackground(new java.awt.Color(255, 255, 255));
        txt_harga2.setFont(new java.awt.Font("Outfit", 0, 16)); // NOI18N
        txt_harga2.setForeground(new java.awt.Color(0, 0, 0));
        txt_harga2.setBorder(null);
        getContentPane().add(txt_harga2);
        txt_harga2.setBounds(400, 280, 310, 30);

        txt_cari.setBackground(new java.awt.Color(255, 255, 255));
        txt_cari.setFont(new java.awt.Font("Outfit", 0, 16)); // NOI18N
        txt_cari.setForeground(new java.awt.Color(0, 0, 0));
        txt_cari.setBorder(null);
        txt_cari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_cariKeyReleased(evt);
            }
        });
        getContentPane().add(txt_cari);
        txt_cari.setBounds(910, 430, 240, 30);

        table_barang.setBackground(new java.awt.Color(255, 255, 255));
        table_barang.setFont(new java.awt.Font("Outfit", 0, 16)); // NOI18N
        table_barang.setForeground(new java.awt.Color(0, 0, 0));
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
        jScrollPane2.setBounds(250, 480, 900, 180);

        jPanel8.setBackground(new java.awt.Color(248, 221, 113));

        btn_beranda.setBackground(new java.awt.Color(248, 221, 113));
        btn_beranda.setFont(new java.awt.Font("Outfit", 0, 14)); // NOI18N
        btn_beranda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/home.png"))); // NOI18N
        btn_beranda.setText("Beranda");
        btn_beranda.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 15, 1, 1, new java.awt.Color(248, 221, 113)));
        btn_beranda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_beranda.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_beranda.setIconTextGap(12);
        btn_beranda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_berandaActionPerformed(evt);
            }
        });

        btn_kasir.setBackground(new java.awt.Color(248, 221, 113));
        btn_kasir.setFont(new java.awt.Font("Outfit", 0, 14)); // NOI18N
        btn_kasir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/trolley-removebg-preview.png"))); // NOI18N
        btn_kasir.setText("Form Kasir");
        btn_kasir.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 15, 1, 1, new java.awt.Color(248, 221, 113)));
        btn_kasir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_kasir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_kasir.setIconTextGap(12);

        btn_dataBarang.setBackground(new java.awt.Color(248, 221, 113));
        btn_dataBarang.setFont(new java.awt.Font("Outfit", 0, 14)); // NOI18N
        btn_dataBarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/package.png"))); // NOI18N
        btn_dataBarang.setText("Data Barang");
        btn_dataBarang.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 15, 1, 1, new java.awt.Color(248, 221, 113)));
        btn_dataBarang.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_dataBarang.setIconTextGap(12);

        btn_sewa.setBackground(new java.awt.Color(248, 221, 113));
        btn_sewa.setFont(new java.awt.Font("Outfit", 0, 14)); // NOI18N
        btn_sewa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/rent-removebg-preview.png"))); // NOI18N
        btn_sewa.setText("Data Sewaan");
        btn_sewa.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 15, 1, 1, new java.awt.Color(248, 221, 113)));
        btn_sewa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_sewa.setIconTextGap(12);

        btn_return.setBackground(new java.awt.Color(248, 221, 113));
        btn_return.setFont(new java.awt.Font("Outfit", 0, 14)); // NOI18N
        btn_return.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/product-return-removebg-preview.png"))); // NOI18N
        btn_return.setText("Form Pengembalian");
        btn_return.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 15, 1, 1, new java.awt.Color(248, 221, 113)));
        btn_return.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_return.setIconTextGap(12);

        btn_pengguna.setBackground(new java.awt.Color(248, 221, 113));
        btn_pengguna.setFont(new java.awt.Font("Outfit", 0, 14)); // NOI18N
        btn_pengguna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user-removebg-preview.png"))); // NOI18N
        btn_pengguna.setText("Pengguna");
        btn_pengguna.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 15, 1, 1, new java.awt.Color(248, 221, 113)));
        btn_pengguna.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_pengguna.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_pengguna.setIconTextGap(12);
        btn_pengguna.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_penggunaMouseClicked(evt);
            }
        });

        btn_report.setBackground(new java.awt.Color(248, 221, 113));
        btn_report.setFont(new java.awt.Font("Outfit", 0, 14)); // NOI18N
        btn_report.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/report-removebg-preview.png"))); // NOI18N
        btn_report.setText("Laporan");
        btn_report.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 15, 1, 1, new java.awt.Color(248, 221, 113)));
        btn_report.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_report.setIconTextGap(12);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_beranda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_kasir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_dataBarang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_sewa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_return, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            .addComponent(btn_pengguna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_report, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btn_beranda, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_kasir, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_dataBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_sewa, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_return, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_pengguna, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_report, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
        );

        getContentPane().add(jPanel8);
        jPanel8.setBounds(0, 120, 200, 560);

        jPanel9.setBackground(new java.awt.Color(252, 191, 73));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setText("Awan Adventure");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel1))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel21)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel21)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel9);
        jPanel9.setBounds(0, 0, 200, 120);

        Terang.setBackground(new java.awt.Color(255, 255, 255));
        Terang.setColumns(20);
        Terang.setFont(new java.awt.Font("Outfit", 0, 14)); // NOI18N
        Terang.setForeground(new java.awt.Color(0, 0, 0));
        Terang.setRows(5);
        jScrollPane1.setViewportView(Terang);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(400, 330, 310, 130);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Proses"));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_tambah.setBackground(new java.awt.Color(252, 191, 74));
        btn_tambah.setFont(new java.awt.Font("Outfit", 0, 16)); // NOI18N
        btn_tambah.setForeground(new java.awt.Color(0, 0, 0));
        btn_tambah.setText("Tambah");
        btn_tambah.setBorder(null);
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });
        jPanel1.add(btn_tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 90, 40));

        btn_edit.setBackground(new java.awt.Color(252, 191, 74));
        btn_edit.setFont(new java.awt.Font("Outfit", 0, 16)); // NOI18N
        btn_edit.setForeground(new java.awt.Color(0, 0, 0));
        btn_edit.setText("Edit");
        btn_edit.setBorder(null);
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        jPanel1.add(btn_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 90, 40));

        btn_hapus.setBackground(new java.awt.Color(252, 191, 74));
        btn_hapus.setFont(new java.awt.Font("Outfit", 0, 16)); // NOI18N
        btn_hapus.setForeground(new java.awt.Color(0, 0, 0));
        btn_hapus.setText("Hapus");
        btn_hapus.setBorder(null);
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });
        jPanel1.add(btn_hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 90, 40));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(800, 160, 350, 90);

        jLabel8.setFont(new java.awt.Font("Outfit", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dataBarang.jpg"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(200, 0, 1000, 670);

        setSize(new java.awt.Dimension(1200, 675));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
try{
        String sql = "DELETE FROM data_barang Where id_barang = ?,'";
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
                String insertdata = "update data_barang set nama_barang='"+ txt_namaBarang.getText() +"',stok='"+ txt_stok.getText() +"', harga_hari='"+ txt_harga1.getText() +"', harga_2hari='"+ txt_harga2.getText() +"', keterangan='"+ Terang.getText() +"'"; 
                Connection connect = koneksi.Connect.GetConnection(); 
                PreparedStatement ps = connect.prepareStatement(insertdata); 
                ps.execute(); 
                 
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
        
    }//GEN-LAST:event_table_barangMouseClicked

    private void btn_berandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_berandaActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Dashboard().setVisible(true);
    }//GEN-LAST:event_btn_berandaActionPerformed

    private void btn_penggunaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_penggunaMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new Pengguna().setVisible(true);
    }//GEN-LAST:event_btn_penggunaMouseClicked

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
    private javax.swing.JTextArea Terang;
    private javax.swing.JButton btn_beranda;
    private javax.swing.JButton btn_dataBarang;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_kasir;
    private javax.swing.JButton btn_pengguna;
    private javax.swing.JButton btn_report;
    private javax.swing.JButton btn_return;
    private javax.swing.JButton btn_sewa;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table_barang;
    private javax.swing.JTextField txt_cari;
    private javax.swing.JTextField txt_harga1;
    private javax.swing.JTextField txt_harga2;
    private javax.swing.JTextField txt_namaBarang;
    private javax.swing.JTextField txt_stok;
    // End of variables declaration//GEN-END:variables
}
