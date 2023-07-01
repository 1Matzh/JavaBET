
package javabet;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        SaldoInic();
    }
    
    int saldo;
    int saldoInic = 1000;
    int corSorteada;
    
    public void SortearCor() {
        double possibilidade = Math.random() * 100;
        System.out.println(possibilidade);
        if (possibilidade <= 45) {
            corSorteada = 0;
        }
        if (possibilidade > 45 && possibilidade < 55) {
            corSorteada = 1;
        }
        if (possibilidade >= 55) {
            corSorteada = 2;
        }
    }
    
    public final void SaldoInic() {
        saldo = saldoInic;
        SaldoText.setText(Integer.toString(saldo));
    }
    
    public final void addSaldo() {
        saldo = saldo + 1000;
        SaldoText.setText(Integer.toString(saldo));
    }
    
    public int Aposta(int corValor, int Multiplicador) {
        int aposta = Integer.parseInt(QuantiaText.getText());
        SaldoText.setText(Integer.toString(saldo - aposta));
        SortearCor();
        if (saldo > 0) 
        {
            AvisosText.setText("");
            
            if (corSorteada == corValor) {
                saldo = saldo + (aposta * Multiplicador);
                AvisosText.setText("Você acertou!");
            }
            else if (corSorteada != corValor) {
                saldo = saldo - aposta;
                AvisosText.setText("Você errou!");
            }
        }
        if (saldo <= 0) 
        {
            saldo = 0;
            AvisosText.setText("Você não tem saldo suficiente");
        }
        SaldoText.setText(Integer.toString(saldo));    
        return saldo;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SaldoPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        SaldoText = new javax.swing.JLabel();
        addSaldo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        buttonVermelho = new javax.swing.JButton();
        buttonPreto = new javax.swing.JButton();
        QuantiaText = new javax.swing.JTextField();
        buttonBranco = new javax.swing.JButton();
        AvisosText = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("R$");

        SaldoText.setText("saldo");

        addSaldo.setText("+");
        addSaldo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AdicionarSaldo(evt);
            }
        });

        javax.swing.GroupLayout SaldoPanelLayout = new javax.swing.GroupLayout(SaldoPanel);
        SaldoPanel.setLayout(SaldoPanelLayout);
        SaldoPanelLayout.setHorizontalGroup(
            SaldoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SaldoPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SaldoText, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(addSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        SaldoPanelLayout.setVerticalGroup(
            SaldoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SaldoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SaldoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(SaldoText)
                    .addComponent(addSaldo))
                .addContainerGap())
        );

        buttonVermelho.setBackground(new java.awt.Color(255, 0, 0));
        buttonVermelho.setForeground(new java.awt.Color(255, 255, 255));
        buttonVermelho.setText("2x");
        buttonVermelho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ApostaVermelho(evt);
            }
        });

        buttonPreto.setBackground(new java.awt.Color(0, 0, 0));
        buttonPreto.setForeground(new java.awt.Color(255, 255, 255));
        buttonPreto.setText("2x");
        buttonPreto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ApostaPreto(evt);
            }
        });

        QuantiaText.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        buttonBranco.setText("15x");
        buttonBranco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ApostaBranco(evt);
            }
        });

        AvisosText.setForeground(new java.awt.Color(255, 0, 0));
        AvisosText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setText("Quantia:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(buttonVermelho, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buttonBranco, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buttonPreto, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(QuantiaText, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(AvisosText, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(QuantiaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonPreto)
                    .addComponent(buttonVermelho)
                    .addComponent(buttonBranco))
                .addGap(4, 4, 4)
                .addComponent(AvisosText, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel3.setText("Feito por 1Matzh");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("JavaBET");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(97, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SaldoPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(SaldoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ApostaVermelho(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ApostaVermelho
        Aposta(0,2);
    }//GEN-LAST:event_ApostaVermelho

    private void ApostaBranco(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ApostaBranco
        Aposta(1,15);
    }//GEN-LAST:event_ApostaBranco

    private void ApostaPreto(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ApostaPreto
        Aposta(2,2);
    }//GEN-LAST:event_ApostaPreto

    private void AdicionarSaldo(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdicionarSaldo
        addSaldo();
    }//GEN-LAST:event_AdicionarSaldo

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AvisosText;
    private javax.swing.JTextField QuantiaText;
    private javax.swing.JPanel SaldoPanel;
    private javax.swing.JLabel SaldoText;
    private javax.swing.JButton addSaldo;
    private javax.swing.JButton buttonBranco;
    private javax.swing.JButton buttonPreto;
    private javax.swing.JButton buttonVermelho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
