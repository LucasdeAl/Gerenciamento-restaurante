/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package restaurante.gui.pedido;

import java.awt.Color;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import restaurante.dados.cardapio.Item;
import restaurante.dados.pedido.Pedido;
import restaurante.dados.pedido.PedidoBalcao;
import restaurante.dados.pedido.PedidoEntrega;
import restaurante.dados.pedido.PedidoMesa;
import restaurante.fachada.Fachada;
import restaurante.repositorio.RepositorioPedido;

/**
 * @author Lucas
 * @author Gustavo
 * @author Carlos Henrique
 * @author Joao Victor
 */
public class TelaPedidosEncerrados extends javax.swing.JFrame {

    /**
     * Creates new form TelaPedidosEncerrados
     */
    public TelaPedidosEncerrados() {
        initComponents();
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        receita.setText(String.valueOf(RepositorioPedido.receita));
        listaPedidosEncerrados.setListData(Fachada.getInstancia().listarPedidosEncerrados());
        String[] valoresDosPedidos = new String[Fachada.getInstancia().listarPedidosEncerrados().length];
        int i = 0;
        for (Pedido pedido : Fachada.getInstancia().listarPedidosEncerradosArray()) {
            valoresDosPedidos[i] = String.valueOf(pedido.getValor());
            i++;
        }
        listaValoresEncerrados.setListData(valoresDosPedidos);
        ImageIcon icon = new ImageIcon("src/imagens/cifrao.png");
        icon.setImage(icon.getImage());
        this.setIconImage(icon.getImage());
        ImageIcon icon2 = new ImageIcon("src/imagens/check.png");
        icon2.setImage(icon2.getImage().getScaledInstance(50, 50, 100));
        telaCor.setIcon(icon2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaPedidosEncerrados = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaValoresEncerrados = new javax.swing.JList<>();
        telaCor = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        receita = new javax.swing.JLabel();
        fecharCaixa = new javax.swing.JToggleButton();
        jLabel5 = new javax.swing.JLabel();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pedidos Encerrados");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Pedidos Encerrados");

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("VerPedido");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        listaPedidosEncerrados.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaPedidosEncerrados);

        listaValoresEncerrados.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(listaValoresEncerrados);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(12, 12, 12))
        );

        telaCor.setBackground(new java.awt.Color(204, 255, 0));
        telaCor.setFont(new java.awt.Font("Lucida Sans", 0, 36)); // NOI18N
        telaCor.setText("ABERTO");
        telaCor.setOpaque(true);

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel4.setText("Receitas do dia");

        receita.setBackground(new java.awt.Color(153, 153, 255));
        receita.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 36)); // NOI18N
        receita.setText("R$ ");
        receita.setOpaque(true);

        buttonGroup1.add(fecharCaixa);
        fecharCaixa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fecharCaixa.setText("Fechar Caixa");
        fecharCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharCaixaActionPerformed(evt);
            }
        });

        jLabel5.setText("Situação do restaurante:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(receita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 128, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jSeparator1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(telaCor, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(fecharCaixa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(111, 111, 111)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(57, 57, 57))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(telaCor, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(receita)
                                .addGap(33, 33, 33)
                                .addComponent(fecharCaixa)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fecharCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharCaixaActionPerformed
        // TODO add your handling code here:

        telaCor.setBackground(Color.red);
        telaCor.setText("Fechado");
        ImageIcon icon2 = new ImageIcon("src/imagens/unchecked.png");
        icon2.setImage(icon2.getImage().getScaledInstance(50, 50, 100));
        telaCor.setIcon(icon2);
        Fachada.getInstancia().gravarPedidos();
        TelaPedido.getInstancia().dispose();
        try {
            TimeUnit.SECONDS.sleep(2);

        } catch (InterruptedException ex) {
            Logger.getLogger(TelaPedidosEncerrados.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_fecharCaixaActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:

    }

    private void btnEncerrarActionPerformed(java.awt.event.ActionEvent evt) {

    }//GEN-LAST:event_jButton1MouseClicked

    /**
     * Metodo que inspeciona o que tem no pedido encerrado selecioando
     *
     * @param evt
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DefaultListModel model1 = new DefaultListModel();
        DefaultListModel model2 = new DefaultListModel();

        Pedido pegaInstancia = null;
        String itemSelecionado;
        itemSelecionado = listaPedidosEncerrados.getSelectedValue();
        String[] numero = itemSelecionado.split("-");
        int num;
        num = Integer.parseInt(numero[0]);

        for (Pedido pedido : Fachada.getInstancia().listarPedidosEncerradosArray()) {
            if (pedido.getNumero() == num) {
                pegaInstancia = pedido;
                break;
            }
        }

        TelaVerPedidoEncerrado tela = new TelaVerPedidoEncerrado();

        if (pegaInstancia instanceof PedidoMesa) {
            tela.getRdtipoMesa().setSelected(true);
        } else if (pegaInstancia instanceof PedidoBalcao) {
            tela.getRdtipoBalcao().setSelected(true);
        } else if (pegaInstancia instanceof PedidoEntrega) {
            tela.getRdtipoEntrega().setSelected(true);
        }
        model1.clear();
        model2.clear();
        for (Item item : pegaInstancia.getItens()) {
            model1.addElement(item.getNome());
            model2.addElement(item.getValor());

        }

        tela.getListaAdicionados().setListData(Fachada.getInstancia().listarItensPedido(pegaInstancia));
        tela.getListaValores().setListData(Fachada.getInstancia().listarPrecosPedido(pegaInstancia));
        tela.getTxtValor().setText(String.valueOf(pegaInstancia.getValor()));
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        new TelaPedidosEncerrados();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JToggleButton fecharCaixa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JList<String> listaPedidosEncerrados;
    private javax.swing.JList<String> listaValoresEncerrados;
    private javax.swing.JLabel receita;
    private javax.swing.JLabel telaCor;
    // End of variables declaration//GEN-END:variables
}
