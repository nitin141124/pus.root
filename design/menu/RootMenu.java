/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.menu;

import action.menu.RootMenuAction;

/**
 *
 * @author Fadhli
 */
public class RootMenu extends javax.swing.JPanel {

    /**
     * Creates new form RootMenu
     */
    public RootMenu() {
        initComponents();
        action();
    }
    
    private void action () {
        RootMenuAction.BankOptions(buttonDaftarPerbankan);
        RootMenuAction.ChangePassword(buttonChangePassword);
        RootMenuAction.Doc(buttonDaftarDokterBidan);
        RootMenuAction.EmpOptions(buttonDaftarPegawai);
        RootMenuAction.NasabahOptions(buttonDaftarRekeningPegawai);
        RootMenuAction.OrgLevelOptions(buttonDaftarTingkatOrganisasi);
        RootMenuAction.ServiceCostOptions(buttonDaftarHargaLayanan);
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
        buttonChangePassword = new com.lib.palette.button();
        buttonDaftarDokterBidan = new com.lib.palette.button();
        buttonDaftarPasien = new com.lib.palette.button();
        buttonDaftarPegawai = new com.lib.palette.button();
        buttonDaftarRekeningPegawai = new com.lib.palette.button();
        buttonDaftarTingkatOrganisasi = new com.lib.palette.button();
        buttonDaftarAsset = new com.lib.palette.button();
        buttonDaftarTransaksiKantor = new com.lib.palette.button();
        buttonDaftarTransaksiPasien = new com.lib.palette.button();
        buttonDaftarPerbankan = new com.lib.palette.button();
        buttonDaftarRekamMedis = new com.lib.palette.button();
        buttonDaftarHargaLayanan = new com.lib.palette.button();
        buttonDaftarPasienBPJS = new com.lib.palette.button();
        buttonDaftarObat = new com.lib.palette.button();

        buttonChangePassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lib/image32/microsoft-security-essential.png"))); // NOI18N
        buttonChangePassword.setText("Change Password");

        buttonDaftarDokterBidan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lib/image32/live-messenger.png"))); // NOI18N
        buttonDaftarDokterBidan.setText("Daftar Dokter & Bidan");

        buttonDaftarPasien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lib/image32/relationship.png"))); // NOI18N
        buttonDaftarPasien.setText("Daftar Pasien");

        buttonDaftarPegawai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lib/image32/male.png"))); // NOI18N
        buttonDaftarPegawai.setText("Daftar Pegawai");

        buttonDaftarRekeningPegawai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lib/image32/payment-creditcard-visa.png"))); // NOI18N
        buttonDaftarRekeningPegawai.setText("Daftar Rekening Pegawai");

        buttonDaftarTingkatOrganisasi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lib/image32/bar-chart.png"))); // NOI18N
        buttonDaftarTingkatOrganisasi.setText("Daftar Tingkat Organisasi");

        buttonDaftarAsset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lib/image32/test-paper.png"))); // NOI18N
        buttonDaftarAsset.setText("Daftar Asset");

        buttonDaftarTransaksiKantor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lib/image32/mac-address-book.png"))); // NOI18N
        buttonDaftarTransaksiKantor.setText("Daftar Transaksi Kantor");

        buttonDaftarTransaksiPasien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lib/image32/address-book.png"))); // NOI18N
        buttonDaftarTransaksiPasien.setText("Daftar Transaksi Pasien");

        buttonDaftarPerbankan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lib/image32/bank.png"))); // NOI18N
        buttonDaftarPerbankan.setText("Daftar Perbankan");

        buttonDaftarRekamMedis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lib/image32/documents-library.png"))); // NOI18N
        buttonDaftarRekamMedis.setText("Daftar Rekam Medis");

        buttonDaftarHargaLayanan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lib/image32/sales-by-payment-method-rep.png"))); // NOI18N
        buttonDaftarHargaLayanan.setText("Daftar Harga & Layanan");

        buttonDaftarPasienBPJS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lib/image32/webpage.png"))); // NOI18N
        buttonDaftarPasienBPJS.setText("Daftar Pasien BPJS");

        buttonDaftarObat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lib/image32/dropbox.png"))); // NOI18N
        buttonDaftarObat.setText("Daftar Obat");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelFooter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonChangePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonDaftarDokterBidan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonDaftarPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonDaftarPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonDaftarRekeningPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonDaftarTingkatOrganisasi, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonDaftarAsset, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonDaftarTransaksiKantor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonDaftarTransaksiPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonDaftarPerbankan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonDaftarRekamMedis, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonDaftarHargaLayanan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonDaftarPasienBPJS, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonDaftarObat, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelRight, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonChangePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonDaftarPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonDaftarDokterBidan, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonDaftarPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonDaftarRekeningPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonDaftarTingkatOrganisasi, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonDaftarAsset, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonDaftarTransaksiKantor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonDaftarTransaksiPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonDaftarPerbankan, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonDaftarRekamMedis, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonDaftarHargaLayanan, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonDaftarPasienBPJS, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonDaftarObat, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelFooter, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.lib.palette.button buttonChangePassword;
    private com.lib.palette.button buttonDaftarAsset;
    private com.lib.palette.button buttonDaftarDokterBidan;
    private com.lib.palette.button buttonDaftarHargaLayanan;
    private com.lib.palette.button buttonDaftarObat;
    private com.lib.palette.button buttonDaftarPasien;
    private com.lib.palette.button buttonDaftarPasienBPJS;
    private com.lib.palette.button buttonDaftarPegawai;
    private com.lib.palette.button buttonDaftarPerbankan;
    private com.lib.palette.button buttonDaftarRekamMedis;
    private com.lib.palette.button buttonDaftarRekeningPegawai;
    private com.lib.palette.button buttonDaftarTingkatOrganisasi;
    private com.lib.palette.button buttonDaftarTransaksiKantor;
    private com.lib.palette.button buttonDaftarTransaksiPasien;
    private javax.swing.JLabel labelFooter;
    private javax.swing.JLabel labelHeader;
    private javax.swing.JLabel labelLeft;
    private javax.swing.JLabel labelRight;
    // End of variables declaration//GEN-END:variables
}
