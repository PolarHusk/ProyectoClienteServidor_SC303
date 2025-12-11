/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Modelo.*;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextArea;
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
     *
     * @param logueado
     */
    public VistaTecnico(Usuario logueado) {
        initComponents();
        this.logueado = logueado;
        txtDescripcionIncidente.setEditable(false);
    }

    public JButton getBtnChatEnVivo() {
        return btnChatEnVivo;
    }

    public void setBtnChatEnVivo(JButton btnChatEnVivo) {
        this.btnChatEnVivo = btnChatEnVivo;
    }

    public JButton getBtnActualizarIncidente() {
        return btnActualizarIncidente;
    }

    public void setBtnActualizarIncidente(JButton btnActualizarIncidente) {
        this.btnActualizarIncidente = btnActualizarIncidente;
    }

    public JButton getBtnBuscarIncidente() {
        return btnBuscarIncidente;
    }

    public void setBtnBuscarIncidente(JButton btnBuscarIncidente) {
        this.btnBuscarIncidente = btnBuscarIncidente;
    }

    public JComboBox<String> getCbEstadoIncidenteTecnico() {
        return cbEstadoIncidenteTecnico;
    }

    public void setCbEstadoIncidenteTecnico(JComboBox<String> cbEstadoIncidenteTecnico) {
        this.cbEstadoIncidenteTecnico = cbEstadoIncidenteTecnico;
    }

    public JComboBox<String> getCbPrioridadIncidenteTecnico() {
        return cbPrioridadIncidenteTecnico;
    }

    public void setCbPrioridadIncidenteTecnico(JComboBox<String> cbPrioridadIncidenteTecnico) {
        this.cbPrioridadIncidenteTecnico = cbPrioridadIncidenteTecnico;
    }

    public JLabel getLblActivoImpactadoVariable() {
        return lblActivoImpactadoVariable;
    }

    public void setLblActivoImpactadoVariable(JLabel lblActivoImpactadoVariable) {
        this.lblActivoImpactadoVariable = lblActivoImpactadoVariable;
    }

    public JTextField getTxtAsignadoA() {
        return txtAsignadoA;
    }

    public void setTxtAsignadoA(JTextField txtAsignadoA) {
        this.txtAsignadoA = txtAsignadoA;
    }

    public JTextField getTxtBusquedaIncidenteId() {
        return txtBusquedaIncidenteId;
    }

    public void setTxtBusquedaIncidenteId(JTextField txtBusquedaIncidenteId) {
        this.txtBusquedaIncidenteId = txtBusquedaIncidenteId;
    }

    public JMenuItem getmCerrarSesion() {
        return mCerrarSesion;
    }

    public JTextArea getTxtDescripcionIncidente() {
        return txtDescripcionIncidente;
    }




    public JLabel getLblFechaAperturaVariable() {
        return lblFechaAperturaVariable;
    }

    public void setLblFechaAperturaVariable(JLabel lblFechaAperturaVariable) {
        this.lblFechaAperturaVariable = lblFechaAperturaVariable;
    }

    public JLabel getLblFechaCierreVariable() {
        return lblFechaCierreVariable;
    }

    public void setLblFechaCierreVariable(JLabel lblFechaCierreVariable) {
        this.lblFechaCierreVariable = lblFechaCierreVariable;
    }

    public JLabel getLblReportadoPorVariable() {
        return lblReportadoPorVariable;
    }

    public void setLblReportadoPorVariable(JLabel lblReportadoPorVariable) {
        this.lblReportadoPorVariable = lblReportadoPorVariable;
    }

    public JLabel getLblTituloIncidenteVariable() {
        return lblTituloIncidenteVariable;
    }

    public void setLblTituloIncidenteVariable(JLabel lblTituloIncidenteVariable) {
        this.lblTituloIncidenteVariable = lblTituloIncidenteVariable;
    }

    public JTable getTblIncidentes() {
        return tblIncidentes;
    }

    public void setTblIncidentes(JTable tblIncidentes) {
        this.tblIncidentes = tblIncidentes;
    }

    public JTextField getTxtReportadoPor() {
        return txtBusquedaIncidenteId;
    }

    public void setTxtReportadoPor(JTextField txtReportadoPor) {
        this.txtBusquedaIncidenteId = txtReportadoPor;
    }

    public Usuario getLogueado() {
        return logueado;
    }

    public String getPass() {
        return String.valueOf(txtContrasenaTecnicoUpdate.getPassword());
    }

    public String getBusquedaUsuario() {
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
        jPanel3 = new javax.swing.JPanel();
        lblTituloIncidente = new javax.swing.JLabel();
        lblFechaAperturaTitulo = new javax.swing.JLabel();
        lblFechaAperturaVariable = new javax.swing.JLabel();
        lblFechaCierreTitulo = new javax.swing.JLabel();
        lblFechaCierreVariable = new javax.swing.JLabel();
        lblTituloIncidenteVariable = new javax.swing.JLabel();
        lblReportadoPorTitulo = new javax.swing.JLabel();
        lblReportadoPorVariable = new javax.swing.JLabel();
        lblAsignadoATitulo = new javax.swing.JLabel();
        lblActivoImpactadoVariable = new javax.swing.JLabel();
        lblActivoImpactadoTitulo = new javax.swing.JLabel();
        lblBuscarIncidentePorID = new javax.swing.JLabel();
        lblEstadoIncidenteTitulo = new javax.swing.JLabel();
        cbEstadoIncidenteTecnico = new javax.swing.JComboBox<>();
        cbPrioridadIncidenteTecnico = new javax.swing.JComboBox<>();
        lblPrioridadIncidenteTitulo = new javax.swing.JLabel();
        btnActualizarIncidente = new javax.swing.JButton();
        lblDescripcionIncidenteTitulo1 = new javax.swing.JLabel();
        txtBusquedaIncidenteId = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblIncidentes = new javax.swing.JTable();
        btnBuscarIncidente = new javax.swing.JButton();
        btnChatEnVivo = new javax.swing.JButton();
        txtAsignadoA = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtDescripcionIncidente = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mCerrarSesion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tecnico");
        setBounds(new java.awt.Rectangle(0, 0, 700, 700));

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
                .addGap(113, 193, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 952, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addContainerGap(360, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );

        jTabbedPane1.addTab("Usuario", jPanel1);

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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBuscarActivoTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblEstadoActivoTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblDepartamentoTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblUbicacionActivoTecnico)
                                            .addComponent(lblOSActivoTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblIPActivoTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblNombreActivoTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(lblTipoDeActivoTecnicoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                        .addComponent(lblTipoDeActivoTecnicoVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblBusquedaNombreActivoTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(txtBusquedaNombreActivoTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 378, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 813, Short.MAX_VALUE))
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
                .addGap(73, 73, 73)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTipoDeActivoTecnicoVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipoDeActivoTecnicoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(167, 167, 167)
                .addComponent(btnModificarActivoTecnico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBusquedaNombreActivoTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBusquedaNombreActivoTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(btnBuscarActivoTecnico)
                .addGap(73, 73, 73))
        );

        jTabbedPane1.addTab("Activos", jPanel2);

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(1517, 1000));

        lblTituloIncidente.setBackground(new java.awt.Color(255, 255, 255));
        lblTituloIncidente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTituloIncidente.setForeground(new java.awt.Color(0, 0, 0));
        lblTituloIncidente.setText("Titulo del Incidente : ");

        lblFechaAperturaTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblFechaAperturaTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFechaAperturaTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblFechaAperturaTitulo.setText("Fecha Apertura: ");

        lblFechaAperturaVariable.setBackground(new java.awt.Color(255, 255, 255));
        lblFechaAperturaVariable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFechaAperturaVariable.setForeground(new java.awt.Color(0, 0, 0));

        lblFechaCierreTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblFechaCierreTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFechaCierreTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblFechaCierreTitulo.setText("Fecha Cierre: ");

        lblFechaCierreVariable.setBackground(new java.awt.Color(255, 255, 255));
        lblFechaCierreVariable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFechaCierreVariable.setForeground(new java.awt.Color(0, 0, 0));

        lblTituloIncidenteVariable.setBackground(new java.awt.Color(255, 255, 255));
        lblTituloIncidenteVariable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTituloIncidenteVariable.setForeground(new java.awt.Color(0, 0, 0));

        lblReportadoPorTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblReportadoPorTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblReportadoPorTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblReportadoPorTitulo.setText("Reportado por:");

        lblReportadoPorVariable.setBackground(new java.awt.Color(255, 255, 255));
        lblReportadoPorVariable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblReportadoPorVariable.setForeground(new java.awt.Color(0, 0, 0));

        lblAsignadoATitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblAsignadoATitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAsignadoATitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblAsignadoATitulo.setText("Asignado a: ");

        lblActivoImpactadoVariable.setBackground(new java.awt.Color(255, 255, 255));
        lblActivoImpactadoVariable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblActivoImpactadoVariable.setForeground(new java.awt.Color(0, 0, 0));

        lblActivoImpactadoTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblActivoImpactadoTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblActivoImpactadoTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblActivoImpactadoTitulo.setText("Activo impactado: ");

        lblBuscarIncidentePorID.setBackground(new java.awt.Color(255, 255, 255));
        lblBuscarIncidentePorID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblBuscarIncidentePorID.setForeground(new java.awt.Color(0, 0, 0));
        lblBuscarIncidentePorID.setText("Buscar Incidente por ID: ");

        lblEstadoIncidenteTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblEstadoIncidenteTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEstadoIncidenteTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblEstadoIncidenteTitulo.setText("Estado del incidente: ");

        cbEstadoIncidenteTecnico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ABIERTO", "EN_PROCESO", "RESUELTO", "CANCELADO" }));

        cbPrioridadIncidenteTecnico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BAJA", "MEDIA", "ALTA", "CRITICA" }));

        lblPrioridadIncidenteTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblPrioridadIncidenteTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPrioridadIncidenteTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblPrioridadIncidenteTitulo.setText("Prioridad:");

        btnActualizarIncidente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnActualizarIncidente.setText("Actualizar");

        lblDescripcionIncidenteTitulo1.setBackground(new java.awt.Color(255, 255, 255));
        lblDescripcionIncidenteTitulo1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDescripcionIncidenteTitulo1.setForeground(new java.awt.Color(0, 0, 0));
        lblDescripcionIncidenteTitulo1.setText("Descripcion del incidente:");

        tblIncidentes.setModel(new javax.swing.table.DefaultTableModel(
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
        tblIncidentes.setMaximumSize(new java.awt.Dimension(2147483647, 1000));
        tblIncidentes.setPreferredSize(new java.awt.Dimension(300, 100));
        jScrollPane3.setViewportView(tblIncidentes);

        btnBuscarIncidente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscarIncidente.setText("Buscar");

        btnChatEnVivo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnChatEnVivo.setText("Iniciar Chat");

        txtDescripcionIncidente.setColumns(20);
        txtDescripcionIncidente.setRows(5);
        jScrollPane4.setViewportView(txtDescripcionIncidente);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblTituloIncidente, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTituloIncidenteVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblFechaAperturaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFechaAperturaVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblDescripcionIncidenteTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAsignadoATitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblActivoImpactadoTitulo)
                            .addComponent(lblReportadoPorTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblActivoImpactadoVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtAsignadoA, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                                    .addComponent(lblReportadoPorVariable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(96, 96, 96)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnChatEnVivo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(lblEstadoIncidenteTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(88, 88, 88)
                                                .addComponent(cbEstadoIncidenteTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(lblFechaCierreTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(lblFechaCierreVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(lblPrioridadIncidenteTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(91, 91, 91)
                                                .addComponent(cbPrioridadIncidenteTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(2, 2, 2))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addGap(230, 230, 230)
                                        .addComponent(btnActualizarIncidente, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnBuscarIncidente, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(lblBuscarIncidentePorID, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtBusquedaIncidenteId, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(82, 82, 82)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTituloIncidente, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(lblTituloIncidenteVariable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblFechaCierreVariable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblFechaAperturaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblFechaCierreTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblFechaAperturaVariable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnChatEnVivo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblEstadoIncidenteTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbEstadoIncidenteTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblReportadoPorVariable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(44, 44, 44)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrioridadIncidenteTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbPrioridadIncidenteTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAsignadoATitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAsignadoA, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addComponent(btnActualizarIncidente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblActivoImpactadoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblActivoImpactadoVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblReportadoPorTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescripcionIncidenteTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuscarIncidentePorID, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBusquedaIncidenteId, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84)
                .addComponent(btnBuscarIncidente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(297, 297, 297))
            .addComponent(jScrollPane3)
        );

        jTabbedPane1.addTab("Incidentes", jPanel3);
        jPanel3.getAccessibleContext().setAccessibleParent(jTabbedPane1);

        jMenu1.setText("Sesion");

        mCerrarSesion.setText("Cerrar Sesion");
        jMenu1.add(mCerrarSesion);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

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
    private javax.swing.JButton btnActualizarIncidente;
    private javax.swing.JButton btnActualizarTecnico;
    private javax.swing.JButton btnBuscarActivoTecnico;
    private javax.swing.JButton btnBuscarIncidente;
    private javax.swing.JButton btnBuscarTecnico;
    private javax.swing.JButton btnChatEnVivo;
    private javax.swing.JButton btnModificarActivoTecnico;
    private javax.swing.JComboBox<String> cbEstadoActivoTecnico;
    private javax.swing.JComboBox<String> cbEstadoIncidenteTecnico;
    private javax.swing.JComboBox<String> cbPrioridadIncidenteTecnico;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblActivoImpactadoTitulo;
    private javax.swing.JLabel lblActivoImpactadoVariable;
    private javax.swing.JLabel lblActivoNombreVariable;
    private javax.swing.JLabel lblAsignadoATitulo;
    private javax.swing.JLabel lblBuscarIncidentePorID;
    private javax.swing.JLabel lblBusquedaNombreActivoTecnico;
    private javax.swing.JLabel lblBusquedaNombreTecnico;
    private javax.swing.JLabel lblDepartamentoActivoTecnicoVariable;
    private javax.swing.JLabel lblDepartamentoTecnico;
    private javax.swing.JLabel lblDepartamentoTecnicoTitulo;
    private javax.swing.JLabel lblDepartamentoTecnicoVariable;
    private javax.swing.JLabel lblDescripcionIncidenteTitulo1;
    private javax.swing.JLabel lblEstadoActivoTecnico;
    private javax.swing.JLabel lblEstadoIncidenteTitulo;
    private javax.swing.JLabel lblFechaAperturaTitulo;
    private javax.swing.JLabel lblFechaAperturaVariable;
    private javax.swing.JLabel lblFechaCierreTitulo;
    private javax.swing.JLabel lblFechaCierreVariable;
    private javax.swing.JLabel lblIPActivoTecnico;
    private javax.swing.JLabel lblIPActivoTecnicoVariable;
    private javax.swing.JLabel lblNombreActivoTecnico;
    private javax.swing.JLabel lblNombreUsuarioTecnico;
    private javax.swing.JLabel lblOSActivoTecnico;
    private javax.swing.JLabel lblOSActivoTecnicoVariable;
    private javax.swing.JLabel lblPrioridadIncidenteTitulo;
    private javax.swing.JLabel lblPuestoTecnicoTitulo;
    private javax.swing.JLabel lblPuestoTecnicoVariable;
    private javax.swing.JLabel lblReportadoPorTitulo;
    private javax.swing.JLabel lblReportadoPorVariable;
    private javax.swing.JLabel lblTecnicoApellido1;
    private javax.swing.JLabel lblTecnicoApellido2;
    private javax.swing.JLabel lblTecnicoContrasena;
    private javax.swing.JLabel lblTecnicoCorreo;
    private javax.swing.JLabel lblTecnicoNombre;
    private javax.swing.JLabel lblTecnicoUsuarioVariable;
    private javax.swing.JLabel lblTipoDeActivoTecnicoTitulo;
    private javax.swing.JLabel lblTipoDeActivoTecnicoVariable;
    private javax.swing.JLabel lblTituloIncidente;
    private javax.swing.JLabel lblTituloIncidenteVariable;
    private javax.swing.JLabel lblUbicacionActivoTecnico;
    private javax.swing.JLabel lblUbicacionActivoTecnicoVariable;
    private javax.swing.JMenuItem mCerrarSesion;
    private javax.swing.JTable tblActivos;
    private javax.swing.JTable tblIncidentes;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtAsignadoA;
    private javax.swing.JTextField txtBusquedaIncidenteId;
    private javax.swing.JTextField txtBusquedaNombreActivoTecnico;
    private javax.swing.JTextField txtBusquedaTecnico;
    private javax.swing.JPasswordField txtContrasenaTecnicoUpdate;
    private javax.swing.JTextArea txtDescripcionIncidente;
    private javax.swing.JTextField txtTecnicoApellido1;
    private javax.swing.JTextField txtTecnicoApellido2;
    private javax.swing.JTextField txtTecnicoCorreo;
    private javax.swing.JTextField txtTecnicoNombre;
    // End of variables declaration//GEN-END:variables
}
