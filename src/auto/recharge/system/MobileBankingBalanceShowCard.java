/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto.recharge.system;

import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author monirozzamanroni
 */
public class MobileBankingBalanceShowCard extends javax.swing.JPanel {

    /**
     * Creates new form MobileBankingBalanceShowCard
     */
    public MobileBankingBalanceShowCard() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ammountShowCard = new javax.swing.JPanel();
        serviceNameText = new javax.swing.JLabel();
        amountBalanceText = new javax.swing.JLabel();
        lastUpdateTimeText = new javax.swing.JLabel();

        ammountShowCard.setBackground(new java.awt.Color(204, 255, 204));

        serviceNameText.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        serviceNameText.setForeground(new java.awt.Color(0, 0, 0));
        serviceNameText.setText("bKash");

        amountBalanceText.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        amountBalanceText.setForeground(new java.awt.Color(255, 0, 51));
        amountBalanceText.setText("10000 Tk");

        lastUpdateTimeText.setFont(new java.awt.Font("Agency FB", 0, 12)); // NOI18N
        lastUpdateTimeText.setForeground(new java.awt.Color(204, 0, 51));
        lastUpdateTimeText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lastUpdateTimeText.setText("Last update : 20/20/20 12:12 PM");

        javax.swing.GroupLayout ammountShowCardLayout = new javax.swing.GroupLayout(ammountShowCard);
        ammountShowCard.setLayout(ammountShowCardLayout);
        ammountShowCardLayout.setHorizontalGroup(
            ammountShowCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ammountShowCardLayout.createSequentialGroup()
                .addComponent(serviceNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(amountBalanceText, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(lastUpdateTimeText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ammountShowCardLayout.setVerticalGroup(
            ammountShowCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ammountShowCardLayout.createSequentialGroup()
                .addGroup(ammountShowCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(serviceNameText)
                    .addComponent(amountBalanceText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lastUpdateTimeText))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ammountShowCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ammountShowCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public JLabel getAmountBalanceText() {
        return amountBalanceText;
    }

    public void setAmountBalanceText(JLabel amountBalanceText) {
        this.amountBalanceText = amountBalanceText;
    }

    public JLabel getLastUpdateTimeText() {
        return lastUpdateTimeText;
    }

    public void setLastUpdateTimeText(JLabel lastUpdateTimeText) {
        this.lastUpdateTimeText = lastUpdateTimeText;
    }

  

    public JLabel getServiceNameText() {
        return serviceNameText;
    }

    public void setServiceNameText(JLabel serviceNameText) {
        this.serviceNameText = serviceNameText;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ammountShowCard;
    private javax.swing.JLabel amountBalanceText;
    private javax.swing.JLabel lastUpdateTimeText;
    private javax.swing.JLabel serviceNameText;
    // End of variables declaration//GEN-END:variables
}
