package UTILIDA;

import javax.swing.JOptionPane;

/**
 *
 * @author Andrezza
 */
public class FormataDados {
    
    public String FONE;
    public String CODIGO;
    
  public void FTelefone(String fone) {
    try {
        String TELEFONE = fone.trim(); // Remove espaços em branco do início e do fim
        String formata = "";

        if (TELEFONE.length() == 9) {
            formata = TELEFONE.substring(0, 3) + " " + TELEFONE.substring(3, 6) + " " + TELEFONE.substring(6, 9);
        } else {
            formata = TELEFONE;
        }
        
        FONE = formata;
    } catch (Exception erro) {
        JOptionPane.showMessageDialog(null, erro);
    }
}
   
   public void FCodigo(String codigo) {
       try {
            String CP = codigo;
            String formata1 = "";
            int cont = CP.length();

            if(cont == 4) {
                formata1 = CP + "-";
            } else {
                formata1 = CP;
            }

            if (cont >= 8) {
                formata1 = CP.substring(0, 8);
            } 
            CODIGO = formata1;
     
        } catch (Exception erro) {
    
        }
    }
}