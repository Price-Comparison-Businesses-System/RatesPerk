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
import Business.Orders.Orders;
import java.awt.CardLayout;
import java.awt.Component;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *@author netra
 * @author sakshi
 */
public class FoodProductsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FoodProductsJPanel
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
        
	public FoodProductsJPanel(JPanel userProcessContainer, EcoSystem ecosystem, Customer customer, Enterprise enterprise ) {
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
        btnAddtoCart = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        foodProductsJTableCart = new javax.swing.JTable();
        btnDeleteCart = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tfTotalPrice = new javax.swing.JTextField();
        searchcombo = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        searchfoodProductsTable1 = new javax.swing.JTable();

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 796, 110));

        jLabel1.setText("Services :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 70, 19));
        add(transportsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 160, -1));

        jLabel2.setText("Search :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

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
        add(foodProductsjComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 170, -1));

        jLabel3.setText("Food Products");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, -1));

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        btnAddtoCart.setText("Add to cart ^");
        btnAddtoCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddtoCartActionPerformed(evt);
            }
        });
        add(btnAddtoCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, -1, -1));

        jLabel4.setText("Your Cart");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, -1, -1));

        foodProductsJTableCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                " Item name", "Description", "Price", "Services ", "State", "Vendor name", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(foodProductsJTableCart);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 796, 140));

        btnDeleteCart.setText("Delete from cart");
        btnDeleteCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCartActionPerformed(evt);
            }
        });
        add(btnDeleteCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 600, -1, -1));

        jButton1.setText("Order");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 600, -1, -1));

        jLabel6.setText("Total Amount");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 610, -1, -1));
        add(tfTotalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 610, 72, -1));

        searchcombo.setText("Search");
        searchcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchcomboActionPerformed(evt);
            }
        });
        add(searchcombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 100, -1, -1));

        searchfoodProductsTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(searchfoodProductsTable1);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 796, 110));
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
    private void btnAddtoCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddtoCartActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = searchfoodProductsTable1.getSelectedRow();

        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row!");
            return;
        }

        Items item =itemsDirectory.getItem(searchfoodProductsTable1.getValueAt(selectedRowIndex, 0).toString());
        orderItems.add(item);
        JOptionPane.showMessageDialog(foodProductsJTableCart, "Item Added to cart");
        populatecart();

        //        else {
            //            // Dishes item=(Dishes)menuTable.getValueAt(selectedRow, 0);
            //
            //            Items cartitems =(Items)clothingJTable1.getValueAt(2, 0);
            //            populatecart(cartitems);
            //        }
    }//GEN-LAST:event_btnAddtoCartActionPerformed
    private void searchcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchcomboActionPerformed
        // TODO add your handling code here:
        foodProductsjComboBox1.getSelectedItem();
        System.out.println(foodProductsjComboBox1.getSelectedItem());
        DefaultTableModel model = (DefaultTableModel) searchfoodProductsTable1.getModel();
        model.setRowCount(0);
        for(int i=0;i<itemsDirectory.getItemsList().size();i++)
        {
            System.out.println("line 153");

            if(itemsDirectory.getItemsList().get(i).getItemname().equals(transportsearch.getText()) && itemsDirectory.getItemsList().get(i).getItemservices().equals(foodProductsjComboBox1.getSelectedItem()) ){
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
    private void btnDeleteCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCartActionPerformed
        int selectedCartRow = foodProductsJTableCart.getSelectedRow();
        if(selectedCartRow<0){
            JOptionPane.showMessageDialog(null,"Select a row","Warning",JOptionPane.WARNING_MESSAGE);
        }
        Items item = itemsDirectory.getItem(foodProductsTable.getValueAt(selectedCartRow, 0).toString());
        orderItems.remove(item);
        JOptionPane.showMessageDialog(foodProductsJTableCart, "Item Deleted");
    }//GEN-LAST:event_btnDeleteCartActionPerformed
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

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
            JOptionPane.showMessageDialog(foodProductsJTableCart, "Order Confirmed");
        }
        else{
            customer.newOrderslist();
            customer.getOrderslist().add(order);
            JOptionPane.showMessageDialog(foodProductsJTableCart, "Order Confirmed");
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddtoCart;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeleteCart;
    private javax.swing.JTable foodProductsJTableCart;
    private javax.swing.JTable foodProductsTable;
    private javax.swing.JComboBox<String> foodProductsjComboBox1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton searchcombo;
    private javax.swing.JTable searchfoodProductsTable1;
    private javax.swing.JTextField tfTotalPrice;
    private javax.swing.JTextField transportsearch;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
    for(Network n: ecosystem.getNetworkList()){
           for(Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()){
             if(e.getEnterpriseType().toString().equals("FoodProducts")){
               
               
                      itemsDirectory=e.getItemsDirectory();
                  enterprise=e;
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
            row[3] = i.getItemservices();
            row[4] = i.getItemstate();
            row[5] = i.getItemsellertailorname();
            row[6] = i.getItemquantity();
            
            
            
            model.addRow(row);
           // }
    }
    }

    private void populatecart() {
        
        int total = 0;
            for(Items i : orderItems){
                total = total + parseInt(i.getItemprice());
            }
            tfTotalPrice.setText(String.valueOf(total));
        DefaultTableModel model = (DefaultTableModel) foodProductsJTableCart.getModel();
        model.setRowCount(0);
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
        } 
    }
    
}
