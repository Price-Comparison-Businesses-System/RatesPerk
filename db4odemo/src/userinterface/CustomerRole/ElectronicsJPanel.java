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
import Business.Orders.Orders;
import java.awt.CardLayout;
import java.awt.Component;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import javax.swing.JOptionPane;
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
         private ArrayList<Items> orderItems = new ArrayList<Items>();
         private ArrayList<Orders> orderplaced = new ArrayList<Orders>();
        private Enterprise enterprise;
         private Orders order;
        
	public ElectronicsJPanel(JPanel userProcessContainer, EcoSystem ecosystem, Customer customer, Enterprise enterprise ) {
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
        searchcombo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        searchelectronicsJTable1 = new javax.swing.JTable();

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 790, 160));

        jLabel1.setText("Services :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 70, 19));

        transportsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transportsearchActionPerformed(evt);
            }
        });
        add(transportsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 160, -1));

        jLabel2.setText("Search :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, -1, -1));

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

        electronicsJTableCart.setModel(new javax.swing.table.DefaultTableModel(
        searchcombo.setText("Search");
        searchcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchcomboActionPerformed(evt);
            }
        });
        add(searchcombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 130, -1, -1));

        searchelectronicsJTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                " Item name", "Description", "Price", "services K/S/A", "State", "Vendor name", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(electronicsJTableCart);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 796, 140));

        btnDeleteCart.setText("Delete from cart");
        btnDeleteCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCartActionPerformed(evt);
            }
        });
        add(btnDeleteCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 570, -1, -1));

        btnorder.setText("Order");
        btnorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnorderActionPerformed(evt);
            }
        });
        add(btnorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 570, -1, -1));

        jLabel4.setText("Your Cart");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, -1, -1));

        btnAddtoCart.setText("Add to cart ^");
        btnAddtoCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddtoCartActionPerformed(evt);
            }
        });
        add(btnAddtoCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, -1, -1));

        jLabel6.setText("Total Amount");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 580, -1, -1));
        add(tfTotalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 580, 72, -1));
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

    private void btnDeleteCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCartActionPerformed
        int selectedCartRow = electronicsJTableCart.getSelectedRow();
            if(selectedCartRow<0){
                JOptionPane.showMessageDialog(null,"Select a row","Warning",JOptionPane.WARNING_MESSAGE);
            }
            Items item = itemsDirectory.getItem(electronicsJTable.getValueAt(selectedCartRow, 0).toString());
            orderItems.remove(item);
	    JOptionPane.showMessageDialog(electronicsJTableCart, "Item Deleted");
    }//GEN-LAST:event_btnDeleteCartActionPerformed

    private void btnAddtoCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddtoCartActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = electronicsJTable.getSelectedRow();

        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row!");
            return;
        }

        Items item =itemsDirectory.getItem(electronicsJTable.getValueAt(selectedRowIndex, 0).toString());
        orderItems.add(item);
        JOptionPane.showMessageDialog(electronicsJTableCart, "Item Added to cart");
        populatecart();

        //        else {
            //            // Dishes item=(Dishes)menuTable.getValueAt(selectedRow, 0);
            //
            //            Items cartitems =(Items)clothingJTable1.getValueAt(2, 0);
            //            populatecart(cartitems);
            //        }

    }//GEN-LAST:event_btnAddtoCartActionPerformed

    private void btnorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnorderActionPerformed
        // TODO add your handling code here:
         int total = 0;
         System.out.println("WWW"+enterprise.getEnterpriseType());
        
           
            for(Items i : orderItems){
                total = total + parseInt(i.getItemprice());
            }
           order = new Orders(enterprise.getEnterpriseType().toString(), customer.getcustomerName(), orderItems, total, customer.getcustomerStreetAddress(), enterprise.getOrgAddress());
          
            orderplaced.add(order);
            
            if(customer.getOrderslist() != null){
                customer.getOrderslist().add(order);
                ArrayList<Orders> arr=enterprise.getOrders();
                arr.add(order);
                enterprise.setOrders(arr);//set the list
		JOptionPane.showMessageDialog(electronicsJTableCart, "Order Confirmed");
            }
            else{
                customer.newOrderslist();
                customer.getOrderslist().add(order);
		JOptionPane.showMessageDialog(electronicsJTableCart, "Order Confirmed");
            }
    }//GEN-LAST:event_btnorderActionPerformed
    private void searchcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchcomboActionPerformed
        // TODO add your handling code here:
        electonicsjComboBox1.getSelectedItem();
        System.out.println(electonicsjComboBox1.getSelectedItem());
        DefaultTableModel model = (DefaultTableModel) searchelectronicsJTable1.getModel();
        model.setRowCount(0);
        for(int i=0;i<itemsDirectory.getItemsList().size();i++)
        {
            System.out.println("line 153");

            if(itemsDirectory.getItemsList().get(i).getItemname().equals(transportsearch.getText()) && itemsDirectory.getItemsList().get(i).getItemservices().equals(electonicsjComboBox1.getSelectedItem()) ){
                System.out.println("taru ki line ");
                System.out.println("line156 "+ itemsDirectory.getItemsList().get(i).getItemname());
                Object[] object={itemsDirectory.getItemsList().get(i).getItemname(),itemsDirectory.getItemsList().get(i).getItemdesc(),
                    itemsDirectory.getItemsList().get(i).getItemprice(),itemsDirectory.getItemsList().get(i).getItemservices(),
                    itemsDirectory.getItemsList().get(i).getItemstate()
                    ,itemsDirectory.getItemsList().get(i).getItemsellertailorname(),itemsDirectory.getItemsList().get(i).getItemquantity()};
                model.addRow(object);

            }
        }
    }//GEN-LAST:event_searchcomboActionPerformed

    private void transportsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transportsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transportsearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddtoCart;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeleteCart;
    private javax.swing.JButton btnorder;
    private javax.swing.JComboBox<String> electonicsjComboBox1;
    private javax.swing.JTable electronicsJTable;
    private javax.swing.JTable electronicsJTableCart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField tfTotalPrice;
    private javax.swing.JButton searchcombo;
    private javax.swing.JTable searchelectronicsJTable1;
    private javax.swing.JTextField transportsearch;
    // End of variables declaration//GEN-END:variables
 private void populateTable() {
          for(Network n: ecosystem.getNetworkList()){
           for(Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()){
             if(e.getEnterpriseType().toString().equals("Electronics")){
               
               
                      itemsDirectory=e.getItemsDirectory();
                  enterprise=e;
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

    private void populatecart() {
        DefaultTableModel model = (DefaultTableModel) electronicsJTableCart.getModel();
        model.setRowCount(0);
        
        int total = 0;
            for(Items i : orderItems){
                total = total + parseInt(i.getItemprice());
            }
            tfTotalPrice.setText(String.valueOf(total));
        for(Items i : orderItems){
            Object[] row = new Object[7];
            row[0] = i.getItemname();
            row[1] = i.getItemdesc();
            row[2] = i.getItemprice();
            row[3] = i.getItemservices();
            row[4] = i.getItemstate();
            row[5] = i.getItemsellertailorname();
            row[6] = i.getItemquantity();
            
            model.addRow(row);
        } }
}
