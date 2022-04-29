/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

/**
 *
 * @author thiago
 */
public class TelaAdicionaProduto extends javax.swing.JFrame {

    /**
     * Creates new form telaLogin
     */
    public TelaAdicionaProduto() {
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

        jPTelaCadastroProduto = new javax.swing.JPanel();
        ButCancelar = new javax.swing.JButton();
        jButCadastroProdutoDepartamento = new javax.swing.JButton();
        jButCadastroProdutoMercado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de produtos");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon_transparent.png")).getImage());
        setResizable(false);

        jPTelaCadastroProduto.setBackground(new java.awt.Color(106, 97, 87));
        jPTelaCadastroProduto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de produtos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(10, 3, 3))); // NOI18N

        ButCancelar.setBackground(new java.awt.Color(92, 92, 79));
        ButCancelar.setMnemonic('c');
        ButCancelar.setText("Cancelar");
        ButCancelar.setToolTipText("Clique para cancelar o cadastro");
        ButCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButCancelarActionPerformed(evt);
            }
        });

        jButCadastroProdutoDepartamento.setBackground(new java.awt.Color(92, 92, 79));
        jButCadastroProdutoDepartamento.setText("Cadastrar produtos de Departamento");
        jButCadastroProdutoDepartamento.setToolTipText("Clique para cadastrar o produto");
        jButCadastroProdutoDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButCadastroProdutoDepartamentoActionPerformed(evt);
            }
        });

        jButCadastroProdutoMercado.setBackground(new java.awt.Color(234, 234, 27));
        jButCadastroProdutoMercado.setText("Cadastrar produtos de Mercado");
        jButCadastroProdutoMercado.setToolTipText("Clique para cadastrar o produto");
        jButCadastroProdutoMercado.setMaximumSize(new java.awt.Dimension(232, 30));
        jButCadastroProdutoMercado.setMinimumSize(new java.awt.Dimension(232, 30));
        jButCadastroProdutoMercado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButCadastroProdutoMercadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPTelaCadastroProdutoLayout = new javax.swing.GroupLayout(jPTelaCadastroProduto);
        jPTelaCadastroProduto.setLayout(jPTelaCadastroProdutoLayout);
        jPTelaCadastroProdutoLayout.setHorizontalGroup(
            jPTelaCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPTelaCadastroProdutoLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jButCadastroProdutoDepartamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(jButCadastroProdutoMercado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPTelaCadastroProdutoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButCancelar)
                .addContainerGap())
        );
        jPTelaCadastroProdutoLayout.setVerticalGroup(
            jPTelaCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTelaCadastroProdutoLayout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(jPTelaCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButCadastroProdutoMercado, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButCadastroProdutoDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(ButCancelar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPTelaCadastroProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPTelaCadastroProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButCancelarActionPerformed
        this.setVisible(false);
        new TelaMenuUsuario().setVisible(true);
    }//GEN-LAST:event_ButCancelarActionPerformed

    private void jButCadastroProdutoMercadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButCadastroProdutoMercadoActionPerformed
        this.setVisible(false);
        new TelaCadastroProdutoMercado().setVisible(true);
    }//GEN-LAST:event_jButCadastroProdutoMercadoActionPerformed

    private void jButCadastroProdutoDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButCadastroProdutoDepartamentoActionPerformed
        this.setVisible(false);
        new TelaCadastroProdutoDepartamento().setVisible(true);
    }//GEN-LAST:event_jButCadastroProdutoDepartamentoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAdicionaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAdicionaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAdicionaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAdicionaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAdicionaProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButCancelar;
    private javax.swing.JButton jButCadastroProdutoDepartamento;
    private javax.swing.JButton jButCadastroProdutoMercado;
    private javax.swing.JPanel jPTelaCadastroProduto;
    // End of variables declaration//GEN-END:variables
}
