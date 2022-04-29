/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import codigoEscambot.Departamento;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Random;
import model.dao.ProdutoDAO;

public class TelaCadastroProdutoDepartamento extends javax.swing.JFrame {

    public TelaCadastroProdutoDepartamento() {
        initComponents();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPTelaCadastroProdutoSV = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNomeProduto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtRating = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTipoProduto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtUtilidade = new javax.swing.JTextField();
        ButSalvar = new javax.swing.JButton();
        ButCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro do produto");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon_transparent.png")).getImage());
        setResizable(false);

        jPTelaCadastroProdutoSV.setBackground(new java.awt.Color(106, 97, 87));
        jPTelaCadastroProdutoSV.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tela de cadastro de produto sem validade", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(10, 3, 3))); // NOI18N

        jLabel1.setForeground(new java.awt.Color(20, 10, 10));
        jLabel1.setText("Nome do produto");

        txtNomeProduto.setToolTipText("Digite o nome do produto");
        txtNomeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeProdutoActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(20, 10, 10));
        jLabel2.setText("Rating (1 a 100)");

        txtRating.setToolTipText("Digite o rating do produto");
        txtRating.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRatingActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(20, 10, 10));
        jLabel3.setText("Tipo do produto");

        txtTipoProduto.setToolTipText("Digite o tipo do produto");
        txtTipoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoProdutoActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(20, 10, 10));
        jLabel4.setText("Cor do produto");

        txtCor.setToolTipText("Digite a cor do produto");
        txtCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(20, 10, 10));
        jLabel5.setText("Marca do produto");

        txtMarca.setToolTipText("Digite a marca do produto");
        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(20, 10, 10));
        jLabel6.setText("Utilidade do produto");

        txtUtilidade.setToolTipText("Digite a utilidade do produto");
        txtUtilidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUtilidadeActionPerformed(evt);
            }
        });

        ButSalvar.setBackground(new java.awt.Color(234, 234, 27));
        ButSalvar.setMnemonic('s');
        ButSalvar.setText("Salvar");
        ButSalvar.setToolTipText("Clique para salvar");
        ButSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButSalvarActionPerformed(evt);
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

        javax.swing.GroupLayout jPTelaCadastroProdutoSVLayout = new javax.swing.GroupLayout(jPTelaCadastroProdutoSV);
        jPTelaCadastroProdutoSV.setLayout(jPTelaCadastroProdutoSVLayout);
        jPTelaCadastroProdutoSVLayout.setHorizontalGroup(
            jPTelaCadastroProdutoSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTelaCadastroProdutoSVLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPTelaCadastroProdutoSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPTelaCadastroProdutoSVLayout.createSequentialGroup()
                        .addGroup(jPTelaCadastroProdutoSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(txtTipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPTelaCadastroProdutoSVLayout.createSequentialGroup()
                        .addGroup(jPTelaCadastroProdutoSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPTelaCadastroProdutoSVLayout.createSequentialGroup()
                                .addGroup(jPTelaCadastroProdutoSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(txtUtilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRating, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 36, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPTelaCadastroProdutoSVLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(ButCancelar)))
                        .addGap(18, 18, 18)
                        .addComponent(ButSalvar)
                        .addContainerGap())))
        );
        jPTelaCadastroProdutoSVLayout.setVerticalGroup(
            jPTelaCadastroProdutoSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTelaCadastroProdutoSVLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUtilidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPTelaCadastroProdutoSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButSalvar)
                    .addComponent(ButCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPTelaCadastroProdutoSV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPTelaCadastroProdutoSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtTipoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoProdutoActionPerformed

    private void ButCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButCancelarActionPerformed
        this.setVisible(false);
        new TelaAdicionaProduto().setVisible(true);
    }//GEN-LAST:event_ButCancelarActionPerformed

    private void ButSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButSalvarActionPerformed
        int flag = 0;
        if(txtCor.getText().equals("") | txtMarca.getText().equals("") | txtNomeProduto.getText().equals("")  |
                txtRating.getText().equals("") | txtTipoProduto.getText().equals("") |
                txtUtilidade.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos antes de clicar em Salvar.", "Aviso!",
                JOptionPane.ERROR_MESSAGE);
        }
            
        else{
            String nome = txtNomeProduto.getText(); 
            
            int rating = Integer.parseInt(txtRating.getText());
            String tipo = txtTipoProduto.getText();
            String cor = txtCor.getText();
            String marca = txtMarca.getText();
            String utilidade = txtUtilidade.getText();
            if(!Principal.department.isEmpty()){
                for(int j = 0;j<Principal.department.size();j++){
                    if(Principal.department.get(j).getNome().equals(nome) & Principal.department.get(j).getUtilidade().equals(utilidade)){
                        JOptionPane.showMessageDialog(null, "Impossível cadastrar produto\n Foi encontrado outro produto com mesmo nome e utilidade.", "Aviso!",
                JOptionPane.ERROR_MESSAGE);
                        flag++;
                    }
                }
                    
            }if(flag == 0){
                if(rating<1 | rating>100){
                    JOptionPane.showMessageDialog(null, "Digite um rating entre 1 e 100.", "Aviso!",
                    JOptionPane.ERROR_MESSAGE);
            }else{
                Random rand = new Random();
                Departamento dep = new Departamento(nome, rating, tipo, cor, marca, utilidade, rand.nextInt(10000), rand.nextInt(10000));
                ProdutoDAO dao = new ProdutoDAO();
                dao.createProdutoDepartamento(dep);
                        
                TelaCadastro.users.get(TelaLogin.indexUser).produtos_user.add(dep);
                Principal.department.add(dep);
                JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso.", "Aviso!",
                    JOptionPane.INFORMATION_MESSAGE);
                // Limpar os campos.
                txtNomeProduto.setText("");
                txtRating.setText("");
                txtTipoProduto.setText("");
                txtCor.setText("");
                txtMarca.setText("");
                txtUtilidade.setText("");

                txtNomeProduto.requestFocus();
                }
            }
        }
    }//GEN-LAST:event_ButSalvarActionPerformed

    private void txtNomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeProdutoActionPerformed

    private void txtRatingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRatingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRatingActionPerformed

    private void txtCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorActionPerformed

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaActionPerformed

    private void txtUtilidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUtilidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUtilidadeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroProdutoDepartamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButCancelar;
    private javax.swing.JButton ButSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPTelaCadastroProdutoSV;
    private javax.swing.JTextField txtCor;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JTextField txtRating;
    private javax.swing.JTextField txtTipoProduto;
    private javax.swing.JTextField txtUtilidade;
    // End of variables declaration//GEN-END:variables
}
