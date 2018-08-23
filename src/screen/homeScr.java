package screen;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class homeScr extends javax.swing.JFrame{

    calcDatas datas = new calcDatas();
    
    
    public homeScr(){
        initComponents();
        getRootPane().setDefaultButton(calculaBtn);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radioGroup = new javax.swing.ButtonGroup();
        mainScreen = new javax.swing.JPanel();
        limparBtn = new javax.swing.JButton();
        sairBtn = new javax.swing.JButton();
        vencimText = new javax.swing.JLabel();
        diasAteHojeInfo = new javax.swing.JLabel();
        campoVencimento = new javax.swing.JLabel();
        campoDiasAteHoje = new javax.swing.JLabel();
        sobreBtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        radioSelect = new javax.swing.JLabel();
        radio180d = new javax.swing.JRadioButton();
        radio60d = new javax.swing.JRadioButton();
        dataHJ = new javax.swing.JLabel();
        dataColetaForm1 = new javax.swing.JFormattedTextField();
        calculaBtn = new javax.swing.JButton();
        tituloPrograma = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        dataColetaInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora v2.4");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(new ImageIcon(getClass().getResource("/imagens/horse-icon.png")).getImage());
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });

        mainScreen.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        mainScreen.setToolTipText("");
        mainScreen.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mainScreen.setName("Calculadora v2.2");
        mainScreen.setRequestFocusEnabled(false);

        limparBtn.setBackground(new java.awt.Color(255, 255, 255));
        limparBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        limparBtn.setText("Limpar");
        limparBtn.setToolTipText("");
        limparBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        limparBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        limparBtn.setDefaultCapable(false);
        limparBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparBtnActionPerformed(evt);
            }
        });

        sairBtn.setBackground(new java.awt.Color(255, 255, 255));
        sairBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sairBtn.setText("Sair");
        sairBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        sairBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBtnActionPerformed(evt);
            }
        });

        vencimText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        vencimText.setText("Data de Vencimento:");

        diasAteHojeInfo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        diasAteHojeInfo.setText("Dias até Hoje:");

        campoVencimento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        campoDiasAteHoje.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        sobreBtn.setBackground(new java.awt.Color(255, 255, 255));
        sobreBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sobreBtn.setText("Sobre");
        sobreBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        sobreBtn.setPreferredSize(new java.awt.Dimension(35, 15));
        sobreBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobreBtnActionPerformed(evt);
            }
        });

        radioSelect.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        radioSelect.setText("Período:");

        radioGroup.add(radio180d);
        radio180d.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        radio180d.setSelected(true);
        radio180d.setText("180 dias");
        radio180d.setBorder(null);

        radioGroup.add(radio60d);
        radio60d.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        radio60d.setText("60 dias");

        dataColetaForm1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        try {
            dataColetaForm1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dataColetaForm1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        dataColetaForm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataColetaForm1ActionPerformed(evt);
            }
        });

        calculaBtn.setBackground(new java.awt.Color(255, 255, 255));
        calculaBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        calculaBtn.setText("Calcular");
        calculaBtn.setToolTipText("");
        calculaBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        calculaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculaBtnActionPerformed(evt);
            }
        });

        tituloPrograma.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        tituloPrograma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloPrograma.setText("Calculadora de Mormo e A.I.E. para 60/180 dias Corridos");

        dataColetaInfo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        dataColetaInfo.setText("Data de Coleta:");

        javax.swing.GroupLayout mainScreenLayout = new javax.swing.GroupLayout(mainScreen);
        mainScreen.setLayout(mainScreenLayout);
        mainScreenLayout.setHorizontalGroup(
            mainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainScreenLayout.createSequentialGroup()
                        .addGroup(mainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2)
                            .addComponent(dataHJ, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(mainScreenLayout.createSequentialGroup()
                        .addComponent(limparBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sobreBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sairBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainScreenLayout.createSequentialGroup()
                        .addComponent(jSeparator3)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainScreenLayout.createSequentialGroup()
                        .addComponent(tituloPrograma, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(mainScreenLayout.createSequentialGroup()
                        .addGroup(mainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainScreenLayout.createSequentialGroup()
                                .addComponent(dataColetaInfo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dataColetaForm1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(calculaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mainScreenLayout.createSequentialGroup()
                                .addGroup(mainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(mainScreenLayout.createSequentialGroup()
                                        .addComponent(diasAteHojeInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoDiasAteHoje, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(mainScreenLayout.createSequentialGroup()
                                        .addComponent(vencimText)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(mainScreenLayout.createSequentialGroup()
                                        .addComponent(radioSelect)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(radio180d)
                                        .addGap(12, 12, 12)
                                        .addComponent(radio60d)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        mainScreenLayout.setVerticalGroup(
            mainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainScreenLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(tituloPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(mainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataColetaInfo)
                    .addComponent(dataColetaForm1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calculaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dataHJ, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(mainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioSelect)
                    .addComponent(radio180d)
                    .addComponent(radio60d))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vencimText)
                    .addComponent(campoVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(mainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainScreenLayout.createSequentialGroup()
                        .addComponent(diasAteHojeInfo)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(mainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(limparBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sobreBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sairBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(campoDiasAteHoje, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        sairBtn.getAccessibleContext().setAccessibleDescription("sair do programa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainScreen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentHidden

    private void sobreBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobreBtnActionPerformed
        // TODO add your handling code here:
        Sobre info = new Sobre();  //cria uma nova variavel info chamando o metodo Sobre
        info.setVisible(true);      //deixa visivel a janela Sobre

    }//GEN-LAST:event_sobreBtnActionPerformed

    private void sairBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBtnActionPerformed
        //botao fechar programa
        System.exit(0); //Fecha o programa
    }//GEN-LAST:event_sairBtnActionPerformed

    private void calculaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculaBtnActionPerformed
        //calcular as datas e mostrar em setText
        //getRootPane().setDefaultButton(calculaBtn);      //Not Found
        String dataForm = dataColetaForm1.getText();    //Recebe o texto do formulário na variável dataForm
       
        GregorianCalendar c = new GregorianCalendar();      //Cria um calendário Grego variável C para calcular as datas
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");     //cria um DateFormat com dia/mes/ano para formatar a data de entrada e saida
        Date date;      //Cria uma variável date do formato Date
        
        if(radio180d.isSelected()){  //Se o radio 180 dias estiver selecionado ele faz isso
        try{        //Testa para entrar no método de calculo
            date = df.parse(dataForm);      //atribui o texto da data de entrada formatando com df a variável date
            datas.setDataInicio(date);      //seta a dataInicio com o valor da variavel date no método tatas
            c.setTime(date);            //pega a hora (00:00:00) da variavel data e atribui ao calendario Grego C
            c.add(Calendar.DAY_OF_MONTH, 179);      //adiciona 179 (ou 180 dias contando a data de coleta) a variável calendar C
            datas.setDataFim(c.getTime());      //seta a dataFim com o valor da variavel C adicionado os 180 dias no metodo datas
            
            // Começa a receber as datas para subtrair no dias ate hoje
            LocalDate dtHj = LocalDate.now();       //pega a data atual do sistema
            Instant instant = datas.getDataInicio().toInstant();        //pega a dataInicio (Date) e converte pra Instant
            LocalDate dataColetaa = instant.atZone(ZoneId.systemDefault()).toLocalDate();    //Pega a Instant e converte pra LocalDate com ZoneID do sistema
            long diasAH = ChronoUnit.DAYS.between(dataColetaa, dtHj);       //subtrai a data de coleta da data atual do sistema
            diasAH = diasAH + 1;  //seta o diasHJ com 180 dias ao inves de 179
            campoVencimento.setText(df.format(datas.getDataFim()) + "");    //seta o texto no layout com a data de vencimento
            campoDiasAteHoje.setText(diasAH + "");      //seta o texto no layout com os dias até hoje
        } 
        catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Data de Coleta deve ser Informada.", "Data de Coleta Inválida!", JOptionPane.ERROR_MESSAGE);  //Se nao tiver nenhuma data digitada no campo da mensagem de erro
            
            //JOptionPane.showMessageDialog(null, "Mensagem", "Título", JOptionPane.ERROR_MESSAGE);
            //campoVencimento.setText("");  //pra nao aparecer null (vazio) seta o campo com nada dentro
            //campoDiasAteHoje.setText(""); //pra nao aparecer null (vazio) seta o campo com nada dentro
        }
    }//GEN-LAST:event_calculaBtnActionPerformed
        else if(radio60d.isSelected()){   //Se não se o radio 60 dias estiver selecionado ele faz isso
        try{        //Testa para entrar no método de calculo
            date = df.parse(dataForm);      //atribui o texto da data de entrada formatando com df a variável date
            datas.setDataInicio(date);      //seta a dataInicio com o valor da variavel date no método tatas
            c.setTime(date);            //pega a hora (00:00:00) da variavel data e atribui ao calendario Grego C
            c.add(Calendar.DAY_OF_MONTH, 59);      //adiciona 179 (ou 180 dias contando a data de coleta) a variável calendar C
            datas.setDataFim(c.getTime());      //seta a dataFim com o valor da variavel C adicionado os 180 dias no metodo datas
            
            // Começa a receber as datas para subtrair no dias ate hoje
            LocalDate dtHj = LocalDate.now();       //pega a data atual do sistema
            Instant instant = datas.getDataInicio().toInstant();        //pega a dataInicio (Date) e converte pra Instant
            LocalDate dataColetaa = instant.atZone(ZoneId.systemDefault()).toLocalDate();    //Pega a Instant e converte pra LocalDate com ZoneID do sistema
            long diasAH = ChronoUnit.DAYS.between(dataColetaa, dtHj);       //subtrai a data de coleta da data atual do sistema
            diasAH = diasAH + 1;  //seta o diasHJ com 180 dias ao inves de 179
            campoVencimento.setText(df.format(datas.getDataFim()) + "");    //seta o texto no layout com a data de vencimento
            campoDiasAteHoje.setText(diasAH + "");      //seta o texto no layout com os dias até hoje
        } 
        catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Data de Coleta deve ser Informada.", "Data de Coleta Inválida!", JOptionPane.ERROR_MESSAGE);  //Se nao tiver nenhuma data digitada no campo da mensagem de erro
            
            //JOptionPane.showMessageDialog(null, "Mensagem", "Título", JOptionPane.ERROR_MESSAGE);
            //campoVencimento.setText("");  //pra nao aparecer null (vazio) seta o campo com nada dentro
            //campoDiasAteHoje.setText(""); //pra nao aparecer null (vazio) seta o campo com nada dentro
        }
        
        
        }
        
        
    }
    
    
    
    
    private void limparBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparBtnActionPerformed
        // configura o botao limpar para limpar todos os campos
        dataColetaForm1.setText("");
        campoVencimento.setText("");
        campoDiasAteHoje.setText("");
    }//GEN-LAST:event_limparBtnActionPerformed

    private void dataColetaForm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataColetaForm1ActionPerformed
        // TODO add your handling code here:\
        
    }//GEN-LAST:event_dataColetaForm1ActionPerformed

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
            for (javax.swing.UIManager.LookAndFeelInfo info: javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homeScr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new homeScr().setVisible(true);
            new homeScr().setTitle("Calculadora v2.2");
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculaBtn;
    private javax.swing.JLabel campoDiasAteHoje;
    private javax.swing.JLabel campoVencimento;
    private javax.swing.JFormattedTextField dataColetaForm1;
    private javax.swing.JLabel dataColetaInfo;
    private javax.swing.JLabel dataHJ;
    private javax.swing.JLabel diasAteHojeInfo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton limparBtn;
    private javax.swing.JPanel mainScreen;
    private javax.swing.JRadioButton radio180d;
    private javax.swing.JRadioButton radio60d;
    private javax.swing.ButtonGroup radioGroup;
    private javax.swing.JLabel radioSelect;
    private javax.swing.JButton sairBtn;
    private javax.swing.JButton sobreBtn;
    private javax.swing.JLabel tituloPrograma;
    private javax.swing.JLabel vencimText;
    // End of variables declaration//GEN-END:variables

    
}
