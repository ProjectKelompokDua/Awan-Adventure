import com.mysql.cj.jdbc.Driver;
import java.awt.Frame;
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
        id_barang = new javax.swing.JLabel();
        txt_stok = new javax.swing.JTextField();
        txt_namaBarang = new javax.swing.JTextField();
        txt_harga1 = new javax.swing.JTextField();
        txt_harga2 = new javax.swing.JTextField();
        Terang = new javax.swing.JTextField();
        txt_cari = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_barang = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btn_tambah = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        btn_beranda = new javax.swing.JButton();
        btn_kasir = new javax.swing.JButton();
        btn_dataBarang = new javax.swing.JButton();
        btn_sewa = new javax.swing.JButton();
        btn_return = new javax.swing.JButton();
        btn_pengguna = new javax.swing.JButton();
        btn_report = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        minimize = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

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
        id_barang.setBounds(870, 290, 43, 16);
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
        txt_cari.setBounds(920, 470, 240, 30);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2);
        jPanel2.setBounds(1110, 30, 80, 30);

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
        jScrollPane2.setBounds(230, 510, 930, 140);

        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        exit.setFont(new java.awt.Font("Outfit Black", 0, 24)); // NOI18N
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setText("X");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(1160, 0, 40, 30);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Proses"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_tambah.setBackground(new java.awt.Color(252, 191, 74));
        btn_tambah.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_tambah.setText("Tambah");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });
        jPanel1.add(btn_tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 100, 40));

        btn_edit.setBackground(new java.awt.Color(252, 191, 74));
        btn_edit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_edit.setText("Edit");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        jPanel1.add(btn_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 100, 40));

        btn_hapus.setBackground(new java.awt.Color(252, 191, 74));
        btn_hapus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_hapus.setText("Hapus");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });
        jPanel1.add(btn_hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 100, 40));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(800, 160, 370, 90);

        jPanel9.setBackground(new java.awt.Color(252, 191, 73));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Outfit Medium", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Awan Adventure");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel9);
        jPanel9.setBounds(0, 0, 190, 120);

        jPanel8.setBackground(new java.awt.Color(248, 221, 113));

        btn_beranda.setBackground(new java.awt.Color(248, 221, 113));
        btn_beranda.setFont(new java.awt.Font("Outfit", 0, 14)); // NOI18N
        btn_beranda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/home.png"))); // NOI18N
        btn_beranda.setText("Beranda");
        btn_beranda.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 15, 1, 1, new java.awt.Color(248, 221, 113)));
        btn_beranda.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_beranda.setIconTextGap(12);
        btn_beranda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_berandaMouseClicked(evt);
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
        btn_kasir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_kasirMouseClicked(evt);
            }
        });

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
        btn_sewa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_sewaMouseClicked(evt);
            }
        });

        btn_return.setBackground(new java.awt.Color(248, 221, 113));
        btn_return.setFont(new java.awt.Font("Outfit", 0, 14)); // NOI18N
        btn_return.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/product-return-removebg-preview.png"))); // NOI18N
        btn_return.setText("Form Pengembalian");
        btn_return.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 15, 1, 1, new java.awt.Color(248, 221, 113)));
        btn_return.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_return.setIconTextGap(12);
        btn_return.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_returnMouseClicked(evt);
            }
        });

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
            .addComponent(btn_return, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
            .addComponent(btn_pengguna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_report, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btn_beranda, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
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
                .addGap(101, 101, 101))
        );

        getContentPane().add(jPanel8);
        jPanel8.setBounds(0, 120, 190, 560);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5);
        jPanel5.setBounds(1030, 10, 80, 60);

        jLabel14.setFont(new java.awt.Font("Outfit", 0, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 0, 51));
        jLabel14.setText("Logout");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel14);
        jLabel14.setBounds(1100, 84, 70, 30);

        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        minimize.setFont(new java.awt.Font("Outfit Black", 0, 24)); // NOI18N
        minimize.setText("-");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(minimize)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(1120, 0, 40, 30);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dataBarang.jpg"))); // NOI18N
        bg.setText("jLabel1");
        getContentPane().add(bg);
        bg.setBounds(190, 0, 1010, 670);

        setSize(new java.awt.Dimension(1200, 675));
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
            ResultSet res = statement.executeQuery("select * from data_barang where id_barang like '%"+txt_cari.getText()+"%'"); 
             
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
            System.out.println(e);
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
                Terang.requestFocus();
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

    private void btn_kasirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_kasirMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new FormKasir().setVisible(true);
    }//GEN-LAST:event_btn_kasirMouseClicked

    private void btn_sewaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sewaMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new DataSewaan().setVisible(true);
    }//GEN-LAST:event_btn_sewaMouseClicked

    private void btn_returnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_returnMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new FormPengembalian().setVisible(true);
    }//GEN-LAST:event_btn_returnMouseClicked

    private void btn_penggunaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_penggunaMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new Pengguna().setVisible(true);
    }//GEN-LAST:event_btn_penggunaMouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        // TODO add your handling code here:
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        // TODO add your handling code here:
        int confirmExit = JOptionPane.showConfirmDialog(rootPane, "Yakin ingin keluar ?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if(confirmExit == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jPanel3MouseClicked

    private void btn_berandaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_berandaMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new Dashboard().setVisible(true);
    }//GEN-LAST:event_btn_berandaMouseClicked

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
    private javax.swing.JLabel bg;
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
    private javax.swing.JLabel exit;
    private javax.swing.JLabel id_barang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel minimize;
    private javax.swing.JTable table_barang;
    private javax.swing.JTextField txt_cari;
    private javax.swing.JTextField txt_harga1;
    private javax.swing.JTextField txt_harga2;
    private javax.swing.JTextField txt_namaBarang;
    private javax.swing.JTextField txt_stok;
    // End of variables declaration//GEN-END:variables
}
