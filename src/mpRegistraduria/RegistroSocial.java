package mpRegistraduria;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import mnRegistraduria.EncriptacionSocial;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import mdRegistraduria.ConexionRegistroSocial;


public class RegistroSocial extends javax.swing.JFrame {
       

    PreparedStatement ps;
    PreparedStatement ps1;
    ResultSet rs;



    private void cajasLimpias(){
        txtclave.setText(null);
        txtnombre.setText(null);
        txtapellido.setText(null);
        txtdireccion.setText(null);
        txttelefono.setText(null);
        txtcorreo.setText(null);
        txtfecha_nacimiento.setText(null);
        cbxgenero.setSelectedIndex(0);
        txtcedula.setText(null);
        txtedad.setText(null);
        txtlugar_nacimiento.setText(null);
        txtenfermedades.setText(null);
    }
    
    

    public RegistroSocial() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        txtid.setVisible(false);
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtapellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtedad = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtenfermedades = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtlugar_nacimiento = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cbxgenero = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtfecha_nacimiento = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtclave = new javax.swing.JTextField();
        btnguardar = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtid = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 51));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("NOMBRE:");

        jLabel10.setText("APELLIDOS:");

        jLabel5.setText("CORREO:");

        txtcorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcorreoActionPerformed(evt);
            }
        });

        jLabel4.setText("TELEFONO:");

        jLabel3.setText("DIRECCION:");

        jLabel11.setText("CEDULA:");

        txtcedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcedulaActionPerformed(evt);
            }
        });

        jLabel12.setText("EDAD:");

        txtedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtedadActionPerformed(evt);
            }
        });

        jLabel14.setText("ENFERMEDADES:");

        jLabel13.setText("LUGAR DE NACIMIENTO:");

        txtlugar_nacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlugar_nacimientoActionPerformed(evt);
            }
        });

        jLabel7.setText("GENERO:");

        cbxgenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Iseleccione", "masculino", "femenino" }));

        jLabel6.setText("FECHA DE NACIMIENTO");

        jLabel1.setText("IDENTIFICADOR:");

        btnguardar.setBackground(new java.awt.Color(102, 102, 102));
        btnguardar.setText("GUARDAR");
        btnguardar.setBorder(new javax.swing.border.MatteBorder(null));
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btnactualizar.setBackground(new java.awt.Color(102, 102, 102));
        btnactualizar.setText("ACTUALIZAR");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });

        btneliminar.setBackground(new java.awt.Color(102, 102, 102));
        btneliminar.setText("ELIMINAR");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnbuscar.setBackground(new java.awt.Color(102, 102, 102));
        btnbuscar.setText("BUSCAR");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Goudy Old Style", 2, 24)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Registraduria social");

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setText("INICIO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setText("GENERAR PDF");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtid.setEnabled(false);

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("SALIR");
        jButton3.setBorder(new javax.swing.border.MatteBorder(null));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel10))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(1, 1, 1)
                                            .addComponent(jLabel5)
                                            .addGap(13, 13, 13)))
                                    .addComponent(jLabel11)))
                            .addComponent(jLabel1))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtclave, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(227, 227, 227)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel12)
                            .addComponent(jLabel3)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtlugar_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfecha_nacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                            .addComponent(cbxgenero, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtenfermedades))
                        .addGap(0, 130, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator1))
                        .addGap(41, 41, 41))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnactualizar))
                        .addGap(94, 94, 94)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btneliminar))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(370, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel15)
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtfecha_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtclave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtlugar_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxgenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtenfermedades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnbuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jLabel8)
                .addGap(105, 105, 105)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        ConexionRegistroSocial conexion = new ConexionRegistroSocial();
        Connection con = null;
        
        try {
            con = ConexionRegistroSocial.getConection();
            ps = con.prepareStatement("SELECT * FROM datos_registro_personas WHERE clave = ?");
            ps.setString(1, txtclave.getText());
            rs = ps.executeQuery(); // con este metodo traigo todos los datos de la base de datos

            if (rs.next()){
                txtid.setText(rs.getString("clave"));
                txtnombre.setText(rs.getString("nombre"));
                txtapellido.setText(rs.getString("apellidos"));
                txtedad.setText(rs.getString("edad"));
                txtdireccion.setText(rs.getString("direccion"));
                txttelefono.setText(rs.getString("telefono"));
                txtcorreo.setText(rs.getString("correo"));
                txtfecha_nacimiento.setText(rs.getString("fechaNacimiento"));
                cbxgenero.setSelectedItem(rs.getString("genero"));
                txtcedula.setText(rs.getString("cedula"));
                txtlugar_nacimiento.setText(rs.getString("lugarNacimiento"));
                txtenfermedades.setText(rs.getString("enfermedades"));
            } else {
                JOptionPane.showMessageDialog(null, "no hay datos con esa clave");
            }
        } catch (HeadlessException | SQLException e) {
            System.out.println("error" + e);
        }
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        Connection con1 = null;
        try {
            con1 =ConexionRegistroSocial.getConection();
            ps = con1.prepareStatement(" DELETE FROM datos_registro_personas WHERE clave=?");
            ps.setInt(1, Integer.parseInt(txtid.getText()));

            int rs = ps.executeUpdate();
            if (rs > 0 ) {
                JOptionPane.showMessageDialog(null, "persona eliminada");
                cajasLimpias();
            } else {
                JOptionPane.showMessageDialog(null, "error al eliminar");
                cajasLimpias();
            }
            con1.close();
        } catch (HeadlessException | NumberFormatException | SQLException e) {
            System.out.println("error" + e);
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        Connection con = null;
        try {
            con =  ConexionRegistroSocial.getConection();
            ps = con.prepareStatement(" UPDATE datos_registro_personas SET clave=?, nombre=?, apellidos=?, edad=?, direccion=?, telefono=?, correo=?, fechaNacimiento=?, genero=?, cedula=?, lugarNacimiento=?, enfermedades=? WHERE clave=?");
            ps.setString(1, txtclave.getText());
            ps.setString(2, txtnombre.getText());
            ps.setString(3, txtapellido.getText());
            ps.setString(4, txtedad.getText());
            ps.setString(5, txtdireccion.getText());
            ps.setString(6, txttelefono.getText());
            ps.setString(7, txtcorreo.getText());
            ps.setString(8, txtfecha_nacimiento.getText());
            ps.setString(9, cbxgenero.getSelectedItem().toString());
            ps.setString(10, txtcedula.getText());
            ps.setString(11, txtlugar_nacimiento.getText());
            ps.setString(12, txtenfermedades.getText());
            ps.setString(13, txtid.getText());   // esta parte es el campo de ingreso del id

            int rs = ps.executeUpdate();
            if (rs > 0) {
                JOptionPane.showMessageDialog(null, "persona modificada");
                cajasLimpias();
            } else {
                JOptionPane.showMessageDialog(null, "error la modificar");
                cajasLimpias();
            }
            con.close();
        } catch (HeadlessException | SQLException e) {
            System.out.println("error" + e);
        }

    }//GEN-LAST:event_btnactualizarActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        Connection con = null;
        EncriptacionSocial encriptando1 = new EncriptacionSocial();

        try {
            con =  ConexionRegistroSocial.getConection();
            ps = con.prepareStatement("INSERT INTO datos_registro_personas (clave,nombre,apellidos,edad,direccion,telefono,correo,fechaNacimiento,genero,cedula,lugarNacimiento,enfermedades) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, txtclave.getText());
            ps.setString(2, encriptando1.encriptacion(txtnombre.getText()));
            ps.setString(3, encriptando1.encriptacion(txtapellido.getText()));
            ps.setString(4, encriptando1.encriptacion(txtedad.getText()));
            ps.setString(5, encriptando1.encriptacion(txtdireccion.getText()));
            ps.setString(6, encriptando1.encriptacion(txttelefono.getText()));
            ps.setString(7, encriptando1.encriptacion(txtedad.getText()));
            ps.setString(8, encriptando1.encriptacion( txtfecha_nacimiento.getText()));
            ps.setString(9, cbxgenero.getSelectedItem().toString());
            ps.setString(10, encriptando1.encriptacion(txtcedula.getText()));
            ps.setString(11, encriptando1.encriptacion(txtlugar_nacimiento.getText()));
            ps.setString(12, encriptando1.encriptacion(txtenfermedades.getText()));

            ps1 = con.prepareStatement("INSERT INTO datos1 (clave,nombre,apellidos,edad,direccion,telefono,correo,fechaNacimiento,genero,cedula,lugarNacimiento,enfermedades) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");
            ps1.setString(1, txtclave.getText());
            ps1.setString(2, txtnombre.getText());
            ps1.setString(3, txtapellido.getText());
            ps1.setString(4, txtedad.getText());
            ps1.setString(5, txtdireccion.getText());
            ps1.setString(6, txttelefono.getText());
            ps1.setString(7, txtedad.getText());
            ps1.setString(8, txtfecha_nacimiento.getText());
            ps1.setString(9, cbxgenero.getSelectedItem().toString());
            ps1.setString(10, txtcedula.getText());
            ps1.setString(11, txtlugar_nacimiento.getText());
            ps1.setString(12, txtenfermedades.getText());

            
            int rs = ps.executeUpdate();
            int rs1 = ps1.executeUpdate();
            
            if (rs > 0 && rs1 > 0) {
                JOptionPane.showMessageDialog(null, "registro guardado");
                cajasLimpias();
            } else {
                JOptionPane.showMessageDialog(null, "error al registrar");
                cajasLimpias();
            }
            con.close();

        } catch (HeadlessException | SQLException e) {
            System.out.println("error" + e);
        }



    }//GEN-LAST:event_btnguardarActionPerformed

    private void txtlugar_nacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlugar_nacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlugar_nacimientoActionPerformed

    private void txtedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtedadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtedadActionPerformed

    private void txtcedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcedulaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Presentacion inicio = new Presentacion();
        inicio.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Document documento = new Document();
        Document documento1 = new Document();
        
        try{
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/Desencriptados.pdf"));
            documento.open();

            Image img = Image.getInstance("src/mdRegistraduria/BanderaColombia.jpg");
            img.scaleToFit(650, 1000);
            img.setAlignment(Chunk.ALIGN_CENTER);
            
            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("REPUBLICA DE COLOMBIA \n\n");
            parrafo.setFont(FontFactory.getFont("Tahoma", 18, Font.BOLD, BaseColor.BLUE));
            parrafo.add("REGISTROS \n\n");
            
            documento.add(img);
            documento.add(parrafo);
            
            // AQUI PONGO CUANTAS COLUMNAS VA A TENER EL PDF Y EL TITULO DE CADA COLUMNA CON ADDCELL
            PdfPTable tabla = new PdfPTable(12);
            tabla.addCell("CLAVE");
            tabla.addCell("NOMBRE");
            tabla.addCell("APELLIDOS");
            tabla.addCell("EDAD");
            tabla.addCell("DIRECCION");
            tabla.addCell("TELEFONO");
            tabla.addCell("CORREO");
            tabla.addCell("FECHA DE NACIMIENTO");
            tabla.addCell("GENERO");
            tabla.addCell("CEDULA");
            tabla.addCell("LUGAR DE NACIMIENTO");
            tabla.addCell("ENFERMEDADES");

            try {
                // CONEXION A LA DESENCRIPTADA
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/registrosocial", "root", "samuel");
                PreparedStatement pst = cn.prepareStatement("select * from datos_registro_personas");

                ResultSet rs1 = pst.executeQuery();

                if (rs1.next()) { // AQUI VALIDA QUE SI ENCONRO LOS DATOS LOS TRAIGA
                    do{
                        tabla.addCell(rs1.getString(1));
                        tabla.addCell(rs1.getString(2));
                        tabla.addCell(rs1.getString(3));
                        tabla.addCell(rs1.getString(4));
                        tabla.addCell(rs1.getString(5));
                        tabla.addCell(rs1.getString(6));
                        tabla.addCell(rs1.getString(7));
                        tabla.addCell(rs1.getString(8));
                        tabla.addCell(rs1.getString(9));
                        tabla.addCell(rs1.getString(10));
                        tabla.addCell(rs1.getString(11));
                        tabla.addCell(rs1.getString(12));
                    } while (rs1.next());
                    documento.add(tabla);
                }
            } catch (DocumentException | SQLException e) {
                JOptionPane.showMessageDialog(null, "error " + e);
            }
            documento.close();
            
            
            
            // ENCRIPTADOS
            String ruta1 = System.getProperty("user.home");
            PdfWriter.getInstance(documento1, new FileOutputStream(ruta1 + "/Desktop/encriptados.pdf"));
            documento1.open();

            documento1.add(img);
            documento1.add(parrafo);
            
            // AQUI PONGO CUANTAS COLUMNAS VA A TENER EL PDF Y EL TITULO DE CADA COLUMNA CON ADDCELL
            PdfPTable tabla1 = new PdfPTable(12);
            tabla1.addCell("CLAVE");
            tabla1.addCell("NOMBRE");
            tabla1.addCell("APELLIDOS");
            tabla1.addCell("EDAD");
            tabla1.addCell("DIRECCION");
            tabla1.addCell("TELEFONO");
            tabla1.addCell("CORREO");
            tabla1.addCell("FECHA DE NACIMIENTO");
            tabla1.addCell("GENERO");
            tabla1.addCell("CEDULA");
            tabla1.addCell("LUGAR DE NACIMIENTO");
            tabla1.addCell("ENFERMEDADES");

            try{
                // CONEXION A LA ENCRIPTADA
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/registrosocial", "root", "samuel");
                PreparedStatement pst = cn.prepareStatement("select * from datos_registro_personas");

                ResultSet rs2 = pst.executeQuery();
                if(rs2.next()){
                   do{
                        tabla1.addCell(rs2.getString(1));
                        tabla1.addCell(rs2.getString(2));
                        tabla1.addCell(rs2.getString(3));
                        tabla1.addCell(rs2.getString(4));
                        tabla1.addCell(rs2.getString(5));
                        tabla1.addCell(rs2.getString(6));
                        tabla1.addCell(rs2.getString(7));
                        tabla1.addCell(rs2.getString(8));
                        tabla1.addCell(rs2.getString(9));
                        tabla1.addCell(rs2.getString(10));
                        tabla1.addCell(rs2.getString(11));
                        tabla1.addCell(rs2.getString(12));
                   }while(rs2.next());
                   documento1.add(tabla1);
                }
                
            }catch(DocumentException | SQLException e){
                JOptionPane.showMessageDialog(null, "error " + e);
            }
            documento1.close();

            JOptionPane.showMessageDialog(null, "PDF creado exitosamente");
        } catch (DocumentException | HeadlessException | FileNotFoundException s) {
            JOptionPane.showMessageDialog(null, "errot " + s);
            
        } catch (IOException ex) {
            Logger.getLogger(RegistroSocial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtcorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcorreoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistroSocial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroSocial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroSocial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroSocial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroSocial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JComboBox<String> cbxgenero;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtclave;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtenfermedades;
    private javax.swing.JTextField txtfecha_nacimiento;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtlugar_nacimiento;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
