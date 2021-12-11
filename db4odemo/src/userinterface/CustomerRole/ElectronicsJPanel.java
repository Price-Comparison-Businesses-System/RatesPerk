/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Customer.CustomerDirectory;
import Business.Enterprise.Enterprise;
import Business.ItemCatalogue.Items;
import Business.ItemCatalogue.ItemsDirectory;
import Business.Network.Network;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sakshi
 */
public class ElectronicsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ClothingJPanel
     */
     private JPanel userProcessContainer;
        private EcoSystem ecosystem;
        private Customer customer;
        private Items items;
        private ItemsDirectory itemsDirectory;
        
	public ElectronicsJPanel(JPanel userProcessContainer, EcoSystem ecosystem, Customer customer) {
            initComponents();
            this.userProcessContainer = userProcessContainer;
            this.ecosystem = ecosystem;
            this.customer = customer;
            populateTable();
            
	}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        electronicsJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        transportsearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        electonicsjComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        electronicsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Cloth Type", "Service", "Description", "Price", "Quantity", "Selller Name", "State"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(electronicsJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 796, 248));

        jLabel1.setText("Services :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 70, 19));

        transportsearch.setText("ss");
        add(transportsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 160, -1));

        jLabel2.setText("Search :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, -1, -1));

        electonicsjComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Electronics kit", "Spare parts", "Accessories" }));
        electonicsjComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                electonicsjComboBox1ActionPerformed(evt);
            }
        });
        electonicsjComboBox1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                electonicsjComboBox1KeyPressed(evt);
            }
        });
        add(electonicsjComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 150, -1));

        jLabel3.setText("Electronics");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, -1));

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void electonicsjComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_electonicsjComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_electonicsjComboBox1ActionPerformed

    private void electonicsjComboBox1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_electonicsjComboBox1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_electonicsjComboBox1KeyPressed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        //            CustomerWorkAreaJPanel custAreajp = (CustomerWorkAreaJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox<String> electonicsjComboBox1;
    private javax.swing.JTable electronicsJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField transportsearch;
    // End of variables declaration//GEN-END:variables
 private void populateTable() {
          for(Network n: ecosystem.getNetworkList()){
           for(Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()){
             if(e.getEnterpriseType().toString().equals("Electronics")){
               
               
                      itemsDirectory=e.getItemsDirectory();
                  
              }
             
           }
          
          }
      DefaultTableModel model = (DefaultTableModel) electronicsJTable.getModel();
        model.setRowCount(0);
        
        System.out.println(itemsDirectory.getItemsList());
        for(Items i : itemsDirectory.getItemsList()){
            
            Object[] row = new Object[7];
             row[0] = i.getItemname();
            row[1] = i.getItemdesc();
            row[2] = i.getItemprice();
//            row[3] = i.getItemservices();
//            row[4] = i.getItemstate();
//            row[5] = i.getItemsellertailorname();
            row[6] = i.getItemquantity();
            
            
            
            model.addRow(row);
            
        }
    }
}
