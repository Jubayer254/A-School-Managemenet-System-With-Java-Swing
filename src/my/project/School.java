//Login
package my.project;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class School extends javax.swing.JFrame {
    int xMouse;
    int yMouse;
    public School() {
        initComponents();
        ImageIcon img=new ImageIcon(getClass().getResource("Capture.png"));
        this.setIconImage(img.getImage());
        this.setBackground(new Color(0,0,0,0));
        jPanel1.setBackground(new Color(0,0,0,0));
        jButton1.setBackground(new Color(0,0,0,0));
        jButton2.setBackground(new Color(0,0,0,0));
        this.setLocation(265,120);    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        drag = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        drag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/drag.png"))); // NOI18N
        drag.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        drag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dragMousePressed(evt);
            }
        });
        drag.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                dragMouseDragged(evt);
            }
        });
        jPanel1.add(drag, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 0));
        jLabel6.setText("X");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 20, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 460, 180, 10));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, 180, 10));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/button2.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 550, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/button.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 500, -1, -1));

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        jLabel5.setText("Password");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 410, -1, -1));

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        jLabel4.setText("Username");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 320, -1, 30));

        jPasswordField1.setBackground(new java.awt.Color(247, 150, 29));
        jPasswordField1.setForeground(new java.awt.Color(102, 102, 102));
        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.setBorder(null);
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 430, 190, 30));

        jTextField1.setBackground(new java.awt.Color(247, 150, 29));
        jTextField1.setFont(new java.awt.Font("Berlin Sans FB", 0, 11)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(102, 102, 102));
        jTextField1.setText("Enter Your Username");
        jTextField1.setBorder(null);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 340, 200, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/school-logo-template-png-1.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Layout2.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, -70, 557, 846));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Untitled-2.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });
        jLabel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel2MouseDragged(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, -10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
             // TODO add your handling code here:
            signup sn=new signup();
            sn.setVisible(true);
            this.dispose();       
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        File read=new File("Username.txt");
        File read1=new File("Password.txt");
        String user=jTextField1.getText();
        String pass=jPasswordField1.getText();
        try {           
            BufferedReader buf = new BufferedReader(new FileReader(read));
            BufferedReader buf1 = new BufferedReader(new FileReader(read1));
            String inputfile=buf.readLine();
            String inputfile1=buf1.readLine();
            int flag=0;
            while(inputfile!=null&&inputfile1!=null){
                if(user.equals(inputfile)&&pass.equals(inputfile1)){
                    flag=1;
                    afterlogin a=new afterlogin();
                    a.setVisible(true);
                    this.dispose();
                    break;
                }
                else{
                    inputfile=buf.readLine();
                    inputfile1=buf1.readLine();
                }
            }
            if(flag==0){
            JOptionPane.showMessageDialog(this, "Wrong Username or Password","Message",0);                                      
            }
        } catch (IOException e) {
            Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, e);
        }       
    }//GEN-LAST:event_jButton1MouseClicked

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        // TODO add your handling code here
    }//GEN-LAST:event_jLabel1MouseDragged

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseDragged

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MousePressed

    private void dragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_dragMouseDragged

    private void dragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_dragMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel drag;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
