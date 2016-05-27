/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.content;

import action.content.NasabahNewAction;
import config.content.NasabahNewConfig;
import usu.widget.Dialog;

/**
 *
 * @author Fadhli
 */
public class NasabahNew extends javax.swing.JPanel {

    /**
     * Creates new form NasabahNew
     */
    public NasabahNew(Dialog dialog) {
        initComponents();
        action(dialog);
        config();
    }
    
    private void action (Dialog dialog) {
        NasabahNewAction.BackToBrowsePegawai(
            buttonBack1, dialog,
            PanelMain, PanelBrowsePegawai, textSearch
        );
        NasabahNewAction.BackToDataPegawai(
            buttonBack2, dialog, PanelMain, PanelDataPegawai
        );
        NasabahNewAction.BackToPanelKantor(
            buttonBack3, dialog, PanelMain, PanelKantor
        );
        NasabahNewAction.Close(miClose, dialog);
        NasabahNewAction.GoToDataBank(
            buttonNext2, dialog, PanelMain, PanelBank, comboBank
        );
        NasabahNewAction.GoToPanelKantor(
            buttonNext1,
            dialog, PanelMain, PanelKantor,
            labelKantor, labelAlamatKantor
        );
        NasabahNewAction.PopupTable(
            popupTablePegawai, table, miUsePegawai, miClose, miBlocked
        );
        NasabahNewAction.Refresh(miRefresh, table, textSearch);
        NasabahNewAction.Search(table, textSearch);
        NasabahNewAction.Search(linkSearch, table, textSearch);
        NasabahNewAction.UseThisEmployer(
            miUsePegawai,
            dialog, PanelMain, PanelDataPegawai,
            labelNama, labelKelamin, labelKota,
            labelTglLahir, labelKontak, labelAlamat
        );
    }
    
    private void config () {
        NasabahNewConfig.SetConfig(
            labelTitle, PanelMain, PanelBrowsePegawai,
            table, textSearch, comboBank
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

        PanelBrowsePegawai = new javax.swing.JPanel();
        labelBrowsePegawai = new javax.swing.JLabel();
        scrollPaneTable = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        textSearch = new javax.swing.JTextField();
        linkSearch = new com.lib.palette.link();
        popupTablePegawai = new javax.swing.JPopupMenu();
        miRefresh = new javax.swing.JMenuItem();
        separatorRefresh = new javax.swing.JPopupMenu.Separator();
        miUsePegawai = new javax.swing.JMenuItem();
        miBlocked = new javax.swing.JMenuItem();
        miClose = new javax.swing.JMenuItem();
        PanelDataPegawai = new javax.swing.JPanel();
        labelDataPegawai = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelNama = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelKelamin = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        labelKota = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        labelTglLahir = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        labelKontak = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        labelAlamat = new javax.swing.JLabel();
        separatorDataPegawai = new javax.swing.JSeparator();
        PanelFooterDataPegawai = new javax.swing.JPanel();
        buttonBack1 = new javax.swing.JButton();
        buttonNext1 = new javax.swing.JButton();
        PanelKantor = new javax.swing.JPanel();
        labelDataKantor = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        labelKantor = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        labelAlamatKantor = new javax.swing.JLabel();
        separatorDataKantor = new javax.swing.JSeparator();
        PanelFooterDataKantor = new javax.swing.JPanel();
        buttonBack2 = new javax.swing.JButton();
        buttonNext2 = new javax.swing.JButton();
        PanelBank = new javax.swing.JPanel();
        labelDataBank = new javax.swing.JLabel();
        comboBank = new javax.swing.JComboBox<>();
        labelNorek = new javax.swing.JLabel();
        textNorek = new javax.swing.JTextField();
        separatorDataBank = new javax.swing.JSeparator();
        PanelFooterDataBank = new javax.swing.JPanel();
        buttonBack3 = new javax.swing.JButton();
        buttonSave = new javax.swing.JButton();
        labelHeader = new javax.swing.JLabel();
        labelFooter = new javax.swing.JLabel();
        labelLeft = new javax.swing.JLabel();
        labelRight = new javax.swing.JLabel();
        labelTitle = new javax.swing.JLabel();
        separatorTitle = new javax.swing.JSeparator();
        PanelMain = new javax.swing.JPanel();

        labelBrowsePegawai.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        labelBrowsePegawai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBrowsePegawai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lib/image16/user.png"))); // NOI18N
        labelBrowsePegawai.setText(".:: Browse Pegawai ::.");
        labelBrowsePegawai.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelBrowsePegawai.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        scrollPaneTable.setComponentPopupMenu(popupTablePegawai);

        table.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
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
        table.setComponentPopupMenu(popupTablePegawai);
        table.setRowHeight(35);
        scrollPaneTable.setViewportView(table);

        textSearch.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        textSearch.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        linkSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lib/image16/search.png"))); // NOI18N
        linkSearch.setText("Search");

        javax.swing.GroupLayout PanelBrowsePegawaiLayout = new javax.swing.GroupLayout(PanelBrowsePegawai);
        PanelBrowsePegawai.setLayout(PanelBrowsePegawaiLayout);
        PanelBrowsePegawaiLayout.setHorizontalGroup(
            PanelBrowsePegawaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelBrowsePegawai, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
            .addComponent(scrollPaneTable, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(PanelBrowsePegawaiLayout.createSequentialGroup()
                .addComponent(textSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(linkSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelBrowsePegawaiLayout.setVerticalGroup(
            PanelBrowsePegawaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBrowsePegawaiLayout.createSequentialGroup()
                .addComponent(labelBrowsePegawai, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPaneTable, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelBrowsePegawaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(linkSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        miRefresh.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        miRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lib/image16/synchronize.png"))); // NOI18N
        miRefresh.setText("Refresh");
        popupTablePegawai.add(miRefresh);
        popupTablePegawai.add(separatorRefresh);

        miUsePegawai.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        miUsePegawai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lib/image16/arrow-right.png"))); // NOI18N
        miUsePegawai.setText("Use This Employer");
        popupTablePegawai.add(miUsePegawai);

        miBlocked.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        miBlocked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lib/image16/edit-delete.png"))); // NOI18N
        miBlocked.setText("Blocked");
        popupTablePegawai.add(miBlocked);

        miClose.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        miClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lib/image16/arrow-left.png"))); // NOI18N
        miClose.setText("Exit");
        popupTablePegawai.add(miClose);

        labelDataPegawai.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        labelDataPegawai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDataPegawai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lib/image16/user.png"))); // NOI18N
        labelDataPegawai.setText(".:: Data Pegawai ::.");
        labelDataPegawai.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelDataPegawai.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel1.setText("Nama Lengkap");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText(":");

        labelNama.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        labelNama.setText(". . .");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel3.setText("Jenis Kelamin");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText(":");

        labelKelamin.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        labelKelamin.setText(". . .");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel5.setText("Kab. / Kota");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText(":");

        labelKota.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        labelKota.setText(". . .");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel7.setText("Tgl. Lahir");

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText(":");

        labelTglLahir.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        labelTglLahir.setText(". . .");

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel9.setText("No. Telepon");

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText(":");

        labelKontak.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        labelKontak.setText(". . .");

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel12.setText("Alamat Rumah");

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText(":");

        labelAlamat.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        labelAlamat.setText(". . .");

        buttonBack1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        buttonBack1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lib/image16/arrow-left.png"))); // NOI18N
        buttonBack1.setPreferredSize(new java.awt.Dimension(50, 40));
        PanelFooterDataPegawai.add(buttonBack1);

        buttonNext1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        buttonNext1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lib/image16/arrow-right.png"))); // NOI18N
        buttonNext1.setPreferredSize(new java.awt.Dimension(50, 40));
        PanelFooterDataPegawai.add(buttonNext1);

        javax.swing.GroupLayout PanelDataPegawaiLayout = new javax.swing.GroupLayout(PanelDataPegawai);
        PanelDataPegawai.setLayout(PanelDataPegawaiLayout);
        PanelDataPegawaiLayout.setHorizontalGroup(
            PanelDataPegawaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDataPegawaiLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelDataPegawaiLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelKelamin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelDataPegawaiLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelKota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelDataPegawaiLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTglLahir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelDataPegawaiLayout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelKontak, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelDataPegawaiLayout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelAlamat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(labelDataPegawai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(separatorDataPegawai)
            .addComponent(PanelFooterDataPegawai, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        PanelDataPegawaiLayout.setVerticalGroup(
            PanelDataPegawaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDataPegawaiLayout.createSequentialGroup()
                .addComponent(labelDataPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDataPegawaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNama))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDataPegawaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelKelamin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDataPegawaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelKota))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDataPegawaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTglLahir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDataPegawaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelKontak))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDataPegawaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAlamat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separatorDataPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelFooterDataPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        labelDataKantor.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        labelDataKantor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDataKantor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lib/image16/factory.png"))); // NOI18N
        labelDataKantor.setText(".:: Kantor ::.");
        labelDataKantor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelDataKantor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel14.setText("Kantor");

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText(":");

        labelKantor.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        labelKantor.setText(". . .");

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel16.setText("Alamat Kantor");

        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText(":");

        labelAlamatKantor.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        labelAlamatKantor.setText(". . .");

        buttonBack2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        buttonBack2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lib/image16/arrow-left.png"))); // NOI18N
        buttonBack2.setPreferredSize(new java.awt.Dimension(50, 40));
        PanelFooterDataKantor.add(buttonBack2);

        buttonNext2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        buttonNext2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lib/image16/arrow-right.png"))); // NOI18N
        buttonNext2.setPreferredSize(new java.awt.Dimension(50, 40));
        PanelFooterDataKantor.add(buttonNext2);

        javax.swing.GroupLayout PanelKantorLayout = new javax.swing.GroupLayout(PanelKantor);
        PanelKantor.setLayout(PanelKantorLayout);
        PanelKantorLayout.setHorizontalGroup(
            PanelKantorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelDataKantor, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
            .addGroup(PanelKantorLayout.createSequentialGroup()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelKantor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelKantorLayout.createSequentialGroup()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelAlamatKantor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(separatorDataKantor)
            .addComponent(PanelFooterDataKantor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelKantorLayout.setVerticalGroup(
            PanelKantorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelKantorLayout.createSequentialGroup()
                .addComponent(labelDataKantor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelKantorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelKantor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelKantorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAlamatKantor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separatorDataKantor, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelFooterDataKantor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        labelDataBank.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        labelDataBank.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDataBank.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lib/image16/insert-card.png"))); // NOI18N
        labelDataBank.setText(".:: Data Bank ::.");
        labelDataBank.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelDataBank.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        comboBank.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        comboBank.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Bank" }));

        labelNorek.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        labelNorek.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNorek.setText("Masukan No. Rekening");

        textNorek.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        textNorek.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        buttonBack3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        buttonBack3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lib/image16/arrow-left.png"))); // NOI18N
        buttonBack3.setPreferredSize(new java.awt.Dimension(50, 40));
        PanelFooterDataBank.add(buttonBack3);

        buttonSave.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        buttonSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lib/image16/checkmark.png"))); // NOI18N
        buttonSave.setPreferredSize(new java.awt.Dimension(50, 40));
        PanelFooterDataBank.add(buttonSave);

        javax.swing.GroupLayout PanelBankLayout = new javax.swing.GroupLayout(PanelBank);
        PanelBank.setLayout(PanelBankLayout);
        PanelBankLayout.setHorizontalGroup(
            PanelBankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelDataBank, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
            .addComponent(comboBank, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelNorek, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
            .addComponent(textNorek)
            .addComponent(separatorDataBank)
            .addComponent(PanelFooterDataBank, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelBankLayout.setVerticalGroup(
            PanelBankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBankLayout.createSequentialGroup()
                .addComponent(labelDataBank, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBank, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNorek)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textNorek, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separatorDataBank, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelFooterDataBank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        labelTitle.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        labelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lib/image32/payment-creditcard-visa.png"))); // NOI18N
        labelTitle.setText("{ TITLE }");
        labelTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelTitle.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout PanelMainLayout = new javax.swing.GroupLayout(PanelMain);
        PanelMain.setLayout(PanelMainLayout);
        PanelMainLayout.setHorizontalGroup(
            PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        PanelMainLayout.setVerticalGroup(
            PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
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
                    .addComponent(labelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(separatorTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelRight, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(separatorTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelFooter, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBank;
    private javax.swing.JPanel PanelBrowsePegawai;
    private javax.swing.JPanel PanelDataPegawai;
    private javax.swing.JPanel PanelFooterDataBank;
    private javax.swing.JPanel PanelFooterDataKantor;
    private javax.swing.JPanel PanelFooterDataPegawai;
    private javax.swing.JPanel PanelKantor;
    private javax.swing.JPanel PanelMain;
    private javax.swing.JButton buttonBack1;
    private javax.swing.JButton buttonBack2;
    private javax.swing.JButton buttonBack3;
    private javax.swing.JButton buttonNext1;
    private javax.swing.JButton buttonNext2;
    private javax.swing.JButton buttonSave;
    private javax.swing.JComboBox<String> comboBank;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelAlamat;
    private javax.swing.JLabel labelAlamatKantor;
    private javax.swing.JLabel labelBrowsePegawai;
    private javax.swing.JLabel labelDataBank;
    private javax.swing.JLabel labelDataKantor;
    private javax.swing.JLabel labelDataPegawai;
    private javax.swing.JLabel labelFooter;
    private javax.swing.JLabel labelHeader;
    private javax.swing.JLabel labelKantor;
    private javax.swing.JLabel labelKelamin;
    private javax.swing.JLabel labelKontak;
    private javax.swing.JLabel labelKota;
    private javax.swing.JLabel labelLeft;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelNorek;
    private javax.swing.JLabel labelRight;
    private javax.swing.JLabel labelTglLahir;
    private javax.swing.JLabel labelTitle;
    private com.lib.palette.link linkSearch;
    private javax.swing.JMenuItem miBlocked;
    private javax.swing.JMenuItem miClose;
    private javax.swing.JMenuItem miRefresh;
    private javax.swing.JMenuItem miUsePegawai;
    private javax.swing.JPopupMenu popupTablePegawai;
    private javax.swing.JScrollPane scrollPaneTable;
    private javax.swing.JSeparator separatorDataBank;
    private javax.swing.JSeparator separatorDataKantor;
    private javax.swing.JSeparator separatorDataPegawai;
    private javax.swing.JPopupMenu.Separator separatorRefresh;
    private javax.swing.JSeparator separatorTitle;
    private javax.swing.JTable table;
    private javax.swing.JTextField textNorek;
    private javax.swing.JTextField textSearch;
    // End of variables declaration//GEN-END:variables
}
