package PRINCIPAL;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Andrezza p/ Smart Level
 */
public class PRINCIPAL extends javax.swing.JFrame {
    
    int AnoFIXO = 0, MesFIXO = 0, DiaFIXO = 0; //informaçóes sobre as variaveis
    int AnoAltera = 0, MesAltera = 0, DiaAltera = 0;
    int valorselecao = 0;
    int DiaClick = 0;

    public PRINCIPAL() {
        initComponents();
        INICIACALENDARIO();
        CALENDARIO();
        CALENDARIO_EVT();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        MesPagina1 = new javax.swing.JLabel();
        AnoPagina1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

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

        SelecaoAno.setEditable(true);
        SelecaoAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelecaoAnoActionPerformed(evt);
            }
        });

        ls1.setBackground(new java.awt.Color(0, 204, 204));
        ls1.setForeground(new java.awt.Color(255, 0, 51));
        ls1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ls1.setText("Dom");
        ls1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        ls1.setOpaque(true);

        ls2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ls2.setText("Seg");
        ls2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));

        ls3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ls3.setText("Ter");
        ls3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));

        ls4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ls4.setText("Qua");
        ls4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));

        ls5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ls5.setText("Qui");
        ls5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));

        ls6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ls6.setText("Sex");
        ls6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));

        t7.setBackground(new java.awt.Color(204, 204, 204));
        t7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t7.setText("0");

        t14.setBackground(new java.awt.Color(204, 204, 204));
        t14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t14.setText("0");

        t21.setBackground(new java.awt.Color(204, 204, 204));
        t21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t21.setText("0");

        t28.setBackground(new java.awt.Color(204, 204, 204));
        t28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t28.setText("0");

        t35.setBackground(new java.awt.Color(204, 204, 204));
        t35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t35.setText("0");

        ls7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ls7.setText("Sab");
        ls7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));

        t42.setBackground(new java.awt.Color(204, 204, 204));
        t42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t42.setText("0");

        t6.setBackground(new java.awt.Color(204, 204, 204));
        t6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t6.setText("0");

        t13.setBackground(new java.awt.Color(204, 204, 204));
        t13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t13.setText("0");

        t20.setBackground(new java.awt.Color(204, 204, 204));
        t20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t20.setText("0");

        t27.setBackground(new java.awt.Color(204, 204, 204));
        t27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t27.setText("0");

        t34.setBackground(new java.awt.Color(204, 204, 204));
        t34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t34.setText("0");

        t41.setBackground(new java.awt.Color(204, 204, 204));
        t41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t41.setText("0");

        t5.setBackground(new java.awt.Color(204, 204, 204));
        t5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t5.setText("0");

        t12.setBackground(new java.awt.Color(204, 204, 204));
        t12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t12.setText("0");

        t19.setBackground(new java.awt.Color(204, 204, 204));
        t19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t19.setText("0");

        t26.setBackground(new java.awt.Color(204, 204, 204));
        t26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t26.setText("0");

        t33.setBackground(new java.awt.Color(204, 204, 204));
        t33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t33.setText("0");

        t40.setBackground(new java.awt.Color(204, 204, 204));
        t40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t40.setText("0");

        t4.setBackground(new java.awt.Color(204, 204, 204));
        t4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t4.setText("0");

        t11.setBackground(new java.awt.Color(204, 204, 204));
        t11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t11.setText("0");

        t18.setBackground(new java.awt.Color(204, 204, 204));
        t18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t18.setText("0");

        t25.setBackground(new java.awt.Color(204, 204, 204));
        t25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t25.setText("0");

        t32.setBackground(new java.awt.Color(204, 204, 204));
        t32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t32.setText("0");

        t39.setBackground(new java.awt.Color(204, 204, 204));
        t39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t39.setText("0");

        t3.setBackground(new java.awt.Color(204, 204, 204));
        t3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t3.setText("0");

        t10.setBackground(new java.awt.Color(204, 204, 204));
        t10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t10.setText("0");

        t17.setBackground(new java.awt.Color(204, 204, 204));
        t17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t17.setText("0");

        t24.setBackground(new java.awt.Color(204, 204, 204));
        t24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t24.setText("0");

        t31.setBackground(new java.awt.Color(204, 204, 204));
        t31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t31.setText("0");

        t38.setBackground(new java.awt.Color(204, 204, 204));
        t38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t38.setText("0");

        t2.setBackground(new java.awt.Color(204, 204, 204));
        t2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t2.setText("0");

        t9.setBackground(new java.awt.Color(204, 204, 204));
        t9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t9.setText("0");

        t16.setBackground(new java.awt.Color(204, 204, 204));
        t16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t16.setText("0");

        t23.setBackground(new java.awt.Color(204, 204, 204));
        t23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t23.setText("0");

        t30.setBackground(new java.awt.Color(204, 204, 204));
        t30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t30.setText("0");

        t37.setBackground(new java.awt.Color(204, 204, 204));
        t37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t37.setText("0");

        t1.setBackground(new java.awt.Color(204, 204, 204));
        t1.setForeground(new java.awt.Color(255, 0, 51));
        t1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t1.setText("0");
        t1.setOpaque(true);

        t8.setBackground(new java.awt.Color(204, 204, 204));
        t8.setForeground(new java.awt.Color(255, 0, 51));
        t8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t8.setText("0");

        t15.setBackground(new java.awt.Color(204, 204, 204));
        t15.setForeground(new java.awt.Color(255, 0, 51));
        t15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t15.setText("0");

        t22.setBackground(new java.awt.Color(204, 204, 204));
        t22.setForeground(new java.awt.Color(255, 0, 51));
        t22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t22.setText("0");

        t29.setBackground(new java.awt.Color(204, 204, 204));
        t29.setForeground(new java.awt.Color(255, 0, 51));
        t29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t29.setText("0");

        t36.setBackground(new java.awt.Color(204, 204, 204));
        t36.setForeground(new java.awt.Color(255, 0, 51));
        t36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t36.setText("0");

        jLayeredPane2.setLayer(SelecaoMes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(SelecaoAno, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(ls1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(ls2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(ls3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(ls4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(ls5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(ls6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t21, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t28, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t35, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(ls7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t42, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t20, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t27, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t34, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t41, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t19, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t26, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t33, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t40, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t18, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t25, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t32, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t39, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t17, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t24, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t31, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t38, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t23, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t30, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t37, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t22, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t29, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t36, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(t8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t22, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t29, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(t1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(t36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(t9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t30, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(t2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(t37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(t10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t31, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(t3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(t38, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(t11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t32, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(t4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(t39, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addComponent(ls1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ls2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ls3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ls4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ls5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(t12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(t19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(t26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(t33, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(t5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(t40, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addComponent(ls6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ls7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(t13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t27, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t34, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(t6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(t41, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(t14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(t21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(t28, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(t35, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(t7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(t42, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(SelecaoMes, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SelecaoAno, 0, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SelecaoMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SelecaoAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ls1)
                    .addComponent(ls2)
                    .addComponent(ls3)
                    .addComponent(ls4)
                    .addComponent(ls6)
                    .addComponent(ls5)
                    .addComponent(ls7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                    .addComponent(t7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(t14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(t21)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(t28)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(t35)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(t42, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                    .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(t13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(t20)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(t27)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(t34)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(t41, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t40, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t39, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jLayeredPane2Layout.createSequentialGroup()
                            .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(t10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(t17)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(t24)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(t31)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(t38, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t37, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t36, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane1.add(jLayeredPane2);
        jLayeredPane2.setBounds(21, 17, 225, 170);

        VoltarDataInicial.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        VoltarDataInicial.setText("Voltar");
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
        VoltarDataInicial.setBounds(80, 190, 75, 25);

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

        MesPagina1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        MesPagina1.setText("Maio");
        jLayeredPane1.add(MesPagina1);
        MesPagina1.setBounds(500, 80, 80, 17);

        AnoPagina1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        AnoPagina1.setText("2023");
        jLayeredPane1.add(AnoPagina1);
        AnoPagina1.setBounds(340, 20, 52, 29);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGEM/agenda_app2.jpg"))); // NOI18N
        jLayeredPane1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1260, 660);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1282, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setBounds(0, 0, 1286, 706);
    }// </editor-fold>//GEN-END:initComponents

    private void VoltarDataInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarDataInicialActionPerformed
        INICIACALENDARIO();
        CALENDARIO();
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
            AnoPagina2.setText(SelecaoAno.getSelectedItem().toString()); //altera o ano que esta na pagina quando a pessoa escolhe o ano
            AnoPagina2.setText(SelecaoAno.getSelectedItem().toString());
        } catch (Exception e) {
            SelecaoAno.setSelectedItem(AnoFIXO); //se caso digitar errado, cai no exception e volta ao ano vigente
        }
    }//GEN-LAST:event_SelecaoAnoActionPerformed

    private void SelecaoMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelecaoMesActionPerformed
        DiaAltera = DiaFIXO; //seleciona o mes pelo jcomboBox
        CALENDARIO();
    }//GEN-LAST:event_SelecaoMesActionPerformed

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
    private javax.swing.JLabel AnoPagina1;
    private javax.swing.JLabel AnoPagina2;
    private javax.swing.JLabel DiaPagina1;
    private javax.swing.JLabel DiaPagina2;
    private javax.swing.JLabel MesPagina1;
    private javax.swing.JLabel MesPagina2;
    private javax.swing.JComboBox SelecaoAno;
    private javax.swing.JComboBox<String> SelecaoMes;
    private javax.swing.JLabel SemanaPagina1;
    private javax.swing.JLabel SemanaPagina2;
    private javax.swing.JButton VoltarDataInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
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

//construçao do calendario
public void INICIACALENDARIO() { //alteração do formato para data
        SimpleDateFormat Ano = new SimpleDateFormat("yyyy");
        SimpleDateFormat Mes = new SimpleDateFormat("MM");
        SimpleDateFormat Dia = new SimpleDateFormat("dd");
        
        AnoFIXO = Integer.parseInt(Ano.format(new Date()));
        MesFIXO = Integer.parseInt(Mes.format(new Date()));
        DiaFIXO = Integer.parseInt(Dia.format(new Date()));
        
        //JOptionPane.showMessageDialog(null, DiaFIXO + "/" + MesFIXO + "/" + AnoFIXO);

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

public void VERIFICASEMANA() { //faz a veificação do dias da semana na pagina
   
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
                    DiaPagina2.setText(t2.getText());
                    DiaPagina1.setText(t2.getText());
                    
                    DiaAltera = Integer.parseInt(t2.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
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
                    DiaPagina2.setText(t3.getText());
                    DiaPagina1.setText(t3.getText());
                    
                    DiaAltera = Integer.parseInt(t3.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
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
                    DiaPagina2.setText(t4.getText());
                    DiaPagina1.setText(t4.getText());
                    
                    DiaAltera = Integer.parseInt(t4.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
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
                    DiaPagina2.setText(t5.getText());
                    DiaPagina1.setText(t5.getText());
                    
                    DiaAltera = Integer.parseInt(t5.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
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
                    DiaPagina2.setText(t6.getText());
                    DiaPagina1.setText(t6.getText());
                    
                    DiaAltera = Integer.parseInt(t6.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
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
                    DiaPagina2.setText(t7.getText());
                    DiaPagina1.setText(t7.getText());
                    
                    DiaAltera = Integer.parseInt(t7.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
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
                    DiaPagina2.setText(t8.getText());
                    DiaPagina1.setText(t8.getText());
                    
                    DiaAltera = Integer.parseInt(t8.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
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
                    DiaPagina2.setText(t9.getText());
                    DiaPagina1.setText(t9.getText());
                    
                    DiaAltera = Integer.parseInt(t9.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
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
                    DiaPagina2.setText(t10.getText());
                    DiaPagina1.setText(t10.getText());
                    
                    DiaAltera = Integer.parseInt(t10.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
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
                    DiaPagina2.setText(t11.getText());
                    DiaPagina1.setText(t11.getText());
                    
                    DiaAltera = Integer.parseInt(t11.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
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
                    DiaPagina2.setText(t12.getText());
                    DiaPagina1.setText(t12.getText());
                    
                    DiaAltera = Integer.parseInt(t12.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
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
                    DiaPagina2.setText(t13.getText());
                    DiaPagina1.setText(t13.getText());
                    
                    DiaAltera = Integer.parseInt(t13.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
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
                    DiaPagina2.setText(t14.getText());
                    DiaPagina1.setText(t14.getText());
                    
                    DiaAltera = Integer.parseInt(t14.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
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
                    DiaPagina2.setText(t15.getText());
                    DiaPagina1.setText(t15.getText());
                    
                    DiaAltera = Integer.parseInt(t15.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
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
                    DiaPagina2.setText(t16.getText());
                    DiaPagina1.setText(t16.getText());
                    
                    DiaAltera = Integer.parseInt(t16.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
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
                    DiaPagina2.setText(t17.getText());
                    DiaPagina1.setText(t17.getText());
                    
                    DiaAltera = Integer.parseInt(t17.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
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
                    DiaPagina2.setText(t18.getText());
                    DiaPagina1.setText(t18.getText());
                    
                    DiaAltera = Integer.parseInt(t18.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
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
                    DiaPagina2.setText(t19.getText());
                    DiaPagina1.setText(t19.getText());
                    
                    DiaAltera = Integer.parseInt(t19.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
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
                    DiaPagina2.setText(t20.getText());
                    DiaPagina1.setText(t20.getText());
                    
                    DiaAltera = Integer.parseInt(t20.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
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
                    DiaPagina2.setText(t21.getText());
                    DiaPagina1.setText(t21.getText());
                    
                    DiaAltera = Integer.parseInt(t21.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
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
                    DiaPagina2.setText(t22.getText());
                    DiaPagina1.setText(t22.getText());
                    
                    DiaAltera = Integer.parseInt(t22.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
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
                    DiaPagina2.setText(t23.getText());
                    DiaPagina1.setText(t23.getText());
                    
                    DiaAltera = Integer.parseInt(t23.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
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
                    DiaPagina2.setText(t24.getText());
                    DiaPagina1.setText(t24.getText());
                    
                    DiaAltera = Integer.parseInt(t24.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
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
                    DiaPagina2.setText(t25.getText());
                    DiaPagina1.setText(t25.getText());
                    
                    DiaAltera = Integer.parseInt(t25.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
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
                    DiaPagina2.setText(t26.getText());
                    DiaPagina1.setText(t26.getText());
                    
                    DiaAltera = Integer.parseInt(t26.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
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
                    DiaPagina2.setText(t27.getText());
                    DiaPagina1.setText(t27.getText());
                    
                    DiaAltera = Integer.parseInt(t27.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
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
                    DiaPagina2.setText(t28.getText());
                    DiaPagina1.setText(t28.getText());
                    
                    DiaAltera = Integer.parseInt(t28.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
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
                    DiaPagina2.setText(t29.getText());
                    DiaPagina1.setText(t29.getText());
                    
                    DiaAltera = Integer.parseInt(t29.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
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
                    DiaPagina2.setText(t30.getText());
                    DiaPagina1.setText(t30.getText());
                    
                    DiaAltera = Integer.parseInt(t30.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
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
                    DiaPagina2.setText(t31.getText());
                    DiaPagina1.setText(t31.getText());
                    
                    DiaAltera = Integer.parseInt(t31.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
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
                    DiaPagina2.setText(t32.getText());
                    DiaPagina1.setText(t32.getText());
                    
                    DiaAltera = Integer.parseInt(t32.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
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
                    DiaPagina2.setText(t33.getText());
                    DiaPagina1.setText(t33.getText());
                    
                    DiaAltera = Integer.parseInt(t33.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
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
                    DiaPagina2.setText(t34.getText());
                    DiaPagina1.setText(t34.getText());
                    
                    DiaAltera = Integer.parseInt(t34.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
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
                    DiaPagina2.setText(t35.getText());
                    DiaPagina1.setText(t35.getText());
                    
                    DiaAltera = Integer.parseInt(t35.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
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
                    DiaPagina2.setText(t36.getText());
                    DiaPagina1.setText(t36.getText());
                    
                    DiaAltera = Integer.parseInt(t36.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
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
                    DiaPagina2.setText(t37.getText());
                    DiaPagina1.setText(t37.getText());
                    
                    DiaAltera = Integer.parseInt(t37.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
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
                    DiaPagina2.setText(t38.getText());
                    DiaPagina1.setText(t38.getText());
                    
                    DiaAltera = Integer.parseInt(t38.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
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
                    DiaPagina2.setText(t39.getText());
                    DiaPagina1.setText(t39.getText());
                    
                    DiaAltera = Integer.parseInt(t39.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
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
                    DiaPagina2.setText(t40.getText());
                    DiaPagina1.setText(t40.getText());
                    
                    DiaAltera = Integer.parseInt(t40.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
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
                    DiaPagina2.setText(t41.getText());
                    DiaPagina1.setText(t41.getText());
                    
                    DiaAltera = Integer.parseInt(t41.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
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
                    DiaPagina2.setText(t42.getText());
                    DiaPagina1.setText(t42.getText());
                    
                    DiaAltera = Integer.parseInt(t42.getText());
                    DiaClick = 0;
                    VERIFICASEMANA();
                    //LEGENDA();
                }
            }
        });
}

}