/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action.content;

import config.content.DocEmptyConfig;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import usu.widget.Dialog;

/**
 *
 * @author Fadhli
 */
public class DocEmptyAction {

    public static void Close (
        JButton buttonCancel, final Dialog dialog
    ) {
        buttonCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DocEmptyConfig.Close(dialog);
            }
        });
    }

    public static void Empty (
        JButton buttonEmpty, final Dialog dialog
    ) {
        buttonEmpty.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DocEmptyConfig.Empty(dialog);
            }
        });
    }
    
}
