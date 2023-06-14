package UTILIDA;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author Andrezza
 */
public class CLICPTGRAFABANCO {
    String let = "", lets = "", Sort = "", Modo = "P";
    String BancoLetras = "67890;:!@#$%&*()}/-+?{MNOPQRSTUVWXYZÁÉÍÓÚÃÕÊÔáéíóúâêôãõ";
    int vt1 = 0, vt2 = 1;
    String PosicoesSorteadas;
    String Referencia = "";
    public String PassCriptografada = "";
    
public void IniciaCliptografia(String passnormal) {
    if (passnormal != null) {
        LerArquivoReferenciaSalvo();
        Sort = Referencia;
        
        int cont = passnormal.length();
        int v1v = 0;
        int v2v = 1;
        
        while (v2v <= cont){
            let = passnormal.substring(v1v, v2v);
            CriptografaTexto();
            lets = lets + let;
            PassCriptografada = (lets);
            v1v++;
            v2v++;  
        }
    }
}
    
    private void CriptografaTexto() {
        
        try {
            if (let.equals("a")) {
                let = Sort.substring(0, 1);
            } 
            else if (let.equals("b")) {
                let = Sort.substring(1, 2);
            } 
            else if (let.equals("c")) {
                let = Sort.substring(2, 3);
            }
            else if (let.equals("d")) {
                let = Sort.substring(3, 4);
            }
            else if (let.equals("e")) {
                let = Sort.substring(4, 5);
            }
            else if (let.equals("f")) {
                let = Sort.substring(5, 6);
            }
            else if (let.equals("g")) {
                let = Sort.substring(6, 7);
            }
            else if (let.equals("h")) {
                let = Sort.substring(7, 8);
            }
            else if (let.equals("i")) {
                let = Sort.substring(8, 9);
            }
            else if (let.equals("j")) {
                let = Sort.substring(10, 11);
            }
            else if (let.equals("k")) {
                let = Sort.substring(1, 12);
            }
            else if (let.equals("l")) {
                let = Sort.substring(12, 13);
            }
            else if (let.equals("m")) {
                let = Sort.substring(13, 14);
            }
            else if (let.equals("n")) {
                let = Sort.substring(14, 15);
            }
            else if (let.equals("o")) {
                let = Sort.substring(15, 16);
            }
            else if (let.equals("p")) {
                let = Sort.substring(16, 17);
            }
            else if (let.equals("q")) {
                let = Sort.substring(17, 18);
            }
            else if (let.equals("r")) {
                let = Sort.substring(18, 19);
            }
            else if (let.equals("s")) {
                let = Sort.substring(19, 20);
            }
            else if (let.equals("t")) {
                let = Sort.substring(20, 21);
            }
            else if (let.equals("u")) {
                let = Sort.substring(21, 22);
            }
            else if (let.equals("v")) {
                let = Sort.substring(22, 23);
            }
            else if (let.equals("w")) {
                let = Sort.substring(23, 24);
            }
            else if (let.equals("y")) {
                let = Sort.substring(24, 25);
            } 
            else if (let.equals("z")) {
                let = Sort.substring(25, 26);
            }
            else if (let.equals("A")) {
                let = Sort.substring(26, 27);
            }
            else if (let.equals("B")) {
                let = Sort.substring(27, 28);
            }
            else if (let.equals("C")) {
                let = Sort.substring(28, 29);
            }
            else if (let.equals("D")) {
                let = Sort.substring(29, 30);
            }
            else if (let.equals("E")) {
                let = Sort.substring(30, 31);
            }
            else if (let.equals("F")) {
                let = Sort.substring(31, 32);
            }
            else if (let.equals("G")) {
                let = Sort.substring(32, 33);
            }
            else if (let.equals("H")) {
                let = Sort.substring(33, 34);
            }
            else if (let.equals("I")) {
                let = Sort.substring(34, 35);
            }
            else if (let.equals("J")) {
                let = Sort.substring(35, 36);
            }
            else if (let.equals("K")) {
                let = Sort.substring(36, 37);
            }
            else if (let.equals("L")) {
                let = Sort.substring(37, 38);
            }
            else if (let.equals(" ")) {
                let = Sort.substring(38, 39);
            } 
            else {
                if (let.equals(Sort.substring(0, 1))) {
                    let = "a";
                } 
                else if (let.equals(Sort.substring(1, 2))) {
                    let = "b";
                }
                else if (let.equals(Sort.substring(2, 3))) {
                    let = "c";
                }
                else if (let.equals(Sort.substring(3, 4))) {
                    let = "d";
                }
                else if (let.equals(Sort.substring(4, 5))) {
                    let = "e";
                }
                else if (let.equals(Sort.substring(5, 6))) {
                    let = "f";
                }
                else if (let.equals(Sort.substring(6, 7))) {
                    let = "g";
                }
                else if (let.equals(Sort.substring(7, 8))) {
                    let = "h";
                }
                else if (let.equals(Sort.substring(8, 9))) {
                    let = "i";
                }
                else if (let.equals(Sort.substring(9, 10))) {
                    let = "j";
                }
                else if (let.equals(Sort.substring(10, 11))) {
                    let = "k";
                }
                else if (let.equals(Sort.substring(11, 12))) {
                    let = "l";
                }
                else if (let.equals(Sort.substring(12, 13))) {
                    let = "m";
                }
                else if (let.equals(Sort.substring(13, 14))) {
                    let = "n";
                }
                else if (let.equals(Sort.substring(14, 15))) {
                    let = "o";
                }
                else if (let.equals(Sort.substring(15, 16))) {
                    let = "p";
                }
                else if (let.equals(Sort.substring(16, 17))) {
                    let = "q";
                }
                else if (let.equals(Sort.substring(17, 18))) {
                    let = "r";
                }
                else if (let.equals(Sort.substring(18, 19))) {
                    let = "s";
                }
                else if (let.equals(Sort.substring(19, 20))) {
                    let = "t";
                }
                else if (let.equals(Sort.substring(20, 21))) {
                    let = "u";
                }
                else if (let.equals(Sort.substring(21, 22))) {
                    let = "v";
                }
                else if (let.equals(Sort.substring(22, 23))) {
                    let = "w";
                }
                else if (let.equals(Sort.substring(23, 24))) {
                    let = "x";
                }
                else if (let.equals(Sort.substring(24, 25))) {
                    let = "y";
                }
                else if (let.equals(Sort.substring(25, 26))) {
                    let = "z";
                }
                else if (let.equals(Sort.substring(26, 27))) {
                    let = "A";
                }
                else if (let.equals(Sort.substring(27, 28))) {
                    let = "a";
                }
                else if (let.equals(Sort.substring(28, 29))) {
                    let = "B";
                }
                else if (let.equals(Sort.substring(29, 30))) {
                    let = "C";
                }
                else if (let.equals(Sort.substring(30, 31))) {
                    let = "D";
                }
                else if (let.equals(Sort.substring(31, 32))) {
                    let = "E";
                }
                else if (let.equals(Sort.substring(32, 33))) {
                    let = "F";
                }
                else if (let.equals(Sort.substring(33, 34))) {
                    let = "G";
                }
                else if (let.equals(Sort.substring(34, 35))) {
                    let = "H";
                }
                else if (let.equals(Sort.substring(35, 36))) {
                    let = "I";
                }
                else if (let.equals(Sort.substring(36, 37))) {
                    let = "J";
                }
                else if (let.equals(Sort.substring(37, 38))) {
                    let = "L";
                }
                else if (let.equals(Sort.substring(38, 39))) {
                    let = " ";
                }
                else if (let.equals(Sort.substring(39, 40))) {
                    let = "1";
                }
                else if (let.equals(Sort.substring(40, 41))) {
                    let = "2";
                }
                else if (let.equals(Sort.substring(41, 42))) {
                    let = "3";
                }
                else if (let.equals(Sort.substring(42, 43))) {
                    let = "4";
                }
                else if (let.equals(Sort.substring(43, 44))) {
                    let = "5";
                }
  
            }    
        } catch (Exception erro) {
//                    JOptionPane.showMessageDialog(null, erro, "Erro", 0);
        }
    }
private void gerareferencia() {
    String Ref1;
    String Banco1 = "";
    String BancoLet = "";
    int z = 0;
    int v = 0;
    int x = 2;
    int R = 0;

    while (z < 50) {
        if (x < PosicoesSorteadas.length()) {
            Ref1 = PosicoesSorteadas.substring(v, x);
            R = Integer.parseInt(Ref1);
        }
        if (R < BancoLetras.length()) {
            BancoLet = BancoLetras.substring(R - 1, R);
            Banco1 = Banco1 + BancoLet;
            Referencia = (Banco1);
        }
        v = v + 2;
        x = x + 2;
        z++;
    }
}


private void BotaoGeraReferencia() {
    String sort;
    String sort2 = "";
    int cont;
    List<Integer> numeros = new ArrayList<>();
    for (int i = 1; i < 58; i++) {
        numeros.add(i);
    }
    Collections.shuffle(numeros);
    for (int i = 0; i < 50; i++) {
        sort = String.valueOf(numeros.get(i));
        cont = sort.length();
        if (cont == 1) {
            sort = "0" + sort;
        }
        sort2 = sort2 + sort;
    }
    PosicoesSorteadas = (sort2);
    gerareferencia();
}


private void SalvaArquivoReferencia() {
    String Referenc = (Referencia);
    try {
        File diretorio = new File("C:/Pasta/PergAminho/Conf");
        if (!diretorio.exists()) {
            diretorio.mkdirs();
        } else {   
        }
        
        FileWriter arq1 = new FileWriter("C:/Pasta/PergAminho/Conf/PergAminho.REF");
        PrintWriter gravaArq1 = new PrintWriter(arq1);
        gravaArq1.println(Referenc);
        arq1.close();
    } catch (IOException erro) {
        System.out.println(erro);
    }
}

private void LerArquivoReferenciaSalvo(){
        String nomeArq = "C:/Pasta/PergAminho/Conf/PergAminho.REF";
        String linha = "";
        File arq = new File(nomeArq);
        if(arq.exists()){
            try {
                FileReader reader = new FileReader(nomeArq);
                BufferedReader leitor = new BufferedReader(reader);
                while(true) {
                    linha = leitor.readLine();
                    if(linha == null){
                        break;
                    }
                    System.out.println(linha + "\n");
                    Referencia = (linha + "\n");
                }     
            } catch (Exception erro){
                System.out.println(erro);
            }
        } else {
            BotaoGeraReferencia();
            SalvaArquivoReferencia();
        }
    }    
}