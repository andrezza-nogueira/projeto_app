package UTILIDA;

import LOGIN.CONFIGURACAO;
import LOGIN.LOGIN;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.sql.*;



/**
 *
 * @author Andrezza
 */
public class CLIBANCO {
    final private String DRIVER = "com.mysql.cj.jdbc.Driver";
    final private String URL = "jdbc:mysql://";
    private String SERVIDOR = "";
    private String PORTA_CONEXAO = "";
    private String UTIL = "";
    private String PASS = "";
    String ARQUIVOLIDO;
    Connection CONEXAO;
    public Statement STATEMENT;        
    public ResultSet RESULTSETE;
    int VERIFICALINHA;
    public int ERRO = 0;
        
        public static void main(String[] args) throws SQLException {

            new CLIBANCO().CliBanco();
 }
public void CliBanco() throws SQLException{
        MostraArquivoLido();
        ERRO = 0;
        try{
            
            Class.forName(DRIVER);
            CONEXAO = DriverManager.getConnection(URL + SERVIDOR + ":" + PORTA_CONEXAO, UTIL, PASS);
      
        } catch(SQLException ex) {
            ERRO = 1;
            CONFIGURACAO dialog = new CONFIGURACAO(new javax.swing.JFrame(),true);
            dialog.setVisible(true);
        } catch (ClassNotFoundException ex){
          Logger.getLogger(CLIBANCO.class.getName()).log(Level.SEVERE, null, ex);
          JOptionPane.showMessageDialog(null, "Driver nao localizado");
 
        }
        try {
            STATEMENT = CONEXAO.createStatement();
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro na conexao");
            ERRO = 1;
        } catch(Exception erro) {
            System.out.println(erro);
        }
        
        try{
            
            
            STATEMENT.executeUpdate("CREATE DATABASE IF NOT EXISTS agendamento");
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no comando SQL");
            ERRO = 1;
        }
        try{
            STATEMENT.executeUpdate("CREATE TABLE IF NOT EXISTS `agendamento`.`agenda` ("
                                    + " `cod` INT( 11 ) NOT NULL AUTO_INCREMENT , "
                                    + " `nome` VARCHAR( 200 ) NOT NULL , "
                                    + " `servico` VARCHAR( 200 ) NOT NULL , "
                                    + " `observacao` TEXT NOT NULL , "       
                                    + " `dia` INT( 2 ) NOT NULL , "
                                    + " `mes` INT( 2 ) NOT NULL , "
                                    + " `ano` INT( 4 ) NOT NULL , "
                                    + " `hora` VARCHAR( 5 ) NOT NULL , "
                                    + " PRIMARY KEY ( `cod` ) "
                                    + " ) ENGINE = MYISAM ; ");     
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro");
            ERRO = 1;
        }
        try{
            STATEMENT.executeUpdate("CREATE TABLE IF NOT EXISTS `agendamento`.`servico` ("
                                    + " `cod` INT ( 11 ) NOT NULL AUTO_INCREMENT , "
                                    + " `nomeservico` VARCHAR(200) NOT NULL , "
                                    + " `valor` DOUBLE( 10,2 ) NOT NULL , "
                                    + " PRIMARY KEY ( `cod` ) "
                                    + " ) ENGINE = MYISAM ; ");     
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro");
            ERRO = 1;
        }
        try{
            STATEMENT.executeUpdate("CREATE TABLE IF NOT EXISTS `agendamento`.`configuracao` ("
                                    + " `cod` INT ( 11 ) NOT NULL AUTO_INCREMENT , "
                                    + " `limiteagendamento` int ( 11 ) NOT NULL , "
                                    + " PRIMARY KEY ( `cod` ) "
                                    + " ) ENGINE = MYISAM ; ");     
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro");
            ERRO = 1;
        }
        try{
            STATEMENT.executeUpdate("CREATE TABLE IF NOT EXISTS `agendamento`.`contacto` ("
                                    + " `cod` INT( 11 ) NOT NULL AUTO_INCREMENT , "
                                    + " `nome` VARCHAR( 200 ) NOT NULL , "
                                    + " `morada` VARCHAR( 200 ) NOT NULL , "
                                    + " `freguesia` VARCHAR( 20 ) NOT NULL , "       
                                    + " `codigo_postal` VARCHAR( 8 ) NOT NULL , "
                                    + " `telefone` VARCHAR( 12 ) NOT NULL , "
                                    + " `email` VARCHAR( 20 ) NOT NULL , "
                                    + " `adicionais` TEXT NOT NULL , "
                                    + " PRIMARY KEY ( `cod` ) "
                                    + " ) ENGINE = MYISAM ; ");     
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro");
            ERRO = 1;
        }
        try{
            STATEMENT.executeUpdate("CREATE TABLE IF NOT EXISTS `agendamento`.`login` ("
                                    + " `cod` INT ( 11 ) NOT NULL AUTO_INCREMENT , "
                                    + " `login` VARCHAR ( 50 ) NOT NULL , "
                                    + " `pass` VARCHAR ( 50 ) NOT NULL , "
                                    + " PRIMARY KEY ( `cod` ), "
                                    + " UNIQUE (`login`) "
                                    + " ) ENGINE = MYISAM ; ");     
        } catch(SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro");
            ERRO = 1;
        }
        
        try{
            String TOTALLOGIN = "";
            STATEMENT = CONEXAO.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            RESULTSETE = STATEMENT.executeQuery(" SELECT Count(cod)as Total FROM `agendamento`.`login`");
            RESULTSETE.first();
            TOTALLOGIN = RESULTSETE.getString("Total");
            
            if(TOTALLOGIN.equals("0")){
                STATEMENT.executeUpdate(
                    " INSERT INTO `agendamento`.`login` ( "   
                    + " `login`, "
                    + " `pass`  "
                    + " ) "       
                    + " VALUES ( "       
                    + " 'SMART' "      
                    + " );");

                } 
            } catch(SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro..........");
                ERRO = 1;
            }    
            try{
            String TOTALCODIGO = "";
            STATEMENT = CONEXAO.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            RESULTSETE = STATEMENT.executeQuery(" SELECT Count(cod)as Total FROM `agendamento`.`configuracao`");
            RESULTSETE.first();
            TOTALCODIGO = RESULTSETE.getString("Total");
            
            if(TOTALCODIGO.equals("0")){
                STATEMENT.executeUpdate(
                     " INSERT INTO `agendamento`.`configuracao` ( "   
                    + " `limiteagendamento` "                    
                    + " ) "       
                    + " VALUES ( "       
                    + " '10' "                    
                    + " );");
                }  if (ERRO == 0){
                    JOptionPane.showMessageDialog(null, "Configuraçao Concluida","Operaçao Concluida",(1));
                    }
                
                }   catch(SQLException ex) {
                    ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro");
                ERRO = 1;          
            } 

            if(ERRO == 0){
                Desconecta();
            new LOGIN().setVisible(true);
                }if(ERRO == 1){
                try{
                    JOptionPane.showMessageDialog(null, "Nao é possivel concluir.\n\n"
                                                + "CAUSAS POSSIVEIS: \n"
                                                + "Utilizador nao tem privilegios"
                                                + "Utilizador nao tem permissao para ceder o servidor"
                                                + "O servidor especificado pode nao ser um servidor MSQL","ATENÇAO",(2));
                    Desconecta();
                    CONFIGURACAO dialog = new CONFIGURACAO(new javax.swing.JFrame(),true);
                    dialog.setVisible(true);
                    
                } catch(Exception erro){
                    System.out.println(erro);
                }
        } 
    }
public void Desconecta(){
        try{
              CONEXAO.close();
//              JOptionPane.showMessageDialog(null, "CONEXAO FECHADA");
            } catch(SQLException fech){
                JOptionPane.showMessageDialog(null, "ERRO" + fech);
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
            }
            if(v==1){
                VERIFICALINHA = 2;
                String Local = "C:/ProgramData/PergAminho/" + ArqSERV;
                LeArqSalvo(Local);
                PORTA_CONEXAO = ARQUIVOLIDO;
            }
            if(v==2){
                VERIFICALINHA = 3;
                String Local = "C:/ProgramData/PergAminho/" + ArqSERV;
                LeArqSalvo(Local);
                UTIL = ARQUIVOLIDO ;
            }
            if(v==3){
                VERIFICALINHA = 4;
                String Local = "C:/ProgramData/PergAminho/" + ArqSERV;
                LeArqSalvo(Local);
                PASS = ARQUIVOLIDO;
            
                CLICPTGRAFABANCO Clip = new CLICPTGRAFABANCO();
                Clip.IniciaCliptografia(PASS);
                PASS = Clip.PassCriptografada;
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
                erro.printStackTrace();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Arquivo nao localizado aqui");
        }
    }
}