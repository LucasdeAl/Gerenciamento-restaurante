/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package restaurante.gui.pedido;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import restaurante.fachada.Fachada;

/**
 * @author Lucas
 * @author Carlos Henrique
 * @author Gustavo
 * @author Joao Victor
 */
public class TelaEncerrarPedido extends javax.swing.JFrame {

    /**
     * Creates new form TelaPedidoEncerrado
     */
    public TelaEncerrarPedido() {
        initComponents();
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        ImageIcon icon = new ImageIcon("src/imagens/conta.png");
        icon.setImage(icon.getImage().getScaledInstance(38, 38, 100));
        icone.setIcon(icon);
        this.setIconImage(icon.getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton4 = new javax.swing.JToggleButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaItensConsumidos = new javax.swing.JList<>();
        botaoCredito = new javax.swing.JToggleButton();
        botaoDebito = new javax.swing.JToggleButton();
        botaoDinheiro = new javax.swing.JToggleButton();
        botaoPix = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        valorConta = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        valorRecebido = new javax.swing.JTextField();
        troco = new javax.swing.JTextField();
        icone = new javax.swing.JLabel();

        jToggleButton4.setText("jToggleButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Encerrar Pedido!");

        jLabel1.setText("Itens do pedido:");

        listaItensConsumidos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaItensConsumidos);

        buttonGroup1.add(botaoCredito);
        botaoCredito.setText("Crédito");
        botaoCredito.setPreferredSize(new java.awt.Dimension(80, 25));
        botaoCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCreditoActionPerformed(evt);
            }
        });

        buttonGroup1.add(botaoDebito);
        botaoDebito.setText("Débito");
        botaoDebito.setPreferredSize(new java.awt.Dimension(80, 25));
        botaoDebito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDebitoActionPerformed(evt);
            }
        });

        buttonGroup1.add(botaoDinheiro);
        botaoDinheiro.setText("Dinheiro");
        botaoDinheiro.setPreferredSize(new java.awt.Dimension(80, 25));
        botaoDinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDinheiroActionPerformed(evt);
            }
        });

        buttonGroup1.add(botaoPix);
        botaoPix.setText("PIX");
        botaoPix.setPreferredSize(new java.awt.Dimension(80, 25));
        botaoPix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPixActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Total:");

        valorConta.setBackground(new java.awt.Color(153, 153, 153));
        valorConta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        valorConta.setMaximumSize(new java.awt.Dimension(80, 25));
        valorConta.setMinimumSize(new java.awt.Dimension(80, 25));
        valorConta.setName(""); // NOI18N
        valorConta.setOpaque(true);
        valorConta.setPreferredSize(new java.awt.Dimension(89, 25));

        jLabel4.setText("Formas de pagamento:");

        jButton1.setText("Pagar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Sair");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Valor Recebido:");

        jLabel6.setText("Troco:");

        valorRecebido.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                valorRecebidoInputMethodTextChanged(evt);
            }
        });
        valorRecebido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorRecebidoActionPerformed(evt);
            }
        });
        valorRecebido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                valorRecebidoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                valorRecebidoKeyTyped(evt);
            }
        });

        troco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trocoActionPerformed(evt);
            }
        });

        icone.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(valorConta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botaoCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botaoDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botaoPix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botaoDebito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(troco)
                                    .addComponent(valorRecebido))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(icone, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoDebito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoPix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(valorConta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(valorRecebido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(troco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addGap(22, 22, 22))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(icone, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCreditoActionPerformed
        dinheiro = false;
        troco.setText("0.0");
        valorRecebido.setText(valorConta.getText());
        TelaPedido.getInstancia().getPegaInstancia().setFormaPagamento("Crédito");


    }//GEN-LAST:event_botaoCreditoActionPerformed

    private void valorRecebidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorRecebidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorRecebidoActionPerformed

    private void trocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trocoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trocoActionPerformed

    private void botaoDebitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDebitoActionPerformed
        // TODO add your handling code here:
        dinheiro = false;
        valorRecebido.setText(valorConta.getText());
        troco.setText("0.0");
        TelaPedido.getInstancia().getPegaInstancia().setFormaPagamento("Débito");
    }//GEN-LAST:event_botaoDebitoActionPerformed

    private void botaoDinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDinheiroActionPerformed
        // TODO add your handling code here:
        dinheiro = true;
        TelaPedido.getInstancia().getPegaInstancia().setFormaPagamento("Dinheiro");


    }//GEN-LAST:event_botaoDinheiroActionPerformed

    private void botaoPixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPixActionPerformed
        // TODO add your handling code here:
        dinheiro = false;
        troco.setText("0.0");
        valorRecebido.setText(valorConta.getText());
        TelaPedido.getInstancia().getPegaInstancia().setFormaPagamento("PIX");
    }//GEN-LAST:event_botaoPixActionPerformed

    private void valorRecebidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorRecebidoKeyTyped

    }//GEN-LAST:event_valorRecebidoKeyTyped

    private void valorRecebidoInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_valorRecebidoInputMethodTextChanged
//       valorRecebido.setText("");
//       int valorTroco = Integer.parseInt(valorRecebido.getText())-Integer.parseInt(valorConta.getText());
//       troco.setText(String.valueOf(valorTroco));
    }//GEN-LAST:event_valorRecebidoInputMethodTextChanged

    private void valorRecebidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorRecebidoKeyPressed
        if (dinheiro) {
            if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                double valorTroco = Double.valueOf(valorRecebido.getText()) - Double.valueOf(valorConta.getText());
                if (valorTroco >= 0.0) {
                    troco.setText(String.valueOf(valorTroco));
                } else {
                    JOptionPane.showMessageDialog(this.getContentPane(), "Insira um valor maior que " + valorConta.getText());
                    troco.setText("");
                }
            }
        }
    }//GEN-LAST:event_valorRecebidoKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        double valorTroco = Double.valueOf(valorRecebido.getText()) - Double.valueOf(valorConta.getText());
        if (valorTroco >= 0.0) {
            Fachada.getInstancia().encerrarPedido(TelaPedido.getInstancia().getPegaInstancia());
            TelaPedido.getInstancia().atualizaLista();
            dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private boolean dinheiro = false;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton botaoCredito;
    private javax.swing.JToggleButton botaoDebito;
    private javax.swing.JToggleButton botaoDinheiro;
    private javax.swing.JToggleButton botaoPix;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel icone;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JList<String> listaItensConsumidos;
    private javax.swing.JTextField troco;
    private javax.swing.JLabel valorConta;
    private javax.swing.JTextField valorRecebido;
    // End of variables declaration//GEN-END:variables

    public JList<String> getListaItensConsumidos() {
        return listaItensConsumidos;
    }

    public JLabel getValorConta() {
        return valorConta;
    }

}
