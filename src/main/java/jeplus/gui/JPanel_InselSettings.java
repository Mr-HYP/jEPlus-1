/***************************************************************************
 *   jEPlus - EnergyPlus shell for parametric studies                      *
 *   Copyright (C) 2010  Yi Zhang <yi@jeplus.org>                          *
 *                                                                         *
 *   This program is free software: you can redistribute it and/or modify  *
 *   it under the terms of the GNU General Public License as published by  *
 *   the Free Software Foundation, either version 3 of the License, or     *
 *   (at your option) any later version.                                   *
 *                                                                         *
 *   This program is distributed in the hope that it will be useful,       *
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of        *
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the         *
 *   GNU General Public License for more details.                          *
 *                                                                         *
 *   You should have received a copy of the GNU General Public License     *
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>. *
 *                                                                         *
 ***************************************************************************/
package jeplus.gui; //

import java.awt.Color;
import java.io.File;
import javax.swing.JFileChooser;
import jeplus.INSELConfig;
import jeplus.JEPlusConfig;

/**
 * JPanel_EPlusSettings.java - This is the view of TRNSYSConfig record
 * @author zyyz
 * @version 0.6
 * @since 0.5b
 */
public class JPanel_InselSettings extends javax.swing.JPanel implements TitledJPanel {

    protected String title = "INSEL Executables";
    protected final JFileChooser fc = new JFileChooser("./");
    protected JEPlusConfig Config = JEPlusConfig.getDefaultInstance();;
    public void setConfig(JEPlusConfig config) {
        Config = config;
        initSettings();
        checkSettings();
    }

    /** Creates new form JPanel_EPlusSettings */
    public JPanel_InselSettings() {
        initComponents();
        initSettings();
        checkSettings();
    }

    /**
     * Get title of this panel
     * @return Title of this panel instance
     */
    @Override
    public String getTitle() {
        return this.title;
    }

    /**
     * Set title to this panel
     * @param title new title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * initialise display from data records
     */
    public final void initSettings () {
        txtBinDir.setText(Config.getInselBinDir());
        txtInselEXE.setText(Config.getInselEXEC());
    }

    /**
     * check validity of directory and command/file names
     */
    public final void checkSettings () {
        File dir = new File (txtBinDir.getText());
        if (! (dir.exists() && dir.isDirectory())) txtBinDir.setForeground(Color.red);
        else txtBinDir.setForeground(Color.black);

        if (! new File(txtInselEXE.getText()).exists()) txtInselEXE.setForeground(Color.red);
        else txtInselEXE.setForeground(Color.black);
    }

    /**
     * update record for directory and file names
     */
    protected final void updateSettings () {
        Config.setInselBinDir(txtBinDir.getText());
        Config.setInselEXEC(txtInselEXE.getText());
    }


    /** This method is called from within the constructor to
     * initialise the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel16 = new javax.swing.JLabel();
        txtScreenLog = new javax.swing.JTextField();
        cmdSelectINSELDir = new javax.swing.JButton();
        txtBinDir = new javax.swing.JTextField();
        cmdSelectINSELexe = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtInselEXE = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmdSave = new javax.swing.JButton();

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel16.setText("Console log file");

        txtScreenLog.setText("jeplus.log");

        cmdSelectINSELDir.setText("...");
        cmdSelectINSELDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSelectINSELDirActionPerformed(evt);
            }
        });

        txtBinDir.setEditable(false);
        txtBinDir.setText("C:/Program Files/Trnsys16_1/");
        txtBinDir.setToolTipText("This is the directory where the folders 'Exe and UserLib' are located");

        cmdSelectINSELexe.setText("...");
        cmdSelectINSELexe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSelectINSELexeActionPerformed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("INSEL binary diretory:");

        jLabel15.setText("command:");

        txtInselEXE.setEditable(false);
        txtInselEXE.setText("C:/Program Files/Trnsys16_1/Exe/TRNExe.exe");
        txtInselEXE.setToolTipText("The command may vary within different projects of TRNSYS. Edit this field if necessary. If the executable is located in a different location, please specify the relative diretory to the TRNSYS binary directory above.");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("INSEL executable:");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("<html><center>Please make sure INSEL is properly installed, with all user libraries and license accessible.</center></html>");

        cmdSave.setText("Save Configuration");
        cmdSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtInselEXE, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtBinDir))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cmdSelectINSELexe, 0, 1, Short.MAX_VALUE)
                            .addComponent(cmdSelectINSELDir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cmdSave, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtBinDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdSelectINSELDir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInselEXE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cmdSelectINSELexe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmdSave)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmdSelectINSELexeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSelectINSELexeActionPerformed
        // Select a file to open
        fc.setMultiSelectionEnabled(false);
        fc.setCurrentDirectory(new File(Config.getInselBinDir()));
        if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            String name = file.getPath();
            txtInselEXE.setText(name);
            txtInselEXE.setForeground(Color.black);
            Config.setInselEXEC(name);
        }
        fc.resetChoosableFileFilters();
}//GEN-LAST:event_cmdSelectINSELexeActionPerformed

    private void cmdSelectINSELDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSelectINSELDirActionPerformed
        // Select a directory to open
        fc.resetChoosableFileFilters();
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            String fn = file.getAbsolutePath();
            String bindir = fn + File.separator;
            Config.setInselBinDir(bindir);
            Config.setInselEXEC(new File (bindir + INSELConfig.getDefInselEXEC()).getAbsolutePath());
            initSettings();
            checkSettings();
        }
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
}//GEN-LAST:event_cmdSelectINSELDirActionPerformed

    private void cmdSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSaveActionPerformed
        Config.saveToFile("");
    }//GEN-LAST:event_cmdSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdSave;
    private javax.swing.JButton cmdSelectINSELDir;
    private javax.swing.JButton cmdSelectINSELexe;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtBinDir;
    private javax.swing.JTextField txtInselEXE;
    private javax.swing.JTextField txtScreenLog;
    // End of variables declaration//GEN-END:variables

}
