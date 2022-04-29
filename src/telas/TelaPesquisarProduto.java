/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import codigoEscambot.Departamento;
import codigoEscambot.Mercado;
import codigoEscambot.Produto;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
import model.dao.ProdutoDAO;
import telas.Principal;
import telas.TelaMenuUsuario;

/**
 *
 * @author thiago
 */
public class TelaPesquisarProduto extends javax.swing.JFrame {

    public TelaPesquisarProduto(){
        initComponents();
        if(Principal.department != null || Principal.market != null)
            carregarTabelaProduto();
        
        readJTable();
         
    }
    
    public void readJTable() {
        
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setNumRows(0);
        ProdutoDAO pdao = new ProdutoDAO();

        for (Mercado p : pdao.read()) {

            modelo.addRow(new Object[]{
                p.getIdProduto(),
                p.getNome(),
                p.getRating(),
                p.getTipo(),
                p.getCor(),
                p.getMarca(),
                p.getUtilidade(),
            });

        }

    }
    
    public void readJTableForNome(String nome) {
        
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setNumRows(0);
        ProdutoDAO pdao = new ProdutoDAO();

        for (Mercado p : pdao.readNome(nome)) {

            modelo.addRow(new Object[]{
                p.getIdProduto(),
                p.getNome(),
                p.getRating(),
                p.getTipo(),
                p.getCor(),
                p.getMarca(),
                p.getUtilidade(),
            });

        }

    }
    
    public void carregarTabelaProduto(){
        DefaultTableModel model0 = new DefaultTableModel(new Object [] {"Nome","Rating","Tipo","Cor","Marca","Utilidade","Data de validade"},0);
        if(Principal.department != null){
            for(int i = 0; i<Principal.department.size(); i++){
                Object line0[] = new Object[]{Principal.department.get(i).getNome(),
                                              Principal.department.get(i).getRating(),
                                              Principal.department.get(i).getTipo(),
                                              Principal.department.get(i).getCor(),
                                              Principal.department.get(i).getMarca(),
                                              Principal.department.get(i).getUtilidade()};
                model0.addRow(line0);
            }
        }
        if(Principal.market != null){
            for(int i = 0; i<Principal.market.size(); i++){
                Object line0[] = new Object[]{Principal.market.get(i).getNome(),
                                              Principal.market.get(i).getRating(),
                                              Principal.market.get(i).getTipo(),
                                              Principal.market.get(i).getCor(),
                                              Principal.market.get(i).getMarca(),
                                              Principal.market.get(i).getUtilidade(),
                                              Principal.market.get(i).getDatadevalidade()};
                model0.addRow(line0);
            }
        }
        
        jTablePesquisarProduto.setModel(model0);
    
}
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPTelaPesquisarProduto = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNomeProduto = new javax.swing.JTextField();
        ButCancelar = new javax.swing.JButton();
        jScrollPanePesquisarProduto = new javax.swing.JScrollPane();
        jTablePesquisarProduto = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Busca = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pesquisar produto");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon_transparent.png")).getImage());
        setResizable(false);

        jPTelaPesquisarProduto.setBackground(new java.awt.Color(106, 97, 87));
        jPTelaPesquisarProduto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tela pesquisar produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(10, 3, 3))); // NOI18N

        jLabel1.setForeground(new java.awt.Color(20, 10, 10));
        jLabel1.setText("Barra de pesquisa");

        txtNomeProduto.setToolTipText("Digite algum dado sobre o produto");
        txtNomeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeProdutoActionPerformed(evt);
            }
        });
        txtNomeProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomeProdutoKeyReleased(evt);
            }
        });

        ButCancelar.setBackground(new java.awt.Color(92, 92, 79));
        ButCancelar.setMnemonic('c');
        ButCancelar.setText("Cancelar");
        ButCancelar.setToolTipText("Clique para cancelar a ação");
        ButCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButCancelarActionPerformed(evt);
            }
        });

        jScrollPanePesquisarProduto.setBackground(new java.awt.Color(92, 92, 79));
        jScrollPanePesquisarProduto.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPanePesquisarProduto.setViewportBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jTablePesquisarProduto.setBackground(new java.awt.Color(92, 92, 79));
        jTablePesquisarProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome do produto", "Rating", "Tipo ", "Cor ", "Marca", "Utilidade", "Data de validade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablePesquisarProduto.setGridColor(new java.awt.Color(60, 60, 60));
        jScrollPanePesquisarProduto.setViewportView(jTablePesquisarProduto);
        if (jTablePesquisarProduto.getColumnModel().getColumnCount() > 0) {
            jTablePesquisarProduto.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTablePesquisarProduto.getColumnModel().getColumn(1).setPreferredWidth(25);
            jTablePesquisarProduto.getColumnModel().getColumn(2).setPreferredWidth(50);
            jTablePesquisarProduto.getColumnModel().getColumn(3).setPreferredWidth(25);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Produto", "Nome do Produto", "Rating", "Tipo do produto", "Cor ", "Marca", "Utilidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        Busca.setBackground(new java.awt.Color(234, 234, 27));
        Busca.setMnemonic('c');
        Busca.setText("Busca");
        Busca.setToolTipText("Clique para cancelar a alteração dos dados");
        Busca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPTelaPesquisarProdutoLayout = new javax.swing.GroupLayout(jPTelaPesquisarProduto);
        jPTelaPesquisarProduto.setLayout(jPTelaPesquisarProdutoLayout);
        jPTelaPesquisarProdutoLayout.setHorizontalGroup(
            jPTelaPesquisarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTelaPesquisarProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPTelaPesquisarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPTelaPesquisarProdutoLayout.createSequentialGroup()
                        .addGroup(jPTelaPesquisarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPTelaPesquisarProdutoLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPTelaPesquisarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPanePesquisarProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ButCancelar, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPTelaPesquisarProdutoLayout.createSequentialGroup()
                        .addGroup(jPTelaPesquisarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPTelaPesquisarProdutoLayout.createSequentialGroup()
                                .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Busca)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPTelaPesquisarProdutoLayout.setVerticalGroup(
            jPTelaPesquisarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTelaPesquisarProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPTelaPesquisarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Busca))
                .addGap(18, 18, 18)
                .addComponent(jScrollPanePesquisarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPTelaPesquisarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(ButCancelar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPTelaPesquisarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPTelaPesquisarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButCancelarActionPerformed
        this.setVisible(false);
        new TelaMenuUsuario().setVisible(true);
    }//GEN-LAST:event_ButCancelarActionPerformed

    private void txtNomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeProdutoActionPerformed

    private void txtNomeProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeProdutoKeyReleased
            DefaultTableModel pesquisa = (DefaultTableModel)jTablePesquisarProduto.getModel();
            String nom = txtNomeProduto.getText();
            TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(pesquisa);
            jTablePesquisarProduto.setRowSorter(tr);
            tr.setRowFilter(RowFilter.regexFilter(nom));
    }//GEN-LAST:event_txtNomeProdutoKeyReleased

    private void BuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscaActionPerformed
        // TODO add your handling code here:
        readJTableForNome(txtNomeProduto.getText());
    }//GEN-LAST:event_BuscaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPesquisarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new TelaPesquisarProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Busca;
    private javax.swing.JButton ButCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPTelaPesquisarProduto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPanePesquisarProduto;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTablePesquisarProduto;
    private javax.swing.JTextField txtNomeProduto;
    // End of variables declaration//GEN-END:variables
}
