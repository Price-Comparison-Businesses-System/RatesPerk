/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import Business.ItemCatalogue.Items;
import Business.ItemCatalogue.ItemsDirectory;
import Business.Network.Network;
import Business.Organization.Organization;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author sakshi
 */
public class ClothingJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ClothingJPanel
     */
     private JPanel userProcessContainer;
        private EcoSystem ecosystem;
        private Customer customer;
        private Items items;
        private ItemsDirectory itemsDirectory;
        
	public ClothingJPanel(JPanel userProcessContainer, EcoSystem ecosystem, Customer customer ) {
            initComponents();
            this.userProcessContainer = userProcessContainer;
            this.ecosystem = ecosystem;
            this.customer = customer;
            
           //  ;
            
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
        clothingJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        transportsearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        clothingjComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        clothingJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                " Item name", "Description", "Price", "services F/R/T", "State", "Vendor name", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(clothingJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 209, 796, 248));

        jLabel1.setText("Services :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 70, 19));

        transportsearch.setText("ss");
        add(transportsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 160, -1));

        jLabel2.setText("Search :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, -1, -1));

        clothingjComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buy Fabric", "Readymade cloths", "Tailor services" }));
        clothingjComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clothingjComboBox1ActionPerformed(evt);
            }
        });
        clothingjComboBox1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                clothingjComboBox1KeyPressed(evt);
            }
        });
        add(clothingjComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 160, -1));

        jLabel3.setText("Clothing");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, -1));

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void clothingjComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clothingjComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clothingjComboBox1ActionPerformed

    private void clothingjComboBox1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_clothingjComboBox1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_clothingjComboBox1KeyPressed

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
    private javax.swing.JTable clothingJTable;
    private javax.swing.JComboBox<String> clothingjComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField transportsearch;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
          for(Network n: ecosystem.getNetworkList()){
           for(Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()){
             if(e.getEnterpriseType().toString().equals("Clothing")){
               
               
                      itemsDirectory=e.getItemsDirectory();
                  
              }
             
           }
          
          }
      DefaultTableModel model = (DefaultTableModel) clothingJTable.getModel();
        model.setRowCount(0);
        
        System.out.println(itemsDirectory.getItemsList());
        for(Items i : itemsDirectory.getItemsList()){
            
            Object[] row = new Object[7];
            row[0] = i.getName();
            row[1] = i.getDesc();
            row[2] = i.getPrice();
            row[3] = i.getServices();
            row[4] = i.getState();
            row[5] = i.getSellertailorname();
            row[6] = i.getQuantity();
            
            
            
            model.addRow(row);
            
        }
    }
}
