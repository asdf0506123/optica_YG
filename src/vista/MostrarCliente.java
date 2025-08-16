package vista;
import controlador.Cliente;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import modelo.Conexion;
import java.sql.ResultSet;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Usuario
 */
public class MostrarCliente extends javax.swing.JFrame {

    /**
     * Creates new form MostrarCliente
     */
    public MostrarCliente() {
        initComponents();
        llenarTablaCliente();
        //this.setLocationRelativeTo(this);
        SetImageLabel(jLabel20, "./src/img/lupa.png");
        setIconImage(getIconImage());
        jTable1.setDefaultEditor(Object.class, null);
    }
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/logogo2.png"));
        return  retValue;
    }
    
    public void llenarTablaCliente(){
        try {
            Conexion optica = new Conexion();
            ResultSet resultado = optica.obtenerTodoCliente();
            
            String columnas[] = {"idcliente","nombreCompleto","calle","numero","ciudad","referencia","contacto","rfc"};
            DefaultTableModel tablaCliente = new DefaultTableModel(columnas, 0);
            
            while(resultado.next()){
                String fila[] = {resultado.getString("idcliente"),
                resultado.getString("nombreCompleto"),
                resultado.getString("calle"),
                resultado.getString("numero"),
                resultado.getString("ciudad"),
                resultado.getString("referencia"),
                resultado.getString("contacto"),
                resultado.getString("rfc")};
                tablaCliente.addRow(fila);
                
            }
            jTable1.setModel(tablaCliente);
            resultado.close();
            optica.cerrarOptica();
        } catch (Exception e) {
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setIconImages(null);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setGridColor(new java.awt.Color(105, 75, 130));
        jTable1.setSelectionBackground(new java.awt.Color(85, 65, 118));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 490, 130));

        jPanel2.setBackground(new java.awt.Color(54, 33, 89));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Óptica YG®");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/blancpng.png"))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(85, 65, 118));
        jPanel3.setPreferredSize(new java.awt.Dimension(164, 60));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agregar Cliente");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(63, 43, 100));
        jPanel4.setPreferredSize(new java.awt.Dimension(161, 60));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Eliminar Cliente");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(85, 65, 118));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Modificar Cliente");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(84, 84, 84))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 450));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel6.setText("ID de cliente:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, -1, -1));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel8.setText("Busqueda por nombre:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel9.setText("INFORMACION PERSONAL");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, -1, -1));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel10.setText("Calle:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, -1, -1));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel11.setText("Número:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, -1, -1));

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel12.setText("Ciudad:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, -1, -1));

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel13.setText("Referencia:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel14.setText("DIRECCIÓN");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, -1, -1));

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel15.setText("Contacto:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, -1, -1));

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel16.setText("RFC:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, -1, -1));

        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 300, -1));

        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 80, -1));

        jTextField4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 80, -1));

        jTextField5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 150, -1));

        jTextField6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 400, -1));

        jTextField7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 130, -1));

        jTextField8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 130, -1));

        jTextField10.setEditable(false);
        jTextField10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 90, -1));

        jPanel7.setBackground(new java.awt.Color(85, 65, 118));
        jPanel7.setPreferredSize(new java.awt.Dimension(164, 60));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Cerrar");
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel19MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel19MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 400, 80, 30));

        jPanel8.setBackground(new java.awt.Color(85, 65, 118));
        jPanel8.setPreferredSize(new java.awt.Dimension(164, 60));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Limpiar");
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel18MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel18MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, 80, 30));

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel17.setText("Nombre Completo:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, -1, -1));

        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 190, -1));

        jLabel20.setText("jLabel20");
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 20, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 747, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        // TODO add your handling code here:
        jPanel3.setBackground(new Color(110,90,160));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        // TODO add your handling code here:
        jPanel3.setBackground(new Color(85,65,118));
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        // TODO add your handling code here:
        jPanel4.setBackground(new Color(110,90,160));
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        // TODO add your handling code here:
        jPanel4.setBackground(new Color(63,43,100));
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        // TODO add your handling code here:
        jPanel5.setBackground(new Color(110,90,160));
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        // TODO add your handling code here:
        jPanel5.setBackground(new Color(85,65,118));
    }//GEN-LAST:event_jLabel3MouseExited

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        if (jTextField2.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Por favor ingrese los datos del cliente");
        }
        Cliente x = new Cliente();
        x.nombreCompleto = jTextField2.getText();
        x.calle = jTextField3.getText();
        x.numero = Integer.parseInt(jTextField4.getText());
        x.ciudad = jTextField5.getText();
        x.referencia = jTextField6.getText();
        x.contacto = jTextField7.getText();
        x.rfc = jTextField8.getText();

        Conexion optica = new Conexion();
        optica.agregarCliente(x);
        llenarTablaCliente();

        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField1.requestFocusInWindow();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        // TODO add your handling code here:
        jTextField10.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField10.requestFocusInWindow();
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseEntered
        // TODO add your handling code here:
        jPanel8.setBackground(new Color(110,90,160));
    }//GEN-LAST:event_jLabel18MouseEntered

    private void jLabel18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseExited
        // TODO add your handling code here:
        jPanel8.setBackground(new Color(63,43,100));
        
    }//GEN-LAST:event_jLabel18MouseExited

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        // TODO add your handling code here:
        Menu v1 = new Menu();
        v1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseEntered
        // TODO add your handling code here:
        jPanel7.setBackground(new Color(110,90,160));
    }//GEN-LAST:event_jLabel19MouseEntered

    private void jLabel19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseExited
        // TODO add your handling code here:
        jPanel7.setBackground(new Color(63,43,100));
    }//GEN-LAST:event_jLabel19MouseExited

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        if (jTextField2.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Seleccione un cliente a eliminar");
        }
        try {
        Conexion optica = new Conexion();
        int idcliente = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
        optica.eliminarCliente(idcliente);
        llenarTablaCliente();
        
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField10.setText("");
        jTextField2.requestFocusInWindow();
        } catch (Exception e){
        
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        if (jTextField2.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Seleccione un cliente a modificar");
        }
        else {
        Cliente x = new Cliente();
        x.idcliente = Integer.parseInt(jTextField10.getText());
        x.nombreCompleto = jTextField2.getText();
        x.calle = jTextField3.getText();
        x.numero = Integer.parseInt(jTextField4.getText());
        x.ciudad = jTextField5.getText();
        x.referencia = jTextField6.getText();
        x.contacto = jTextField7.getText();
        x.rfc = jTextField8.getText();
        
        Conexion optica = new Conexion();
        optica.modificarCliente(x);
        llenarTablaCliente();
        
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField10.setText("");
        jTextField2.requestFocusInWindow();
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        jTextField2.setText(jTable1.getValueAt(jTable1.getSelectedRow(),1).toString());
        jTextField3.setText(jTable1.getValueAt(jTable1.getSelectedRow(),2).toString());
        jTextField4.setText(jTable1.getValueAt(jTable1.getSelectedRow(),3).toString());
        jTextField5.setText(jTable1.getValueAt(jTable1.getSelectedRow(),4).toString());
        jTextField6.setText(jTable1.getValueAt(jTable1.getSelectedRow(),5).toString());
        jTextField7.setText(jTable1.getValueAt(jTable1.getSelectedRow(),6).toString());
        jTextField8.setText(jTable1.getValueAt(jTable1.getSelectedRow(),7).toString());
        jTextField10.setText(jTable1.getValueAt(jTable1.getSelectedRow(),0).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        // TODO add your handling code here:
        try {
            String nombreCliente = jTextField1.getText();
            Conexion optica = new Conexion();
            ResultSet resultado = optica.buscarClienteNombre(nombreCliente);
            
            String columnas[] = {"idcliente","nombreCompleto","calle","numero","ciudad","referencia","contacto","rfc"};
            DefaultTableModel tablaCliente = new DefaultTableModel(columnas, 0);
            
            while(resultado.next()){
                String fila[] = {resultado.getString("idcliente"),
                resultado.getString("nombreCompleto"),
                resultado.getString("calle"),
                resultado.getString("numero"),
                resultado.getString("ciudad"),
                resultado.getString("referencia"),
                resultado.getString("contacto"),
                resultado.getString("rfc")};
                tablaCliente.addRow(fila);
         
            }
            jTable1.setModel(tablaCliente);
            resultado.close();
            optica.cerrarOptica();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
        if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE){
            llenarTablaCliente();
        }
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            try {
            String nombreCliente = jTextField1.getText();
            Conexion optica = new Conexion();
            ResultSet resultado = optica.buscarClienteNombre(nombreCliente);
            
            String columnas[] = {"idcliente","nombreCompleto","calle","numero","ciudad","referencia","contacto","rfc"};
            DefaultTableModel tablaCliente = new DefaultTableModel(columnas, 0);
            
            while(resultado.next()){
                String fila[] = {resultado.getString("idcliente"),
                resultado.getString("nombreCompleto"),
                resultado.getString("calle"),
                resultado.getString("numero"),
                resultado.getString("ciudad"),
                resultado.getString("referencia"),
                resultado.getString("contacto"),
                resultado.getString("rfc")};
                tablaCliente.addRow(fila);
         
            }
            jTable1.setModel(tablaCliente);
            resultado.close();
            optica.cerrarOptica();
        } catch (Exception e) {
        }
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE){
            llenarTablaCliente();
        }
            try {
            String nombreCliente = jTextField1.getText();
            Conexion optica = new Conexion();
            ResultSet resultado = optica.buscarClienteNombre(nombreCliente);
            
            String columnas[] = {"idcliente","nombreCompleto","calle","numero","ciudad","referencia","contacto","rfc"};
            DefaultTableModel tablaCliente = new DefaultTableModel(columnas, 0);
            
            while(resultado.next()){
                String fila[] = {resultado.getString("idcliente"),
                resultado.getString("nombreCompleto"),
                resultado.getString("calle"),
                resultado.getString("numero"),
                resultado.getString("ciudad"),
                resultado.getString("referencia"),
                resultado.getString("contacto"),
                resultado.getString("rfc")};
                tablaCliente.addRow(fila);
         
            }
            jTable1.setModel(tablaCliente);
            resultado.close();
            optica.cerrarOptica();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jTextField1KeyReleased

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
            java.util.logging.Logger.getLogger(MostrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MostrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MostrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MostrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MostrarCliente().setVisible(true);
            }
        });
    }

    private void SetImageLabel (JLabel labelName, String root) {
	ImageIcon image = new ImageIcon(root);
	Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
	labelName.setIcon(icon);
	this.repaint();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
