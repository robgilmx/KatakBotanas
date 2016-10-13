/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Bernardo Espinoza
 */
public class vistaClientes extends javax.swing.JFrame {
    private JPanel panelBase;
    private JPanel panelPrincipal;
    private JPanel panelAgregarCliente;
    private JPanel panelEliminarCliente;
    private CardLayout cl;
    
    private javax.swing.JScrollPane AdminClientesScrollPanel;
    private javax.swing.JButton BotonBorrar;
    private javax.swing.JButton BotonAgregar;
    private javax.swing.JButton BotonEditar;
    private javax.swing.JTable TablaListaClientes;
    private javax.swing.JScrollPane patientListScrollPane;
    
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JTextField DireccionTextField;
    private javax.swing.JLabel LabelDireccion;
    private javax.swing.JLabel LabelNombre;
    private javax.swing.JLabel LabelTelefono;
    private javax.swing.JTextField NombreTextField;
    private javax.swing.JTextField TelefonoTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    

    /**
     * Creates new form vistaCliente
     */
    public vistaClientes() {
        //initComponents();
        panelBase=new JPanel();  
        cl=new CardLayout();
        panelBase.setLayout(cl);
                      
        panelPrincipal=new JPanel();
        panelAgregarCliente=new JPanel();
        
        inicializarPanelPrincipal();
        inicializarPanelAgregarCliente();
        
        
        panelBase.add(panelPrincipal,"1");
        panelBase.add(panelAgregarCliente,"2");
        
        cl.show(panelBase, "1");
        
        BotonAgregar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(panelBase, "2");
            }
            
        });
        
        BotonEditar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(panelBase, "2");
            }
            
        });
        
        BotonGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(panelBase, "1");
            }
        });
        add(panelBase);
        pack();
    }
    
    private void inicializarPanelPrincipal(){
        panelPrincipal = new javax.swing.JPanel();
        BotonAgregar = new javax.swing.JButton();
        BotonEditar = new javax.swing.JButton();
        BotonBorrar = new javax.swing.JButton();
        AdminClientesScrollPanel = new javax.swing.JScrollPane();
        TablaListaClientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder("Administrar Clientes"));

        BotonAgregar.setText("Agregar");

        BotonEditar.setText("Editar");

        BotonBorrar.setText("Borrar");
        
        TablaListaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"w", "e", null},
                {"r", "w", "w"}
            },
            new String [] {
                "Nombre", "Direccion", "Telefono"
            }
        ));

        AdminClientesScrollPanel.setViewportView(TablaListaClientes);
        if (TablaListaClientes.getColumnModel().getColumnCount() > 0) {
            TablaListaClientes.getColumnModel().getColumn(0).setHeaderValue("Nombre");
            TablaListaClientes.getColumnModel().getColumn(1).setHeaderValue("Direccion");
            TablaListaClientes.getColumnModel().getColumn(2).setHeaderValue("Telefono");
        }

        javax.swing.GroupLayout AdminClientesPanelLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(AdminClientesPanelLayout);
        AdminClientesPanelLayout.setHorizontalGroup(AdminClientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminClientesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AdminClientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AdminClientesScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(AdminClientesPanelLayout.createSequentialGroup()
                        .addComponent(BotonAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonBorrar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AdminClientesPanelLayout.setVerticalGroup(AdminClientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminClientesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AdminClientesScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(AdminClientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonAgregar)
                    .addComponent(BotonEditar)
                    .addComponent(BotonBorrar))
                .addContainerGap())
        );

//        pack();
    }
    
    private void inicializarPanelAgregarCliente(){
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        panelAgregarCliente = new javax.swing.JPanel();
        LabelNombre = new javax.swing.JLabel();
        LabelDireccion = new javax.swing.JLabel();
        LabelTelefono = new javax.swing.JLabel();
        DireccionTextField = new javax.swing.JTextField();
        TelefonoTextField = new javax.swing.JTextField();
        NombreTextField = new javax.swing.JTextField();
        BotonGuardar = new javax.swing.JButton();
        BotonCancelar = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelAgregarCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Cliente"));

        LabelNombre.setText("Nombre");

        LabelDireccion.setText("Dirección");

        LabelTelefono.setText("Telefono");

        BotonGuardar.setText("Guardar");
        
        BotonCancelar.setText("Cancelar");

        javax.swing.GroupLayout DatosClientePanelLayout = new javax.swing.GroupLayout(panelAgregarCliente);
        panelAgregarCliente.setLayout(DatosClientePanelLayout);
        DatosClientePanelLayout.setHorizontalGroup(DatosClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosClientePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DatosClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DatosClientePanelLayout.createSequentialGroup()
                        .addComponent(LabelDireccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DireccionTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE))
                    .addGroup(DatosClientePanelLayout.createSequentialGroup()
                        .addComponent(LabelTelefono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TelefonoTextField))
                    .addGroup(DatosClientePanelLayout.createSequentialGroup()
                        .addComponent(LabelNombre)
                        .addGap(9, 9, 9)
                        .addComponent(NombreTextField))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DatosClientePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BotonGuardar)
                        .addGap(31, 31, 31)
                        .addComponent(BotonCancelar)))
                .addContainerGap())
        );
        DatosClientePanelLayout.setVerticalGroup(DatosClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosClientePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DatosClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNombre)
                    .addComponent(NombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DatosClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelDireccion)
                    .addComponent(DireccionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DatosClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelTelefono)
                    .addComponent(TelefonoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(DatosClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonGuardar)
                    .addComponent(BotonCancelar))
                .addContainerGap())
        );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(vistaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
