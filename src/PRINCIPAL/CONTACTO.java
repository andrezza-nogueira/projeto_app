package PRINCIPAL;

import AGENDAMENTO.AGENDAMENTO;
import UTILIDA.CONEXAO;
import UTILIDA.FormataDados;
import UTILIDA.GRA_ALT_EXC;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
/**
 *
 * @author Andrezza
 */
public class CONTACTO extends javax.swing.JDialog {
        CONEXAO CONEXAO = new CONEXAO();
        int grava = 0;
        DefaultListModel MODELO;
        int ListaNomeEnter = 0;
        int filtro = 0;
        String CodigoVetor[];
        FormataDados FORTEL = new FormataDados();
            
            
    public CONTACTO(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        CONEXAO.conecta();
        MODELO = new DefaultListModel();
        Lista.setModel(MODELO);
        
        Lista.setVisible(false);
        BotaoSalvar.setToolTipText("Salvar contacto");
        BotaoNovoContacto.setToolTipText("Novo contacto");
        BotaoExcluir.setToolTipText("Excluir contacto");
        BotaoExcluir.setVisible(false);
        Cod.setVisible(false);

        Lfiltro.setVisible(false);
        Filtro.setVisible(false);
        jScrollPaneTabela.setVisible(false);

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Camadas = new javax.swing.JLayeredPane();
        Lista = new javax.swing.JList<>();
        BotaoNovoContacto = new javax.swing.JButton();
        BotaoSalvar = new javax.swing.JButton();
        BotaoExcluir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Lfiltro = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        nome = new javax.swing.JTextField();
        morada = new javax.swing.JTextField();
        PesquisaNome = new javax.swing.JTextField();
        freguesia = new javax.swing.JTextField();
        jScrollPaneTabela = new javax.swing.JScrollPane();
        TabelaContacto = new javax.swing.JTable();
        jScrollPaneinformacoesadicionais = new javax.swing.JScrollPane();
        adicionais = new javax.swing.JTextArea();
        Lnome = new javax.swing.JLabel();
        Lservico = new javax.swing.JLabel();
        Ldata = new javax.swing.JLabel();
        Lemail = new javax.swing.JLabel();
        telefone = new javax.swing.JTextField();
        Lfreguesia = new javax.swing.JLabel();
        Lcodigopostal = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        Linfo = new javax.swing.JLabel();
        Linfo1 = new javax.swing.JLabel();
        Filtro = new javax.swing.JTextField();
        Cod = new javax.swing.JLabel();
        BotaoMaisouMenos = new javax.swing.JButton();
        codigo_postal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        Camadas.setBackground(new java.awt.Color(255, 255, 255));
        Camadas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Camadas.setAlignmentX(0.1F);
        Camadas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Camadas.setOpaque(true);

        Lista.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Lista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaMouseClicked(evt);
            }
        });
        Lista.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ListaKeyReleased(evt);
            }
        });
        Camadas.add(Lista);
        Lista.setBounds(210, 40, 150, 100);

        BotaoNovoContacto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGEM/livro.png"))); // NOI18N
        BotaoNovoContacto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotaoNovoContactoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoNovoContactoMouseExited(evt);
            }
        });
        BotaoNovoContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoNovoContactoActionPerformed(evt);
            }
        });
        Camadas.add(BotaoNovoContacto);
        BotaoNovoContacto.setBounds(10, 0, 50, 50);

        BotaoSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGEM/salvar.png"))); // NOI18N
        BotaoSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotaoSalvarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoSalvarMouseExited(evt);
            }
        });
        BotaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSalvarActionPerformed(evt);
            }
        });
        Camadas.add(BotaoSalvar);
        BotaoSalvar.setBounds(70, 0, 50, 50);

        BotaoExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGEM/deleta.png"))); // NOI18N
        BotaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoExcluirActionPerformed(evt);
            }
        });
        Camadas.add(BotaoExcluir);
        BotaoExcluir.setBounds(460, 0, 50, 50);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGEM/lupa.png"))); // NOI18N
        Camadas.add(jButton1);
        jButton1.setBounds(150, 0, 50, 50);

        Lfiltro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lfiltro.setText("Filtro:");
        Camadas.add(Lfiltro);
        Lfiltro.setBounds(20, 380, 40, 30);

        email.setBorder(null);
        email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFocusGained(evt);
            }
        });
        Camadas.add(email);
        email.setBounds(60, 180, 410, 20);

        nome.setBorder(null);
        nome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nomeFocusGained(evt);
            }
        });
        Camadas.add(nome);
        nome.setBounds(50, 90, 460, 20);

        morada.setBorder(null);
        morada.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                moradaFocusGained(evt);
            }
        });
        Camadas.add(morada);
        morada.setBounds(70, 120, 430, 20);

        PesquisaNome.setBorder(null);
        PesquisaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisaNomeActionPerformed(evt);
            }
        });
        PesquisaNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PesquisaNomeKeyReleased(evt);
            }
        });
        Camadas.add(PesquisaNome);
        PesquisaNome.setBounds(210, 20, 130, 20);

        freguesia.setBorder(null);
        freguesia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                freguesiaFocusGained(evt);
            }
        });
        Camadas.add(freguesia);
        freguesia.setBounds(80, 150, 210, 20);

        TabelaContacto.setAutoCreateRowSorter(true);
        TabelaContacto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        TabelaContacto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "Telefone", "E-mail"
            }
        ));
        TabelaContacto.setGridColor(new java.awt.Color(0, 0, 0));
        TabelaContacto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaContactoMouseClicked(evt);
            }
        });
        jScrollPaneTabela.setViewportView(TabelaContacto);

        Camadas.add(jScrollPaneTabela);
        jScrollPaneTabela.setBounds(10, 420, 500, 90);

        adicionais.setColumns(20);
        adicionais.setRows(5);
        adicionais.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                adicionaisFocusGained(evt);
            }
        });
        jScrollPaneinformacoesadicionais.setViewportView(adicionais);

        Camadas.add(jScrollPaneinformacoesadicionais);
        jScrollPaneinformacoesadicionais.setBounds(10, 280, 500, 76);

        Lnome.setText("Nome:");
        Camadas.add(Lnome);
        Lnome.setBounds(10, 90, 40, 20);

        Lservico.setText("Morada:");
        Camadas.add(Lservico);
        Lservico.setBounds(10, 120, 50, 20);

        Ldata.setText("Telefone:");
        Camadas.add(Ldata);
        Ldata.setBounds(10, 210, 60, 20);

        Lemail.setText("E-mail:");
        Camadas.add(Lemail);
        Lemail.setBounds(10, 180, 40, 20);

        telefone.setBorder(null);
        telefone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                telefoneFocusGained(evt);
            }
        });
        telefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                telefoneKeyReleased(evt);
            }
        });
        Camadas.add(telefone);
        telefone.setBounds(70, 210, 120, 20);

        Lfreguesia.setText("Freguesia:");
        Camadas.add(Lfreguesia);
        Lfreguesia.setBounds(10, 150, 60, 20);

        Lcodigopostal.setText("Codigo postal:");
        Camadas.add(Lcodigopostal);
        Lcodigopostal.setBounds(310, 150, 80, 20);
        Camadas.add(jSeparator1);
        jSeparator1.setBounds(10, 80, 500, 10);
        Camadas.add(jSeparator2);
        jSeparator2.setBounds(10, 110, 500, 10);
        Camadas.add(jSeparator3);
        jSeparator3.setBounds(10, 140, 500, 10);
        Camadas.add(jSeparator4);
        jSeparator4.setBounds(10, 170, 500, 10);
        Camadas.add(jSeparator5);
        jSeparator5.setBounds(10, 200, 500, 10);
        Camadas.add(jSeparator6);
        jSeparator6.setBounds(200, 40, 170, 10);
        Camadas.add(jSeparator7);
        jSeparator7.setBounds(10, 270, 500, 10);
        Camadas.add(jSeparator8);
        jSeparator8.setBounds(10, 230, 180, 10);

        Linfo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Linfo.setText("Registo do cliente");
        Camadas.add(Linfo);
        Linfo.setBounds(10, 60, 150, 20);

        Linfo1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Linfo1.setText("Informações adicionais");
        Camadas.add(Linfo1);
        Linfo1.setBounds(180, 250, 150, 20);

        Filtro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FiltroKeyReleased(evt);
            }
        });
        Camadas.add(Filtro);
        Filtro.setBounds(60, 380, 450, 30);

        Cod.setText("Cod");
        Camadas.add(Cod);
        Cod.setBounds(479, 180, 30, 14);

        BotaoMaisouMenos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGEM/tabela.png"))); // NOI18N
        BotaoMaisouMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoMaisouMenosActionPerformed(evt);
            }
        });
        Camadas.add(BotaoMaisouMenos);
        BotaoMaisouMenos.setBounds(470, 240, 40, 30);

        codigo_postal.setBorder(null);
        codigo_postal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                codigo_postalFocusGained(evt);
            }
        });
        codigo_postal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                codigo_postalKeyReleased(evt);
            }
        });
        Camadas.add(codigo_postal);
        codigo_postal.setBounds(400, 150, 100, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Camadas, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Camadas, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TabelaContactoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaContactoMouseClicked
        try {
            MOSTRA_CLICK_ECRA();
            grava = 1;
            BotaoSalvar.setToolTipText("Salvar alterações");
            BotaoSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGEM/salvar.png")));

        } catch (Exception err) {
            System.out.println(err);
        }
    }//GEN-LAST:event_TabelaContactoMouseClicked

    private void adicionaisFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_adicionaisFocusGained
//        CamadaCalendario.setVisible(false);
//        jScrollTabela.setVisible(false);
//        ListaHORA.setVisible(false);
//        ListaNOME.setVisible(false);
//        Lista.setVisible(false);
    }//GEN-LAST:event_adicionaisFocusGained

    private void BotaoNovoContactoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoNovoContactoMouseEntered
        
    }//GEN-LAST:event_BotaoNovoContactoMouseEntered

    private void BotaoNovoContactoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoNovoContactoMouseExited
        
    }//GEN-LAST:event_BotaoNovoContactoMouseExited

    private void BotaoNovoContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoNovoContactoActionPerformed
        try {
            BotaoSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGEM/salvar.png")));
            BotaoSalvar.setToolTipText("Salvar contacto");
            grava = 0;
            BotaoExcluir.setVisible(false);
            Limpar();
        } catch (Exception err) {
            System.out.println(err);
        }
    }//GEN-LAST:event_BotaoNovoContactoActionPerformed

    private void BotaoSalvarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoSalvarMouseEntered
        
    }//GEN-LAST:event_BotaoSalvarMouseEntered

    private void BotaoSalvarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoSalvarMouseExited
        
    }//GEN-LAST:event_BotaoSalvarMouseExited

    private void BotaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSalvarActionPerformed
        try {
            if(grava == 0) {
                int cont = nome.getText().length();
                if(cont > 0) {
                    gravar();
                }
            } else {
                Alteracao();
            }
            
        } catch (Exception err) {
            System.out.println(err);
        }
    }//GEN-LAST:event_BotaoSalvarActionPerformed

    private void BotaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoExcluirActionPerformed
    try {
            int opcao = JOptionPane.showConfirmDialog(null, "Deseja excluir?");
            if(opcao == JOptionPane.YES_NO_OPTION) {
                Excluir();
                dispose();
                }
        } catch (Exception err) {
            System.out.println(err);
        } 
        
 
        //       try {
            //           PESQUISAAGENDA.PESQUISANOME();
            //           PESQUISAAGENDA.ECRAPRIN.LEGENDA();
            //           PESQUISAAGENDA.ECRAPRIN.INSERE_COR_CALENDARIO();
            //
            //           dispose();
            //       } catch (Exception err1) {
            //           System.out.println("Erro na atualização na pesquisa de agendamento" + err1);
            //       }

    }//GEN-LAST:event_BotaoExcluirActionPerformed

    private void PesquisaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisaNomeActionPerformed
        try {
            grava = 1;
            ListaNomeEnter = 1;
            PesquisaNome.setText(MODELO.getElementAt(0).toString());
            BotaoSalvar.setToolTipText("Salvar alterações");
            BotaoSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGEM/salvar.png")));
        } catch (Exception err) {
            System.out.println(err);
        }
    }//GEN-LAST:event_PesquisaNomeActionPerformed

    private void PesquisaNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PesquisaNomeKeyReleased
        try {
            int cont = PesquisaNome.getText().length();
            if (cont > 0 & ListaNomeEnter == 0) {
                Pesquisa();
                grava = 1;
                BotaoSalvar.setToolTipText("Salvar alterações");
                BotaoSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGEM/salvar.png")));
            } else {
                Lista.setVisible(false);
                ListaNomeEnter = 0;
            }
        } catch (Exception err) {
            System.out.println(err);
        }
    }//GEN-LAST:event_PesquisaNomeKeyReleased

    private void ListaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ListaKeyReleased
        
    }//GEN-LAST:event_ListaKeyReleased

    private void ListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaMouseClicked
        try {
            MOSTRA_RESULTADO_PESQUISA();
            Lista.setVisible(false);
            Camadas.requestFocus();
            grava = 1;
            PesquisaNome.setText(Lista.getSelectedValue());
            BotaoSalvar.setToolTipText("Salvar alterações");
            BotaoSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGEM/salvar.png")));
        } catch (Exception err) {
            System.out.println(err);
        }
    }//GEN-LAST:event_ListaMouseClicked

    private void BotaoMaisouMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoMaisouMenosActionPerformed
        try {
            if (filtro == 0) {
                filtro = 1;
//                Lfiltro.setBounds(88, 525, 40, 25);
//                Filtro.setBounds(130, 525, 500, 25);
//                jScrollPaneTabela.setBounds(60, 550, 570, 100);
//                jScrollPaneinformacoesadicionais.setBounds(60, 410, 570, 110);
                
                Lfiltro.setVisible(true);
                Filtro.setVisible(true);
                jScrollPaneTabela.setVisible(true);
                PREENCHE_TABELA();
            } else {
                filtro = 0;
//                Lfiltro.setBounds(88, 610, 40, 25);
//                Filtro.setBounds(130, 610, 500, 25);
//                jScrollPaneTabela.setBounds(60, 640, 570, 100);
//                jScrollPaneinformacoesadicionais.setBounds(60, 410, 570, 210);
                
                Lfiltro.setVisible(false);
                Filtro.setVisible(false);
                jScrollPaneTabela.setVisible(false);
            }
        } catch (Exception err) {
            System.out.println(err);
        }
    }//GEN-LAST:event_BotaoMaisouMenosActionPerformed

    private void FiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FiltroKeyReleased
        try{
            PREENCHE_TABELA();
            BotaoSalvar.setToolTipText("Salvar alteraçõs");
            BotaoSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGEM/salvar.png")));
        } catch (Exception err) {
            System.out.println(err);
        }
    }//GEN-LAST:event_FiltroKeyReleased

    private void nomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nomeFocusGained
       Lista.setVisible(false);
    }//GEN-LAST:event_nomeFocusGained

    private void moradaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_moradaFocusGained
       Lista.setVisible(false);
    }//GEN-LAST:event_moradaFocusGained

    private void freguesiaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_freguesiaFocusGained
       Lista.setVisible(false);
    }//GEN-LAST:event_freguesiaFocusGained

    private void emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusGained
        Lista.setVisible(false);
    }//GEN-LAST:event_emailFocusGained

    private void codigo_postalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codigo_postalFocusGained
        Lista.setVisible(false);
    }//GEN-LAST:event_codigo_postalFocusGained

    private void telefoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_telefoneFocusGained
        Lista.setVisible(false);
    }//GEN-LAST:event_telefoneFocusGained

    private void codigo_postalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigo_postalKeyReleased
        FORTEL.FCodigo(codigo_postal.getText());
        codigo_postal.setText(FORTEL.CODIGO);
        
        String cp = codigo_postal.getText();
        cp = cp.replaceAll("\\D*", ""); //nao utiliza outro caractere alem de numeros
        int cont = cp.length();
//        if (cont == 7) {
//            try {
//                correio();
//            } catch (Error e) {
//                JOptionPane.showMessageDialog(null, e);
//            }
//        }
        
        
    }//GEN-LAST:event_codigo_postalKeyReleased

    private void telefoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefoneKeyReleased
        FORTEL.FTelefone(telefone.getText());
        telefone.setText(FORTEL.FONE);
    }//GEN-LAST:event_telefoneKeyReleased


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
            java.util.logging.Logger.getLogger(CONTACTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CONTACTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CONTACTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CONTACTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CONTACTO dialog = new CONTACTO(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoExcluir;
    private javax.swing.JButton BotaoMaisouMenos;
    private javax.swing.JButton BotaoNovoContacto;
    private javax.swing.JButton BotaoSalvar;
    private javax.swing.JLayeredPane Camadas;
    private javax.swing.JLabel Cod;
    private javax.swing.JTextField Filtro;
    private javax.swing.JLabel Lcodigopostal;
    private javax.swing.JLabel Ldata;
    private javax.swing.JLabel Lemail;
    private javax.swing.JLabel Lfiltro;
    private javax.swing.JLabel Lfreguesia;
    private javax.swing.JLabel Linfo;
    private javax.swing.JLabel Linfo1;
    private javax.swing.JList<String> Lista;
    private javax.swing.JLabel Lnome;
    private javax.swing.JLabel Lservico;
    private javax.swing.JTextField PesquisaNome;
    private javax.swing.JTable TabelaContacto;
    private javax.swing.JTextArea adicionais;
    private javax.swing.JTextField codigo_postal;
    private javax.swing.JTextField email;
    private javax.swing.JTextField freguesia;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPaneTabela;
    private javax.swing.JScrollPane jScrollPaneinformacoesadicionais;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField morada;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField telefone;
    // End of variables declaration//GEN-END:variables

 
private PRINCIPAL ECRAPRIN;

public void MostraContacto(PRINCIPAL MostraContacto) {
    this.ECRAPRIN = MostraContacto;
    setVisible(true);
}

private AGENDAMENTO AGENDAMEN;

public void MostraContacto(AGENDAMENTO MostraContacto) {
    this.AGENDAMEN = MostraContacto;
    setVisible(true);
}
    
public void gravar() throws IOException {
        String[] coluna = {"nome", "morada", "freguesia", "codigo_postal", "telefone", "email", "adicionais"};
        String[] valor = {nome.getText(), morada.getText(), freguesia.getText(), codigo_postal.getText(), telefone.getText(), email.getText(),
       adicionais.getText()};
        
        String tabela = "contacto";
        String Mensagem = "Registo concluido";
        GRA_ALT_EXC gravacao = new GRA_ALT_EXC();
        gravacao.GRAVA(coluna, valor, tabela, Mensagem);
        
        PREENCHE_TABELA();
        Limpar();
    }

public void Alteracao() throws IOException {
        try {
            int x = Integer.parseInt(Cod.getText());
            String[] coluna = {"nome", "morada", "freguesia", "codigo_postal", "telefone", "email", "adicionais"};
            String[] valor = {nome.getText(), morada.getText(), freguesia.getText(), codigo_postal.getText(), telefone.getText(), email.getText(),
           adicionais.getText()};

            String tabela = "contacto";
            String condicao = " WHERE cod = " + Cod.getText();
            GRA_ALT_EXC altera = new GRA_ALT_EXC();
            altera.ALTERA(coluna, valor, tabela, condicao);
            PREENCHE_TABELA();

        } catch (Exception err) {
                System.out.println(err);
        }
}

public void Excluir() throws IOException {
        try {
            int x = Integer.parseInt(Cod.getText());
            String tabela = "contacto";
            String condicao = " WHERE cod = " + Cod.getText();
            GRA_ALT_EXC exclui = new GRA_ALT_EXC();
            exclui.EXCLUIR(tabela, condicao);
            Limpar();
        } catch (Exception err) {
            System.out.println(err);
        }
}
    
public void Limpar() {
        nome.setText("");
        morada.setText(""); 
        freguesia.setText("");
        codigo_postal.setText(""); 
        telefone.setText(""); 
        email.setText("");
        adicionais.setText("");
    }

public void PREENCHE_TABELA() {
    CONEXAO.executaSQL("select * from contacto where nome like'" + Filtro.getText() + "%' order by nome");
    TabelaContacto.getColumnModel().getColumn(0).setPreferredWidth(400);
    TabelaContacto.getColumnModel().getColumn(1).setPreferredWidth(200);
    TabelaContacto.getColumnModel().getColumn(2).setPreferredWidth(200);
    
    DefaultTableModel modelo = (DefaultTableModel) TabelaContacto.getModel();
    modelo.setNumRows(0);
    
    try {
        while (CONEXAO.resultset.next()) {
            modelo.addRow(new Object[]{CONEXAO.resultset.getString("nome"),
                        CONEXAO.resultset.getString("telefone"),
                        CONEXAO.resultset.getString("email"),
                        });
        }
    } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "Erro");
    }
}

public void MOSTRA_CLICK_ECRA() {
    try {
        int Linha = TabelaContacto.getSelectedRow();
        if (Linha >= 0) {
            CONEXAO.executaSQL("select * from contacto where nome like'"
                    + Filtro.getText() + "%' order by nome LIMIT " + Linha + " , 1 ");
        }
        ResultadoPesquisa();
    } catch (Exception err) {
        System.out.println(err);
    }
}

public void ResultadoPesquisa() {
    try {
        CONEXAO.resultset.first();
        Cod.setText(CONEXAO.resultset.getString("cod"));
        nome.setText(CONEXAO.resultset.getString("nome"));
        morada.setText(CONEXAO.resultset.getString("morada"));
        freguesia.setText(CONEXAO.resultset.getString("freguesia"));
        codigo_postal.setText(CONEXAO.resultset.getString("codigo_postal"));
        telefone.setText(CONEXAO.resultset.getString("telefone"));
        email.setText(CONEXAO.resultset.getString("email"));
        adicionais.setText(CONEXAO.resultset.getString("adicionais"));
        BotaoExcluir.setVisible(true);
        
    } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "Erro");
    } catch (Exception err) {
        System.out.println(err);
    }
}

public void Pesquisa() {
        try {
            CONEXAO.executaSQL("select * from contacto where nome like'" + PesquisaNome.getText() + " %' order by nome ");
            int x = 0;
            MODELO.removeAllElements();
            CodigoVetor = new String[4];
            while (CONEXAO.resultset.next() && x < 4) {
                MODELO.addElement(CONEXAO.resultset.getString("nome"));
                CodigoVetor[x] = CONEXAO.resultset.getString("cod");
                x++;
            }
            ResultadoPesquisa();
            if (x > 0) {
                Lista.setVisible(true);
            } else {
                Lista.setVisible(false);
            }
            
            CONEXAO.resultset.first();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro");
        } catch (Exception err) {
            System.out.println(err);
        }
    }

public void MOSTRA_RESULTADO_PESQUISA() {
    try {
        int Linha = Lista.getSelectedIndex();
        if (Linha >= 1) {
            CONEXAO.executaSQL("select * from contacto where cod = " + CodigoVetor[Linha] + "");
        }
        ResultadoPesquisa();
    } catch (Exception err) {
        System.out.println(err);
    }
}

}
