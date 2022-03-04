package my.project;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

class info {

    String Name;
    String ID;
    String FName;
    String MName;
    String age;
    String GName;
    String addrs;
    String DOB;
    String Class;
    String gender;
    double payment;

    public info(String a, String b, String c, String d, String e, String f, String g, String h, String i, String j,double k) {
        Name = a;
        ID = b;
        FName = c;
        MName = d;
        age = e;
        GName = f;
        addrs = g;
        DOB = h;
        Class = i;
        gender = j;
        payment = k;
    }
}

public class afterlogin extends javax.swing.JFrame {

    int chk = 0;
    int chkclass = 0;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel35 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        p1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField10 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        p2 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        p3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        p4 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        pp1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pp2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pp3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pp4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel35.setText("jLabel35");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(710, 620));

        jPanel8.setBackground(new java.awt.Color(74, 31, 61));
        jPanel8.setLayout(new java.awt.CardLayout());

        p1.setBackground(new java.awt.Color(247, 150, 29));
        p1.setPreferredSize(new java.awt.Dimension(692, 629));

        jTextField1.setBackground(new java.awt.Color(247, 150, 29));
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setBackground(new java.awt.Color(247, 150, 29));
        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jTextField2.setPreferredSize(new java.awt.Dimension(4, 26));

        jTextField3.setBackground(new java.awt.Color(247, 150, 29));
        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jTextField3.setPreferredSize(new java.awt.Dimension(4, 26));

        jTextField4.setBackground(new java.awt.Color(247, 150, 29));
        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jTextField4.setPreferredSize(new java.awt.Dimension(4, 26));

        jTextField5.setBackground(new java.awt.Color(247, 150, 29));
        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jTextField5.setPreferredSize(new java.awt.Dimension(4, 26));

        jComboBox1.setBackground(new java.awt.Color(247, 150, 29));
        jComboBox1.setForeground(new java.awt.Color(247, 150, 29));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- - -", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Select Class");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Name");

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Father's Name");

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Mother's Name");

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Age");

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Guardian's Name");

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Address");

        jTextField6.setBackground(new java.awt.Color(247, 150, 29));
        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jTextField6.setPreferredSize(new java.awt.Dimension(4, 26));

        jTextField7.setBackground(new java.awt.Color(247, 150, 29));
        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(255, 255, 255));
        jTextField7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("ID");

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/student-png-algebra-nation-30.png"))); // NOI18N

        jLabel23.setBackground(new java.awt.Color(74, 31, 61));
        jLabel23.setFont(new java.awt.Font("Candara", 1, 30)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Fill the form");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/register-button-png-29.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField10.setBackground(new java.awt.Color(247, 150, 29));
        jTextField10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(255, 255, 255));
        jTextField10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jTextField10.setPreferredSize(new java.awt.Dimension(4, 26));

        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Gender");

        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Date Of Birth(dd/mm/yy)");

        jCheckBox1.setForeground(new java.awt.Color(255, 51, 0));
        jCheckBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox1MouseClicked(evt);
            }
        });
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setForeground(new java.awt.Color(255, 51, 0));
        jCheckBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox2MouseClicked(evt);
            }
        });
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Female");

        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Male");

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel38))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p1Layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel40))
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(204, 204, 204))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p1Layout.createSequentialGroup()
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2)
                    .addGroup(p1Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 359, Short.MAX_VALUE)
                        .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p1Layout.createSequentialGroup()
                                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel39))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField7)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(32, 32, 32))
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addGroup(p1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p1Layout.createSequentialGroup()
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17)))
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addGap(14, 14, 14)
                        .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39))
                .addGap(18, 18, 18)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2)
                    .addComponent(jLabel41)
                    .addComponent(jLabel40)
                    .addComponent(jLabel38))
                .addGap(18, 18, 18)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        jPanel8.add(p1, "card2");

        p2.setBackground(new java.awt.Color(155, 35, 53));
        p2.setForeground(new java.awt.Color(153, 255, 204));
        p2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        p2.setPreferredSize(new java.awt.Dimension(4, 19));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Name");

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("ID");

        jTextField8.setBackground(new java.awt.Color(155, 35, 53));
        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(255, 255, 255));
        jTextField8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jTextField8.setPreferredSize(new java.awt.Dimension(4, 26));

        jTextField9.setBackground(new java.awt.Color(155, 35, 53));
        jTextField9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(255, 255, 255));
        jTextField9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jTextField9.setPreferredSize(new java.awt.Dimension(4, 26));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/de.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Remove-Male-User.png"))); // NOI18N

        jLabel37.setFont(new java.awt.Font("Candara", 1, 30)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Delete Data");

        javax.swing.GroupLayout p2Layout = new javax.swing.GroupLayout(p2);
        p2.setLayout(p2Layout);
        p2Layout.setHorizontalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31)
                .addGap(19, 448, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p2Layout.createSequentialGroup()
                .addContainerGap(318, Short.MAX_VALUE)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(p2Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1)
                    .addComponent(jLabel37)
                    .addGroup(p2Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(115, 115, 115))
        );
        p2Layout.setVerticalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel31)
                .addGap(18, 18, 18)
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        jPanel8.add(p2, "card3");

        p3.setBackground(new java.awt.Color(33, 115, 70));
        p3.setPreferredSize(new java.awt.Dimension(692, 629));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Pay-Button.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jTextField11.setBackground(new java.awt.Color(33, 115, 70));
        jTextField11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(255, 255, 255));
        jTextField11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jTextField12.setBackground(new java.awt.Color(33, 115, 70));
        jTextField12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField12.setForeground(new java.awt.Color(255, 255, 255));
        jTextField12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Amount in BDT");

        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Name");

        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("ID");

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/pay.png"))); // NOI18N

        jTextField15.setBackground(new java.awt.Color(33, 115, 70));
        jTextField15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField15.setForeground(new java.awt.Color(255, 255, 255));
        jTextField15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jTextField15.setPreferredSize(new java.awt.Dimension(4, 25));

        jLabel36.setFont(new java.awt.Font("Candara", 1, 30)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Payment");

        javax.swing.GroupLayout p3Layout = new javax.swing.GroupLayout(p3);
        p3.setLayout(p3Layout);
        p3Layout.setHorizontalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p3Layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 214, Short.MAX_VALUE)
                        .addComponent(jLabel36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p3Layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p3Layout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p3Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(119, 119, 119))
        );
        p3Layout.setVerticalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p3Layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p3Layout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addGap(18, 18, 18)
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(jLabel28))
                .addGap(19, 19, 19)
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(163, 163, 163))
        );

        jPanel8.add(p3, "card4");

        p4.setBackground(new java.awt.Color(74, 31, 61));
        p4.setPreferredSize(new java.awt.Dimension(692, 629));

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Name");

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("ID");

        jTextField13.setBackground(new java.awt.Color(74, 31, 61));
        jTextField13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField13.setForeground(new java.awt.Color(255, 255, 255));
        jTextField13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jTextField13.setPreferredSize(new java.awt.Dimension(4, 25));

        jTextField14.setBackground(new java.awt.Color(74, 31, 61));
        jTextField14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField14.setForeground(new java.awt.Color(255, 255, 255));
        jTextField14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jTextField14.setPreferredSize(new java.awt.Dimension(4, 25));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/s.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/PngItem_2014716.png"))); // NOI18N

        jLabel34.setFont(new java.awt.Font("Candara", 1, 30)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Search");

        javax.swing.GroupLayout p4Layout = new javax.swing.GroupLayout(p4);
        p4.setLayout(p4Layout);
        p4Layout.setHorizontalGroup(
            p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33)
                .addGap(20, 426, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p4Layout.createSequentialGroup()
                .addContainerGap(256, Short.MAX_VALUE)
                .addGroup(p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel34)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(p4Layout.createSequentialGroup()
                        .addGroup(p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel30)
                            .addComponent(jLabel29))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(155, 155, 155))
        );
        p4Layout.setVerticalGroup(
            p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p4Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p4Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addGap(18, 18, 18)
                .addGroup(p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(152, Short.MAX_VALUE))
        );

        jPanel8.add(p4, "card5");

        jPanel1.setBackground(new java.awt.Color(20, 50, 88));

        pp1.setBackground(new java.awt.Color(20, 50, 88));
        pp1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pp1.setPreferredSize(new java.awt.Dimension(110, 110));
        pp1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pp4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pp1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pp1MouseExited(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/60040_151924_add_group.png"))); // NOI18N

        jLabel6.setBackground(new java.awt.Color(74, 31, 61));
        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ADD STUDENT");

        javax.swing.GroupLayout pp1Layout = new javax.swing.GroupLayout(pp1);
        pp1.setLayout(pp1Layout);
        pp1Layout.setHorizontalGroup(
            pp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pp1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pp1Layout.setVerticalGroup(
            pp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pp1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pp1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pp1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
        );

        pp2.setBackground(new java.awt.Color(20, 50, 88));
        pp2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pp2.setPreferredSize(new java.awt.Dimension(110, 110));
        pp2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pp4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pp1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pp1MouseExited(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/60044_151952_delete_user.png"))); // NOI18N

        jLabel7.setBackground(new java.awt.Color(74, 31, 61));
        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("DELETE STUDENT");

        javax.swing.GroupLayout pp2Layout = new javax.swing.GroupLayout(pp2);
        pp2.setLayout(pp2Layout);
        pp2Layout.setHorizontalGroup(
            pp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pp2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        pp2Layout.setVerticalGroup(
            pp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pp2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(39, 39, 39))
            .addGroup(pp2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pp3.setBackground(new java.awt.Color(20, 50, 88));
        pp3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pp3.setPreferredSize(new java.awt.Dimension(110, 110));
        pp3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pp4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pp1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pp1MouseExited(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/unnamed2.png"))); // NOI18N

        jLabel8.setBackground(new java.awt.Color(74, 31, 61));
        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("FEES");

        javax.swing.GroupLayout pp3Layout = new javax.swing.GroupLayout(pp3);
        pp3.setLayout(pp3Layout);
        pp3Layout.setHorizontalGroup(
            pp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pp3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pp3Layout.setVerticalGroup(
            pp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pp3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(38, 38, 38))
            .addGroup(pp3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pp4.setBackground(new java.awt.Color(20, 50, 88));
        pp4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pp4.setPreferredSize(new java.awt.Dimension(110, 110));
        pp4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pp4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pp1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pp1MouseExited(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/60028_151852_info.png"))); // NOI18N

        jLabel9.setBackground(new java.awt.Color(74, 31, 61));
        jLabel9.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("INFORMATION");

        javax.swing.GroupLayout pp4Layout = new javax.swing.GroupLayout(pp4);
        pp4.setLayout(pp4Layout);
        pp4Layout.setHorizontalGroup(
            pp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pp4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pp4Layout.setVerticalGroup(
            pp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pp4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(39, 39, 39))
            .addGroup(pp4Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(74, 31, 61));
        jLabel1.setFont(new java.awt.Font("Candara", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MENU");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pp1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pp2, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
            .addComponent(pp3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
            .addComponent(pp4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pp1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pp2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pp3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pp4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1060, 635));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pp4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pp4MouseClicked
        // TODO add your handling code here:
        if (evt.getSource() == pp1) {
            p1.setVisible(true);
            p2.setVisible(false);
            p3.setVisible(false);
            p4.setVisible(false);
        }
        if (evt.getSource() == pp2) {
            p1.setVisible(false);
            p2.setVisible(true);
            p3.setVisible(false);
            p4.setVisible(false);
        }
        if (evt.getSource() == pp3) {
            p1.setVisible(false);
            p2.setVisible(false);
            p3.setVisible(true);
            p4.setVisible(false);
        }
        if (evt.getSource() == pp4) {
            p1.setVisible(false);
            p2.setVisible(false);
            p3.setVisible(false);
            p4.setVisible(true);
        }
    }//GEN-LAST:event_pp4MouseClicked

    private void pp1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pp1MouseEntered
        // TODO add your handling code here:
        if (evt.getSource() == pp1) {
            pp1.setBackground(new Color(247, 150, 29));
        }
        if (evt.getSource() == pp2) {
            pp2.setBackground(new Color(155, 35, 53));
        }
        if (evt.getSource() == pp3) {
            pp3.setBackground(new Color(33, 115, 70));
        }
        if (evt.getSource() == pp4) {
            pp4.setBackground(new Color(74, 31, 61));
        }
    }//GEN-LAST:event_pp1MouseEntered

    private void pp1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pp1MouseExited
        // TODO add your handling code here:
        if (evt.getSource() == pp1) {
            pp1.setBackground(new Color(20, 50, 88));
        }
        if (evt.getSource() == pp2) {
            pp2.setBackground(new Color(20, 50, 88));
        }
        if (evt.getSource() == pp3) {
            pp3.setBackground(new Color(20, 50, 88));
        }
        if (evt.getSource() == pp4) {
            pp4.setBackground(new Color(20, 50, 88));
        }
    }//GEN-LAST:event_pp1MouseExited

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        ArrayList<info> arr = new ArrayList<>();
        File read = new File("StudentInformation.txt");
        int i = 0;
        try {
            BufferedReader buf1 = new BufferedReader(new FileReader(read));
            String Line = buf1.readLine();
            boolean flag = false;
            String tName = jTextField13.getText();
            String tID = jTextField14.getText();
            while (Line != null) {
                String[] parts = Line.split("  ");
                String Name = parts[0];
                String ID = parts[1];
                String FName = parts[2];
                String MName = parts[3];
                String age = parts[4];
                String GName = parts[5];
                String addrs = parts[6];
                String DOB = parts[7];
                String gender = parts[8];
                String Class = parts[9];
                String pay = parts[10];
                double payment=Double.parseDouble(pay);
                info a = new info(Name, ID, FName, MName, age, GName, addrs, DOB, gender, Class,payment);
                arr.add(a);
                String Name2 = arr.get(i).Name;
                String ID2 = arr.get(i).ID;
                if (tName.equals(Name2) && tID.equals(ID2)) {
                    flag = true;
                    student std = new student(arr.get(i).Name,arr.get(i).ID,arr.get(i).FName,arr.get(i).MName,arr.get(i).age,arr.get(i).GName,arr.get(i).addrs,arr.get(i).DOB,arr.get(i).gender,arr.get(i).Class,arr.get(i).payment);
                    std.setVisible(true);
                    break;
                } else {
                    Line = buf1.readLine();
                }
                i++;
            }
            buf1.close();
            if (flag == false) {
                JOptionPane.showMessageDialog(this, "Student did not found");
            }
        } catch (IOException e) {
            Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, e);
        }

    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        String a = jTextField1.getText();
        String b = jTextField7.getText();
        String c = jTextField2.getText();
        String d = jTextField3.getText();
        String e = jTextField5.getText();
        String f = jTextField4.getText();
        String g = jTextField6.getText();
        String h = jTextField10.getText();
        String i = "";
        String j = jComboBox1.getSelectedItem().toString();
        if (a.equals(i) || b.equals(i) || c.equals(i) || d.equals(i) || e.equals(i) || f.equals(i) || g.equals(i) || h.equals(i) || chkclass == 0 || j == "- - -") {
            JOptionPane.showMessageDialog(this, "Please Enter all the Informations");
        }
        if (chk == 0) {
            JOptionPane.showMessageDialog(this, "Please select your gender");
        }
        if (!a.equals(i) && !b.equals(i) && !c.equals(i) && !d.equals(i) && !e.equals(i) && !f.equals(i) && !g.equals(i) && !h.equals(i) && chkclass != 0 && j != "- - -") {
            JOptionPane.showMessageDialog(this, "Student enrolled successfully");
          //File
            String M = "Male";
            String F = "Female";
            double payment=0.0;
            try {
                File StudentInformation = new File("StudentInformation.txt");
                BufferedWriter buf = new BufferedWriter(new FileWriter(StudentInformation, true));
                File read = new File("StudentInformation.txt");
                BufferedReader buf1 = new BufferedReader(new FileReader(read));
                buf.write(a + "  ");
                buf.write(b + "  ");
                buf.write(c + "  ");
                buf.write(d + "  ");
                buf.write(e + "  ");
                buf.write(f + "  ");
                buf.write(g + "  ");
                buf.write(h + "  ");
                buf.write(j + "  ");
                if (chk == 1) {
                    buf.write(M + "  ");
                } else if (chk == 2) {
                    buf.write(F + "  ");
                }
                buf.write(payment+ "  ");
                buf.newLine();
                buf.close();
            } catch (IOException ex) {
                Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
        // TODO add your handling code here:
        if (evt.getSource() == jComboBox1) {
            chkclass = 1;
        }
    }//GEN-LAST:event_jComboBox1MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
        if (evt.getSource() == jCheckBox2) {
            chk = 2;
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2MouseClicked

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        if (evt.getSource() == jCheckBox1) {
            chk = 1;
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
    //Delete
        ArrayList<info> arr = new ArrayList<>();
        File read = new File("StudentInformation.txt");
        File StudentInformation = new File("StudentInformation.txt");
        int i = 0;
        try {
            BufferedReader buf = new BufferedReader(new FileReader(read));
            String Line = buf.readLine();
            boolean flag = false;
            String tName = jTextField8.getText();
            String tID = jTextField9.getText();
            while (Line != null) {
                String[] parts = Line.split("  ");
                String Name = parts[0];
                String ID = parts[1];
                String FName = parts[2];
                String MName = parts[3];
                String age = parts[4];
                String GName = parts[5];
                String addrs = parts[6];
                String DOB = parts[7];
                String gender = parts[8];
                String Class = parts[9];
                String pay = parts[10];
                double payment=Double.parseDouble(pay);
                info a = new info(Name, ID, FName, MName, age, GName, addrs, DOB, gender, Class, payment);
                arr.add(a);
                Line = buf.readLine();
               }
                buf.close();
                for(int k=0;k<arr.size();k++){
                String Name2 = arr.get(k).Name;
                String ID2 = arr.get(k).ID;
                if (tName.equals(Name2) && tID.equals(ID2)) {
                    flag = true;
                    arr.remove(k);
                    JOptionPane.showMessageDialog(this, "Student removed successfully");
                    break;
                }
                }
                 if (flag == false) {
                   JOptionPane.showMessageDialog(this, "Student did not found");
                }
                BufferedWriter buf1 = new BufferedWriter(new FileWriter(StudentInformation));
                for(int k=0;k<arr.size();k++){
                    buf1.write(arr.get(k).Name + "  ");
                    buf1.write(arr.get(k).ID + "  ");
                    buf1.write(arr.get(k).FName + "  ");
                    buf1.write(arr.get(k).MName + "  ");
                    buf1.write(arr.get(k).age + "  ");
                    buf1.write(arr.get(k).GName + "  ");
                    buf1.write(arr.get(k).addrs + "  ");
                    buf1.write(arr.get(k).DOB + "  ");
                    buf1.write(arr.get(k).gender + "  ");
                    buf1.write(arr.get(k).Class + "  ");
                    buf1.write(arr.get(k).payment+ "  ");
                    buf1.newLine();
                }
                buf1.close();
            } catch (IOException e) {
            Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, e);
           }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
       //payment
        ArrayList<info> arr = new ArrayList<>();
        File read = new File("StudentInformation.txt");
        File StudentInformation = new File("StudentInformation.txt");
        int i = 0;
        try {
            BufferedReader buf = new BufferedReader(new FileReader(read));
            String Line = buf.readLine();
            boolean flag = false;
            String tName = jTextField11.getText();
            String tID = jTextField12.getText();
            while (Line != null) {
                String[] parts = Line.split("  ");
                String Name = parts[0];
                String ID = parts[1];
                String FName = parts[2];
                String MName = parts[3];
                String age = parts[4];
                String GName = parts[5];
                String addrs = parts[6];
                String DOB = parts[7];
                String gender = parts[8];
                String Class = parts[9];
                String pay = parts[10];
                double payment=Double.parseDouble(pay);
                info a = new info(Name, ID, FName, MName, age, GName, addrs, DOB, gender, Class, payment);
                arr.add(a);
                Line = buf.readLine();
               }
                buf.close();
                for(int k=0;k<arr.size();k++){
                String Name2 = arr.get(k).Name;
                String ID2 = arr.get(k).ID;
                String emt="";
                if (tName.equals(Name2) && tID.equals(ID2)&&!emt.equals(jTextField15.getText())) {
                    flag = true;
                    arr.get(k).payment=arr.get(k).payment+Double.parseDouble(jTextField15.getText());
                    JOptionPane.showMessageDialog(this, "Payment added successfully");
                    break;
                }
                }
                 if (flag == false) {
                   JOptionPane.showMessageDialog(this, "Please enter all data correctly","Message",2);
                }
                BufferedWriter buf1 = new BufferedWriter(new FileWriter(StudentInformation));
                for(int k=0;k<arr.size();k++){
                    buf1.write(arr.get(k).Name + "  ");
                    buf1.write(arr.get(k).ID + "  ");
                    buf1.write(arr.get(k).FName + "  ");
                    buf1.write(arr.get(k).MName + "  ");
                    buf1.write(arr.get(k).age + "  ");
                    buf1.write(arr.get(k).GName + "  ");
                    buf1.write(arr.get(k).addrs + "  ");
                    buf1.write(arr.get(k).DOB + "  ");
                    buf1.write(arr.get(k).gender + "  ");
                    buf1.write(arr.get(k).Class + "  ");
                    buf1.write(arr.get(k).payment+ "  ");
                    buf1.newLine();
                }
                buf1.close();
            } catch (IOException e) {
            Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, e);
           }        
    }//GEN-LAST:event_jButton3MouseClicked
    public afterlogin() {
        initComponents();
        ImageIcon img = new ImageIcon(getClass().getResource("Capture.png"));
        this.setIconImage(img.getImage());
        jButton2.setBackground(new Color(0, 0, 0, 0));
        jButton1.setBackground(new Color(0, 0, 0, 0));
        jButton3.setBackground(new Color(0, 0, 0, 0));
        jButton4.setBackground(new Color(0, 0, 0, 0));
        ButtonGroup grp = new ButtonGroup();
        grp.add(jCheckBox1);
        grp.add(jCheckBox2);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    public javax.swing.JTextField jTextField13;
    public javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JPanel p3;
    private javax.swing.JPanel p4;
    private javax.swing.JPanel pp1;
    private javax.swing.JPanel pp2;
    private javax.swing.JPanel pp3;
    private javax.swing.JPanel pp4;
    // End of variables declaration//GEN-END:variables

}
