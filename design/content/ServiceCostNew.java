/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.content;

import action.content.ServiceCostNewAction;
import config.content.ServiceCostNewConfig;
import usu.widget.Dialog;

/**
 *
 * @author Fadhli
 */
public class ServiceCostNew extends javax.swing.JPanel {

    /**
     * Creates new form ServiceCostNew
     */
    public ServiceCostNew(Dialog dialog) {
        initComponents();
        action(dialog);
        config(dialog);
    }
    
    private void action (Dialog dialog) {
        ServiceCostNewAction.Close(buttonCancel, dialog);
        ServiceCostNewAction.Price(textHarga);
        ServiceCostNewAction.Save(buttonSave, dialog, textLayanan, textHarga);
    }
    
    private void config (Dialog dialog) {
        ServiceCostNewConfig.SetConfig(dialog, labelTitle);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelHeader = new javax.swing.JLabel();
        labelFooter = new javax.swing.JLabel();
        labelLeft = new javax.swing.JLabel();
        labelRight = new javax.swing.JLabel();
        labelTitle = new javax.swing.JLabel();
        separatorTitle = new javax.swing.JSeparator();
        labelLayanan = new javax.swing.JLabel();
        textLayanan = new javax.swing.JTextField();
        labelHarga = new javax.swing.JLabel();
        buttonCancel = new javax.swing.JButton();
        buttonSave = new javax.swing.JButton();
        textHarga = new com.lib.palette.NumericTextField();

        labelTitle.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        labelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lib/image32/blank-file.png"))); // NOI18N
        labelTitle.setText("{ TITLE }");
        labelTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelTitle.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        labelLayanan.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        labelLayanan.setText("<html>\n<u>L</u>ayanan\n</html>");

        textLayanan.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        labelHarga.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        labelHarga.setText("<html>\n<u>H</u>arga&nbsp;&nbsp;|&nbsp;&nbsp;<i>* hanya angka</i>\n</html>");

        buttonCancel.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        buttonCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lib/image16/arrow-left.png"))); // NOI18N
        buttonCancel.setText("Kembali");

        buttonSave.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        buttonSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lib/image16/arrow-right.png"))); // NOI18N
        buttonSave.setText("Simpan");
        buttonSave.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        textHarga.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelFooter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelLeft, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(separatorTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelLayanan, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textLayanan, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelRight, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(separatorTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelLayanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textLayanan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelFooter, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonSave;
    private javax.swing.JLabel labelFooter;
    private javax.swing.JLabel labelHarga;
    private javax.swing.JLabel labelHeader;
    private javax.swing.JLabel labelLayanan;
    private javax.swing.JLabel labelLeft;
    private javax.swing.JLabel labelRight;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JSeparator separatorTitle;
    private com.lib.palette.NumericTextField textHarga;
    private javax.swing.JTextField textLayanan;
    // End of variables declaration//GEN-END:variables
}
