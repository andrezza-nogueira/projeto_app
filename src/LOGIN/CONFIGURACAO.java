package LOGIN;

import UTILIDA.CLIBANCO;
import UTILIDA.CLICPTGRAFABANCO;
import java.io.*;
import java.util.TimerTask;
import javax.swing.JOptionPane;
import java.util.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

/**
 *
 * @author Andrezza
 */
public class CONFIGURACAO extends javax.swing.JDialog {
    String SERVIDOR = "";
    String PORTA_CONEXAO = "";
    String UTIL = "";
    String PASS = "";
    String ARQUIVOLIDO;
    int VERIFICALINHA=0;
    
    String DRIVER = "com.mysql.cj.jdbc.Driver";
    String URL = "jdbc:mysql://";
    Connection CONEXAO;
    Statement STATEMENT;
    int CONFIG = 0;
    
    /**
     * Creates new form CONFIGURACAO
     */
    public CONFIGURACAO(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        MostraArquivoLido();
        BotaoSalvar.setEnabled(false);
//        setIconImage(getIconImage());
        }
        
        
//        public final Image getIconImage() {
//        Image ICONE = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("IMAGE/logoprog"));
//        return ICONE;     
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelUtilizador = new javax.swing.JPanel();
        PortaConexao = new javax.swing.JTextField();
        BotaoSalvar = new javax.swing.JButton();
        BotaoTeste = new javax.swing.JButton();
        Progresso = new javax.swing.JLabel();
        Pass = new javax.swing.JPasswordField();
        Util = new javax.swing.JTextField();
        Servidor = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        PainelUtilizador.setBackground(new java.awt.Color(255, 255, 255));

        PortaConexao.setText("3306");
        PortaConexao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PortaConexaoActionPerformed(evt);
            }
        });

        BotaoSalvar.setText("Salvar conexão");
        BotaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSalvarActionPerformed(evt);
            }
        });

        BotaoTeste.setText("Testar conexão ");
        BotaoTeste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoTesteActionPerformed(evt);
            }
        });

        Progresso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGEM/processo.gif"))); // NOI18N

        Util.setText("root");
        Util.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UtilActionPerformed(evt);
            }
        });

        Servidor.setText("localhost");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um Servidor" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Porta:");

        jLabel2.setText("Host:");

        jLabel3.setText("Password:");

        jLabel4.setText("Utilizador:");

        jLabel5.setText("Local:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Configure conexão com o servidor MYSQL");

        javax.swing.GroupLayout PainelUtilizadorLayout = new javax.swing.GroupLayout(PainelUtilizador);
        PainelUtilizador.setLayout(PainelUtilizadorLayout);
        PainelUtilizadorLayout.setHorizontalGroup(
            PainelUtilizadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelUtilizadorLayout.createSequentialGroup()
                .addGroup(PainelUtilizadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelUtilizadorLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelUtilizadorLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelUtilizadorLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelUtilizadorLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Servidor, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(PortaConexao, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelUtilizadorLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(PainelUtilizadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoTeste, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Progresso, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelUtilizadorLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(PainelUtilizadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelUtilizadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Util, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                            .addComponent(Pass))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        PainelUtilizadorLayout.setVerticalGroup(
            PainelUtilizadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelUtilizadorLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(PainelUtilizadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(PainelUtilizadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Servidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PortaConexao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(PainelUtilizadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Util, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(PainelUtilizadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(PainelUtilizadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelUtilizadorLayout.createSequentialGroup()
                        .addComponent(BotaoTeste, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Progresso, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelUtilizador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelUtilizador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        Servidor.setText("localhost");
        PortaConexao.setText("3306");
        Util.setText("root");
        Pass.setText("");
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void UtilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UtilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UtilActionPerformed

    private void BotaoTesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoTesteActionPerformed
        Progresso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGEM/processo.gif")));
        TarefaConexao();
        BotaoTeste.setEnabled(false);
    }//GEN-LAST:event_BotaoTesteActionPerformed

    private void PortaConexaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PortaConexaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PortaConexaoActionPerformed

    private void BotaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSalvarActionPerformed
        SalvaConfiguracao();
        dispose();
        
        CLIBANCO criabanco = new CLIBANCO();
        
        try {
            criabanco.CliBanco();
        } catch (SQLException ex) {
            Logger.getLogger(CONFIGURACAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       


    }//GEN-LAST:event_BotaoSalvarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        System.exit(0);
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(CONFIGURACAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CONFIGURACAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CONFIGURACAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CONFIGURACAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CONFIGURACAO dialog = new CONFIGURACAO(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton BotaoSalvar;
    private javax.swing.JButton BotaoTeste;
    private javax.swing.JPanel PainelUtilizador;
    private javax.swing.JPasswordField Pass;
    private javax.swing.JTextField PortaConexao;
    private javax.swing.JLabel Progresso;
    private javax.swing.JTextField Servidor;
    private javax.swing.JTextField Util;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables

public void SalvaConfiguracao(){
        SERVIDOR = String.valueOf(Servidor.getText());
        PORTA_CONEXAO = String.valueOf(PortaConexao.getText());
        UTIL = String.valueOf(Util.getText());
        PASS = String.valueOf(Pass.getPassword());
        
        CLICPTGRAFABANCO Clip = new CLICPTGRAFABANCO();
        Clip.IniciaCliptografia(PASS);
        PASS = Clip.PassCriptografada;
        
        GravaArquivo();
    }
    
public void GravaArquivo(){
    try{
            File diretorio = new File("C:/ProgramData/PergAminho");
            if (!diretorio.exists()) {
                diretorio.mkdirs();
            } else {  
            }
            
            FileWriter arq1 = new FileWriter("C:/ProgramData/PergAminho/PergAminho.ini");
            PrintWriter gravaArq1 = new PrintWriter(arq1);
            gravaArq1.println(SERVIDOR);
            gravaArq1.println(PORTA_CONEXAO);
            gravaArq1.println(UTIL);
            gravaArq1.println(PASS);
            arq1.close();
            
        } catch(IOException erro) {
            JOptionPane.showMessageDialog(null, "Nao tens permissao de adm para configurar o sistema.", "erro !", 0);
            System.out.println(erro);
        }
    }

public void MostraArquivoLido(){
    try{
        String ArqSERV = "PergAminho.ini";
        
        int v = 0;
        while(v < 4){
            if(v==0){
                VERIFICALINHA = 1;
                String Local = "C:/ProgramData/PergAminho/" + ArqSERV;
                LeArqSalvo(Local);
                SERVIDOR = ARQUIVOLIDO;
                Servidor.setText(SERVIDOR);
            }
            if(v==1){
                VERIFICALINHA = 2;
                String Local = "C:/ProgramData/PergAminho/" + ArqSERV;
                LeArqSalvo(Local);
                PORTA_CONEXAO = ARQUIVOLIDO;
                PortaConexao.setText(PORTA_CONEXAO);
            }
            if(v==2){
                VERIFICALINHA = 3;
                String Local = "C:/ProgramData/PergAminho/" + ArqSERV;
                LeArqSalvo(Local);
                UTIL = ARQUIVOLIDO;
                Util.setText(UTIL);
            }
            if(v==3){
                VERIFICALINHA = 4;
                String Local = "C:/ProgramData/PergAminho/" + ArqSERV;
                LeArqSalvo(Local);
                PASS = ARQUIVOLIDO;
            
                CLICPTGRAFABANCO Clip = new CLICPTGRAFABANCO();
                Clip.IniciaCliptografia(PASS);
                PASS = Clip.PassCriptografada;
                Pass.setText(PASS);
                }
            v++;
        }
    } catch(Exception erro){
        System.out.println(erro);
        }
   } 

public void LeArqSalvo(String nomeArq){
        String linha = "";
        int cont = 0;
        File arq = new File(nomeArq);
        if(arq.exists()){
            try{
                FileReader reader = new FileReader(nomeArq);
                BufferedReader leitor = new BufferedReader(reader);
                while(true){
                    linha = leitor.readLine();
                    if(cont == VERIFICALINHA){
                        break;
                    }
                    System.out.println(linha + "\n");
                    ARQUIVOLIDO = linha;
                    cont++;
                }
            } catch(Exception erro){
                System.out.println(erro);
            }
        }
    }

public void TestaConexao(){
        try{
            BotaoSalvar.setEnabled(false);
            String PassH = String.valueOf(Pass.getPassword());
            try{
                Class.forName(DRIVER);
                CONEXAO = (Connection) DriverManager.getConnection(URL + Servidor.getText() + ":" + PortaConexao.getText(), Util.getText(), PassH);
                Progresso.setIcon(null);
                JOptionPane.showMessageDialog(null, "Teste concluido");
                BotaoSalvar.setEnabled(true);
                BotaoTeste.setEnabled(true);
            } catch (SQLException ex){
                Progresso.setIcon(null);
                JOptionPane.showMessageDialog(null, "Falha na conexao", "Atençao", (2));
                BotaoSalvar.setEnabled(false);
                BotaoTeste.setEnabled(true);
            } catch (ClassNotFoundException ex){
                Progresso.setIcon(null);
                JOptionPane.showMessageDialog(null, "Driver nao localizado");
                BotaoSalvar.setEnabled(false);
                BotaoTeste.setEnabled(true);
        }
            CONEXAO.close();
    } catch(SQLException ex){
        
    }
    
    }

private void TarefaConexao(){
    Timer timer = null;
    if (timer == null){
        timer = new Timer();
        TimerTask tarefa = new TimerTask(){
            public void run(){
                TestaConexao();
                cancel();
            }
        };
        timer.scheduleAtFixedRate(tarefa, 10, 1000);
        }
    }

}