/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.data_estruct_t3;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lucaslamim-fit
 */
public class View extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;
	private Data_Estruct_T3 principal = new Data_Estruct_T3();
    private DefaultTableModel tabelaCod;
    
    /**
     * Creates new form View
     */
    public View() {
        initComponents();
        this.tabelaCod = (DefaultTableModel) jTable_cod.getModel();
        this.setLocationRelativeTo(null);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_decodificar_saida = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea_codificar_entrada = new javax.swing.JTextArea();
        jButton_codificar = new javax.swing.JButton();
        jButton_decodificar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea_codificar_saida = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_decodificar_entrada = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable_cod = new javax.swing.JTable();
        jButton_gerar_arvore_decod = new javax.swing.JButton();
        jButton_gerar_arvore_cod = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea_decodificar_saida.setColumns(20);
        jTextArea_decodificar_saida.setRows(5);
        jScrollPane1.setViewportView(jTextArea_decodificar_saida);

        jTextArea_codificar_entrada.setColumns(20);
        jTextArea_codificar_entrada.setRows(5);
        jTextArea_codificar_entrada.setMaximumSize(new java.awt.Dimension(220, 2147483647));
        jScrollPane3.setViewportView(jTextArea_codificar_entrada);

        jButton_codificar.setText("codificar");
        jButton_codificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_codificarActionPerformed(evt);
            }
        });

        jButton_decodificar.setText("decodificar");
        jButton_decodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_decodificarActionPerformed(evt);
            }
        });

        jTextArea_codificar_saida.setEditable(false);
        jTextArea_codificar_saida.setColumns(20);
        jTextArea_codificar_saida.setRows(5);
        jScrollPane4.setViewportView(jTextArea_codificar_saida);

        jLabel1.setText("ENTRADA");

        jLabel2.setText("SAIDA");

        jLabel3.setText("SAIDA");

        jLabel4.setText("ENTRADA");

        jTextArea_decodificar_entrada.setColumns(20);
        jTextArea_decodificar_entrada.setRows(5);
        jTextArea_decodificar_entrada.setMaximumSize(new java.awt.Dimension(220, 2147483647));
        jScrollPane2.setViewportView(jTextArea_decodificar_entrada);

        jTable_cod.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Simbolo", "Codigo", "frequencia"
            }
        ));
        jScrollPane5.setViewportView(jTable_cod);

        jButton_gerar_arvore_decod.setText("gerar arvore");
        jButton_gerar_arvore_decod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_gerar_arvore_decodActionPerformed(evt);
            }
        });

        jButton_gerar_arvore_cod.setText("gerar arvore");
        jButton_gerar_arvore_cod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_gerar_arvore_codActionPerformed(evt);
            }
        });

        jLabel5.setText("Autor: Lucas Lamim");

        jLabel6.setText("Professor: Eduardo Alves");

        jLabel7.setText("Estrutura de Dados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel1)
                        .addGap(223, 223, 223)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel4)
                        .addGap(224, 224, 224)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_codificar)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton_decodificar))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButton_gerar_arvore_decod, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jButton_gerar_arvore_cod, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane5)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane4)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton_gerar_arvore_cod, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_codificar)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton_gerar_arvore_decod, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_decodificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(5, 5, 5)
                .addComponent(jLabel7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_codificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_codificarActionPerformed
        // TODO add your handling code here:
        if(!jTextArea_codificar_entrada.getText().equals("") && jTextArea_codificar_entrada.getText().length() > 1)
        {
        //resetando
        tabelaCod.setNumRows(0);
        principal.getTabelaBinaria().clear();        
        jTextArea_codificar_saida.setText("");
        
        principal.codificar(jTextArea_codificar_entrada.getText().toLowerCase());

        for (int i = 0; i < principal.getTabelaBinaria().size(); i++) {
            tabelaCod.addRow(new String[]{
                "" + principal.getTabelaBinaria().get(i).getLetra(),
                principal.getTabelaBinaria().get(i).getCodigo(),
                "" + principal.getTabelaBinaria().get(i).getFrequencia()
            });
        }
        
        jTextArea_codificar_saida.setText(principal.construirBinario(principal.getTabelaBinaria(), jTextArea_codificar_entrada.getText().toLowerCase()));
        jTextArea_codificar_entrada.setText("");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Nada para Codificar");
        }
    }//GEN-LAST:event_jButton_codificarActionPerformed

    private void jButton_decodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_decodificarActionPerformed
        // TODO add your handling code here:
        if(!jTextArea_decodificar_entrada.getText().equals(""))
        {
        if (tabelaCod.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "A tabela deve ser gerada primeiro");
        } else {

            jTextArea_decodificar_saida.setText("");
            
            jTextArea_decodificar_saida.setText(principal.decodificar(jTextArea_decodificar_entrada.getText()));
            jTextArea_decodificar_entrada.setText("");
        }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Nada para Decodificar");
        }
                
    }//GEN-LAST:event_jButton_decodificarActionPerformed
//jTextPane_arvore
    private void jButton_gerar_arvore_decodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_gerar_arvore_decodActionPerformed
        // TODO add your handling code here:
        if (jTextArea_decodificar_saida.getText().equals("") ) {
            JOptionPane.showMessageDialog(null, "Necessario decodificar algo primeiro!");
        }
        else if (jTextArea_decodificar_saida.getText().equals(" ") ) {
            JOptionPane.showMessageDialog(null, "caracteres de decodificação invalido(s)");
        }
        else {
                View_Arvore view = new View_Arvore();
                view.MontarArvoreIdeal(principal.getArvoreDecod().getRaiz());
                view.setVisible(true);
        }
    }//GEN-LAST:event_jButton_gerar_arvore_decodActionPerformed

    private void jButton_gerar_arvore_codActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_gerar_arvore_codActionPerformed
        // TODO add your handling code here:
        if (jTextArea_codificar_saida.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Necessario codificar algo primeiro!");
        } else {
                View_Arvore view = new View_Arvore();
                view.MontarArvoreIdeal(principal.getArvoreCod().getRaiz());
                view.setVisible(true);
        }
    }//GEN-LAST:event_jButton_gerar_arvore_codActionPerformed

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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_codificar;
    private javax.swing.JButton jButton_decodificar;
    private javax.swing.JButton jButton_gerar_arvore_cod;
    private javax.swing.JButton jButton_gerar_arvore_decod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable_cod;
    private javax.swing.JTextArea jTextArea_codificar_entrada;
    private javax.swing.JTextArea jTextArea_codificar_saida;
    private javax.swing.JTextArea jTextArea_decodificar_entrada;
    private javax.swing.JTextArea jTextArea_decodificar_saida;
    // End of variables declaration//GEN-END:variables
}
