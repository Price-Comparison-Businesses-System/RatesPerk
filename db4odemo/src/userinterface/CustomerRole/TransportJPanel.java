/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.ItemCatalogue.Items;
import Business.ItemCatalogue.ItemsDirectory;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sakshi
 */
public class TransportJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TransportJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem ecosystem;
    private Customer customer;
    private Organization organization;
    private Enterprise enterprise;
    private UserAccount account;
    private CustomerDirectory customerDirectory;
    private Items items;
    private ItemsDirectory itemsDirectory;
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public TransportJPanel(JPanel userProcessContainer, EcoSystem ecosystem, Customer customer) {
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

        jLabel3 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        transportJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        transportsearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        clothingjComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        searchtransportJTable1 = new javax.swing.JTable();
        searchcombo = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Transport");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        transportJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                " Item name", "Description", "Price", "services F/R/T", "State", "seller/tailor name", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(transportJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 209, 796, 100));

        jLabel1.setText("Services :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 70, 19));
        add(transportsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 160, -1));

        jLabel2.setText("Search :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, -1, -1));

        clothingjComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buy Car", "Rent Car", "Uber/lyft services" }));
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

        searchtransportJTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                " Item name", "Description", "Price", "services F/R/T", "State", "seller/tailor name", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(searchtransportJTable1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 790, 140));

        searchcombo.setText("Search");
        searchcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchcomboActionPerformed(evt);
            }
        });
        add(searchcombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 130, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
            Component[] componentArray = userProcessContainer.getComponents();
            Component component = componentArray[componentArray.length - 1];
//            CustomerWorkAreaJPanel custAreajp = (CustomerWorkAreaJPanel) component;
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void clothingjComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clothingjComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clothingjComboBox1ActionPerformed

    private void clothingjComboBox1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_clothingjComboBox1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_clothingjComboBox1KeyPressed

    private void searchcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchcomboActionPerformed
        // TODO add your handling code here:
        clothingjComboBox1.getSelectedItem();
        System.out.println(clothingjComboBox1.getSelectedItem());
        DefaultTableModel model = (DefaultTableModel) searchtransportJTable1.getModel();
        model.setRowCount(0);
        for(int i=0;i<itemsDirectory.getItemsList().size();i++)
        {
            System.out.println("line 153");

            if(itemsDirectory.getItemsList().get(i).getItemname().equals(transportsearch.getText()) && itemsDirectory.getItemsList().get(i).getItemservices().equals(clothingjComboBox1.getSelectedItem()) ){
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox<String> clothingjComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton searchcombo;
    private javax.swing.JTable searchtransportJTable1;
    private javax.swing.JTable transportJTable;
    private javax.swing.JTextField transportsearch;
    // End of variables declaration//GEN-END:variables
private void populateTable() {
          for(Network n: ecosystem.getNetworkList()){
           for(Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()){
             if(e.getEnterpriseType().toString().equals("Transport")){
               
               
                      itemsDirectory=e.getItemsDirectory();
                  
              }
             
           }
          
          }
      DefaultTableModel model = (DefaultTableModel) transportJTable.getModel();
        model.setRowCount(0);
        
        System.out.println(itemsDirectory.getItemsList());
        for(Items i : itemsDirectory.getItemsList()){
            
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
