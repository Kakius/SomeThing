/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author D.Alekseenko
 */
public class LengthText extends javax.swing.JFrame
{
    private Map<Integer, Integer> lengthMap = new HashMap<Integer, Integer>();

    /**
     * Creates new form LengthText
     */
    public LengthText()
    {
        initComponents();
        UIText.getText();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jScrollPane1 = new javax.swing.JScrollPane();
        UIText = new javax.swing.JTextArea();
        btnSelect = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Длина текста");

        UIText.setColumns(20);
        UIText.setRows(5);
        jScrollPane1.setViewportView(UIText);

        btnSelect.setText("Посчитать длину текста");
        btnSelect.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSelectActionPerformed(evt);
            }
        });

        jButton1.setText("Выход");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenu3.setText("Открыть");
        jMenu1.add(jMenu3);

        jMenu4.setText("Сохраниеть как");
        jMenu1.add(jMenu4);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSelect)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSelect)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSelectActionPerformed
    {//GEN-HEADEREND:event_btnSelectActionPerformed
        if (UIText.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(this, "Чтобы расчитать длину текста нужно указать текст!");
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Длина текста: " + UIText.getText().length());
        }
    }//GEN-LAST:event_btnSelectActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea UIText;
    private javax.swing.JButton btnSelect;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
