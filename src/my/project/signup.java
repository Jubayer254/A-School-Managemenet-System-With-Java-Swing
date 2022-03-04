//signup
package my.project;
import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class signup extends javax.swing.JFrame {
    int chk=0;
    public signup(){
        initComponents();
        jButton1.setBackground(new Color(0,0,0,0));
        ImageIcon img=new ImageIcon(getClass().getResource("Capture.png"));
        this.setIconImage(img.getImage());
        ButtonGroup grp=new ButtonGroup();
        grp.add(jCheckBox1);
        grp.add(jCheckBox2);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(74, 31, 61));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setBackground(new java.awt.Color(74, 31, 61));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(247, 150, 29), 2));
        jTextField1.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 250, 30));

        jTextField2.setBackground(new java.awt.Color(74, 31, 61));
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(247, 150, 29), 2));
        jTextField2.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel3.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 250, 30));

        jPasswordField1.setBackground(new java.awt.Color(74, 31, 61));
        jPasswordField1.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(247, 150, 29), 2));
        jPasswordField1.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel3.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 250, 30));

        jTextField3.setBackground(new java.awt.Color(74, 31, 61));
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(247, 150, 29), 2));
        jTextField3.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel3.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 250, 30));

        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Name");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Email");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Date of Birth (dd/mm/yy)");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, -1, -1));

        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Confirm Password");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Gender");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, -1, 20));

        jCheckBox1.setBackground(new java.awt.Color(247, 150, 29));
        jCheckBox1.setForeground(new java.awt.Color(247, 150, 29));
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
        jPanel3.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 540, -1, -1));

        jCheckBox2.setBackground(new java.awt.Color(247, 150, 29));
        jCheckBox2.setForeground(new java.awt.Color(247, 150, 29));
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
        jPanel3.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Male");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 540, -1, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Female");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 540, -1, -1));

        jTextField4.setBackground(new java.awt.Color(74, 31, 61));
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(247, 150, 29), 2));
        jTextField4.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel3.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 250, 30));

        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText("Phone Number");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/unnamed.png"))); // NOI18N
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Untitled-1.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 580, -1, 40));

        jPasswordField2.setBackground(new java.awt.Color(74, 31, 61));
        jPasswordField2.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(247, 150, 29), 2));
        jPasswordField2.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel3.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 250, 30));

        jLabel13.setForeground(new java.awt.Color(240, 240, 240));
        jLabel13.setText("Password");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jPanel4.setBackground(new java.awt.Color(247, 150, 29));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/school-logo-template-png-1.png"))); // NOI18N
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Central Technical School");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 739, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
    //Create Account Button 
        String a=jPasswordField1.getText();
        String b=jPasswordField2.getText();
        String c=jTextField1.getText();
        String d=jTextField2.getText();
        String e=jTextField3.getText();
        String f=jTextField4.getText();
        String g="";
        if(a.equals(g)||b.equals(g)||c.equals(g)||d.equals(g)||e.equals(g)||f.equals(g)){
        JOptionPane.showMessageDialog(this, "Please Enter all the Informations");
        }
        
        if(chk==0){
        JOptionPane.showMessageDialog(this, "Please select your gender");
        }
        
        if(!a.equals(b)){
        JOptionPane.showMessageDialog(this, "Password did not matched","Message",0);
        }
        
        if(!a.equals(g)&&!b.equals(g)&&!c.equals(g)&&!d.equals(g)&&!e.equals(g)&&!f.equals(g)&&a.equals(b)&&(chk==1||chk==2)){
            JOptionPane.showMessageDialog(this, "Account created successfully");
            File userInformation=new File("userInformation.txt");
            File username=new File("Username.txt");
            File password=new File("Password.txt");
            try {           
            BufferedWriter buf = new BufferedWriter(new FileWriter(userInformation,true));
            buf.write("Name: "+c);
            buf.newLine();
            buf.write("Password: "+a);
            buf.newLine();
            buf.write("Email: "+d);
            buf.newLine();
            buf.write("Phone Number: "+e);
            buf.newLine();
            buf.write("Date of Birth: "+f);
            buf.newLine();
            if(chk==1){
            buf.write("Gender: Male");
            }
            else if(chk==2){
            buf.write("Gender: Female");
            }
            buf.newLine();
            buf.newLine();
            buf.newLine();
            buf.write("----------------------------------------------------------");
            buf.newLine();
            buf.newLine();
            buf.newLine();
            buf.close();
            BufferedWriter buf2 = new BufferedWriter(new FileWriter(username,true));
            buf2.write(c);
            buf2.newLine();
            buf2.close();
            BufferedWriter buf3 = new BufferedWriter(new FileWriter(password,true));
            buf3.write(a);
            buf3.newLine();
            buf3.close();
            
        } catch (IOException ex) {
            Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
        }
            this.dispose();
            School s=new School();
            s.setVisible(true);
        }        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jCheckBox2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox2MouseClicked
        // TODO add your handling code here:
        if(evt.getSource()==jCheckBox1||evt.getSource()==jCheckBox2){
        chk=1;
        }
    }//GEN-LAST:event_jCheckBox2MouseClicked

    private void jCheckBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox1MouseClicked
        // TODO add your handling code here:
        if(evt.getSource()==jCheckBox1||evt.getSource()==jCheckBox2){
        chk=2;
        }
    }//GEN-LAST:event_jCheckBox1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public javax.swing.JPasswordField jPasswordField1;
    public javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
