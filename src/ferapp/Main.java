
package ferapp;


//import java.awt.BorderLayout;
//import javax.swing.JFrame;
//import javax.swing.JInternalFrame;
//import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
//import javax.swing.SwingUtilities;
import ventanas.AdministradorVentanas;
//import ventanas.JFacturas;
//import ventanas.RegistroCliente;
//import ventanas.VentanaRegistroCliente;


public class Main extends javax.swing.JFrame {

    
    public Main() {
        initComponents(); 
        this.setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mVendedor = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        mClientes = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        mFacturas = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Facturacion APR");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jDesktopPane1.setPreferredSize(new java.awt.Dimension(600, 400));
        getContentPane().add(jDesktopPane1, java.awt.BorderLayout.CENTER);

        mVendedor.setText("Vendedores");

        jMenuItem3.setText("Registrar Vendedor");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        mVendedor.add(jMenuItem3);

        jMenuBar1.add(mVendedor);

        mClientes.setText("Clientes");

        jMenuItem2.setText("Cliente Nuevo");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        mClientes.add(jMenuItem2);

        jMenuBar1.add(mClientes);

        mFacturas.setText("Facturas");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem1.setText("Nueva Factura");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mFacturas.add(jMenuItem1);

        jMenuBar1.add(mFacturas);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
         AdministradorVentanas.mostrarVentanaFactura(jDesktopPane1);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        AdministradorVentanas.mostrarClienteRegistro(jDesktopPane1, true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        AdministradorVentanas.mostrarVentanaVendedor(jDesktopPane1);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
      int op =  finalizar();
      if(op == JOptionPane.OK_OPTION)
        {
            System.exit(0);
        }
        
    }//GEN-LAST:event_formWindowClosing

    public int finalizar()
    {
        return JOptionPane.showConfirmDialog(this, "Si existe algun dato sin guardar "
                + "se perder??n.\n ??Desea salir del programa?");
    }
    
   
    public static void main(String args[]) {
       

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenu mClientes;
    private javax.swing.JMenu mFacturas;
    private javax.swing.JMenu mVendedor;
    // End of variables declaration//GEN-END:variables
}
