/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import domain.CyclePurchase;
import domain.DashBoardClass;
import service.PurchaseService;
import service.ReportService;
import utils.MenuForm;

/**
 *
 * @author User
 */
public class DashBoard extends javax.swing.JFrame {

    /**
     * Creates new form PurchaseView
     */
    public DashBoard() {
        initComponents();
        MenuForm.commonMenu(this);
        displayDashBoarddata();
    }
    
    public void displayDashBoarddata() {
        DashBoardClass data = ReportService.getDashboardDetails();
        jButtonTodayPurchase.setText(String.valueOf(data.getTodaysPurchaseAmount()));
        jButtonEntirePurchase.setText(String.valueOf(data.getEntirePurchaseAmount()));
        jButtonTotalItems.setText(String.valueOf(data.getTotalItems()));
        jButtonTodayPurchaseItems.setText(String.valueOf(data.getTodaysPurchaseItem()));
/////////////////////////sales//////////////////
        jButtonTodaySales.setText(String.valueOf(data.getTodaysSalesAmount()));
        jButtonEntireSales.setText(String.valueOf(data.getEntireSalesAmount()));
        jButtonTotalSalesItems.setText(String.valueOf(data.getTotalSoldItems()));
        jButtonTodaySalesItems.setText(String.valueOf(data.getTodaysSoldItems()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButtonTodayPurchase = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButtonEntirePurchase = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButtonTotalItems = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButtonTodayPurchaseItems = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jButtonTodaySales = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButtonEntireSales = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButtonTotalSalesItems = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButtonTodaySalesItems = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButton1.setBackground(new java.awt.Color(153, 255, 204));
        jButton1.setFont(new java.awt.Font("sansserif", 3, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 51));
        jButton1.setText("Cycle Shop ~ Dash Board");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/MG_8477-slider.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Purchase"));

        jButton2.setBackground(new java.awt.Color(153, 204, 255));
        jButton2.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 51, 51));
        jButton2.setText("Todays's Purchase");

        jButtonTodayPurchase.setBackground(new java.awt.Color(255, 204, 153));
        jButtonTodayPurchase.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        jButtonTodayPurchase.setForeground(new java.awt.Color(51, 51, 0));
        jButtonTodayPurchase.setText("0.0");

        jButton4.setBackground(new java.awt.Color(153, 153, 255));
        jButton4.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 51, 51));
        jButton4.setText("Entire Purchase");

        jButtonEntirePurchase.setBackground(new java.awt.Color(255, 255, 153));
        jButtonEntirePurchase.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        jButtonEntirePurchase.setForeground(new java.awt.Color(51, 51, 0));
        jButtonEntirePurchase.setText("0.0");

        jButton6.setBackground(new java.awt.Color(204, 153, 255));
        jButton6.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        jButton6.setForeground(new java.awt.Color(51, 0, 51));
        jButton6.setText("Total Items");

        jButtonTotalItems.setBackground(new java.awt.Color(204, 255, 153));
        jButtonTotalItems.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        jButtonTotalItems.setForeground(new java.awt.Color(51, 51, 0));
        jButtonTotalItems.setText("0");

        jButton8.setBackground(new java.awt.Color(255, 153, 153));
        jButton8.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        jButton8.setForeground(new java.awt.Color(51, 0, 51));
        jButton8.setText("Today's Purchase Items");

        jButtonTodayPurchaseItems.setBackground(new java.awt.Color(153, 255, 153));
        jButtonTodayPurchaseItems.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        jButtonTodayPurchaseItems.setForeground(new java.awt.Color(0, 51, 51));
        jButtonTodayPurchaseItems.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonTodayPurchase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonTodayPurchaseItems, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonTotalItems, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEntirePurchase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(jButtonTodayPurchase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(jButtonEntirePurchase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addComponent(jButtonTotalItems, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addComponent(jButtonTodayPurchaseItems, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Sales"));

        jButton10.setBackground(new java.awt.Color(153, 255, 204));
        jButton10.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        jButton10.setForeground(new java.awt.Color(51, 51, 51));
        jButton10.setText("Today's Sales");

        jButtonTodaySales.setBackground(new java.awt.Color(255, 153, 204));
        jButtonTodaySales.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        jButtonTodaySales.setForeground(new java.awt.Color(51, 0, 51));
        jButtonTodaySales.setText("0.0");

        jButton12.setBackground(new java.awt.Color(204, 255, 153));
        jButton12.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        jButton12.setForeground(new java.awt.Color(51, 51, 0));
        jButton12.setText("Entire sales");

        jButtonEntireSales.setBackground(new java.awt.Color(204, 153, 255));
        jButtonEntireSales.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        jButtonEntireSales.setForeground(new java.awt.Color(51, 0, 51));
        jButtonEntireSales.setText("0.0");

        jButton14.setBackground(new java.awt.Color(255, 204, 153));
        jButton14.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        jButton14.setForeground(new java.awt.Color(51, 51, 0));
        jButton14.setText("Total Sales Items");

        jButtonTotalSalesItems.setBackground(new java.awt.Color(153, 153, 255));
        jButtonTotalSalesItems.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        jButtonTotalSalesItems.setForeground(new java.awt.Color(51, 0, 51));
        jButtonTotalSalesItems.setText("0");

        jButton16.setBackground(new java.awt.Color(255, 153, 153));
        jButton16.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        jButton16.setForeground(new java.awt.Color(51, 0, 0));
        jButton16.setText("Today's Sales Items");

        jButtonTodaySalesItems.setBackground(new java.awt.Color(153, 204, 255));
        jButtonTodaySalesItems.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        jButtonTodaySalesItems.setForeground(new java.awt.Color(0, 51, 51));
        jButtonTodaySalesItems.setText("0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEntireSales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonTodaySales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonTotalSalesItems, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonTodaySalesItems, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(jButtonTodaySales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(jButtonEntireSales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(jButtonTotalSalesItems, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(jButtonTodaySalesItems, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButtonEntirePurchase;
    private javax.swing.JButton jButtonEntireSales;
    private javax.swing.JButton jButtonTodayPurchase;
    private javax.swing.JButton jButtonTodayPurchaseItems;
    private javax.swing.JButton jButtonTodaySales;
    private javax.swing.JButton jButtonTodaySalesItems;
    private javax.swing.JButton jButtonTotalItems;
    private javax.swing.JButton jButtonTotalSalesItems;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
