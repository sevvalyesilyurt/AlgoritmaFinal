/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hastatakipsist;

import java.sql.*;
import javax.swing.JOptionPane;
import java.awt.event.*;
import Helper.*;
import java.awt.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 *
 * @author Aleyna
 */
public class login extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        conn = db.connection_db();
        Date();
        Clock();
        
        setSize(1300,810);
              
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
    }
    
    void Date(){
    Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        date.setText(s.format(d));
    
    }
    
    void Clock(){
    new Timer(0, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
           Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
        time.setText(s.format(d));
        }
    }).start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txt_sekreterkullanici = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txt_sekretersifre = new javax.swing.JPasswordField();
        sekretersifregoster = new javax.swing.JCheckBox();
        btn_sekretergiris = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_drkullanici = new javax.swing.JTextField();
        btn_drgiris = new javax.swing.JButton();
        txt_doktorsifre = new javax.swing.JPasswordField();
        doktorfisregoster = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txt_yonetici = new javax.swing.JTextField();
        txt_yoneticisifre = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        yoneticisifregoster = new javax.swing.JCheckBox();
        btn_yoneticigiris = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel6.setBackground(new java.awt.Color(0, 204, 204));
        jPanel6.setOpaque(false);
        jPanel6.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 60)); // NOI18N
        jLabel1.setText("Ho??geldiniz");
        jPanel6.add(jLabel1);
        jLabel1.setBounds(530, 170, 350, 76);

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 60)); // NOI18N
        jLabel2.setText("Hasta Takip Sistemine");
        jPanel6.add(jLabel2);
        jLabel2.setBounds(320, 90, 760, 76);

        date.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        date.setText("Tarih:");
        jPanel6.add(date);
        date.setBounds(780, 270, 143, 30);

        time.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        time.setText("Saat:");
        jPanel6.add(time);
        time.setBounds(930, 270, 136, 30);

        jTabbedPane5.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTabbedPane5.setName(""); // NOI18N

        jPanel5.setBackground(new java.awt.Color(129, 207, 224));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel14.setText("Kullan??c?? Ad??:");

        txt_sekreterkullanici.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sekreterkullaniciActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel15.setText("??ifre:");

        txt_sekretersifre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sekretersifreActionPerformed(evt);
            }
        });

        sekretersifregoster.setText("????FREY?? G??STER");
        sekretersifregoster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sekretersifregosterActionPerformed(evt);
            }
        });

        btn_sekretergiris.setBackground(new java.awt.Color(149, 165, 166));
        btn_sekretergiris.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_sekretergiris.setText("G??R????");
        btn_sekretergiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sekretergirisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 625, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(79, 79, 79)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel15)
                        .addComponent(jLabel14))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(sekretersifregoster)
                        .addComponent(btn_sekretergiris, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_sekreterkullanici, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_sekretersifre, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 264, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel14)
                        .addComponent(txt_sekreterkullanici, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(txt_sekretersifre, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sekretersifregoster)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(btn_sekretergiris, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(25, 25, 25)))
        );

        jTabbedPane5.addTab("Sekreter Giri??i", jPanel5);

        jPanel1.setBackground(new java.awt.Color(129, 207, 224));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel10.setText("Kullan??c?? Ad??:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel11.setText("??ifre:");

        btn_drgiris.setBackground(new java.awt.Color(149, 165, 166));
        btn_drgiris.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_drgiris.setText("G??R????");
        btn_drgiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_drgirisActionPerformed(evt);
            }
        });

        doktorfisregoster.setText("????FREY?? G??STER");
        doktorfisregoster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doktorfisregosterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(doktorfisregoster)
                    .addComponent(btn_drgiris, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_drkullanici, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_doktorsifre, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(txt_drkullanici, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txt_doktorsifre, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(doktorfisregoster)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_drgiris, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jTabbedPane5.addTab("Doktor Giri??i", jPanel1);

        jPanel2.setBackground(new java.awt.Color(129, 207, 224));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel12.setText("Kullan??c?? Ad??:");

        txt_yonetici.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_yoneticiActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel13.setText("??ifre:");

        yoneticisifregoster.setText("????FREY?? G??STER");
        yoneticisifregoster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yoneticisifregosterActionPerformed(evt);
            }
        });

        btn_yoneticigiris.setBackground(new java.awt.Color(149, 165, 166));
        btn_yoneticigiris.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_yoneticigiris.setText("G??R????");
        btn_yoneticigiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_yoneticigirisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 625, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(79, 79, 79)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel13)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(yoneticisifregoster)
                        .addComponent(btn_yoneticigiris, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_yonetici, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_yoneticisifre, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 264, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel12)
                        .addComponent(txt_yonetici, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(txt_yoneticisifre, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(yoneticisifregoster)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(btn_yoneticigiris, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(25, 25, 25)))
        );

        jTabbedPane5.addTab("Y??netici Giri??i", jPanel2);

        jPanel6.add(jTabbedPane5);
        jTabbedPane5.setBounds(330, 340, 723, 256);

        getContentPane().add(jPanel6);
        jPanel6.setBounds(-100, 0, 1080, 710);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/??con/Download_free_image_of_Doctor_holding_a_paper_clipboard_2296242.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(1, 0, 1360, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_drgirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_drgirisActionPerformed
        String sql = "select * from DRKULLAN??C?? where DOKTORID=? and SIFRE =? ";
        try {
            int count = 0;
            conn = db.connection_db();
            pst = conn.prepareStatement(sql);
            pst.setString(1, txt_drkullanici.getText());
            pst.setString(2, txt_doktorsifre.getText());
            rs = pst.executeQuery();
            while (rs.next()) {
                count = count + 1;
            }
            if (count == 1) {
                this.dispose();
                doktor_islem_secim d = new doktor_islem_secim();
                d.setVisible(true);
            } else if (txt_drkullanici.getText().length() == 0 || txt_doktorsifre.getText().length() == 0) {
                helper.bosluk("fill");

            } else {
                helper.yanl??sgiris("fill");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                rs.close();
                pst.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_btn_drgirisActionPerformed

    private void btn_yoneticigirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_yoneticigirisActionPerformed
        String sql = "select * from YONET??C?? where YONETICIID=? and SIFRE =? ";
        try {
            int count = 0;
            conn = db.connection_db();
            pst = conn.prepareStatement(sql);
            pst.setString(1, txt_yonetici.getText());
            pst.setString(2, txt_yoneticisifre.getText());
            rs = pst.executeQuery();
            while (rs.next()) {
                count = count + 1;
            }
            if (count == 1) {
                this.dispose();
                yonetici_islem_secme y = new yonetici_islem_secme();
                y.setVisible(true);
            } else if (txt_yonetici.getText().length() == 0 || txt_yoneticisifre.getText().length() == 0) {
                helper.bosluk("fill");

            } else {
                helper.yanl??sgiris("fill");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                rs.close();
                pst.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

    }//GEN-LAST:event_btn_yoneticigirisActionPerformed

    private void btn_sekretergirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sekretergirisActionPerformed
        String sql = "select * from SEKRETERKULLAN??C?? where SEKRETERID=? and SIFRE =? ";
        try {
            int count = 0;
            conn = db.connection_db();
            pst = conn.prepareStatement(sql);
            pst.setString(1, txt_sekreterkullanici.getText());
            pst.setString(2, txt_sekretersifre.getText());
            rs = pst.executeQuery();
            while (rs.next()) {
                count = count + 1;
            }
            if (count == 1) {
                this.dispose();
                sekreter_islem_secme s = new sekreter_islem_secme();
                s.setVisible(true);
            } else if (txt_sekreterkullanici.getText().length() == 0 || txt_sekretersifre.getText().length() == 0) {
                helper.bosluk("fill");

            } else {
                helper.yanl??sgiris("fill");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                rs.close();
                pst.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

    }//GEN-LAST:event_btn_sekretergirisActionPerformed

    private void sekretersifregosterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sekretersifregosterActionPerformed
        if (evt.getSource() == sekretersifregoster) {
            if (sekretersifregoster.isSelected()) {
                txt_sekretersifre.setEchoChar((char) 0);
            } else {
                txt_sekretersifre.setEchoChar('*');
            }
        }
    }//GEN-LAST:event_sekretersifregosterActionPerformed

    private void doktorfisregosterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doktorfisregosterActionPerformed
        if (evt.getSource() == doktorfisregoster) {
            if (doktorfisregoster.isSelected()) {
                txt_doktorsifre.setEchoChar((char) 0);
            } else {
                txt_doktorsifre.setEchoChar('*');
            }
        }
    }//GEN-LAST:event_doktorfisregosterActionPerformed

    private void yoneticisifregosterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yoneticisifregosterActionPerformed
        if (evt.getSource() == yoneticisifregoster) {
            if (yoneticisifregoster.isSelected()) {
                txt_yoneticisifre.setEchoChar((char) 0);
            } else {
                txt_yoneticisifre.setEchoChar('*');
            }
        }
    }//GEN-LAST:event_yoneticisifregosterActionPerformed

    private void txt_yoneticiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_yoneticiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_yoneticiActionPerformed

    private void txt_sekretersifreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sekretersifreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_sekretersifreActionPerformed

    private void txt_sekreterkullaniciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sekreterkullaniciActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_sekreterkullaniciActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_drgiris;
    private javax.swing.JButton btn_sekretergiris;
    private javax.swing.JButton btn_yoneticigiris;
    private javax.swing.JLabel date;
    private javax.swing.JCheckBox doktorfisregoster;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JCheckBox sekretersifregoster;
    private javax.swing.JLabel time;
    private javax.swing.JPasswordField txt_doktorsifre;
    private javax.swing.JTextField txt_drkullanici;
    private javax.swing.JTextField txt_sekreterkullanici;
    private javax.swing.JPasswordField txt_sekretersifre;
    private javax.swing.JTextField txt_yonetici;
    private javax.swing.JPasswordField txt_yoneticisifre;
    private javax.swing.JCheckBox yoneticisifregoster;
    // End of variables declaration//GEN-END:variables
}
