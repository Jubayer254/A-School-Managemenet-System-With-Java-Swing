package my.project;

import java.awt.Color;
import javax.swing.ImageIcon;

public class student extends javax.swing.JFrame {

    int xMouse;
    int yMouse;

    student(String Name,String ID,String FName,String MName,String age,String GName,String addrs,String DOB,String gender,String Class,double pay) {
        initComponents();
        this.setBackground(new Color(0, 0, 0, 0));
        jPanel1.setBackground(new Color(0, 0, 0, 0));
        ImageIcon img = new ImageIcon(getClass().getResource("Capture.png"));
        this.setIconImage(img.getImage());
        NameL.setText(Name);
        IDL.setText(ID);
        DOBL.setText(DOB);
        FNameL.setText(FName);
        MNameL.setText(MName);
        ageL.setText(age);
        GNameL.setText(GName);
        addrsL.setText(addrs);
        jLabel21.setText(gender);
        ClassL.setText(Class);
        jLabel19.setText(pay+"");
    }

    public student() {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        MNameL = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        gendarL = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        addrsL = new javax.swing.JLabel();
        GNameL = new javax.swing.JLabel();
        ageL = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        ClassL = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        NameL = new javax.swing.JLabel();
        IDL = new javax.swing.JLabel();
        DOBL = new javax.swing.JLabel();
        FNameL = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/pro.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 160, 180));

        jLabel5.setBackground(new java.awt.Color(247, 150, 29));
        jLabel5.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Name:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 40, -1));

        jLabel4.setBackground(new java.awt.Color(247, 150, 29));
        jLabel4.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Gurdian's Name:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("X");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 20, 20));

        jLabel6.setBackground(new java.awt.Color(247, 150, 29));
        jLabel6.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ID:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, -1));

        MNameL.setBackground(new java.awt.Color(247, 150, 29));
        MNameL.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        MNameL.setForeground(new java.awt.Color(255, 255, 255));
        MNameL.setText("XXXXXXX");
        jPanel1.add(MNameL, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, -1, -1));

        jLabel8.setBackground(new java.awt.Color(247, 150, 29));
        jLabel8.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Mother's Name:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel9.setBackground(new java.awt.Color(247, 150, 29));
        jLabel9.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Address:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jLabel10.setBackground(new java.awt.Color(247, 150, 29));
        jLabel10.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Age: ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, -1, -1));

        jLabel11.setBackground(new java.awt.Color(247, 150, 29));
        jLabel11.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Current Payment :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, -1, -1));

        gendarL.setBackground(new java.awt.Color(247, 150, 29));
        gendarL.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        gendarL.setForeground(new java.awt.Color(255, 255, 255));
        gendarL.setText("Gender:");
        jPanel1.add(gendarL, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, -1, -1));

        jLabel13.setBackground(new java.awt.Color(247, 150, 29));
        jLabel13.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Class:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, -1, -1));

        jLabel14.setBackground(new java.awt.Color(247, 150, 29));
        jLabel14.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Date of Birth:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, -1, -1));

        jLabel15.setBackground(new java.awt.Color(247, 150, 29));
        jLabel15.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Father's Name:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        addrsL.setBackground(new java.awt.Color(247, 150, 29));
        addrsL.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        addrsL.setForeground(new java.awt.Color(255, 255, 255));
        addrsL.setText("XXXXXXX");
        jPanel1.add(addrsL, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, -1));

        GNameL.setBackground(new java.awt.Color(247, 150, 29));
        GNameL.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        GNameL.setForeground(new java.awt.Color(255, 255, 255));
        GNameL.setText("XXXXXXX");
        jPanel1.add(GNameL, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, -1, -1));

        ageL.setBackground(new java.awt.Color(247, 150, 29));
        ageL.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        ageL.setForeground(new java.awt.Color(255, 255, 255));
        ageL.setText("XXXXXXX");
        jPanel1.add(ageL, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, -1, -1));

        jLabel19.setBackground(new java.awt.Color(247, 150, 29));
        jLabel19.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("XXXXXXX");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, -1, -1));

        ClassL.setBackground(new java.awt.Color(247, 150, 29));
        ClassL.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        ClassL.setForeground(new java.awt.Color(255, 255, 255));
        ClassL.setText("XXXXXXX");
        jPanel1.add(ClassL, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, -1, -1));

        jLabel21.setBackground(new java.awt.Color(247, 150, 29));
        jLabel21.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("XXXXXXX");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, -1, -1));

        NameL.setBackground(new java.awt.Color(247, 150, 29));
        NameL.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        NameL.setForeground(new java.awt.Color(255, 255, 255));
        NameL.setText("XXXXXXX");
        jPanel1.add(NameL, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, -1));

        IDL.setBackground(new java.awt.Color(247, 150, 29));
        IDL.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        IDL.setForeground(new java.awt.Color(255, 255, 255));
        IDL.setText("XXXXXXX");
        jPanel1.add(IDL, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, -1, -1));

        DOBL.setBackground(new java.awt.Color(247, 150, 29));
        DOBL.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        DOBL.setForeground(new java.awt.Color(255, 255, 255));
        DOBL.setText("XXXXXXX");
        jPanel1.add(DOBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, -1));

        FNameL.setBackground(new java.awt.Color(247, 150, 29));
        FNameL.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        FNameL.setForeground(new java.awt.Color(255, 255, 255));
        FNameL.setText("XXXXXXX");
        jPanel1.add(FNameL, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/hiclipart.png"))); // NOI18N
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
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, 420));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jLabel1MouseDragged

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jLabel1MousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel ClassL;
    public javax.swing.JLabel DOBL;
    public javax.swing.JLabel FNameL;
    public javax.swing.JLabel GNameL;
    public javax.swing.JLabel IDL;
    public javax.swing.JLabel MNameL;
    public javax.swing.JLabel NameL;
    public javax.swing.JLabel addrsL;
    public javax.swing.JLabel ageL;
    private javax.swing.JLabel gendarL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    public javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
