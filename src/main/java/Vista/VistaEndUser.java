/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.*;
import Modelo.*;
import Vista.*;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author dylan
 */
public class VistaEndUser extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VistaEndUser.class.getName());

    private final Usuario logueado;
    private int idUsuarioSeleccionado;
    private int idActivoSeleccionado;
    private int idIncidenteSeleccionado;

    public String getPass() {
        return String.valueOf(txtContrasenaTecnicoUpdate.getPassword());
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

    public JButton getBtnIniciarChat() {
        return btnIniciarChat;
    }
 
    /**
     * Creates new form VistaEndUser
     */
    public VistaEndUser(Usuario logueado) {
        initComponents();
        this.logueado = logueado;
    }

    public Usuario getLogueado() {
        return logueado;
    }

    public JButton getBtnActualizarFinal() {
        return btnActualizarFinal;
    }

    public void setBtnActualizarFinal(JButton btnActualizarFinal) {
        this.btnActualizarFinal = btnActualizarFinal;
    }

    public JButton getBtnActualizarIncidente() {
        return btnActualizarIncidente;
    }

    public void setBtnActualizarIncidente(JButton btnActualizarIncidente) {
        this.btnActualizarIncidente = btnActualizarIncidente;
    }

    public JButton getBtnActualizarIncidente1() {
        return btnIniciarChat;
    }

    public void setBtnActualizarIncidente1(JButton btnActualizarIncidente1) {
        this.btnIniciarChat = btnActualizarIncidente1;
    }

    public JButton getBtnAgregarIncidente() {
        return btnAgregarIncidente;
    }

    public void setBtnAgregarIncidente(JButton btnAgregarIncidente) {
        this.btnAgregarIncidente = btnAgregarIncidente;
    }

    public JButton getBtnBuscarFinal() {
        return btnBuscarFinal;
    }

    public void setBtnBuscarFinal(JButton btnBuscarFinal) {
        this.btnBuscarFinal = btnBuscarFinal;
    }

    public JComboBox<String> getCbEstadoIncidente() {
        return cbEstadoIncidente;
    }

    public void setCbEstadoIncidente(JComboBox<String> cbEstadoIncidente) {
        this.cbEstadoIncidente = cbEstadoIncidente;
    }

    public JComboBox<String> getCbPrioridadIncidente() {
        return cbPrioridadIncidente;
    }

    public void setCbPrioridadIncidente(JComboBox<String> cbPrioridadIncidente) {
        this.cbPrioridadIncidente = cbPrioridadIncidente;
    }

    public JPanel getjPanel3() {
        return jPanel3;
    }

    public void setjPanel3(JPanel jPanel3) {
        this.jPanel3 = jPanel3;
    }

    public JPanel getjPanel4() {
        return jPanel4;
    }

    public void setjPanel4(JPanel jPanel4) {
        this.jPanel4 = jPanel4;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public JScrollPane getjScrollPane4() {
        return jScrollPane4;
    }

    public void setjScrollPane4(JScrollPane jScrollPane4) {
        this.jScrollPane4 = jScrollPane4;
    }

    public JTabbedPane getjTabbedPane1() {
        return jTabbedPane1;
    }

    public void setjTabbedPane1(JTabbedPane jTabbedPane1) {
        this.jTabbedPane1 = jTabbedPane1;
    }

    public JLabel getLblAsignadoA() {
        return lblAsignadoA;
    }

    public void setLblAsignadoA(JLabel lblAsignadoA) {
        this.lblAsignadoA = lblAsignadoA;
    }

    public JLabel getLblBusquedaNombreFinal() {
        return lblBusquedaNombreFinal;
    }

    public void setLblBusquedaNombreFinal(JLabel lblBusquedaNombreFinal) {
        this.lblBusquedaNombreFinal = lblBusquedaNombreFinal;
    }

    public JLabel getLblDepartamentoFinalTitulo() {
        return lblDepartamentoFinalTitulo;
    }

    public void setLblDepartamentoFinalTitulo(JLabel lblDepartamentoFinalTitulo) {
        this.lblDepartamentoFinalTitulo = lblDepartamentoFinalTitulo;
    }

    public JLabel getLblDepartamentoTecnicoVariable() {
        return lblDepartamentoTecnicoVariable;
    }

    public void setLblDepartamentoTecnicoVariable(JLabel lblDepartamentoTecnicoVariable) {
        this.lblDepartamentoTecnicoVariable = lblDepartamentoTecnicoVariable;
    }

    public JLabel getLblDescripcionIncidente() {
        return lblDescripcionIncidente;
    }

    public void setLblDescripcionIncidente(JLabel lblDescripcionIncidente) {
        this.lblDescripcionIncidente = lblDescripcionIncidente;
    }

    public JLabel getLblEstadoIncidente() {
        return lblEstadoIncidente;
    }

    public void setLblEstadoIncidente(JLabel lblEstadoIncidente) {
        this.lblEstadoIncidente = lblEstadoIncidente;
    }

    public JLabel getLblFechaAperturaTitulo() {
        return lblFechaAperturaTitulo;
    }

    public void setLblFechaAperturaTitulo(JLabel lblFechaAperturaTitulo) {
        this.lblFechaAperturaTitulo = lblFechaAperturaTitulo;
    }

    public JLabel getLblFechaAperturaVariable() {
        return lblFechaAperturaVariable;
    }

    public void setLblFechaAperturaVariable(JLabel lblFechaAperturaVariable) {
        this.lblFechaAperturaVariable = lblFechaAperturaVariable;
    }

    public JLabel getLblFechaCierreTitulo() {
        return lblFechaCierreTitulo;
    }

    public void setLblFechaCierreTitulo(JLabel lblFechaCierreTitulo) {
        this.lblFechaCierreTitulo = lblFechaCierreTitulo;
    }

    public JLabel getLblFechaCierreVariable() {
        return lblFechaCierreVariable;
    }

    public void setLblFechaCierreVariable(JLabel lblFechaCierreVariable) {
        this.lblFechaCierreVariable = lblFechaCierreVariable;
    }

    public JLabel getLblFinalApellido1() {
        return lblFinalApellido1;
    }

    public void setLblFinalApellido1(JLabel lblFinalApellido1) {
        this.lblFinalApellido1 = lblFinalApellido1;
    }

    public JLabel getLblFinalApellido2() {
        return lblFinalApellido2;
    }

    public void setLblFinalApellido2(JLabel lblFinalApellido2) {
        this.lblFinalApellido2 = lblFinalApellido2;
    }

    public JLabel getLblFinalContrasena() {
        return lblFinalContrasena;
    }

    public void setLblFinalContrasena(JLabel lblFinalContrasena) {
        this.lblFinalContrasena = lblFinalContrasena;
    }

    public JLabel getLblFinalCorreo() {
        return lblFinalCorreo;
    }

    public void setLblFinalCorreo(JLabel lblFinalCorreo) {
        this.lblFinalCorreo = lblFinalCorreo;
    }

    public JLabel getLblFinalNombre() {
        return lblFinalNombre;
    }

    public void setLblFinalNombre(JLabel lblFinalNombre) {
        this.lblFinalNombre = lblFinalNombre;
    }

    public JLabel getLblNombreUsuarioFinal() {
        return lblNombreUsuarioFinal;
    }

    public void setLblNombreUsuarioFinal(JLabel lblNombreUsuarioFinal) {
        this.lblNombreUsuarioFinal = lblNombreUsuarioFinal;
    }

    public JLabel getLblPrioridadIncidente() {
        return lblPrioridadIncidente;
    }

    public void setLblPrioridadIncidente(JLabel lblPrioridadIncidente) {
        this.lblPrioridadIncidente = lblPrioridadIncidente;
    }

    public JLabel getLblPuestoFinalTitulo() {
        return lblPuestoFinalTitulo;
    }

    public void setLblPuestoFinalTitulo(JLabel lblPuestoFinalTitulo) {
        this.lblPuestoFinalTitulo = lblPuestoFinalTitulo;
    }

    public JLabel getLblPuestoTecnicoVariable() {
        return lblPuestoTecnicoVariable;
    }

    public void setLblPuestoTecnicoVariable(JLabel lblPuestoTecnicoVariable) {
        this.lblPuestoTecnicoVariable = lblPuestoTecnicoVariable;
    }

    public JLabel getLblReportadoPor() {
        return lblReportadoPor;
    }

    public void setLblReportadoPor(JLabel lblReportadoPor) {
        this.lblReportadoPor = lblReportadoPor;
    }

    public JLabel getLblReportadoPor2() {
        return lblReportadoPor2;
    }

    public void setLblReportadoPor2(JLabel lblReportadoPor2) {
        this.lblReportadoPor2 = lblReportadoPor2;
    }

    public JLabel getLblTecnicoUsuarioVariable() {
        return lblTecnicoUsuarioVariable;
    }

    public void setLblTecnicoUsuarioVariable(JLabel lblTecnicoUsuarioVariable) {
        this.lblTecnicoUsuarioVariable = lblTecnicoUsuarioVariable;
    }

    public JLabel getLblTituloIncidente() {
        return lblTituloIncidente;
    }

    public void setLblTituloIncidente(JLabel lblTituloIncidente) {
        this.lblTituloIncidente = lblTituloIncidente;
    }

    public JTable getTblMisIncidentes() {
        return tblMisIncidentes;
    }

    public void setTblMisIncidentes(JTable tblMisIncidentes) {
        this.tblMisIncidentes = tblMisIncidentes;
    }

    public JTable getTblUsuarios() {
        return tblUsuarios;
    }

    public void setTblUsuarios(JTable tblUsuarios) {
        this.tblUsuarios = tblUsuarios;
    }

    public JTextField getTxtActivoAfectado() {
        return txtActivoAfectado;
    }

    public void setTxtActivoAfectado(JTextField txtActivoAfectado) {
        this.txtActivoAfectado = txtActivoAfectado;
    }

    public JTextField getTxtAsignadoA1() {
        return txtAsignadoA1;
    }

    public void setTxtAsignadoA1(JTextField txtAsignadoA1) {
        this.txtAsignadoA1 = txtAsignadoA1;
    }

    public JTextField getTxtBusquedaFinal() {
        return txtBusquedaFinal;
    }

    public void setTxtBusquedaFinal(JTextField txtBusquedaFinal) {
        this.txtBusquedaFinal = txtBusquedaFinal;
    }

    public JPasswordField getTxtContrasenaTecnicoUpdate() {
        return txtContrasenaTecnicoUpdate;
    }

    public void setTxtContrasenaTecnicoUpdate(JPasswordField txtContrasenaTecnicoUpdate) {
        this.txtContrasenaTecnicoUpdate = txtContrasenaTecnicoUpdate;
    }

    public JTextArea getTxtDescripcionIncidente() {
        return txtDescripcionIncidente;
    }

    public void setTxtDescripcionIncidente(JTextArea txtDescripcionIncidente) {
        this.txtDescripcionIncidente = txtDescripcionIncidente;
    }

    public JTextField getTxtReportadoPor() {
        return txtReportadoPor;
    }

    public void setTxtReportadoPor(JTextField txtReportadoPor) {
        this.txtReportadoPor = txtReportadoPor;
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

    public JTextField getTxtTituloIncidente() {
        return txtTituloIncidente;
    }

    public void setTxtTituloIncidente(JTextField txtTituloIncidente) {
        this.txtTituloIncidente = txtTituloIncidente;
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
        jPanel3 = new javax.swing.JPanel();
        txtTecnicoNombre = new javax.swing.JTextField();
        lblFinalNombre = new javax.swing.JLabel();
        lblFinalApellido1 = new javax.swing.JLabel();
        txtTecnicoApellido1 = new javax.swing.JTextField();
        lblFinalApellido2 = new javax.swing.JLabel();
        txtTecnicoApellido2 = new javax.swing.JTextField();
        lblFinalCorreo = new javax.swing.JLabel();
        txtTecnicoCorreo = new javax.swing.JTextField();
        lblFinalContrasena = new javax.swing.JLabel();
        txtContrasenaTecnicoUpdate = new javax.swing.JPasswordField();
        lblNombreUsuarioFinal = new javax.swing.JLabel();
        lblTecnicoUsuarioVariable = new javax.swing.JLabel();
        lblDepartamentoTecnicoVariable = new javax.swing.JLabel();
        lblDepartamentoFinalTitulo = new javax.swing.JLabel();
        lblPuestoTecnicoVariable = new javax.swing.JLabel();
        lblPuestoFinalTitulo = new javax.swing.JLabel();
        btnActualizarFinal = new javax.swing.JButton();
        lblBusquedaNombreFinal = new javax.swing.JLabel();
        txtBusquedaFinal = new javax.swing.JTextField();
        btnBuscarFinal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        lblTituloIncidente = new javax.swing.JLabel();
        txtTituloIncidente = new javax.swing.JTextField();
        lblDescripcionIncidente = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtDescripcionIncidente = new javax.swing.JTextArea();
        lblEstadoIncidente = new javax.swing.JLabel();
        cbEstadoIncidente = new javax.swing.JComboBox<>();
        lblPrioridadIncidente = new javax.swing.JLabel();
        cbPrioridadIncidente = new javax.swing.JComboBox<>();
        lblReportadoPor = new javax.swing.JLabel();
        txtReportadoPor = new javax.swing.JTextField();
        txtActivoAfectado = new javax.swing.JTextField();
        lblReportadoPor2 = new javax.swing.JLabel();
        lblFechaAperturaTitulo = new javax.swing.JLabel();
        lblFechaCierreTitulo = new javax.swing.JLabel();
        lblFechaAperturaVariable = new javax.swing.JLabel();
        lblFechaCierreVariable = new javax.swing.JLabel();
        btnAgregarIncidente = new javax.swing.JButton();
        btnActualizarIncidente = new javax.swing.JButton();
        txtAsignadoA1 = new javax.swing.JTextField();
        lblAsignadoA = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMisIncidentes = new javax.swing.JTable();
        btnIniciarChat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Usuario Final");

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

        lblFinalNombre.setBackground(new java.awt.Color(255, 255, 255));
        lblFinalNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFinalNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblFinalNombre.setText("Nombre : ");

        lblFinalApellido1.setBackground(new java.awt.Color(255, 255, 255));
        lblFinalApellido1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFinalApellido1.setForeground(new java.awt.Color(0, 0, 0));
        lblFinalApellido1.setText("Primer Apellido : ");

        txtTecnicoApellido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTecnicoApellido1ActionPerformed(evt);
            }
        });

        lblFinalApellido2.setBackground(new java.awt.Color(255, 255, 255));
        lblFinalApellido2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFinalApellido2.setForeground(new java.awt.Color(0, 0, 0));
        lblFinalApellido2.setText("Segundo Apellido : ");

        txtTecnicoApellido2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTecnicoApellido2ActionPerformed(evt);
            }
        });

        lblFinalCorreo.setBackground(new java.awt.Color(255, 255, 255));
        lblFinalCorreo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFinalCorreo.setForeground(new java.awt.Color(0, 0, 0));
        lblFinalCorreo.setText("Correo :");

        txtTecnicoCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTecnicoCorreoActionPerformed(evt);
            }
        });

        lblFinalContrasena.setBackground(new java.awt.Color(255, 255, 255));
        lblFinalContrasena.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFinalContrasena.setForeground(new java.awt.Color(0, 0, 0));
        lblFinalContrasena.setText("Contraseña :");

        lblNombreUsuarioFinal.setBackground(new java.awt.Color(255, 255, 255));
        lblNombreUsuarioFinal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNombreUsuarioFinal.setForeground(new java.awt.Color(0, 0, 0));
        lblNombreUsuarioFinal.setText("Nombre de usuario : ");

        lblDepartamentoFinalTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblDepartamentoFinalTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDepartamentoFinalTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblDepartamentoFinalTitulo.setText("Departamento: ");

        lblPuestoFinalTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblPuestoFinalTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPuestoFinalTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblPuestoFinalTitulo.setText("Puesto:");

        btnActualizarFinal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnActualizarFinal.setText("Actualizar");

        lblBusquedaNombreFinal.setBackground(new java.awt.Color(255, 255, 255));
        lblBusquedaNombreFinal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblBusquedaNombreFinal.setForeground(new java.awt.Color(0, 0, 0));
        lblBusquedaNombreFinal.setText("Buscar por nombre de usuario: ");

        txtBusquedaFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusquedaFinalActionPerformed(evt);
            }
        });

        btnBuscarFinal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscarFinal.setText("Buscar");

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(lblNombreUsuarioFinal)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblTecnicoUsuarioVariable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(btnBuscarFinal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnActualizarFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFinalCorreo)
                                    .addComponent(lblFinalContrasena)
                                    .addComponent(lblDepartamentoFinalTitulo)
                                    .addComponent(lblPuestoFinalTitulo)
                                    .addComponent(lblFinalApellido2))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblDepartamentoTecnicoVariable, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                            .addComponent(lblPuestoTecnicoVariable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtTecnicoApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTecnicoApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTecnicoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTecnicoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtContrasenaTecnicoUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblBusquedaNombreFinal)
                        .addGap(18, 18, 18)
                        .addComponent(txtBusquedaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblFinalApellido1)
                    .addComponent(lblFinalNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 838, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombreUsuarioFinal)
                    .addComponent(lblTecnicoUsuarioVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTecnicoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFinalNombre))
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTecnicoApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFinalApellido1))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTecnicoApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFinalApellido2))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFinalCorreo)
                    .addComponent(txtTecnicoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContrasenaTecnicoUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFinalContrasena))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(lblDepartamentoFinalTitulo)
                        .addGap(39, 39, 39)
                        .addComponent(lblPuestoFinalTitulo))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblDepartamentoTecnicoVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblPuestoTecnicoVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(79, 79, 79)
                .addComponent(btnActualizarFinal)
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBusquedaNombreFinal)
                    .addComponent(txtBusquedaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btnBuscarFinal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );

        jTabbedPane1.addTab("Usuario", jPanel3);

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));

        lblTituloIncidente.setBackground(new java.awt.Color(255, 255, 255));
        lblTituloIncidente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTituloIncidente.setForeground(new java.awt.Color(0, 0, 0));
        lblTituloIncidente.setText("Titulo del Incidente : ");

        txtTituloIncidente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloIncidenteActionPerformed(evt);
            }
        });

        lblDescripcionIncidente.setBackground(new java.awt.Color(255, 255, 255));
        lblDescripcionIncidente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDescripcionIncidente.setForeground(new java.awt.Color(0, 0, 0));
        lblDescripcionIncidente.setText("Descripcion del incidente:");

        txtDescripcionIncidente.setColumns(20);
        txtDescripcionIncidente.setRows(5);
        jScrollPane4.setViewportView(txtDescripcionIncidente);

        lblEstadoIncidente.setBackground(new java.awt.Color(255, 255, 255));
        lblEstadoIncidente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEstadoIncidente.setForeground(new java.awt.Color(0, 0, 0));
        lblEstadoIncidente.setText("Estado del incidente: ");

        cbEstadoIncidente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ABIERTO", "CANCELADO" }));

        lblPrioridadIncidente.setBackground(new java.awt.Color(255, 255, 255));
        lblPrioridadIncidente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPrioridadIncidente.setForeground(new java.awt.Color(0, 0, 0));
        lblPrioridadIncidente.setText("Prioridad:");

        cbPrioridadIncidente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BAJA", "MEDIA", "ALTA", "CRITICA" }));

        lblReportadoPor.setBackground(new java.awt.Color(255, 255, 255));
        lblReportadoPor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblReportadoPor.setForeground(new java.awt.Color(0, 0, 0));
        lblReportadoPor.setText("Reportado por:");

        lblReportadoPor2.setBackground(new java.awt.Color(255, 255, 255));
        lblReportadoPor2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblReportadoPor2.setForeground(new java.awt.Color(0, 0, 0));
        lblReportadoPor2.setText("Activo impactado: ");

        lblFechaAperturaTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblFechaAperturaTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFechaAperturaTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblFechaAperturaTitulo.setText("Fecha Apertura: ");

        lblFechaCierreTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblFechaCierreTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFechaCierreTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblFechaCierreTitulo.setText("Fecha Cierre: ");

        lblFechaAperturaVariable.setBackground(new java.awt.Color(255, 255, 255));
        lblFechaAperturaVariable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFechaAperturaVariable.setForeground(new java.awt.Color(0, 0, 0));
        lblFechaAperturaVariable.setText("<FechaApertura> ");

        lblFechaCierreVariable.setBackground(new java.awt.Color(255, 255, 255));
        lblFechaCierreVariable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFechaCierreVariable.setForeground(new java.awt.Color(0, 0, 0));
        lblFechaCierreVariable.setText("<FechaCierre> ");

        btnAgregarIncidente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAgregarIncidente.setText("Agregar");

        btnActualizarIncidente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnActualizarIncidente.setText("Actualizar");

        lblAsignadoA.setBackground(new java.awt.Color(255, 255, 255));
        lblAsignadoA.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAsignadoA.setForeground(new java.awt.Color(0, 0, 0));
        lblAsignadoA.setText("Asignado a: ");

        tblMisIncidentes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblMisIncidentes);

        btnIniciarChat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnIniciarChat.setText("Iniciar Chat");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(lblFechaAperturaTitulo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblFechaAperturaVariable)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                            .addComponent(lblFechaCierreTitulo))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(lblTituloIncidente)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtTituloIncidente)))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addComponent(lblReportadoPor2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtActivoAfectado, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnAgregarIncidente, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblDescripcionIncidente))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnActualizarIncidente, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnIniciarChat, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblReportadoPor)
                            .addComponent(lblAsignadoA))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtReportadoPor, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(txtAsignadoA1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFechaCierreVariable)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEstadoIncidente)
                                    .addComponent(lblPrioridadIncidente))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbPrioridadIncidente, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbEstadoIncidente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTituloIncidente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTituloIncidente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaAperturaTitulo)
                    .addComponent(lblFechaCierreTitulo)
                    .addComponent(lblFechaAperturaVariable)
                    .addComponent(lblFechaCierreVariable))
                .addGap(41, 41, 41)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtReportadoPor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblReportadoPor)
                    .addComponent(lblEstadoIncidente)
                    .addComponent(cbEstadoIncidente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAsignadoA)
                    .addComponent(txtAsignadoA1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrioridadIncidente)
                    .addComponent(cbPrioridadIncidente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblDescripcionIncidente)
                        .addGap(114, 114, 114))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtActivoAfectado, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblReportadoPor2))
                        .addGap(62, 62, 62)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarIncidente)
                    .addComponent(btnActualizarIncidente))
                .addGap(77, 77, 77)
                .addComponent(btnIniciarChat)
                .addContainerGap(91, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
        );

        jTabbedPane1.addTab("Incidentes", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Usuarios");

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

    private void txtBusquedaFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusquedaFinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusquedaFinalActionPerformed

    private void txtTituloIncidenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloIncidenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloIncidenteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarFinal;
    private javax.swing.JButton btnActualizarIncidente;
    private javax.swing.JButton btnAgregarIncidente;
    private javax.swing.JButton btnBuscarFinal;
    private javax.swing.JButton btnIniciarChat;
    private javax.swing.JComboBox<String> cbEstadoIncidente;
    private javax.swing.JComboBox<String> cbPrioridadIncidente;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblAsignadoA;
    private javax.swing.JLabel lblBusquedaNombreFinal;
    private javax.swing.JLabel lblDepartamentoFinalTitulo;
    private javax.swing.JLabel lblDepartamentoTecnicoVariable;
    private javax.swing.JLabel lblDescripcionIncidente;
    private javax.swing.JLabel lblEstadoIncidente;
    private javax.swing.JLabel lblFechaAperturaTitulo;
    private javax.swing.JLabel lblFechaAperturaVariable;
    private javax.swing.JLabel lblFechaCierreTitulo;
    private javax.swing.JLabel lblFechaCierreVariable;
    private javax.swing.JLabel lblFinalApellido1;
    private javax.swing.JLabel lblFinalApellido2;
    private javax.swing.JLabel lblFinalContrasena;
    private javax.swing.JLabel lblFinalCorreo;
    private javax.swing.JLabel lblFinalNombre;
    private javax.swing.JLabel lblNombreUsuarioFinal;
    private javax.swing.JLabel lblPrioridadIncidente;
    private javax.swing.JLabel lblPuestoFinalTitulo;
    private javax.swing.JLabel lblPuestoTecnicoVariable;
    private javax.swing.JLabel lblReportadoPor;
    private javax.swing.JLabel lblReportadoPor2;
    private javax.swing.JLabel lblTecnicoUsuarioVariable;
    private javax.swing.JLabel lblTituloIncidente;
    private javax.swing.JTable tblMisIncidentes;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtActivoAfectado;
    private javax.swing.JTextField txtAsignadoA1;
    private javax.swing.JTextField txtBusquedaFinal;
    private javax.swing.JPasswordField txtContrasenaTecnicoUpdate;
    private javax.swing.JTextArea txtDescripcionIncidente;
    private javax.swing.JTextField txtReportadoPor;
    private javax.swing.JTextField txtTecnicoApellido1;
    private javax.swing.JTextField txtTecnicoApellido2;
    private javax.swing.JTextField txtTecnicoCorreo;
    private javax.swing.JTextField txtTecnicoNombre;
    private javax.swing.JTextField txtTituloIncidente;
    // End of variables declaration//GEN-END:variables
}
