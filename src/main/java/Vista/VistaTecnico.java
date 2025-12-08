/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;
import Modelo.*;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
/**
 *
 * @author dylan
 */
public class VistaTecnico extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VistaTecnico.class.getName());
    
    private final Usuario logueado;
    private int idUsuarioSeleccionado;
    private int idActivoSeleccionado;
    private int idIncidenteSeleccionado;
    
    /**
     * Creates new form VistaTecnico
     * @param logueado
     */
    public VistaTecnico(Usuario logueado) {
        initComponents();
        this.logueado = logueado;
    }

    public Usuario getLogueado() {
        return logueado;
    }
    
    public String getPass(){
        return String.valueOf(txtContrasenaTecnicoUpdate.getPassword());
    }
    
    public String getBusquedaUsuario(){
        return txtBusquedaTecnico.getText().trim();
    }

    public int getIdUsuarioSeleccionado() {
        return idUsuarioSeleccionado;
    }

    public void setIdUsuarioSeleccionado(int idUsuarioSeleccionado) {
        this.idUsuarioSeleccionado = idUsuarioSeleccionado;
    }

    public int getIdActivoSeleccionado() {
        return idActivoSeleccionado;
    }

    public void setIdActivoSeleccionado(int idActivoSeleccionado) {
        this.idActivoSeleccionado = idActivoSeleccionado;
    }

    public int getIdIncidenteSeleccionado() {
        return idIncidenteSeleccionado;
    }

    public void setIdIncidenteSeleccionado(int idIncidenteSeleccionado) {
        this.idIncidenteSeleccionado = idIncidenteSeleccionado;
    }

    public JButton getBtnActualizarTecnico() {
        return btnActualizarTecnico;
    }

    public void setBtnActualizarTecnico(JButton btnActualizarTecnico) {
        this.btnActualizarTecnico = btnActualizarTecnico;
    }

    public JButton getBtnBuscarActivoTecnico() {
        return btnBuscarActivoTecnico;
    }

    public void setBtnBuscarActivoTecnico(JButton btnBuscarActivoTecnico) {
        this.btnBuscarActivoTecnico = btnBuscarActivoTecnico;
    }

    public JButton getBtnBuscarTecnico() {
        return btnBuscarTecnico;
    }

    public void setBtnBuscarTecnico(JButton btnBuscarTecnico) {
        this.btnBuscarTecnico = btnBuscarTecnico;
    }

    public JButton getBtnModificarActivoTecnico() {
        return btnModificarActivoTecnico;
    }

    public void setBtnModificarActivoTecnico(JButton btnModificarActivoTecnico) {
        this.btnModificarActivoTecnico = btnModificarActivoTecnico;
    }

    public JComboBox<String> getCbEstadoActivoTecnico() {
        return cbEstadoActivoTecnico;
    }

    public void setCbEstadoActivoTecnico(JComboBox<String> cbEstadoActivoTecnico) {
        this.cbEstadoActivoTecnico = cbEstadoActivoTecnico;
    }

    public JLabel getLblActivoNombreVariable() {
        return lblActivoNombreVariable;
    }

    public void setLblActivoNombreVariable(JLabel lblActivoNombreVariable) {
        this.lblActivoNombreVariable = lblActivoNombreVariable;
    }

    public JLabel getLblBusquedaNombreActivoTecnico() {
        return lblBusquedaNombreActivoTecnico;
    }

    public void setLblBusquedaNombreActivoTecnico(JLabel lblBusquedaNombreActivoTecnico) {
        this.lblBusquedaNombreActivoTecnico = lblBusquedaNombreActivoTecnico;
    }

    public JLabel getLblBusquedaNombreTecnico() {
        return lblBusquedaNombreTecnico;
    }

    public void setLblBusquedaNombreTecnico(JLabel lblBusquedaNombreTecnico) {
        this.lblBusquedaNombreTecnico = lblBusquedaNombreTecnico;
    }

    public JLabel getLblDepartamentoActivoTecnicoVariable() {
        return lblDepartamentoActivoTecnicoVariable;
    }

    public void setLblDepartamentoActivoTecnicoVariable(JLabel lblDepartamentoActivoTecnicoVariable) {
        this.lblDepartamentoActivoTecnicoVariable = lblDepartamentoActivoTecnicoVariable;
    }

    public JLabel getLblDepartamentoTecnico() {
        return lblDepartamentoTecnico;
    }

    public void setLblDepartamentoTecnico(JLabel lblDepartamentoTecnico) {
        this.lblDepartamentoTecnico = lblDepartamentoTecnico;
    }

    public JLabel getLblDepartamentoTecnicoTitulo() {
        return lblDepartamentoTecnicoTitulo;
    }

    public void setLblDepartamentoTecnicoTitulo(JLabel lblDepartamentoTecnicoTitulo) {
        this.lblDepartamentoTecnicoTitulo = lblDepartamentoTecnicoTitulo;
    }

    public JLabel getLblDepartamentoTecnicoVariable() {
        return lblDepartamentoTecnicoVariable;
    }

    public void setLblDepartamentoTecnicoVariable(JLabel lblDepartamentoTecnicoVariable) {
        this.lblDepartamentoTecnicoVariable = lblDepartamentoTecnicoVariable;
    }

    public JLabel getLblEstadoActivoTecnico() {
        return lblEstadoActivoTecnico;
    }

    public void setLblEstadoActivoTecnico(JLabel lblEstadoActivoTecnico) {
        this.lblEstadoActivoTecnico = lblEstadoActivoTecnico;
    }

    public JLabel getLblIPActivoTecnico() {
        return lblIPActivoTecnico;
    }

    public void setLblIPActivoTecnico(JLabel lblIPActivoTecnico) {
        this.lblIPActivoTecnico = lblIPActivoTecnico;
    }

    public JLabel getLblIPActivoTecnicoVariable() {
        return lblIPActivoTecnicoVariable;
    }

    public void setLblIPActivoTecnicoVariable(JLabel lblIPActivoTecnicoVariable) {
        this.lblIPActivoTecnicoVariable = lblIPActivoTecnicoVariable;
    }

    public JLabel getLblNombreActivoTecnico() {
        return lblNombreActivoTecnico;
    }

    public void setLblNombreActivoTecnico(JLabel lblNombreActivoTecnico) {
        this.lblNombreActivoTecnico = lblNombreActivoTecnico;
    }

    public JLabel getLblNombreUsuarioTecnico() {
        return lblNombreUsuarioTecnico;
    }

    public JTable getTblActivos() {
        return tblActivos;
    }

    public void setTblActivos(JTable tblActivos) {
        this.tblActivos = tblActivos;
    }

    public JTable getTblUsuarios() {
        return tblUsuarios;
    }

    public void setTblUsuarios(JTable tblUsuarios) {
        this.tblUsuarios = tblUsuarios;
    }

    
    public void setLblNombreUsuarioTecnico(JLabel lblNombreUsuarioTecnico) {
        this.lblNombreUsuarioTecnico = lblNombreUsuarioTecnico;
    }

    public JLabel getLblOSActivoTecnico() {
        return lblOSActivoTecnico;
    }

    public void setLblOSActivoTecnico(JLabel lblOSActivoTecnico) {
        this.lblOSActivoTecnico = lblOSActivoTecnico;
    }

    public JLabel getLblOSActivoTecnicoVariable() {
        return lblOSActivoTecnicoVariable;
    }

    public void setLblOSActivoTecnicoVariable(JLabel lblOSActivoTecnicoVariable) {
        this.lblOSActivoTecnicoVariable = lblOSActivoTecnicoVariable;
    }

    public JLabel getLblPuestoTecnicoTitulo() {
        return lblPuestoTecnicoTitulo;
    }

    public void setLblPuestoTecnicoTitulo(JLabel lblPuestoTecnicoTitulo) {
        this.lblPuestoTecnicoTitulo = lblPuestoTecnicoTitulo;
    }

    public JLabel getLblPuestoTecnicoVariable() {
        return lblPuestoTecnicoVariable;
    }

    public void setLblPuestoTecnicoVariable(JLabel lblPuestoTecnicoVariable) {
        this.lblPuestoTecnicoVariable = lblPuestoTecnicoVariable;
    }

    public JLabel getLblTecnicoApellido1() {
        return lblTecnicoApellido1;
    }

    public void setLblTecnicoApellido1(JLabel lblTecnicoApellido1) {
        this.lblTecnicoApellido1 = lblTecnicoApellido1;
    }

    public JLabel getLblTecnicoApellido2() {
        return lblTecnicoApellido2;
    }

    public void setLblTecnicoApellido2(JLabel lblTecnicoApellido2) {
        this.lblTecnicoApellido2 = lblTecnicoApellido2;
    }

    public JLabel getLblTecnicoContrasena() {
        return lblTecnicoContrasena;
    }

    public void setLblTecnicoContrasena(JLabel lblTecnicoContrasena) {
        this.lblTecnicoContrasena = lblTecnicoContrasena;
    }

    public JLabel getLblTecnicoCorreo() {
        return lblTecnicoCorreo;
    }

    public void setLblTecnicoCorreo(JLabel lblTecnicoCorreo) {
        this.lblTecnicoCorreo = lblTecnicoCorreo;
    }

    public JLabel getLblTecnicoNombre() {
        return lblTecnicoNombre;
    }

    public void setLblTecnicoNombre(JLabel lblTecnicoNombre) {
        this.lblTecnicoNombre = lblTecnicoNombre;
    }

    public JLabel getLblTecnicoUsuarioVariable() {
        return lblTecnicoUsuarioVariable;
    }

    public void setLblTecnicoUsuarioVariable(JLabel lblTecnicoUsuarioVariable) {
        this.lblTecnicoUsuarioVariable = lblTecnicoUsuarioVariable;
    }

    public JLabel getLblTipoDeActivoTecnicoTitulo() {
        return lblTipoDeActivoTecnicoTitulo;
    }

    public void setLblTipoDeActivoTecnicoTitulo(JLabel lblTipoDeActivoTecnicoTitulo) {
        this.lblTipoDeActivoTecnicoTitulo = lblTipoDeActivoTecnicoTitulo;
    }

    public JLabel getLblTipoDeActivoTecnicoVariable() {
        return lblTipoDeActivoTecnicoVariable;
    }

    public void setLblTipoDeActivoTecnicoVariable(JLabel lblTipoDeActivoTecnicoVariable) {
        this.lblTipoDeActivoTecnicoVariable = lblTipoDeActivoTecnicoVariable;
    }

    public JLabel getLblUbicacionActivoTecnico() {
        return lblUbicacionActivoTecnico;
    }

    public void setLblUbicacionActivoTecnico(JLabel lblUbicacionActivoTecnico) {
        this.lblUbicacionActivoTecnico = lblUbicacionActivoTecnico;
    }

    public JLabel getLblUbicacionActivoTecnicoVariable() {
        return lblUbicacionActivoTecnicoVariable;
    }

    public void setLblUbicacionActivoTecnicoVariable(JLabel lblUbicacionActivoTecnicoVariable) {
        this.lblUbicacionActivoTecnicoVariable = lblUbicacionActivoTecnicoVariable;
    }

    public JTextField getTxtBusquedaNombreActivoTecnico() {
        return txtBusquedaNombreActivoTecnico;
    }

    public void setTxtBusquedaNombreActivoTecnico(JTextField txtBusquedaNombreActivoTecnico) {
        this.txtBusquedaNombreActivoTecnico = txtBusquedaNombreActivoTecnico;
    }

    public JTextField getTxtBusquedaTecnico() {
        return txtBusquedaTecnico;
    }

    public void setTxtBusquedaTecnico(JTextField txtBusquedaTecnico) {
        this.txtBusquedaTecnico = txtBusquedaTecnico;
    }

    public JPasswordField getTxtContrasenaTecnicoUpdate() {
        return txtContrasenaTecnicoUpdate;
    }

    public void setTxtContrasenaTecnicoUpdate(JPasswordField txtContrasenaTecnicoUpdate) {
        this.txtContrasenaTecnicoUpdate = txtContrasenaTecnicoUpdate;
    }

    public JTextField getTxtTecnicoApellido1() {
        return txtTecnicoApellido1;
    }

    public void setTxtTecnicoApellido1(JTextField txtTecnicoApellido1) {
        this.txtTecnicoApellido1 = txtTecnicoApellido1;
    }

    public JTextField getTxtTecnicoApellido2() {
        return txtTecnicoApellido2;
    }

    public void setTxtTecnicoApellido2(JTextField txtTecnicoApellido2) {
        this.txtTecnicoApellido2 = txtTecnicoApellido2;
    }

    public JTextField getTxtTecnicoCorreo() {
        return txtTecnicoCorreo;
    }

    public void setTxtTecnicoCorreo(JTextField txtTecnicoCorreo) {
        this.txtTecnicoCorreo = txtTecnicoCorreo;
    }

    public JTextField getTxtTecnicoNombre() {
        return txtTecnicoNombre;
    }

    public void setTxtTecnicoNombre(JTextField txtTecnicoNombre) {
        this.txtTecnicoNombre = txtTecnicoNombre;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        txtTecnicoNombre = new javax.swing.JTextField();
        lblTecnicoNombre = new javax.swing.JLabel();
        lblTecnicoApellido1 = new javax.swing.JLabel();
        txtTecnicoApellido1 = new javax.swing.JTextField();
        lblTecnicoApellido2 = new javax.swing.JLabel();
        txtTecnicoApellido2 = new javax.swing.JTextField();
        lblTecnicoCorreo = new javax.swing.JLabel();
        txtTecnicoCorreo = new javax.swing.JTextField();
        lblTecnicoContrasena = new javax.swing.JLabel();
        txtContrasenaTecnicoUpdate = new javax.swing.JPasswordField();
        lblNombreUsuarioTecnico = new javax.swing.JLabel();
        lblTecnicoUsuarioVariable = new javax.swing.JLabel();
        lblDepartamentoTecnicoVariable = new javax.swing.JLabel();
        lblDepartamentoTecnicoTitulo = new javax.swing.JLabel();
        lblPuestoTecnicoVariable = new javax.swing.JLabel();
        lblPuestoTecnicoTitulo = new javax.swing.JLabel();
        btnActualizarTecnico = new javax.swing.JButton();
        lblBusquedaNombreTecnico = new javax.swing.JLabel();
        txtBusquedaTecnico = new javax.swing.JTextField();
        btnBuscarTecnico = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblActivos = new javax.swing.JTable();
        lblNombreActivoTecnico = new javax.swing.JLabel();
        lblIPActivoTecnico = new javax.swing.JLabel();
        lblOSActivoTecnico = new javax.swing.JLabel();
        lblUbicacionActivoTecnico = new javax.swing.JLabel();
        lblActivoNombreVariable = new javax.swing.JLabel();
        lblIPActivoTecnicoVariable = new javax.swing.JLabel();
        lblOSActivoTecnicoVariable = new javax.swing.JLabel();
        lblUbicacionActivoTecnicoVariable = new javax.swing.JLabel();
        lblDepartamentoTecnico = new javax.swing.JLabel();
        lblDepartamentoActivoTecnicoVariable = new javax.swing.JLabel();
        lblEstadoActivoTecnico = new javax.swing.JLabel();
        cbEstadoActivoTecnico = new javax.swing.JComboBox<>();
        lblTipoDeActivoTecnicoTitulo = new javax.swing.JLabel();
        lblTipoDeActivoTecnicoVariable = new javax.swing.JLabel();
        btnModificarActivoTecnico = new javax.swing.JButton();
        lblBusquedaNombreActivoTecnico = new javax.swing.JLabel();
        txtBusquedaNombreActivoTecnico = new javax.swing.JTextField();
        btnBuscarActivoTecnico = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        lblTecnicoNombre.setBackground(new java.awt.Color(255, 255, 255));
        lblTecnicoNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTecnicoNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblTecnicoNombre.setText("Nombre : ");

        lblTecnicoApellido1.setBackground(new java.awt.Color(255, 255, 255));
        lblTecnicoApellido1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTecnicoApellido1.setForeground(new java.awt.Color(0, 0, 0));
        lblTecnicoApellido1.setText("Primer Apellido : ");

        txtTecnicoApellido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTecnicoApellido1ActionPerformed(evt);
            }
        });

        lblTecnicoApellido2.setBackground(new java.awt.Color(255, 255, 255));
        lblTecnicoApellido2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTecnicoApellido2.setForeground(new java.awt.Color(0, 0, 0));
        lblTecnicoApellido2.setText("Segundo Apellido : ");

        txtTecnicoApellido2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTecnicoApellido2ActionPerformed(evt);
            }
        });

        lblTecnicoCorreo.setBackground(new java.awt.Color(255, 255, 255));
        lblTecnicoCorreo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTecnicoCorreo.setForeground(new java.awt.Color(0, 0, 0));
        lblTecnicoCorreo.setText("Correo :");

        txtTecnicoCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTecnicoCorreoActionPerformed(evt);
            }
        });

        lblTecnicoContrasena.setBackground(new java.awt.Color(255, 255, 255));
        lblTecnicoContrasena.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTecnicoContrasena.setForeground(new java.awt.Color(0, 0, 0));
        lblTecnicoContrasena.setText("Contraseña :");

        lblNombreUsuarioTecnico.setBackground(new java.awt.Color(255, 255, 255));
        lblNombreUsuarioTecnico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNombreUsuarioTecnico.setForeground(new java.awt.Color(0, 0, 0));
        lblNombreUsuarioTecnico.setText("Nombre de usuario : ");

        lblDepartamentoTecnicoTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblDepartamentoTecnicoTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDepartamentoTecnicoTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblDepartamentoTecnicoTitulo.setText("Departamento: ");

        lblPuestoTecnicoTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblPuestoTecnicoTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPuestoTecnicoTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblPuestoTecnicoTitulo.setText("Puesto:");

        btnActualizarTecnico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnActualizarTecnico.setText("Actualizar");

        lblBusquedaNombreTecnico.setBackground(new java.awt.Color(255, 255, 255));
        lblBusquedaNombreTecnico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblBusquedaNombreTecnico.setForeground(new java.awt.Color(0, 0, 0));
        lblBusquedaNombreTecnico.setText("Buscar por nombre de usuario: ");

        txtBusquedaTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusquedaTecnicoActionPerformed(evt);
            }
        });

        btnBuscarTecnico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscarTecnico.setText("Buscar");

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblUsuarios);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblNombreUsuarioTecnico)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblTecnicoUsuarioVariable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(btnBuscarTecnico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnActualizarTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTecnicoCorreo)
                                    .addComponent(lblTecnicoContrasena)
                                    .addComponent(lblDepartamentoTecnicoTitulo)
                                    .addComponent(lblPuestoTecnicoTitulo)
                                    .addComponent(lblTecnicoApellido2))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblDepartamentoTecnicoVariable, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                            .addComponent(lblPuestoTecnicoVariable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtTecnicoApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTecnicoApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTecnicoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTecnicoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtContrasenaTecnicoUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblBusquedaNombreTecnico)
                        .addGap(18, 18, 18)
                        .addComponent(txtBusquedaTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblTecnicoApellido1)
                    .addComponent(lblTecnicoNombre))
                .addGap(113, 141, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 906, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreUsuarioTecnico)
                    .addComponent(lblTecnicoUsuarioVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTecnicoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTecnicoNombre))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTecnicoApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTecnicoApellido1))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTecnicoApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTecnicoApellido2))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTecnicoCorreo)
                    .addComponent(txtTecnicoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContrasenaTecnicoUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTecnicoContrasena))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(lblDepartamentoTecnicoTitulo)
                        .addGap(39, 39, 39)
                        .addComponent(lblPuestoTecnicoTitulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblDepartamentoTecnicoVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblPuestoTecnicoVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(79, 79, 79)
                .addComponent(btnActualizarTecnico)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBusquedaNombreTecnico)
                    .addComponent(txtBusquedaTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btnBuscarTecnico)
                .addContainerGap(168, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );

        jTabbedPane1.addTab("Usuario", jPanel1);

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1493, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Incidentes", jPanel3);

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        tblActivos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblActivos);

        lblNombreActivoTecnico.setBackground(new java.awt.Color(255, 255, 255));
        lblNombreActivoTecnico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNombreActivoTecnico.setForeground(new java.awt.Color(0, 0, 0));
        lblNombreActivoTecnico.setText("Nombre del activo : ");

        lblIPActivoTecnico.setBackground(new java.awt.Color(255, 255, 255));
        lblIPActivoTecnico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblIPActivoTecnico.setForeground(new java.awt.Color(0, 0, 0));
        lblIPActivoTecnico.setText("Direccion IP :");

        lblOSActivoTecnico.setBackground(new java.awt.Color(255, 255, 255));
        lblOSActivoTecnico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblOSActivoTecnico.setForeground(new java.awt.Color(0, 0, 0));
        lblOSActivoTecnico.setText("Sistema Operativo :");

        lblUbicacionActivoTecnico.setBackground(new java.awt.Color(255, 255, 255));
        lblUbicacionActivoTecnico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblUbicacionActivoTecnico.setForeground(new java.awt.Color(0, 0, 0));
        lblUbicacionActivoTecnico.setText("Ubicacion del activo :");

        lblDepartamentoTecnico.setBackground(new java.awt.Color(255, 255, 255));
        lblDepartamentoTecnico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDepartamentoTecnico.setForeground(new java.awt.Color(0, 0, 0));
        lblDepartamentoTecnico.setText("Departamento :");

        lblEstadoActivoTecnico.setBackground(new java.awt.Color(255, 255, 255));
        lblEstadoActivoTecnico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEstadoActivoTecnico.setForeground(new java.awt.Color(0, 0, 0));
        lblEstadoActivoTecnico.setText("Estado del Activo:  ");

        cbEstadoActivoTecnico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OPERATIVO", "CUARENTENA", "MANTENIMIENTO", "APAGADO" }));

        lblTipoDeActivoTecnicoTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblTipoDeActivoTecnicoTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTipoDeActivoTecnicoTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblTipoDeActivoTecnicoTitulo.setText("Tipo de Activo:");

        btnModificarActivoTecnico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnModificarActivoTecnico.setText("Modificar");

        lblBusquedaNombreActivoTecnico.setBackground(new java.awt.Color(255, 255, 255));
        lblBusquedaNombreActivoTecnico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblBusquedaNombreActivoTecnico.setForeground(new java.awt.Color(0, 0, 0));
        lblBusquedaNombreActivoTecnico.setText("Buscar por nombre del activo: ");

        btnBuscarActivoTecnico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscarActivoTecnico.setText("Buscar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(lblBusquedaNombreActivoTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(txtBusquedaNombreActivoTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTipoDeActivoTecnicoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEstadoActivoTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDepartamentoTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblUbicacionActivoTecnico)
                                    .addComponent(lblOSActivoTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblIPActivoTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNombreActivoTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDepartamentoActivoTecnicoVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbEstadoActivoTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblUbicacionActivoTecnicoVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblOSActivoTecnicoVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblIPActivoTecnicoVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblActivoNombreVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnModificarActivoTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblTipoDeActivoTecnicoVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBuscarActivoTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(158, 158, 158)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 976, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNombreActivoTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblActivoNombreVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblIPActivoTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIPActivoTecnicoVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOSActivoTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOSActivoTecnicoVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUbicacionActivoTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUbicacionActivoTecnicoVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDepartamentoTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDepartamentoActivoTecnicoVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstadoActivoTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbEstadoActivoTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTipoDeActivoTecnicoTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipoDeActivoTecnicoVariable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(btnModificarActivoTecnico)
                .addGap(147, 147, 147)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBusquedaNombreActivoTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBusquedaNombreActivoTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnBuscarActivoTecnico)
                .addGap(79, 79, 79))
        );

        jTabbedPane1.addTab("Activos", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1493, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTecnicoApellido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTecnicoApellido1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTecnicoApellido1ActionPerformed

    private void txtTecnicoApellido2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTecnicoApellido2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTecnicoApellido2ActionPerformed

    private void txtTecnicoCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTecnicoCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTecnicoCorreoActionPerformed

    private void txtBusquedaTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusquedaTecnicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusquedaTecnicoActionPerformed




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarTecnico;
    private javax.swing.JButton btnBuscarActivoTecnico;
    private javax.swing.JButton btnBuscarTecnico;
    private javax.swing.JButton btnModificarActivoTecnico;
    private javax.swing.JComboBox<String> cbEstadoActivoTecnico;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblActivoNombreVariable;
    private javax.swing.JLabel lblBusquedaNombreActivoTecnico;
    private javax.swing.JLabel lblBusquedaNombreTecnico;
    private javax.swing.JLabel lblDepartamentoActivoTecnicoVariable;
    private javax.swing.JLabel lblDepartamentoTecnico;
    private javax.swing.JLabel lblDepartamentoTecnicoTitulo;
    private javax.swing.JLabel lblDepartamentoTecnicoVariable;
    private javax.swing.JLabel lblEstadoActivoTecnico;
    private javax.swing.JLabel lblIPActivoTecnico;
    private javax.swing.JLabel lblIPActivoTecnicoVariable;
    private javax.swing.JLabel lblNombreActivoTecnico;
    private javax.swing.JLabel lblNombreUsuarioTecnico;
    private javax.swing.JLabel lblOSActivoTecnico;
    private javax.swing.JLabel lblOSActivoTecnicoVariable;
    private javax.swing.JLabel lblPuestoTecnicoTitulo;
    private javax.swing.JLabel lblPuestoTecnicoVariable;
    private javax.swing.JLabel lblTecnicoApellido1;
    private javax.swing.JLabel lblTecnicoApellido2;
    private javax.swing.JLabel lblTecnicoContrasena;
    private javax.swing.JLabel lblTecnicoCorreo;
    private javax.swing.JLabel lblTecnicoNombre;
    private javax.swing.JLabel lblTecnicoUsuarioVariable;
    private javax.swing.JLabel lblTipoDeActivoTecnicoTitulo;
    private javax.swing.JLabel lblTipoDeActivoTecnicoVariable;
    private javax.swing.JLabel lblUbicacionActivoTecnico;
    private javax.swing.JLabel lblUbicacionActivoTecnicoVariable;
    private javax.swing.JTable tblActivos;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtBusquedaNombreActivoTecnico;
    private javax.swing.JTextField txtBusquedaTecnico;
    private javax.swing.JPasswordField txtContrasenaTecnicoUpdate;
    private javax.swing.JTextField txtTecnicoApellido1;
    private javax.swing.JTextField txtTecnicoApellido2;
    private javax.swing.JTextField txtTecnicoCorreo;
    private javax.swing.JTextField txtTecnicoNombre;
    // End of variables declaration//GEN-END:variables
}
