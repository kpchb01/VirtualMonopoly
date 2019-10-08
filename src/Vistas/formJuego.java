package Vistas;

import Clases.ClassDados;
import Clases.ClassJugador;
import Clases.ClassTarjeta;
import Util.Cola;
import Util.Lista;
import Util.Pila;
import static Vistas.formInicio.message;
import java.awt.Color;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import javax.swing.JOptionPane;

import javax.swing.JPanel;

/**
 *
 * @author ARMENI
 */
public class formJuego extends javax.swing.JFrame {

    public static Lista casillas = new Lista();

    public static int seleccion = Integer.parseInt(formInicio.message);

    static ClassJugador jugador1 = new ClassJugador(1, Color.RED, "jugador1");
    static ClassJugador jugador2 = new ClassJugador(1, new java.awt.Color(255, 204, 0), "jugador2");
    static ClassJugador jugador3 = new ClassJugador(1, new java.awt.Color(102, 204, 0), "jugador3");
    static ClassJugador jugador4 = new ClassJugador(1, new java.awt.Color(102, 0, 204), "jugador4");
    public static ClassJugador doble = null;
    static ClassJugador memo;

    //COMUNAL
    ClassTarjeta comunal1 = new ClassTarjeta("Honorarios médicos, pague $50");
    ClassTarjeta comunal2 = new ClassTarjeta("Vencimiento de fondo vacacional, reciba $100");
    ClassTarjeta comunal3 = new ClassTarjeta("Pague colegiaturas por $70");
    ClassTarjeta comunal4 = new ClassTarjeta("Pague cuenta de hospital por $100");
    ClassTarjeta comunal5 = new ClassTarjeta("Ganó el segundo lugar en un concurso de belleza, cobre $10");

    //SUERTE
    ClassTarjeta suerte1 = new ClassTarjeta("Avance a EL MUELLE");
    ClassTarjeta suerte2 = new ClassTarjeta("Por cumplimiento en pago del préstamo de construcción cobre $150");
    ClassTarjeta suerte3 = new ClassTarjeta("SALGA DE LA CÁRCEL GRATIS");
    ClassTarjeta suerte4 = new ClassTarjeta("Avance a la SALIDA");
    ClassTarjeta suerte5 = new ClassTarjeta("Pague multa por exceso de velocidad $15");
    ClassTarjeta pruebaCarta = new ClassTarjeta();
    Cola jugadores = new Cola();
    
    ClassTarjeta memoCarcel = null;
    ClassTarjeta memoTarjeta;

    Pila Comunal = new Pila();
    Pila auxComunal = new Pila();
    Pila Suerte = new Pila();
    Pila auxSuerte = new Pila();

    ClassTarjeta prueba = new ClassTarjeta();

    public formJuego() {
        initComponents();
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        jLabelJugador3.setVisible(false);
        jTextFieldDinero3.setVisible(false);
        turno3.setVisible(false);
        jLabelJugador4.setVisible(false);
        jTextFieldDinero4.setVisible(false);
        turno4.setVisible(false);

       
        asignar();
        asignarCarta();
       

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelJuego = new javax.swing.JPanel();
        X = new javax.swing.JLabel();
        jPanelCarcel = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jPanelGo = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanelAvNewYork = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jPanelAvTennesse = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jPanelFerroPensilvania = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jPanelArcaComunal2 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jPanelPlazaJames = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jPanelAvVirginia = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jPanelAvStatus = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jPanelElectricidad = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jPanelPlazaSanCarlos = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jPanelDescanso = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jPanelBase = new javax.swing.JPanel();
        btntirarDados = new javax.swing.JButton();
        resultadoDado2 = new javax.swing.JLabel();
        btnrevovlerDados = new javax.swing.JButton();
        resultadoDado1 = new javax.swing.JLabel();
        btnSuerte = new javax.swing.JButton();
        btnArcaComunal = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanelAvKentucky = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanelSuerte2 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanelAvIndiana = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanelAvIllinois = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanelFerroByO = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jPanelAvAtlantico = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jPanelAvVentnor = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jPanelAgua = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jPanelJardinesMarvin = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jPanelIrACarcel = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jPanelAvPacifico = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jPanelAvCarolinaNorte = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jPanelArcaComunal3 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jPanelAvPensilvania = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jPanelFerroViaRapida = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jPanelSuerte3 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jPanelPlazaPark = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jPanelImpuestoLujo = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jPanelMuelle = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jPanelAvConnecticut = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jPanelAvOriental = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jPanelAvMediterraneo = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanelSuerte1 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jPanelAvVermont = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jPanelAvBaltica = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanelFerroReading = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanelArcaComunal1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanelImpuestoIngresos = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jTextFieldDinero1 = new javax.swing.JTextField();
        jTextFieldDinero4 = new javax.swing.JTextField();
        jTextFieldDinero2 = new javax.swing.JTextField();
        turno4 = new javax.swing.JTextField();
        jTextFieldDinero3 = new javax.swing.JTextField();
        turno1 = new javax.swing.JTextField();
        turno2 = new javax.swing.JTextField();
        turno3 = new javax.swing.JTextField();
        jLabelJugador1 = new javax.swing.JLabel();
        jLabelJugador2 = new javax.swing.JLabel();
        jLabelJugador3 = new javax.swing.JLabel();
        jLabelJugador4 = new javax.swing.JLabel();
        panelTarjeta = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        panelCastillaColor = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextRenta = new javax.swing.JTextField();
        jTextRentaDosCasas = new javax.swing.JTextField();
        jTextRentaUnaCasa = new javax.swing.JTextField();
        jTextRentaGC = new javax.swing.JTextField();
        jTextRentaCuatroCasas = new javax.swing.JTextField();
        jTextRentaTresCasas = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextRentaConHotel = new javax.swing.JTextField();
        btnSubastarPropiedad = new javax.swing.JButton();
        panelJugador = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        jPanelJugadorColor = new javax.swing.JPanel();
        jLabelJugadorNombre = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jTextRentaDosCasas2 = new javax.swing.JTextField();
        jTextCarcel = new javax.swing.JTextField();
        jTextRentaTresCasas2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        btnVenderCartaCarcel = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelJuego.setBackground(new java.awt.Color(255, 255, 255));
        panelJuego.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        X.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        X.setText("X");
        X.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                XMouseClicked(evt);
            }
        });
        panelJuego.add(X, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 0, 20, 20));

        jPanelCarcel.setBackground(new java.awt.Color(0, 204, 204));
        jPanelCarcel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/casillas/carcel.png"))); // NOI18N

        javax.swing.GroupLayout jPanelCarcelLayout = new javax.swing.GroupLayout(jPanelCarcel);
        jPanelCarcel.setLayout(jPanelCarcelLayout);
        jPanelCarcelLayout.setHorizontalGroup(
            jPanelCarcelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCarcelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
        );
        jPanelCarcelLayout.setVerticalGroup(
            jPanelCarcelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
        );

        panelJuego.add(jPanelCarcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 630, 80, 80));

        jPanelGo.setBackground(new java.awt.Color(0, 204, 204));
        jPanelGo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/casillas/icons8-retroceder-40.png"))); // NOI18N
        jLabel15.setText("GO");

        javax.swing.GroupLayout jPanelGoLayout = new javax.swing.GroupLayout(jPanelGo);
        jPanelGo.setLayout(jPanelGoLayout);
        jPanelGoLayout.setHorizontalGroup(
            jPanelGoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
        );
        jPanelGoLayout.setVerticalGroup(
            jPanelGoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelJuego.add(jPanelGo, new org.netbeans.lib.awtextra.AbsoluteConstraints(984, 630, 80, 80));

        jPanelAvNewYork.setBackground(new java.awt.Color(0, 204, 204));
        jPanelAvNewYork.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 0, 0));
        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/casillas/icons8-autopista-48.png"))); // NOI18N

        javax.swing.GroupLayout jPanelAvNewYorkLayout = new javax.swing.GroupLayout(jPanelAvNewYork);
        jPanelAvNewYork.setLayout(jPanelAvNewYorkLayout);
        jPanelAvNewYorkLayout.setHorizontalGroup(
            jPanelAvNewYorkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAvNewYorkLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanelAvNewYorkLayout.setVerticalGroup(
            jPanelAvNewYorkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAvNewYorkLayout.createSequentialGroup()
                .addComponent(jLabel54)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        panelJuego.add(jPanelAvNewYork, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 80, 60));

        jPanelAvTennesse.setBackground(new java.awt.Color(0, 204, 204));
        jPanelAvTennesse.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 0, 0));
        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/casillas/icons8-autopista-48.png"))); // NOI18N

        javax.swing.GroupLayout jPanelAvTennesseLayout = new javax.swing.GroupLayout(jPanelAvTennesse);
        jPanelAvTennesse.setLayout(jPanelAvTennesseLayout);
        jPanelAvTennesseLayout.setHorizontalGroup(
            jPanelAvTennesseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAvTennesseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanelAvTennesseLayout.setVerticalGroup(
            jPanelAvTennesseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAvTennesseLayout.createSequentialGroup()
                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelJuego.add(jPanelAvTennesse, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 80, 60));

        jPanelFerroPensilvania.setBackground(new java.awt.Color(0, 204, 204));
        jPanelFerroPensilvania.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 0, 0));
        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/casillas/icons8-vagón-de-ferrocarril-40.png"))); // NOI18N

        javax.swing.GroupLayout jPanelFerroPensilvaniaLayout = new javax.swing.GroupLayout(jPanelFerroPensilvania);
        jPanelFerroPensilvania.setLayout(jPanelFerroPensilvaniaLayout);
        jPanelFerroPensilvaniaLayout.setHorizontalGroup(
            jPanelFerroPensilvaniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFerroPensilvaniaLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel50)
                .addGap(18, 18, 18))
        );
        jPanelFerroPensilvaniaLayout.setVerticalGroup(
            jPanelFerroPensilvaniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFerroPensilvaniaLayout.createSequentialGroup()
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        panelJuego.add(jPanelFerroPensilvania, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 80, 60));

        jPanelArcaComunal2.setBackground(new java.awt.Color(0, 204, 204));
        jPanelArcaComunal2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 0, 0));
        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/casillas/icons8-cofre-del-tesoro-40.png"))); // NOI18N

        javax.swing.GroupLayout jPanelArcaComunal2Layout = new javax.swing.GroupLayout(jPanelArcaComunal2);
        jPanelArcaComunal2.setLayout(jPanelArcaComunal2Layout);
        jPanelArcaComunal2Layout.setHorizontalGroup(
            jPanelArcaComunal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelArcaComunal2Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelArcaComunal2Layout.setVerticalGroup(
            jPanelArcaComunal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelArcaComunal2Layout.createSequentialGroup()
                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        panelJuego.add(jPanelArcaComunal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 80, 60));

        jPanelPlazaJames.setBackground(new java.awt.Color(0, 204, 204));
        jPanelPlazaJames.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/casillas/icons8-plaza-de-la-ciudad-40.png"))); // NOI18N

        javax.swing.GroupLayout jPanelPlazaJamesLayout = new javax.swing.GroupLayout(jPanelPlazaJames);
        jPanelPlazaJames.setLayout(jPanelPlazaJamesLayout);
        jPanelPlazaJamesLayout.setHorizontalGroup(
            jPanelPlazaJamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPlazaJamesLayout.createSequentialGroup()
                .addGap(0, 18, Short.MAX_VALUE)
                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelPlazaJamesLayout.setVerticalGroup(
            jPanelPlazaJamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
        );

        panelJuego.add(jPanelPlazaJames, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 80, 60));

        jPanelAvVirginia.setBackground(new java.awt.Color(0, 204, 204));
        jPanelAvVirginia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 0, 0));
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/casillas/icons8-autopista-48.png"))); // NOI18N

        javax.swing.GroupLayout jPanelAvVirginiaLayout = new javax.swing.GroupLayout(jPanelAvVirginia);
        jPanelAvVirginia.setLayout(jPanelAvVirginiaLayout);
        jPanelAvVirginiaLayout.setHorizontalGroup(
            jPanelAvVirginiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 78, Short.MAX_VALUE)
            .addGroup(jPanelAvVirginiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelAvVirginiaLayout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(14, Short.MAX_VALUE)))
        );
        jPanelAvVirginiaLayout.setVerticalGroup(
            jPanelAvVirginiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
            .addGroup(jPanelAvVirginiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelAvVirginiaLayout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(jLabel36)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        panelJuego.add(jPanelAvVirginia, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 80, 60));

        jPanelAvStatus.setBackground(new java.awt.Color(0, 204, 204));
        jPanelAvStatus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 0, 0));
        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/casillas/icons8-autopista-48.png"))); // NOI18N

        javax.swing.GroupLayout jPanelAvStatusLayout = new javax.swing.GroupLayout(jPanelAvStatus);
        jPanelAvStatus.setLayout(jPanelAvStatusLayout);
        jPanelAvStatusLayout.setHorizontalGroup(
            jPanelAvStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 78, Short.MAX_VALUE)
            .addGroup(jPanelAvStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelAvStatusLayout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(14, Short.MAX_VALUE)))
        );
        jPanelAvStatusLayout.setVerticalGroup(
            jPanelAvStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
            .addGroup(jPanelAvStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelAvStatusLayout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(jLabel40)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        panelJuego.add(jPanelAvStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, 80, 60));

        jPanelElectricidad.setBackground(new java.awt.Color(0, 204, 204));
        jPanelElectricidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/casillas/icons8-bombilla-edison-60.png"))); // NOI18N

        javax.swing.GroupLayout jPanelElectricidadLayout = new javax.swing.GroupLayout(jPanelElectricidad);
        jPanelElectricidad.setLayout(jPanelElectricidadLayout);
        jPanelElectricidadLayout.setHorizontalGroup(
            jPanelElectricidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelElectricidadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
        );
        jPanelElectricidadLayout.setVerticalGroup(
            jPanelElectricidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelJuego.add(jPanelElectricidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 510, 80, 60));

        jPanelPlazaSanCarlos.setBackground(new java.awt.Color(0, 204, 204));
        jPanelPlazaSanCarlos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/casillas/icons8-plaza-de-la-ciudad-40.png"))); // NOI18N

        javax.swing.GroupLayout jPanelPlazaSanCarlosLayout = new javax.swing.GroupLayout(jPanelPlazaSanCarlos);
        jPanelPlazaSanCarlos.setLayout(jPanelPlazaSanCarlosLayout);
        jPanelPlazaSanCarlosLayout.setHorizontalGroup(
            jPanelPlazaSanCarlosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPlazaSanCarlosLayout.createSequentialGroup()
                .addGap(0, 18, Short.MAX_VALUE)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelPlazaSanCarlosLayout.setVerticalGroup(
            jPanelPlazaSanCarlosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
        );

        panelJuego.add(jPanelPlazaSanCarlos, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 570, 80, 60));

        jPanelDescanso.setBackground(new java.awt.Color(0, 204, 204));
        jPanelDescanso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/casillas/aparcamiento.png"))); // NOI18N

        javax.swing.GroupLayout jPanelDescansoLayout = new javax.swing.GroupLayout(jPanelDescanso);
        jPanelDescanso.setLayout(jPanelDescansoLayout);
        jPanelDescansoLayout.setHorizontalGroup(
            jPanelDescansoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDescansoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
        );
        jPanelDescansoLayout.setVerticalGroup(
            jPanelDescansoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
        );

        panelJuego.add(jPanelDescanso, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 80, 80));

        jPanelBase.setBackground(new java.awt.Color(242, 249, 249));
        jPanelBase.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelBase.setPreferredSize(new java.awt.Dimension(555, 540));
        jPanelBase.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btntirarDados.setText("TIRAR DADOS");
        btntirarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntirarDadosActionPerformed(evt);
            }
        });
        jPanelBase.add(btntirarDados, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));

        resultadoDado2.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 36)); // NOI18N
        jPanelBase.add(resultadoDado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 80, 70));

        btnrevovlerDados.setText("Revolver");
        btnrevovlerDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrevovlerDadosActionPerformed(evt);
            }
        });
        jPanelBase.add(btnrevovlerDados, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 80, 20));

        resultadoDado1.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 36)); // NOI18N
        jPanelBase.add(resultadoDado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 80, 70));

        btnSuerte.setBackground(new java.awt.Color(255, 153, 0));
        btnSuerte.setFont(new java.awt.Font("Shonar Bangla", 0, 24)); // NOI18N
        btnSuerte.setText("SUERTE");
        btnSuerte.setEnabled(false);
        btnSuerte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuerteActionPerformed(evt);
            }
        });
        jPanelBase.add(btnSuerte, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 260, 100));

        btnArcaComunal.setBackground(new java.awt.Color(255, 255, 105));
        btnArcaComunal.setFont(new java.awt.Font("Shonar Bangla", 0, 24)); // NOI18N
        btnArcaComunal.setText("ARCA COMUNAL");
        btnArcaComunal.setEnabled(false);
        btnArcaComunal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArcaComunalActionPerformed(evt);
            }
        });
        jPanelBase.add(btnArcaComunal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 260, 100));

        jLabel7.setFont(new java.awt.Font("Rockwell Condensed", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("VIRTUAL MONOPOLY");
        jPanelBase.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 430, 50));

        panelJuego.add(jPanelBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 554, 540));

        jPanelAvKentucky.setBackground(new java.awt.Color(0, 204, 204));
        jPanelAvKentucky.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 0, 0));
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/casillas/icons8-autopista-48.png"))); // NOI18N

        javax.swing.GroupLayout jPanelAvKentuckyLayout = new javax.swing.GroupLayout(jPanelAvKentucky);
        jPanelAvKentucky.setLayout(jPanelAvKentuckyLayout);
        jPanelAvKentuckyLayout.setHorizontalGroup(
            jPanelAvKentuckyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
            .addGroup(jPanelAvKentuckyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelAvKentuckyLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanelAvKentuckyLayout.setVerticalGroup(
            jPanelAvKentuckyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
            .addGroup(jPanelAvKentuckyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelAvKentuckyLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        panelJuego.add(jPanelAvKentucky, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 60, 80));

        jPanelSuerte2.setBackground(new java.awt.Color(0, 204, 204));
        jPanelSuerte2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/casillas/icons8-signo-de-interrogación-60.png"))); // NOI18N

        javax.swing.GroupLayout jPanelSuerte2Layout = new javax.swing.GroupLayout(jPanelSuerte2);
        jPanelSuerte2.setLayout(jPanelSuerte2Layout);
        jPanelSuerte2Layout.setHorizontalGroup(
            jPanelSuerte2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelSuerte2Layout.setVerticalGroup(
            jPanelSuerte2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
        );

        panelJuego.add(jPanelSuerte2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, -1, 80));

        jPanelAvIndiana.setBackground(new java.awt.Color(0, 204, 204));
        jPanelAvIndiana.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 0, 0));
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/casillas/icons8-autopista-48.png"))); // NOI18N

        javax.swing.GroupLayout jPanelAvIndianaLayout = new javax.swing.GroupLayout(jPanelAvIndiana);
        jPanelAvIndiana.setLayout(jPanelAvIndianaLayout);
        jPanelAvIndianaLayout.setHorizontalGroup(
            jPanelAvIndianaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(jPanelAvIndianaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelAvIndianaLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanelAvIndianaLayout.setVerticalGroup(
            jPanelAvIndianaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
            .addGroup(jPanelAvIndianaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelAvIndianaLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        panelJuego.add(jPanelAvIndiana, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 10, -1, 80));

        jPanelAvIllinois.setBackground(new java.awt.Color(0, 204, 204));
        jPanelAvIllinois.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 0, 0));
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/casillas/icons8-autopista-48.png"))); // NOI18N

        javax.swing.GroupLayout jPanelAvIllinoisLayout = new javax.swing.GroupLayout(jPanelAvIllinois);
        jPanelAvIllinois.setLayout(jPanelAvIllinoisLayout);
        jPanelAvIllinoisLayout.setHorizontalGroup(
            jPanelAvIllinoisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(jPanelAvIllinoisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelAvIllinoisLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanelAvIllinoisLayout.setVerticalGroup(
            jPanelAvIllinoisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
            .addGroup(jPanelAvIllinoisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelAvIllinoisLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        panelJuego.add(jPanelAvIllinois, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 10, -1, 80));

        jPanelFerroByO.setBackground(new java.awt.Color(0, 204, 204));
        jPanelFerroByO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 0, 0));
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/casillas/icons8-vagón-de-ferrocarril-40.png"))); // NOI18N

        javax.swing.GroupLayout jPanelFerroByOLayout = new javax.swing.GroupLayout(jPanelFerroByO);
        jPanelFerroByO.setLayout(jPanelFerroByOLayout);
        jPanelFerroByOLayout.setHorizontalGroup(
            jPanelFerroByOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(jPanelFerroByOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelFerroByOLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanelFerroByOLayout.setVerticalGroup(
            jPanelFerroByOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
            .addGroup(jPanelFerroByOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelFerroByOLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        panelJuego.add(jPanelFerroByO, new org.netbeans.lib.awtextra.AbsoluteConstraints(676, 10, -1, 80));

        jPanelAvAtlantico.setBackground(new java.awt.Color(0, 204, 204));
        jPanelAvAtlantico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 0, 0));
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/casillas/icons8-autopista-48.png"))); // NOI18N

        javax.swing.GroupLayout jPanelAvAtlanticoLayout = new javax.swing.GroupLayout(jPanelAvAtlantico);
        jPanelAvAtlantico.setLayout(jPanelAvAtlanticoLayout);
        jPanelAvAtlanticoLayout.setHorizontalGroup(
            jPanelAvAtlanticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(jPanelAvAtlanticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelAvAtlanticoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanelAvAtlanticoLayout.setVerticalGroup(
            jPanelAvAtlanticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
            .addGroup(jPanelAvAtlanticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelAvAtlanticoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        panelJuego.add(jPanelAvAtlantico, new org.netbeans.lib.awtextra.AbsoluteConstraints(738, 10, -1, 80));

        jPanelAvVentnor.setBackground(new java.awt.Color(0, 204, 204));
        jPanelAvVentnor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 0, 0));
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/casillas/icons8-autopista-48.png"))); // NOI18N

        javax.swing.GroupLayout jPanelAvVentnorLayout = new javax.swing.GroupLayout(jPanelAvVentnor);
        jPanelAvVentnor.setLayout(jPanelAvVentnorLayout);
        jPanelAvVentnorLayout.setHorizontalGroup(
            jPanelAvVentnorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(jPanelAvVentnorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelAvVentnorLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanelAvVentnorLayout.setVerticalGroup(
            jPanelAvVentnorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
            .addGroup(jPanelAvVentnorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelAvVentnorLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        panelJuego.add(jPanelAvVentnor, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, -1, 80));

        jPanelAgua.setBackground(new java.awt.Color(0, 204, 204));
        jPanelAgua.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/casillas/llave-de-paso-de-agua.png"))); // NOI18N

        javax.swing.GroupLayout jPanelAguaLayout = new javax.swing.GroupLayout(jPanelAgua);
        jPanelAgua.setLayout(jPanelAguaLayout);
        jPanelAguaLayout.setHorizontalGroup(
            jPanelAguaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelAguaLayout.setVerticalGroup(
            jPanelAguaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
        );

        panelJuego.add(jPanelAgua, new org.netbeans.lib.awtextra.AbsoluteConstraints(862, 10, -1, 80));

        jPanelJardinesMarvin.setBackground(new java.awt.Color(0, 204, 204));
        jPanelJardinesMarvin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/casillas/parque.png"))); // NOI18N

        javax.swing.GroupLayout jPanelJardinesMarvinLayout = new javax.swing.GroupLayout(jPanelJardinesMarvin);
        jPanelJardinesMarvin.setLayout(jPanelJardinesMarvinLayout);
        jPanelJardinesMarvinLayout.setHorizontalGroup(
            jPanelJardinesMarvinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel45, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelJardinesMarvinLayout.setVerticalGroup(
            jPanelJardinesMarvinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelJuego.add(jPanelJardinesMarvin, new org.netbeans.lib.awtextra.AbsoluteConstraints(924, 10, 60, 80));

        jPanelIrACarcel.setBackground(new java.awt.Color(0, 204, 204));
        jPanelIrACarcel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/casillas/esposas.png"))); // NOI18N

        javax.swing.GroupLayout jPanelIrACarcelLayout = new javax.swing.GroupLayout(jPanelIrACarcel);
        jPanelIrACarcel.setLayout(jPanelIrACarcelLayout);
        jPanelIrACarcelLayout.setHorizontalGroup(
            jPanelIrACarcelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelIrACarcelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
        );
        jPanelIrACarcelLayout.setVerticalGroup(
            jPanelIrACarcelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
        );

        panelJuego.add(jPanelIrACarcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(984, 10, 80, 80));

        jPanelAvPacifico.setBackground(new java.awt.Color(143, 239, 220));
        jPanelAvPacifico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 0, 0));
        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/casillas/icons8-autopista-48.png"))); // NOI18N

        javax.swing.GroupLayout jPanelAvPacificoLayout = new javax.swing.GroupLayout(jPanelAvPacifico);
        jPanelAvPacifico.setLayout(jPanelAvPacificoLayout);
        jPanelAvPacificoLayout.setHorizontalGroup(
            jPanelAvPacificoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAvPacificoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelAvPacificoLayout.setVerticalGroup(
            jPanelAvPacificoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAvPacificoLayout.createSequentialGroup()
                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelJuego.add(jPanelAvPacifico, new org.netbeans.lib.awtextra.AbsoluteConstraints(984, 90, 80, 60));

        jPanelAvCarolinaNorte.setBackground(new java.awt.Color(143, 239, 220));
        jPanelAvCarolinaNorte.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 0, 0));
        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/casillas/icons8-autopista-48.png"))); // NOI18N

        javax.swing.GroupLayout jPanelAvCarolinaNorteLayout = new javax.swing.GroupLayout(jPanelAvCarolinaNorte);
        jPanelAvCarolinaNorte.setLayout(jPanelAvCarolinaNorteLayout);
        jPanelAvCarolinaNorteLayout.setHorizontalGroup(
            jPanelAvCarolinaNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAvCarolinaNorteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelAvCarolinaNorteLayout.setVerticalGroup(
            jPanelAvCarolinaNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAvCarolinaNorteLayout.createSequentialGroup()
                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelJuego.add(jPanelAvCarolinaNorte, new org.netbeans.lib.awtextra.AbsoluteConstraints(984, 150, 80, 60));

        jPanelArcaComunal3.setBackground(new java.awt.Color(0, 204, 204));
        jPanelArcaComunal3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 0, 0));
        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/casillas/icons8-cofre-del-tesoro-40.png"))); // NOI18N

        javax.swing.GroupLayout jPanelArcaComunal3Layout = new javax.swing.GroupLayout(jPanelArcaComunal3);
        jPanelArcaComunal3.setLayout(jPanelArcaComunal3Layout);
        jPanelArcaComunal3Layout.setHorizontalGroup(
            jPanelArcaComunal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelArcaComunal3Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelArcaComunal3Layout.setVerticalGroup(
            jPanelArcaComunal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelArcaComunal3Layout.createSequentialGroup()
                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        panelJuego.add(jPanelArcaComunal3, new org.netbeans.lib.awtextra.AbsoluteConstraints(984, 210, 80, 60));

        jPanelAvPensilvania.setBackground(new java.awt.Color(143, 239, 220));
        jPanelAvPensilvania.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel42.setBackground(new java.awt.Color(143, 239, 220));
        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 0, 0));
        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/casillas/icons8-autopista-48.png"))); // NOI18N

        javax.swing.GroupLayout jPanelAvPensilvaniaLayout = new javax.swing.GroupLayout(jPanelAvPensilvania);
        jPanelAvPensilvania.setLayout(jPanelAvPensilvaniaLayout);
        jPanelAvPensilvaniaLayout.setHorizontalGroup(
            jPanelAvPensilvaniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAvPensilvaniaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelAvPensilvaniaLayout.setVerticalGroup(
            jPanelAvPensilvaniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAvPensilvaniaLayout.createSequentialGroup()
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelJuego.add(jPanelAvPensilvania, new org.netbeans.lib.awtextra.AbsoluteConstraints(984, 270, 80, 60));

        jPanelFerroViaRapida.setBackground(new java.awt.Color(0, 204, 204));
        jPanelFerroViaRapida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelFerroViaRapida.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 0, 0));
        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/casillas/icons8-vagón-de-ferrocarril-40.png"))); // NOI18N
        jPanelFerroViaRapida.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 50, 60));

        panelJuego.add(jPanelFerroViaRapida, new org.netbeans.lib.awtextra.AbsoluteConstraints(984, 330, 80, 60));

        jPanelSuerte3.setBackground(new java.awt.Color(0, 204, 204));
        jPanelSuerte3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/casillas/icons8-signo-de-interrogación-60.png"))); // NOI18N

        javax.swing.GroupLayout jPanelSuerte3Layout = new javax.swing.GroupLayout(jPanelSuerte3);
        jPanelSuerte3.setLayout(jPanelSuerte3Layout);
        jPanelSuerte3Layout.setHorizontalGroup(
            jPanelSuerte3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelSuerte3Layout.setVerticalGroup(
            jPanelSuerte3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelJuego.add(jPanelSuerte3, new org.netbeans.lib.awtextra.AbsoluteConstraints(984, 390, 80, 60));

        jPanelPlazaPark.setBackground(new java.awt.Color(51, 102, 255));
        jPanelPlazaPark.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel61.setBackground(new java.awt.Color(51, 102, 255));
        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/casillas/icons8-plaza-de-la-ciudad-40.png"))); // NOI18N

        javax.swing.GroupLayout jPanelPlazaParkLayout = new javax.swing.GroupLayout(jPanelPlazaPark);
        jPanelPlazaPark.setLayout(jPanelPlazaParkLayout);
        jPanelPlazaParkLayout.setHorizontalGroup(
            jPanelPlazaParkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPlazaParkLayout.createSequentialGroup()
                .addGap(0, 18, Short.MAX_VALUE)
                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelPlazaParkLayout.setVerticalGroup(
            jPanelPlazaParkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPlazaParkLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(7, 7, 7))
        );

        panelJuego.add(jPanelPlazaPark, new org.netbeans.lib.awtextra.AbsoluteConstraints(984, 450, 80, 60));

        jPanelImpuestoLujo.setBackground(new java.awt.Color(0, 204, 204));
        jPanelImpuestoLujo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/casillas/anillo.png"))); // NOI18N

        javax.swing.GroupLayout jPanelImpuestoLujoLayout = new javax.swing.GroupLayout(jPanelImpuestoLujo);
        jPanelImpuestoLujo.setLayout(jPanelImpuestoLujoLayout);
        jPanelImpuestoLujoLayout.setHorizontalGroup(
            jPanelImpuestoLujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelImpuestoLujoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelImpuestoLujoLayout.setVerticalGroup(
            jPanelImpuestoLujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelJuego.add(jPanelImpuestoLujo, new org.netbeans.lib.awtextra.AbsoluteConstraints(984, 510, 80, 60));

        jPanelMuelle.setBackground(new java.awt.Color(51, 102, 255));
        jPanelMuelle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel47.setBackground(new java.awt.Color(51, 102, 255));
        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/casillas/pier.png"))); // NOI18N

        javax.swing.GroupLayout jPanelMuelleLayout = new javax.swing.GroupLayout(jPanelMuelle);
        jPanelMuelle.setLayout(jPanelMuelleLayout);
        jPanelMuelleLayout.setHorizontalGroup(
            jPanelMuelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
        );
        jPanelMuelleLayout.setVerticalGroup(
            jPanelMuelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelJuego.add(jPanelMuelle, new org.netbeans.lib.awtextra.AbsoluteConstraints(984, 570, 80, 60));

        jPanelAvConnecticut.setBackground(new java.awt.Color(0, 204, 204));
        jPanelAvConnecticut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 0, 0));
        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/casillas/icons8-autopista-48.png"))); // NOI18N

        javax.swing.GroupLayout jPanelAvConnecticutLayout = new javax.swing.GroupLayout(jPanelAvConnecticut);
        jPanelAvConnecticut.setLayout(jPanelAvConnecticutLayout);
        jPanelAvConnecticutLayout.setHorizontalGroup(
            jPanelAvConnecticutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
            .addGroup(jPanelAvConnecticutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelAvConnecticutLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanelAvConnecticutLayout.setVerticalGroup(
            jPanelAvConnecticutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
            .addGroup(jPanelAvConnecticutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelAvConnecticutLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        panelJuego.add(jPanelAvConnecticut, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 630, -1, 80));

        jPanelAvOriental.setBackground(new java.awt.Color(0, 204, 204));
        jPanelAvOriental.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelAvOriental.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 0, 0));
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/casillas/icons8-autopista-48.png"))); // NOI18N
        jPanelAvOriental.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 80));

        panelJuego.add(jPanelAvOriental, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 630, 62, 80));

        jPanelAvMediterraneo.setBackground(new java.awt.Color(224, 80, 176));
        jPanelAvMediterraneo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelAvMediterraneo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/casillas/icons8-autopista-48.png"))); // NOI18N
        jPanelAvMediterraneo.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 0, -1, 80));

        panelJuego.add(jPanelAvMediterraneo, new org.netbeans.lib.awtextra.AbsoluteConstraints(922, 630, 62, 80));

        jPanelSuerte1.setBackground(new java.awt.Color(0, 204, 204));
        jPanelSuerte1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/casillas/icons8-signo-de-interrogación-60.png"))); // NOI18N

        javax.swing.GroupLayout jPanelSuerte1Layout = new javax.swing.GroupLayout(jPanelSuerte1);
        jPanelSuerte1.setLayout(jPanelSuerte1Layout);
        jPanelSuerte1Layout.setHorizontalGroup(
            jPanelSuerte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelSuerte1Layout.setVerticalGroup(
            jPanelSuerte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
        );

        panelJuego.add(jPanelSuerte1, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 630, -1, -1));

        jPanelAvVermont.setBackground(new java.awt.Color(0, 204, 204));
        jPanelAvVermont.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 0, 0));
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/casillas/icons8-autopista-48.png"))); // NOI18N

        javax.swing.GroupLayout jPanelAvVermontLayout = new javax.swing.GroupLayout(jPanelAvVermont);
        jPanelAvVermont.setLayout(jPanelAvVermontLayout);
        jPanelAvVermontLayout.setHorizontalGroup(
            jPanelAvVermontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(jPanelAvVermontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelAvVermontLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanelAvVermontLayout.setVerticalGroup(
            jPanelAvVermontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
            .addGroup(jPanelAvVermontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelAvVermontLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        panelJuego.add(jPanelAvVermont, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 630, -1, 80));

        jPanelAvBaltica.setBackground(new java.awt.Color(0, 204, 204));
        jPanelAvBaltica.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelAvBaltica.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 0, 0));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/casillas/icons8-autopista-48.png"))); // NOI18N
        jPanelAvBaltica.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 80));

        panelJuego.add(jPanelAvBaltica, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 630, 62, 80));

        jPanelFerroReading.setBackground(new java.awt.Color(0, 204, 204));
        jPanelFerroReading.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelFerroReading.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 0, 0));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/casillas/icons8-vagón-de-ferrocarril-40.png"))); // NOI18N
        jPanelFerroReading.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 80));

        panelJuego.add(jPanelFerroReading, new org.netbeans.lib.awtextra.AbsoluteConstraints(676, 630, 62, 80));

        jPanelArcaComunal1.setBackground(new java.awt.Color(0, 204, 204));
        jPanelArcaComunal1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelArcaComunal1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 0, 0));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/casillas/icons8-cofre-del-tesoro-40.png"))); // NOI18N
        jPanelArcaComunal1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 80));

        panelJuego.add(jPanelArcaComunal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(862, 630, 60, 80));

        jPanelImpuestoIngresos.setBackground(new java.awt.Color(0, 204, 204));
        jPanelImpuestoIngresos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelImpuestoIngresos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 0));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/casillas/icons8-impuesto-40.png"))); // NOI18N
        jPanelImpuestoIngresos.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 80));

        panelJuego.add(jPanelImpuestoIngresos, new org.netbeans.lib.awtextra.AbsoluteConstraints(738, 630, 62, 80));

        jTextFieldDinero1.setEditable(false);
        jTextFieldDinero1.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDinero1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        panelJuego.add(jTextFieldDinero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 80, 30));

        jTextFieldDinero4.setEditable(false);
        jTextFieldDinero4.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDinero4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        panelJuego.add(jTextFieldDinero4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 670, 80, 30));

        jTextFieldDinero2.setEditable(false);
        jTextFieldDinero2.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDinero2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        panelJuego.add(jTextFieldDinero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 580, 80, 30));

        turno4.setEditable(false);
        turno4.setBackground(new java.awt.Color(255, 255, 255));
        panelJuego.add(turno4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 650, 40, 50));

        jTextFieldDinero3.setEditable(false);
        jTextFieldDinero3.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDinero3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        panelJuego.add(jTextFieldDinero3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 670, 80, 30));

        turno1.setEditable(false);
        turno1.setBackground(new java.awt.Color(255, 255, 255));
        panelJuego.add(turno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 560, 40, 50));

        turno2.setEditable(false);
        turno2.setBackground(new java.awt.Color(255, 255, 255));
        panelJuego.add(turno2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 560, 40, 50));

        turno3.setEditable(false);
        turno3.setBackground(new java.awt.Color(255, 255, 255));
        panelJuego.add(turno3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 650, 40, 50));

        jLabelJugador1.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabelJugador1.setForeground(new java.awt.Color(255, 0, 0));
        jLabelJugador1.setText("JUGADOR ");
        jLabelJugador1.setToolTipText("");
        jLabelJugador1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabelJugador1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 5));
        jLabelJugador1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        panelJuego.add(jLabelJugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 150, 70));

        jLabelJugador2.setBackground(new java.awt.Color(255, 204, 0));
        jLabelJugador2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelJugador2.setForeground(new java.awt.Color(255, 204, 0));
        jLabelJugador2.setText("JUGADOR ");
        jLabelJugador2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabelJugador2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 5));
        panelJuego.add(jLabelJugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 550, 150, 70));

        jLabelJugador3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelJugador3.setForeground(new java.awt.Color(102, 204, 0));
        jLabelJugador3.setText("JUGADOR ");
        jLabelJugador3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabelJugador3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 204, 0), 5, true));
        panelJuego.add(jLabelJugador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, 150, 70));

        jLabelJugador4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelJugador4.setForeground(new java.awt.Color(102, 0, 204));
        jLabelJugador4.setText("JUGADOR");
        jLabelJugador4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabelJugador4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 204), 5));
        panelJuego.add(jLabelJugador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 640, 150, 70));

        panelTarjeta.setBackground(new java.awt.Color(242, 249, 249));
        panelTarjeta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("jButton1");
        panelTarjeta.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 419, -1, -1));

        jButton2.setText("jButton2");
        panelTarjeta.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 419, -1, -1));

        jLabel1.setText("Renta");
        panelTarjeta.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 125, -1, -1));

        jLabel2.setText("Renta grupo de Color");
        panelTarjeta.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 156, -1, -1));

        jLabel3.setText("Renta con 1 casa");
        panelTarjeta.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 187, -1, -1));

        jLabel4.setText("Renta con 2 casas");
        panelTarjeta.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 218, -1, -1));

        jLabel5.setText("Renta con 3 casas");
        panelTarjeta.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 249, -1, -1));

        jLabel9.setText("Renta con 4 casas");
        panelTarjeta.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        jLabel10.setText("Renta con 1 hotel ");
        panelTarjeta.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 311, -1, -1));
        panelTarjeta.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 334, 250, 10));

        panelCastillaColor.setBackground(new java.awt.Color(0, 204, 204));

        jLabel55.setText("jLabel33");

        javax.swing.GroupLayout panelCastillaColorLayout = new javax.swing.GroupLayout(panelCastillaColor);
        panelCastillaColor.setLayout(panelCastillaColorLayout);
        panelCastillaColorLayout.setHorizontalGroup(
            panelCastillaColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCastillaColorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelCastillaColorLayout.setVerticalGroup(
            panelCastillaColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCastillaColorLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        panelTarjeta.add(panelCastillaColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 250, -1));

        jLabel11.setText("Costo por casa");
        panelTarjeta.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 353, -1, -1));

        jLabel13.setText("Costo por Hote (con 4 casas)");
        jLabel13.setToolTipText("");
        panelTarjeta.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 384, -1, -1));
        panelTarjeta.add(jTextRenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 122, 91, -1));
        panelTarjeta.add(jTextRentaDosCasas, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 215, 91, -1));
        panelTarjeta.add(jTextRentaUnaCasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 184, 91, -1));
        panelTarjeta.add(jTextRentaGC, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 153, 91, -1));
        panelTarjeta.add(jTextRentaCuatroCasas, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 277, 91, -1));
        panelTarjeta.add(jTextRentaTresCasas, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 246, 91, -1));
        panelTarjeta.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 350, 91, -1));
        panelTarjeta.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 381, 91, -1));
        panelTarjeta.add(jTextRentaConHotel, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 308, 91, -1));

        btnSubastarPropiedad.setText("SUBASTAR PROPIEDAD");
        btnSubastarPropiedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubastarPropiedadActionPerformed(evt);
            }
        });
        panelTarjeta.add(btnSubastarPropiedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 453, 201, -1));

        panelJuego.add(panelTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 20, 270, 570));

        panelJugador.setBackground(new java.awt.Color(242, 249, 249));
        panelJugador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setText("SALIR JUEGO");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        panelJugador.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 250, -1));

        jPanelJugadorColor.setBackground(new java.awt.Color(0, 204, 204));

        jLabelJugadorNombre.setFont(new java.awt.Font("Cooper Black", 1, 24)); // NOI18N
        jLabelJugadorNombre.setText("JUGADOR");

        javax.swing.GroupLayout jPanelJugadorColorLayout = new javax.swing.GroupLayout(jPanelJugadorColor);
        jPanelJugadorColor.setLayout(jPanelJugadorColorLayout);
        jPanelJugadorColorLayout.setHorizontalGroup(
            jPanelJugadorColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJugadorColorLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabelJugadorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanelJugadorColorLayout.setVerticalGroup(
            jPanelJugadorColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJugadorColorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelJugadorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        panelJugador.add(jPanelJugadorColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 250, -1));

        jLabel56.setText("Propiedades");
        panelJugador.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 122, -1, -1));

        jLabel57.setText("Cantidad casas");
        panelJugador.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabel58.setText("Cantidad hoteles");
        panelJugador.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jLabel59.setText("Carta carcel");
        panelJugador.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        jLabel60.setText("Propiedades Hipotecadas ");
        panelJugador.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jTextRentaDosCasas2.setEditable(false);
        panelJugador.add(jTextRentaDosCasas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 110, -1));

        jTextCarcel.setEditable(false);
        panelJugador.add(jTextCarcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 110, -1));

        jTextRentaTresCasas2.setEditable(false);
        panelJugador.add(jTextRentaTresCasas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 110, -1));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        panelJugador.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 250, 70));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        panelJugador.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 250, 70));

        btnVenderCartaCarcel.setText("VENDER CARTA \"SALIR CARCEL\"");
        btnVenderCartaCarcel.setEnabled(false);
        btnVenderCartaCarcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderCartaCarcelActionPerformed(evt);
            }
        });
        panelJugador.add(btnVenderCartaCarcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 250, -1));

        jButton8.setText("ENTREGAR ADQUISIONES");
        jButton8.setEnabled(false);
        panelJugador.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 250, -1));

        panelJuego.add(panelJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 270, 530));

        getContentPane().add(panelJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1410, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void XMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XMouseClicked
        System.exit(0);
    }//GEN-LAST:event_XMouseClicked


    private void btntirarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntirarDadosActionPerformed

        btnVenderCartaCarcel.setEnabled(false);
        if (this.doble == null) {
            memo = (ClassJugador) jugadores.desencolar();
            jugadores.encolar(memo);
        } else {
            memo = this.doble;
        }

        this.seleccion--;
        if (seleccion >= 0) {
            memo.tirarDado();
            if (seleccion == 0) {
                jugadores = Util.Util.ordenarCola(jugadores);
            }
        } else {

            memo.avanzar(casillas, memo.tirarDado());
            ValidarCasilla();
            actulizarCamposJugador();
            activarBotonVenderCarta();
             
            

        }

    }//GEN-LAST:event_btntirarDadosActionPerformed

    public void ValidarCasilla() {

        if (memo.getPosicion() == 8 || memo.getPosicion() == 23 || memo.getPosicion() == 37) {
            btnSuerte.setEnabled(true);
        }

        if (memo.getPosicion() == 3 || memo.getPosicion() == 18 || memo.getPosicion() == 34) {
            btnArcaComunal.setEnabled(true);
        }

        if (memo.getPosicion() == 5) {
            memo.setPuntos(memo.getPuntos()-200);
            actualizarDinero(); 
        }

        if (memo.getPosicion() == 39) {

            memo.setPuntos(memo.getPuntos()-100);
            actualizarDinero();  
        }
        
        if (memo.getPosicion()==31){
            memo.avanzarPosicion(casillas, 11);
        }
    }

    public static void actualizarDinero() {

        jTextFieldDinero1.setText(String.valueOf(jugador1.getPuntos()));
        jTextFieldDinero2.setText(String.valueOf(jugador2.getPuntos()));
        jTextFieldDinero3.setText(String.valueOf(jugador3.getPuntos()));
        jTextFieldDinero4.setText(String.valueOf(jugador4.getPuntos()));

        
    }

    public void actulizarCamposJugador(){
        jTextCarcel.setText(String.valueOf(memo.getCartaCarcel()));
        jPanelJugadorColor.setBackground(memo.getColor());
    }
    
    public void actualizarCamposTarjetaCasilla(){
        
    }
    
    public void activarBotonVenderCarta(){
        if(memo.getCartaCarcel()>0){
            btnVenderCartaCarcel.setEnabled(true);
        }
    }
    
    

    private void btnrevovlerDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrevovlerDadosActionPerformed
        ClassDados insertGif = new ClassDados();
        resultadoDado1.setIcon(insertGif.gifDado1());
        resultadoDado2.setIcon(insertGif.gifDado2());
    }//GEN-LAST:event_btnrevovlerDadosActionPerformed

    private void btnSuerteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuerteActionPerformed
      // btnSuerte.setEnabled(false);
        
        ClassTarjeta memo1 = (ClassTarjeta) Suerte.retirarEl();
        JOptionPane.showMessageDialog(null, memo1.getNombre());

        if(!memo1.getNombre().equals("SALGA DE LA CÁRCEL GRATIS")){
            auxSuerte.apilar(memo1);
        }
        
        else{
            memoCarcel = memoTarjeta;
        }
        
        if (Suerte.esVacia()) {
            for (Object i = auxSuerte.retirarEl(); i != null; i = auxSuerte.retirarEl()) {
                Suerte.apilar(i);
            }
            auxSuerte = new Pila();
        }
        
         switch(memo1.getNombre()){
            case "Avance a EL MUELLE":
                memo.avanzarPosicion(casillas, 40);
            break;
            
            case "Por cumplimiento en pago del préstamo de construcción cobre $150":
                ClassTarjeta.cumplimientoPrestamo(memo);
            break;
            
            case "SALGA DE LA CÁRCEL GRATIS":
                memo.setCartaCarcel(1);
                actulizarCamposJugador();
            break;
            
            case "Avance a la SALIDA":
                
                memo.avanzarPosicion(casillas, 1);
            break;
            
            case "Pague multa por exceso de velocidad $15":
                ClassTarjeta.multaVelocidad(memo);
            break;
        }
         activarBotonVenderCarta();
                 
         
    }//GEN-LAST:event_btnSuerteActionPerformed


    private void btnArcaComunalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArcaComunalActionPerformed

        btnArcaComunal.setEnabled(false);
        ClassTarjeta memo1 = (ClassTarjeta) Comunal.retirarEl();
        JOptionPane.showMessageDialog(null, memo1.getNombre());

        auxComunal.apilar(memo1);
        if (Comunal.esVacia()) {
            for (Object i = auxComunal.retirarEl(); i != null; i = auxComunal.retirarEl()) {
                Comunal.apilar(i);
            }
            auxComunal = new Pila();
        }
        
        switch(memo1.getNombre()){
            case "Honorarios médicos, pague $50":
                ClassTarjeta.honorariosMedicos(memo);
            break;
            
            case "Vencimiento de fondo vacacional, reciba $100":
                ClassTarjeta.vencimientoVacacional(memo);
            break;
            
            case "Pague colegiaturas por $70":
                ClassTarjeta.colegiatura(memo);
            break;
            
            case "Pague cuenta de hospital por $100":
                ClassTarjeta.cuentaHospital(memo);
            break;
            
            case "Ganó el segundo lugar en un concurso de belleza, cobre $10":
                ClassTarjeta.concurso(memo);
            break;
        }
    }//GEN-LAST:event_btnArcaComunalActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnVenderCartaCarcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderCartaCarcelActionPerformed
        ClassJugador ganador=null;
        ClassJugador dueñoCarta=null;
        for(int j=0; j<Integer.parseInt(formInicio.message); j++){
               
               ClassJugador jugadorCarcel = (ClassJugador) jugadores.desencolar();
                  if(jugadorCarcel.getCartaCarcel()==0){
                        jugadorCarcel.setOferta(Integer.parseInt(JOptionPane.showInputDialog
                        (null,"¿Valor en que desea comprar la carta 'SALIR DE LA CARCEL'? (Si no la desea comprar digite 0)"
                                +jugadorCarcel.getNombre())));
                        
                        
                        if(ganador==null){
                            ganador = jugadorCarcel;
                        }
                        else{
                            if(ganador.getOferta()<jugadorCarcel.getOferta()){
                                ganador = jugadorCarcel;
                            }
                         }
                    }
                  else{
                      dueñoCarta = jugadorCarcel;
                  }
                    jugadores.encolar(jugadorCarcel);
            }  
        
        dueñoCarta.setCartaCarcel(0);
        dueñoCarta.setPuntos(ganador.getOferta()+dueñoCarta.getPuntos());
        
        ganador.setCartaCarcel(1);
        ganador.setPuntos(ganador.getPuntos()-ganador.getOferta());
        actulizarCamposJugador();
        actualizarDinero();
        btnVenderCartaCarcel.setEnabled(false);
                
    }//GEN-LAST:event_btnVenderCartaCarcelActionPerformed

    private void btnSubastarPropiedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubastarPropiedadActionPerformed
       ClassJugador ganador=null;
     
        for(int i=0; i<Integer.parseInt(formInicio.message); i++){
               
               ClassJugador jugadorSubasta = (ClassJugador) jugadores.desencolar();
                  
                        jugadorSubasta.setOferta(Integer.parseInt(JOptionPane.showInputDialog
                        (null,"¿Valor en que desea comprar la propiedad? (Si no la desea comprar digite 0)"
                                +jugadorSubasta.getNombre())));
                                                
                        if(ganador==null){
                            ganador = jugadorSubasta;
                        }
                        else{
                            if(ganador.getOferta()<jugadorSubasta.getOferta()){
                                ganador = jugadorSubasta;
                            }
                         }
                    
                  
                    jugadores.encolar(jugadorSubasta);
            }  
        
        ganador.setPuntos(ganador.getPuntos()-ganador.getOferta());
        actualizarDinero();
        btnSubastarPropiedad.setEnabled(false);
    }//GEN-LAST:event_btnSubastarPropiedadActionPerformed

    public void asignarCarta() {
        Comunal.apilar(comunal1);
        Comunal.apilar(comunal2);
        Comunal.apilar(comunal3);
        Comunal.apilar(comunal4);
        Comunal.apilar(comunal5);

        Suerte.apilar(suerte1);
        Suerte.apilar(suerte2);
        Suerte.apilar(suerte3);
        Suerte.apilar(suerte4);
        Suerte.apilar(suerte5);

    }

    public void asignar() {
        casillas.add(jPanelGo);
        casillas.add(jPanelAvMediterraneo);
        casillas.add(jPanelArcaComunal1);
        casillas.add(jPanelAvBaltica);
        casillas.add(jPanelImpuestoIngresos);
        casillas.add(jPanelFerroReading);
        casillas.add(jPanelAvOriental);
        casillas.add(jPanelSuerte1);
        casillas.add(jPanelAvVermont);
        casillas.add(jPanelAvConnecticut);
        casillas.add(jPanelCarcel);
        casillas.add(jPanelPlazaSanCarlos);
        casillas.add(jPanelElectricidad);
        casillas.add(jPanelAvStatus);
        casillas.add(jPanelAvVirginia);
        casillas.add(jPanelFerroPensilvania);
        casillas.add(jPanelPlazaJames);
        casillas.add(jPanelArcaComunal2);
        casillas.add(jPanelAvTennesse);
        casillas.add(jPanelAvNewYork);
        casillas.add(jPanelDescanso);
        casillas.add(jPanelAvKentucky);
        casillas.add(jPanelSuerte2);
        casillas.add(jPanelAvIndiana);
        casillas.add(jPanelAvIllinois);
        casillas.add(jPanelFerroByO);
        casillas.add(jPanelAvAtlantico);
        casillas.add(jPanelAvVentnor);
        casillas.add(jPanelAgua);
        casillas.add(jPanelJardinesMarvin);
        casillas.add(jPanelIrACarcel);
        casillas.add(jPanelAvPacifico);
        casillas.add(jPanelAvCarolinaNorte);
        casillas.add(jPanelArcaComunal3);
        casillas.add(jPanelAvPensilvania);
        casillas.add(jPanelFerroViaRapida);
        casillas.add(jPanelSuerte3);
        casillas.add(jPanelPlazaPark);
        casillas.add(jPanelImpuestoLujo);
        casillas.add(jPanelMuelle);
        switch (formInicio.message) {

            case "2":
                jugadores.encolar(jugador1);
                jugadores.encolar(jugador2);
                break;

            case "3":

                jugadores.encolar(jugador1);
                jugadores.encolar(jugador2);
                jugadores.encolar(jugador3);
                break;

            case "4":
                jugadores.encolar(jugador1);
                jugadores.encolar(jugador2);
                jugadores.encolar(jugador3);
                jugadores.encolar(jugador4);
                break;

        }
        jTextFieldDinero1.setText(String.valueOf(jugador1.getPuntos()));
        jTextFieldDinero2.setText(String.valueOf(jugador2.getPuntos()));
        jTextFieldDinero3.setText(String.valueOf(jugador3.getPuntos()));
        jTextFieldDinero4.setText(String.valueOf(jugador4.getPuntos()));
    }
    public static Lista getCasillas() {
        return casillas;
    }

    public static void setCasillas(Lista casillas) {
        formJuego.casillas = casillas;
    }

    public static int getSeleccion() {
        return seleccion;
    }

    public static void setSeleccion(int seleccion) {
        formJuego.seleccion = seleccion;
    }

    public static ClassJugador getDoble() {
        return doble;
    }

    public static void setDoble(ClassJugador doble) {
        formJuego.doble = doble;
    }

    public Pila getComunal() {
        return Comunal;
    }

    public void setComunal(Pila Comunal) {
        this.Comunal = Comunal;
    }

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
            java.util.logging.Logger.getLogger(formJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formJuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel X;
    private javax.swing.JButton btnArcaComunal;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSubastarPropiedad;
    private javax.swing.JButton btnSuerte;
    private javax.swing.JButton btnVenderCartaCarcel;
    private javax.swing.JButton btnrevovlerDados;
    private javax.swing.JButton btntirarDados;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JLabel jLabel25;
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
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JLabel jLabelJugador1;
    private javax.swing.JLabel jLabelJugador2;
    public static javax.swing.JLabel jLabelJugador3;
    protected static javax.swing.JLabel jLabelJugador4;
    private javax.swing.JLabel jLabelJugadorNombre;
    private javax.swing.JPanel jPanelAgua;
    private javax.swing.JPanel jPanelArcaComunal1;
    private javax.swing.JPanel jPanelArcaComunal2;
    private javax.swing.JPanel jPanelArcaComunal3;
    private javax.swing.JPanel jPanelAvAtlantico;
    private javax.swing.JPanel jPanelAvBaltica;
    private javax.swing.JPanel jPanelAvCarolinaNorte;
    private javax.swing.JPanel jPanelAvConnecticut;
    private javax.swing.JPanel jPanelAvIllinois;
    private javax.swing.JPanel jPanelAvIndiana;
    private javax.swing.JPanel jPanelAvKentucky;
    private javax.swing.JPanel jPanelAvMediterraneo;
    private javax.swing.JPanel jPanelAvNewYork;
    private javax.swing.JPanel jPanelAvOriental;
    private javax.swing.JPanel jPanelAvPacifico;
    private javax.swing.JPanel jPanelAvPensilvania;
    private javax.swing.JPanel jPanelAvStatus;
    private javax.swing.JPanel jPanelAvTennesse;
    private javax.swing.JPanel jPanelAvVentnor;
    private javax.swing.JPanel jPanelAvVermont;
    private javax.swing.JPanel jPanelAvVirginia;
    private javax.swing.JPanel jPanelBase;
    private javax.swing.JPanel jPanelCarcel;
    private javax.swing.JPanel jPanelDescanso;
    private javax.swing.JPanel jPanelElectricidad;
    private javax.swing.JPanel jPanelFerroByO;
    private javax.swing.JPanel jPanelFerroPensilvania;
    private javax.swing.JPanel jPanelFerroReading;
    private javax.swing.JPanel jPanelFerroViaRapida;
    private javax.swing.JPanel jPanelGo;
    private javax.swing.JPanel jPanelImpuestoIngresos;
    private javax.swing.JPanel jPanelImpuestoLujo;
    private javax.swing.JPanel jPanelIrACarcel;
    private javax.swing.JPanel jPanelJardinesMarvin;
    private javax.swing.JPanel jPanelJugadorColor;
    private javax.swing.JPanel jPanelMuelle;
    private javax.swing.JPanel jPanelPlazaJames;
    private javax.swing.JPanel jPanelPlazaPark;
    private javax.swing.JPanel jPanelPlazaSanCarlos;
    private javax.swing.JPanel jPanelSuerte1;
    private javax.swing.JPanel jPanelSuerte2;
    private javax.swing.JPanel jPanelSuerte3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    public static javax.swing.JTextField jTextCarcel;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    public static javax.swing.JTextField jTextFieldDinero1;
    public static javax.swing.JTextField jTextFieldDinero2;
    public static javax.swing.JTextField jTextFieldDinero3;
    public static javax.swing.JTextField jTextFieldDinero4;
    private javax.swing.JTextField jTextRenta;
    private javax.swing.JTextField jTextRentaConHotel;
    private javax.swing.JTextField jTextRentaCuatroCasas;
    private javax.swing.JTextField jTextRentaDosCasas;
    private javax.swing.JTextField jTextRentaDosCasas2;
    private javax.swing.JTextField jTextRentaGC;
    private javax.swing.JTextField jTextRentaTresCasas;
    private javax.swing.JTextField jTextRentaTresCasas2;
    private javax.swing.JTextField jTextRentaUnaCasa;
    private javax.swing.JPanel panelCastillaColor;
    private javax.swing.JPanel panelJuego;
    private javax.swing.JPanel panelJugador;
    private javax.swing.JPanel panelTarjeta;
    public static javax.swing.JLabel resultadoDado1;
    public static javax.swing.JLabel resultadoDado2;
    public static javax.swing.JTextField turno1;
    public static javax.swing.JTextField turno2;
    public static javax.swing.JTextField turno3;
    public static javax.swing.JTextField turno4;
    // End of variables declaration//GEN-END:variables
}
