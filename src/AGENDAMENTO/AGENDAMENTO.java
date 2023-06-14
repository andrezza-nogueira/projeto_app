package AGENDAMENTO;

import PRINCIPAL.CONTACTO;
import PRINCIPAL.PRINCIPAL;
import PRINCIPAL.SERVICO;
import UTILIDA.CONEXAO;
import UTILIDA.GRA_ALT_EXC;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListCellRenderer;


/**
 *
 * @author Andrezza
 */
public class AGENDAMENTO extends javax.swing.JDialog {
    int AnoFIXO = 0, MesFIXO = 0, DiaFIXO = 0;
    int AnoAltera = 0, MesAltera = 0, DiaAltera = 0;
    int valorselecao = 0;
    DefaultListModel MODELOHORA = new DefaultListModel();
    DefaultListModel MODELONOME = new DefaultListModel();
    DefaultListModel MODELOSERVICO = new DefaultListModel();
    
    CONEXAO CONEXAO = new CONEXAO();
    int grava = 0;
    int LIMITE = 1;
    
    int ListaNomeEnter = 0, ListaServicoEnter = 0;
    double ValorDoServico = 0;
    
    int TAD1 = 0, TAD2 = 0, TAD3 = 0, TAD4 = 0, TAD5 = 0, TAD6 = 0, TAD7 = 0, TAD8 = 0, 
            TAD9 = 0, TAD10 = 0, TAD11 = 0, TAD12 = 0, TAD13 = 0, TAD14 = 0, TAD15 = 0, TAD16 = 0,
            TAD17 = 0, TAD18 = 0, TAD19 = 0, TAD20 = 0, TAD21 = 0, TAD22 = 0, TAD23 = 0, TAD24 = 0,
            TAD25 = 0, TAD26 = 0, TAD27 = 0, TAD28 = 0, TAD29 = 0, TAD30 = 0, TAD31 = 0;


    public AGENDAMENTO(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        CONEXAO.conecta();
        MOSTRA_DADOS_LIMITE();
        
        CALENDARIO_V1();
        CALENDARIO_V3();
        INSERE_COR_CALENDARIO();

        ListaHORA.setModel(MODELOHORA);
        ListaNOME.setModel(MODELONOME);
        ListaSERVICO.setModel(MODELOSERVICO);
        
        //colicar imagens deposi
        BotaoNovoServico.setToolTipText("Registar novo serviço");
        BotaoNovoContacto.setToolTipText("Registar novo contacto");
        BotaoNovoAgendamento.setToolTipText("Novo agendamento");
        BotaoSalvar.setToolTipText("Salvar agendamento");
        BotaoExcluir.setToolTipText("Excluir agendamento");
        
        CamadaCalendario.setVisible(false);
        jScrollPane4.setVisible(false);
        ListaHORA.setVisible(false);
        Cod.setVisible(false);
        ListaNOME.setVisible(false);
        ListaSERVICO.setVisible(false); 
        
//        setIconImage(getIconImage());
//        }
//        
//        
//        public final Image getIconImage() {
//        Image ICONE = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("IMAGE/logoprog"));
//        return ICONE;     
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        CamadaCalendario = new javax.swing.JLayeredPane();
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
        DATAAGENDAMENTO = new javax.swing.JLabel();
        ListaSERVICO = new javax.swing.JList<>();
        ListaNOME = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        ListaHORA = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaAgendamento = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        observacao = new javax.swing.JTextArea();
        BotaoNovoAgendamento = new javax.swing.JButton();
        BotaoSalvar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        BotaoExcluir = new javax.swing.JButton();
        Lnome = new javax.swing.JLabel();
        Lservico = new javax.swing.JLabel();
        Ldata = new javax.swing.JLabel();
        Lhora = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        servico = new javax.swing.JTextField();
        Lobs = new javax.swing.JLabel();
        hora = new javax.swing.JLabel();
        Cod = new javax.swing.JLabel();
        BotaoNovoServico = new javax.swing.JButton();
        BotaoNovoContacto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLayeredPane1.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane1.setOpaque(true);

        CamadaCalendario.setBackground(new java.awt.Color(255, 255, 255));
        CamadaCalendario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CamadaCalendario.setOpaque(true);

        SelecaoMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));
        SelecaoMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelecaoMesActionPerformed(evt);
            }
        });
        CamadaCalendario.add(SelecaoMes);
        SelecaoMes.setBounds(0, 0, 98, 20);

        SelecaoAno.setEditable(true);
        SelecaoAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelecaoAnoActionPerformed(evt);
            }
        });
        CamadaCalendario.add(SelecaoAno);
        SelecaoAno.setBounds(117, 1, 97, 20);

        ls1.setBackground(new java.awt.Color(0, 204, 204));
        ls1.setForeground(new java.awt.Color(255, 0, 51));
        ls1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ls1.setText("Dom");
        ls1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        ls1.setOpaque(true);
        CamadaCalendario.add(ls1);
        ls1.setBounds(3, 27, 25, 16);

        ls2.setBackground(new java.awt.Color(0, 204, 204));
        ls2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ls2.setText("Seg");
        ls2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        ls2.setOpaque(true);
        CamadaCalendario.add(ls2);
        ls2.setBounds(34, 27, 25, 16);

        ls3.setBackground(new java.awt.Color(0, 204, 204));
        ls3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ls3.setText("Ter");
        ls3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        ls3.setOpaque(true);
        CamadaCalendario.add(ls3);
        ls3.setBounds(65, 27, 25, 16);

        ls4.setBackground(new java.awt.Color(0, 204, 204));
        ls4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ls4.setText("Qua");
        ls4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        ls4.setOpaque(true);
        CamadaCalendario.add(ls4);
        ls4.setBounds(96, 27, 25, 16);

        ls5.setBackground(new java.awt.Color(0, 204, 204));
        ls5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ls5.setText("Qui");
        ls5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        ls5.setOpaque(true);
        CamadaCalendario.add(ls5);
        ls5.setBounds(127, 27, 25, 16);

        ls6.setBackground(new java.awt.Color(0, 204, 204));
        ls6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ls6.setText("Sex");
        ls6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        ls6.setOpaque(true);
        CamadaCalendario.add(ls6);
        ls6.setBounds(158, 27, 25, 16);

        t7.setBackground(new java.awt.Color(204, 204, 204));
        t7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t7.setText("0");
        CamadaCalendario.add(t7);
        t7.setBounds(189, 49, 25, 14);

        t14.setBackground(new java.awt.Color(204, 204, 204));
        t14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t14.setText("0");
        CamadaCalendario.add(t14);
        t14.setBounds(189, 69, 25, 14);

        t21.setBackground(new java.awt.Color(204, 204, 204));
        t21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t21.setText("0");
        CamadaCalendario.add(t21);
        t21.setBounds(189, 89, 25, 14);

        t28.setBackground(new java.awt.Color(204, 204, 204));
        t28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t28.setText("0");
        CamadaCalendario.add(t28);
        t28.setBounds(189, 109, 25, 14);

        t35.setBackground(new java.awt.Color(204, 204, 204));
        t35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t35.setText("0");
        CamadaCalendario.add(t35);
        t35.setBounds(189, 129, 25, 14);

        ls7.setBackground(new java.awt.Color(0, 204, 204));
        ls7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ls7.setText("Sab");
        ls7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        ls7.setOpaque(true);
        CamadaCalendario.add(ls7);
        ls7.setBounds(189, 27, 25, 16);

        t42.setBackground(new java.awt.Color(204, 204, 204));
        t42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t42.setText("0");
        CamadaCalendario.add(t42);
        t42.setBounds(189, 149, 25, 14);

        t6.setBackground(new java.awt.Color(204, 204, 204));
        t6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t6.setText("0");
        CamadaCalendario.add(t6);
        t6.setBounds(158, 49, 25, 14);

        t13.setBackground(new java.awt.Color(204, 204, 204));
        t13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t13.setText("0");
        CamadaCalendario.add(t13);
        t13.setBounds(158, 69, 25, 14);

        t20.setBackground(new java.awt.Color(204, 204, 204));
        t20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t20.setText("0");
        CamadaCalendario.add(t20);
        t20.setBounds(158, 89, 25, 14);

        t27.setBackground(new java.awt.Color(204, 204, 204));
        t27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t27.setText("0");
        CamadaCalendario.add(t27);
        t27.setBounds(158, 109, 25, 14);

        t34.setBackground(new java.awt.Color(204, 204, 204));
        t34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t34.setText("0");
        CamadaCalendario.add(t34);
        t34.setBounds(158, 129, 25, 14);

        t41.setBackground(new java.awt.Color(204, 204, 204));
        t41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t41.setText("0");
        CamadaCalendario.add(t41);
        t41.setBounds(158, 149, 25, 14);

        t5.setBackground(new java.awt.Color(204, 204, 204));
        t5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t5.setText("0");
        CamadaCalendario.add(t5);
        t5.setBounds(127, 49, 25, 14);

        t12.setBackground(new java.awt.Color(204, 204, 204));
        t12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t12.setText("0");
        CamadaCalendario.add(t12);
        t12.setBounds(127, 69, 25, 14);

        t19.setBackground(new java.awt.Color(204, 204, 204));
        t19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t19.setText("0");
        CamadaCalendario.add(t19);
        t19.setBounds(127, 89, 25, 14);

        t26.setBackground(new java.awt.Color(204, 204, 204));
        t26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t26.setText("0");
        CamadaCalendario.add(t26);
        t26.setBounds(127, 109, 25, 14);

        t33.setBackground(new java.awt.Color(204, 204, 204));
        t33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t33.setText("0");
        CamadaCalendario.add(t33);
        t33.setBounds(127, 129, 25, 14);

        t40.setBackground(new java.awt.Color(204, 204, 204));
        t40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t40.setText("0");
        CamadaCalendario.add(t40);
        t40.setBounds(127, 149, 25, 14);

        t4.setBackground(new java.awt.Color(204, 204, 204));
        t4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t4.setText("0");
        CamadaCalendario.add(t4);
        t4.setBounds(96, 49, 25, 14);

        t11.setBackground(new java.awt.Color(204, 204, 204));
        t11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t11.setText("0");
        CamadaCalendario.add(t11);
        t11.setBounds(96, 69, 25, 14);

        t18.setBackground(new java.awt.Color(204, 204, 204));
        t18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t18.setText("0");
        CamadaCalendario.add(t18);
        t18.setBounds(96, 89, 25, 14);

        t25.setBackground(new java.awt.Color(204, 204, 204));
        t25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t25.setText("0");
        CamadaCalendario.add(t25);
        t25.setBounds(96, 109, 25, 14);

        t32.setBackground(new java.awt.Color(204, 204, 204));
        t32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t32.setText("0");
        CamadaCalendario.add(t32);
        t32.setBounds(96, 129, 25, 14);

        t39.setBackground(new java.awt.Color(204, 204, 204));
        t39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t39.setText("0");
        CamadaCalendario.add(t39);
        t39.setBounds(96, 149, 25, 14);

        t3.setBackground(new java.awt.Color(204, 204, 204));
        t3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t3.setText("0");
        CamadaCalendario.add(t3);
        t3.setBounds(65, 49, 25, 14);

        t10.setBackground(new java.awt.Color(204, 204, 204));
        t10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t10.setText("0");
        CamadaCalendario.add(t10);
        t10.setBounds(65, 69, 25, 14);

        t17.setBackground(new java.awt.Color(204, 204, 204));
        t17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t17.setText("0");
        CamadaCalendario.add(t17);
        t17.setBounds(65, 89, 25, 14);

        t24.setBackground(new java.awt.Color(204, 204, 204));
        t24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t24.setText("0");
        CamadaCalendario.add(t24);
        t24.setBounds(65, 109, 25, 14);

        t31.setBackground(new java.awt.Color(204, 204, 204));
        t31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t31.setText("0");
        CamadaCalendario.add(t31);
        t31.setBounds(65, 129, 25, 14);

        t38.setBackground(new java.awt.Color(204, 204, 204));
        t38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t38.setText("0");
        CamadaCalendario.add(t38);
        t38.setBounds(65, 149, 25, 14);

        t2.setBackground(new java.awt.Color(204, 204, 204));
        t2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t2.setText("0");
        CamadaCalendario.add(t2);
        t2.setBounds(34, 49, 25, 14);

        t9.setBackground(new java.awt.Color(204, 204, 204));
        t9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t9.setText("0");
        CamadaCalendario.add(t9);
        t9.setBounds(34, 69, 25, 14);

        t16.setBackground(new java.awt.Color(204, 204, 204));
        t16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t16.setText("0");
        CamadaCalendario.add(t16);
        t16.setBounds(34, 89, 25, 14);

        t23.setBackground(new java.awt.Color(204, 204, 204));
        t23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t23.setText("0");
        CamadaCalendario.add(t23);
        t23.setBounds(34, 109, 25, 14);

        t30.setBackground(new java.awt.Color(204, 204, 204));
        t30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t30.setText("0");
        CamadaCalendario.add(t30);
        t30.setBounds(34, 129, 25, 14);

        t37.setBackground(new java.awt.Color(204, 204, 204));
        t37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t37.setText("0");
        CamadaCalendario.add(t37);
        t37.setBounds(34, 149, 25, 14);

        t1.setBackground(new java.awt.Color(204, 204, 204));
        t1.setForeground(new java.awt.Color(255, 0, 51));
        t1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t1.setText("0");
        t1.setOpaque(true);
        CamadaCalendario.add(t1);
        t1.setBounds(3, 49, 25, 14);

        t8.setBackground(new java.awt.Color(204, 204, 204));
        t8.setForeground(new java.awt.Color(255, 0, 51));
        t8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t8.setText("0");
        CamadaCalendario.add(t8);
        t8.setBounds(3, 69, 25, 14);

        t15.setBackground(new java.awt.Color(204, 204, 204));
        t15.setForeground(new java.awt.Color(255, 0, 51));
        t15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t15.setText("0");
        CamadaCalendario.add(t15);
        t15.setBounds(3, 89, 25, 14);

        t22.setBackground(new java.awt.Color(204, 204, 204));
        t22.setForeground(new java.awt.Color(255, 0, 51));
        t22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t22.setText("0");
        CamadaCalendario.add(t22);
        t22.setBounds(3, 109, 25, 14);

        t29.setBackground(new java.awt.Color(204, 204, 204));
        t29.setForeground(new java.awt.Color(255, 0, 51));
        t29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t29.setText("0");
        CamadaCalendario.add(t29);
        t29.setBounds(3, 129, 25, 14);

        t36.setBackground(new java.awt.Color(204, 204, 204));
        t36.setForeground(new java.awt.Color(255, 0, 51));
        t36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t36.setText("0");
        CamadaCalendario.add(t36);
        t36.setBounds(3, 149, 25, 14);

        jLayeredPane1.add(CamadaCalendario);
        CamadaCalendario.setBounds(60, 150, 220, 150);

        DATAAGENDAMENTO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DATAAGENDAMENTOMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DATAAGENDAMENTOMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DATAAGENDAMENTOMouseExited(evt);
            }
        });
        jLayeredPane1.add(DATAAGENDAMENTO);
        DATAAGENDAMENTO.setBounds(70, 130, 80, 20);

        ListaSERVICO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ListaSERVICO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaSERVICOMouseClicked(evt);
            }
        });
        jLayeredPane1.add(ListaSERVICO);
        ListaSERVICO.setBounds(70, 120, 410, 70);

        ListaNOME.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ListaNOME.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ListaNOMEFocusGained(evt);
            }
        });
        ListaNOME.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaNOMEMouseClicked(evt);
            }
        });
        jLayeredPane1.add(ListaNOME);
        ListaNOME.setBounds(70, 90, 410, 90);

        ListaHORA.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ListaHORAMouseMoved(evt);
            }
        });
        ListaHORA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaHORAMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(ListaHORA);

        jLayeredPane1.add(jScrollPane4);
        jScrollPane4.setBounds(470, 150, 90, 150);

        TabelaAgendamento.setAutoCreateRowSorter(true);
        TabelaAgendamento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        TabelaAgendamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Serviço", "Data ", "Observação"
            }
        ));
        TabelaAgendamento.setGridColor(new java.awt.Color(0, 0, 0));
        TabelaAgendamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaAgendamentoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaAgendamento);

        jLayeredPane1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 310, 500, 90);

        observacao.setColumns(20);
        observacao.setRows(5);
        observacao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                observacaoFocusGained(evt);
            }
        });
        jScrollPane2.setViewportView(observacao);

        jLayeredPane1.add(jScrollPane2);
        jScrollPane2.setBounds(20, 210, 460, 80);

        BotaoNovoAgendamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGEM/livro.png"))); // NOI18N
        BotaoNovoAgendamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotaoNovoAgendamentoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoNovoAgendamentoMouseExited(evt);
            }
        });
        BotaoNovoAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoNovoAgendamentoActionPerformed(evt);
            }
        });
        jLayeredPane1.add(BotaoNovoAgendamento);
        BotaoNovoAgendamento.setBounds(10, 0, 50, 50);

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
        jLayeredPane1.add(BotaoSalvar);
        BotaoSalvar.setBounds(80, 0, 50, 50);
        jLayeredPane1.add(jSeparator1);
        jSeparator1.setBounds(30, 150, 500, 10);
        jLayeredPane1.add(jSeparator2);
        jSeparator2.setBounds(30, 92, 500, 2);
        jLayeredPane1.add(jSeparator3);
        jSeparator3.setBounds(30, 120, 500, 10);

        BotaoExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGEM/deleta.png"))); // NOI18N
        BotaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoExcluirActionPerformed(evt);
            }
        });
        jLayeredPane1.add(BotaoExcluir);
        BotaoExcluir.setBounds(470, 0, 50, 50);

        Lnome.setText("Nome:");
        jLayeredPane1.add(Lnome);
        Lnome.setBounds(30, 70, 40, 20);

        Lservico.setText("Serviço:");
        jLayeredPane1.add(Lservico);
        Lservico.setBounds(30, 100, 50, 20);

        Ldata.setText("Data:");
        jLayeredPane1.add(Ldata);
        Ldata.setBounds(30, 130, 40, 20);

        Lhora.setText("Hora:");
        jLayeredPane1.add(Lhora);
        Lhora.setBounds(440, 130, 40, 20);

        nome.setBorder(null);
        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });
        nome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nomeKeyReleased(evt);
            }
        });
        jLayeredPane1.add(nome);
        nome.setBounds(70, 70, 410, 20);

        servico.setBorder(null);
        servico.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                servicoFocusGained(evt);
            }
        });
        servico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                servicoActionPerformed(evt);
            }
        });
        servico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                servicoKeyReleased(evt);
            }
        });
        jLayeredPane1.add(servico);
        servico.setBounds(80, 100, 410, 20);

        Lobs.setText("Observação:");
        jLayeredPane1.add(Lobs);
        Lobs.setBounds(20, 190, 70, 20);

        hora.setText("09:30");
        hora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                horaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                horaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                horaMouseExited(evt);
            }
        });
        jLayeredPane1.add(hora);
        hora.setBounds(480, 130, 50, 20);

        Cod.setText("Cod");
        jLayeredPane1.add(Cod);
        Cod.setBounds(240, 30, 19, 14);

        BotaoNovoServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGEM/pedido.png"))); // NOI18N
        BotaoNovoServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoNovoServicoActionPerformed(evt);
            }
        });
        jLayeredPane1.add(BotaoNovoServico);
        BotaoNovoServico.setBounds(500, 100, 30, 23);

        BotaoNovoContacto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGEM/perfil.png"))); // NOI18N
        BotaoNovoContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoNovoContactoActionPerformed(evt);
            }
        });
        jLayeredPane1.add(BotaoNovoContacto);
        BotaoNovoContacto.setBounds(500, 70, 30, 25);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SelecaoMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelecaoMesActionPerformed
        try {
            DiaAltera = DiaFIXO;
            CALENDARIO_V2();
            INSERE_COR_CALENDARIO();
        } catch (Exception err) {
            System.out.println(err);
        }
    }//GEN-LAST:event_SelecaoMesActionPerformed

    private void SelecaoAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelecaoAnoActionPerformed
        try {
            int x = Integer.parseInt(SelecaoAno.getSelectedItem().toString());
            DiaAltera = DiaFIXO;
            CALENDARIO_V2();
            INSERE_COR_CALENDARIO();
        } catch (Exception e) {
            SelecaoAno.setSelectedItem(AnoFIXO);
            INSERE_COR_CALENDARIO();
        }
    }//GEN-LAST:event_SelecaoAnoActionPerformed

    private void BotaoNovoAgendamentoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoNovoAgendamentoMouseEntered
        BotaoNovoAgendamento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_BotaoNovoAgendamentoMouseEntered

    private void BotaoNovoAgendamentoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoNovoAgendamentoMouseExited
        BotaoNovoAgendamento.setBorder(null);
    }//GEN-LAST:event_BotaoNovoAgendamentoMouseExited

    private void BotaoSalvarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoSalvarMouseEntered
        BotaoSalvar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_BotaoSalvarMouseEntered

    private void BotaoSalvarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoSalvarMouseExited
        BotaoSalvar.setBorder(null);
    }//GEN-LAST:event_BotaoSalvarMouseExited

    private void BotaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSalvarActionPerformed
        try {
            if(grava == 0) {
                int cont = nome.getText().length();
                if(cont > 0) {
                    gravar();
                    ECRAPRIN.LEGENDA();
                    PREENCHE_TABELA();
                    INSERE_COR_CALENDARIO();
                    ECRAPRIN.INSERE_COR_CALENDARIO();
                }
            }
            if (grava == 1) {
                Alteracao();
                ECRAPRIN.LEGENDA();
                PREENCHE_TABELA();
                INSERE_COR_CALENDARIO();
                ECRAPRIN.INSERE_COR_CALENDARIO();
                dispose();
            }
            if (grava == 2) {
                Alteracao();
//                PESQUISAAGENDA.PESQUISANOME();
//                PESQUISAAGENDA.ECRAPRIN.LEGENDA();
//                PESQUISAAGENDA.ECRAPRIN.INSERE_COR_CALENDARIO();
                dispose();
            }
            if(grava == 3) {
                int cont = nome.getText().length();
                if(cont > 0) {
                    gravar();
                    ECRAPRIN.LEGENDA();
                    PREENCHE_TABELA();
                    INSERE_COR_CALENDARIO();
                    ECRAPRIN.INSERE_COR_CALENDARIO();
                    dispose();
                }
            }
        } catch (Exception err) {
            System.out.println(err);
        }
    }//GEN-LAST:event_BotaoSalvarActionPerformed

    private void ListaHORAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaHORAMouseClicked
        int n = ListaHORA.getSelectedIndex(); //ALTERA A DATA NA TABELA
        hora.setText(MODELOHORA.getElementAt(n).toString().substring(0, 5));
        jScrollPane4.setVisible(false);
        ListaHORA.setVisible(false);
    }//GEN-LAST:event_ListaHORAMouseClicked

    private void horaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_horaMouseClicked
       try {
            if (grava == 1) {
                PREENCHE_LISTA();
                jScrollPane4.setVisible(true);
                ListaHORA.setVisible(true);
                CamadaCalendario.setVisible(false);
            }
        try {
            if (ECRAPRIN.ChamaAgendaPMenu == 0) {
                PREENCHE_LISTA();
                jScrollPane4.setVisible(true);
                ListaHORA.setVisible(true);
                CamadaCalendario.setVisible(false);
            }
        } catch (Exception erro) {
            System.out.println(erro);
        }    
            if (grava == 2) {
                PREENCHE_LISTA();
                jScrollPane4.setVisible(true);
                ListaHORA.setVisible(true);
                CamadaCalendario.setVisible(false);
            }
            if (grava == 3) {
                PREENCHE_LISTA();
                jScrollPane4.setVisible(true);
                ListaHORA.setVisible(true);
                CamadaCalendario.setVisible(false);
            }
        } catch (Exception err) {
            System.out.println(err);
        }
    }//GEN-LAST:event_horaMouseClicked

    private void horaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_horaMouseEntered
        hora.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_horaMouseEntered

    private void horaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_horaMouseExited
        hora.setBorder(null);
    }//GEN-LAST:event_horaMouseExited

    private void ListaHORAMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaHORAMouseMoved
        ListaHORA = (JList) evt.getSource(); //DIRECIONA O METODO PARA FAZER A CONTA DE AGENDAMENTO
        ListaHORA.setSelectedIndex(ListaHORA.locationToIndex(evt.getPoint()));
        MENSAGEM_PASSAR_RATO();
    }//GEN-LAST:event_ListaHORAMouseMoved

    private void DATAAGENDAMENTOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DATAAGENDAMENTOMouseClicked
        int dia = Integer.parseInt(DATAAGENDAMENTO.getText().substring(0, 2)); //CRIA O EVENTO DE APARECE E DESAPARECER O CALENDARIO
        int mes = Integer.parseInt(DATAAGENDAMENTO.getText().substring(3, 5));
        int ano = Integer.parseInt(DATAAGENDAMENTO.getText().substring(6, 10));
            if (grava == 1) {
                CamadaCalendario.setVisible(true);
                SelecaoAno.setSelectedItem(ano);
                SelecaoMes.setSelectedIndex(mes - 1);
            }
        try {
            if (ECRAPRIN.ChamaAgendaPMenu == 0) {
                CamadaCalendario.setVisible(true);
                SelecaoAno.setSelectedItem(ano);
                SelecaoMes.setSelectedIndex(mes - 1);
            }
        } catch (Exception erro) {
            System.out.println(erro);
        } 
            if (grava == 2) {
                PREENCHE_LISTA();
                CamadaCalendario.setVisible(true);
                SelecaoAno.setSelectedItem(ano);
                SelecaoMes.setSelectedIndex(mes - 1);
            }
            if (grava == 3) {
                CamadaCalendario.setVisible(true);
                SelecaoAno.setSelectedItem(ano);
                SelecaoMes.setSelectedIndex(mes - 1);
            }
            jScrollPane4.setVisible(false);
            ListaHORA.setVisible(false);
    }//GEN-LAST:event_DATAAGENDAMENTOMouseClicked

    private void DATAAGENDAMENTOMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DATAAGENDAMENTOMouseEntered
        
    }//GEN-LAST:event_DATAAGENDAMENTOMouseEntered

    private void DATAAGENDAMENTOMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DATAAGENDAMENTOMouseExited
        
    }//GEN-LAST:event_DATAAGENDAMENTOMouseExited

    private void observacaoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_observacaoFocusGained
        CamadaCalendario.setVisible(false);
        jScrollPane4.setVisible(false);
        ListaHORA.setVisible(false);
        ListaNOME.setVisible(false);
        ListaSERVICO.setVisible(false);
    }//GEN-LAST:event_observacaoFocusGained

    private void TabelaAgendamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaAgendamentoMouseClicked
        try {
            MOSTRA_DADOS_TABELA();
            CamadaCalendario.setVisible(false);
            jScrollPane4.setVisible(false);
            ListaHORA.setVisible(false);
            ListaNOME.setVisible(false);
            nome.setForeground(Color.BLACK);
            BotaoSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGEM/salvar.png")));
            grava = 1;
            BotaoSalvar.setToolTipText("Salvar alterações no agendamento");
        } catch (Exception err) {
            System.out.println(err);
        }
    }//GEN-LAST:event_TabelaAgendamentoMouseClicked

    private void BotaoNovoAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoNovoAgendamentoActionPerformed
        try {
            grava = 3;
            TRAS_DATA_ECRA_PRINCIPAL();
            nome.setText("");
            servico.setText("");
            observacao.setText("");
            BotaoSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGEM/salvar.png")));
            BotaoSalvar.setToolTipText("Salvar agendamento");
            BotaoExcluir.setVisible(false);
        } catch (Exception err) {
            System.out.println(err);
        }
    }//GEN-LAST:event_BotaoNovoAgendamentoActionPerformed

    private void BotaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoExcluirActionPerformed
       try {
           int opcao = JOptionPane.showConfirmDialog(null, "Deseja excluir?");
           if (opcao == JOptionPane.YES_NO_OPTION) {
               Excluir();
               PREENCHE_TABELA();
               INSERE_COR_CALENDARIO();
               dispose();
           }
       } catch (Exception err1) {
           System.out.println(err1);
       }
       
       try {
           ECRAPRIN.LEGENDA();
           ECRAPRIN.INSERE_COR_CALENDARIO();
       } catch (Exception err1) {
           System.out.println("Erro na atualização" + err1);
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

    private void BotaoNovoContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoNovoContactoActionPerformed
        CONTACTO dialog = new CONTACTO(new javax.swing.JFrame(), true);
        dialog.MostraContacto(this);
    }//GEN-LAST:event_BotaoNovoContactoActionPerformed

    private void BotaoNovoServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoNovoServicoActionPerformed
        SERVICO dialog = new SERVICO(new javax.swing.JFrame(), true);
        dialog.MostraServico(this);
    }//GEN-LAST:event_BotaoNovoServicoActionPerformed

    private void nomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeKeyReleased
        int cont = nome.getText().length();
        if (cont > 0 & ListaNomeEnter == 0){
            PESQUISANOME();
            nome.setForeground(Color.red);
        } else {      
            ListaNOME.setVisible(false);
            ListaNomeEnter = 0;
        }
    }//GEN-LAST:event_nomeKeyReleased

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        try {
            ListaNomeEnter = 1;
            nome.setText(MODELONOME.getElementAt(0).toString());
            if (nome.getText().equals(MODELONOME.getElementAt(0))) {
                nome.setForeground(Color.GREEN);
        } else {
                nome.setForeground(Color.red);
                }
        } catch (Exception err){
            System.out.println(err);
        }    
    }//GEN-LAST:event_nomeActionPerformed

    private void ListaNOMEFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ListaNOMEFocusGained
        CamadaCalendario.setVisible(false);
//        JScrollPane4.setVisible(false);
        ListaHORA.setVisible(false);
        MODELONOME.removeAllElements();
    }//GEN-LAST:event_ListaNOMEFocusGained

    private void ListaNOMEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaNOMEMouseClicked
        try {
            nome.setText(ListaNOME.getSelectedValue().toString());
            nome.setForeground(Color.GREEN);
            ListaNOME.setVisible(false);
        } catch(Exception err) {
            System.out.println(err);
        }
    }//GEN-LAST:event_ListaNOMEMouseClicked

    private void servicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_servicoActionPerformed
        try {
            ListaServicoEnter = 1;
            servico.setText(MODELOSERVICO.getElementAt(0).toString());
            if (servico.getText().equals(MODELOSERVICO.getElementAt(0))){
                servico.setForeground(Color.GREEN);
                MostraValorServicoLinhazero();
            } else {
                servico.setForeground(Color.red);
                ValorDoServico = 0;
            }
        } catch (Exception err) {
            System.out.println(err);
        }
    }//GEN-LAST:event_servicoActionPerformed

    private void servicoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_servicoFocusGained
        CamadaCalendario.setVisible(false);
        jScrollPane4.setVisible(false);
        ListaHORA.setVisible(false);
        MODELOSERVICO.removeAllElements();
    }//GEN-LAST:event_servicoFocusGained

    private void servicoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_servicoKeyReleased
        int cont = servico.getText().length();
        if (cont > 0 & ListaServicoEnter == 0) {
            PESQUISASERVICO();
            servico.setForeground(Color.GREEN);
            ValorDoServico = 0;
        } else {
            ListaSERVICO.setVisible(false);
            ListaServicoEnter = 0;
        }
    }//GEN-LAST:event_servicoKeyReleased

    private void ListaSERVICOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaSERVICOMouseClicked
        try {
            servico.setText(ListaSERVICO.getSelectedValue().toString());          
            servico.setForeground(Color.GREEN);
            ListaSERVICO.setVisible(false);
        } catch(Exception err) {
            System.out.println(err);
        }
    }//GEN-LAST:event_ListaSERVICOMouseClicked

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
            java.util.logging.Logger.getLogger(AGENDAMENTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AGENDAMENTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AGENDAMENTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AGENDAMENTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AGENDAMENTO dialog = new AGENDAMENTO(new javax.swing.JFrame(), true); //CHAMA O AGENDAMENTO
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
    private javax.swing.JButton BotaoNovoAgendamento;
    private javax.swing.JButton BotaoNovoContacto;
    private javax.swing.JButton BotaoNovoServico;
    private javax.swing.JButton BotaoSalvar;
    private javax.swing.JLayeredPane CamadaCalendario;
    private javax.swing.JLabel Cod;
    private javax.swing.JLabel DATAAGENDAMENTO;
    private javax.swing.JLabel Ldata;
    private javax.swing.JLabel Lhora;
    private javax.swing.JList<String> ListaHORA;
    private javax.swing.JList<String> ListaNOME;
    private javax.swing.JList<String> ListaSERVICO;
    private javax.swing.JLabel Lnome;
    private javax.swing.JLabel Lobs;
    private javax.swing.JLabel Lservico;
    private javax.swing.JComboBox SelecaoAno;
    private javax.swing.JComboBox<String> SelecaoMes;
    private javax.swing.JTable TabelaAgendamento;
    private javax.swing.JLabel hora;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel ls1;
    private javax.swing.JLabel ls2;
    private javax.swing.JLabel ls3;
    private javax.swing.JLabel ls4;
    private javax.swing.JLabel ls5;
    private javax.swing.JLabel ls6;
    private javax.swing.JLabel ls7;
    private javax.swing.JTextField nome;
    private javax.swing.JTextArea observacao;
    private javax.swing.JTextField servico;
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

    
private PRINCIPAL ECRAPRIN;

public void MostraAgendaGravacao(PRINCIPAL MostraAgenda) {
    this.ECRAPRIN = MostraAgenda;
        
    if(ECRAPRIN.ChamaAgenda == 0) {
       BotaoSalvar.setToolTipText("Salvar agendamento");
       TabelaAgendamento.setVisible(false);
       jScrollPane1.setVisible(false);
       BotaoExcluir.setVisible(false);
       java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
       setBounds((screenSize.width - 617) / 2, (screenSize.height - 380) / 2, 617, 380);
       grava = 0;
       TRAS_DATA_ECRA_PRINCIPAL();
       setVisible(true);
    }   else if (ECRAPRIN.ChamaAgenda == 1) {
       BotaoSalvar.setToolTipText("Salvar alteraçoes no agendamento");
       TabelaAgendamento.setVisible(false);
       jScrollPane1.setVisible(false);
       java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
       setBounds((screenSize.width - 617) / 2, (screenSize.height - 380) / 2, 617, 380);
       grava = 1;
       TRAS_DADOS_ECRAPRINCIPAL();
       setVisible(true);
    } else if (ECRAPRIN.ChamaAgenda == 2) {
       BotaoSalvar.setToolTipText("Salvar alteraçoes no agendamento");
       grava = 1;
       TRAS_DADOS_ECRAPRINCIPAL();
       PREENCHE_TABELA();
       setVisible(true);
    }
}    

private LocalizaAgendamento PESQUISAAGENDA;

    public void MostraAgendaPesquisa(LocalizaAgendamento MostraAgendaPesquisa) {
        this.PESQUISAAGENDA = MostraAgendaPesquisa;
        BotaoSalvar.setToolTipText("Salvar alterações no agendamento");
//        BotaoSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource(""))); COLOCAR IMAGEM
        TabelaAgendamento.setVisible(false);
//        jScrollPane2.setVisible(false);
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width - 617) / 2, (screenSize.height - 380) / 2, 617, 380);
        grava = 2;
        Cod.setText(PESQUISAAGENDA.CODPES);
        nome.setText(PESQUISAAGENDA.NOMEPES);
        servico.setText(PESQUISAAGENDA.SERVPES);
        observacao.setText(PESQUISAAGENDA.OBSPES);
        DATAAGENDAMENTO.setText(PESQUISAAGENDA.DIAPES + "/" + PESQUISAAGENDA.MESPES + "/" + PESQUISAAGENDA.ANOPES);
        hora.setText(PESQUISAAGENDA.HORAPES);
        setVisible(true);
        
    }

public void CALENDARIO_V1() {
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
        
public void CALENDARIO_V2() {
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
        
        
    
    }

public void CALENDARIO_V3() { 
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
                    DiaAltera = Integer.parseInt(t1.getText());
                    PreencheData();
                    //LEGENDA();
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
                    DiaAltera = Integer.parseInt(t2.getText());
                    PreencheData();
//                    LEGENDA();
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
                    DiaAltera = Integer.parseInt(t3.getText());
                    PreencheData();
//                    LEGENDA();
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
                    DiaAltera = Integer.parseInt(t4.getText());
                    PreencheData();
                    //LEGENDA();
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
                    DiaAltera = Integer.parseInt(t5.getText());
                    PreencheData();
                    //LEGENDA();
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
                    DiaAltera = Integer.parseInt(t6.getText());
                    PreencheData();
                    //LEGENDA();
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
                    DiaAltera = Integer.parseInt(t7.getText());
                    PreencheData();
                    //LEGENDA();
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
                    DiaAltera = Integer.parseInt(t8.getText());
                    PreencheData();
                    //LEGENDA();
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
                    DiaAltera = Integer.parseInt(t9.getText());
                    PreencheData();
                    //LEGENDA();
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
                    DiaAltera = Integer.parseInt(t10.getText());
                    PreencheData();
                    //LEGENDA();
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
                    DiaAltera = Integer.parseInt(t11.getText());
                    PreencheData();
                    //LEGENDA();
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
                    DiaAltera = Integer.parseInt(t12.getText());
                    PreencheData();
                    //LEGENDA();
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
                    DiaAltera = Integer.parseInt(t13.getText());
                    PreencheData();
                    //LEGENDA();
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
                    DiaAltera = Integer.parseInt(t14.getText());
                    PreencheData();
                    //LEGENDA();
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
                    DiaAltera = Integer.parseInt(t15.getText());
                    PreencheData();
                    //LEGENDA();
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
                    DiaAltera = Integer.parseInt(t16.getText());
                    PreencheData();
                    //LEGENDA();
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
                    DiaAltera = Integer.parseInt(t17.getText());
                    PreencheData();
                    //LEGENDA();
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
                    DiaAltera = Integer.parseInt(t18.getText());
                    PreencheData();
                    //LEGENDA();
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
                    DiaAltera = Integer.parseInt(t19.getText());
                    PreencheData();
                    //LEGENDA();
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
                    DiaAltera = Integer.parseInt(t20.getText());
                    PreencheData();
                    //LEGENDA();
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
                    DiaAltera = Integer.parseInt(t21.getText());
                    PreencheData();
                    //LEGENDA();
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
                    DiaAltera = Integer.parseInt(t22.getText());
                    PreencheData();
                    //LEGENDA();
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
                    DiaAltera = Integer.parseInt(t23.getText());
                    PreencheData();
                    //LEGENDA();
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
                    DiaAltera = Integer.parseInt(t24.getText());
                    PreencheData();
                    //LEGENDA();
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
                    DiaAltera = Integer.parseInt(t25.getText());
                    PreencheData();
                    //LEGENDA();
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
                    DiaAltera = Integer.parseInt(t26.getText());
                    PreencheData();
                    //LEGENDA();
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
                    DiaAltera = Integer.parseInt(t27.getText());
                    PreencheData();
                    //LEGENDA();
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
                    DiaAltera = Integer.parseInt(t28.getText());
                    PreencheData();
                    //LEGENDA();
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
                    DiaAltera = Integer.parseInt(t29.getText());
                    PreencheData();
                    //LEGENDA();
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
                    DiaAltera = Integer.parseInt(t30.getText());
                    PreencheData();
                    //LEGENDA();
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
                    DiaAltera = Integer.parseInt(t31.getText());
                    PreencheData();
                    //LEGENDA();
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
                    DiaAltera = Integer.parseInt(t32.getText());
                    PreencheData();
                    //LEGENDA();
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
                    DiaAltera = Integer.parseInt(t33.getText());
                    PreencheData();
                    //LEGENDA();
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
                    DiaAltera = Integer.parseInt(t34.getText());
                    PreencheData();
                    //LEGENDA();
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
                    DiaAltera = Integer.parseInt(t35.getText());
                    PreencheData();
                    //LEGENDA();
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
                    DiaAltera = Integer.parseInt(t36.getText());
                    PreencheData();
                    //LEGENDA();
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
                    DiaAltera = Integer.parseInt(t37.getText());
                    PreencheData();
                    //LEGENDA();
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
                    DiaAltera = Integer.parseInt(t38.getText());
                    PreencheData();
                    //LEGENDA();
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
                    DiaAltera = Integer.parseInt(t39.getText());
                    PreencheData();
                    //LEGENDA();
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
                    DiaAltera = Integer.parseInt(t40.getText());
                    PreencheData();
                    //LEGENDA();
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
                    DiaAltera = Integer.parseInt(t41.getText());
                    PreencheData();
                    //LEGENDA();
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
                    DiaAltera = Integer.parseInt(t42.getText());
                    PreencheData();
                    //LEGENDA();
                }
            }
        });
}

public void PreencheData() { //preenche a data conforme solicitado no formulario
        int MES1 = (SelecaoMes.getSelectedIndex() + 1);
        String MES2 = "";
        if (MES1 < 10) {
            MES2 = "0" + MES1;
        } else {
            MES2 = "" + MES1;
        }
        String DIA2 = "";
        if(DiaAltera < 10) {
            DIA2 = "0" + DiaAltera;  
        } else {
            DIA2 = "" + DiaAltera;
        }
        DATAAGENDAMENTO.setText(DIA2 + "/" + MES2 + "/" + SelecaoAno.getSelectedItem());
        CamadaCalendario.setVisible(false);
        
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

public void MOSTRA_DADOS_LIMITE() {
        try {
            CONEXAO.executaSQL("select * from configuracao");
            CONEXAO.resultset.first();
            LIMITE = Integer.parseInt(CONEXAO.resultset.getString("limiteagendamento")) - 1;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro" + erro);
    }
    
    }

public void gravar() throws IOException { // VAI UTILIZAR O METODO DO BANCO DE DADOS GRAVAR
        String dia = DATAAGENDAMENTO.getText().substring(0, 2);
        String mes = DATAAGENDAMENTO.getText().substring(3, 5);
        String ano = DATAAGENDAMENTO.getText().substring(6, 10);
        
        String[] coluna = {"nome", "servico", "dia", "mes", "ano", "hora", "observacao"};
        String[] valor = {nome.getText(), servico.getText(), dia, mes, ano, hora.getText(), observacao.getText()};
        String tabela = "agenda";
        String Mensagem = "Agendamento concluido";
        GRA_ALT_EXC grava = new GRA_ALT_EXC();
        grava.GRAVA(coluna, valor, tabela, Mensagem);
        
    }

public void Alteracao() throws IOException { // VAI UTILIZAR O METODO DO BANCO DE DADOS ALTERAR
    String dia = DATAAGENDAMENTO.getText().substring(0, 2);
    String mes = DATAAGENDAMENTO.getText().substring(3, 5);
    String ano = DATAAGENDAMENTO.getText().substring(6, 10);
    
    String[] coluna = {"nome", "servico", "dia", "mes", "ano", "hora", "observacao"};
    String[] valor = {nome.getText(), servico.getText(), dia, mes, ano, hora.getText(), observacao.getText()};
    String tabela = "agenda";
    String condicao = " WHERE cod = " + Cod.getText();
    
    GRA_ALT_EXC altera = new GRA_ALT_EXC();
    altera.ALTERA(coluna, valor, tabela, condicao);
    
}

public void Excluir() throws IOException { // VAI UTILIZAR O METODO DO BANCO DE DADOS EXCLUIR
        try {
            int x = Integer.parseInt(Cod.getText());
            String tabela = "agenda";
            String condicao = " WHERE cod = " + Cod.getText();
            GRA_ALT_EXC exclui = new GRA_ALT_EXC();
            exclui.EXCLUIR(tabela, condicao);
        } catch (Exception err) {
            System.out.println(err);
        }
    }

public void TRAS_DATA_ECRA_PRINCIPAL() {
    int x1 = ECRAPRIN.DiaAgendamento;
    int x2 = ECRAPRIN.MesAgendamento;
    int x3 = ECRAPRIN.AnoAgendamento;
    
    int MES1 = x2;
    String MES2 = "";
    if (MES1 < 10) {
        MES2 = "0" + MES1;
    } else {
        MES2 = "" + MES1;
    }
    String DIA2 = "";
    if (x1 < 10) {
        DIA2 = "0" + x1;
    } else {
        DIA2 = "" + x1;
    }
    DATAAGENDAMENTO.setText(DIA2 + "/" + MES2 + "/" + x3);
    hora.setText(ECRAPRIN.HoraAgendamento);
    
}

public void TRAS_DADOS_ECRAPRINCIPAL() {
    TRAS_DATA_ECRA_PRINCIPAL();
    nome.setText(ECRAPRIN.NomeAgendamento);
    servico.setText(ECRAPRIN.ServicoAgendamento);
    observacao.setText(ECRAPRIN.ObservacaoAgendamento);
    Cod.setText(ECRAPRIN.CodAgendamento);
}

public void PREENCHE_TABELA() {
    CONEXAO.executaSQL("select * from agenda where dia = '" + ECRAPRIN.DiaAgendamento
            + "' and mes = '" + ECRAPRIN.MesAgendamento
            + "' and ano = '" + ECRAPRIN.AnoAgendamento
            + "' and hora = '" + ECRAPRIN.HoraAgendamento
            + "' order by nome");
    
    TabelaAgendamento.getColumnModel().getColumn(0).setPreferredWidth(175);
    TabelaAgendamento.getColumnModel().getColumn(1).setPreferredWidth(250);
    TabelaAgendamento.getColumnModel().getColumn(2).setPreferredWidth(350);
    TabelaAgendamento.getColumnModel().getColumn(3).setPreferredWidth(225);
    
    DefaultTableModel modelo = (DefaultTableModel) TabelaAgendamento.getModel();
    modelo.setNumRows(0);
    
    try {
        while (CONEXAO.resultset.next()) {
            int dia = Integer.parseInt(CONEXAO.resultset.getString("dia"));
            int mes = Integer.parseInt(CONEXAO.resultset.getString("mes"));
            int ano = Integer.parseInt(CONEXAO.resultset.getString("ano"));
            String d = "";
            String m = "";
            if (dia < 10) {
                d = "0";
            }
            if (mes < 10) {
                m = "0";
            }
            
            modelo.addRow(new Object[] {CONEXAO.resultset.getString("nome"),
                        CONEXAO.resultset.getString("servico"),
                        CONEXAO.resultset.getString("observacao"),
                        d + dia + "/" + m + mes + "/" + ano + " " + CONEXAO.resultset.getString("hora")
                        });
        }
    } catch (SQLException erro) {
        
        }
    }

public void PREENCHE_LISTA(){
    
    String H930 = "09:30", H1000 = "10:00", H1030 = "10:30", H1100 = "11:00", H1130 = "11:30",
           H1200 = "12:00", H1230 = "12:30", H1300 = "13:00", H1330 = "13:30", H1400 = "14:00", 
           H1430 = "14:30", H1500 = "15:00", H1530 = "15:30", H1600 = "16:00", H1630 = "16:30", 
           H1700 = "17:00", H1730 = "17:30", H1800 = "18:00", H1830 = "18:30", H1900 = "19:00", 
           H1930 = "19:30", H2000 = "20:00", H2030 = "20:30", H2100 = "21:00";
    MODELOHORA.removeAllElements();
    
    try {
        int dia = Integer.parseInt(DATAAGENDAMENTO.getText().substring(0, 2));
        int mes = Integer.parseInt(DATAAGENDAMENTO.getText().substring(3, 5));
        int ano = Integer.parseInt(DATAAGENDAMENTO.getText().substring(6, 10));
        
        CONEXAO.executaSQL("select * from agenda where dia = '" + dia
            + "' and mes = '" + mes
            + "' and ano = '" + ano
            + "' order by nome");
        
        while(CONEXAO.resultset.next()) {
            if("09:30".equals(CONEXAO.resultset.getString("hora"))) {
                H930 = "09:30 ";
            }
            if("10:00".equals(CONEXAO.resultset.getString("hora"))) {
                H1000 = "10:00 ";
            }
            if("10:30".equals(CONEXAO.resultset.getString("hora"))) {
                H1030 = "10:30 ";
            }
            if("11:00".equals(CONEXAO.resultset.getString("hora"))) {
                H1100 = "11:00 ";
            }
            if("11:30".equals(CONEXAO.resultset.getString("hora"))) {
                H1130 = "11:30 ";
            }
            if("12:00".equals(CONEXAO.resultset.getString("hora"))) {
                H1200 = "12:00 ";
            }
            if("12:30".equals(CONEXAO.resultset.getString("hora"))) {
                H1230 = "12:30 ";
            }
            if("13:00".equals(CONEXAO.resultset.getString("hora"))) {
                H1300 = "13:00 ";
            }
            if("13:30".equals(CONEXAO.resultset.getString("hora"))) {
                H1330 = "13:30 ";
            }
            if("14:00".equals(CONEXAO.resultset.getString("hora"))) {
                H1400 = "14:00 ";
            }
            if("14:30".equals(CONEXAO.resultset.getString("hora"))) {
                H1430 = "14:30 ";
            }
            if("15:00".equals(CONEXAO.resultset.getString("hora"))) {
                H1500 = "15:00 ";
            }
            if("15:30".equals(CONEXAO.resultset.getString("hora"))) {
                H1530 = "15:30 ";
            }
            if("16:00".equals(CONEXAO.resultset.getString("hora"))) {
                H1600 = "16:00 ";
            }
            if("16:30".equals(CONEXAO.resultset.getString("hora"))) {
                H1630 = "16:30 ";
            }
            if("17:00".equals(CONEXAO.resultset.getString("hora"))) {
                H1700 = "17:00 ";
            }
            if("17:30".equals(CONEXAO.resultset.getString("hora"))) {
                H1730 = "17:30 ";
            }
            if("18:00".equals(CONEXAO.resultset.getString("hora"))) {
                H1800 = "18:00 ";
            }
            if("18:30".equals(CONEXAO.resultset.getString("hora"))) {
                H1830 = "18:30 ";
            }
            if("19:00".equals(CONEXAO.resultset.getString("hora"))) {
                H1900 = "19:00 ";
            }
            if("19:30".equals(CONEXAO.resultset.getString("hora"))) {
                H1930 = "19:30 ";
            }
            if("20:00".equals(CONEXAO.resultset.getString("hora"))) {
                H2000 = "20:00 ";
            }
            if("20:30".equals(CONEXAO.resultset.getString("hora"))) {
                H2030 = "20:30 ";
            }
            if("21:00".equals(CONEXAO.resultset.getString("hora"))) {
                H2100 = "21:00 ";
            } 
        } 
        
        String[] HORAS = {H930, H1000, H1030, H1100, H1130, H1200, H1230, H1300, H1330, H1400, H1430, H1500, H1530, H1600, H1630, H1700, H1730, H1800, H1830, H1900, H1930, H2000, H2030, H2100};
        for (String H : HORAS) {
            MODELOHORA.addElement(H);
        }
        
    } catch (SQLException ex) {
        Logger.getLogger(AGENDAMENTO.class.getName()).log(Level.SEVERE, null, ex);
    } catch (Exception err) {   
        System.out.println(err);
    }
    INSERE_COR_NA_LISTA();
}

public void INSERE_COR_NA_LISTA() {
    ListaHORA.setCellRenderer(new ColoreList5<String>());
    ListaHORA.setBackground(Color.WHITE);
 
}
    class ColoreList5<String> extends JLabel implements ListCellRenderer {
        int conta = 6;
        
        public ColoreList5() {
            super();
            setOpaque(true);
        }
        
        @Override
        public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            setText(value.toString());
            
            Object texto = MODELOHORA.get(index);
            
            if(texto != null && conta == (texto.toString().length())) {
                setBackground(Color.CYAN);
            } else {
                setBackground(Color.WHITE);
            }
            setBorder(null);
            
            if (isSelected) {
                setBackground(Color.LIGHT_GRAY);
            }
            return this;
        }
        
    }
    
public void MENSAGEM_PASSAR_RATO() {
        try {
        int dia = Integer.parseInt(DATAAGENDAMENTO.getText().substring(0, 2));
        int mes = Integer.parseInt(DATAAGENDAMENTO.getText().substring(3, 5));
        int ano = Integer.parseInt(DATAAGENDAMENTO.getText().substring(6, 10));

        CONEXAO.executaSQL("SELECT Count(cod)as Total"
                + " FROM agenda where dia = '" + dia + "' and mes = '" + mes + "' and ano = '" + ano + "' and hora = '" + ListaHORA.getSelectedValue().toString().substring(0, 5) + "'");
        CONEXAO.resultset.first();
        ListaHORA.setToolTipText("Existe(m) " + CONEXAO.resultset.getString("Total") + " agendamento(s) para este horário. ");   
    } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "Erro\n" + erro);
    } catch (Exception err) {
    } catch (Error e) {
    }
  }

public void MOSTRA_DADOS_TABELA() {
        try {
            int Linha = TabelaAgendamento.getSelectedRow();
            CONEXAO.executaSQL("select * from agenda where dia = '" + ECRAPRIN.DiaAgendamento
                + "' and mes = '" + ECRAPRIN.MesAgendamento
                + "' and ano = '" + ECRAPRIN.AnoAgendamento
                + "' and hora = '" + ECRAPRIN.HoraAgendamento
                + "' order by nome LIMIT " + Linha + " , 1 ");
            
            CONEXAO.resultset.first();
            Cod.setText(CONEXAO.resultset.getString("cod"));
            nome.setText(CONEXAO.resultset.getString("nome"));
            servico.setText(CONEXAO.resultset.getString("servico"));
            observacao.setText(CONEXAO.resultset.getString("observacao"));
            int dia = Integer.parseInt(CONEXAO.resultset.getString("dia"));
            int mes = Integer.parseInt(CONEXAO.resultset.getString("mes"));
            int ano = Integer.parseInt(CONEXAO.resultset.getString("ano"));
            String d = "" + dia;
            String m = "" + mes;
            String a = "" + ano;
            
            if (dia < 10) {
                d = "0" + dia;
            }
            if (mes < 10) {
                m = "0" + mes;
        }
        DATAAGENDAMENTO.setText(d + "/" + m + "/" + a);
        hora.setText(CONEXAO.resultset.getString("hora"));
        
        
            
        } catch (SQLException erro) {
//        JOptionPane.showMessageDialog(null, "Erro" + erro);
        }
    }

public void PESQUISANOME(){
    try {
            CONEXAO.executaSQL("select * from contacto where nome like'" + nome.getText() + "%' order by nome");
            MODELONOME.removeAllElements();
            int x = 0;
           
            while (CONEXAO.resultset.next() && x < 4) {
                MODELONOME.addElement(CONEXAO.resultset.getString("nome"));
                x++;
            }
            if (x > 0) {
                ListaNOME.setVisible(true);
            } else {
                ListaNOME.setVisible(false);
            }
            
            CONEXAO.resultset.first();
        } catch (SQLException erro) {
            
        } catch (Exception err) {
            System.out.println(err);
        }
    }

public void MostraValorServicoLinhazero() {
        try {
            CONEXAO.executaSQL("select * from servico where nomeservico like'" + servico.getText() + "%' order by nomeservico");
            CONEXAO.resultset.first();
            ValorDoServico = Double.parseDouble(CONEXAO.resultset.getString("valor"));
        } catch (SQLException ex) {
            Logger.getLogger(AGENDAMENTO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
public void PESQUISASERVICO() {
        try {
            CONEXAO.executaSQL("select * from servico where nomeservico like'" + servico.getText() + "%' order by nomeservico");
            MODELOSERVICO.removeAllElements();
            int x = 0;
            while (CONEXAO.resultset.next() && x < 4) {
                MODELOSERVICO.addElement(CONEXAO.resultset.getString("nomeservico"));
                x++;
            }
            if (x > 0) {
                MostraValorServicoLinhazero();
                ListaSERVICO.setVisible(true);
            } else {
                ListaSERVICO.setVisible(false);
                ValorDoServico = 0;
            } 
            CONEXAO.resultset.first();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao localizar dados");
        } catch (Exception err) {
            System.out.println(err);
        }
    }

//public void MOSTRA_DADOS_P_PESQUISAR_SERVICO() {
//        try {
//            int Linha = ListaSERVICO.getSelectedIndex();
//            CONEXAO.executaSQL("select * from servico where nomeservico like'" + servico.getText() + "%' order by nomeservico LIMIT " + Linha + " , 1 ");
//            CONEXAO.resultset.first();
//            servico.setText(CONEXAO.resultset.getString("nomeservico"));
//            ValorDoServico = Double.parseDouble(CONEXAO.resultset.getString("valor"));
//        } catch (SQLException erro) {
//            JOptionPane.showMessageDialog(null, "Erro ao localizar dados" + erro);
//        }
//    }

//public void MOSTRA_NOME() {
//    try {
//        String Linha1 = String.valueOf(ListaNOME.getSelectedIndex());
//        CONEXAO.executaSQL("select * from contacto where nome like'" + nome.getText() + "%' order by nome LIMIT " + Linha1 + " , 1 ");
//        CONEXAO.resultset.first();
//        nome.setText(CONEXAO.resultset.getString("nome"));
//    } catch (SQLException erro) {
//        JOptionPane.showMessageDialog(null, "Erro ao localizar dados" + erro);
//    }
//}

}

        
