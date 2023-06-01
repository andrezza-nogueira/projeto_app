/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTILIDA;

import com.mysql.cj.xdevapi.Statement;
import com.sun.jdi.connect.spi.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author Andrezza
 */
public class CONEXAO {
    
    final private String url = ""; //servidor de utilizaçao
    final private String driver = "com.mysql.jdbc.Driver";
    final private String utili = "";
    final private String pass = "";
    private Connection conexao;
    public Statement statement;
    public ResultSet resultset;
    
    public void conecta() {
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, utili, pass);  
        } catch (ClassNotFoundException Fonte) {
            JOptionPane.showMessageDialog(null, "Driver not found");
        } catch (SQLException Fonte) {
            JOptionPane.showMessageDialog(null, "Error connecting to SQL server", "Attention", (2));
        }
    }
    
    public void desconecta() {
        try {
            conexao.close();
        } catch (SQLException fech) {
            JOptionPane.showMessageDialog(null, "Error when closing database connection" + fech);
        }
    }
    
    public void executaSQL(String sql) {
        try {
            statement = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            resultset = statement.executeQuery(sql);
        } catch (SQLException sqlex) {
            JOptionPane.showMessageDialog(null, "Error: It was not possible to execute the SQL command" + "" + sqlex + "The command entered was: " + sql);
        }
    }
}
 