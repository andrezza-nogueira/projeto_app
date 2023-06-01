package UTILIDA;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
        
/**
 *
 * @author Andrezza p/ Smart Level
 */
public class GRA_ALT_EXC { //declarar em forma de vetor os valores do banco de dados
    CONEXAO CONEXAO_BANCO = new CONEXAO();
    
    public void GRAVA(String[] coluna, String[] valor, String tabela, String Mensagem) {
        CONEXAO_BANCO.conecta();
        String COLUNA = "", VALUE = "", VIRGULA = "";
        for (String Col : coluna) {
            COLUNA = COLUNA + VIRGULA + Col;
            if (VIRGULA.equals("")) {
                VIRGULA = ",";
        }
    }
    
    VIRGULA = "";
    for (String Val : valor) {
        VALUE = VALUE + VIRGULA + "'" + Val + "'";
        if (VIRGULA.equals("")) {
            VIRGULA = ",";
        }
    }
    
    try {
        CONEXAO_BANCO.executaSQL("select * from" + tabela + " ");
        String SQL = "insert into " + tabela + " " + "(" + COLUNA + ") values" + "(" + VALUE + ")";
        CONEXAO_BANCO.statement.executeUpdate(SQL);
        Icon figura = (new ImageIcon(getClass().getResource("")));
        JOptionPane.showMessageDialog(null, Mensagem, "Concluded", JOptionPane.PLAIN_MESSAGE, figura);
        
    } catch (SQLException erro) {
        JOptionPane.showInternalMessageDialog(null, "Recording Error" + erro);
    } catch (Exception e) {
    }
    
    CONEXAO_BANCO.desconecta();
            
} 
    
// ***************************************ALTERAÇAO***********************************************************************
    
    
    
 public void ALTERA (String[] coluna, String[] valor, String tabela, String condicao) {
     CONEXAO_BANCO.conecta();
     
     String VALORES = "", VIRGULA = "";
     for (int i=0; i<coluna.length; i++) {
         VALORES = VALORES + VIRGULA + coluna[i] + " = '" + valor[i] + "'";
         if(VIRGULA.equals("")) {
             VIRGULA = ",";
         }
     }
     try {
         CONEXAO_BANCO.executaSQL("select + from " + tabela + " ");
         String SQL = "UPDATE " + tabela + " SET " + VALORES + " " + condicao;
         CONEXAO_BANCO.statement.executeUpdate(SQL);
         Icon figura = (new ImageIcon(getClass().getResource("")));
         JOptionPane.showMessageDialog(null, "Changed", "Concluded", JOptionPane.PLAIN_MESSAGE, figura);
         
     } catch (SQLException erro) {
         JOptionPane.showMessageDialog(null, "Change error" + erro);
     } catch (Exception e) {

     }
     CONEXAO_BANCO.desconecta();
     
    }   

 // ***************************************EXCLUIR***********************************************************************
     
    public void EXCLUIR(String tabela, String condicao) {
        CONEXAO_BANCO.conecta();
        try {
            CONEXAO_BANCO.executaSQL("SELECT * FROM " + tabela + " ");
            String SQLDELETA = "DELETE FROM " + tabela + " " + condicao + "";
            CONEXAO_BANCO.statement.executeUpdate(SQLDELETA);
            Icon figura = (new ImageIcon(getClass().getResource("")));
            JOptionPane.showMessageDialog(null, "Excluded", "Concluded", JOptionPane.PLAIN_MESSAGE, figura);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error deleting" + ex);
        }
        CONEXAO_BANCO.desconecta();
}
          
       
    
    
//    String COLUNA = "", VIRGUL = "";
//    
//    public static void main(String[] args) {
//        new GRA_ALT_EXC().listacoluna();
//    }
//    public void listacoluna() {
//        String coluna[] = {"c1", "c2", "c3"};
//        for(String C : coluna) {
//            COLUNA = COLUNA + VIRGUL + C;
//            if(VIRGUL.equals("")) {
//                VIRGUL = ",";
//            }
//        }
//        
//       

}
