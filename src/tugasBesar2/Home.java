package tugasBesar2;

import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author HP
 */
public class Home extends javax.swing.JFrame {
    
    private ResultSet rs;
    private PreparedStatement stat;
    koneksi k = new koneksi();

    public Home() {
        initComponents();
        k.connect();
    }

    class searchKaryawan {
        
        String name;
        
        public searchKaryawan() {
            this.name = txtSearchKaryawan.getText();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jButton1 = new javax.swing.JButton();
        btn_tambah_karyawan = new javax.swing.JButton();
        btn_cari_karyawan = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSearchKaryawan = new javax.swing.JTextField();
        btn_gaji_karyawan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Log Out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btn_tambah_karyawan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_tambah_karyawan.setText("Tambah Karyawan");
        btn_tambah_karyawan.setName("btnTambahKaryawan"); // NOI18N
        btn_tambah_karyawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambah_karyawanActionPerformed(evt);
            }
        });

        btn_cari_karyawan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_cari_karyawan.setText("Cari Karyawan");
        btn_cari_karyawan.setName("btnCariKaryawan"); // NOI18N
        btn_cari_karyawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cari_karyawanActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setText("SISTEM MANAJEMEN KARYAWAN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(133, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(132, 132, 132))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/User_Icon.png"))); // NOI18N

        txtSearchKaryawan.setName(""); // NOI18N
        txtSearchKaryawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchKaryawanActionPerformed(evt);
            }
        });

        btn_gaji_karyawan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_gaji_karyawan.setText("Hitung Gaji");
        btn_gaji_karyawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gaji_karyawanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(267, 267, 267))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_tambah_karyawan, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_cari_karyawan, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_gaji_karyawan, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(209, 209, 209))))
                    .addComponent(txtSearchKaryawan)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(txtSearchKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_cari_karyawan)
                .addGap(18, 18, 18)
                .addComponent(btn_tambah_karyawan)
                .addGap(18, 18, 18)
                .addComponent(btn_gaji_karyawan, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Login l = new Login();
        l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_tambah_karyawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambah_karyawanActionPerformed
        addEmployee add = new addEmployee();
        add.setVisible(true);
    }//GEN-LAST:event_btn_tambah_karyawanActionPerformed

    private void btn_cari_karyawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cari_karyawanActionPerformed
        searchKaryawan sk = new searchKaryawan();
        try {
            String query = "SELECT * FROM karyawan WHERE nama_lengkap LIKE '%" + sk.name + "%' LIMIT 1";
            this.stat = k.getCon().prepareStatement(query);
            this.rs = this.stat.executeQuery();
            if (!rs.isBeforeFirst()) {
                // No results, display a message
                JOptionPane.showMessageDialog(null, "No employee found", "No Results", JOptionPane.INFORMATION_MESSAGE);
            
            } else {
                while (rs.next()) {
                    String namaLengkap = rs.getString("nama_lengkap");
                    String jabatan = rs.getString("jabatan");
                    String alamat = rs.getString("alamat");
                    String email = rs.getString("email");
                    String telepon = rs.getString("telepon");
                    String nik = rs.getString("nik");
                    int gajiPokok = rs.getInt("gaji_pokok");

                    karyawan karyawan = new karyawan();

                    karyawan.setNamaLengkap(namaLengkap);
                    karyawan.setNik(nik);
                    karyawan.setJabatan(jabatan);
                    karyawan.setAlamat(alamat);
                    karyawan.setEmail(email);
                    karyawan.setTelepon(telepon);

                    karyawan.displayData();
                    karyawan.setVisible(true);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btn_cari_karyawanActionPerformed

    private void txtSearchKaryawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchKaryawanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchKaryawanActionPerformed

    private void btn_gaji_karyawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gaji_karyawanActionPerformed
        GajiKaryawan gaji = new GajiKaryawan();
        gaji.setVisible(true);
    }//GEN-LAST:event_btn_gaji_karyawanActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cari_karyawan;
    private javax.swing.JButton btn_gaji_karyawan;
    private javax.swing.JButton btn_tambah_karyawan;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JTextField txtSearchKaryawan;
    // End of variables declaration//GEN-END:variables
}
