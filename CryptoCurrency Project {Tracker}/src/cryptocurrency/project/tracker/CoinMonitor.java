package cryptocurrency.project.tracker;

import java.awt.Color;
import javax.swing.JOptionPane;

public class CoinMonitor extends javax.swing.JFrame {
    public CoinMonitor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jSpinner1 = new javax.swing.JSpinner();
        topPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        coinNameTF = new javax.swing.JTextField();
        currencyTF = new javax.swing.JTextField();
        askCoinNameLabel = new javax.swing.JLabel();
        convertButton = new javax.swing.JButton();
        bottomPanel = new javax.swing.JPanel();
        symbolText = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        currentPriceLabel = new javax.swing.JLabel();
        changeLabel = new javax.swing.JLabel();
        changePercentageLabel = new javax.swing.JLabel();
        lastUpdateLabel = new javax.swing.JLabel();
        symbolValue = new javax.swing.JLabel();
        nameValue = new javax.swing.JLabel();
        currentPriceValue = new javax.swing.JLabel();
        changeValue = new javax.swing.JLabel();
        changePercenageValue = new javax.swing.JLabel();
        lastUpdateValue = new javax.swing.JLabel();
        capRankLabel = new javax.swing.JLabel();
        capRankValue = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
                jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE));
        jDialog1Layout.setVerticalGroup(
                jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(248, 6, 204));

        topPanel.setBackground(new java.awt.Color(27, 36, 48));
        topPanel.setForeground(new java.awt.Color(255, 255, 255));

        titleLabel.setFont(new java.awt.Font("Bodoni 72 Smallcaps", 1, 64)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(235, 235, 235));
        titleLabel.setText("C o i n - M o n i t o r  ");

        coinNameTF.setBackground(new java.awt.Color(24, 10, 10));
        coinNameTF.setFont(new java.awt.Font("Big Caslon", 0, 24)); // NOI18N
        coinNameTF.setForeground(new java.awt.Color(235, 235, 235));
        coinNameTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        coinNameTF.setText("CrytoCurrency");
        coinNameTF.setPreferredSize(new java.awt.Dimension(100, 40));
        coinNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coinNameTFActionPerformed(evt);
            }
        });

        currencyTF.setBackground(new java.awt.Color(24, 10, 10));
        currencyTF.setFont(new java.awt.Font("Big Caslon", 0, 24)); // NOI18N
        currencyTF.setForeground(new java.awt.Color(255, 255, 255));
        currencyTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        currencyTF.setText("Currency");
        currencyTF.setMinimumSize(new java.awt.Dimension(70, 40));
        currencyTF.setPreferredSize(new java.awt.Dimension(70, 40));
        currencyTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currencyTFActionPerformed(evt);
            }
        });

        askCoinNameLabel.setFont(new java.awt.Font("Big Caslon", 0, 24)); // NOI18N
        askCoinNameLabel.setForeground(new java.awt.Color(235, 235, 235));
        askCoinNameLabel.setText("Enter  The  Coin  Name  -");
        askCoinNameLabel.setPreferredSize(new java.awt.Dimension(199, 40));

        convertButton.setFont(new java.awt.Font("Big Caslon", 0, 24)); // NOI18N
        convertButton.setForeground(new java.awt.Color(24, 10, 10));
        convertButton.setText("CONVERT");
        convertButton.setPreferredSize(new java.awt.Dimension(136, 40));
        convertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
                topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(topPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(topPanelLayout.createSequentialGroup()
                                                .addComponent(askCoinNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        263, Short.MAX_VALUE)
                                                .addGap(26, 26, 26)
                                                .addComponent(coinNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 280,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(currencyTF, javax.swing.GroupLayout.PREFERRED_SIZE, 118,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(convertButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(21, 21, 21))
                                        .addGroup(topPanelLayout.createSequentialGroup()
                                                .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addContainerGap()))));
        topPanelLayout.setVerticalGroup(
                topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topPanelLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(currencyTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(coinNameTF, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(askCoinNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(convertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(30, Short.MAX_VALUE)));

        bottomPanel.setBackground(new java.awt.Color(24, 10, 10));
        bottomPanel.setForeground(new java.awt.Color(255, 255, 255));

        symbolText.setFont(new java.awt.Font("Gurmukhi MN", 0, 30)); // NOI18N
        symbolText.setForeground(new java.awt.Color(255, 255, 255));
        symbolText.setText("Symbol Of Currency   :");

        nameLabel.setFont(new java.awt.Font("Gurmukhi MN", 0, 30)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("Name / Identity   :");

        currentPriceLabel.setFont(new java.awt.Font("Gurmukhi MN", 0, 30)); // NOI18N
        currentPriceLabel.setForeground(new java.awt.Color(255, 255, 255));
        currentPriceLabel.setText("Current Price :");

        changeLabel.setFont(new java.awt.Font("Gurmukhi MN", 0, 30)); // NOI18N
        changeLabel.setForeground(new java.awt.Color(255, 255, 255));
        changeLabel.setText("Price Change ( 24-Hr )   :");

        changePercentageLabel.setFont(new java.awt.Font("Gurmukhi MN", 0, 30)); // NOI18N
        changePercentageLabel.setForeground(new java.awt.Color(255, 255, 255));
        changePercentageLabel.setText("Price Change Percentage   :");

        lastUpdateLabel.setFont(new java.awt.Font("Gurmukhi MN", 0, 30)); // NOI18N
        lastUpdateLabel.setForeground(new java.awt.Color(255, 255, 255));
        lastUpdateLabel.setText("Data Last Updated   :");

        symbolValue.setFont(new java.awt.Font("Gurmukhi MN", 0, 30)); // NOI18N
        symbolValue.setForeground(new java.awt.Color(255, 255, 255));
        symbolValue.setText("Unknown");

        nameValue.setFont(new java.awt.Font("Gurmukhi MN", 0, 30)); // NOI18N
        nameValue.setForeground(new java.awt.Color(255, 255, 255));
        nameValue.setText("Unknown");

        currentPriceValue.setFont(new java.awt.Font("Gurmukhi MN", 0, 30)); // NOI18N
        currentPriceValue.setForeground(new java.awt.Color(255, 255, 255));
        currentPriceValue.setText("Unknown");

        changeValue.setFont(new java.awt.Font("Gurmukhi MN", 0, 30)); // NOI18N
        changeValue.setForeground(new java.awt.Color(255, 255, 255));
        changeValue.setText("Unknown");

        changePercenageValue.setFont(new java.awt.Font("Gurmukhi MN", 0, 30)); // NOI18N
        changePercenageValue.setForeground(new java.awt.Color(255, 255, 255));
        changePercenageValue.setText("Unknown");

        lastUpdateValue.setFont(new java.awt.Font("Gurmukhi MN", 0, 30)); // NOI18N
        lastUpdateValue.setForeground(new java.awt.Color(255, 255, 255));
        lastUpdateValue.setText("Unknown");

        capRankLabel.setFont(new java.awt.Font("Gurmukhi MN", 0, 30)); // NOI18N
        capRankLabel.setForeground(new java.awt.Color(255, 255, 255));
        capRankLabel.setText("Market Cap Rank   :");

        capRankValue.setFont(new java.awt.Font("Gurmukhi MN", 0, 30)); // NOI18N
        capRankValue.setForeground(new java.awt.Color(255, 255, 255));
        capRankValue.setText("Unknown");

        javax.swing.GroupLayout bottomPanelLayout = new javax.swing.GroupLayout(bottomPanel);
        bottomPanel.setLayout(bottomPanelLayout);
        bottomPanelLayout.setHorizontalGroup(
                bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(bottomPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(bottomPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(bottomPanelLayout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                        bottomPanelLayout.createSequentialGroup()
                                                                .addComponent(nameLabel)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(nameValue,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 641,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(bottomPanelLayout.createSequentialGroup()
                                                        .addComponent(lastUpdateLabel)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(lastUpdateValue,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGap(148, 148, 148)))
                                        .addGroup(bottomPanelLayout.createSequentialGroup()
                                                .addGroup(bottomPanelLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addGroup(bottomPanelLayout.createSequentialGroup()
                                                                .addComponent(symbolText)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(symbolValue,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 565,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(bottomPanelLayout.createSequentialGroup()
                                                                .addComponent(changePercentageLabel)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(changePercenageValue,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE))
                                                        .addGroup(bottomPanelLayout.createSequentialGroup()
                                                                .addComponent(changeLabel)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(changeValue,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE))
                                                        .addGroup(bottomPanelLayout.createSequentialGroup()
                                                                .addComponent(capRankLabel)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(capRankValue,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE))
                                                        .addGroup(bottomPanelLayout.createSequentialGroup()
                                                                .addComponent(currentPriceLabel)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(currentPriceValue,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 673,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(154, 154, 154)))));
        bottomPanelLayout.setVerticalGroup(
                bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(bottomPanelLayout.createSequentialGroup()
                                .addContainerGap(30, Short.MAX_VALUE)
                                .addGroup(bottomPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(symbolText)
                                        .addComponent(symbolValue))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17,
                                        Short.MAX_VALUE)
                                .addGroup(bottomPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nameLabel)
                                        .addComponent(nameValue))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17,
                                        Short.MAX_VALUE)
                                .addGroup(bottomPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(currentPriceLabel)
                                        .addComponent(currentPriceValue))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17,
                                        Short.MAX_VALUE)
                                .addGroup(bottomPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(capRankLabel)
                                        .addComponent(capRankValue))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17,
                                        Short.MAX_VALUE)
                                .addGroup(bottomPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(changeLabel)
                                        .addComponent(changeValue))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15,
                                        Short.MAX_VALUE)
                                .addGroup(bottomPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(changePercentageLabel)
                                        .addComponent(changePercenageValue))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15,
                                        Short.MAX_VALUE)
                                .addGroup(bottomPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lastUpdateLabel)
                                        .addComponent(lastUpdateValue))
                                .addContainerGap(30, Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(bottomPanel, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bottomPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap()));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void coinNameTFActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_coinNameTFActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_coinNameTFActionPerformed

    private void convertButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_convertButtonActionPerformed
        // TODO add your handling code here:

        try {
            String coinID = coinNameTF.getText().trim().toLowerCase().replaceAll(" ", "-");
            if (coinID == null) {
                coinNameTF.setText("Bitcoin");
                // throw new Exception("Enter the crypto-currency / crypto coin name in the
                // text-field.");
            }

            String currency = currencyTF.getText().toUpperCase();
            if (currency == null) {
                throw new Exception("Enter the currency name in the text-field.");
            }

            NetworkHelper apiCall = new NetworkHelper();
            CoinData coinObj = new CoinData();
            apiCall.getData(coinID, currency, coinObj);
            apiCall.decodeData(coinObj);
            if (coinObj.fullData != null) {
                nameValue.setText(coinObj.name);
                symbolValue.setText(coinObj.symbol);
                currentPriceValue.setText(coinObj.currentPrice.toString() + " " + currency.toUpperCase());
                capRankValue.setText(coinObj.marketRank.toString());
                changeValue.setText(coinObj.priceChange.toString());
                changeValue.setForeground(coinObj.changeValueColor);
                changePercenageValue.setText(coinObj.percentChange.toString() + " %");
                changePercenageValue.setForeground(coinObj.changeValueColor);
                lastUpdateValue.setText(coinObj.lastUpadte);
                new MyCryptoGraph(coinID, currency).DrawGraph();

            } else {
                nameValue.setText("Unknown");
                symbolValue.setText("Unknown");
                currentPriceValue.setText("Unknown");
                capRankValue.setText("Unknown");
                changeValue.setText("Unknown");
                changeValue.setForeground(Color.white);
                changePercenageValue.setText("Unknown");
                changePercenageValue.setForeground(Color.white);
                lastUpdateValue.setText("Unknown");
                throw new Exception("Data received 'null' can't be operated.");
            }

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, "Data Not Found !!!\n" + ex.getMessage(), "E R R O R ❗️",
                    JOptionPane.ERROR_MESSAGE);
        }

    }// GEN-LAST:event_convertButtonActionPerformed

    private void currencyTFActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_currencyTFActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_currencyTFActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CoinMonitor.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CoinMonitor.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CoinMonitor.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CoinMonitor.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CoinMonitor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel askCoinNameLabel;
    public javax.swing.JPanel bottomPanel;
    public javax.swing.JLabel capRankLabel;
    public javax.swing.JLabel capRankValue;
    public javax.swing.JLabel changeLabel;
    public javax.swing.JLabel changePercenageValue;
    public javax.swing.JLabel changePercentageLabel;
    public javax.swing.JLabel changeValue;
    public javax.swing.JTextField coinNameTF;
    public javax.swing.JButton convertButton;
    public javax.swing.JTextField currencyTF;
    public javax.swing.JLabel currentPriceLabel;
    public javax.swing.JLabel currentPriceValue;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JSpinner jSpinner1;
    public javax.swing.JLabel lastUpdateLabel;
    public javax.swing.JLabel lastUpdateValue;
    public javax.swing.JLabel nameLabel;
    public javax.swing.JLabel nameValue;
    public javax.swing.JLabel symbolText;
    public javax.swing.JLabel symbolValue;
    public javax.swing.JLabel titleLabel;
    public javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}
