/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.jwolff52.cyoa.gui;

import javax.swing.JOptionPane;

/**
 *
 * @author James
 */
public class ChooseSaveGUI extends javax.swing.JFrame {

    /**
     * Creates new form ChooseSaveGUI
     */
    public ChooseSaveGUI() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        mainPanel = new javax.swing.JPanel();
        chooseSaveLabel = new javax.swing.JLabel();
        savedGame1RB = new javax.swing.JRadioButton();
        savedGame2RB = new javax.swing.JRadioButton();
        savedGame3RB = new javax.swing.JRadioButton();
        savedGame4RB = new javax.swing.JRadioButton();
        savedGame5RB = new javax.swing.JRadioButton();
        submitButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Choose");
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(102, 102, 102));

        chooseSaveLabel.setForeground(new java.awt.Color(102, 255, 0));
        chooseSaveLabel.setText("Choose Save to Overwrite");

        savedGame1RB.setBackground(new java.awt.Color(102, 102, 102));
        savedGame1RB.setForeground(new java.awt.Color(102, 255, 0));
        savedGame1RB.setText(MainGUI.cyoa.getSavedGameName(0));
        savedGame1RB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savedGame1RBActionPerformed(evt);
            }
        });

        savedGame2RB.setBackground(new java.awt.Color(102, 102, 102));
        savedGame2RB.setForeground(new java.awt.Color(102, 255, 0));
        savedGame2RB.setText(MainGUI.cyoa.getSavedGameName(1));

        savedGame3RB.setBackground(new java.awt.Color(102, 102, 102));
        savedGame3RB.setForeground(new java.awt.Color(102, 255, 0));
        savedGame3RB.setText(MainGUI.cyoa.getSavedGameName(2));

        savedGame4RB.setBackground(new java.awt.Color(102, 102, 102));
        savedGame4RB.setForeground(new java.awt.Color(102, 255, 0));
        savedGame4RB.setText(MainGUI.cyoa.getSavedGameName(3));

        savedGame5RB.setBackground(new java.awt.Color(102, 102, 102));
        savedGame5RB.setForeground(new java.awt.Color(102, 255, 0));
        savedGame5RB.setText(MainGUI.cyoa.getSavedGameName(4));

        submitButton.setBackground(new java.awt.Color(0, 0, 0));
        submitButton.setForeground(new java.awt.Color(102, 255, 0));
        submitButton.setText("Submit");
        submitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                submitButtonMouseReleased(evt);
            }
        });

        cancelButton.setBackground(new java.awt.Color(0, 0, 0));
        cancelButton.setForeground(new java.awt.Color(102, 255, 0));
        cancelButton.setText("Cancel");
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cancelButtonMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(savedGame5RB)
                    .addComponent(savedGame3RB)
                    .addComponent(savedGame2RB)
                    .addComponent(savedGame1RB)
                    .addComponent(chooseSaveLabel)
                    .addComponent(savedGame4RB)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(submitButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chooseSaveLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(savedGame1RB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(savedGame2RB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(savedGame3RB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(savedGame4RB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(savedGame5RB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton)
                    .addComponent(cancelButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void savedGame1RBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savedGame1RBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_savedGame1RBActionPerformed

    private void cancelButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseReleased
        this.dispose();
    }//GEN-LAST:event_cancelButtonMouseReleased

    private void submitButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitButtonMouseReleased
        if(savedGame1RB.isSelected()){
            MainGUI.cyoa.setIdxToSave(0);
            this.dispose();
        }else if(savedGame2RB.isSelected()){
            MainGUI.cyoa.setIdxToSave(1);
            this.dispose();
        }else if(savedGame3RB.isSelected()){
            MainGUI.cyoa.setIdxToSave(2);
            this.dispose();
        }else if(savedGame4RB.isSelected()){
            MainGUI.cyoa.setIdxToSave(3);
            this.dispose();
        }else if(savedGame5RB.isSelected()){
            MainGUI.cyoa.setIdxToSave(4);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Please choose a save to delete!!", "Invalid Input", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_submitButtonMouseReleased

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
            java.util.logging.Logger.getLogger(ChooseSaveGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChooseSaveGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChooseSaveGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChooseSaveGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChooseSaveGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel chooseSaveLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JRadioButton savedGame1RB;
    private javax.swing.JRadioButton savedGame2RB;
    private javax.swing.JRadioButton savedGame3RB;
    private javax.swing.JRadioButton savedGame4RB;
    private javax.swing.JRadioButton savedGame5RB;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
