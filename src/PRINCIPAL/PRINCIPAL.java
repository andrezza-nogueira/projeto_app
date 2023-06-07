package PRINCIPAL;

import AGENDAMENTO.AGENDAMENTO;
import UTILIDA.CONEXAO;
import java.awt.Color;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author Andrezza p/ Smart Level
 */
public class PRINCIPAL extends javax.swing.JFrame {
    
    CONEXAO CONEXAO = new CONEXAO();
    int AnoFIXO = 0, MesFIXO = 0, DiaFIXO = 0; //informaçóes sobre as variaveis
    int AnoAltera = 0, MesAltera = 0, DiaAltera = 0;
    int valorselecao = 0;
    int DiaClick = 0;
    int LIMITE = 1;
    
    String Obs930, Obs1000, Obs1030, Obs1100, Obs1130, Obs1200, Obs1230, Obs1300,
            Obs1330, Obs1400, Obs1430, Obs1500, Obs1530, Obs1600, Obs1630, Obs1700,
            Obs1730, Obs1800, Obs1830, Obs1900, Obs1930, Obs2000, Obs2030, Obs2100;
    
    String Cod930, Cod1000, Cod1030, Cod1100, Cod1130, Cod1200, Cod1230, Cod1300,
            Cod1330, Cod1400, Cod1430, Cod1500, Cod1530, Cod1600, Cod1630, Cod1700,
            Cod1730, Cod1800, Cod1830, Cod1900, Cod1930, Cod2000, Cod2030, Cod2100;
    
    int TAD1 = 0, TAD2 = 0, TAD3 = 0, TAD4 = 0, TAD5 = 0, TAD6 = 0, TAD7 = 0, TAD8 = 0, 
            TAD9 = 0, TAD10 = 0, TAD11 = 0, TAD12 = 0, TAD13 = 0, TAD14 = 0, TAD15 = 0, TAD16 = 0,
            TAD17 = 0, TAD18 = 0, TAD19 = 0, TAD20 = 0, TAD21 = 0, TAD22 = 0, TAD23 = 0, TAD24 = 0,
            TAD25 = 0, TAD26 = 0, TAD27 = 0, TAD28 = 0, TAD29 = 0, TAD30 = 0, TAD31 = 0;
    
    String MS = "Registe ou altere um agendamento";
    public int ChamaAgenda = 0, ChamaAgendaPMenu = 1;
    public String HoraAgendamento = "09:30", NomeAgendamento, ServicoAgendamento, ObservacaoAgendamento, CodAgendamento;
    public int DiaAgendamento = 0, MesAgendamento = 0, AnoAgendamento = 0;
    


    public PRINCIPAL() {
        initComponents();
        CONEXAO.conecta();
        MOSTRA_DADOS_LIMITE();
        INICIACALENDARIO();
        CALENDARIO();
        CALENDARIO_EVT();
        LEGENDA();
        
        
        VoltarDataInicial.setToolTipText("Voltar para a data atual");
        
        N930.setToolTipText(MS);
        N1000.setToolTipText(MS);
        N1030.setToolTipText(MS);
        N1100.setToolTipText(MS);
        N1130.setToolTipText(MS);
        N1200.setToolTipText(MS);
        N1230.setToolTipText(MS);
        N1300.setToolTipText(MS);
        N1330.setToolTipText(MS);
        N1400.setToolTipText(MS);
        N1430.setToolTipText(MS);
        N1500.setToolTipText(MS);
        N1530.setToolTipText(MS);
        N1600.setToolTipText(MS);
        N1630.setToolTipText(MS);
        N1700.setToolTipText(MS);
        N1730.setToolTipText(MS);
        N1800.setToolTipText(MS);
        N1830.setToolTipText(MS);
        N1900.setToolTipText(MS);
        N1930.setToolTipText(MS);
        N2000.setToolTipText(MS);
        N2030.setToolTipText(MS);
        N2100.setToolTipText(MS);
        
        
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        SelecaoMes = new javax.swing.JComboBox<>();
        SelecaoAno = new javax.swing.JComboBox();
        ls1 = new javax.swing.JLabel();
        ls2 = new javax.swing.JLabel();
        ls3 = new javax.swing.JLabel();
        ls4 = new javax.swing.JLabel();
        ls5 = new javax.swing.JLabel();
        ls6 = new javax.swing.JLabel();
        t7 = new javax.swing.JLabel();
        t14 = new javax.swing.JLabel();
        t21 = new javax.swing.JLabel();
        t28 = new javax.swing.JLabel();
        t35 = new javax.swing.JLabel();
        ls7 = new javax.swing.JLabel();
        t42 = new javax.swing.JLabel();
        t6 = new javax.swing.JLabel();
        t13 = new javax.swing.JLabel();
        t20 = new javax.swing.JLabel();
        t27 = new javax.swing.JLabel();
        t34 = new javax.swing.JLabel();
        t41 = new javax.swing.JLabel();
        t5 = new javax.swing.JLabel();
        t12 = new javax.swing.JLabel();
        t19 = new javax.swing.JLabel();
        t26 = new javax.swing.JLabel();
        t33 = new javax.swing.JLabel();
        t40 = new javax.swing.JLabel();
        t4 = new javax.swing.JLabel();
        t11 = new javax.swing.JLabel();
        t18 = new javax.swing.JLabel();
        t25 = new javax.swing.JLabel();
        t32 = new javax.swing.JLabel();
        t39 = new javax.swing.JLabel();
        t3 = new javax.swing.JLabel();
        t10 = new javax.swing.JLabel();
        t17 = new javax.swing.JLabel();
        t24 = new javax.swing.JLabel();
        t31 = new javax.swing.JLabel();
        t38 = new javax.swing.JLabel();
        t2 = new javax.swing.JLabel();
        t9 = new javax.swing.JLabel();
        t16 = new javax.swing.JLabel();
        t23 = new javax.swing.JLabel();
        t30 = new javax.swing.JLabel();
        t37 = new javax.swing.JLabel();
        t1 = new javax.swing.JLabel();
        t8 = new javax.swing.JLabel();
        t15 = new javax.swing.JLabel();
        t22 = new javax.swing.JLabel();
        t29 = new javax.swing.JLabel();
        t36 = new javax.swing.JLabel();
        VoltarDataInicial = new javax.swing.JButton();
        AnoPagina2 = new javax.swing.JLabel();
        SemanaPagina2 = new javax.swing.JLabel();
        MesPagina2 = new javax.swing.JLabel();
        DiaPagina2 = new javax.swing.JLabel();
        SemanaPagina1 = new javax.swing.JLabel();
        DiaPagina1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        MesPagina1 = new javax.swing.JLabel();
        L1000 = new javax.swing.JLabel();
        N1000 = new javax.swing.JTextField();
        S1000 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        T1000 = new javax.swing.JLabel();
        AnoPagina1 = new javax.swing.JLabel();
        L930 = new javax.swing.JLabel();
        N930 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        S930 = new javax.swing.JTextField();
        T930 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        L1030 = new javax.swing.JLabel();
        N1030 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        S1030 = new javax.swing.JTextField();
        T1030 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        L1100 = new javax.swing.JLabel();
        N1100 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        S1100 = new javax.swing.JTextField();
        T1100 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        L1130 = new javax.swing.JLabel();
        N1130 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        S1130 = new javax.swing.JTextField();
        T1130 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        L1200 = new javax.swing.JLabel();
        N1200 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        S1200 = new javax.swing.JTextField();
        T1200 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        L1230 = new javax.swing.JLabel();
        N1230 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        S1230 = new javax.swing.JTextField();
        T1230 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        L1300 = new javax.swing.JLabel();
        N1300 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        S1300 = new javax.swing.JTextField();
        T1300 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        L1330 = new javax.swing.JLabel();
        N1330 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        S1330 = new javax.swing.JTextField();
        T1330 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        L1400 = new javax.swing.JLabel();
        N1400 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        S1400 = new javax.swing.JTextField();
        T1400 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        L1430 = new javax.swing.JLabel();
        L1500 = new javax.swing.JLabel();
        N1430 = new javax.swing.JTextField();
        N1500 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        S1500 = new javax.swing.JTextField();
        S1430 = new javax.swing.JTextField();
        T1430 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        T1500 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        L1530 = new javax.swing.JLabel();
        L1600 = new javax.swing.JLabel();
        L1630 = new javax.swing.JLabel();
        L1700 = new javax.swing.JLabel();
        L1730 = new javax.swing.JLabel();
        L1800 = new javax.swing.JLabel();
        L1830 = new javax.swing.JLabel();
        L1900 = new javax.swing.JLabel();
        L1930 = new javax.swing.JLabel();
        L2000 = new javax.swing.JLabel();
        L2030 = new javax.swing.JLabel();
        L2100 = new javax.swing.JLabel();
        N2100 = new javax.swing.JTextField();
        N2030 = new javax.swing.JTextField();
        N2000 = new javax.swing.JTextField();
        N1930 = new javax.swing.JTextField();
        N1900 = new javax.swing.JTextField();
        N1830 = new javax.swing.JTextField();
        N1730 = new javax.swing.JTextField();
        N1700 = new javax.swing.JTextField();
        N1630 = new javax.swing.JTextField();
        N1600 = new javax.swing.JTextField();
        N1530 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        N1800 = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        S1530 = new javax.swing.JTextField();
        S1600 = new javax.swing.JTextField();
        S1630 = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        S1700 = new javax.swing.JTextField();
        S1730 = new javax.swing.JTextField();
        S1800 = new javax.swing.JTextField();
        S1830 = new javax.swing.JTextField();
        S1900 = new javax.swing.JTextField();
        S1930 = new javax.swing.JTextField();
        S2000 = new javax.swing.JTextField();
        S2030 = new javax.swing.JTextField();
        S2100 = new javax.swing.JTextField();
        T2100 = new javax.swing.JLabel();
        T2030 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        T1930 = new javax.swing.JLabel();
        T1900 = new javax.swing.JLabel();
        T1830 = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        T1730 = new javax.swing.JLabel();
        T1800 = new javax.swing.JLabel();
        T1700 = new javax.swing.JLabel();
        T1630 = new javax.swing.JLabel();
        T1600 = new javax.swing.JLabel();
        T1530 = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        jSeparator18 = new javax.swing.JSeparator();
        jSeparator19 = new javax.swing.JSeparator();
        jSeparator20 = new javax.swing.JSeparator();
        jSeparator21 = new javax.swing.JSeparator();
        jSeparator22 = new javax.swing.JSeparator();
        T2000 = new javax.swing.JLabel();
        jSeparator23 = new javax.swing.JSeparator();
        jSeparator24 = new javax.swing.JSeparator();
        Animacao = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem3 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem4 = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLayeredPane2.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        SelecaoMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));
        SelecaoMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelecaoMesActionPerformed(evt);
            }
        });
        jLayeredPane2.add(SelecaoMes);
        SelecaoMes.setBounds(1, 1, 98, 20);

        SelecaoAno.setEditable(true);
        SelecaoAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelecaoAnoActionPerformed(evt);
            }
        });
        jLayeredPane2.add(SelecaoAno);
        SelecaoAno.setBounds(117, 1, 97, 20);

        ls1.setBackground(new java.awt.Color(0, 204, 204));
        ls1.setForeground(new java.awt.Color(255, 0, 51));
        ls1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ls1.setText("Dom");
        ls1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        ls1.setOpaque(true);
        jLayeredPane2.add(ls1);
        ls1.setBounds(3, 27, 25, 16);

        ls2.setBackground(new java.awt.Color(0, 204, 204));
        ls2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ls2.setText("Seg");
        ls2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        ls2.setOpaque(true);
        jLayeredPane2.add(ls2);
        ls2.setBounds(34, 27, 25, 16);

        ls3.setBackground(new java.awt.Color(0, 204, 204));
        ls3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ls3.setText("Ter");
        ls3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        ls3.setOpaque(true);
        jLayeredPane2.add(ls3);
        ls3.setBounds(65, 27, 25, 16);

        ls4.setBackground(new java.awt.Color(0, 204, 204));
        ls4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ls4.setText("Qua");
        ls4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        ls4.setOpaque(true);
        jLayeredPane2.add(ls4);
        ls4.setBounds(96, 27, 25, 16);

        ls5.setBackground(new java.awt.Color(0, 204, 204));
        ls5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ls5.setText("Qui");
        ls5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        ls5.setOpaque(true);
        jLayeredPane2.add(ls5);
        ls5.setBounds(127, 27, 25, 16);

        ls6.setBackground(new java.awt.Color(0, 204, 204));
        ls6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ls6.setText("Sex");
        ls6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        ls6.setOpaque(true);
        jLayeredPane2.add(ls6);
        ls6.setBounds(158, 27, 25, 16);

        t7.setBackground(new java.awt.Color(204, 204, 204));
        t7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t7.setText("0");
        jLayeredPane2.add(t7);
        t7.setBounds(189, 49, 25, 14);

        t14.setBackground(new java.awt.Color(204, 204, 204));
        t14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t14.setText("0");
        jLayeredPane2.add(t14);
        t14.setBounds(189, 69, 25, 14);

        t21.setBackground(new java.awt.Color(204, 204, 204));
        t21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t21.setText("0");
        jLayeredPane2.add(t21);
        t21.setBounds(189, 89, 25, 14);

        t28.setBackground(new java.awt.Color(204, 204, 204));
        t28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t28.setText("0");
        jLayeredPane2.add(t28);
        t28.setBounds(189, 109, 25, 14);

        t35.setBackground(new java.awt.Color(204, 204, 204));
        t35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t35.setText("0");
        jLayeredPane2.add(t35);
        t35.setBounds(189, 129, 25, 14);

        ls7.setBackground(new java.awt.Color(0, 204, 204));
        ls7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ls7.setText("Sab");
        ls7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        ls7.setOpaque(true);
        jLayeredPane2.add(ls7);
        ls7.setBounds(189, 27, 25, 16);

        t42.setBackground(new java.awt.Color(204, 204, 204));
        t42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t42.setText("0");
        jLayeredPane2.add(t42);
        t42.setBounds(189, 149, 25, 14);

        t6.setBackground(new java.awt.Color(204, 204, 204));
        t6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t6.setText("0");
        jLayeredPane2.add(t6);
        t6.setBounds(158, 49, 25, 14);

        t13.setBackground(new java.awt.Color(204, 204, 204));
        t13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t13.setText("0");
        jLayeredPane2.add(t13);
        t13.setBounds(158, 69, 25, 14);

        t20.setBackground(new java.awt.Color(204, 204, 204));
        t20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t20.setText("0");
        jLayeredPane2.add(t20);
        t20.setBounds(158, 89, 25, 14);

        t27.setBackground(new java.awt.Color(204, 204, 204));
        t27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t27.setText("0");
        jLayeredPane2.add(t27);
        t27.setBounds(158, 109, 25, 14);

        t34.setBackground(new java.awt.Color(204, 204, 204));
        t34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t34.setText("0");
        jLayeredPane2.add(t34);
        t34.setBounds(158, 129, 25, 14);

        t41.setBackground(new java.awt.Color(204, 204, 204));
        t41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t41.setText("0");
        jLayeredPane2.add(t41);
        t41.setBounds(158, 149, 25, 14);

        t5.setBackground(new java.awt.Color(204, 204, 204));
        t5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t5.setText("0");
        jLayeredPane2.add(t5);
        t5.setBounds(127, 49, 25, 14);

        t12.setBackground(new java.awt.Color(204, 204, 204));
        t12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t12.setText("0");
        jLayeredPane2.add(t12);
        t12.setBounds(127, 69, 25, 14);

        t19.setBackground(new java.awt.Color(204, 204, 204));
        t19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t19.setText("0");
        jLayeredPane2.add(t19);
        t19.setBounds(127, 89, 25, 14);

        t26.setBackground(new java.awt.Color(204, 204, 204));
        t26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t26.setText("0");
        jLayeredPane2.add(t26);
        t26.setBounds(127, 109, 25, 14);

        t33.setBackground(new java.awt.Color(204, 204, 204));
        t33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t33.setText("0");
        jLayeredPane2.add(t33);
        t33.setBounds(127, 129, 25, 14);

        t40.setBackground(new java.awt.Color(204, 204, 204));
        t40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t40.setText("0");
        jLayeredPane2.add(t40);
        t40.setBounds(127, 149, 25, 14);

        t4.setBackground(new java.awt.Color(204, 204, 204));
        t4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t4.setText("0");
        jLayeredPane2.add(t4);
        t4.setBounds(96, 49, 25, 14);

        t11.setBackground(new java.awt.Color(204, 204, 204));
        t11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t11.setText("0");
        jLayeredPane2.add(t11);
        t11.setBounds(96, 69, 25, 14);

        t18.setBackground(new java.awt.Color(204, 204, 204));
        t18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t18.setText("0");
        jLayeredPane2.add(t18);
        t18.setBounds(96, 89, 25, 14);

        t25.setBackground(new java.awt.Color(204, 204, 204));
        t25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t25.setText("0");
        jLayeredPane2.add(t25);
        t25.setBounds(96, 109, 25, 14);

        t32.setBackground(new java.awt.Color(204, 204, 204));
        t32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t32.setText("0");
        jLayeredPane2.add(t32);
        t32.setBounds(96, 129, 25, 14);

        t39.setBackground(new java.awt.Color(204, 204, 204));
        t39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t39.setText("0");
        jLayeredPane2.add(t39);
        t39.setBounds(96, 149, 25, 14);

        t3.setBackground(new java.awt.Color(204, 204, 204));
        t3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t3.setText("0");
        jLayeredPane2.add(t3);
        t3.setBounds(65, 49, 25, 14);

        t10.setBackground(new java.awt.Color(204, 204, 204));
        t10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t10.setText("0");
        jLayeredPane2.add(t10);
        t10.setBounds(65, 69, 25, 14);

        t17.setBackground(new java.awt.Color(204, 204, 204));
        t17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t17.setText("0");
        jLayeredPane2.add(t17);
        t17.setBounds(65, 89, 25, 14);

        t24.setBackground(new java.awt.Color(204, 204, 204));
        t24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t24.setText("0");
        jLayeredPane2.add(t24);
        t24.setBounds(65, 109, 25, 14);

        t31.setBackground(new java.awt.Color(204, 204, 204));
        t31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t31.setText("0");
        jLayeredPane2.add(t31);
        t31.setBounds(65, 129, 25, 14);

        t38.setBackground(new java.awt.Color(204, 204, 204));
        t38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t38.setText("0");
        jLayeredPane2.add(t38);
        t38.setBounds(65, 149, 25, 14);

        t2.setBackground(new java.awt.Color(204, 204, 204));
        t2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t2.setText("0");
        jLayeredPane2.add(t2);
        t2.setBounds(34, 49, 25, 14);

        t9.setBackground(new java.awt.Color(204, 204, 204));
        t9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t9.setText("0");
        jLayeredPane2.add(t9);
        t9.setBounds(34, 69, 25, 14);

        t16.setBackground(new java.awt.Color(204, 204, 204));
        t16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t16.setText("0");
        jLayeredPane2.add(t16);
        t16.setBounds(34, 89, 25, 14);

        t23.setBackground(new java.awt.Color(204, 204, 204));
        t23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t23.setText("0");
        jLayeredPane2.add(t23);
        t23.setBounds(34, 109, 25, 14);

        t30.setBackground(new java.awt.Color(204, 204, 204));
        t30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t30.setText("0");
        jLayeredPane2.add(t30);
        t30.setBounds(34, 129, 25, 14);

        t37.setBackground(new java.awt.Color(204, 204, 204));
        t37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t37.setText("0");
        jLayeredPane2.add(t37);
        t37.setBounds(34, 149, 25, 14);

        t1.setBackground(new java.awt.Color(204, 204, 204));
        t1.setForeground(new java.awt.Color(255, 0, 51));
        t1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t1.setText("0");
        t1.setOpaque(true);
        jLayeredPane2.add(t1);
        t1.setBounds(3, 49, 25, 14);

        t8.setBackground(new java.awt.Color(204, 204, 204));
        t8.setForeground(new java.awt.Color(255, 0, 51));
        t8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t8.setText("0");
        jLayeredPane2.add(t8);
        t8.setBounds(3, 69, 25, 14);

        t15.setBackground(new java.awt.Color(204, 204, 204));
        t15.setForeground(new java.awt.Color(255, 0, 51));
        t15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t15.setText("0");
        jLayeredPane2.add(t15);
        t15.setBounds(3, 89, 25, 14);

        t22.setBackground(new java.awt.Color(204, 204, 204));
        t22.setForeground(new java.awt.Color(255, 0, 51));
        t22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t22.setText("0");
        jLayeredPane2.add(t22);
        t22.setBounds(3, 109, 25, 14);

        t29.setBackground(new java.awt.Color(204, 204, 204));
        t29.setForeground(new java.awt.Color(255, 0, 51));
        t29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t29.setText("0");
        jLayeredPane2.add(t29);
        t29.setBounds(3, 129, 25, 14);

        t36.setBackground(new java.awt.Color(204, 204, 204));
        t36.setForeground(new java.awt.Color(255, 0, 51));
        t36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t36.setText("0");
        jLayeredPane2.add(t36);
        t36.setBounds(3, 149, 25, 14);

        jLayeredPane1.add(jLayeredPane2);
        jLayeredPane2.setBounds(21, 17, 220, 170);

        VoltarDataInicial.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        VoltarDataInicial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGEM/go-bac.png"))); // NOI18N
        VoltarDataInicial.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        VoltarDataInicial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                VoltarDataInicialMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                VoltarDataInicialMouseExited(evt);
            }
        });
        VoltarDataInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarDataInicialActionPerformed(evt);
            }
        });
        jLayeredPane1.add(VoltarDataInicial);
        VoltarDataInicial.setBounds(250, 20, 30, 30);

        AnoPagina2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        AnoPagina2.setText("2023");
        jLayeredPane1.add(AnoPagina2);
        AnoPagina2.setBounds(900, 20, 52, 29);

        SemanaPagina2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SemanaPagina2.setText("Sexta-Feira");
        SemanaPagina2.setAlignmentY(0.0F);
        jLayeredPane1.add(SemanaPagina2);
        SemanaPagina2.setBounds(1160, 20, 90, 22);

        MesPagina2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        MesPagina2.setText("Maio");
        jLayeredPane1.add(MesPagina2);
        MesPagina2.setBounds(1160, 80, 80, 17);

        DiaPagina2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        DiaPagina2.setText("10");
        jLayeredPane1.add(DiaPagina2);
        DiaPagina2.setBounds(1160, 40, 50, 40);

        SemanaPagina1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SemanaPagina1.setText("Sexta-Feira");
        SemanaPagina1.setAlignmentY(0.0F);
        jLayeredPane1.add(SemanaPagina1);
        SemanaPagina1.setBounds(500, 20, 100, 17);

        DiaPagina1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        DiaPagina1.setText("10");
        jLayeredPane1.add(DiaPagina1);
        DiaPagina1.setBounds(500, 40, 50, 40);
        jLayeredPane1.add(jSeparator1);
        jSeparator1.setBounds(30, 260, 530, 10);

        MesPagina1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        MesPagina1.setText("Maio");
        jLayeredPane1.add(MesPagina1);
        MesPagina1.setBounds(500, 80, 80, 17);

        L1000.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        L1000.setText("10:00");
        jLayeredPane1.add(L1000);
        L1000.setBounds(30, 240, 32, 15);

        N1000.setEditable(false);
        N1000.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        N1000.setBorder(null);
        N1000.setOpaque(false);
        N1000.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                N1000MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                N1000MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                N1000MouseExited(evt);
            }
        });
        jLayeredPane1.add(N1000);
        N1000.setBounds(80, 240, 210, 20);

        S1000.setEditable(false);
        S1000.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        S1000.setBorder(null);
        S1000.setOpaque(false);
        S1000.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                S1000MouseEntered(evt);
            }
        });
        jLayeredPane1.add(S1000);
        S1000.setBounds(310, 240, 210, 20);

        jLabel2.setText("|");
        jLayeredPane1.add(jLabel2);
        jLabel2.setBounds(300, 240, 10, 14);

        T1000.setText("0");
        jLayeredPane1.add(T1000);
        T1000.setBounds(530, 240, 20, 20);

        AnoPagina1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        AnoPagina1.setText("2023");
        jLayeredPane1.add(AnoPagina1);
        AnoPagina1.setBounds(340, 20, 52, 29);

        L930.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        L930.setText("09:30");
        jLayeredPane1.add(L930);
        L930.setBounds(30, 210, 32, 15);

        N930.setEditable(false);
        N930.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        N930.setBorder(null);
        N930.setOpaque(false);
        N930.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                N930MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                N930MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                N930MouseExited(evt);
            }
        });
        N930.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N930ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(N930);
        N930.setBounds(80, 210, 210, 20);

        jLabel5.setText("|");
        jLayeredPane1.add(jLabel5);
        jLabel5.setBounds(300, 210, 10, 14);

        S930.setEditable(false);
        S930.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        S930.setBorder(null);
        S930.setOpaque(false);
        S930.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                S930MouseEntered(evt);
            }
        });
        S930.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S930ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(S930);
        S930.setBounds(310, 210, 210, 20);

        T930.setText("0");
        jLayeredPane1.add(T930);
        T930.setBounds(530, 210, 20, 20);
        jLayeredPane1.add(jSeparator2);
        jSeparator2.setBounds(30, 230, 530, 10);

        L1030.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        L1030.setText("10:30");
        jLayeredPane1.add(L1030);
        L1030.setBounds(30, 270, 32, 15);

        N1030.setEditable(false);
        N1030.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        N1030.setBorder(null);
        N1030.setOpaque(false);
        N1030.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                N1030MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                N1030MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                N1030MouseExited(evt);
            }
        });
        jLayeredPane1.add(N1030);
        N1030.setBounds(80, 270, 210, 20);

        jLabel8.setText("|");
        jLayeredPane1.add(jLabel8);
        jLabel8.setBounds(300, 270, 10, 14);

        S1030.setEditable(false);
        S1030.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        S1030.setBorder(null);
        S1030.setOpaque(false);
        S1030.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                S1030MouseEntered(evt);
            }
        });
        jLayeredPane1.add(S1030);
        S1030.setBounds(310, 270, 210, 20);

        T1030.setText("0");
        jLayeredPane1.add(T1030);
        T1030.setBounds(530, 270, 20, 20);
        jLayeredPane1.add(jSeparator3);
        jSeparator3.setBounds(30, 290, 530, 10);

        L1100.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        L1100.setText("11:00");
        jLayeredPane1.add(L1100);
        L1100.setBounds(30, 300, 32, 15);

        N1100.setEditable(false);
        N1100.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        N1100.setBorder(null);
        N1100.setOpaque(false);
        N1100.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                N1100MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                N1100MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                N1100MouseExited(evt);
            }
        });
        jLayeredPane1.add(N1100);
        N1100.setBounds(80, 300, 210, 20);

        jLabel11.setText("|");
        jLayeredPane1.add(jLabel11);
        jLabel11.setBounds(300, 300, 10, 14);

        S1100.setEditable(false);
        S1100.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        S1100.setBorder(null);
        S1100.setOpaque(false);
        S1100.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                S1100MouseEntered(evt);
            }
        });
        jLayeredPane1.add(S1100);
        S1100.setBounds(310, 300, 210, 20);

        T1100.setText("0");
        jLayeredPane1.add(T1100);
        T1100.setBounds(530, 300, 20, 20);
        jLayeredPane1.add(jSeparator4);
        jSeparator4.setBounds(30, 320, 530, 10);

        L1130.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        L1130.setText("11:30");
        jLayeredPane1.add(L1130);
        L1130.setBounds(30, 330, 32, 15);

        N1130.setEditable(false);
        N1130.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        N1130.setBorder(null);
        N1130.setOpaque(false);
        N1130.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                N1130MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                N1130MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                N1130MouseExited(evt);
            }
        });
        jLayeredPane1.add(N1130);
        N1130.setBounds(80, 330, 210, 20);

        jLabel14.setText("|");
        jLayeredPane1.add(jLabel14);
        jLabel14.setBounds(300, 330, 10, 14);

        S1130.setEditable(false);
        S1130.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        S1130.setBorder(null);
        S1130.setOpaque(false);
        S1130.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                S1130MouseEntered(evt);
            }
        });
        jLayeredPane1.add(S1130);
        S1130.setBounds(310, 330, 210, 20);

        T1130.setText("0");
        jLayeredPane1.add(T1130);
        T1130.setBounds(530, 330, 20, 20);
        jLayeredPane1.add(jSeparator5);
        jSeparator5.setBounds(30, 350, 530, 10);

        L1200.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        L1200.setText("12:00");
        jLayeredPane1.add(L1200);
        L1200.setBounds(30, 360, 32, 15);

        N1200.setEditable(false);
        N1200.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        N1200.setBorder(null);
        N1200.setOpaque(false);
        N1200.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                N1200MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                N1200MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                N1200MouseExited(evt);
            }
        });
        jLayeredPane1.add(N1200);
        N1200.setBounds(80, 360, 210, 20);

        jLabel17.setText("|");
        jLayeredPane1.add(jLabel17);
        jLabel17.setBounds(300, 360, 10, 14);

        S1200.setEditable(false);
        S1200.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        S1200.setBorder(null);
        S1200.setOpaque(false);
        S1200.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                S1200MouseEntered(evt);
            }
        });
        jLayeredPane1.add(S1200);
        S1200.setBounds(310, 360, 210, 20);

        T1200.setText("0");
        jLayeredPane1.add(T1200);
        T1200.setBounds(530, 360, 20, 20);
        jLayeredPane1.add(jSeparator6);
        jSeparator6.setBounds(30, 380, 530, 10);

        L1230.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        L1230.setText("12:30");
        jLayeredPane1.add(L1230);
        L1230.setBounds(30, 390, 32, 15);

        N1230.setEditable(false);
        N1230.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        N1230.setBorder(null);
        N1230.setOpaque(false);
        N1230.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                N1230MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                N1230MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                N1230MouseExited(evt);
            }
        });
        jLayeredPane1.add(N1230);
        N1230.setBounds(80, 390, 210, 20);

        jLabel20.setText("|");
        jLayeredPane1.add(jLabel20);
        jLabel20.setBounds(300, 390, 10, 14);

        S1230.setEditable(false);
        S1230.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        S1230.setBorder(null);
        S1230.setOpaque(false);
        S1230.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                S1230MouseEntered(evt);
            }
        });
        jLayeredPane1.add(S1230);
        S1230.setBounds(310, 390, 210, 20);

        T1230.setText("0");
        jLayeredPane1.add(T1230);
        T1230.setBounds(530, 390, 20, 20);
        jLayeredPane1.add(jSeparator7);
        jSeparator7.setBounds(30, 410, 530, 10);

        L1300.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        L1300.setText("13:00");
        jLayeredPane1.add(L1300);
        L1300.setBounds(30, 420, 32, 15);

        N1300.setEditable(false);
        N1300.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        N1300.setBorder(null);
        N1300.setOpaque(false);
        N1300.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                N1300MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                N1300MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                N1300MouseExited(evt);
            }
        });
        jLayeredPane1.add(N1300);
        N1300.setBounds(80, 420, 210, 20);

        jLabel23.setText("|");
        jLayeredPane1.add(jLabel23);
        jLabel23.setBounds(300, 420, 10, 14);

        S1300.setEditable(false);
        S1300.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        S1300.setBorder(null);
        S1300.setOpaque(false);
        S1300.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                S1300MouseEntered(evt);
            }
        });
        jLayeredPane1.add(S1300);
        S1300.setBounds(310, 420, 210, 20);

        T1300.setText("0");
        jLayeredPane1.add(T1300);
        T1300.setBounds(530, 420, 20, 20);
        jLayeredPane1.add(jSeparator8);
        jSeparator8.setBounds(30, 440, 530, 10);

        L1330.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        L1330.setText("13:30");
        jLayeredPane1.add(L1330);
        L1330.setBounds(30, 450, 32, 15);

        N1330.setEditable(false);
        N1330.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        N1330.setBorder(null);
        N1330.setOpaque(false);
        N1330.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                N1330MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                N1330MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                N1330MouseExited(evt);
            }
        });
        jLayeredPane1.add(N1330);
        N1330.setBounds(80, 450, 210, 20);

        jLabel26.setText("|");
        jLayeredPane1.add(jLabel26);
        jLabel26.setBounds(300, 450, 10, 14);

        S1330.setEditable(false);
        S1330.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        S1330.setBorder(null);
        S1330.setOpaque(false);
        S1330.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                S1330MouseEntered(evt);
            }
        });
        jLayeredPane1.add(S1330);
        S1330.setBounds(310, 450, 210, 20);

        T1330.setText("0");
        jLayeredPane1.add(T1330);
        T1330.setBounds(530, 450, 20, 20);
        jLayeredPane1.add(jSeparator9);
        jSeparator9.setBounds(30, 470, 530, 10);

        L1400.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        L1400.setText("14:00");
        jLayeredPane1.add(L1400);
        L1400.setBounds(30, 480, 32, 15);

        N1400.setEditable(false);
        N1400.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        N1400.setBorder(null);
        N1400.setOpaque(false);
        N1400.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                N1400MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                N1400MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                N1400MouseExited(evt);
            }
        });
        jLayeredPane1.add(N1400);
        N1400.setBounds(80, 480, 210, 20);

        jLabel29.setText("|");
        jLayeredPane1.add(jLabel29);
        jLabel29.setBounds(300, 480, 10, 14);

        S1400.setEditable(false);
        S1400.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        S1400.setBorder(null);
        S1400.setOpaque(false);
        S1400.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                S1400MouseEntered(evt);
            }
        });
        jLayeredPane1.add(S1400);
        S1400.setBounds(310, 480, 210, 20);

        T1400.setText("0");
        jLayeredPane1.add(T1400);
        T1400.setBounds(530, 480, 20, 20);
        jLayeredPane1.add(jSeparator10);
        jSeparator10.setBounds(30, 500, 530, 10);

        L1430.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        L1430.setText("14:30");
        jLayeredPane1.add(L1430);
        L1430.setBounds(30, 510, 32, 15);

        L1500.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        L1500.setText("15:00");
        jLayeredPane1.add(L1500);
        L1500.setBounds(30, 540, 32, 15);

        N1430.setEditable(false);
        N1430.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        N1430.setBorder(null);
        N1430.setOpaque(false);
        N1430.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                N1430MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                N1430MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                N1430MouseExited(evt);
            }
        });
        jLayeredPane1.add(N1430);
        N1430.setBounds(80, 510, 210, 20);

        N1500.setEditable(false);
        N1500.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        N1500.setBorder(null);
        N1500.setOpaque(false);
        N1500.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                N1500MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                N1500MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                N1500MouseExited(evt);
            }
        });
        jLayeredPane1.add(N1500);
        N1500.setBounds(80, 540, 210, 20);

        jLabel33.setText("|");
        jLayeredPane1.add(jLabel33);
        jLabel33.setBounds(300, 510, 10, 14);

        jLabel34.setText("|");
        jLayeredPane1.add(jLabel34);
        jLabel34.setBounds(300, 540, 10, 14);

        S1500.setEditable(false);
        S1500.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        S1500.setBorder(null);
        S1500.setOpaque(false);
        S1500.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                S1500MouseEntered(evt);
            }
        });
        jLayeredPane1.add(S1500);
        S1500.setBounds(310, 540, 210, 20);

        S1430.setEditable(false);
        S1430.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        S1430.setBorder(null);
        S1430.setOpaque(false);
        S1430.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                S1430MouseEntered(evt);
            }
        });
        jLayeredPane1.add(S1430);
        S1430.setBounds(310, 510, 210, 20);

        T1430.setText("0");
        jLayeredPane1.add(T1430);
        T1430.setBounds(530, 510, 20, 20);
        jLayeredPane1.add(jSeparator11);
        jSeparator11.setBounds(30, 530, 530, 10);

        T1500.setText("0");
        jLayeredPane1.add(T1500);
        T1500.setBounds(530, 540, 20, 20);
        jLayeredPane1.add(jSeparator12);
        jSeparator12.setBounds(30, 560, 530, 10);

        L1530.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        L1530.setText("15:30");
        jLayeredPane1.add(L1530);
        L1530.setBounds(690, 210, 32, 15);

        L1600.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        L1600.setText("16:00");
        jLayeredPane1.add(L1600);
        L1600.setBounds(690, 240, 32, 15);

        L1630.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        L1630.setText("16:30");
        jLayeredPane1.add(L1630);
        L1630.setBounds(690, 270, 32, 15);

        L1700.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        L1700.setText("17:00");
        jLayeredPane1.add(L1700);
        L1700.setBounds(690, 300, 32, 15);

        L1730.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        L1730.setText("17:30");
        jLayeredPane1.add(L1730);
        L1730.setBounds(690, 330, 32, 15);

        L1800.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        L1800.setText("18:00");
        jLayeredPane1.add(L1800);
        L1800.setBounds(690, 360, 32, 15);

        L1830.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        L1830.setText("18:30");
        jLayeredPane1.add(L1830);
        L1830.setBounds(690, 390, 32, 15);

        L1900.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        L1900.setText("19:00");
        jLayeredPane1.add(L1900);
        L1900.setBounds(690, 420, 32, 15);

        L1930.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        L1930.setText("19:30");
        jLayeredPane1.add(L1930);
        L1930.setBounds(690, 450, 32, 15);

        L2000.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        L2000.setText("20:00");
        jLayeredPane1.add(L2000);
        L2000.setBounds(690, 480, 32, 15);

        L2030.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        L2030.setText("20:30");
        jLayeredPane1.add(L2030);
        L2030.setBounds(690, 510, 32, 15);

        L2100.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        L2100.setText("21:00");
        jLayeredPane1.add(L2100);
        L2100.setBounds(690, 540, 32, 15);

        N2100.setEditable(false);
        N2100.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        N2100.setBorder(null);
        N2100.setOpaque(false);
        N2100.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                N2100MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                N2100MouseExited(evt);
            }
        });
        jLayeredPane1.add(N2100);
        N2100.setBounds(740, 540, 210, 20);

        N2030.setEditable(false);
        N2030.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        N2030.setBorder(null);
        N2030.setOpaque(false);
        N2030.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                N2030MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                N2030MouseExited(evt);
            }
        });
        jLayeredPane1.add(N2030);
        N2030.setBounds(740, 510, 210, 20);

        N2000.setEditable(false);
        N2000.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        N2000.setBorder(null);
        N2000.setOpaque(false);
        N2000.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                N2000MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                N2000MouseExited(evt);
            }
        });
        jLayeredPane1.add(N2000);
        N2000.setBounds(740, 480, 210, 20);

        N1930.setEditable(false);
        N1930.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        N1930.setBorder(null);
        N1930.setOpaque(false);
        N1930.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                N1930MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                N1930MouseExited(evt);
            }
        });
        jLayeredPane1.add(N1930);
        N1930.setBounds(740, 450, 210, 20);

        N1900.setEditable(false);
        N1900.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        N1900.setBorder(null);
        N1900.setOpaque(false);
        N1900.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                N1900MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                N1900MouseExited(evt);
            }
        });
        jLayeredPane1.add(N1900);
        N1900.setBounds(740, 420, 210, 20);

        N1830.setEditable(false);
        N1830.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        N1830.setBorder(null);
        N1830.setOpaque(false);
        N1830.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                N1830MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                N1830MouseExited(evt);
            }
        });
        jLayeredPane1.add(N1830);
        N1830.setBounds(740, 390, 210, 20);

        N1730.setEditable(false);
        N1730.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        N1730.setBorder(null);
        N1730.setOpaque(false);
        N1730.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                N1730MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                N1730MouseExited(evt);
            }
        });
        jLayeredPane1.add(N1730);
        N1730.setBounds(740, 330, 210, 20);

        N1700.setEditable(false);
        N1700.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        N1700.setBorder(null);
        N1700.setOpaque(false);
        N1700.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                N1700MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                N1700MouseExited(evt);
            }
        });
        jLayeredPane1.add(N1700);
        N1700.setBounds(740, 300, 210, 20);

        N1630.setEditable(false);
        N1630.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        N1630.setBorder(null);
        N1630.setOpaque(false);
        N1630.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                N1630MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                N1630MouseExited(evt);
            }
        });
        jLayeredPane1.add(N1630);
        N1630.setBounds(740, 270, 210, 20);

        N1600.setEditable(false);
        N1600.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        N1600.setBorder(null);
        N1600.setOpaque(false);
        N1600.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                N1600MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                N1600MouseExited(evt);
            }
        });
        jLayeredPane1.add(N1600);
        N1600.setBounds(740, 240, 210, 20);

        N1530.setEditable(false);
        N1530.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        N1530.setBorder(null);
        N1530.setOpaque(false);
        N1530.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                N1530MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                N1530MouseExited(evt);
            }
        });
        jLayeredPane1.add(N1530);
        N1530.setBounds(740, 210, 210, 20);

        jLabel49.setText("|");
        jLayeredPane1.add(jLabel49);
        jLabel49.setBounds(960, 540, 10, 14);

        jLabel50.setText("|");
        jLayeredPane1.add(jLabel50);
        jLabel50.setBounds(960, 510, 10, 14);

        jLabel51.setText("|");
        jLayeredPane1.add(jLabel51);
        jLabel51.setBounds(960, 480, 10, 14);

        jLabel52.setText("|");
        jLayeredPane1.add(jLabel52);
        jLabel52.setBounds(960, 450, 10, 14);

        jLabel53.setText("|");
        jLayeredPane1.add(jLabel53);
        jLabel53.setBounds(960, 420, 10, 14);

        jLabel54.setText("|");
        jLayeredPane1.add(jLabel54);
        jLabel54.setBounds(960, 390, 10, 14);

        jLabel55.setText("|");
        jLayeredPane1.add(jLabel55);
        jLabel55.setBounds(960, 360, 10, 14);

        N1800.setEditable(false);
        N1800.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        N1800.setBorder(null);
        N1800.setOpaque(false);
        N1800.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                N1800MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                N1800MouseExited(evt);
            }
        });
        jLayeredPane1.add(N1800);
        N1800.setBounds(740, 360, 210, 20);

        jLabel56.setText("|");
        jLayeredPane1.add(jLabel56);
        jLabel56.setBounds(960, 330, 10, 14);

        jLabel57.setText("|");
        jLayeredPane1.add(jLabel57);
        jLabel57.setBounds(960, 270, 10, 14);

        jLabel58.setText("|");
        jLayeredPane1.add(jLabel58);
        jLabel58.setBounds(960, 300, 10, 14);

        jLabel59.setText("|");
        jLayeredPane1.add(jLabel59);
        jLabel59.setBounds(960, 240, 10, 14);

        jLabel60.setText("|");
        jLayeredPane1.add(jLabel60);
        jLabel60.setBounds(960, 210, 10, 14);

        S1530.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        S1530.setBorder(null);
        S1530.setOpaque(false);
        S1530.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                S1530MouseEntered(evt);
            }
        });
        jLayeredPane1.add(S1530);
        S1530.setBounds(970, 210, 210, 20);

        S1600.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        S1600.setBorder(null);
        S1600.setOpaque(false);
        S1600.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                S1600MouseEntered(evt);
            }
        });
        jLayeredPane1.add(S1600);
        S1600.setBounds(970, 240, 210, 20);

        S1630.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        S1630.setBorder(null);
        S1630.setOpaque(false);
        S1630.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                S1630MouseEntered(evt);
            }
        });
        jLayeredPane1.add(S1630);
        S1630.setBounds(970, 270, 210, 20);
        jLayeredPane1.add(jSeparator13);
        jSeparator13.setBounds(690, 290, 530, 10);

        S1700.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        S1700.setBorder(null);
        S1700.setOpaque(false);
        S1700.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                S1700MouseEntered(evt);
            }
        });
        jLayeredPane1.add(S1700);
        S1700.setBounds(970, 300, 210, 20);

        S1730.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        S1730.setBorder(null);
        S1730.setOpaque(false);
        S1730.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                S1730MouseEntered(evt);
            }
        });
        jLayeredPane1.add(S1730);
        S1730.setBounds(970, 330, 210, 20);

        S1800.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        S1800.setBorder(null);
        S1800.setOpaque(false);
        S1800.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                S1800MouseEntered(evt);
            }
        });
        jLayeredPane1.add(S1800);
        S1800.setBounds(970, 360, 210, 20);

        S1830.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        S1830.setBorder(null);
        S1830.setOpaque(false);
        S1830.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                S1830MouseEntered(evt);
            }
        });
        jLayeredPane1.add(S1830);
        S1830.setBounds(970, 390, 210, 20);

        S1900.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        S1900.setBorder(null);
        S1900.setOpaque(false);
        S1900.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                S1900MouseEntered(evt);
            }
        });
        jLayeredPane1.add(S1900);
        S1900.setBounds(970, 420, 210, 20);

        S1930.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        S1930.setBorder(null);
        S1930.setOpaque(false);
        S1930.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                S1930MouseEntered(evt);
            }
        });
        jLayeredPane1.add(S1930);
        S1930.setBounds(970, 450, 210, 20);

        S2000.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        S2000.setBorder(null);
        S2000.setOpaque(false);
        S2000.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                S2000MouseEntered(evt);
            }
        });
        jLayeredPane1.add(S2000);
        S2000.setBounds(970, 480, 210, 20);

        S2030.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        S2030.setBorder(null);
        S2030.setOpaque(false);
        S2030.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                S2030MouseEntered(evt);
            }
        });
        jLayeredPane1.add(S2030);
        S2030.setBounds(970, 510, 210, 20);

        S2100.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        S2100.setBorder(null);
        S2100.setOpaque(false);
        S2100.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                S2100MouseEntered(evt);
            }
        });
        jLayeredPane1.add(S2100);
        S2100.setBounds(970, 540, 210, 15);

        T2100.setText("0");
        jLayeredPane1.add(T2100);
        T2100.setBounds(1190, 540, 20, 20);

        T2030.setText("0");
        jLayeredPane1.add(T2030);
        T2030.setBounds(1190, 510, 20, 20);
        jLayeredPane1.add(jSeparator14);
        jSeparator14.setBounds(690, 470, 530, 10);

        T1930.setText("0");
        jLayeredPane1.add(T1930);
        T1930.setBounds(1190, 450, 20, 20);

        T1900.setText("0");
        jLayeredPane1.add(T1900);
        T1900.setBounds(1190, 420, 20, 20);

        T1830.setText("0");
        jLayeredPane1.add(T1830);
        T1830.setBounds(1190, 390, 20, 20);
        jLayeredPane1.add(jSeparator15);
        jSeparator15.setBounds(690, 350, 530, 10);

        T1730.setText("0");
        jLayeredPane1.add(T1730);
        T1730.setBounds(1190, 330, 20, 20);

        T1800.setText("0");
        jLayeredPane1.add(T1800);
        T1800.setBounds(1190, 360, 20, 20);

        T1700.setText("0");
        jLayeredPane1.add(T1700);
        T1700.setBounds(1190, 300, 20, 20);

        T1630.setText("0");
        jLayeredPane1.add(T1630);
        T1630.setBounds(1190, 270, 20, 20);

        T1600.setText("0");
        jLayeredPane1.add(T1600);
        T1600.setBounds(1190, 240, 20, 20);

        T1530.setText("0");
        jLayeredPane1.add(T1530);
        T1530.setBounds(1190, 210, 20, 20);
        jLayeredPane1.add(jSeparator16);
        jSeparator16.setBounds(690, 230, 530, 10);
        jLayeredPane1.add(jSeparator17);
        jSeparator17.setBounds(690, 260, 530, 10);
        jLayeredPane1.add(jSeparator18);
        jSeparator18.setBounds(690, 320, 530, 10);
        jLayeredPane1.add(jSeparator19);
        jSeparator19.setBounds(690, 380, 530, 10);
        jLayeredPane1.add(jSeparator20);
        jSeparator20.setBounds(690, 410, 530, 10);
        jLayeredPane1.add(jSeparator21);
        jSeparator21.setBounds(690, 440, 530, 10);
        jLayeredPane1.add(jSeparator22);
        jSeparator22.setBounds(690, 500, 530, 10);

        T2000.setText("0");
        jLayeredPane1.add(T2000);
        T2000.setBounds(1190, 480, 20, 20);
        jLayeredPane1.add(jSeparator23);
        jSeparator23.setBounds(690, 530, 530, 10);
        jLayeredPane1.add(jSeparator24);
        jSeparator24.setBounds(690, 560, 530, 10);

        Animacao.setBackground(new java.awt.Color(0, 0, 0));
        Animacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGEM/agenda_app2.jpg"))); // NOI18N
        Animacao.setOpaque(true);
        jLayeredPane1.add(Animacao);
        Animacao.setBounds(0, 0, 1260, 660);

        jMenu3.setText("Arquivo");

        jMenu10.setText("jMenu10");
        jMenu3.add(jMenu10);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Editar");
        jMenu4.setMargin(new java.awt.Insets(0, 5, 0, 5));
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Password");

        jMenu6.setText("Editar");
        jMenu5.add(jMenu6);

        jMenuBar1.add(jMenu5);

        jMenu9.setText("Resultados");
        jMenu9.setMargin(new java.awt.Insets(0, 5, 0, 5));
        jMenuBar1.add(jMenu9);

        jMenu7.setText("Exibir");

        jMenu8.setText("Editar");
        jMenu7.add(jMenu8);

        jMenu12.setText("Look and Feel");
        jMenu12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu12ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonMenuItem1);
        jRadioButtonMenuItem1.setText("MetalButton");
        jRadioButtonMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem1ActionPerformed(evt);
            }
        });
        jMenu12.add(jRadioButtonMenuItem1);

        buttonGroup1.add(jRadioButtonMenuItem2);
        jRadioButtonMenuItem2.setText("MotiButton");
        jRadioButtonMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem2ActionPerformed(evt);
            }
        });
        jMenu12.add(jRadioButtonMenuItem2);

        buttonGroup1.add(jRadioButtonMenuItem3);
        jRadioButtonMenuItem3.setSelected(true);
        jRadioButtonMenuItem3.setText("WindowsButton");
        jRadioButtonMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem3ActionPerformed(evt);
            }
        });
        jMenu12.add(jRadioButtonMenuItem3);

        buttonGroup1.add(jRadioButtonMenuItem4);
        jRadioButtonMenuItem4.setText("Nimbus");
        jRadioButtonMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem4ActionPerformed(evt);
            }
        });
        jMenu12.add(jRadioButtonMenuItem4);

        jMenu7.add(jMenu12);

        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1282, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setBounds(0, 0, 1282, 719);
    }// </editor-fold>//GEN-END:initComponents

    private void VoltarDataInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarDataInicialActionPerformed
        INICIACALENDARIO();
        CALENDARIO();
        LEGENDA();
        INSERE_COR_CALENDARIO();
    }//GEN-LAST:event_VoltarDataInicialActionPerformed

    private void VoltarDataInicialMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VoltarDataInicialMouseExited
        VoltarDataInicial.setBorder(null);
    }//GEN-LAST:event_VoltarDataInicialMouseExited

    private void VoltarDataInicialMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VoltarDataInicialMouseEntered
        VoltarDataInicial.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)); //fazer uma borda com relevo quando passar o mouse
    }//GEN-LAST:event_VoltarDataInicialMouseEntered

    private void SelecaoAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelecaoAnoActionPerformed
        try {
            int x = Integer.parseInt(SelecaoAno.getSelectedItem().toString());
            DiaAltera = DiaFIXO;
            CALENDARIO();
            LEGENDA();
            INSERE_COR_CALENDARIO();
            AnoPagina2.setText(SelecaoAno.getSelectedItem().toString()); //altera o ano que esta na pagina quando a pessoa escolhe o ano
            AnoPagina2.setText(SelecaoAno.getSelectedItem().toString());
        } catch (Exception e) {
            SelecaoAno.setSelectedItem(AnoFIXO); //se caso digitar errado, cai no exception e volta ao ano vigente
            LEGENDA();
            INSERE_COR_CALENDARIO();
        }
    }//GEN-LAST:event_SelecaoAnoActionPerformed

    private void SelecaoMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelecaoMesActionPerformed
        DiaAltera = DiaFIXO; //seleciona o mes pelo jcomboBox
        CALENDARIO();
        LEGENDA();
        INSERE_COR_CALENDARIO();
    }//GEN-LAST:event_SelecaoMesActionPerformed

    private void N930ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N930ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_N930ActionPerformed

    private void S930ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S930ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S930ActionPerformed

    private void N930MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_N930MouseEntered
        N930.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_N930MouseEntered

    private void N1000MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_N1000MouseEntered
        N1000.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_N1000MouseEntered

    private void N930MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_N930MouseExited
        N930.setBorder(null);
    }//GEN-LAST:event_N930MouseExited

    private void N1030MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_N1030MouseEntered
        N1030.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_N1030MouseEntered

    private void N1030MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_N1030MouseExited
        N1030.setBorder(null);
    }//GEN-LAST:event_N1030MouseExited

    private void N1100MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_N1100MouseEntered
       N1100.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_N1100MouseEntered

    private void N1100MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_N1100MouseExited
        N1100.setBorder(null);
    }//GEN-LAST:event_N1100MouseExited

    private void N1130MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_N1130MouseEntered
        N1130.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_N1130MouseEntered

    private void N1130MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_N1130MouseExited
        N1130.setBorder(null);
    }//GEN-LAST:event_N1130MouseExited

    private void N1200MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_N1200MouseEntered
        N1200.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_N1200MouseEntered

    private void N1200MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_N1200MouseExited
        N1200.setBorder(null);
    }//GEN-LAST:event_N1200MouseExited

    private void N1000MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_N1000MouseExited
        N1000.setBorder(null);
    }//GEN-LAST:event_N1000MouseExited

    private void N1230MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_N1230MouseEntered
        N1230.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_N1230MouseEntered

    private void N1230MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_N1230MouseExited
        N1230.setBorder(null);
    }//GEN-LAST:event_N1230MouseExited

    private void N1300MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_N1300MouseEntered
        N1300.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_N1300MouseEntered

    private void N1300MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_N1300MouseExited
        N1300.setBorder(null);
    }//GEN-LAST:event_N1300MouseExited

    private void N1330MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_N1330MouseEntered
        N1330.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_N1330MouseEntered

    private void N1330MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_N1330MouseExited
        N1330.setBorder(null);
    }//GEN-LAST:event_N1330MouseExited

    private void N1400MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_N1400MouseEntered
        N1400.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_N1400MouseEntered

    private void N1400MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_N1400MouseExited
        N1400.setBorder(null);
    }//GEN-LAST:event_N1400MouseExited

    private void N1430MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_N1430MouseEntered
        N1430.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_N1430MouseEntered

    private void N1430MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_N1430MouseExited
        N1430.setBorder(null);
    }//GEN-LAST:event_N1430MouseExited

    private void N1500MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_N1500MouseEntered
        N1500.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_N1500MouseEntered

    private void N1500MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_N1500MouseExited
        N1500.setBorder(null);
    }//GEN-LAST:event_N1500MouseExited

    private void N1530MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_N1530MouseEntered
        N1530.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_N1530MouseEntered

    private void N1530MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_N1530MouseExited
        N1530.setBorder(null);
    }//GEN-LAST:event_N1530MouseExited

    private void N1600MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_N1600MouseEntered
        N1600.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_N1600MouseEntered

    private void N1600MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_N1600MouseExited
        N1600.setBorder(null);
    }//GEN-LAST:event_N1600MouseExited

    private void N1630MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_N1630MouseEntered
        N1630.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_N1630MouseEntered

    private void N1630MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_N1630MouseExited
        N1630.setBorder(null);
    }//GEN-LAST:event_N1630MouseExited

    private void N1700MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_N1700MouseEntered
        N1700.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_N1700MouseEntered

    private void N1700MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_N1700MouseExited
        N1700.setBorder(null);
    }//GEN-LAST:event_N1700MouseExited

    private void N1730MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_N1730MouseEntered
        N1730.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_N1730MouseEntered

    private void N1730MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_N1730MouseExited
        N1730.setBorder(null);
    }//GEN-LAST:event_N1730MouseExited

    private void N1800MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_N1800MouseEntered
        N1800.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_N1800MouseEntered

    private void N1800MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_N1800MouseExited
        N1800.setBorder(null);
    }//GEN-LAST:event_N1800MouseExited

    private void N1830MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_N1830MouseEntered
        N1830.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_N1830MouseEntered

    private void N1830MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_N1830MouseExited
        N1830.setBorder(null);
    }//GEN-LAST:event_N1830MouseExited

    private void N1900MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_N1900MouseEntered
        N1900.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_N1900MouseEntered

    private void N1900MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_N1900MouseExited
        N1900.setBorder(null);
    }//GEN-LAST:event_N1900MouseExited

    private void N1930MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_N1930MouseEntered
        N1930.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_N1930MouseEntered

    private void N1930MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_N1930MouseExited
        N1930.setBorder(null);
    }//GEN-LAST:event_N1930MouseExited

    private void N2000MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_N2000MouseEntered
        N2000.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_N2000MouseEntered

    private void N2000MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_N2000MouseExited
        N2000.setBorder(null);
    }//GEN-LAST:event_N2000MouseExited

    private void N2030MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_N2030MouseEntered
        N2030.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_N2030MouseEntered

    private void N2030MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_N2030MouseExited
        N2030.setBorder(null);
    }//GEN-LAST:event_N2030MouseExited

    private void N2100MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_N2100MouseEntered
        N2100.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_N2100MouseEntered

    private void N2100MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_N2100MouseExited
        N2100.setBorder(null);
    }//GEN-LAST:event_N2100MouseExited

    private void S930MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_S930MouseEntered
        S930.setToolTipText(S930.getText());
    }//GEN-LAST:event_S930MouseEntered

    private void S1000MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_S1000MouseEntered
        S1000.setToolTipText(S1000.getText());
    }//GEN-LAST:event_S1000MouseEntered

    private void S1030MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_S1030MouseEntered
        S1030.setToolTipText(S1030.getText());
    }//GEN-LAST:event_S1030MouseEntered

    private void S1100MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_S1100MouseEntered
        S1100.setToolTipText(S1100.getText());
    }//GEN-LAST:event_S1100MouseEntered

    private void S1130MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_S1130MouseEntered
        S1130.setToolTipText(S1130.getText());
    }//GEN-LAST:event_S1130MouseEntered

    private void S1200MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_S1200MouseEntered
        S1200.setToolTipText(S1200.getText());
    }//GEN-LAST:event_S1200MouseEntered

    private void S1230MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_S1230MouseEntered
        S1230.setToolTipText(S1230.getText());
    }//GEN-LAST:event_S1230MouseEntered

    private void S1300MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_S1300MouseEntered
        S1300.setToolTipText(S930.getText());
    }//GEN-LAST:event_S1300MouseEntered

    private void S1330MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_S1330MouseEntered
        S1330.setToolTipText(S1330.getText());
    }//GEN-LAST:event_S1330MouseEntered

    private void S1400MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_S1400MouseEntered
        S1400.setToolTipText(S1400.getText());
    }//GEN-LAST:event_S1400MouseEntered

    private void S1430MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_S1430MouseEntered
        S1430.setToolTipText(S1430.getText());
    }//GEN-LAST:event_S1430MouseEntered

    private void S1500MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_S1500MouseEntered
        S1500.setToolTipText(S1500.getText());
    }//GEN-LAST:event_S1500MouseEntered

    private void S1530MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_S1530MouseEntered
        S1530.setToolTipText(S1530.getText());
    }//GEN-LAST:event_S1530MouseEntered

    private void S1600MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_S1600MouseEntered
        S1600.setToolTipText(S1600.getText());
    }//GEN-LAST:event_S1600MouseEntered

    private void S1630MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_S1630MouseEntered
        S1630.setToolTipText(S1630.getText());
    }//GEN-LAST:event_S1630MouseEntered

    private void S1700MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_S1700MouseEntered
        S1700.setToolTipText(S1700.getText());
    }//GEN-LAST:event_S1700MouseEntered

    private void S1730MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_S1730MouseEntered
        S1730.setToolTipText(S1730.getText());
    }//GEN-LAST:event_S1730MouseEntered

    private void S1800MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_S1800MouseEntered
        S1800.setToolTipText(S1800.getText());
    }//GEN-LAST:event_S1800MouseEntered

    private void S1830MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_S1830MouseEntered
        S1830.setToolTipText(S1830.getText());
    }//GEN-LAST:event_S1830MouseEntered

    private void S1900MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_S1900MouseEntered
        S1900.setToolTipText(S1900.getText());
    }//GEN-LAST:event_S1900MouseEntered

    private void S1930MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_S1930MouseEntered
        S1930.setToolTipText(S1930.getText());
    }//GEN-LAST:event_S1930MouseEntered

    private void S2000MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_S2000MouseEntered
        S2000.setToolTipText(S2000.getText());
    }//GEN-LAST:event_S2000MouseEntered

    private void S2030MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_S2030MouseEntered
        S2030.setToolTipText(S2030.getText());
    }//GEN-LAST:event_S2030MouseEntered

    private void S2100MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_S2100MouseEntered
        S2100.setToolTipText(S2100.getText());
    }//GEN-LAST:event_S2100MouseEntered

    private void jMenu12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu12ActionPerformed
//        ModoExibicao = "WindowsButton";
//        RETIRABORDA();
    }//GEN-LAST:event_jMenu12ActionPerformed

    private void jRadioButtonMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem1ActionPerformed
//        ModoExibicao = "MetalButton";
//        RETIRABORDA();
//        MODOEXIBICAO();
    }//GEN-LAST:event_jRadioButtonMenuItem1ActionPerformed

    private void jRadioButtonMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem2ActionPerformed
//        ModoExibicao = "MotiButton";
//        MODOEXIBICAO();
//        RETIRABORDA();
    }//GEN-LAST:event_jRadioButtonMenuItem2ActionPerformed

    private void jRadioButtonMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem3ActionPerformed
//        ModoExibicao = "WindowsButton";
//        RETIRABORDA();
//        MODOEXIBICAO();
    }//GEN-LAST:event_jRadioButtonMenuItem3ActionPerformed

    private void jRadioButtonMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem4ActionPerformed
//        ModoExibicao = "NimbusButton";
//        RETIRABORDA();
//        MODOEXIBICAO();
    }//GEN-LAST:event_jRadioButtonMenuItem4ActionPerformed

    private void N930MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_N930MouseClicked
        AGENDAMENTO dialog = new AGENDAMENTO(new javax.swing.JFrame(), true);
        HoraAgendamento = L930.getText();
        NomeAgendamento = N930.getText();
        ServicoAgendamento = S930.getText();
        ObservacaoAgendamento = Obs930;
        CodAgendamento = Cod930;
        SETADIAAGENDAMENTO();
        N930.setBackground(Color.LIGHT_GRAY);
        if (T930.getText().equals("")) {
            ChamaAgenda = 0; //GRAVA O AGENDAMENTO
        } else if (T930.getText().equals("1"))
            ChamaAgenda = 1; //GRAVA O AGENDAMENTO SIMPLES
        else {
            ChamaAgenda = 2; //GRAVA O AGENDAMENTO DE UMA TABELA
        } 
        dialog.MostraAgendaGravacao(this);
        N930.setBackground(Color.WHITE);
    }//GEN-LAST:event_N930MouseClicked

    private void N1000MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_N1000MouseClicked
        AGENDAMENTO dialog = new AGENDAMENTO(new javax.swing.JFrame(), true);
        HoraAgendamento = L1000.getText();
        NomeAgendamento = N1000.getText();
        ServicoAgendamento = S1000.getText();
        ObservacaoAgendamento = Obs1000;
        CodAgendamento = Cod1000;
        SETADIAAGENDAMENTO();
        N1000.setBackground(Color.LIGHT_GRAY);
        if (T1000.getText().equals("")) {
            ChamaAgenda = 0; //GRAVA O AGENDAMENTO
        } else if (T1000.getText().equals("1"))
            ChamaAgenda = 1; //GRAVA O AGENDAMENTO SIMPLES
        else {
            ChamaAgenda = 2; //GRAVA O AGENDAMENTO DE UMA TABELA
        } 
        dialog.MostraAgendaGravacao(this);
        N1000.setBackground(Color.WHITE);
    }//GEN-LAST:event_N1000MouseClicked

    private void N1030MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_N1030MouseClicked
        AGENDAMENTO dialog = new AGENDAMENTO(new javax.swing.JFrame(), true);
        HoraAgendamento = L1030.getText();
        NomeAgendamento = N1030.getText();
        ServicoAgendamento = S1030.getText();
        ObservacaoAgendamento = Obs1030;
        CodAgendamento = Cod1030;
        SETADIAAGENDAMENTO();
        N1030.setBackground(Color.LIGHT_GRAY);
        if (T1030.getText().equals("")) {
            ChamaAgenda = 0; //GRAVA O AGENDAMENTO
        } else if (T1030.getText().equals("1"))
            ChamaAgenda = 1; //GRAVA O AGENDAMENTO SIMPLES
        else {
            ChamaAgenda = 2; //GRAVA O AGENDAMENTO DE UMA TABELA
        } 
        dialog.MostraAgendaGravacao(this);
        N1030.setBackground(Color.WHITE); 
    }//GEN-LAST:event_N1030MouseClicked

    private void N1100MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_N1100MouseClicked
        AGENDAMENTO dialog = new AGENDAMENTO(new javax.swing.JFrame(), true);
        HoraAgendamento = L1100.getText();
        NomeAgendamento = N1100.getText();
        ServicoAgendamento = S1100.getText();
        ObservacaoAgendamento = Obs1100;
        CodAgendamento = Cod1100;
        SETADIAAGENDAMENTO();
        N1100.setBackground(Color.LIGHT_GRAY);
        if (T1100.getText().equals("")) {
            ChamaAgenda = 0; //GRAVA O AGENDAMENTO
        } else if (T1100.getText().equals("1"))
            ChamaAgenda = 1; //GRAVA O AGENDAMENTO SIMPLES
        else {
            ChamaAgenda = 2; //GRAVA O AGENDAMENTO DE UMA TABELA
        } 
        dialog.MostraAgendaGravacao(this);
        N1100.setBackground(Color.WHITE);
    }//GEN-LAST:event_N1100MouseClicked

    private void N1130MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_N1130MouseClicked
        AGENDAMENTO dialog = new AGENDAMENTO(new javax.swing.JFrame(), true);
        HoraAgendamento = L1130.getText();
        NomeAgendamento = N1130.getText();
        ServicoAgendamento = S1130.getText();
        ObservacaoAgendamento = Obs1130;
        CodAgendamento = Cod1130;
        SETADIAAGENDAMENTO();
        N1130.setBackground(Color.LIGHT_GRAY);
        if (T1130.getText().equals("")) {
            ChamaAgenda = 0; //GRAVA O AGENDAMENTO
        } else if (T1130.getText().equals("1"))
            ChamaAgenda = 1; //GRAVA O AGENDAMENTO SIMPLES
        else {
            ChamaAgenda = 2; //GRAVA O AGENDAMENTO DE UMA TABELA
        } 
        dialog.MostraAgendaGravacao(this);
        N1130.setBackground(Color.WHITE); 
    }//GEN-LAST:event_N1130MouseClicked

    private void N1200MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_N1200MouseClicked
        AGENDAMENTO dialog = new AGENDAMENTO(new javax.swing.JFrame(), true);
        HoraAgendamento = L1200.getText();
        NomeAgendamento = N1200.getText();
        ServicoAgendamento = S1200.getText();
        ObservacaoAgendamento = Obs1200;
        CodAgendamento = Cod1200;
        SETADIAAGENDAMENTO();
        N1200.setBackground(Color.LIGHT_GRAY);
        if (T1200.getText().equals("")) {
            ChamaAgenda = 0; //GRAVA O AGENDAMENTO
        } else if (T1200.getText().equals("1"))
            ChamaAgenda = 1; //GRAVA O AGENDAMENTO SIMPLES
        else {
            ChamaAgenda = 2; //GRAVA O AGENDAMENTO DE UMA TABELA
        } 
        dialog.MostraAgendaGravacao(this);
        N1200.setBackground(Color.WHITE); 
    }//GEN-LAST:event_N1200MouseClicked

    private void N1230MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_N1230MouseClicked
        AGENDAMENTO dialog = new AGENDAMENTO(new javax.swing.JFrame(), true);
        HoraAgendamento = L1230.getText();
        NomeAgendamento = N1230.getText();
        ServicoAgendamento = S1230.getText();
        ObservacaoAgendamento = Obs1230;
        CodAgendamento = Cod1230;
        SETADIAAGENDAMENTO();
        N1230.setBackground(Color.LIGHT_GRAY);
        if (T1230.getText().equals("")) {
            ChamaAgenda = 0; //GRAVA O AGENDAMENTO
        } else if (T1230.getText().equals("1"))
            ChamaAgenda = 1; //GRAVA O AGENDAMENTO SIMPLES
        else {
            ChamaAgenda = 2; //GRAVA O AGENDAMENTO DE UMA TABELA
        } 
        dialog.MostraAgendaGravacao(this);
        N1230.setBackground(Color.WHITE); 
    }//GEN-LAST:event_N1230MouseClicked

    private void N1300MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_N1300MouseClicked
        AGENDAMENTO dialog = new AGENDAMENTO(new javax.swing.JFrame(), true);
        HoraAgendamento = L1300.getText();
        NomeAgendamento = N1300.getText();
        ServicoAgendamento = S1300.getText();
        ObservacaoAgendamento = Obs1300;
        CodAgendamento = Cod1300;
        SETADIAAGENDAMENTO();
        N1300.setBackground(Color.LIGHT_GRAY);
        if (T1300.getText().equals("")) {
            ChamaAgenda = 0; //GRAVA O AGENDAMENTO
        } else if (T1300.getText().equals("1"))
            ChamaAgenda = 1; //GRAVA O AGENDAMENTO SIMPLES
        else {
            ChamaAgenda = 2; //GRAVA O AGENDAMENTO DE UMA TABELA
        } 
        dialog.MostraAgendaGravacao(this);
        N1300.setBackground(Color.WHITE); 
    }//GEN-LAST:event_N1300MouseClicked

    private void N1330MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_N1330MouseClicked
        AGENDAMENTO dialog = new AGENDAMENTO(new javax.swing.JFrame(), true);
        HoraAgendamento = L1330.getText();
        NomeAgendamento = N1330.getText();
        ServicoAgendamento = S1330.getText();
        ObservacaoAgendamento = Obs1330;
        CodAgendamento = Cod1330;
        SETADIAAGENDAMENTO();
        N1330.setBackground(Color.LIGHT_GRAY);
        if (T1330.getText().equals("")) {
            ChamaAgenda = 0; //GRAVA O AGENDAMENTO
        } else if (T1330.getText().equals("1"))
            ChamaAgenda = 1; //GRAVA O AGENDAMENTO SIMPLES
        else {
            ChamaAgenda = 2; //GRAVA O AGENDAMENTO DE UMA TABELA
        } 
        dialog.MostraAgendaGravacao(this);
        N1330.setBackground(Color.WHITE); 
    }//GEN-LAST:event_N1330MouseClicked

    private void N1400MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_N1400MouseClicked
        AGENDAMENTO dialog = new AGENDAMENTO(new javax.swing.JFrame(), true);
        HoraAgendamento = L1400.getText();
        NomeAgendamento = N1400.getText();
        ServicoAgendamento = S1400.getText();
        ObservacaoAgendamento = Obs1400;
        CodAgendamento = Cod1400;
        SETADIAAGENDAMENTO();
        N1400.setBackground(Color.LIGHT_GRAY);
        if (T1400.getText().equals("")) {
            ChamaAgenda = 0; //GRAVA O AGENDAMENTO
        } else if (T1400.getText().equals("1"))
            ChamaAgenda = 1; //GRAVA O AGENDAMENTO SIMPLES
        else {
            ChamaAgenda = 2; //GRAVA O AGENDAMENTO DE UMA TABELA
        } 
        dialog.MostraAgendaGravacao(this);
        N1400.setBackground(Color.WHITE); 
    }//GEN-LAST:event_N1400MouseClicked

    private void N1430MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_N1430MouseClicked
        AGENDAMENTO dialog = new AGENDAMENTO(new javax.swing.JFrame(), true);
        HoraAgendamento = L1430.getText();
        NomeAgendamento = N1430.getText();
        ServicoAgendamento = S1430.getText();
        ObservacaoAgendamento = Obs1430;
        CodAgendamento = Cod1430;
        SETADIAAGENDAMENTO();
        N1430.setBackground(Color.LIGHT_GRAY);
        if (T1430.getText().equals("")) {
            ChamaAgenda = 0; //GRAVA O AGENDAMENTO
        } else if (T1430.getText().equals("1"))
            ChamaAgenda = 1; //GRAVA O AGENDAMENTO SIMPLES
        else {
            ChamaAgenda = 2; //GRAVA O AGENDAMENTO DE UMA TABELA
        } 
        dialog.MostraAgendaGravacao(this);
        N1430.setBackground(Color.WHITE); 
    }//GEN-LAST:event_N1430MouseClicked

    private void N1500MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_N1500MouseClicked
        AGENDAMENTO dialog = new AGENDAMENTO(new javax.swing.JFrame(), true);
        HoraAgendamento = L1500.getText();
        NomeAgendamento = N1500.getText();
        ServicoAgendamento = S1500.getText();
        ObservacaoAgendamento = Obs1500;
        CodAgendamento = Cod1500;
        SETADIAAGENDAMENTO();
        N1500.setBackground(Color.LIGHT_GRAY);
        if (T1500.getText().equals("")) {
            ChamaAgenda = 0; //GRAVA O AGENDAMENTO
        } else if (T1500.getText().equals("1"))
            ChamaAgenda = 1; //GRAVA O AGENDAMENTO SIMPLES
        else {
            ChamaAgenda = 2; //GRAVA O AGENDAMENTO DE UMA TABELA
        } 
        dialog.MostraAgendaGravacao(this);
        N1500.setBackground(Color.WHITE); 
    }//GEN-LAST:event_N1500MouseClicked

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
            java.util.logging.Logger.getLogger(PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PRINCIPAL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Animacao;
    private javax.swing.JLabel AnoPagina1;
    private javax.swing.JLabel AnoPagina2;
    private javax.swing.JLabel DiaPagina1;
    private javax.swing.JLabel DiaPagina2;
    private javax.swing.JLabel L1000;
    private javax.swing.JLabel L1030;
    private javax.swing.JLabel L1100;
    private javax.swing.JLabel L1130;
    private javax.swing.JLabel L1200;
    private javax.swing.JLabel L1230;
    private javax.swing.JLabel L1300;
    private javax.swing.JLabel L1330;
    private javax.swing.JLabel L1400;
    private javax.swing.JLabel L1430;
    private javax.swing.JLabel L1500;
    private javax.swing.JLabel L1530;
    private javax.swing.JLabel L1600;
    private javax.swing.JLabel L1630;
    private javax.swing.JLabel L1700;
    private javax.swing.JLabel L1730;
    private javax.swing.JLabel L1800;
    private javax.swing.JLabel L1830;
    private javax.swing.JLabel L1900;
    private javax.swing.JLabel L1930;
    private javax.swing.JLabel L2000;
    private javax.swing.JLabel L2030;
    private javax.swing.JLabel L2100;
    private javax.swing.JLabel L930;
    private javax.swing.JLabel MesPagina1;
    private javax.swing.JLabel MesPagina2;
    private javax.swing.JTextField N1000;
    private javax.swing.JTextField N1030;
    private javax.swing.JTextField N1100;
    private javax.swing.JTextField N1130;
    private javax.swing.JTextField N1200;
    private javax.swing.JTextField N1230;
    private javax.swing.JTextField N1300;
    private javax.swing.JTextField N1330;
    private javax.swing.JTextField N1400;
    private javax.swing.JTextField N1430;
    private javax.swing.JTextField N1500;
    private javax.swing.JTextField N1530;
    private javax.swing.JTextField N1600;
    private javax.swing.JTextField N1630;
    private javax.swing.JTextField N1700;
    private javax.swing.JTextField N1730;
    private javax.swing.JTextField N1800;
    private javax.swing.JTextField N1830;
    private javax.swing.JTextField N1900;
    private javax.swing.JTextField N1930;
    private javax.swing.JTextField N2000;
    private javax.swing.JTextField N2030;
    private javax.swing.JTextField N2100;
    private javax.swing.JTextField N930;
    private javax.swing.JTextField S1000;
    private javax.swing.JTextField S1030;
    private javax.swing.JTextField S1100;
    private javax.swing.JTextField S1130;
    private javax.swing.JTextField S1200;
    private javax.swing.JTextField S1230;
    private javax.swing.JTextField S1300;
    private javax.swing.JTextField S1330;
    private javax.swing.JTextField S1400;
    private javax.swing.JTextField S1430;
    private javax.swing.JTextField S1500;
    private javax.swing.JTextField S1530;
    private javax.swing.JTextField S1600;
    private javax.swing.JTextField S1630;
    private javax.swing.JTextField S1700;
    private javax.swing.JTextField S1730;
    private javax.swing.JTextField S1800;
    private javax.swing.JTextField S1830;
    private javax.swing.JTextField S1900;
    private javax.swing.JTextField S1930;
    private javax.swing.JTextField S2000;
    private javax.swing.JTextField S2030;
    private javax.swing.JTextField S2100;
    private javax.swing.JTextField S930;
    private javax.swing.JComboBox SelecaoAno;
    private javax.swing.JComboBox<String> SelecaoMes;
    private javax.swing.JLabel SemanaPagina1;
    private javax.swing.JLabel SemanaPagina2;
    private javax.swing.JLabel T1000;
    private javax.swing.JLabel T1030;
    private javax.swing.JLabel T1100;
    private javax.swing.JLabel T1130;
    private javax.swing.JLabel T1200;
    private javax.swing.JLabel T1230;
    private javax.swing.JLabel T1300;
    private javax.swing.JLabel T1330;
    private javax.swing.JLabel T1400;
    private javax.swing.JLabel T1430;
    private javax.swing.JLabel T1500;
    private javax.swing.JLabel T1530;
    private javax.swing.JLabel T1600;
    private javax.swing.JLabel T1630;
    private javax.swing.JLabel T1700;
    private javax.swing.JLabel T1730;
    private javax.swing.JLabel T1800;
    private javax.swing.JLabel T1830;
    private javax.swing.JLabel T1900;
    private javax.swing.JLabel T1930;
    private javax.swing.JLabel T2000;
    private javax.swing.JLabel T2030;
    private javax.swing.JLabel T2100;
    private javax.swing.JLabel T930;
    private javax.swing.JButton VoltarDataInicial;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem3;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel ls1;
    private javax.swing.JLabel ls2;
    private javax.swing.JLabel ls3;
    private javax.swing.JLabel ls4;
    private javax.swing.JLabel ls5;
    private javax.swing.JLabel ls6;
    private javax.swing.JLabel ls7;
    private javax.swing.JLabel t1;
    private javax.swing.JLabel t10;
    private javax.swing.JLabel t11;
    private javax.swing.JLabel t12;
    private javax.swing.JLabel t13;
    private javax.swing.JLabel t14;
    private javax.swing.JLabel t15;
    private javax.swing.JLabel t16;
    private javax.swing.JLabel t17;
    private javax.swing.JLabel t18;
    private javax.swing.JLabel t19;
    private javax.swing.JLabel t2;
    private javax.swing.JLabel t20;
    private javax.swing.JLabel t21;
    private javax.swing.JLabel t22;
    private javax.swing.JLabel t23;
    private javax.swing.JLabel t24;
    private javax.swing.JLabel t25;
    private javax.swing.JLabel t26;
    private javax.swing.JLabel t27;
    private javax.swing.JLabel t28;
    private javax.swing.JLabel t29;
    private javax.swing.JLabel t3;
    private javax.swing.JLabel t30;
    private javax.swing.JLabel t31;
    private javax.swing.JLabel t32;
    private javax.swing.JLabel t33;
    private javax.swing.JLabel t34;
    private javax.swing.JLabel t35;
    private javax.swing.JLabel t36;
    private javax.swing.JLabel t37;
    private javax.swing.JLabel t38;
    private javax.swing.JLabel t39;
    private javax.swing.JLabel t4;
    private javax.swing.JLabel t40;
    private javax.swing.JLabel t41;
    private javax.swing.JLabel t42;
    private javax.swing.JLabel t5;
    private javax.swing.JLabel t6;
    private javax.swing.JLabel t7;
    private javax.swing.JLabel t8;
    private javax.swing.JLabel t9;
    // End of variables declaration//GEN-END:variables

//public void MODOEXIBICAO() {
//    String plaf = "";
//    if("MetalButton".equals(ModoExibicao)) {
//        plaf = "javax.swing.plaf.metal.MetalLookAndFeel";
//    } else if ("MotifButton".equals(ModoExibicao)) {
//        plaf = "com.sun.java.swing.plaf.motif.MotifLookAndFeel";
//    } else if ("WindowsButton".equals(ModoExibicao)) {
//        plaf = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
//    } else if ("MacButton".equals(ModoExibicao)) {
//        plaf = "com.sun.java.swing.plaf.mac.MacLookAndFeel";
//    } else if ("Nimbus".equals(ModoExibicao)) {
//        plaf = "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel";
//    }
//    
//    try {
//        UIManager.setLookAndFeel (plaf);
//        SwingUtilities.updateComponentTreeUI(this);
//    } catch (Exception e) {
//        
//    }
//}    
    
    
//construçao do calendario
public void INICIACALENDARIO() { //alteração do formato para data
        SimpleDateFormat Ano = new SimpleDateFormat("yyyy");
        SimpleDateFormat Mes = new SimpleDateFormat("MM");
        SimpleDateFormat Dia = new SimpleDateFormat("dd");
        
        AnoFIXO = Integer.parseInt(Ano.format(new Date()));
        MesFIXO = Integer.parseInt(Mes.format(new Date()));
        DiaFIXO = Integer.parseInt(Dia.format(new Date()));
        

        int AnoMaximo = AnoFIXO + 6; //a soma do valor de 2020 + ano atual + 5anos
        for (int i=2020; i < AnoMaximo; i++) {
            SelecaoAno.addItem(i);
        }
        
        SelecaoAno.setSelectedItem(AnoFIXO);
        
       if (MesFIXO == 1) { //se caso selecionar o mes vigente, assume pelo jframe
            SelecaoMes.setSelectedIndex(0);
        } else if (MesFIXO == 2) {
            SelecaoMes.setSelectedIndex(1);
        } else if (MesFIXO == 3) {
            SelecaoMes.setSelectedIndex(2);
        } else if (MesFIXO == 4) {
            SelecaoMes.setSelectedIndex(3);
        } else if (MesFIXO == 5) {
            SelecaoMes.setSelectedIndex(4);
        } else if (MesFIXO == 6) {
            SelecaoMes.setSelectedIndex(5);
        } else if (MesFIXO == 7) {
            SelecaoMes.setSelectedIndex(6);
        } else if (MesFIXO == 8) {
            SelecaoMes.setSelectedIndex(7);
        } else if (MesFIXO == 9) {
            SelecaoMes.setSelectedIndex(8);
        } else if (MesFIXO == 10) {
            SelecaoMes.setSelectedIndex(9);
        } else if (MesFIXO == 11) {
            SelecaoMes.setSelectedIndex(10);
        } else if (MesFIXO == 12) {
            SelecaoMes.setSelectedIndex(11);
        }
       
 }
        
public void CALENDARIO() {
        t1.setText("");
        t10.setText("");
        t11.setText("");
        t12.setText("");
        t13.setText("");
        t14.setText("");
        t15.setText("");
        t16.setText("");
        t17.setText("");
        t18.setText("");
        t19.setText("");
        t2.setText("");
        t20.setText("");
        t21.setText("");
        t22.setText("");
        t23.setText("");
        t24.setText("");
        t25.setText("");
        t26.setText("");
        t27.setText("");
        t28.setText("");
        t29.setText("");
        t3.setText("");
        t30.setText("");
        t31.setText("");
        t32.setText("");
        t33.setText("");
        t34.setText("");
        t35.setText("");
        t36.setText("");
        t37.setText("");
        t38.setText("");
        t39.setText("");
        t4.setText("");
        t40.setText("");
        t41.setText("");
        t42.setText("");
        t5.setText("");
        t6.setText("");
        t7.setText("");
        t8.setText("");
        t9.setText("");
        
        DiaAltera = DiaFIXO;
        MesAltera = SelecaoMes.getSelectedIndex(); //é utilizado para obter o índice do item selecionado nes que caso, o mes
        AnoAltera = Integer.parseInt(SelecaoAno.getSelectedItem().toString());
        
        int TotalDiaMes = 0; //selecionar os dias do mes vigente
        if (MesAltera == 0) {
            TotalDiaMes = 31;
        } else if (MesAltera == 1) {
            int resultado = (AnoAltera % 4);
            if (resultado == 0) {
                TotalDiaMes = 29; //Ano Bissexto
            } else {
                TotalDiaMes = 28; //Ano nao Bissexto
            }
        } else if (MesAltera == 2 ) {
            TotalDiaMes = 31;
        } else if (MesAltera == 3 ) {
            TotalDiaMes = 30;
        } else if (MesAltera == 4 ) {
            TotalDiaMes = 31;
        } else if (MesAltera == 5 ) {
            TotalDiaMes = 30;
        } else if (MesAltera == 6 ) {
            TotalDiaMes = 31;
        } else if (MesAltera == 7 ) {
            TotalDiaMes = 31;
        } else if (MesAltera == 8 ) {
            TotalDiaMes = 30;
        } else if (MesAltera == 9 ) {
            TotalDiaMes = 31;
        } else if (MesAltera == 10 ) {
            TotalDiaMes = 30;
        } else if (MesAltera == 11 ) {
            TotalDiaMes = 31;
        }
    
        Calendar calendar = Calendar.getInstance(); //intancia o calendario e converte no dia do mes se desejar
        calendar.set(AnoAltera, MesAltera, 1);
        int SetaDia = 0;

        int Semana = calendar.get(Calendar.DAY_OF_WEEK); //escolhi dias da semana para apresentar no formulario
        if (Semana == Calendar.SUNDAY) {
            SetaDia = 1; //Dom
        } else if (Semana == Calendar.MONDAY) {
            SetaDia = 2; //Seg
        } else if (Semana == Calendar.TUESDAY) {
            SetaDia = 3; //Ter
        } else if (Semana == Calendar.WEDNESDAY) {
            SetaDia = 4; //Qua
        } else if (Semana == Calendar.THURSDAY) {
            SetaDia = 4; //Qui
        } else if (Semana == Calendar.FRIDAY) {
            SetaDia = 5; //Sex
        } else if (Semana == Calendar.SATURDAY) {
            SetaDia = 6; //Sab
        }
        
        for(int i=1; i<=TotalDiaMes; i++) {// Laço de repetiçao para preenche os dias do mes vigente
        switch (SetaDia) {
            case 1:
                t1.setText("" + i);
                break;
            case 2:
                t2.setText("" + i);
                if (i == DiaFIXO & MesAltera == MesFIXO - 1 & AnoAltera == AnoFIXO) { //sublinhar de vermelho o dia vigente
                    t2.setForeground(Color.red);
                } else {
                    t2.setForeground(Color.black);
                }
                break;
            case 3:
                t3.setText("" + i);
                if (i == DiaFIXO & MesAltera == MesFIXO - 1 & AnoAltera == AnoFIXO) {
                    t3.setForeground(Color.red);
                } else {
                    t3.setForeground(Color.black);
                }
                break;
            case 4:
                t4.setText("" + i);
                if (i == DiaFIXO & MesAltera == MesFIXO - 1 & AnoAltera == AnoFIXO) {
                    t4.setForeground(Color.red);
                } else {
                    t4.setForeground(Color.black);
                }
                break;
            case 5:
                t5.setText("" + i);
                if (i == DiaFIXO & MesAltera == MesFIXO - 1 & AnoAltera == AnoFIXO) {
                    t5.setForeground(Color.red);
                } else {
                    t5.setForeground(Color.black);
                }
                break;
            case 6:
                t6.setText("" + i);
                if (i == DiaFIXO & MesAltera == MesFIXO - 1 & AnoAltera == AnoFIXO) {
                    t6.setForeground(Color.red);
                } else {
                    t6.setForeground(Color.black);
                }
                break;
            case 7:
                t7.setText("" + i);
                if (i == DiaFIXO & MesAltera == MesFIXO - 1 & AnoAltera == AnoFIXO) {
                    t7.setForeground(Color.red);
                } else {
                    t7.setForeground(Color.black);
                }
                break;
            case 8:
                t8.setText("" + i);
                break;
            case 9:
                t9.setText("" + i);
                if (i == DiaFIXO & MesAltera == MesFIXO - 1 & AnoAltera == AnoFIXO) {
                    t9.setForeground(Color.red);
                } else {
                    t9.setForeground(Color.black);
                }
                break;
            case 10:
                t10.setText("" + i);
                if (i == DiaFIXO & MesAltera == MesFIXO - 1 & AnoAltera == AnoFIXO) {
                    t10.setForeground(Color.red);
                } else {
                    t10.setForeground(Color.black);
                }
                break;
            case 11:
                t11.setText("" + i);
                if (i == DiaFIXO & MesAltera == MesFIXO - 1 & AnoAltera == AnoFIXO) {
                    t11.setForeground(Color.red);
                } else {
                    t11.setForeground(Color.black);
                }
                break;
            case 12:
                t12.setText("" + i);
                if (i == DiaFIXO & MesAltera == MesFIXO - 1 & AnoAltera == AnoFIXO) {
                    t12.setForeground(Color.red);
                } else {
                    t12.setForeground(Color.black);
                }
                break;
            case 13:
                t13.setText("" + i);
                if (i == DiaFIXO & MesAltera == MesFIXO - 1 & AnoAltera == AnoFIXO) {
                    t13.setForeground(Color.red);
                } else {
                    t13.setForeground(Color.black);
                }
                break;
            case 14:
                t14.setText("" + i);
                if (i == DiaFIXO & MesAltera == MesFIXO - 1 & AnoAltera == AnoFIXO) {
                    t14.setForeground(Color.red);
                } else {
                    t14.setForeground(Color.black);
                }
                break;
            case 15:
                t15.setText("" + i);
                break;
            case 16:
                t16.setText("" + i);
                if (i == DiaFIXO & MesAltera == MesFIXO - 1 & AnoAltera == AnoFIXO) {
                    t16.setForeground(Color.red);
                } else {
                    t16.setForeground(Color.black);
                }
                break;
            case 17:
                t17.setText("" + i);
                if (i == DiaFIXO & MesAltera == MesFIXO - 1 & AnoAltera == AnoFIXO) {
                    t17.setForeground(Color.red);
                } else {
                    t17.setForeground(Color.black);
                }
                break;
            case 18:
                t18.setText("" + i);
                if (i == DiaFIXO & MesAltera == MesFIXO - 1 & AnoAltera == AnoFIXO) {
                    t18.setForeground(Color.red);
                } else {
                    t18.setForeground(Color.black);
                }
                break;
            case 19:
                t19.setText("" + i);
                if (i == DiaFIXO & MesAltera == MesFIXO - 1 & AnoAltera == AnoFIXO) {
                    t19.setForeground(Color.red);
                } else {
                    t19.setForeground(Color.black);
                }
                break;
            case 20:    
               t20.setText("" + i);
                if (i == DiaFIXO & MesAltera == MesFIXO - 1 & AnoAltera == AnoFIXO) {
                    t20.setForeground(Color.red);
                } else {
                    t20.setForeground(Color.black);
                }
                break;
            case 21:
                t21.setText("" + i);
                if (i == DiaFIXO & MesAltera == MesFIXO - 1 & AnoAltera == AnoFIXO) {
                    t21.setForeground(Color.red);
                } else {
                    t21.setForeground(Color.black);
                }
                break;
            case 22:
                t22.setText("" + i);
                break;
            case 23:
                t23.setText("" + i);
                if (i == DiaFIXO & MesAltera == MesFIXO - 1 & AnoAltera == AnoFIXO) {
                    t23.setForeground(Color.red);
                } else {
                    t23.setForeground(Color.black);
                }
                break;
            case 24:
                t24.setText("" + i);
                if (i == DiaFIXO & MesAltera == MesFIXO - 1 & AnoAltera == AnoFIXO) {
                    t24.setForeground(Color.red);
                } else {
                    t24.setForeground(Color.black);
                }
                break;
            case 25:
                t25.setText("" + i);
                if (i == DiaFIXO & MesAltera == MesFIXO - 1 & AnoAltera == AnoFIXO) {
                    t25.setForeground(Color.red);
                } else {
                    t25.setForeground(Color.black);
                }    
                break;
            case 26:
                t26.setText("" + i);
                if (i == DiaFIXO & MesAltera == MesFIXO - 1 & AnoAltera == AnoFIXO) {
                    t26.setForeground(Color.red);
                } else {
                    t26.setForeground(Color.black);
                } 
                break;
            case 27:
                t27.setText("" + i);
                if (i == DiaFIXO & MesAltera == MesFIXO - 1 & AnoAltera == AnoFIXO) {
                    t27.setForeground(Color.red);
                } else {
                    t27.setForeground(Color.black);
                } 
                break;
            case 28:
                t28.setText("" + i);
                if (i == DiaFIXO & MesAltera == MesFIXO - 1 & AnoAltera == AnoFIXO) {
                    t28.setForeground(Color.red);
                } else {
                    t28.setForeground(Color.black);
                } 
                break;
            case 29:
                t29.setText("" + i);
                break;
            case 30:
                t30.setText("" + i);
                t30.setText("" + i);
                if (i == DiaFIXO & MesAltera == MesFIXO - 1 & AnoAltera == AnoFIXO) {
                    t30.setForeground(Color.red);
                } else {
                    t30.setForeground(Color.black);
                }
                break;
            case 31:
                t31.setText("" + i);
                if (i == DiaFIXO & MesAltera == MesFIXO - 1 & AnoAltera == AnoFIXO) {
                    t31.setForeground(Color.red);
                } else {
                    t31.setForeground(Color.black);
                }
                break;
            case 32:
                t32.setText("" + i);
                if (i == DiaFIXO & MesAltera == MesFIXO - 1 & AnoAltera == AnoFIXO) {
                    t32.setForeground(Color.red);
                } else {
                    t32.setForeground(Color.black);
                }
                break;
            case 33:
                t33.setText("" + i);
                if (i == DiaFIXO & MesAltera == MesFIXO - 1 & AnoAltera == AnoFIXO) {
                    t33.setForeground(Color.red);
                } else {
                    t33.setForeground(Color.black);
                }
                break;
            case 34:
                t34.setText("" + i);
                if (i == DiaFIXO & MesAltera == MesFIXO - 1 & AnoAltera == AnoFIXO) {
                    t34.setForeground(Color.red);
                } else {
                    t34.setForeground(Color.black);
                }
                break;
            case 35:
                t35.setText("" + i);
                if (i == DiaFIXO & MesAltera == MesFIXO - 1 & AnoAltera == AnoFIXO) {
                    t35.setForeground(Color.red);
                } else {
                    t35.setForeground(Color.black);
                }
                break;
            case 36:
                t36.setText("" + i);
                break;
            case 37:
                t37.setText("" + i);
                if (i == DiaFIXO & MesAltera == MesFIXO - 1 & AnoAltera == AnoFIXO) {
                    t37.setForeground(Color.red);
                } else {
                    t37.setForeground(Color.black);
                }
                break;
            case 38:
                t38.setText("" + i);
                if (i == DiaFIXO & MesAltera == MesFIXO - 1 & AnoAltera == AnoFIXO) {
                    t38.setForeground(Color.red);
                } else {
                    t38.setForeground(Color.black);
                }
                break;
            case 39:
                t39.setText("" + i);
                if (i == DiaFIXO & MesAltera == MesFIXO - 1 & AnoAltera == AnoFIXO) {
                    t39.setForeground(Color.red);
                } else {
                    t39.setForeground(Color.black);
                }
                break;
            case 40:
                t40.setText("" + i);
                if (i == DiaFIXO & MesAltera == MesFIXO - 1 & AnoAltera == AnoFIXO) {
                    t40.setForeground(Color.red);
                } else {
                    t40.setForeground(Color.black);
                }
                break;
            case 41:
                t41.setText("" + i);
                if (i == DiaFIXO & MesAltera == MesFIXO - 1 & AnoAltera == AnoFIXO) {
                    t41.setForeground(Color.red);
                } else {
                    t41.setForeground(Color.black);
                }
                break;
            case 42:
                t42.setText("" + i);
                if (i == DiaFIXO & MesAltera == MesFIXO - 1 & AnoAltera == AnoFIXO) {
                    t42.setForeground(Color.red);
                } else {
                    t42.setForeground(Color.black);
                }
                break;
                
            }  
        
        SetaDia++;
        
        }
        
    if (!"".equals(t1.getText())) {  //deixa o background do dia preenchido
            t1.setOpaque(true);
        } else {
            t1.setOpaque(false);
        }
        if (!"".equals(t2.getText())) { 
            t2.setOpaque(true);
        } else {
            t2.setOpaque(false);
        }
        if (!"".equals(t3.getText())) { 
            t3.setOpaque(true);
        } else {
            t3.setOpaque(false);
        }
        if (!"".equals(t4.getText())) { 
            t4.setOpaque(true);
        } else {
            t4.setOpaque(false);
        }
        if (!"".equals(t5.getText())) { 
            t5.setOpaque(true);
        } else {
            t5.setOpaque(false);
        }
        if (!"".equals(t6.getText())) { 
            t6.setOpaque(true);
        } else {
            t6.setOpaque(false);
        }
        if (!"".equals(t7.getText())) { 
            t7.setOpaque(true);
        } else {
            t7.setOpaque(false);
        }
        if (!"".equals(t8.getText())) { 
            t8.setOpaque(true);
        } else {
            t8.setOpaque(false);
        }
        if (!"".equals(t9.getText())) { 
            t9.setOpaque(true);
        } else {
            t9.setOpaque(false);
        }
        if (!"".equals(t10.getText())) { 
            t10.setOpaque(true);
        } else {
            t10.setOpaque(false);
        }
        if (!"".equals(t11.getText())) { 
            t11.setOpaque(true);
        } else {
            t11.setOpaque(false);
        }
        if (!"".equals(t12.getText())) { 
            t12.setOpaque(true);
        } else {
            t12.setOpaque(false);
        }
        if (!"".equals(t13.getText())) { 
            t13.setOpaque(true);
        } else {
            t13.setOpaque(false);
        }
        if (!"".equals(t14.getText())) { 
            t14.setOpaque(true);
        } else {
            t14.setOpaque(false);
        }
        if (!"".equals(t15.getText())) { 
            t15.setOpaque(true);
        } else {
            t15.setOpaque(false);
        }
        if (!"".equals(t16.getText())) { 
            t16.setOpaque(true);
        } else {
            t16.setOpaque(false);
        }
        if (!"".equals(t17.getText())) { 
            t17.setOpaque(true);
        } else {
            t17.setOpaque(false);
        }
        if (!"".equals(t18.getText())) { 
            t18.setOpaque(true);
        } else {
            t18.setOpaque(false);
        }
        if (!"".equals(t19.getText())) { 
            t19.setOpaque(true);
        } else {
            t19.setOpaque(false);
        }
        if (!"".equals(t20.getText())) { 
            t20.setOpaque(true);
        } else {
            t20.setOpaque(false);
        }
        if (!"".equals(t21.getText())) { 
            t21.setOpaque(true);
        } else {
            t21.setOpaque(false);
        }
        if (!"".equals(t22.getText())) { 
            t22.setOpaque(true);
        } else {
            t22.setOpaque(false);
        }
        if (!"".equals(t23.getText())) { 
            t23.setOpaque(true);
        } else {
            t23.setOpaque(false);
        }
        if (!"".equals(t24.getText())) { 
            t24.setOpaque(true);
        } else {
            t24.setOpaque(false);
        }
        if (!"".equals(t25.getText())) { 
            t25.setOpaque(true);
        } else {
            t25.setOpaque(false);
        }
        if (!"".equals(t26.getText())) { 
            t26.setOpaque(true);
        } else {
            t26.setOpaque(false);
        }
        if (!"".equals(t27.getText())) { 
            t27.setOpaque(true);
        } else {
            t27.setOpaque(false);
        }
        if (!"".equals(t28.getText())) { 
            t28.setOpaque(true);
        } else {
            t28.setOpaque(false);
        }
        if (!"".equals(t29.getText())) { 
            t29.setOpaque(true);
        } else {
            t29.setOpaque(false);
        }
        if (!"".equals(t30.getText())) { 
            t30.setOpaque(true);
        } else {
            t30.setOpaque(false);
        }
        if (!"".equals(t31.getText())) { 
            t31.setOpaque(true);
        } else {
            t31.setOpaque(false);
        }
        if (!"".equals(t32.getText())) { 
            t32.setOpaque(true);
        } else {
            t32.setOpaque(false);
        }
        if (!"".equals(t33.getText())) { 
            t33.setOpaque(true);
        } else {
            t33.setOpaque(false);
        }
        if (!"".equals(t34.getText())) { 
            t34.setOpaque(true);
        } else {
            t34.setOpaque(false);
        }
        if (!"".equals(t35.getText())) { 
            t35.setOpaque(true);
        } else {
            t35.setOpaque(false);
        }
        if (!"".equals(t36.getText())) { 
            t36.setOpaque(true);
        } else {
            t36.setOpaque(false);
        }
        if (!"".equals(t37.getText())) { 
            t37.setOpaque(true);
        } else {
            t37.setOpaque(false);
        }
        if (!"".equals(t38.getText())) { 
            t38.setOpaque(true);
        } else {
            t38.setOpaque(false);
        }
        if (!"".equals(t39.getText())) { 
            t39.setOpaque(true);
        } else {
            t39.setOpaque(false);
        }
        if (!"".equals(t40.getText())) { 
            t40.setOpaque(true);
        } else {
            t40.setOpaque(false);
        }
        if (!"".equals(t41.getText())) { 
            t41.setOpaque(true);
        } else {
            t41.setOpaque(false);
        }
        if (!"".equals(t42.getText())) { 
            t42.setOpaque(true);
        } else {
            t42.setOpaque(false);
        }    
        
        
    VERIFICASEMANA();
    }

public void VERIFICASEMANA() { //faz a verificação do dias da semana na pagina
   
    try {
        
//        if (MesAltera != MesFIXO - 1 & DiaClick != 0) {
//            DiaAltera = 1;
//        }
//        if (AnoAltera != MesFIXO - 1 & DiaClick != 0) {
//            DiaAltera = 1;
//        }
//        DiaClick = 1;
        
        if (DiaAltera == DiaFIXO & MesAltera + 1 == MesFIXO & AnoAltera == AnoFIXO) { //se tiver no dia atual fica vermelho
            DiaPagina2.setForeground(Color.RED);
            DiaPagina1.setForeground(Color.RED);
        } else {
            DiaPagina2.setForeground(Color.BLACK);
            DiaPagina1.setForeground(Color.BLACK);
        }
        
        
        MesAltera = SelecaoMes.getSelectedIndex();
        AnoAltera = Integer.parseInt(SelecaoAno.getSelectedItem().toString());

        Calendar calendarN = Calendar.getInstance();
        calendarN.set(AnoAltera, MesAltera, DiaAltera);

        MesPagina2.setText(SelecaoMes.getSelectedItem().toString());
        MesPagina1.setText(SelecaoMes.getSelectedItem().toString());

        DiaPagina2.setText("" + DiaAltera);
        DiaPagina1.setText("" + DiaAltera);

        int SemanaN = calendarN.get(Calendar.DAY_OF_WEEK);
        if (SemanaN == Calendar.SUNDAY) {
            SemanaPagina1.setText("Domingo");
            SemanaPagina2.setText("Domingo");
        } else if (SemanaN == Calendar.MONDAY) {
            SemanaPagina1.setText("Segunda-Feira");
            SemanaPagina2.setText("Segunda-Feira");
        } else if (SemanaN == Calendar.TUESDAY) {
            SemanaPagina1.setText("Terça-Feira");
            SemanaPagina2.setText("Terça-Feira");
        } else if (SemanaN == Calendar.WEDNESDAY) {
            SemanaPagina1.setText("Quarta-Feira");
            SemanaPagina2.setText("Quarta-Feira");
        } else if (SemanaN == Calendar.THURSDAY) {
            SemanaPagina1.setText("Quinta-Feira");
            SemanaPagina2.setText("Quinta-Feira");
        } else if (SemanaN == Calendar.FRIDAY) {
            SemanaPagina1.setText("Sexta-Feira");
            SemanaPagina2.setText("Sexta-Feira");
        } else if (SemanaN == Calendar.SATURDAY) {
            SemanaPagina1.setText("Sabado");
            SemanaPagina2.setText("Sabado");
        }
    
    } catch (Exception erro) {
        System.out.println("Erro!");
    }
}

public void CALENDARIO_EVT() { //adiciona evento de passar o rato, sair e clicar no dia do calendario
        t1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(!"".equals(t1.getText())) {
                    t1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t1.setBorder(null);
            }
            
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(!"".equals(t1.getText())) {
                    DiaPagina2.setText(t1.getText());
                    DiaPagina1.setText(t1.getText());
                    
                    DiaAltera = Integer.parseInt(t1.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
                    LEGENDA();
                }
            }
        });
        
        t2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(!"".equals(t2.getText())) {
                    t2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t2.setBorder(null);
            }
            
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(!"".equals(t2.getText())) {
                    DiaPagina2.setText(t2.getText());
                    DiaPagina1.setText(t2.getText());
                    
                    DiaAltera = Integer.parseInt(t2.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
                    LEGENDA();
                }
            }
        });
        
        t3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(!"".equals(t3.getText())) {
                    t3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t3.setBorder(null);
            }
            
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(!"".equals(t3.getText())) {
                    DiaPagina2.setText(t3.getText());
                    DiaPagina1.setText(t3.getText());
                    
                    DiaAltera = Integer.parseInt(t3.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
                    LEGENDA();
                }
            }
        });
        
        t4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(!"".equals(t4.getText())) {
                    t4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t4.setBorder(null);
            }
            
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(!"".equals(t4.getText())) {
                    DiaPagina2.setText(t4.getText());
                    DiaPagina1.setText(t4.getText());
                    
                    DiaAltera = Integer.parseInt(t4.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
                    LEGENDA();
                }
            }
        });
        
        t5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(!"".equals(t5.getText())) {
                    t5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t5.setBorder(null);
            }
            
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(!"".equals(t5.getText())) {
                    DiaPagina2.setText(t5.getText());
                    DiaPagina1.setText(t5.getText());
                    
                    DiaAltera = Integer.parseInt(t5.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
                    LEGENDA();
                }
            }
        });
        
        t6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(!"".equals(t6.getText())) {
                    t6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t6.setBorder(null);
            }
            
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(!"".equals(t6.getText())) {
                    DiaPagina2.setText(t6.getText());
                    DiaPagina1.setText(t6.getText());
                    
                    DiaAltera = Integer.parseInt(t6.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
                    LEGENDA();
                }
            }
        });
        
        t7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(!"".equals(t7.getText())) {
                    t7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t7.setBorder(null);
            }
            
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(!"".equals(t7.getText())) {
                    DiaPagina2.setText(t7.getText());
                    DiaPagina1.setText(t7.getText());
                    
                    DiaAltera = Integer.parseInt(t7.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
                    LEGENDA();
                }
            }
        });
        
        t8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(!"".equals(t8.getText())) {
                    t8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t8.setBorder(null);
            }
            
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(!"".equals(t8.getText())) {
                    DiaPagina2.setText(t8.getText());
                    DiaPagina1.setText(t8.getText());
                    
                    DiaAltera = Integer.parseInt(t8.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
                    LEGENDA();
                }
            }
        });
        
        t9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(!"".equals(t9.getText())) {
                    t9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t9.setBorder(null);
            }
            
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(!"".equals(t9.getText())) {
                    DiaPagina2.setText(t9.getText());
                    DiaPagina1.setText(t9.getText());
                    
                    DiaAltera = Integer.parseInt(t9.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
                    LEGENDA();
                }
            }
        });
        
        t10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(!"".equals(t10.getText())) {
                    t10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t10.setBorder(null);
            }
            
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(!"".equals(t10.getText())) {
                    DiaPagina2.setText(t10.getText());
                    DiaPagina1.setText(t10.getText());
                    
                    DiaAltera = Integer.parseInt(t10.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
                    LEGENDA();
                }
            }
        });
        
        t11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(!"".equals(t11.getText())) {
                    t11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t11.setBorder(null);
            }
            
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(!"".equals(t11.getText())) {
                    DiaPagina2.setText(t11.getText());
                    DiaPagina1.setText(t11.getText());
                    
                    DiaAltera = Integer.parseInt(t11.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
                    LEGENDA();
                }
            }
        });
        
        t12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(!"".equals(t12.getText())) {
                    t12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t12.setBorder(null);
            }
            
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(!"".equals(t12.getText())) {
                    DiaPagina2.setText(t12.getText());
                    DiaPagina1.setText(t12.getText());
                    
                    DiaAltera = Integer.parseInt(t12.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
                    LEGENDA();
                }
            }
        });
        
        t13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(!"".equals(t13.getText())) {
                    t13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t13.setBorder(null);
            }
            
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(!"".equals(t13.getText())) {
                    DiaPagina2.setText(t13.getText());
                    DiaPagina1.setText(t13.getText());
                    
                    DiaAltera = Integer.parseInt(t13.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
                    LEGENDA();
                }
            }
        });
        
        t14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(!"".equals(t14.getText())) {
                    t14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t14.setBorder(null);
            }
            
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(!"".equals(t14.getText())) {
                    DiaPagina2.setText(t14.getText());
                    DiaPagina1.setText(t14.getText());
                    
                    DiaAltera = Integer.parseInt(t14.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
                    LEGENDA();
                }
            }
        });
        
        t15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(!"".equals(t15.getText())) {
                    t15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t15.setBorder(null);
            }
            
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(!"".equals(t15.getText())) {
                    DiaPagina2.setText(t15.getText());
                    DiaPagina1.setText(t15.getText());
                    
                    DiaAltera = Integer.parseInt(t15.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
                    LEGENDA();
                }
            }
        });
        
        t16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(!"".equals(t16.getText())) {
                    t16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t16.setBorder(null);
            }
            
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(!"".equals(t16.getText())) {
                    DiaPagina2.setText(t16.getText());
                    DiaPagina1.setText(t16.getText());
                    
                    DiaAltera = Integer.parseInt(t16.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
                    LEGENDA();
                }
            }
        });
        
        t17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(!"".equals(t17.getText())) {
                    t17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t17.setBorder(null);
            }
            
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(!"".equals(t17.getText())) {
                    DiaPagina2.setText(t17.getText());
                    DiaPagina1.setText(t17.getText());
                    
                    DiaAltera = Integer.parseInt(t17.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
                    LEGENDA();
                }
            }
        });
        
        t18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(!"".equals(t18.getText())) {
                    t18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t18.setBorder(null);
            }
            
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(!"".equals(t18.getText())) {
                    DiaPagina2.setText(t18.getText());
                    DiaPagina1.setText(t18.getText());
                    
                    DiaAltera = Integer.parseInt(t18.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
                    LEGENDA();
                }
            }
        });
        
        t19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(!"".equals(t19.getText())) {
                    t19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t19.setBorder(null);
            }
            
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(!"".equals(t19.getText())) {
                    DiaPagina2.setText(t19.getText());
                    DiaPagina1.setText(t19.getText());
                    
                    DiaAltera = Integer.parseInt(t19.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
                    LEGENDA();
                }
            }
        });
        
        t20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(!"".equals(t20.getText())) {
                    t20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t20.setBorder(null);
            }
            
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(!"".equals(t20.getText())) {
                    DiaPagina2.setText(t20.getText());
                    DiaPagina1.setText(t20.getText());
                    
                    DiaAltera = Integer.parseInt(t20.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
                    LEGENDA();
                }
            }
        });
        
        t21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(!"".equals(t21.getText())) {
                    t21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t21.setBorder(null);
            }
            
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(!"".equals(t21.getText())) {
                    DiaPagina2.setText(t21.getText());
                    DiaPagina1.setText(t21.getText());
                    
                    DiaAltera = Integer.parseInt(t21.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
                    LEGENDA();
                }
            }
        });
        
        
        t22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(!"".equals(t22.getText())) {
                    t22.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t22.setBorder(null);
            }
            
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(!"".equals(t22.getText())) {
                    DiaPagina2.setText(t22.getText());
                    DiaPagina1.setText(t22.getText());
                    
                    DiaAltera = Integer.parseInt(t22.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
                    LEGENDA();
                }
            }
        });
        
        t23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(!"".equals(t23.getText())) {
                    t23.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t23.setBorder(null);
            }
            
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(!"".equals(t23.getText())) {
                    DiaPagina2.setText(t23.getText());
                    DiaPagina1.setText(t23.getText());
                    
                    DiaAltera = Integer.parseInt(t23.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
                    LEGENDA();
                }
            }
        });
        
        t24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(!"".equals(t24.getText())) {
                    t24.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t24.setBorder(null);
            }
            
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(!"".equals(t24.getText())) {
                    DiaPagina2.setText(t24.getText());
                    DiaPagina1.setText(t24.getText());
                    
                    DiaAltera = Integer.parseInt(t24.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
                    LEGENDA();
                }
            }
        });
        
        t25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(!"".equals(t25.getText())) {
                    t25.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t25.setBorder(null);
            }
            
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(!"".equals(t25.getText())) {
                    DiaPagina2.setText(t25.getText());
                    DiaPagina1.setText(t25.getText());
                    
                    DiaAltera = Integer.parseInt(t25.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
                    LEGENDA();
                }
            }
        });
        
        t26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(!"".equals(t26.getText())) {
                    t26.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t26.setBorder(null);
            }
            
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(!"".equals(t26.getText())) {
                    DiaPagina2.setText(t26.getText());
                    DiaPagina1.setText(t26.getText());
                    
                    DiaAltera = Integer.parseInt(t26.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
                    LEGENDA();
                }
            }
        });
        
        t27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(!"".equals(t27.getText())) {
                    t27.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t27.setBorder(null);
            }
            
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(!"".equals(t27.getText())) {
                    DiaPagina2.setText(t27.getText());
                    DiaPagina1.setText(t27.getText());
                    
                    DiaAltera = Integer.parseInt(t27.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
                    LEGENDA();
                }
            }
        });
        
        t28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(!"".equals(t28.getText())) {
                    t28.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t28.setBorder(null);
            }
            
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(!"".equals(t28.getText())) {
                    DiaPagina2.setText(t28.getText());
                    DiaPagina1.setText(t28.getText());
                    
                    DiaAltera = Integer.parseInt(t28.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
                    LEGENDA();
                }
            }
        });
        
        t29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(!"".equals(t29.getText())) {
                    t29.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t29.setBorder(null);
            }
            
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(!"".equals(t29.getText())) {
                    DiaPagina2.setText(t29.getText());
                    DiaPagina1.setText(t29.getText());
                    
                    DiaAltera = Integer.parseInt(t29.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
                    LEGENDA();
                }
            }
        });
        
        t30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(!"".equals(t30.getText())) {
                    t30.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t30.setBorder(null);
            }
            
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(!"".equals(t30.getText())) {
                    DiaPagina2.setText(t30.getText());
                    DiaPagina1.setText(t30.getText());
                    
                    DiaAltera = Integer.parseInt(t30.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
                    LEGENDA();
                }
            }
        });
        
        t31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(!"".equals(t31.getText())) {
                    t31.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t31.setBorder(null);
            }
            
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(!"".equals(t31.getText())) {
                    DiaPagina2.setText(t31.getText());
                    DiaPagina1.setText(t31.getText());
                    
                    DiaAltera = Integer.parseInt(t31.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
                    LEGENDA();
                }
            }
        });
        
        t32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(!"".equals(t32.getText())) {
                    t32.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t32.setBorder(null);
            }
            
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(!"".equals(t32.getText())) {
                    DiaPagina2.setText(t32.getText());
                    DiaPagina1.setText(t32.getText());
                    
                    DiaAltera = Integer.parseInt(t32.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
                    LEGENDA();
                }
            }
        });
        
        t33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(!"".equals(t33.getText())) {
                    t33.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t33.setBorder(null);
            }
            
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(!"".equals(t33.getText())) {
                    DiaPagina2.setText(t33.getText());
                    DiaPagina1.setText(t33.getText());
                    
                    DiaAltera = Integer.parseInt(t33.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
                    LEGENDA();
                }
            }
        });
        
        t34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(!"".equals(t34.getText())) {
                    t34.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t34.setBorder(null);
            }
            
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(!"".equals(t34.getText())) {
                    DiaPagina2.setText(t34.getText());
                    DiaPagina1.setText(t34.getText());
                    
                    DiaAltera = Integer.parseInt(t34.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
                    LEGENDA();
                }
            }
        });
        
        t35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(!"".equals(t35.getText())) {
                    t35.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t35.setBorder(null);
            }
            
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(!"".equals(t35.getText())) {
                    DiaPagina2.setText(t35.getText());
                    DiaPagina1.setText(t35.getText());
                    
                    DiaAltera = Integer.parseInt(t35.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
                    LEGENDA();
                }
            }
        });
        
        t36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(!"".equals(t36.getText())) {
                    t36.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t36.setBorder(null);
            }
            
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(!"".equals(t36.getText())) {
                    DiaPagina2.setText(t36.getText());
                    DiaPagina1.setText(t36.getText());
                    
                    DiaAltera = Integer.parseInt(t36.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
                    LEGENDA();
                }
            }
        });
        
        t37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(!"".equals(t37.getText())) {
                    t37.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t37.setBorder(null);
            }
            
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(!"".equals(t37.getText())) {
                    DiaPagina2.setText(t37.getText());
                    DiaPagina1.setText(t37.getText());
                    
                    DiaAltera = Integer.parseInt(t37.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
                    LEGENDA();
                }
            }
        });
        
        t38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(!"".equals(t38.getText())) {
                    t38.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t38.setBorder(null);
            }
            
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(!"".equals(t38.getText())) {
                    DiaPagina2.setText(t38.getText());
                    DiaPagina1.setText(t38.getText());
                    
                    DiaAltera = Integer.parseInt(t38.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
                    LEGENDA();
                }
            }
        });
        
        t39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(!"".equals(t39.getText())) {
                    t39.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t39.setBorder(null);
            }
            
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(!"".equals(t39.getText())) {
                    DiaPagina2.setText(t39.getText());
                    DiaPagina1.setText(t39.getText());
                    
                    DiaAltera = Integer.parseInt(t39.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
                    LEGENDA();
                }
            }
        });
        
        t40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(!"".equals(t40.getText())) {
                    t40.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t40.setBorder(null);
            }
            
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(!"".equals(t40.getText())) {
                    DiaPagina2.setText(t40.getText());
                    DiaPagina1.setText(t40.getText());
                    
                    DiaAltera = Integer.parseInt(t40.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
                    LEGENDA();
                }
            }
        });
        
        t41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(!"".equals(t41.getText())) {
                    t41.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t41.setBorder(null);
            }
            
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(!"".equals(t41.getText())) {
                    DiaPagina2.setText(t41.getText());
                    DiaPagina1.setText(t41.getText());
                    
                    DiaAltera = Integer.parseInt(t41.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
                    LEGENDA();
                }
            }
        });
        
        t42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(!"".equals(t42.getText())) {
                    t42.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t42.setBorder(null);
            }
            
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(!"".equals(t42.getText())) {
                    DiaPagina2.setText(t42.getText());
                    DiaPagina1.setText(t42.getText());
                    
                    DiaAltera = Integer.parseInt(t42.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
                    LEGENDA();
                }
            }
        });
        
  }

public void LEGENDA() {
        N930.setText("");
        S930.setText("");
        N1000.setText("");
        S1000.setText("");
        N1030.setText("");
        S1030.setText("");
        N1100.setText("");
        S1100.setText("");
        N1130.setText("");
        S1130.setText("");
        N1200.setText("");
        S1200.setText("");
        N1230.setText("");
        S1230.setText("");
        N1300.setText("");
        S1300.setText("");
        N1330.setText("");
        S1330.setText("");
        N1400.setText("");
        S1400.setText("");
        N1430.setText("");
        S1430.setText("");
        N1500.setText("");
        S1500.setText("");
        N1530.setText("");
        S1530.setText("");
        N1600.setText("");
        S1600.setText("");
        N1630.setText("");
        S1630.setText("");
        N1700.setText("");
        S1700.setText("");
        N1730.setText("");
        S1730.setText("");
        S1800.setText("");
        N1800.setText("");
        S1830.setText("");
        N1830.setText("");
        S1900.setText("");
        N1900.setText("");
        S1930.setText("");
        N1930.setText("");
        S2000.setText("");
        N2000.setText("");
        S2030.setText("");
        N2030.setText("");
        S2100.setText("");
        N2100.setText("");
       
        
        //vai limpar se caso tiver mais de um agendamento
        T930.setText("");
        T1000.setText("");
        T1030.setText("");
        T1100.setText("");
        T1130.setText("");
        T1200.setText("");
        T1230.setText("");
        T1300.setText("");
        T1330.setText("");
        T1400.setText("");
        T1430.setText("");
        T1500.setText("");
        T1530.setText("");
        T1600.setText("");
        T1630.setText("");
        T1700.setText("");
        T1730.setText("");
        T1800.setText("");
        T1830.setText("");
        T1900.setText("");
        T1930.setText("");
        T2000.setText("");
        T2030.setText("");
        T2100.setText("");
        
    try {
        MesAltera = MesAltera + 1;
        String Dat = " dia = '" + DiaAltera + "' and mes = '" + MesAltera + "' and ano = '" + AnoAltera + "' ";
        MesAltera = MesAltera - 1;
        
        int TOT930 = 0, TOT1000 = 0, TOT1030 = 0, TOT1100 = 0, TOT1130 = 0, TOT1200 = 0, TOT1230 = 0, TOT1300 = 0, TOT1330 = 0,
                TOT1400 = 0, TOT1430 = 0, TOT1500 = 0, TOT1530 = 0, TOT1600 = 0, TOT1630 = 0, TOT1700 = 0, TOT1730 = 0, TOT1800 = 0,
                TOT1830 = 0, TOT1900 = 0, TOT1930 = 0, TOT2000 = 0, TOT2030 = 0, TOT2100 = 0;
        
        
        String SQL = "select * from agenda where " + Dat;
        CONEXAO.executaSQL(SQL);
        while (CONEXAO.resultset.next()) { //vai imprimir os dados que tem na agenda principal
            if(L930.getText().equals(CONEXAO.resultset.getString("hora"))) {
                N930.setText(CONEXAO.resultset.getString("nome"));
                S930.setText(CONEXAO.resultset.getString("servico"));
                Obs930 = CONEXAO.resultset.getString("observacao");
                Cod930 = CONEXAO.resultset.getString("cod");
                
                TOT930++;
                T930.setText("" + TOT930);
            }
            if(L1000.getText().equals(CONEXAO.resultset.getString("hora"))) {
                N1000.setText(CONEXAO.resultset.getString("nome"));
                S1000.setText(CONEXAO.resultset.getString("servico"));
                Obs1000 = CONEXAO.resultset.getString("observacao");
                Cod1000 = CONEXAO.resultset.getString("cod");
                
                TOT1000++;
                T1000.setText("" + TOT1000);
            }
            if(L1030.getText().equals(CONEXAO.resultset.getString("hora"))) {
                N1030.setText(CONEXAO.resultset.getString("nome"));
                S1030.setText(CONEXAO.resultset.getString("servico"));
                Obs1030 = CONEXAO.resultset.getString("observacao");
                Cod1030 = CONEXAO.resultset.getString("cod");
                
                TOT1030++;
                T1030.setText("" + TOT1030);
            }
            if(L1100.getText().equals(CONEXAO.resultset.getString("hora"))) {
                N1100.setText(CONEXAO.resultset.getString("nome"));
                S1100.setText(CONEXAO.resultset.getString("servico"));
                Obs1100 = CONEXAO.resultset.getString("observacao");
                Cod1100 = CONEXAO.resultset.getString("cod");
                
                TOT1100++;
                T1100.setText("" + TOT1100);
            }
            if(L1130.getText().equals(CONEXAO.resultset.getString("hora"))) {
                N1130.setText(CONEXAO.resultset.getString("nome"));
                S1130.setText(CONEXAO.resultset.getString("servico"));
                Obs1130 = CONEXAO.resultset.getString("observacao");
                Cod1130 = CONEXAO.resultset.getString("cod");
                
                TOT1130++;
                T1130.setText("" + TOT1130);
            }
            if(L1200.getText().equals(CONEXAO.resultset.getString("hora"))) {
                N1200.setText(CONEXAO.resultset.getString("nome"));
                S1200.setText(CONEXAO.resultset.getString("servico"));
                Obs1200 = CONEXAO.resultset.getString("observacao");
                Cod1200 = CONEXAO.resultset.getString("cod");
                
                TOT1200++;
                T1200.setText("" + TOT1200);
            }
            if(L1230.getText().equals(CONEXAO.resultset.getString("hora"))) {
                N1230.setText(CONEXAO.resultset.getString("nome"));
                S1230.setText(CONEXAO.resultset.getString("servico"));
                Obs1230 = CONEXAO.resultset.getString("observacao");
                Cod1230 = CONEXAO.resultset.getString("cod");
                
                TOT1230++;
                T1230.setText("" + TOT1230);
            }
            if(L1300.getText().equals(CONEXAO.resultset.getString("hora"))) {
                N1300.setText(CONEXAO.resultset.getString("nome"));
                S1300.setText(CONEXAO.resultset.getString("servico"));
                Obs1300 = CONEXAO.resultset.getString("observacao");
                Cod1300 = CONEXAO.resultset.getString("cod");
                
                TOT1300++;
                T1300.setText("" + TOT1300);
            }
            if(L1330.getText().equals(CONEXAO.resultset.getString("hora"))) {
                N1330.setText(CONEXAO.resultset.getString("nome"));
                S1330.setText(CONEXAO.resultset.getString("servico"));
                Obs1330 = CONEXAO.resultset.getString("observacao");
                Cod1330 = CONEXAO.resultset.getString("cod");
                
                TOT1330++;
                T1330.setText("" + TOT1330);
            }
            if(L1400.getText().equals(CONEXAO.resultset.getString("hora"))) {
                N1400.setText(CONEXAO.resultset.getString("nome"));
                S1400.setText(CONEXAO.resultset.getString("servico"));
                Obs1400 = CONEXAO.resultset.getString("observacao");
                Cod1400 = CONEXAO.resultset.getString("cod");
                
                TOT1400++;
                T1400.setText("" + TOT1400);
            }
            if(L1430.getText().equals(CONEXAO.resultset.getString("hora"))) {
                N1430.setText(CONEXAO.resultset.getString("nome"));
                S1430.setText(CONEXAO.resultset.getString("servico"));
                Obs1430 = CONEXAO.resultset.getString("observacao");
                Cod1430 = CONEXAO.resultset.getString("cod");
                
                TOT1430++;
                T1430.setText("" + TOT1430);
            }
            if(L1500.getText().equals(CONEXAO.resultset.getString("hora"))) {
                N1500.setText(CONEXAO.resultset.getString("nome"));
                S1500.setText(CONEXAO.resultset.getString("servico"));
                Obs1500 = CONEXAO.resultset.getString("observacao");
                Cod1500 = CONEXAO.resultset.getString("cod");
                
                TOT1500++;
                T1500.setText("" + TOT1500);
            }
            if(L1530.getText().equals(CONEXAO.resultset.getString("hora"))) {
                N1530.setText(CONEXAO.resultset.getString("nome"));
                S1530.setText(CONEXAO.resultset.getString("servico"));
                Obs1530 = CONEXAO.resultset.getString("observacao");
                Cod1530 = CONEXAO.resultset.getString("cod");
                
                TOT1530++;
                T1530.setText("" + TOT1530);
            }
            if(L1600.getText().equals(CONEXAO.resultset.getString("hora"))) {
                N1600.setText(CONEXAO.resultset.getString("nome"));
                S1600.setText(CONEXAO.resultset.getString("servico"));
                Obs1600 = CONEXAO.resultset.getString("observacao");
                Cod1600 = CONEXAO.resultset.getString("cod");
                
                TOT1600++;
                T1600.setText("" + TOT1600);
            }
            if(L1630.getText().equals(CONEXAO.resultset.getString("hora"))) {
                N1630.setText(CONEXAO.resultset.getString("nome"));
                S1630.setText(CONEXAO.resultset.getString("servico"));
                Obs1630 = CONEXAO.resultset.getString("observacao");
                Cod1630 = CONEXAO.resultset.getString("cod");
                
                TOT1630++;
                T1630.setText("" + TOT1630);
            }
            if(L1700.getText().equals(CONEXAO.resultset.getString("hora"))) {
                N1700.setText(CONEXAO.resultset.getString("nome"));
                S1700.setText(CONEXAO.resultset.getString("servico"));
                Obs1700 = CONEXAO.resultset.getString("observacao");
                Cod1700 = CONEXAO.resultset.getString("cod");
                
                TOT1700++;
                T1700.setText("" + TOT1700);
            }
            if(L1730.getText().equals(CONEXAO.resultset.getString("hora"))) {
                N1730.setText(CONEXAO.resultset.getString("nome"));
                S1730.setText(CONEXAO.resultset.getString("servico"));
                Obs1730 = CONEXAO.resultset.getString("observacao");
                Cod1730 = CONEXAO.resultset.getString("cod");
                
                TOT1730++;
                T1730.setText("" + TOT1730);
            }
            if(L1800.getText().equals(CONEXAO.resultset.getString("hora"))) {
                N1800.setText(CONEXAO.resultset.getString("nome"));
                S1800.setText(CONEXAO.resultset.getString("servico"));
                Obs1800 = CONEXAO.resultset.getString("observacao");
                Cod1800 = CONEXAO.resultset.getString("cod");
                
                TOT1800++;
                T1800.setText("" + TOT1800);
            }
            if(L1830.getText().equals(CONEXAO.resultset.getString("hora"))) {
                N1830.setText(CONEXAO.resultset.getString("nome"));
                S1830.setText(CONEXAO.resultset.getString("servico"));
                Obs1830 = CONEXAO.resultset.getString("observacao");
                Cod1830 = CONEXAO.resultset.getString("cod");
                
                TOT1830++;
                T1830.setText("" + TOT1830);
            }
            if(L1900.getText().equals(CONEXAO.resultset.getString("hora"))) {
                N1900.setText(CONEXAO.resultset.getString("nome"));
                S1900.setText(CONEXAO.resultset.getString("servico"));
                Obs1900 = CONEXAO.resultset.getString("observacao");
                Cod1900 = CONEXAO.resultset.getString("cod");
                
                TOT1900++;
                T1900.setText("" + TOT1900);
            }
            if(L1930.getText().equals(CONEXAO.resultset.getString("hora"))) {
                N1930.setText(CONEXAO.resultset.getString("nome"));
                S1930.setText(CONEXAO.resultset.getString("servico"));
                Obs1930 = CONEXAO.resultset.getString("observacao");
                Cod1930 = CONEXAO.resultset.getString("cod");
                
                TOT1930++;
                T1930.setText("" + TOT1930);
            }
            if(L2000.getText().equals(CONEXAO.resultset.getString("hora"))) {
                N2000.setText(CONEXAO.resultset.getString("nome"));
                S2000.setText(CONEXAO.resultset.getString("servico"));
                Obs2000 = CONEXAO.resultset.getString("observacao");
                Cod2000 = CONEXAO.resultset.getString("cod");
                
                TOT2000++;
                T2000.setText("" + TOT2000);
            }
            if(L2030.getText().equals(CONEXAO.resultset.getString("hora"))) {
                N2030.setText(CONEXAO.resultset.getString("nome"));
                S2030.setText(CONEXAO.resultset.getString("servico"));
                Obs2030 = CONEXAO.resultset.getString("observacao");
                Cod2030 = CONEXAO.resultset.getString("cod");
                
                TOT2030++;
                T2030.setText("" + TOT2030);
            }
            if(L2100.getText().equals(CONEXAO.resultset.getString("hora"))) {
                N2100.setText(CONEXAO.resultset.getString("nome"));
                S2100.setText(CONEXAO.resultset.getString("servico"));
                Obs2100 = CONEXAO.resultset.getString("observacao");
                Cod2100 = CONEXAO.resultset.getString("cod");
                
                TOT2100++;
                T2100.setText("" + TOT2100);
            }
            
        }
        
    } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "Error listing table data" + erro.toString());
    } catch (Exception err) {
        System.out.println(err);
    }  
 
}

public void MOSTRA_DADOS_LIMITE() {
        try {
            CONEXAO.executaSQL("select * from configuracao");
            CONEXAO.resultset.first();
            LIMITE = Integer.parseInt(CONEXAO.resultset.getString("limiteagendamento")) - 1;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro" + erro);
    }
    
    }
    
public void INSERE_COR_CALENDARIO() {
            TAD1 = 0; 
            TAD2 = 0; 
            TAD3 = 0; 
            TAD4 = 0; 
            TAD5 = 0; 
            TAD6 = 0; 
            TAD7 = 0; 
            TAD8 = 0; 
            TAD9 = 0; 
            TAD10 = 0; 
            TAD11 = 0; 
            TAD12 = 0; 
            TAD13 = 0; 
            TAD14 = 0; 
            TAD15 = 0; 
            TAD16 = 0;
            TAD17 = 0; 
            TAD18 = 0; 
            TAD19 = 0; 
            TAD20 = 0; 
            TAD21 = 0; 
            TAD22 = 0; 
            TAD23 = 0; 
            TAD24 = 0;
            TAD25 = 0; 
            TAD26 = 0; 
            TAD27 = 0; 
            TAD28 = 0; 
            TAD29 = 0; 
            TAD30 = 0; 
            TAD31 = 0;
            
            int AnoPesq = Integer.parseInt(SelecaoAno.getSelectedItem().toString());
            int MesPesq = SelecaoMes.getSelectedIndex() + 1;
            
            try{
              CONEXAO.executaSQL("select * from agenda where mes = '" + MesPesq
                        + "' and ano = '" + AnoPesq
                        + "' order by cod");
              
              while (CONEXAO.resultset.next()) {
              if("1".equals(CONEXAO.resultset.getString("dia"))) {
                      TAD1++;
                  }
                  if("2".equals(CONEXAO.resultset.getString("dia"))) {
                      TAD2++;
                  }
                  if("3".equals(CONEXAO.resultset.getString("dia"))) {
                      TAD3++;
                  }
                  if("4".equals(CONEXAO.resultset.getString("dia"))) {
                      TAD4++;
                  }
                  if("5".equals(CONEXAO.resultset.getString("dia"))) {
                      TAD5++;
                  }
                  if("6".equals(CONEXAO.resultset.getString("dia"))) {
                      TAD6++;
                  }
                  if("7".equals(CONEXAO.resultset.getString("dia"))) {
                      TAD7++;
                  }
                  if("8".equals(CONEXAO.resultset.getString("dia"))) {
                      TAD8++;
                  }
                  if("9".equals(CONEXAO.resultset.getString("dia"))) {
                      TAD9++;
                  }
                  if("10".equals(CONEXAO.resultset.getString("dia"))) {
                      TAD10++;
                  }
                  if("11".equals(CONEXAO.resultset.getString("dia"))) {
                      TAD11++;
                  }
                  if("12".equals(CONEXAO.resultset.getString("dia"))) {
                      TAD12++;
                      
                  }
                  if("13".equals(CONEXAO.resultset.getString("dia"))) {
                      TAD13++;
                  }
                  if("14".equals(CONEXAO.resultset.getString("dia"))) {
                      TAD14++;
                  }
                  if("15".equals(CONEXAO.resultset.getString("dia"))) {
                      TAD15++;
                  }
                  if("16".equals(CONEXAO.resultset.getString("dia"))) {
                      TAD16++;
                  }
                  if("17".equals(CONEXAO.resultset.getString("dia"))) {
                      TAD17++;
                  }
                  if("18".equals(CONEXAO.resultset.getString("dia"))) {
                      TAD18++;
                  }
                  if("19".equals(CONEXAO.resultset.getString("dia"))) {
                      TAD19++;
                  }
                  if("20".equals(CONEXAO.resultset.getString("dia"))) {
                      TAD20++;
                  }
                  if("21".equals(CONEXAO.resultset.getString("dia"))) {
                      TAD21++;
                  }
                  if("22".equals(CONEXAO.resultset.getString("dia"))) {
                      TAD22++;
                  }
                  if("23".equals(CONEXAO.resultset.getString("dia"))) {
                      TAD23++;
                  }
                  if("24".equals(CONEXAO.resultset.getString("dia"))) {
                      TAD24++;
                      
                  }if("25".equals(CONEXAO.resultset.getString("dia"))) {
                      TAD25++;
                      
                  }if("26".equals(CONEXAO.resultset.getString("dia"))) {
                      TAD26++;  
                  }
                  if("27".equals(CONEXAO.resultset.getString("dia"))) {
                      TAD27++;
                      
                  }if("28".equals(CONEXAO.resultset.getString("dia"))) {
                      TAD28++;
                      
                  }if("29".equals(CONEXAO.resultset.getString("dia"))) {
                      TAD29++;
                      
                  }if("30".equals(CONEXAO.resultset.getString("dia"))) {
                      TAD30++;
                  }
                  if("31".equals(CONEXAO.resultset.getString("dia"))) {
                      TAD31++;
                  }
              }
              
            } catch (SQLException ex) {
                System.out.println(ex);
            }
            
        int ano = Integer.parseInt(SelecaoAno.getSelectedItem().toString());
        int mes = SelecaoMes.getSelectedIndex();
        
            Calendar calendar = Calendar.getInstance();
            calendar.set(ano, mes, 1);
            int SetaDia = 0;
            int Semana = calendar.get(Calendar.DAY_OF_WEEK);
            
                SEMANA_0();
            if (Semana == Calendar.SUNDAY) {
                SEMANA_1(); //Dom
            } else if (Semana == Calendar.MONDAY) {
                SEMANA_2(); //Seg
            } else if (Semana == Calendar.TUESDAY) {
                SEMANA_3(); //Ter
            } else if (Semana == Calendar.WEDNESDAY) {
                SEMANA_4(); //Qua
            } else if (Semana == Calendar.THURSDAY) {
                SEMANA_5(); //Qui
            } else if (Semana == Calendar.FRIDAY) {
                SEMANA_6(); //Sex
            } else if (Semana == Calendar.SATURDAY) {
                SEMANA_7(); //Sab
            }
    }
    
public void SEMANA_0() {
        t1.setBackground(new java.awt.Color(204, 204, 204));
        t2.setBackground(new java.awt.Color(204, 204, 204));
        t3.setBackground(new java.awt.Color(204, 204, 204));
        t4.setBackground(new java.awt.Color(204, 204, 204));
        t5.setBackground(new java.awt.Color(204, 204, 204));
        t6.setBackground(new java.awt.Color(204, 204, 204));
        t7.setBackground(new java.awt.Color(204, 204, 204));
        t8.setBackground(new java.awt.Color(204, 204, 204));
        t9.setBackground(new java.awt.Color(204, 204, 204));
        
        t10.setBackground(new java.awt.Color(204, 204, 204));
        t11.setBackground(new java.awt.Color(204, 204, 204));
        t12.setBackground(new java.awt.Color(204, 204, 204));
        t13.setBackground(new java.awt.Color(204, 204, 204));
        t14.setBackground(new java.awt.Color(204, 204, 204));
        t15.setBackground(new java.awt.Color(204, 204, 204));
        t16.setBackground(new java.awt.Color(204, 204, 204));
        t17.setBackground(new java.awt.Color(204, 204, 204));
        t18.setBackground(new java.awt.Color(204, 204, 204));
        t19.setBackground(new java.awt.Color(204, 204, 204));
        
        t20.setBackground(new java.awt.Color(204, 204, 204));
        t21.setBackground(new java.awt.Color(204, 204, 204));
        t22.setBackground(new java.awt.Color(204, 204, 204));
        t23.setBackground(new java.awt.Color(204, 204, 204));
        t24.setBackground(new java.awt.Color(204, 204, 204));
        t25.setBackground(new java.awt.Color(204, 204, 204));
        t26.setBackground(new java.awt.Color(204, 204, 204));
        t27.setBackground(new java.awt.Color(204, 204, 204));
        t28.setBackground(new java.awt.Color(204, 204, 204));
        t29.setBackground(new java.awt.Color(204, 204, 204));
        
        t30.setBackground(new java.awt.Color(204, 204, 204));
        t31.setBackground(new java.awt.Color(204, 204, 204));
        t32.setBackground(new java.awt.Color(204, 204, 204));
        t33.setBackground(new java.awt.Color(204, 204, 204));
        t34.setBackground(new java.awt.Color(204, 204, 204));
        t35.setBackground(new java.awt.Color(204, 204, 204));
        t36.setBackground(new java.awt.Color(204, 204, 204));
        t37.setBackground(new java.awt.Color(204, 204, 204));
        t38.setBackground(new java.awt.Color(204, 204, 204));
        t39.setBackground(new java.awt.Color(204, 204, 204));
        
        t40.setBackground(new java.awt.Color(204, 204, 204));
        t41.setBackground(new java.awt.Color(204, 204, 204));
        t42.setBackground(new java.awt.Color(204, 204, 204));

 
    }
    
public void SEMANA_1() {
        int x = 0;
        
        String[] DIA = {t1.getText(), t2.getText(), t3.getText(), t4.getText(), t5.getText(),
            t6.getText(), t7.getText(), t8.getText(), t9.getText(), t10.getText(),
            t11.getText(), t12.getText(), t13.getText(), t14.getText(), t15.getText(),
            t16.getText(), t17.getText(), t18.getText(), t19.getText(), t20.getText(),
            t21.getText(), t22.getText(), t23.getText(), t24.getText(), t25.getText(), 
            t26.getText(), t27.getText(), t28.getText(), t29.getText(), t30.getText(),
            t31.getText()};
            
        for (String D : DIA) {
            x++;
            if(D.equals("" + x) & TAD1 > 0) {
              t1.setBackground(Color.CYAN);
                if(TAD1 > LIMITE) {
                    t1.setBackground(Color.MAGENTA);
                  }
              }
              if(D.equals("" + x) & TAD2 > 0) {
                t2.setBackground(Color.CYAN);
                  if(TAD2 > LIMITE) {
                      t2.setBackground(Color.MAGENTA);
                    }
                }
              if(D.equals("" + x) & TAD3 > 0) {
                t3.setBackground(Color.CYAN);
                  if(TAD3 > LIMITE) {
                      t3.setBackground(Color.MAGENTA);
                    }
                }
              if(D.equals("" + x) & TAD4 > 0) {
                t4.setBackground(Color.CYAN);
                if(TAD4 > LIMITE) {
                    t4.setBackground(Color.MAGENTA);
                  }
              }
              if(D.equals("" + x) & TAD5 > 0) {
              t5.setBackground(Color.CYAN);
              if(TAD5 > LIMITE) {
                  t5.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD6 > 0) {
              t6.setBackground(Color.CYAN);
              if(TAD6 > LIMITE) {
                  t6.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD7 > 0) {
              t7.setBackground(Color.CYAN);
              if(TAD7 > LIMITE) {
                  t7.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD8 > 0) {
              t8.setBackground(Color.CYAN);
              if(TAD8 > LIMITE) {
                  t8.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD9 > 0) {
              t9.setBackground(Color.CYAN);
              if(TAD9 > LIMITE) {
                  t9.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD10 > 0) {
              t10.setBackground(Color.CYAN);
              if(TAD10 > LIMITE) {
                  t10.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD11 > 0) {
              t11.setBackground(Color.CYAN);
              if(TAD11 > LIMITE) {
                  t11.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD12 > 0) {
              t12.setBackground(Color.CYAN);
              if(TAD12 > LIMITE) {
                  t12.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD13 > 0) {
              t13.setBackground(Color.CYAN);
              if(TAD13 > LIMITE) {
                  t13.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD14 > 0) {
              t14.setBackground(Color.CYAN);
              if(TAD14 > LIMITE) {
                  t14.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD15 > 0) {
              t15.setBackground(Color.CYAN);
              if(TAD15 > LIMITE) {
                  t15.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD16 > 0) {
              t16.setBackground(Color.CYAN);
              if(TAD16 > LIMITE) {
                  t16.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD17 > 0) {
              t17.setBackground(Color.CYAN);
              if(TAD17 > LIMITE) {
                  t17.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD18 > 0) {
              t18.setBackground(Color.CYAN);
              if(TAD18 > LIMITE) {
                  t18.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD19 > 0) {
              t19.setBackground(Color.CYAN);
              if(TAD19 > LIMITE) {
                  t19.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD20 > 0) {
              t20.setBackground(Color.CYAN);
              if(TAD20 > LIMITE) {
                  t20.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD21 > 0) {
              t21.setBackground(Color.CYAN);
              if(TAD21 > LIMITE) {
                  t21.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD22 > 0) {
              t22.setBackground(Color.CYAN);
              if(TAD22 > LIMITE) {
                  t22.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD23 > 0) {
              t23.setBackground(Color.CYAN);
              if(TAD23 > LIMITE) {
                  t23.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD24 > 0) {
              t24.setBackground(Color.CYAN);
              if(TAD24 > LIMITE) {
                  t24.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD25 > 0) {
              t25.setBackground(Color.CYAN);
              if(TAD25 > LIMITE) {
                  t25.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD26 > 0) {
              t26.setBackground(Color.CYAN);
              if(TAD26 > LIMITE) {
                  t26.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD27 > 0) {
              t27.setBackground(Color.CYAN);
              if(TAD27 > LIMITE) {
                  t27.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD28 > 0) {
              t28.setBackground(Color.CYAN);
              if(TAD28 > LIMITE) {
                  t28.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD29 > 0) {
              t29.setBackground(Color.CYAN);
              if(TAD29 > LIMITE) {
                  t29.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD30 > 0) {
              t30.setBackground(Color.CYAN);
              if(TAD30 > LIMITE) {
                  t30.setBackground(Color.MAGENTA);
              
                }
            }
              if (D.equals("" + x) & TAD31 > 0) {
                t31.setBackground(Color.CYAN);
                if(TAD31 > LIMITE) {
                    t31.setBackground(Color.MAGENTA);
               }
            }
        }
    }
    
public void SEMANA_2() {
        int x = 0;
        
        String[] DIA = {t2.getText(), t3.getText(), t4.getText(), t5.getText(),
            t6.getText(), t7.getText(), t8.getText(), t9.getText(), t10.getText(),
            t11.getText(), t12.getText(), t13.getText(), t14.getText(), t15.getText(),
            t16.getText(), t17.getText(), t18.getText(), t19.getText(), t20.getText(),
            t21.getText(), t22.getText(), t23.getText(), t24.getText(), t25.getText(), 
            t26.getText(), t27.getText(), t28.getText(), t29.getText(), t30.getText(),
            t31.getText(), t32.getText(),};
            
        for (String D : DIA) {
            x++;
            if(D.equals("" + x) & TAD1 > 0) {
              t2.setBackground(Color.CYAN);
              if(TAD1 > LIMITE) {
                  t2.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD2 > 0) {
              t3.setBackground(Color.CYAN);
              if(TAD2 > LIMITE) {
                  t3.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD3 > 0) {
              t4.setBackground(Color.CYAN);
              if(TAD3 > LIMITE) {
                  t4.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD4 > 0) {
              t5.setBackground(Color.CYAN);
              if(TAD4 > LIMITE) {
                  t5.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD5 > 0) {
              t6.setBackground(Color.CYAN);
              if(TAD5 > LIMITE) {
                  t6.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD6 > 0) {
              t7.setBackground(Color.CYAN);
              if(TAD6 > LIMITE) {
                  t7.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD7 > 0) {
              t8.setBackground(Color.CYAN);
              if(TAD7 > LIMITE) {
                  t8.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD8 > 0) {
              t9.setBackground(Color.CYAN);
              if(TAD8 > LIMITE) {
                  t9.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD9 > 0) {
              t10.setBackground(Color.CYAN);
              if(TAD9 > LIMITE) {
                  t10.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD10 > 0) {
              t11.setBackground(Color.CYAN);
              if(TAD10 > LIMITE) {
                  t11.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD11 > 0) {
              t12.setBackground(Color.CYAN);
              if(TAD11 > LIMITE) {
                  t12.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD12 > 0) {
              t13.setBackground(Color.CYAN);
              if(TAD12 > LIMITE) {
                  t13.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD13 > 0) {
              t14.setBackground(Color.CYAN);
              if(TAD13 > LIMITE) {
                  t14.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD14 > 0) {
              t15.setBackground(Color.CYAN);
              if(TAD14 > LIMITE) {
                  t15.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD15 > 0) {
              t16.setBackground(Color.CYAN);
              if(TAD15 > LIMITE) {
                  t16.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD16 > 0) {
              t17.setBackground(Color.CYAN);
              if(TAD16 > LIMITE) {
                  t17.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD17 > 0) {
              t18.setBackground(Color.CYAN);
              if(TAD17 > LIMITE) {
                  t18.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD18 > 0) {
              t19.setBackground(Color.CYAN);
              if(TAD18 > LIMITE) {
                  t19.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD19 > 0) {
              t20.setBackground(Color.CYAN);
              if(TAD19 > LIMITE) {
                  t20.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD20 > 0) {
              t21.setBackground(Color.CYAN);
              if(TAD20 > LIMITE) {
                  t21.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD21 > 0) {
              t22.setBackground(Color.CYAN);
              if(TAD21 > LIMITE) {
                  t22.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD22 > 0) {
              t23.setBackground(Color.CYAN);
              if(TAD22 > LIMITE) {
                  t23.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD23 > 0) {
              t24.setBackground(Color.CYAN);
              if(TAD23 > LIMITE) {
                  t24.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD24 > 0) {
              t25.setBackground(Color.CYAN);
              if(TAD24 > LIMITE) {
                  t25.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD25 > 0) {
              t26.setBackground(Color.CYAN);
              if(TAD25 > LIMITE) {
                  t26.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD26 > 0) {
              t27.setBackground(Color.CYAN);
              if(TAD26 > LIMITE) {
                  t27.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD27 > 0) {
              t28.setBackground(Color.CYAN);
              if(TAD27 > LIMITE) {
                  t28.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD28 > 0) {
              t29.setBackground(Color.CYAN);
              if(TAD28 > LIMITE) {
                  t29.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD29 > 0) {
              t30.setBackground(Color.CYAN);
              if(TAD29 > LIMITE) {
                  t30.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD30 > 0) {
              t31.setBackground(Color.CYAN);
              if(TAD30 > LIMITE) {
                  t31.setBackground(Color.MAGENTA);
              
                }
            }
              if (D.equals("" + x) & TAD31 > 0) {
                t32.setBackground(Color.CYAN);
                if(TAD31 > LIMITE) {
                    t32.setBackground(Color.MAGENTA);
               }
            }
        }
    }
   
public void SEMANA_3() {
        int x = 0;
        
        String[] DIA = {t3.getText(), t4.getText(), t5.getText(),
            t6.getText(), t7.getText(), t8.getText(), t9.getText(), t10.getText(),
            t11.getText(), t12.getText(), t13.getText(), t14.getText(), t15.getText(),
            t16.getText(), t17.getText(), t18.getText(), t19.getText(), t20.getText(),
            t21.getText(), t22.getText(), t23.getText(), t24.getText(), t25.getText(), 
            t26.getText(), t27.getText(), t28.getText(), t29.getText(), t30.getText(),
            t31.getText(), t32.getText(),t33.getText(),};
            
        for (String D : DIA) {
            x++;
            if(D.equals("" + x) & TAD1 > 0) {
              t3.setBackground(Color.CYAN);
              if(TAD1 > LIMITE) {
                  t3.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD2 > 0) {
              t4.setBackground(Color.CYAN);
              if(TAD2 > LIMITE) {
                  t4.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD3 > 0) {
              t5.setBackground(Color.CYAN);
              if(TAD3 > LIMITE) {
                  t5.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD4 > 0) {
              t6.setBackground(Color.CYAN);
              if(TAD4 > LIMITE) {
                  t6.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD5 > 0) {
              t7.setBackground(Color.CYAN);
              if(TAD5 > LIMITE) {
                  t7.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD6 > 0) {
              t8.setBackground(Color.CYAN);
              if(TAD6 > LIMITE) {
                  t8.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD7 > 0) {
              t9.setBackground(Color.CYAN);
              if(TAD7 > LIMITE) {
                  t9.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD8 > 0) {
              t10.setBackground(Color.CYAN);
              if(TAD8 > LIMITE) {
                  t10.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD9 > 0) {
              t11.setBackground(Color.CYAN);
              if(TAD9 > LIMITE) {
                  t11.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD10 > 0) {
              t12.setBackground(Color.CYAN);
              if(TAD10 > LIMITE) {
                  t12.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD11 > 0) {
              t13.setBackground(Color.CYAN);
              if(TAD11 > LIMITE) {
                  t13.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD12 > 0) {
              t14.setBackground(Color.CYAN);
              if(TAD12 > LIMITE) {
                  t14.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD13 > 0) {
              t15.setBackground(Color.CYAN);
              if(TAD13 > LIMITE) {
                  t15.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD14 > 0) {
              t16.setBackground(Color.CYAN);
              if(TAD14 > LIMITE) {
                  t16.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD15 > 0) {
              t17.setBackground(Color.CYAN);
              if(TAD15 > LIMITE) {
                  t17.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD16 > 0) {
              t18.setBackground(Color.CYAN);
              if(TAD16 > LIMITE) {
                  t18.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD17 > 0) {
              t19.setBackground(Color.CYAN);
              if(TAD17 > LIMITE) {
                  t19.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD18 > 0) {
              t20.setBackground(Color.CYAN);
              if(TAD18 > LIMITE) {
                  t20.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD19 > 0) {
              t21.setBackground(Color.CYAN);
              if(TAD19 > LIMITE) {
                  t21.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD20 > 0) {
              t22.setBackground(Color.CYAN);
              if(TAD20 > LIMITE) {
                  t22.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD21 > 0) {
              t23.setBackground(Color.CYAN);
              if(TAD21 > LIMITE) {
                  t23.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD22 > 0) {
              t24.setBackground(Color.CYAN);
              if(TAD22 > LIMITE) {
                  t24.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD23 > 0) {
              t25.setBackground(Color.CYAN);
              if(TAD23 > LIMITE) {
                  t25.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD24 > 0) {
              t26.setBackground(Color.CYAN);
              if(TAD24 > LIMITE) {
                  t26.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD25 > 0) {
              t27.setBackground(Color.CYAN);
              if(TAD25 > LIMITE) {
                  t27.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD26 > 0) {
              t28.setBackground(Color.CYAN);
              if(TAD26 > LIMITE) {
                  t28.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD27 > 0) {
              t29.setBackground(Color.CYAN);
              if(TAD27 > LIMITE) {
                  t29.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD28 > 0) {
              t30.setBackground(Color.CYAN);
              if(TAD28 > LIMITE) {
                  t30.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD29 > 0) {
              t31.setBackground(Color.CYAN);
              if(TAD29 > LIMITE) {
                  t31.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD30 > 0) {
              t32.setBackground(Color.CYAN);
              if(TAD30 > LIMITE) {
                  t32.setBackground(Color.MAGENTA);
              
                }
            }
              if (D.equals("" + x) & TAD31 > 0) {
                t33.setBackground(Color.CYAN);
                if(TAD31 > LIMITE) {
                    t33.setBackground(Color.MAGENTA);
               }
            }
        }
    }
    
public void SEMANA_4() {
        int x = 0;
        
        String[] DIA = {t4.getText(), t5.getText(),
            t6.getText(), t7.getText(), t8.getText(), t9.getText(), t10.getText(),
            t11.getText(), t12.getText(), t13.getText(), t14.getText(), t15.getText(),
            t16.getText(), t17.getText(), t18.getText(), t19.getText(), t20.getText(),
            t21.getText(), t22.getText(), t23.getText(), t24.getText(), t25.getText(), 
            t26.getText(), t27.getText(), t28.getText(), t29.getText(), t30.getText(),
            t31.getText(), t32.getText(), t33.getText(), t34.getText()};
            
        for (String D : DIA) {
            x++;
            if (D.equals("" + x) & TAD1 > 0) {
                t4.setBackground(Color.CYAN);
                if(TAD31 > LIMITE) {
                    t4.setBackground(Color.MAGENTA);
               }
            }
            if(D.equals("" + x) & TAD2 > 0) {
              t5.setBackground(Color.CYAN);
              if(TAD1 > LIMITE) {
                  t5.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD3 > 0) {
              t6.setBackground(Color.CYAN);
              if(TAD2 > LIMITE) {
                  t6.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD4 > 0) {
              t7.setBackground(Color.CYAN);
              if(TAD3 > LIMITE) {
                  t7.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD5 > 0) {
              t8.setBackground(Color.CYAN);
              if(TAD4 > LIMITE) {
                  t8.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD6 > 0) {
              t9.setBackground(Color.CYAN);
              if(TAD5 > LIMITE) {
                  t9.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD7 > 0) {
              t10.setBackground(Color.CYAN);
              if(TAD6 > LIMITE) {
                  t10.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD8 > 0) {
              t11.setBackground(Color.CYAN);
              if(TAD7 > LIMITE) {
                  t11.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD9 > 0) {
              t12.setBackground(Color.CYAN);
              if(TAD8 > LIMITE) {
                  t12.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD10 > 0) {
              t13.setBackground(Color.CYAN);
              if(TAD9 > LIMITE) {
                  t13.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD11 > 0) {
              t14.setBackground(Color.CYAN);
              if(TAD10 > LIMITE) {
                  t14.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD12 > 0) {
              t15.setBackground(Color.CYAN);
              if(TAD11 > LIMITE) {
                  t15.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD13 > 0) {
              t16.setBackground(Color.CYAN);
              if(TAD12 > LIMITE) {
                  t16.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD14 > 0) {
              t17.setBackground(Color.CYAN);
              if(TAD13 > LIMITE) {
                  t17.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD15 > 0) {
              t18.setBackground(Color.CYAN);
              if(TAD14 > LIMITE) {
                  t18.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD16 > 0) {
              t19.setBackground(Color.CYAN);
              if(TAD15 > LIMITE) {
                  t19.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD17 > 0) {
              t20.setBackground(Color.CYAN);
              if(TAD16 > LIMITE) {
                  t20.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD18 > 0) {
              t21.setBackground(Color.CYAN);
              if(TAD17 > LIMITE) {
                  t21.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD19 > 0) {
              t22.setBackground(Color.CYAN);
              if(TAD18 > LIMITE) {
                  t22.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD20 > 0) {
              t23.setBackground(Color.CYAN);
              if(TAD19 > LIMITE) {
                  t23.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD21 > 0) {
              t24.setBackground(Color.CYAN);
              if(TAD20 > LIMITE) {
                  t24.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD22 > 0) {
              t25.setBackground(Color.CYAN);
              if(TAD21 > LIMITE) {
                  t25.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD23 > 0) {
              t26.setBackground(Color.CYAN);
              if(TAD22 > LIMITE) {
                  t26.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD24 > 0) {
              t27.setBackground(Color.CYAN);
              if(TAD23 > LIMITE) {
                  t27.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD25 > 0) {
              t28.setBackground(Color.CYAN);
              if(TAD24 > LIMITE) {
                  t28.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD26 > 0) {
              t29.setBackground(Color.CYAN);
              if(TAD25 > LIMITE) {
                  t29.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD27 > 0) {
              t30.setBackground(Color.CYAN);
              if(TAD26 > LIMITE) {
                  t30.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD28 > 0) {
              t31.setBackground(Color.CYAN);
              if(TAD27 > LIMITE) {
                  t31.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD29 > 0) {
              t32.setBackground(Color.CYAN);
              if(TAD28 > LIMITE) {
                  t32.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD30 > 0) {
              t33.setBackground(Color.CYAN);
              if(TAD29 > LIMITE) {
                  t33.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD31 > 0) {
              t34.setBackground(Color.CYAN);
              if(TAD30 > LIMITE) {
                  t34.setBackground(Color.MAGENTA);
              
                }
            }      
        }
    }
   
public void SEMANA_5() {
        int x = 0;
        
        String[] DIA = {t5.getText(),
            t6.getText(), t7.getText(), t8.getText(), t9.getText(), t10.getText(),
            t11.getText(), t12.getText(), t13.getText(), t14.getText(), t15.getText(),
            t16.getText(), t17.getText(), t18.getText(), t19.getText(), t20.getText(),
            t21.getText(), t22.getText(), t23.getText(), t24.getText(), t25.getText(), 
            t26.getText(), t27.getText(), t28.getText(), t29.getText(), t30.getText(),
            t31.getText(), t32.getText(), t33.getText(), t34.getText(), t4.getText(), };
            
        for (String D : DIA) {
            x++;
            if (D.equals("" + x) & TAD1 > 0) {
                t5.setBackground(Color.CYAN);
                if(TAD31 > LIMITE) {
                    t5.setBackground(Color.MAGENTA);
               }
            }
            if(D.equals("" + x) & TAD2 > 0) {
              t6.setBackground(Color.CYAN);
              if(TAD1 > LIMITE) {
                  t6.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD3 > 0) {
              t7.setBackground(Color.CYAN);
              if(TAD2 > LIMITE) {
                  t7.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD4 > 0) {
              t8.setBackground(Color.CYAN);
              if(TAD3 > LIMITE) {
                  t8.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD5 > 0) {
              t9.setBackground(Color.CYAN);
              if(TAD4 > LIMITE) {
                  t9.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD6 > 0) {
              t10.setBackground(Color.CYAN);
              if(TAD5 > LIMITE) {
                  t10.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD7 > 0) {
              t11.setBackground(Color.CYAN);
              if(TAD6 > LIMITE) {
                  t11.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD8 > 0) {
              t12.setBackground(Color.CYAN);
              if(TAD7 > LIMITE) {
                  t12.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD9 > 0) {
              t13.setBackground(Color.CYAN);
              if(TAD8 > LIMITE) {
                  t13.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD10 > 0) {
              t14.setBackground(Color.CYAN);
              if(TAD9 > LIMITE) {
                  t14.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD11 > 0) {
              t15.setBackground(Color.CYAN);
              if(TAD10 > LIMITE) {
                  t15.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD12 > 0) {
              t16.setBackground(Color.CYAN);
              if(TAD11 > LIMITE) {
                  t16.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD13 > 0) {
              t17.setBackground(Color.CYAN);
              if(TAD12 > LIMITE) {
                  t17.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD14 > 0) {
              t18.setBackground(Color.CYAN);
              if(TAD13 > LIMITE) {
                  t18.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD15 > 0) {
              t19.setBackground(Color.CYAN);
              if(TAD14 > LIMITE) {
                  t19.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD16 > 0) {
              t20.setBackground(Color.CYAN);
              if(TAD15 > LIMITE) {
                  t20.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD17 > 0) {
              t21.setBackground(Color.CYAN);
              if(TAD16 > LIMITE) {
                  t21.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD18 > 0) {
              t22.setBackground(Color.CYAN);
              if(TAD17 > LIMITE) {
                  t22.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD19 > 0) {
              t23.setBackground(Color.CYAN);
              if(TAD18 > LIMITE) {
                  t23.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD20 > 0) {
              t24.setBackground(Color.CYAN);
              if(TAD19 > LIMITE) {
                  t24.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD21 > 0) {
              t25.setBackground(Color.CYAN);
              if(TAD20 > LIMITE) {
                  t25.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD22 > 0) {
              t26.setBackground(Color.CYAN);
              if(TAD21 > LIMITE) {
                  t26.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD23 > 0) {
              t27.setBackground(Color.CYAN);
              if(TAD22 > LIMITE) {
                  t27.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD24 > 0) {
              t28.setBackground(Color.CYAN);
              if(TAD23 > LIMITE) {
                  t28.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD25 > 0) {
              t29.setBackground(Color.CYAN);
              if(TAD24 > LIMITE) {
                  t29.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD26 > 0) {
              t30.setBackground(Color.CYAN);
              if(TAD25 > LIMITE) {
                  t30.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD27 > 0) {
              t31.setBackground(Color.CYAN);
              if(TAD26 > LIMITE) {
                  t31.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD28 > 0) {
              t32.setBackground(Color.CYAN);
              if(TAD27 > LIMITE) {
                  t32.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD29 > 0) {
              t33.setBackground(Color.CYAN);
              if(TAD28 > LIMITE) {
                  t33.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD30 > 0) {
              t34.setBackground(Color.CYAN);
              if(TAD29 > LIMITE) {
                  t34.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD31 > 0) {
              t35.setBackground(Color.CYAN);
              if(TAD30 > LIMITE) {
                  t35.setBackground(Color.MAGENTA);
              
                }
            }      
        }
    }
    
public void SEMANA_6() {
        int x = 0;
        
        String[] DIA = {
            t6.getText(), t7.getText(), t8.getText(), t9.getText(), t10.getText(),
            t11.getText(), t12.getText(), t13.getText(), t14.getText(), t15.getText(),
            t16.getText(), t17.getText(), t18.getText(), t19.getText(), t20.getText(),
            t21.getText(), t22.getText(), t23.getText(), t24.getText(), t25.getText(), 
            t26.getText(), t27.getText(), t28.getText(), t29.getText(), t30.getText(),
            t31.getText(), t32.getText(), t33.getText(), t34.getText(), t35.getText(), t36.getText(),};
            
        for (String D : DIA) {
            x++;
            if (D.equals("" + x) & TAD1 > 0) {
                t6.setBackground(Color.CYAN);
                if(TAD31 > LIMITE) {
                    t6.setBackground(Color.MAGENTA);
               }
            }
            if(D.equals("" + x) & TAD2 > 0) {
              t7.setBackground(Color.CYAN);
              if(TAD1 > LIMITE) {
                  t7.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD3 > 0) {
              t8.setBackground(Color.CYAN);
              if(TAD2 > LIMITE) {
                  t8.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD4 > 0) {
              t9.setBackground(Color.CYAN);
              if(TAD3 > LIMITE) {
                  t9.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD5 > 0) {
              t10.setBackground(Color.CYAN);
              if(TAD4 > LIMITE) {
                  t10.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD6 > 0) {
              t11.setBackground(Color.CYAN);
              if(TAD5 > LIMITE) {
                  t11.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD7 > 0) {
              t12.setBackground(Color.CYAN);
              if(TAD6 > LIMITE) {
                  t12.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD8 > 0) {
              t13.setBackground(Color.CYAN);
              if(TAD7 > LIMITE) {
                  t13.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD9 > 0) {
              t14.setBackground(Color.CYAN);
              if(TAD8 > LIMITE) {
                  t14.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD10 > 0) {
              t15.setBackground(Color.CYAN);
              if(TAD9 > LIMITE) {
                  t15.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD11 > 0) {
              t16.setBackground(Color.CYAN);
              if(TAD10 > LIMITE) {
                  t16.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD12 > 0) {
              t17.setBackground(Color.CYAN);
              if(TAD11 > LIMITE) {
                  t17.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD13 > 0) {
              t18.setBackground(Color.CYAN);
              if(TAD12 > LIMITE) {
                  t18.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD14 > 0) {
              t19.setBackground(Color.CYAN);
              if(TAD13 > LIMITE) {
                  t19.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD15 > 0) {
              t20.setBackground(Color.CYAN);
              if(TAD14 > LIMITE) {
                  t20.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD16 > 0) {
              t21.setBackground(Color.CYAN);
              if(TAD15 > LIMITE) {
                  t21.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD17 > 0) {
              t22.setBackground(Color.CYAN);
              if(TAD16 > LIMITE) {
                  t22.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD18 > 0) {
              t23.setBackground(Color.CYAN);
              if(TAD17 > LIMITE) {
                  t23.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD19 > 0) {
              t24.setBackground(Color.CYAN);
              if(TAD18 > LIMITE) {
                  t24.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD20 > 0) {
              t25.setBackground(Color.CYAN);
              if(TAD19 > LIMITE) {
                  t25.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD21 > 0) {
              t26.setBackground(Color.CYAN);
              if(TAD20 > LIMITE) {
                  t26.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD22 > 0) {
              t27.setBackground(Color.CYAN);
              if(TAD21 > LIMITE) {
                  t27.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD23 > 0) {
              t28.setBackground(Color.CYAN);
              if(TAD22 > LIMITE) {
                  t28.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD24 > 0) {
              t29.setBackground(Color.CYAN);
              if(TAD23 > LIMITE) {
                  t29.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD25 > 0) {
              t30.setBackground(Color.CYAN);
              if(TAD24 > LIMITE) {
                  t30.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD26 > 0) {
              t31.setBackground(Color.CYAN);
              if(TAD25 > LIMITE) {
                  t31.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD27 > 0) {
              t32.setBackground(Color.CYAN);
              if(TAD26 > LIMITE) {
                  t32.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD28 > 0) {
              t33.setBackground(Color.CYAN);
              if(TAD27 > LIMITE) {
                  t33.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD29 > 0) {
              t34.setBackground(Color.CYAN);
              if(TAD28 > LIMITE) {
                  t34.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD30 > 0) {
              t35.setBackground(Color.CYAN);
              if(TAD29 > LIMITE) {
                  t35.setBackground(Color.MAGENTA);
                }
            }
              if(D.equals("" + x) & TAD31 > 0) {
              t36.setBackground(Color.CYAN);
              if(TAD30 > LIMITE) {
                  t36.setBackground(Color.MAGENTA);
              
                }
            }      
        }
    }
    
public void SEMANA_7() {
        int x = 0;
        
        String[] DIA = {
            t7.getText(), t8.getText(), t9.getText(), t10.getText(),
            t11.getText(), t12.getText(), t13.getText(), t14.getText(), t15.getText(),
            t16.getText(), t17.getText(), t18.getText(), t19.getText(), t20.getText(),
            t21.getText(), t22.getText(), t23.getText(), t24.getText(), t25.getText(), 
            t26.getText(), t27.getText(), t28.getText(), t29.getText(), t30.getText(),
            t31.getText(), t32.getText(), t33.getText(), t34.getText(), t35.getText(), t36.getText(), t37.getText(), };
            
        for (String D : DIA) {
            x++;
            if (D.equals("" + x) & TAD1 > 0) {
                t7.setBackground(Color.CYAN);
                if(TAD31 > LIMITE) {
                    t7.setBackground(Color.RED);
               }
            }
            if(D.equals("" + x) & TAD2 > 0) {
              t8.setBackground(Color.CYAN);
              if(TAD1 > LIMITE) {
                  t8.setBackground(Color.RED);
                }
            }
              if(D.equals("" + x) & TAD3 > 0) {
              t9.setBackground(Color.CYAN);
              if(TAD2 > LIMITE) {
                  t9.setBackground(Color.RED);
                }
            }
              if(D.equals("" + x) & TAD4 > 0) {
              t10.setBackground(Color.CYAN);
              if(TAD3 > LIMITE) {
                  t10.setBackground(Color.RED);
                }
            }
              if(D.equals("" + x) & TAD5 > 0) {
              t11.setBackground(Color.CYAN);
              if(TAD4 > LIMITE) {
                  t11.setBackground(Color.RED);
                }
            }
              if(D.equals("" + x) & TAD6 > 0) {
              t12.setBackground(Color.CYAN);
              if(TAD5 > LIMITE) {
                  t12.setBackground(Color.RED);
                }
            }
              if(D.equals("" + x) & TAD7 > 0) {
              t13.setBackground(Color.CYAN);
              if(TAD6 > LIMITE) {
                  t13.setBackground(Color.RED);
                }
            }
              if(D.equals("" + x) & TAD8 > 0) {
              t14.setBackground(Color.CYAN);
              if(TAD7 > LIMITE) {
                  t14.setBackground(Color.RED);
                }
            }
              if(D.equals("" + x) & TAD9 > 0) {
              t15.setBackground(Color.CYAN);
              if(TAD8 > LIMITE) {
                  t15.setBackground(Color.RED);
                }
            }
              if(D.equals("" + x) & TAD10 > 0) {
              t16.setBackground(Color.CYAN);
              if(TAD9 > LIMITE) {
                  t16.setBackground(Color.RED);
                }
            }
              if(D.equals("" + x) & TAD11 > 0) {
              t17.setBackground(Color.CYAN);
              if(TAD10 > LIMITE) {
                  t17.setBackground(Color.RED);
                }
            }
              if(D.equals("" + x) & TAD12 > 0) {
              t18.setBackground(Color.CYAN);
              if(TAD11 > LIMITE) {
                  t18.setBackground(Color.RED);
                }
            }
              if(D.equals("" + x) & TAD13 > 0) {
              t19.setBackground(Color.CYAN);
              if(TAD12 > LIMITE) {
                  t19.setBackground(Color.RED);
                }
            }
              if(D.equals("" + x) & TAD14 > 0) {
              t20.setBackground(Color.CYAN);
              if(TAD13 > LIMITE) {
                  t20.setBackground(Color.RED);
                }
            }
              if(D.equals("" + x) & TAD15 > 0) {
              t21.setBackground(Color.CYAN);
              if(TAD14 > LIMITE) {
                  t21.setBackground(Color.RED);
                }
            }
              if(D.equals("" + x) & TAD16 > 0) {
              t22.setBackground(Color.CYAN);
              if(TAD15 > LIMITE) {
                  t22.setBackground(Color.RED);
                }
            }
              if(D.equals("" + x) & TAD17 > 0) {
              t23.setBackground(Color.CYAN);
              if(TAD16 > LIMITE) {
                  t23.setBackground(Color.RED);
                }
            }
              if(D.equals("" + x) & TAD18 > 0) {
              t24.setBackground(Color.CYAN);
              if(TAD17 > LIMITE) {
                  t24.setBackground(Color.RED);
                }
            }
              if(D.equals("" + x) & TAD19 > 0) {
              t25.setBackground(Color.CYAN);
              if(TAD18 > LIMITE) {
                  t25.setBackground(Color.RED);
                }
            }
              if(D.equals("" + x) & TAD20 > 0) {
              t26.setBackground(Color.CYAN);
              if(TAD19 > LIMITE) {
                  t26.setBackground(Color.RED);
                }
            }
              if(D.equals("" + x) & TAD21 > 0) {
              t27.setBackground(Color.CYAN);
              if(TAD20 > LIMITE) {
                  t27.setBackground(Color.RED);
                }
            }
              if(D.equals("" + x) & TAD22 > 0) {
              t28.setBackground(Color.CYAN);
              if(TAD21 > LIMITE) {
                  t28.setBackground(Color.RED);
                }
            }
              if(D.equals("" + x) & TAD23 > 0) {
              t29.setBackground(Color.CYAN);
              if(TAD22 > LIMITE) {
                  t29.setBackground(Color.RED);
                }
            }
              if(D.equals("" + x) & TAD24 > 0) {
              t30.setBackground(Color.CYAN);
              if(TAD23 > LIMITE) {
                  t30.setBackground(Color.RED);
                }
            }
              if(D.equals("" + x) & TAD25 > 0) {
              t31.setBackground(Color.CYAN);
              if(TAD24 > LIMITE) {
                  t31.setBackground(Color.RED);
                }
            }
              if(D.equals("" + x) & TAD26 > 0) {
              t32.setBackground(Color.CYAN);
              if(TAD25 > LIMITE) {
                  t32.setBackground(Color.RED);
                }
            }
              if(D.equals("" + x) & TAD27 > 0) {
              t33.setBackground(Color.CYAN);
              if(TAD26 > LIMITE) {
                  t33.setBackground(Color.RED);
                }
            }
              if(D.equals("" + x) & TAD28 > 0) {
              t34.setBackground(Color.CYAN);
              if(TAD27 > LIMITE) {
                  t34.setBackground(Color.RED);
                }
            }
              if(D.equals("" + x) & TAD29 > 0) {
              t35.setBackground(Color.CYAN);
              if(TAD28 > LIMITE) {
                  t35.setBackground(Color.RED);
                }
            }
              if(D.equals("" + x) & TAD30 > 0) {
              t36.setBackground(Color.CYAN);
              if(TAD29 > LIMITE) {
                  t36.setBackground(Color.RED);
                }
            }
              if(D.equals("" + x) & TAD31 > 0) {
              t37.setBackground(Color.CYAN);
              if(TAD30 > LIMITE) {
                  t37.setBackground(Color.RED);
              
                }
            }      
        }
    }

public void SETADIAAGENDAMENTO() {
    DiaAgendamento = DiaAltera;
    MesAgendamento = SelecaoMes.getSelectedIndex() + 1;
    AnoAgendamento = Integer.parseInt(SelecaoAno.getSelectedItem().toString());
}
    
//   public void RETIRABORDA() {
//        N930.setBorder(null);
//        S930.setBorder(null);
//        N1000.setBorder(null);
//        S1000.setBorder(null);
//        N1030.setBorder(null);
//        S1030.setBorder(null);
//        N1100.setBorder(null);
//        S1100.setBorder(null);
//        N1130.setBorder(null);
//        S1130.setBorder(null);
//        N1200.setBorder(null);
//        S1200.setBorder(null);
//        N1230.setBorder(null);
//        S1230.setBorder(null);
//        N1300.setBorder(null);
//        S1300.setBorder(null);
//        N1330.setBorder(null);
//        S1330.setBorder(null);
//        N1400.setBorder(null);
//        S1400.setBorder(null);
//        N1430.setBorder(null);
//        S1430.setBorder(null);
//        N1500.setBorder(null);
//        S1500.setBorder(null);
//        N1530.setBorder(null);
//        S1530.setBorder(null);
//        N1600.setBorder(null);
//        S1600.setBorder(null);
//        N1630.setBorder(null);
//        S1630.setBorder(null);
//        N1700.setBorder(null);
//        S1700.setBorder(null);
//        N1730.setBorder(null);
//        S1730.setBorder(null);
//        S1800.setBorder(null);
//        N1800.setBorder(null);
//        S1830.setBorder(null);
//        N1830.setBorder(null);
//        S1900.setBorder(null);
//        N1900.setBorder(null);
//        S1930.setBorder(null);
//        N1930.setBorder(null);
//        S2000.setBorder(null);
//        N2000.setBorder(null);
//        S2030.setBorder(null);
//        N2030.setBorder(null);
//        S2100.setBorder(null);
//        N2100.setBorder(null);
//       
//      }  
//       

}