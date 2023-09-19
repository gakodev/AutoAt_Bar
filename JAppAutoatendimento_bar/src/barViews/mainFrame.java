package barViews;

import barControllers.Pedido_Controller;
import barControllers.Produto_Controller;
import barModels.Pedido;
import barModels.Produto;
import barViews.loginFrame;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author Gabriel Rosa
 */
public class mainFrame extends javax.swing.JFrame {
    
    public mainFrame() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jCheckBox4 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jSpinner3 = new javax.swing.JSpinner();
        jSpinner4 = new javax.swing.JSpinner();
        jSpinner5 = new javax.swing.JSpinner();
        jSpinner6 = new javax.swing.JSpinner();
        jSpinner7 = new javax.swing.JSpinner();
        jSpinner8 = new javax.swing.JSpinner();
        jSpinner9 = new javax.swing.JSpinner();
        jSpinner10 = new javax.swing.JSpinner();
        jSpinner11 = new javax.swing.JSpinner();
        jSpinner12 = new javax.swing.JSpinner();
        jPanel9 = new javax.swing.JPanel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jSpinner13 = new javax.swing.JSpinner();
        jSpinner14 = new javax.swing.JSpinner();
        jSpinner15 = new javax.swing.JSpinner();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSpinner16 = new javax.swing.JSpinner();
        jSpinner17 = new javax.swing.JSpinner();
        jSpinner18 = new javax.swing.JSpinner();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel82 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jSpinner22 = new javax.swing.JSpinner();
        jSpinner23 = new javax.swing.JSpinner();
        jSpinner24 = new javax.swing.JSpinner();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jSpinner25 = new javax.swing.JSpinner();
        jSpinner26 = new javax.swing.JSpinner();
        jSpinner27 = new javax.swing.JSpinner();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel(){
            public void paintComponent(Graphics t){

                ImageIcon im = new ImageIcon("src/imgs/bar_backgroundleoai.jpg");
                Image i =im.getImage();

                t.drawImage(i,0,0,this.getSize().width,this.getSize().height,this);
            }

        };
        jButton3 = new javax.swing.JButton();

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/adm_frame_icon.png"))); // NOI18N

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/adm_frame_icon.png"))); // NOI18N

        jCheckBox4.setText("jCheckBox4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/agua.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/suco.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/monster.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/patagonia.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/corona.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/heineken.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/chopp_brahma.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/weisse.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/stella.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/negroni.png"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/mojito.png"))); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/moscowmule.png"))); // NOI18N

        jLabel26.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel26.setText("Água mineral");

        jLabel27.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel27.setText("Suco natural");

        jLabel28.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel28.setText("Monster");

        jLabel29.setText("Com ou sem gás. 500ml");

        jLabel30.setText("Laranja, abacaxi, uva. 500ml");

        jLabel31.setText("Mango loko, Paradise, Green. 473ml");

        jLabel32.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel32.setText("Corona Long Neck");

        jLabel33.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel33.setText("Patagônia IPA Long Neck");

        jLabel34.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel34.setText("Heineken Long Neck");

        jLabel35.setText("Cerveja mexicanca. 330ml");

        jLabel36.setText("Cerveja argentina. 330ml");

        jLabel37.setText("Cerveja holandesa. 330ml");

        jLabel38.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel38.setText("Chopp Stella Artois");

        jLabel39.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel39.setText("Chopp Patagônia");

        jLabel40.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel40.setText("Chopp Brahma ");

        jLabel41.setText("Pislen.500 ml");

        jLabel42.setText("WEISS. 500ml");

        jLabel43.setText("Pilsen. 500ml");

        jLabel44.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel44.setText("Negroni");

        jLabel45.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel45.setText("Mojito");

        jLabel46.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel46.setText("Moscow Mule");

        jLabel47.setText("Gin, Campari, Vermoth Rosso");

        jLabel48.setText("Rum, xarope de limão, hortelã, água com gás");

        jLabel49.setText("Vodka, xarope de limão, ginger ale, espuma de gengibre");

        jLabel50.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel50.setText("R$6.99");

        jLabel51.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel51.setText("R$8.99");

        jLabel52.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel52.setText("R$9.99");

        jLabel53.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel53.setText("R$12.90");

        jLabel54.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel54.setText("R$14.90");

        jLabel55.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel55.setText("R$12.90");

        jLabel56.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel56.setText("R$15.90");

        jLabel57.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel57.setText("R$17.90");

        jLabel58.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel58.setText("R$15.50");

        jLabel59.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel59.setText("R$29.99");

        jLabel60.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel60.setText("R$29.50");

        jLabel61.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel61.setText("R$32.50");

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpinner2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner2StateChanged(evt);
            }
        });

        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpinner3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner3StateChanged(evt);
            }
        });

        jSpinner4.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpinner4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner4StateChanged(evt);
            }
        });

        jSpinner5.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpinner5.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner5StateChanged(evt);
            }
        });

        jSpinner6.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpinner6.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner6StateChanged(evt);
            }
        });

        jSpinner7.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpinner7.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner7StateChanged(evt);
            }
        });

        jSpinner8.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpinner8.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner8StateChanged(evt);
            }
        });

        jSpinner9.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpinner9.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner9StateChanged(evt);
            }
        });

        jSpinner10.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpinner10.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner10StateChanged(evt);
            }
        });

        jSpinner11.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpinner11.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner11StateChanged(evt);
            }
        });

        jSpinner12.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpinner12.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner12StateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel8Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel3)))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10)
                            .addComponent(jLabel13))))
                .addGap(30, 30, 30)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(jLabel31)
                    .addComponent(jLabel35)
                    .addComponent(jLabel36)
                    .addComponent(jLabel37)
                    .addComponent(jLabel41)
                    .addComponent(jLabel42)
                    .addComponent(jLabel43)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel46)
                        .addGap(112, 112, 112)
                        .addComponent(jLabel61))
                    .addComponent(jLabel47)
                    .addComponent(jLabel49)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28)
                            .addComponent(jLabel32)
                            .addComponent(jLabel33)
                            .addComponent(jLabel34)
                            .addComponent(jLabel38)
                            .addComponent(jLabel39)
                            .addComponent(jLabel40)
                            .addComponent(jLabel44)
                            .addComponent(jLabel45))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel60)
                            .addComponent(jLabel59)
                            .addComponent(jLabel58)
                            .addComponent(jLabel57)
                            .addComponent(jLabel56)
                            .addComponent(jLabel55)
                            .addComponent(jLabel54)
                            .addComponent(jLabel53)
                            .addComponent(jLabel52)
                            .addComponent(jLabel51)
                            .addComponent(jLabel50)))
                    .addComponent(jLabel48)
                    .addComponent(jLabel30)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel11))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(jLabel50))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel29)
                        .addGap(11, 11, 11)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(jLabel51))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel30)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(jLabel52))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel31)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel32)
                                    .addComponent(jLabel53))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel35)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel33)
                                    .addComponent(jLabel54))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel36)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel34)
                                    .addComponent(jLabel55))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel37)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(151, 151, 151)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel38)
                                    .addComponent(jLabel56))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel41)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel39)
                                    .addComponent(jLabel57))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel42)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel40)
                                    .addComponent(jLabel58))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel43)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(149, 149, 149)
                        .addComponent(jLabel10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel44)
                            .addComponent(jLabel59))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel47)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel45)
                            .addComponent(jLabel60))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel48)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel46)
                            .addComponent(jLabel61))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel49)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Todos os produtos", jPanel8);

        jLabel104.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel104.setText("R$6.99");

        jLabel105.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel105.setText("R$8.99");

        jLabel106.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel106.setText("R$9.99");

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/monster.png"))); // NOI18N

        jSpinner13.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpinner13.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner13StateChanged(evt);
            }
        });

        jSpinner14.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpinner14.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner14StateChanged(evt);
            }
        });

        jSpinner15.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpinner15.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner15StateChanged(evt);
            }
        });

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/agua.png"))); // NOI18N

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/suco.png"))); // NOI18N

        jLabel107.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel107.setText("Água mineral");

        jLabel108.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel108.setText("Suco natural");

        jLabel109.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel109.setText("Monster");

        jLabel110.setText("Com ou sem gás. 500ml");

        jLabel111.setText("Laranja, abacaxi, uva. 500ml");

        jLabel112.setText("Mango loko, Paradise, Green. 473ml");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel22)))
                .addGap(41, 41, 41)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel110)
                    .addComponent(jLabel112)
                    .addComponent(jLabel111)
                    .addComponent(jSpinner13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner15, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                            .addComponent(jLabel109)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel106))
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addComponent(jLabel108)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel105))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                            .addComponent(jLabel107)
                            .addGap(100, 100, 100)
                            .addComponent(jLabel104))))
                .addContainerGap(301, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel107)
                            .addComponent(jLabel104))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel110)
                        .addGap(11, 11, 11)
                        .addComponent(jSpinner13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel108)
                            .addComponent(jLabel105))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel111)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel109)
                            .addComponent(jLabel106))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel112)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(2016, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Sem álcool", jPanel9);

        jLabel62.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel62.setText("R$29.99");

        jLabel63.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel63.setText("R$29.50");

        jLabel64.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel64.setText("R$32.50");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/negroni.png"))); // NOI18N

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/mojito.png"))); // NOI18N

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/moscowmule.png"))); // NOI18N

        jSpinner16.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpinner16.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner16StateChanged(evt);
            }
        });

        jSpinner17.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpinner17.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner17StateChanged(evt);
            }
        });

        jSpinner18.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpinner18.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner18StateChanged(evt);
            }
        });

        jLabel65.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel65.setText("Negroni");

        jLabel66.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel66.setText("Mojito");

        jLabel67.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel67.setText("Moscow Mule");

        jLabel68.setText("Gin, Campari, Vermoth Rosso");

        jLabel69.setText("Rum, xarope de limão, hortelã, água com gás");

        jLabel70.setText("Vodka, xarope de limão, ginger ale, espuma de gengibre");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel68)
                    .addComponent(jLabel69)
                    .addComponent(jSpinner16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel70)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createSequentialGroup()
                            .addComponent(jLabel67)
                            .addGap(74, 74, 74)
                            .addComponent(jLabel64))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createSequentialGroup()
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel65)
                                .addComponent(jLabel66))
                            .addGap(121, 121, 121)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel63)
                                .addComponent(jLabel62)))))
                .addContainerGap(288, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel65)
                            .addComponent(jLabel62))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel68)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSpinner16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel66)
                            .addComponent(jLabel63))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel69)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSpinner17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel67)
                            .addComponent(jLabel64))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel70)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSpinner18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(2017, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Drinks", jPanel10);

        jLabel82.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel82.setText("R$12.90");

        jLabel113.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel113.setText("R$14.90");

        jLabel114.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel114.setText("R$12.90");

        jLabel115.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/patagonia.png"))); // NOI18N

        jLabel116.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/corona.png"))); // NOI18N

        jLabel117.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/heineken.png"))); // NOI18N

        jSpinner22.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpinner22.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner22StateChanged(evt);
            }
        });

        jSpinner23.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpinner23.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner23StateChanged(evt);
            }
        });

        jSpinner24.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpinner24.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner24StateChanged(evt);
            }
        });

        jLabel118.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel118.setText("Corona Long Neck");

        jLabel119.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel119.setText("Patagônia IPA Long Neck");

        jLabel120.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel120.setText("Heineken Long Neck");

        jLabel121.setText("Cerveja mexicanca. 330ml");

        jLabel122.setText("Cerveja argentina. 330ml");

        jLabel123.setText("Cerveja holandesa. 330ml");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel116)
                    .addComponent(jLabel115)
                    .addComponent(jLabel117))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel123)
                    .addComponent(jSpinner24, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel122)
                    .addComponent(jSpinner23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel121)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel118)
                        .addGap(59, 59, 59)
                        .addComponent(jLabel82))
                    .addComponent(jSpinner22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                            .addComponent(jLabel120)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel114))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                            .addComponent(jLabel119)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel113))))
                .addContainerGap(306, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel116))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel118)
                            .addComponent(jLabel82))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel121)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel115)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel117))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel119)
                            .addComponent(jLabel113))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel122)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel120)
                            .addComponent(jLabel114))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel123)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(2056, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Cerveja", jPanel11);

        jLabel83.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel83.setText("R$15.90");

        jLabel84.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel84.setText("R$17.90");

        jLabel85.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel85.setText("R$15.50");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/chopp_brahma.png"))); // NOI18N

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/weisse.png"))); // NOI18N

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/stella.png"))); // NOI18N

        jSpinner25.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpinner25.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner25StateChanged(evt);
            }
        });

        jSpinner26.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpinner26.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner26StateChanged(evt);
            }
        });

        jSpinner27.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpinner27.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner27StateChanged(evt);
            }
        });

        jLabel86.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel86.setText("Chopp Stella Artois");

        jLabel87.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel87.setText("Chopp Patagônia");

        jLabel88.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel88.setText("Chopp Brahma ");

        jLabel89.setText("Pislen.500 ml");

        jLabel90.setText("WEISS. 500ml");

        jLabel91.setText("Pilsen. 500ml");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18))
                .addGap(30, 30, 30)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel91)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel88)
                        .addGap(53, 53, 53)
                        .addComponent(jLabel85))
                    .addComponent(jSpinner27, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel90)
                    .addComponent(jSpinner26, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel89)
                    .addComponent(jSpinner25, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel12Layout.createSequentialGroup()
                            .addComponent(jLabel87)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel84))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel12Layout.createSequentialGroup()
                            .addComponent(jLabel86)
                            .addGap(24, 24, 24)
                            .addComponent(jLabel83))))
                .addContainerGap(316, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel19))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel86)
                            .addComponent(jLabel83))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel89)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel87)
                            .addComponent(jLabel84))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel90)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel88)
                            .addComponent(jLabel85))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel91)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(2009, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Chopp", jPanel12);

        jScrollPane1.setViewportView(jTabbedPane2);

        jButton4.setText("Confirmar pedido");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Forma de pagamento", "Dinheiro", "Débito", "Crédito" }));

        jPanel3.setBackground(new java.awt.Color(255, 0, 0));

        jLabel20.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("0.00");

        jLabel21.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Valor:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jButton3.setBackground(new java.awt.Color(0, 102, 102));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/adm_frame_icon.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private ArrayList<Produto> fechaCarrinho () {
        
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        
        int qntdAgua = Integer.parseInt(jSpinner1.getValue().toString());
        if(qntdAgua != 0 ) {
            Produto pAgua = new Produto(1, "Água mineral", 6.99f, Integer.parseInt(jSpinner1.getValue().toString()));
            produtos.add(pAgua);
        }
        int qntdSuco = Integer.parseInt(jSpinner2.getValue().toString());
        if(qntdSuco != 0) {
            Produto pSuco = new Produto(2, "Suco natural", 8.99f, Integer.parseInt(jSpinner2.getValue().toString()));
            produtos.add(pSuco);
        }
        int qntdMonster = Integer.parseInt(jSpinner3.getValue().toString());
        if(qntdMonster != 0 ){
            Produto pMonster = new Produto (3, "Monster", 9.99f, Integer.parseInt(jSpinner3.getValue().toString()));
            produtos.add(pMonster);
        }
        int qntdCorona = Integer.parseInt(jSpinner4.getValue().toString());
        if(qntdCorona != 0){
            Produto pCorona = new Produto (4, "Corona", 12.90f, Integer.parseInt(jSpinner4.getValue().toString()));
            produtos.add(pCorona);
        }
        int qntdIpa = Integer.parseInt(jSpinner5.getValue().toString());
        if(qntdIpa != 0) {
            Produto pIpa = new Produto (5, "Patagônia IPA Long Neck", 14.90f, Integer.parseInt(jSpinner5.getValue().toString()));
            produtos.add(pIpa);
        }
        int qntdHeineken = Integer.parseInt(jSpinner6.getValue().toString());
        if(qntdHeineken != 0) {
            Produto pHeineken = new Produto (6, "Heineken Long Neck", 12.90f, Integer.parseInt(jSpinner6.getValue().toString()));
            produtos.add(pHeineken);
        }
        int qntdStella = Integer.parseInt(jSpinner7.getValue().toString());
        if(qntdStella != 0) {
            Produto pStella = new Produto (7, "Chopp Stella", 15.90f, Integer.parseInt(jSpinner7.getValue().toString()));
            produtos.add(pStella);
        }
        int qntdWeiss = Integer.parseInt(jSpinner8.getValue().toString());
        if(qntdWeiss != 0) {
            Produto pWeiss = new Produto (8, "Patagônia Chopp WEISS", 17.90f, Integer.parseInt(jSpinner8.getValue().toString()));
            produtos.add(pWeiss);
        }
        int qntdBrahma = Integer.parseInt(jSpinner9.getValue().toString());
        if(qntdBrahma != 0) {
            Produto pBrahma = new Produto (9, "Chopp Brahma Pilsen", 15.50f, Integer.parseInt(jSpinner9.getValue().toString()));
            produtos.add(pBrahma);
        }
        int qntdNegroni = Integer.parseInt(jSpinner10.getValue().toString());
        if(qntdNegroni != 0) {
            Produto pNegroni = new Produto (10, "Negroni", 29.99f, Integer.parseInt(jSpinner10.getValue().toString()));
            produtos.add(pNegroni);
        }
        int qntdMojito = Integer.parseInt(jSpinner11.getValue().toString());
        if(qntdMojito != 0) {
            Produto pMojito = new Produto (11, "Mojito", 29.50f, Integer.parseInt(jSpinner11.getValue().toString()));
            produtos.add(pMojito);
        }
        int qntdMoscow = Integer.parseInt(jSpinner12.getValue().toString());
        if(qntdMoscow != 0) {
            Produto pMoscow = new Produto (12, "Moscow Mule", 32.50f, Integer.parseInt(jSpinner12.getValue().toString()));
            produtos.add(pMoscow);
        }
        
        float qntdAguaAlt = Float.parseFloat(jSpinner13.getValue().toString()) * 6.99f;
        if(qntdAguaAlt != 0 ) {
            Produto pAgua = new Produto(1, "Água mineral", 6.99f, Integer.parseInt(jSpinner13.getValue().toString()));
            produtos.add(pAgua);
        }
        float qntdSucoAlt = Float.parseFloat(jSpinner14.getValue().toString()) * 8.99f;
        if(qntdSucoAlt != 0) {
            Produto pSuco = new Produto(2, "Suco natural", 8.99f, Integer.parseInt(jSpinner14.getValue().toString()));
            produtos.add(pSuco);
        }
        float qntdMonsterAlt = Float.parseFloat(jSpinner15.getValue().toString()) * 9.99f;
        if(qntdMonsterAlt != 0 ){
            Produto pMonster = new Produto (3, "Monster", 9.99f, Integer.parseInt(jSpinner15.getValue().toString()));
            produtos.add(pMonster);
        }
        float qntdNegroniAlt = Float.parseFloat(jSpinner16.getValue().toString()) * 29.99f;
        if(qntdNegroniAlt != 0) {
            Produto pNegroni = new Produto (10, "Negroni", 29.99f, Integer.parseInt(jSpinner16.getValue().toString()));
            produtos.add(pNegroni);
        }
        float qntdMojitoAlt = Float.parseFloat(jSpinner17.getValue().toString()) * 29.50f;
        if(qntdMojitoAlt != 0) {
            Produto pMojito = new Produto (11, "Mojito", 29.50f, Integer.parseInt(jSpinner17.getValue().toString()));
            produtos.add(pMojito);
        }
        float qntdMoscowAlt = Float.parseFloat(jSpinner18.getValue().toString()) * 32.50f;
        if(qntdMoscowAlt != 0) {
            Produto pMoscow = new Produto (12, "Moscow Mule", 32.50f, Integer.parseInt(jSpinner18.getValue().toString()));
            produtos.add(pMoscow);
        }
        
        float qntdCoronaAlt = Float.parseFloat(jSpinner22.getValue().toString()) * 12.90f;
        if(qntdCoronaAlt != 0){
            Produto pCorona = new Produto (4, "Corona", 12.90f, Integer.parseInt(jSpinner22.getValue().toString()));
            produtos.add(pCorona);
        }
        float qntdIpaAlt = Float.parseFloat(jSpinner23.getValue().toString()) * 14.90f;
        if(qntdIpaAlt != 0) {
            Produto pIpa = new Produto (5, "Patagônia IPA Long Neck", 14.90f, Integer.parseInt(jSpinner23.getValue().toString()));
            produtos.add(pIpa);
        }
        float qntdHeinekenAlt = Float.parseFloat(jSpinner24.getValue().toString()) * 12.90f;
        if(qntdHeinekenAlt != 0) {
            Produto pHeineken = new Produto (6, "Heineken Long Neck", 12.90f, Integer.parseInt(jSpinner24.getValue().toString()));
            produtos.add(pHeineken);
        }
        float qntdStellaAlt = Float.parseFloat(jSpinner25.getValue().toString()) * 15.90f;
        if(qntdStellaAlt != 0) {
            Produto pStella = new Produto (7, "Chopp Stella", 15.90f, Integer.parseInt(jSpinner25.getValue().toString()));
            produtos.add(pStella);
        }
        float qntdWeissAlt = Float.parseFloat(jSpinner26.getValue().toString()) * 17.90f;
        if(qntdWeissAlt != 0) {
            Produto pWeiss = new Produto (8, "Patagônia Chopp WEISS", 17.90f, Integer.parseInt(jSpinner26.getValue().toString()));
            produtos.add(pWeiss);
        }
        float qntdBrahmaAlt = Float.parseFloat(jSpinner27.getValue().toString()) * 15.50f;
        if(qntdBrahmaAlt != 0) {
            Produto pBrahma = new Produto (9, "Chopp Brahma Pilsen", 15.50f, Integer.parseInt(jSpinner27.getValue().toString()));
            produtos.add(pBrahma);
        }
        
        return produtos;
    };
    
    private void calculaValor () {
        
        
        float spinner1 = Float.parseFloat(jSpinner1.getValue().toString()) * 6.99f ;
        float spinner2 = Float.parseFloat(jSpinner2.getValue().toString()) * 8.99f;
        float spinner3 = Float.parseFloat(jSpinner3.getValue().toString()) * 9.99f;
        float spinner4 = Float.parseFloat(jSpinner4.getValue().toString()) * 12.90f;
        float spinner5 = Float.parseFloat(jSpinner5.getValue().toString()) * 14.90f;
        float spinner6 = Float.parseFloat(jSpinner6.getValue().toString()) * 12.90f;
        float spinner7 = Float.parseFloat(jSpinner7.getValue().toString()) * 15.90f;
        float spinner8 = Float.parseFloat(jSpinner8.getValue().toString()) * 17.90f;
        float spinner9 = Float.parseFloat(jSpinner9.getValue().toString()) * 15.50f;
        float spinner10 = Float.parseFloat(jSpinner10.getValue().toString()) * 29.99f;
        float spinner11 = Float.parseFloat(jSpinner11.getValue().toString()) * 29.50f;
        float spinner12 = Float.parseFloat(jSpinner12.getValue().toString()) * 32.50f;
        
        float spinner13 = Float.parseFloat(jSpinner13.getValue().toString()) * 6.99f;
        float spinner14 = Float.parseFloat(jSpinner14.getValue().toString()) * 8.99f;
        float spinner15 = Float.parseFloat(jSpinner15.getValue().toString()) * 9.99f;
        float spinner16 = Float.parseFloat(jSpinner16.getValue().toString()) * 29.99f;
        float spinner17 = Float.parseFloat(jSpinner17.getValue().toString()) * 29.50f;
        float spinner18 = Float.parseFloat(jSpinner18.getValue().toString()) * 32.50f;
        float spinner22 = Float.parseFloat(jSpinner22.getValue().toString()) * 12.90f;
        float spinner23 = Float.parseFloat(jSpinner23.getValue().toString()) * 14.90f;
        float spinner24 = Float.parseFloat(jSpinner24.getValue().toString()) * 12.90f;
        float spinner25 = Float.parseFloat(jSpinner25.getValue().toString()) * 15.90f;
        float spinner26 = Float.parseFloat(jSpinner26.getValue().toString()) * 17.90f;
        float spinner27 = Float.parseFloat(jSpinner27.getValue().toString()) * 15.50f;
        
        
        
        float vTotal = spinner1 + spinner2 + spinner3 + spinner4 + spinner5 + spinner6 +
                spinner7 + spinner8 + spinner9 + spinner10 + spinner11 + spinner12 + spinner13 + 
                spinner14 + spinner15 + spinner16 + spinner17 + spinner18 + spinner22 + spinner23 +
                spinner24 + spinner25 + spinner26 + spinner27;
        
        jLabel20.setText(String.format(Locale.US, "%.2f", vTotal));
        
    }
    
    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        this.calculaValor();
    }//GEN-LAST:event_jSpinner1StateChanged
   
    private void jSpinner2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner2StateChanged
       this.calculaValor();
    }//GEN-LAST:event_jSpinner2StateChanged

    private void jSpinner3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner3StateChanged
        this.calculaValor();
    }//GEN-LAST:event_jSpinner3StateChanged

    private void jSpinner4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner4StateChanged
        this.calculaValor();
    }//GEN-LAST:event_jSpinner4StateChanged

    private void jSpinner5StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner5StateChanged
       this.calculaValor();
    }//GEN-LAST:event_jSpinner5StateChanged

    private void jSpinner6StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner6StateChanged
        this.calculaValor();
    }//GEN-LAST:event_jSpinner6StateChanged

    private void jSpinner7StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner7StateChanged
        this.calculaValor();
    }//GEN-LAST:event_jSpinner7StateChanged

    private void jSpinner8StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner8StateChanged
        this.calculaValor();
    }//GEN-LAST:event_jSpinner8StateChanged

    private void jSpinner9StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner9StateChanged
        this.calculaValor();
    }//GEN-LAST:event_jSpinner9StateChanged

    private void jSpinner10StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner10StateChanged
        this.calculaValor();
    }//GEN-LAST:event_jSpinner10StateChanged

    private void jSpinner11StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner11StateChanged
        this.calculaValor();
    }//GEN-LAST:event_jSpinner11StateChanged

    private void jSpinner12StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner12StateChanged
        this.calculaValor();
    }//GEN-LAST:event_jSpinner12StateChanged

    private void jSpinner13StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner13StateChanged
        this.calculaValor();
    }//GEN-LAST:event_jSpinner13StateChanged

    private void jSpinner14StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner14StateChanged
        this.calculaValor();
    }//GEN-LAST:event_jSpinner14StateChanged

    private void jSpinner15StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner15StateChanged
        this.calculaValor();
    }//GEN-LAST:event_jSpinner15StateChanged

    private void jSpinner16StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner16StateChanged
        this.calculaValor();
    }//GEN-LAST:event_jSpinner16StateChanged

    private void jSpinner17StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner17StateChanged
        this.calculaValor();
    }//GEN-LAST:event_jSpinner17StateChanged

    private void jSpinner18StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner18StateChanged
       this.calculaValor();
    }//GEN-LAST:event_jSpinner18StateChanged

    private void jSpinner22StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner22StateChanged
        this.calculaValor();
    }//GEN-LAST:event_jSpinner22StateChanged

    private void jSpinner23StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner23StateChanged
        this.calculaValor();
    }//GEN-LAST:event_jSpinner23StateChanged

    private void jSpinner24StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner24StateChanged
        this.calculaValor();
    }//GEN-LAST:event_jSpinner24StateChanged

    private void jSpinner25StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner25StateChanged
        this.calculaValor();
    }//GEN-LAST:event_jSpinner25StateChanged

    private void jSpinner26StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner26StateChanged
        this.calculaValor();
    }//GEN-LAST:event_jSpinner26StateChanged

    private void jSpinner27StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner27StateChanged
        this.calculaValor();
    }//GEN-LAST:event_jSpinner27StateChanged

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // fechar pedido
        
        if(this.fechaCarrinho().isEmpty()){
        JOptionPane.showMessageDialog(null, "Nenhum item no carrinho!");
        } else {
        Pedido_Controller pedidoControl = new Pedido_Controller(jComboBox1.getSelectedIndex(), this.fechaCarrinho(), Float.parseFloat(jLabel20.getText().toString()));
        pedidoControl.fechaPedido();
        
        String pNome = " Produtos do carrinho: ";
        ArrayList<Produto> produtos = this.fechaCarrinho();
            for(Produto p : produtos){
             pNome = pNome + "\n" + p.getQnt() + " " + p.getNome();
            }
            
            ImageIcon icon = new ImageIcon("src/imgs/carrinho.png");
            int i = JOptionPane.showConfirmDialog(this, pNome + "\n" + "Valor total: R$" + jLabel20.getText(), "Carrinho", JOptionPane.OK_CANCEL_OPTION ,WIDTH , icon);
            if(i == JOptionPane.CANCEL_OPTION) {
            
                
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // chama login
        loginFrame frame = new loginFrame();
        frame.setSize(338, 196);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton3ActionPerformed

    
    
    
   
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
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner10;
    private javax.swing.JSpinner jSpinner11;
    private javax.swing.JSpinner jSpinner12;
    private javax.swing.JSpinner jSpinner13;
    private javax.swing.JSpinner jSpinner14;
    private javax.swing.JSpinner jSpinner15;
    private javax.swing.JSpinner jSpinner16;
    private javax.swing.JSpinner jSpinner17;
    private javax.swing.JSpinner jSpinner18;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner22;
    private javax.swing.JSpinner jSpinner23;
    private javax.swing.JSpinner jSpinner24;
    private javax.swing.JSpinner jSpinner25;
    private javax.swing.JSpinner jSpinner26;
    private javax.swing.JSpinner jSpinner27;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JSpinner jSpinner6;
    private javax.swing.JSpinner jSpinner7;
    private javax.swing.JSpinner jSpinner8;
    private javax.swing.JSpinner jSpinner9;
    private javax.swing.JTabbedPane jTabbedPane2;
    // End of variables declaration//GEN-END:variables
}
