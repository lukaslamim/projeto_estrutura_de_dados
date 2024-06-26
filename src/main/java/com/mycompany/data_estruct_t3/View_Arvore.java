/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.data_estruct_t3;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author utirra
 */
public class View_Arvore extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;
	/**
     * Creates new form View_Arvore
     */
    private DefaultTableModel tabela;
    private int level = 0;
    private boolean primeiro = true;

    private int afastamentoRaiz = 0;

    public View_Arvore() {
        initComponents();
        this.setLocationRelativeTo(null);
        setResizable(false);
        this.setDefaultCloseOperation(View_Arvore.DISPOSE_ON_CLOSE);
        this.tabela = (DefaultTableModel) jTable.getModel();
    }

    private void MontarArvoreTabelaCod(No NO, int coluna, int afastamento) {

        if (primeiro) {

            No temp = NO;
            int tempCont = 0;
            while (temp.getEsquerda() != null) {
                tempCont++;
                temp = temp.getEsquerda();
            }

            No temp2 = NO;
            int tempCont2 = 0;
            while (temp2.getDireita() != null) {
                tempCont2++;
                temp2 = temp2.getDireita();
            }

            int tempcont3 = tempCont2;

            if (tempCont > tempCont2) {
                tempcont3 = tempCont;
            }
            afastamento = tempcont3 * 3;
            afastamentoRaiz = afastamento;
            primeiro = false;

            int totalTemp = tempcont3 * 100;

            coluna = totalTemp / 2;

            tabela.setColumnCount(totalTemp);

            tabela.setRowCount(totalTemp / 2);
            tabela.setValueAt("" + NO.getFrequencia(), level, coluna);
            tabela.setValueAt("nu", level + 1, coluna);
        } else {
            if (NO.getDado() != null) {
                tabela.setValueAt("" + NO.getFrequencia(), level, coluna);
                tabela.setValueAt("" + NO.getDado().getLetra(), level + 1, coluna);
            } else {

                tabela.setValueAt("" + NO.getFrequencia(), level, coluna);
                tabela.setValueAt("nu", level + 1, coluna);
            }
        }
        if (NO.getEsquerda() != null) {
            level += 2;
            MontarArvoreTabelaCod(NO.getEsquerda(), (coluna - 1) - afastamento, afastamento / 2);
            level -= 2;
        }

        if (NO.getDireita() != null) {
            level += 2;
            MontarArvoreTabelaCod(NO.getDireita(), (coluna + 1) + afastamento, afastamento / 2);
            level -= 2;
        }
    }
    
    public void MontarArvoreIdeal(No NO)
    {
            MontarArvoreTabelaCod(NO, 0, 0);
        
            int cont = tabela.getColumnCount();
            int cont2 = tabela.getRowCount();
            boolean Temp = false;
            int primeiraColuna = 0;
            int ultimaColuna = 0;
            int TamanhoLinha = 0;
            int colunaRaiz = cont/2;
            
            for (int i = 0; i < cont; i++) {
                for (int k = 0; k < cont2; k++) {
                    if (tabela.getValueAt(k, i) != null) {
                        if (!Temp) {
                            primeiraColuna = i;
                            Temp = true;
                        }
                        ultimaColuna = i;
                        if(k > TamanhoLinha)
                        {
                        TamanhoLinha = k;
                        }
                    }
                }
            }

            tabela.setColumnCount(0);
            tabela.setRowCount(0);
            level = 0;

            int tamanhoColuna = (ultimaColuna - primeiraColuna) + 1;
            int coluna = colunaRaiz - primeiraColuna;
            
            if(tamanhoColuna > 56)
            {   
                tamanhoColuna = 56;
                coluna = tamanhoColuna/2;
                afastamentoRaiz = 11;
            }
            
            for (int i = 0; i < tamanhoColuna; i++) {
                tabela.addColumn("" + i);
            }
            tabela.setRowCount(TamanhoLinha + 1);

            tabela.setValueAt("" + NO.getFrequencia(), level, coluna);
            tabela.setValueAt("nu", level + 1, coluna);
            
            MontarArvoreTabelaCod(NO, coluna , afastamentoRaiz);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane5 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable.setCellSelectionEnabled(true);
        jScrollPane5.setViewportView(jTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 1361, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(View_Arvore.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Arvore.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Arvore.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Arvore.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_Arvore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the tabela
     */
    public DefaultTableModel getTabela() {
        return tabela;
    }

    /**
     * @param tabela the tabela to set
     */
    public void setTabela(DefaultTableModel tabela) {
        this.tabela = tabela;
    }
}
