package filaDeEspera;

import java.util.ArrayList;



public class PainelSenha extends javax.swing.JFrame {
    
    
    ArrayList<Senha> FilaDeAtendimento = new ArrayList();  
    private int ContarSenha, mostrarSenha ;
    public PainelSenha() {        
        ContarSenha = 0;
        mostrarSenha = 0;
        setTitle("Sistema de Controle de Fila de Espera");
        initComponents();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txto_senha_tela = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        BotaoSenhaC = new javax.swing.JButton();
        BotaoSenhaR = new javax.swing.JButton();
        BotaoSenhaP = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        SenhaUsuario = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jbottonCaixa1 = new javax.swing.JButton();
        jbottonCaixa3 = new javax.swing.JButton();
        jbottonCaixa2 = new javax.swing.JButton();
        jbottonCaixa4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txto_caixa_tela = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        txto_senha_tela.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txto_senha_tela.setText("senha");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Escolha seu  atendimento");

        BotaoSenhaC.setBackground(new java.awt.Color(255, 255, 255));
        BotaoSenhaC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BotaoSenhaC.setText("Comum");
        BotaoSenhaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSenhaCActionPerformed(evt);
            }
        });

        BotaoSenhaR.setBackground(new java.awt.Color(255, 255, 255));
        BotaoSenhaR.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BotaoSenhaR.setText("Rápido");
        BotaoSenhaR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSenhaRActionPerformed(evt);
            }
        });

        BotaoSenhaP.setBackground(new java.awt.Color(255, 255, 255));
        BotaoSenhaP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BotaoSenhaP.setText("Prioritário");
        BotaoSenhaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSenhaPActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Sua senha é:");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        SenhaUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SenhaUsuario.setText("senha");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(SenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(164, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(SenhaUsuario))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(BotaoSenhaC))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaoSenhaR)
                        .addGap(31, 31, 31)
                        .addComponent(BotaoSenhaP)
                        .addGap(30, 30, 30))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoSenhaC)
                    .addComponent(BotaoSenhaR)
                    .addComponent(BotaoSenhaP))
                .addGap(59, 59, 59)
                .addComponent(jLabel9)
                .addGap(35, 35, 35)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jbottonCaixa1.setBackground(new java.awt.Color(255, 255, 255));
        jbottonCaixa1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbottonCaixa1.setForeground(new java.awt.Color(255, 0, 51));
        jbottonCaixa1.setText("Caixa 1");
        jbottonCaixa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbottonCaixa1ActionPerformed(evt);
            }
        });

        jbottonCaixa3.setBackground(new java.awt.Color(255, 255, 255));
        jbottonCaixa3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbottonCaixa3.setForeground(new java.awt.Color(255, 0, 51));
        jbottonCaixa3.setText("Caixa 3");
        jbottonCaixa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbottonCaixa3ActionPerformed(evt);
            }
        });

        jbottonCaixa2.setBackground(new java.awt.Color(255, 255, 255));
        jbottonCaixa2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbottonCaixa2.setForeground(new java.awt.Color(255, 0, 51));
        jbottonCaixa2.setText("Caixa 2");
        jbottonCaixa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbottonCaixa2ActionPerformed(evt);
            }
        });

        jbottonCaixa4.setBackground(new java.awt.Color(255, 255, 255));
        jbottonCaixa4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbottonCaixa4.setForeground(new java.awt.Color(255, 0, 51));
        jbottonCaixa4.setText("Caixa 4");
        jbottonCaixa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbottonCaixa4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbottonCaixa4)
                    .addComponent(jbottonCaixa1)
                    .addComponent(jbottonCaixa2)
                    .addComponent(jbottonCaixa3))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jbottonCaixa1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbottonCaixa2)
                .addGap(46, 46, 46)
                .addComponent(jbottonCaixa3)
                .addGap(42, 42, 42)
                .addComponent(jbottonCaixa4)
                .addGap(39, 39, 39))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Para Clientes:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Para caixas:");

        txto_caixa_tela.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txto_caixa_tela.setText("caixa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(363, 363, 363)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txto_senha_tela)
                            .addComponent(txto_caixa_tela)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(txto_senha_tela)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(txto_caixa_tela)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
     
    private void CadastrarSenhacliente(String tipo, Integer numSenha){        
        Senha s = new Senha(tipo, numSenha);
        FilaDeAtendimento.add(s);
    }
    private void jbottonCaixa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbottonCaixa1ActionPerformed
        mostrarSenha = 0;
        if(FilaDeAtendimento.size() > 0){
            txto_caixa_tela.setText("Caixa 1");
            for (int i = 0; i < FilaDeAtendimento.size(); i++) 
            {
                if(FilaDeAtendimento.get(i).getTipo().equals("P"))
                {
                    txto_senha_tela.setText(FilaDeAtendimento.get(i).getTipo()+"-"+FilaDeAtendimento.get(i).getSenha());
                    FilaDeAtendimento.remove(i);
                    mostrarSenha = 1;
                    break;

                }
            }
            if(mostrarSenha == 0)
            {
                for (int i = 0; i < FilaDeAtendimento.size(); i++)
                {
                    if(FilaDeAtendimento.get(i).getTipo().equals("R")|| FilaDeAtendimento.get(i).getTipo().equals("C"))
                    {
                        txto_senha_tela.setText(FilaDeAtendimento.get(i).getTipo()+"-"+FilaDeAtendimento.get(i).getSenha());
                        FilaDeAtendimento.remove(i);
                        mostrarSenha = 1;
                        break;

                    }
                }
            }
            
             
        }
       
    }//GEN-LAST:event_jbottonCaixa1ActionPerformed

    private void jbottonCaixa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbottonCaixa2ActionPerformed
       
        mostrarSenha = 0;
        if(FilaDeAtendimento.size() > 0)
        {
            txto_caixa_tela.setText("Caixa 2");
            for (int i = 0; i < FilaDeAtendimento.size(); i++) 
            {
                if(FilaDeAtendimento.get(i).getTipo().equals("R") )
                {
                    txto_senha_tela.setText(FilaDeAtendimento.get(i).getTipo()+"-"+FilaDeAtendimento.get(i).getSenha());
                    FilaDeAtendimento.remove(i);
                    mostrarSenha = 1;
                    break;

                }
            }
            if(mostrarSenha == 0){
                for (int i = 0; i < FilaDeAtendimento.size(); i++) 
                {
                    if(FilaDeAtendimento.get(i).getTipo().equals("P") || FilaDeAtendimento.get(i).getTipo().equals("C"))
                    {
                        txto_senha_tela.setText(FilaDeAtendimento.get(i).getTipo()+"-"+FilaDeAtendimento.get(i).getSenha());
                        FilaDeAtendimento.remove(i);
                        mostrarSenha = 1;
                        break;

                    }
                }
            }
            
             
        }
    }//GEN-LAST:event_jbottonCaixa2ActionPerformed

    private void jbottonCaixa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbottonCaixa3ActionPerformed
       
        mostrarSenha = 0;
        
        if(FilaDeAtendimento.size() > 0){
            txto_caixa_tela.setText("Caixa 3");
            for (int i = 0; i < FilaDeAtendimento.size(); i++) 
            {
                if(FilaDeAtendimento.get(i).getTipo().equals("R"))
                {
                    txto_senha_tela.setText(FilaDeAtendimento.get(i).getTipo()+"-"+FilaDeAtendimento.get(i).getSenha());
                    FilaDeAtendimento.remove(i);
                    mostrarSenha = 1;
                    break;

                }
            }
            if(mostrarSenha == 0){
                for (int i = 0; i < FilaDeAtendimento.size(); i++) 
                {
                    if(FilaDeAtendimento.get(i).getTipo().equals("P") || FilaDeAtendimento.get(i).getTipo().equals("C"))
                    {
                        txto_senha_tela.setText(FilaDeAtendimento.get(i).getTipo()+"-"+FilaDeAtendimento.get(i).getSenha());
                        FilaDeAtendimento.remove(i);
                        mostrarSenha = 1;
                        break;

                    }
                }
            }
            
             
        }
    }//GEN-LAST:event_jbottonCaixa3ActionPerformed

    private void jbottonCaixa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbottonCaixa4ActionPerformed
       
        mostrarSenha = 0;
        
        if(FilaDeAtendimento.size() > 0)
        {
            txto_caixa_tela.setText("Caixa 4");
            for (int i = 0; i < FilaDeAtendimento.size(); i++) 
            {
                if(FilaDeAtendimento.get(i).getTipo().equals("C"))
                {
                    txto_senha_tela.setText(FilaDeAtendimento.get(i).getTipo()+"-"+FilaDeAtendimento.get(i).getSenha());
                    FilaDeAtendimento.remove(i);
                    mostrarSenha = 1;
                    break;

                }
            }
            if(mostrarSenha == 0)
            {
                for (int i = 0; i < FilaDeAtendimento.size(); i++) 
                {
                    if(FilaDeAtendimento.get(i).getTipo().equals("R")|| FilaDeAtendimento.get(i).getTipo().equals("P"))
                    {
                        txto_senha_tela.setText(FilaDeAtendimento.get(i).getTipo()+"-"+FilaDeAtendimento.get(i).getSenha());
                        FilaDeAtendimento.remove(i);
                        
                        break;

                    }
                }
            }
            
        }
    }//GEN-LAST:event_jbottonCaixa4ActionPerformed

    private void BotaoSenhaCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSenhaCActionPerformed
        
        
        ContarSenha++;
        CadastrarSenhacliente("C", ContarSenha);
        SenhaUsuario.setText("C-"+ContarSenha);
    }//GEN-LAST:event_BotaoSenhaCActionPerformed

    private void BotaoSenhaRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSenhaRActionPerformed
        ContarSenha++;
        CadastrarSenhacliente("R", ContarSenha);
        SenhaUsuario.setText("R-"+ContarSenha);
    }//GEN-LAST:event_BotaoSenhaRActionPerformed

    private void BotaoSenhaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSenhaPActionPerformed
        ContarSenha++;
        CadastrarSenhacliente("P", ContarSenha);
        SenhaUsuario.setText("P-"+ContarSenha);
    }//GEN-LAST:event_BotaoSenhaPActionPerformed
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoSenhaC;
    private javax.swing.JButton BotaoSenhaP;
    private javax.swing.JButton BotaoSenhaR;
    private javax.swing.JLabel SenhaUsuario;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbottonCaixa1;
    private javax.swing.JButton jbottonCaixa2;
    private javax.swing.JButton jbottonCaixa3;
    private javax.swing.JButton jbottonCaixa4;
    private javax.swing.JLabel txto_caixa_tela;
    private javax.swing.JLabel txto_senha_tela;
    // End of variables declaration//GEN-END:variables
    
    
    
}
