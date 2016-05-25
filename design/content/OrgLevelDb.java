/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.content;

import action.content.OrgLevelDbAction;
import config.content.OrgLevelDbConfig;
import javax.swing.JPanel;
import usu.widget.Dialog;

/**
 *
 * @author Fadhli
 */
public class OrgLevelDb extends JPanel {

    /**
     * Creates new form OrgLevelDb
     */
    public OrgLevelDb(Dialog dialog) {
        initComponents();
        action(dialog);
        config();
    }
    
    private void action (Dialog dialog) {
        OrgLevelDbAction.Backup(linkBackup, table);
        OrgLevelDbAction.Close(buttonClose, dialog);
        OrgLevelDbAction.Delete(miDelete, table, textSearch, linkStatus);
        OrgLevelDbAction.Edit(miEdit, dialog);
        OrgLevelDbAction.Empty(linkEmpty, dialog);
        OrgLevelDbAction.PopupTable(
            popupTable, table, miEdit, miDelete, miBlocked
        );
        OrgLevelDbAction.Refresh(buttonRefresh, table, textSearch, linkStatus);
        OrgLevelDbAction.Refresh(miRefresh, table, textSearch, linkStatus);
        OrgLevelDbAction.Search(buttonSearch, table, textSearch, linkStatus);
        OrgLevelDbAction.Upload(linkUpload, table, textSearch, linkStatus);
    }
    
    private void config () {
        OrgLevelDbConfig.SetConfig(labelTitle, table, textSearch, linkStatus);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupTable = new javax.swing.JPopupMenu();
        miRefresh = new javax.swing.JMenuItem();
        separatorRefresh = new javax.swing.JPopupMenu.Separator();
        miEdit = new javax.swing.JMenuItem();
        miDelete = new javax.swing.JMenuItem();
        miBlocked = new javax.swing.JMenuItem();
        labelTitle = new javax.swing.JLabel();
        separatorTitle = new javax.swing.JSeparator();
        labelSeparatorTitle = new javax.swing.JLabel();
        separatorRight = new javax.swing.JSeparator();
        buttonClose = new javax.swing.JButton();
        buttonRefresh = new javax.swing.JButton();
        labelOperations = new javax.swing.JLabel();
        labelSeparatorRight = new javax.swing.JLabel();
        buttonSearch = new javax.swing.JButton();
        textSearch = new javax.swing.JTextField();
        labelPencarian = new javax.swing.JLabel();
        scrollpaneTable = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        toolbarFooter = new javax.swing.JToolBar();
        linkStatus = new com.lib.palette.link();
        labelSeparatorStatus0 = new javax.swing.JLabel();
        linkEmpty = new com.lib.palette.link();
        labelSeparatorStatus1 = new javax.swing.JLabel();
        linkBackup = new com.lib.palette.link();
        labelSeparatorStatus2 = new javax.swing.JLabel();
        linkUpload = new com.lib.palette.link();

        miRefresh.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        miRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lib/image16/synchronize.png"))); // NOI18N
        miRefresh.setText("<html>\n<u>R</u>efresh\n</html>");
        popupTable.add(miRefresh);
        popupTable.add(separatorRefresh);

        miEdit.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        miEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lib/image16/services.png"))); // NOI18N
        miEdit.setText("<html>\n<u>E</u>dit Selected Row\n</html>");
        popupTable.add(miEdit);

        miDelete.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        miDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lib/image16/minus.png"))); // NOI18N
        miDelete.setText("<html>\n<u>R</u>emove Selected Row\n</html>");
        popupTable.add(miDelete);

        miBlocked.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        miBlocked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lib/image16/edit-delete.png"))); // NOI18N
        miBlocked.setText("Blocked");
        popupTable.add(miBlocked);

        labelTitle.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        labelTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lib/image32/bar-chart.png"))); // NOI18N
        labelTitle.setText("{ TITLE }");

        buttonClose.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        buttonClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lib/image16/arrow-right.png"))); // NOI18N
        buttonClose.setText("<html>\nGo <u>B</u>ack\n</html>");

        buttonRefresh.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        buttonRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lib/image16/synchronize.png"))); // NOI18N
        buttonRefresh.setText("<html>\n<u>R</u>efresh\n</html>");

        labelOperations.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        labelOperations.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelOperations.setText("<html>\n<u>A</u>ctions\n</html>");

        buttonSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lib/image16/search.png"))); // NOI18N

        textSearch.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        labelPencarian.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        labelPencarian.setText("<html>\n<u>P</u>encarian\n</html>");

        scrollpaneTable.setComponentPopupMenu(popupTable);

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
        table.setComponentPopupMenu(popupTable);
        table.setRowHeight(35);
        scrollpaneTable.setViewportView(table);

        toolbarFooter.setRollover(true);

        linkStatus.setText("{ STATUS }");
        toolbarFooter.add(linkStatus);

        labelSeparatorStatus0.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        labelSeparatorStatus0.setText("   |   ");
        toolbarFooter.add(labelSeparatorStatus0);

        linkEmpty.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lib/image16/empty-trash.png"))); // NOI18N
        linkEmpty.setText("Kosongkan Database");
        toolbarFooter.add(linkEmpty);

        labelSeparatorStatus1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        labelSeparatorStatus1.setText("  |  ");
        toolbarFooter.add(labelSeparatorStatus1);

        linkBackup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lib/image16/download.png"))); // NOI18N
        linkBackup.setText("Backup Database");
        toolbarFooter.add(linkBackup);

        labelSeparatorStatus2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        labelSeparatorStatus2.setText("  |  ");
        toolbarFooter.add(labelSeparatorStatus2);

        linkUpload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lib/image16/upload.png"))); // NOI18N
        linkUpload.setText("Upload Database");
        toolbarFooter.add(linkUpload);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollpaneTable)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(separatorTitle))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelSeparatorTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(textSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buttonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(labelPencarian, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelSeparatorRight, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelOperations, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(buttonRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buttonClose, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(separatorRight)))
                    .addComponent(toolbarFooter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelOperations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(buttonClose, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(labelSeparatorRight, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(labelPencarian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(textSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(separatorRight, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelSeparatorTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(labelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(separatorTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollpaneTable, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(toolbarFooter, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonClose;
    private javax.swing.JButton buttonRefresh;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JLabel labelOperations;
    private javax.swing.JLabel labelPencarian;
    private javax.swing.JLabel labelSeparatorRight;
    private javax.swing.JLabel labelSeparatorStatus0;
    private javax.swing.JLabel labelSeparatorStatus1;
    private javax.swing.JLabel labelSeparatorStatus2;
    private javax.swing.JLabel labelSeparatorTitle;
    private javax.swing.JLabel labelTitle;
    private com.lib.palette.link linkBackup;
    private com.lib.palette.link linkEmpty;
    private com.lib.palette.link linkStatus;
    private com.lib.palette.link linkUpload;
    private javax.swing.JMenuItem miBlocked;
    private javax.swing.JMenuItem miDelete;
    private javax.swing.JMenuItem miEdit;
    private javax.swing.JMenuItem miRefresh;
    private javax.swing.JPopupMenu popupTable;
    private javax.swing.JScrollPane scrollpaneTable;
    private javax.swing.JPopupMenu.Separator separatorRefresh;
    private javax.swing.JSeparator separatorRight;
    private javax.swing.JSeparator separatorTitle;
    private javax.swing.JTable table;
    private javax.swing.JTextField textSearch;
    private javax.swing.JToolBar toolbarFooter;
    // End of variables declaration//GEN-END:variables
}