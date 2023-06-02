/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTILIDA;

/**
 *
 * @author Andrezza
 */
public class SomaVetores {

    public static void main(String[] args) {
        new SomaVetores().SomaVetores();
    }
    
        String[] coluna = {"C1", "C2", "C3"};
        String[] valor = {"V1", "V2", "V3"};
        String VALORES = "", VIRGULA = "";
    
    public void SomaVetores() {
        for(int i=0; i<coluna.length; i++) {
            VALORES = VALORES + VIRGULA + coluna[i] + "'"+valor[i]+"'";
            if("".equals(VIRGULA)) {
                VIRGULA = ",";
            }
        }
        System.out.println(VALORES);
    }    
}
