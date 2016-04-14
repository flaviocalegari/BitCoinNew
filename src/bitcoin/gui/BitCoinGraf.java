package bitcoin.gui;

import bitcoin.BitCoin;
import java.awt.List;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;


public class BitCoinGraf extends javax.swing.JFrame {
    public DefaultTableModel modeloTable;
    public DefaultTableModel modeloTable2;
    
    BitCoin sessao;
    public BitCoinGraf(BitCoin sessao) {
       
        this.sessao = sessao;
        
        initComponents();
        this.setVisible(true);
        
        String nickname = sessao.getNome();
        labelnick.setText(nickname);
        
        float balance = sessao.getCarteira(); 
        labelbalance.setText(Float.toString(balance)+" BitCoins");
        
        //tabela principal - Usuários e Transações(JTable)
        String[] colunasUsuarios = new String[]{"Usuário", "Moedas"};
        modeloTable = new DefaultTableModel(null, colunasUsuarios);
        usersTable.setModel(modeloTable);
        
        String[] colunasTransacoes = new String[]{"Vendedor", "Comprador", "Valor Negociado", "Status"};
        modeloTable2 = new DefaultTableModel(null, colunasTransacoes);
        tradeTable.setModel(modeloTable2);
        
        //ArrayList Usuários
        ArrayList<String> Usuarios = new ArrayList<String>();
        String[] users = new String[]{"Usuário", "Moedas"};
        Usuarios.add(sessao.getNome());
        Usuarios.add(Float.toString(balance));
        
        modeloTable.addRow(Usuarios.toArray());
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        realizaCompra = new javax.swing.JDialog();
        dialogCompra = new javax.swing.JPanel();
        titleCompra = new javax.swing.JLabel();
        labelDisponivel = new javax.swing.JLabel();
        moedasDisponiveis = new javax.swing.JLabel();
        labelDesejada = new javax.swing.JLabel();
        qtdeDesejada = new javax.swing.JTextField();
        botaoFinalizaCompra = new javax.swing.JButton();
        minerarVendas = new javax.swing.JDialog();
        dialogVendas = new javax.swing.JPanel();
        vendaID = new javax.swing.JLabel();
        vendaId = new javax.swing.JLabel();
        mainScreen = new javax.swing.JPanel();
        nicknameLabel = new javax.swing.JLabel();
        balanceLabel = new javax.swing.JLabel();
        transactionsPanel = new javax.swing.JTabbedPane();
        painelUsers = new javax.swing.JPanel();
        usersPanel = new javax.swing.JScrollPane();
        usersTable = new javax.swing.JTable();
        comprarCoins = new javax.swing.JButton();
        painelTransactions = new javax.swing.JPanel();
        tradePanel = new javax.swing.JScrollPane();
        tradeTable = new javax.swing.JTable();
        botaoMinerar = new javax.swing.JButton();
        LogoDoSucesso = new javax.swing.JLabel();
        labelnick = new javax.swing.JLabel();
        labelbalance = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuSettings = new javax.swing.JMenu();

        realizaCompra.setTitle("Realizar Compra");
        realizaCompra.setMinimumSize(new java.awt.Dimension(300, 260));

        dialogCompra.setName("Realiza Compra"); // NOI18N

        titleCompra.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        titleCompra.setText("Realizar Compra");

        labelDisponivel.setText("Quantidade disponível:");

        moedasDisponiveis.setText(" ");

        labelDesejada.setText("Quantidade desejada:");

        botaoFinalizaCompra.setText("Finalizar");
        botaoFinalizaCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFinalizaCompraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogCompraLayout = new javax.swing.GroupLayout(dialogCompra);
        dialogCompra.setLayout(dialogCompraLayout);
        dialogCompraLayout.setHorizontalGroup(
            dialogCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogCompraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dialogCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogCompraLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(titleCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125))
                    .addGroup(dialogCompraLayout.createSequentialGroup()
                        .addComponent(labelDesejada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(qtdeDesejada, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(dialogCompraLayout.createSequentialGroup()
                        .addGroup(dialogCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dialogCompraLayout.createSequentialGroup()
                                .addComponent(labelDisponivel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(moedasDisponiveis, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dialogCompraLayout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(botaoFinalizaCompra)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        dialogCompraLayout.setVerticalGroup(
            dialogCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogCompraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleCompra)
                .addGap(18, 18, 18)
                .addGroup(dialogCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDisponivel)
                    .addComponent(moedasDisponiveis))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dialogCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelDesejada)
                    .addComponent(qtdeDesejada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(botaoFinalizaCompra)
                .addContainerGap())
        );

        javax.swing.GroupLayout realizaCompraLayout = new javax.swing.GroupLayout(realizaCompra.getContentPane());
        realizaCompra.getContentPane().setLayout(realizaCompraLayout);
        realizaCompraLayout.setHorizontalGroup(
            realizaCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dialogCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        realizaCompraLayout.setVerticalGroup(
            realizaCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dialogCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        minerarVendas.setMinimumSize(new java.awt.Dimension(300, 260));

        vendaID.setText("Minerando a transação entre:");

        javax.swing.GroupLayout dialogVendasLayout = new javax.swing.GroupLayout(dialogVendas);
        dialogVendas.setLayout(dialogVendasLayout);
        dialogVendasLayout.setHorizontalGroup(
            dialogVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(vendaID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vendaId, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(188, Short.MAX_VALUE))
        );
        dialogVendasLayout.setVerticalGroup(
            dialogVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogVendasLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(dialogVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vendaID)
                    .addComponent(vendaId, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(266, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout minerarVendasLayout = new javax.swing.GroupLayout(minerarVendas.getContentPane());
        minerarVendas.getContentPane().setLayout(minerarVendasLayout);
        minerarVendasLayout.setHorizontalGroup(
            minerarVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dialogVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        minerarVendasLayout.setVerticalGroup(
            minerarVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dialogVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bitcoin do Sucesso");

        mainScreen.setName(""); // NOI18N

        nicknameLabel.setText("Your Bitcoin Nickname:");

        balanceLabel.setText("Balance:");

        usersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        usersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersTableMouseClicked(evt);
            }
        });
        usersPanel.setViewportView(usersTable);

        comprarCoins.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bitcoin/bitcoin.jpg"))); // NOI18N
        comprarCoins.setText("Comprar");
        comprarCoins.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comprarCoinsMouseClicked(evt);
            }
        });
        comprarCoins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarCoinsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelUsersLayout = new javax.swing.GroupLayout(painelUsers);
        painelUsers.setLayout(painelUsersLayout);
        painelUsersLayout.setHorizontalGroup(
            painelUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(usersPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
            .addGroup(painelUsersLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(comprarCoins))
        );
        painelUsersLayout.setVerticalGroup(
            painelUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelUsersLayout.createSequentialGroup()
                .addComponent(usersPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(comprarCoins)
                .addContainerGap())
        );

        transactionsPanel.addTab("Usuários", painelUsers);

        tradeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tradePanel.setViewportView(tradeTable);

        botaoMinerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bitcoin/gui/pickaxe.png"))); // NOI18N
        botaoMinerar.setText("Minerar");
        botaoMinerar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoMinerarMouseClicked(evt);
            }
        });
        botaoMinerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMinerarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelTransactionsLayout = new javax.swing.GroupLayout(painelTransactions);
        painelTransactions.setLayout(painelTransactionsLayout);
        painelTransactionsLayout.setHorizontalGroup(
            painelTransactionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tradePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
            .addGroup(painelTransactionsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botaoMinerar))
        );
        painelTransactionsLayout.setVerticalGroup(
            painelTransactionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTransactionsLayout.createSequentialGroup()
                .addComponent(tradePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(botaoMinerar)
                .addContainerGap())
        );

        transactionsPanel.addTab("Transações", painelTransactions);

        LogoDoSucesso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bitcoin/bitcoin.jpg"))); // NOI18N
        LogoDoSucesso.setText("Bitcoin do Sucesso");

        labelnick.setForeground(new java.awt.Color(0, 204, 0));
        labelnick.setText(" ");

        labelbalance.setForeground(new java.awt.Color(0, 204, 0));
        labelbalance.setText(" ");

        javax.swing.GroupLayout mainScreenLayout = new javax.swing.GroupLayout(mainScreen);
        mainScreen.setLayout(mainScreenLayout);
        mainScreenLayout.setHorizontalGroup(
            mainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainScreenLayout.createSequentialGroup()
                .addComponent(balanceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelbalance, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(mainScreenLayout.createSequentialGroup()
                .addGroup(mainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainScreenLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LogoDoSucesso))
                    .addGroup(mainScreenLayout.createSequentialGroup()
                        .addComponent(nicknameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelnick, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(transactionsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 21, Short.MAX_VALUE))
        );
        mainScreenLayout.setVerticalGroup(
            mainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainScreenLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogoDoSucesso)
                .addGap(18, 18, 18)
                .addGroup(mainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nicknameLabel)
                    .addComponent(labelnick))
                .addGap(18, 18, 18)
                .addGroup(mainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(balanceLabel)
                    .addComponent(labelbalance))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(transactionsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        menuFile.setText("File");
        menuBar.add(menuFile);

        menuSettings.setText("Settings");
        menuBar.add(menuSettings);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainScreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainScreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void comprarCoinsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarCoinsActionPerformed
       
    }//GEN-LAST:event_comprarCoinsActionPerformed

    private void comprarCoinsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comprarCoinsMouseClicked
        // Seleciona de quem quer comprar.. se não selecionar ninguém, retorna um erro.
        int linha = usersTable.getSelectedRow();
        if(linha == -1){
            JOptionPane.showMessageDialog(this, "Vendedor não selecionado, ERRO", "erro", JOptionPane.ERROR_MESSAGE);
        }
        else
            realizaCompra.setLocationRelativeTo(mainScreen);
            realizaCompra.setVisible(true);
            realizaCompra.toFront();
    }//GEN-LAST:event_comprarCoinsMouseClicked

    private void botaoMinerarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoMinerarMouseClicked
        // O usuário seleciona umavenda para minerar.. se não selecionar ninguém, retorna um erro.
        int linha = tradeTable.getSelectedRow();
        if(linha == -1){
            JOptionPane.showMessageDialog(this, "Venda não selecionada, ERRO", "erro", JOptionPane.ERROR_MESSAGE);
        }
        else
            minerarVendas.setLocationRelativeTo(mainScreen);
            minerarVendas.setVisible(true);
            minerarVendas.toFront();
    }//GEN-LAST:event_botaoMinerarMouseClicked

    private void usersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersTableMouseClicked
        // Seleciona com o mouse a linha/coluna com X moedas que quer fazer negócio..
        int x = usersTable.getSelectedRow();
        int y = usersTable.getSelectedColumn();
    
        Object obj = usersTable.getValueAt(x, y);
        
        moedasDisponiveis.setText(obj.toString());
    }//GEN-LAST:event_usersTableMouseClicked

    private void botaoFinalizaCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFinalizaCompraActionPerformed
        //float valorVenda = Float.parseFloat(qtdeDesejada.getText());
        float valorAtual = sessao.getCarteira();
        if(Float.parseFloat(qtdeDesejada.getText())  >= valorAtual){
            
            //pois terá a recompensa do minerador, então deve sobrar ao menos uma moeda
            JOptionPane.showMessageDialog(rootPane, "Moedas insuficientes, digite um valor menor");
        }
        else{
        valorAtual =  valorAtual - Float.parseFloat(qtdeDesejada.getText());
        //ArrayList Transações
        ArrayList<String> Transacoes = new ArrayList<String>();
        String[] transacoes = new String[]{"Vendedor", "Comprador", "Valor Negociado", "Status"};
        Transacoes.add(sessao.getNome());
        Transacoes.add(sessao.getNome());//está certo
        Transacoes.add(qtdeDesejada.getText() );
        Transacoes.add("Ativa");
        
        modeloTable2.addRow(Transacoes.toArray());
        
        realizaCompra.hide();
        
        //float balance = sessao.getCarteira(); 
        labelbalance.setText(valorAtual+" BitCoins");
        }
    }//GEN-LAST:event_botaoFinalizaCompraActionPerformed

    private void botaoMinerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMinerarActionPerformed
        // TODO add your handling code here:
        minerarVendas.toFront();
        
        JOptionPane.showMessageDialog(rootPane, "Minerando . . .");
        
        minerarVendas.toBack();
        
        //fazer um if pra verificar se a mineração foi ok
        //caso sim
        ArrayList<String> Transacoes = new ArrayList<String>();
        String[] transacoes = new String[]{"Vendedor", "Comprador", "Valor Negociado", "Status"};
        Transacoes.add(sessao.getNome());
        Transacoes.add(sessao.getNome());//está certo
        Transacoes.add(qtdeDesejada.getText() );
        Transacoes.add("Aprovada");
        
        
        
        modeloTable2.addRow(Transacoes.toArray());
    }//GEN-LAST:event_botaoMinerarActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LogoDoSucesso;
    private javax.swing.JLabel balanceLabel;
    private javax.swing.JButton botaoFinalizaCompra;
    private javax.swing.JButton botaoMinerar;
    private javax.swing.JButton comprarCoins;
    private javax.swing.JPanel dialogCompra;
    private javax.swing.JPanel dialogVendas;
    private javax.swing.JLabel labelDesejada;
    private javax.swing.JLabel labelDisponivel;
    private javax.swing.JLabel labelbalance;
    private javax.swing.JLabel labelnick;
    private javax.swing.JPanel mainScreen;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenu menuSettings;
    private javax.swing.JDialog minerarVendas;
    private javax.swing.JLabel moedasDisponiveis;
    private javax.swing.JLabel nicknameLabel;
    private javax.swing.JPanel painelTransactions;
    private javax.swing.JPanel painelUsers;
    private javax.swing.JTextField qtdeDesejada;
    private javax.swing.JDialog realizaCompra;
    private javax.swing.JLabel titleCompra;
    private javax.swing.JScrollPane tradePanel;
    private javax.swing.JTable tradeTable;
    private javax.swing.JTabbedPane transactionsPanel;
    private javax.swing.JScrollPane usersPanel;
    public javax.swing.JTable usersTable;
    private javax.swing.JLabel vendaID;
    private javax.swing.JLabel vendaId;
    // End of variables declaration//GEN-END:variables

    private String toString(float balance) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
