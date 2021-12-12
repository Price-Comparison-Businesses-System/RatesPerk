/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Network.Network;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sakshi
 * @author  tarushukla
 */
public class ManageNetworkJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageNetworkJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;

    /**
     *
     * Creates new form ManageNetworkJPanel
     */
    public ManageNetworkJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.system = system;
          populateNetworkTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNetwork = new javax.swing.JTable();
        btnAddNetwork = new javax.swing.JButton();
        btnDeleteNetwrok = new javax.swing.JButton();
        txtNetwork = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("OUR Network");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));

        tblNetwork.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "State ->Network"
            }
        ));
        jScrollPane1.setViewportView(tblNetwork);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 95, 375, 155));

        btnAddNetwork.setText("Add Network");
        btnAddNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNetworkActionPerformed(evt);
            }
        });
        add(btnAddNetwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 323, -1, -1));

        btnDeleteNetwrok.setText("Delete Network");
        btnDeleteNetwrok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteNetwrokActionPerformed(evt);
            }
        });
        add(btnDeleteNetwrok, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 323, -1, -1));
        add(txtNetwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 279, 108, -1));

        jLabel2.setText("State Netwrok Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 284, -1, -1));

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNetworkActionPerformed
        // TODO add your handling code here:
        String name;
        if(!txtNetwork.getText().isEmpty()){
               name = txtNetwork.getText();
          }
          else{
               JOptionPane.showMessageDialog(this, "Network name is empty","ERROR",JOptionPane.ERROR_MESSAGE);
               return;
        }
        boolean flag;
        flag = name.matches("(?i)(^[a-z])((?![ .,'-]$)[a-z .,'-]){0,24}$");

        if(!flag) {
            JOptionPane.showMessageDialog(this, "Enter valid Network name");
            return;
        }
        Network network = system.createAndAddNetwork();
        network.setName(name);
	    JOptionPane.showMessageDialog(btnAddNetwork, "Network Added Successfully");
	    

        populateNetworkTable();
	
	txtNetwork.setText("");
    }//GEN-LAST:event_btnAddNetworkActionPerformed

    private void btnDeleteNetwrokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteNetwrokActionPerformed
        // TODO add your handling code here:
        int selectedrow = tblNetwork.getSelectedRow();
        if(selectedrow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String name = tblNetwork.getValueAt(selectedrow, 0).toString();
        Network n = system.getNetwork(name);
        system.removeNetwork(n);
        populateNetworkTable();
    }//GEN-LAST:event_btnDeleteNetwrokActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
          SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNetwork;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeleteNetwrok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblNetwork;
    private javax.swing.JTextField txtNetwork;
    // End of variables declaration//GEN-END:variables

    private void populateNetworkTable() {
    
    DefaultTableModel model = (DefaultTableModel) tblNetwork.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            Object[] row = new Object[1];
            row[0] = network.getName();
            model.addRow(row);
        }
    }
}
