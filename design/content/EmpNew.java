/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.content;

import action.content.EmpNewAction;
import config.content.EmpNewConfig;
import usu.widget.Dialog;

/**
 *
 * @author Fadhli
 */
public class EmpNew extends javax.swing.JPanel {

    /**
     * Creates new form EmpNew
     */
    public EmpNew(Dialog dialog) {
        initComponents();
        action(dialog);
        config(dialog);
    }
    
    private void action (Dialog dialog) {
        EmpNewAction.Back(buttonBack, dialog, PanelMaster, PanelInfo, textNama);
        EmpNewAction.Close(buttonCancel, dialog);
        EmpNewAction.Gender(radioLakilaki, radioPerempuan);
        EmpNewAction.Next(
            buttonNext, dialog,
            PanelMaster, PanelID, textID,
            textKTP, textNama,
            radioLakilaki, radioPerempuan,
            comboDinas, comboJabatan
        );
        EmpNewAction.Save(
            buttonSave, dialog, textID, textPassword, comboLevel
        );
        EmpNewAction.SetOfficial(comboDinas);
        EmpNewAction.SetOrgLevel(comboJabatan);
        EmpNewAction.SetUserLevel(comboLevel);
    }
    
    private void config (Dialog dialog) {
        EmpNewConfig.SetConfig(
            dialog, PanelMaster, PanelInfo, textNama,
            labelTitle, comboDinas, comboJabatan, comboLevel
        );
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelInfo = new javax.swing.JPanel();
        labelKTP = new javax.swing.JLabel();
        textKTP = new javax.swing.JTextField();
        labelNama = new javax.swing.JLabel();
        textNama = new javax.swing.JTextField();
        labelJenisKelamin = new javax.swing.JLabel();
        labelSeparatorJenisKelamin = new javax.swing.JLabel();
        radioLakilaki = new javax.swing.JRadioButton();
        radioPerempuan = new javax.swing.JRadioButton();
        comboJabatan = new javax.swing.JComboBox<>();
        comboDinas = new javax.swing.JComboBox<>();
        labelJabatan = new javax.swing.JLabel();
        labelDinas = new javax.swing.JLabel();
        buttonCancel = new javax.swing.JButton();
        buttonNext = new javax.swing.JButton();
        PanelID = new javax.swing.JPanel();
        labelID = new javax.swing.JLabel();
        labelLevel = new javax.swing.JLabel();
        textPassword = new javax.swing.JPasswordField();
        textID = new javax.swing.JTextField();
        labelPassword = new javax.swing.JLabel();
        comboLevel = new javax.swing.JComboBox<>();
        buttonBack = new javax.swing.JButton();
        buttonSave = new javax.swing.JButton();
        labelHeader = new javax.swing.JLabel();
        labelFooter = new javax.swing.JLabel();
        labelLeft = new javax.swing.JLabel();
        labelRight = new javax.swing.JLabel();
        labelTitle = new javax.swing.JLabel();
        separatorTitle = new javax.swing.JSeparator();
        PanelMaster = new javax.swing.JPanel();

        labelKTP.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        labelKTP.setText("<html>\nNomor <u>K</u>TP\n</html>");

        textKTP.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        labelNama.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        labelNama.setText("Nama Lengkap");

        textNama.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        labelJenisKelamin.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        labelJenisKelamin.setText("Jenis Kelamin");

        labelSeparatorJenisKelamin.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        labelSeparatorJenisKelamin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSeparatorJenisKelamin.setText(":");

        radioLakilaki.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        radioLakilaki.setText("Laki-laki");

        radioPerempuan.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        radioPerempuan.setText("Perempuan");

        comboJabatan.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        comboJabatan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih" }));

        comboDinas.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        comboDinas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih" }));

        labelJabatan.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        labelJabatan.setText("Jabatan");

        labelDinas.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        labelDinas.setText("Nama Instansi / Perusahaan");

        buttonCancel.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        buttonCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lib/image16/arrow-left.png"))); // NOI18N
        buttonCancel.setText("<html>\n<u>C</u>lose Dialog\n</html>");

        buttonNext.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        buttonNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lib/image16/arrow-right.png"))); // NOI18N

        javax.swing.GroupLayout PanelInfoLayout = new javax.swing.GroupLayout(PanelInfo);
        PanelInfo.setLayout(PanelInfoLayout);
        PanelInfoLayout.setHorizontalGroup(
            PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelKTP, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(textKTP, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(PanelInfoLayout.createSequentialGroup()
                .addComponent(labelJenisKelamin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSeparatorJenisKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioLakilaki)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioPerempuan))
            .addComponent(labelNama, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(textNama, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(comboDinas, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(labelJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(comboJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(labelDinas, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(PanelInfoLayout.createSequentialGroup()
                .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonNext, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PanelInfoLayout.setVerticalGroup(
            PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInfoLayout.createSequentialGroup()
                .addComponent(labelKTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textKTP, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textNama, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelJenisKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelSeparatorJenisKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(radioLakilaki, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(radioPerempuan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelDinas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboDinas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelJabatan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonNext, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        labelID.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        labelID.setText("<html>\nCreate New <u>U</u>sername for Login\n</html>");

        labelLevel.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        labelLevel.setText("Choose Level for This Person");

        textPassword.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        textID.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        labelPassword.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        labelPassword.setText("Create New Password");

        comboLevel.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        comboLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih" }));

        buttonBack.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        buttonBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lib/image16/arrow-left.png"))); // NOI18N

        buttonSave.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        buttonSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lib/image16/arrow-right.png"))); // NOI18N
        buttonSave.setText("<html>\n<u>S</u>ave Registration\n</html>");

        javax.swing.GroupLayout PanelIDLayout = new javax.swing.GroupLayout(PanelID);
        PanelID.setLayout(PanelIDLayout);
        PanelIDLayout.setHorizontalGroup(
            PanelIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelID, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(textID, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(labelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(textPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(labelLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(comboLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(PanelIDLayout.createSequentialGroup()
                .addComponent(buttonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PanelIDLayout.setVerticalGroup(
            PanelIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelIDLayout.createSequentialGroup()
                .addComponent(labelID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelLevel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        labelTitle.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        labelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lib/image32/blank-file.png"))); // NOI18N
        labelTitle.setText("{ TITLE }");
        labelTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelTitle.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout PanelMasterLayout = new javax.swing.GroupLayout(PanelMaster);
        PanelMaster.setLayout(PanelMasterLayout);
        PanelMasterLayout.setHorizontalGroup(
            PanelMasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        PanelMasterLayout.setVerticalGroup(
            PanelMasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

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
                    .addComponent(separatorTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelMaster, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(separatorTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PanelMaster, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(labelRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(labelFooter, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelID;
    private javax.swing.JPanel PanelInfo;
    private javax.swing.JPanel PanelMaster;
    private javax.swing.JButton buttonBack;
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonNext;
    private javax.swing.JButton buttonSave;
    private javax.swing.JComboBox<String> comboDinas;
    private javax.swing.JComboBox<String> comboJabatan;
    private javax.swing.JComboBox<String> comboLevel;
    private javax.swing.JLabel labelDinas;
    private javax.swing.JLabel labelFooter;
    private javax.swing.JLabel labelHeader;
    private javax.swing.JLabel labelID;
    private javax.swing.JLabel labelJabatan;
    private javax.swing.JLabel labelJenisKelamin;
    private javax.swing.JLabel labelKTP;
    private javax.swing.JLabel labelLeft;
    private javax.swing.JLabel labelLevel;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelRight;
    private javax.swing.JLabel labelSeparatorJenisKelamin;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JRadioButton radioLakilaki;
    private javax.swing.JRadioButton radioPerempuan;
    private javax.swing.JSeparator separatorTitle;
    private javax.swing.JTextField textID;
    private javax.swing.JTextField textKTP;
    private javax.swing.JTextField textNama;
    private javax.swing.JPasswordField textPassword;
    // End of variables declaration//GEN-END:variables
}
