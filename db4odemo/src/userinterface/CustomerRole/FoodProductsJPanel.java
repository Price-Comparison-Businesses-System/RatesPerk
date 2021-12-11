
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.EcoSystem;
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
public class FoodProductsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ClothingJPanel
     */
     private JPanel userProcessContainer;
        private EcoSystem ecosystem;
        private Customer customer;
        private Items items;
        private ItemsDirectory itemsDirectory;
        
	public FoodProductsJPanel(JPanel userProcessContainer, EcoSystem ecosystem, Customer customer) {
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
        foodProductsTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        transportsearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        foodProductsjComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        foodProductsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Item Type", "Description", "Price", "Service", "Quantity", "Vendor Name", "State"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(foodProductsTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 209, 796, 248));

        jLabel1.setText("Services :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 70, 19));

        transportsearch.setText("ss");
        add(transportsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 160, -1));

        jLabel2.setText("Search :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, -1, -1));

        foodProductsjComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Restaurants", "Veggies/Fruits", "Frozen/Packaged" }));
        foodProductsjComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodProductsjComboBox1ActionPerformed(evt);
            }
        });
        foodProductsjComboBox1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                foodProductsjComboBox1KeyPressed(evt);
            }
        });
        add(foodProductsjComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 170, -1));

        jLabel3.setText("Food Products");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, -1));

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void foodProductsjComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodProductsjComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_foodProductsjComboBox1ActionPerformed

    private void foodProductsjComboBox1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_foodProductsjComboBox1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_foodProductsjComboBox1KeyPressed

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
    private javax.swing.JTable foodProductsTable;
    private javax.swing.JComboBox<String> foodProductsjComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField transportsearch;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
    for(Network n: ecosystem.getNetworkList()){
           for(Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()){
             if(e.getEnterpriseType().toString().equals("FoodProducts")){
               
               
                      itemsDirectory=e.getItemsDirectory();
                  
              }
             
           }
          
          }
      DefaultTableModel model = (DefaultTableModel) foodProductsTable.getModel();
        model.setRowCount(0);
        
        System.out.println(itemsDirectory.getItemsList());
        for(Items i : itemsDirectory.getItemsList()){
//            if((i.getServices()).toLowerCase() == "restaurant" || (i.getServices()).toLowerCase() == "veggies/fruits" || (i.getServices()).toLowerCase() == "frozen/packaged" )
//            {
            Object[] row = new Object[7];
             row[0] = i.getItemname();
            row[1] = i.getItemdesc();
            row[2] = i.getItemprice();
//            row[3] = i.getItemservices();
//            row[4] = i.getItemstate();
//            row[5] = i.getItemsellertailorname();
            row[6] = i.getItemquantity();
            
            
            
            model.addRow(row);
           // }
    }
    }
}
