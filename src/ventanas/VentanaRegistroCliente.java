/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.BorderLayout;

/**
 *
 * @author Grupo#3
 */
public class VentanaRegistroCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form VentanaRegistroCliente
     */
    private RegistroCliente rc;
    public VentanaRegistroCliente(boolean paginador) {
        initComponents();
       rc = new RegistroCliente(this);
       this.setLayout(new BorderLayout());
       this.add(rc, BorderLayout.CENTER);       
       this.setVisible(true);
       this.setSize(600, 350);
       this.setClosable(true);
       this.setIconifiable(true);
       this.setResizable(false);
       this.setVisible(true);
       rc.habilitarPaginador(paginador);
    }    
   
    public void resetearPaginadorCliente()
    {
        rc.resetPosicionRegistro();
    }
    
    public RegistroCliente getPanelRegistro()
    {
        return rc;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setTitle("Registro de Clientes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
