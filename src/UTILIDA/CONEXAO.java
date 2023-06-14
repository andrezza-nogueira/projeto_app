/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTILIDA;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.sql.*;


/**
 *
 * @author Andrezza
 */
public class CONEXAO {
    
        String SERVIDOR = "";
        String PORTA_CONEXAO = "";
        String UTIL = "";
        String PASS = "";
        String ARQUIVOLIDO;
        int VERIFICALINHA=0;
    
//        final private String utili = "root";
//        final private String pass = "";    
//        final private String url = "jdbc:mysql://localhost:3306/agendamento"; //servidor de utilizaçao
        final private String driver = "com.mysql.cj.jdbc.Driver";

        private Connection CONEXAO;
        public Statement statement;
        public ResultSet resultset;
        

        public void conecta() {
            
            MostraArquivoLido();
            try {
                Class.forName(driver);

            CONEXAO = DriverManager.getConnection("jdbc:mysql://"+SERVIDOR+":"+PORTA_CONEXAO+"/agendamento",UTIL,PASS);
            
            } catch (ClassNotFoundException Fonte) {
                JOptionPane.showMessageDialog(null, "Driver not found");
            } catch (SQLException Fonte) {
                JOptionPane.showMessageDialog(null, "Error connecting to SQL server", "Attention", (2));
                Fonte.printStackTrace();
            }
        }

        public void desconecta() throws IOException {
            try {
                CONEXAO.close();
            } catch (SQLException fech) {
                JOptionPane.showMessageDialog(null, "Error when closing database connection" + fech);
            }
        }

        public void executaSQL(String sql) {
            try {
                System.out.println(sql); // Adicione esta linha para imprimir a consulta SQL
                statement = CONEXAO.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
                resultset = statement.executeQuery(sql);
            } catch (SQLException sqlex) {
                JOptionPane.showMessageDialog(null, "Erro: Não foi possível executar o comando SQL" + sqlex + "Comando executado: " + sql);
            }
        }
        

        
public void MostraArquivoLido(){
    try{
        String ArqSERV = "PergAminho.ini";
        
        int v = 0;
        while(v < 4){
            if(v==0){
                VERIFICALINHA = 1;
                String Local = "C:/Pasta/PergAminho/" + ArqSERV;
                LeArqSalvo(Local);
                SERVIDOR = ARQUIVOLIDO;
                
            }
            if(v==1){
                VERIFICALINHA = 2;
                String Local = "C:/Pasta/PergAminho/" + ArqSERV;
                LeArqSalvo(Local);
                PORTA_CONEXAO = ARQUIVOLIDO;
                
            }
            if(v==2){
                VERIFICALINHA = 3;
                String Local = "C:/Pasta/PergAminho/" + ArqSERV;
                LeArqSalvo(Local);
                UTIL = ARQUIVOLIDO;
                
            }
            if(v==3){
                VERIFICALINHA = 4;
                String Local = "C:/Pasta/PergAminho/" + ArqSERV;
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
            JOptionPane.showMessageDialog(null, "Arquivo nao localizado");
        }
    }
   
}


