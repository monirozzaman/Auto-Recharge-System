/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto.recharge.system;

import javax.swing.JLabel;
import javax.swing.JTable;

/**
 *
 * @author monirozzamanroni
 */
public class SimOfferViewPanelUi extends javax.swing.JPanel {

    /**
     * Creates new form SimOfferViewPanel
     */
    public SimOfferViewPanelUi() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tableBanglalinkOffers = new javax.swing.JTable();
        banglalinkLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableGpOffers = new javax.swing.JTable();
        banglalinkLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableRobiOffers = new javax.swing.JTable();
        banglalinkLabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableAirtelOffers = new javax.swing.JTable();
        banglalinkLabel3 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableTeletalkOffers = new javax.swing.JTable();
        banglalinkLabel4 = new javax.swing.JLabel();
        cross = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));

        tableBanglalinkOffers.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableBanglalinkOffers);

        banglalinkLabel.setFont(new java.awt.Font("Agency FB", 1, 30)); // NOI18N
        banglalinkLabel.setForeground(new java.awt.Color(255, 0, 0));
        banglalinkLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        banglalinkLabel.setText("Banglalink");

        tableGpOffers.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tableGpOffers);

        banglalinkLabel1.setFont(new java.awt.Font("Agency FB", 1, 30)); // NOI18N
        banglalinkLabel1.setForeground(new java.awt.Color(255, 0, 0));
        banglalinkLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        banglalinkLabel1.setText("Grameen Phone");

        tableRobiOffers.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tableRobiOffers);

        banglalinkLabel2.setFont(new java.awt.Font("Agency FB", 1, 30)); // NOI18N
        banglalinkLabel2.setForeground(new java.awt.Color(255, 0, 0));
        banglalinkLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        banglalinkLabel2.setText("ROBI");

        tableAirtelOffers.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(tableAirtelOffers);

        banglalinkLabel3.setFont(new java.awt.Font("Agency FB", 1, 30)); // NOI18N
        banglalinkLabel3.setForeground(new java.awt.Color(255, 0, 0));
        banglalinkLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        banglalinkLabel3.setText("AIRTEL");

        tableTeletalkOffers.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(tableTeletalkOffers);

        banglalinkLabel4.setFont(new java.awt.Font("Agency FB", 1, 30)); // NOI18N
        banglalinkLabel4.setForeground(new java.awt.Color(255, 0, 0));
        banglalinkLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        banglalinkLabel4.setText("TELETALK");

        cross.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cross.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/cross.png"))); // NOI18N
        cross.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crossMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 982, Short.MAX_VALUE)
                    .addComponent(banglalinkLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(banglalinkLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(banglalinkLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 970, Short.MAX_VALUE)
                            .addComponent(banglalinkLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 970, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(banglalinkLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(cross, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 970, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cross)
                    .addComponent(banglalinkLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(banglalinkLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(banglalinkLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(banglalinkLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(banglalinkLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    public JLabel getCross() {
        return cross;
    }

    public void setCross(JLabel cross) {
        this.cross = cross;
    }

    public JTable getTableAirtelOffers() {
        return tableAirtelOffers;
    }

    public void setTableAirtelOffers(JTable tableAirtelOffers) {
        this.tableAirtelOffers = tableAirtelOffers;
    }

    public JTable getTableBanglalinkOffers() {
        return tableBanglalinkOffers;
    }

    public void setTableBanglalinkOffers(JTable tableBanglalinkOffers) {
        this.tableBanglalinkOffers = tableBanglalinkOffers;
    }

    public JTable getTableGpOffers() {
        return tableGpOffers;
    }

    public void setTableGpOffers(JTable tableGpOffers) {
        this.tableGpOffers = tableGpOffers;
    }

    public JTable getTableRobiOffers() {
        return tableRobiOffers;
    }

    public void setTableRobiOffers(JTable tableRobiOffers) {
        this.tableRobiOffers = tableRobiOffers;
    }

    public JTable getTableTeletalkOffers() {
        return tableTeletalkOffers;
    }

    public void setTableTeletalkOffers(JTable tableTeletalkOffers) {
        this.tableTeletalkOffers = tableTeletalkOffers;
    }

    private void crossMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crossMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_crossMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel banglalinkLabel;
    private javax.swing.JLabel banglalinkLabel1;
    private javax.swing.JLabel banglalinkLabel2;
    private javax.swing.JLabel banglalinkLabel3;
    private javax.swing.JLabel banglalinkLabel4;
    private javax.swing.JLabel cross;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable tableAirtelOffers;
    private javax.swing.JTable tableBanglalinkOffers;
    private javax.swing.JTable tableGpOffers;
    private javax.swing.JTable tableRobiOffers;
    private javax.swing.JTable tableTeletalkOffers;
    // End of variables declaration//GEN-END:variables
}
