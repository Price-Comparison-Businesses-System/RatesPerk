/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;

import Business.Enterprise.Enterprise;
import Business.ItemCatalogue.Items;
import Business.ItemCatalogue.ItemsDirectory;
import Business.Organization.OrganizationDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.Box;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import userinterface.CustomerRole.CustomerWorkAreaJPanel;

/**
 *
 * @author bidar
 */
public class ManageMenuJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageMenuJPanel
     */
    private OrganizationDirectory organizationDir;
    private Enterprise enterprise;
    private JPanel userProcessContainer;
    private ItemsDirectory itemsdir;
    /**
     *
     * @param userProcessContainer
     * @param enterprise
     */
    public ManageMenuJPanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        if(enterprise.getItemsDirectory() != null){
            this.itemsdir = enterprise.getItemsDirectory();
        }
        else{
            this.itemsdir = new ItemsDirectory();
            enterprise.setItemsDirectory(itemsdir);
        }
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the
     * form. WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfItemName = new javax.swing.JTextField();
        tfItemDescription = new javax.swing.JTextField();
        tfPrice = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        menuJTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtSellerTailorName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        clothingjComboBox1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("Item Name:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        jLabel2.setForeground(new java.awt.Color(0, 102, 204));
        jLabel2.setText("Item Description:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jLabel3.setForeground(new java.awt.Color(0, 102, 204));
        jLabel3.setText("Price:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));
        jPanel1.add(tfItemName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 107, -1));
        jPanel1.add(tfItemDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 107, -1));

        tfPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPriceActionPerformed(evt);
            }
        });
        jPanel1.add(tfPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 107, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 204));
        jLabel4.setText("All enterprise item catalogue");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 6, 330, -1));

        menuJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Description", "Price", "Services F/R/T", "State", "Seller/Tailor Name", "quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(menuJTable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 288, 771, 137));

        jLabel6.setText("<<- add to menu");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, -1, -1));

        jLabel5.setForeground(new java.awt.Color(0, 102, 204));
        jLabel5.setText("State");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, -1, -1));
        jPanel1.add(txtState, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 107, -1));

        jLabel7.setForeground(new java.awt.Color(0, 102, 204));
        jLabel7.setText("Seller/Vendor name:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, -1, -1));
        jPanel1.add(txtSellerTailorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 107, -1));

        jLabel8.setText("Services");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, -1, -1));

        clothingjComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buy Car", "Rent Car", "Uber/lyft service", "Buy Fabric", "Readymade cloths", "Tailor services", "Restaurants", "Frozen/Packaged", "Veggies/Fruits", "Medicines", "Hospitals", "Insuranse Plan Providers", "Doctors/Therapists", "Electronics Kit", "SPare parts", "Aceessories" }));
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
        jPanel1.add(clothingjComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 160, -1));

        jLabel9.setForeground(new java.awt.Color(0, 102, 204));
        jLabel9.setText("Quantity");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));

        txtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityActionPerformed(evt);
            }
        });
        jPanel1.add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 107, -1));

        btnBack.setText("<< back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        btndelete.setText("delete item");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, -1, -1));

        btnAdd.setText("Add item");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 560));
    }// </editor-fold>//GEN-END:initComponents

        private void tfPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPriceActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_tfPriceActionPerformed

    private void clothingjComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clothingjComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clothingjComboBox1ActionPerformed

    private void clothingjComboBox1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_clothingjComboBox1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_clothingjComboBox1KeyPressed

    private void txtQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantityActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        AdminWorkAreaJPanel adminAreajp = (AdminWorkAreaJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        String itemName = tfItemName.getText();
            String itemDesc = tfItemDescription.getText();
            String itemPrice = tfPrice.getText();
            int itemQuantity = parseInt(txtQuantity.getText());
            
//            String state = txtState.getText();
//            String sellertailorname = txtSellerTailorName.getText();
//            String services = clothingjComboBox1.getSelectedItem().toString();
            
//            Items item = itemsdir.addItem(itemName, itemDesc, itemPrice, itemQuantity, state, sellertailorname, services);
	    
            Items item = itemsdir.addItem(itemName, itemDesc, itemPrice, itemQuantity);
            JOptionPane.showMessageDialog(jPanel1, "Item added to the Menu");
            populateTable();
	    tfPrice.setText("");
	    tfItemDescription.setText("");
	    tfItemName.setText("");
	    txtQuantity.setText("");
    }//GEN-LAST:event_btnAddActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = menuJTable.getSelectedRow();
            if(selectedRow < 0) {
                JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
            }
            
            Items item = itemsdir.getItem(menuJTable.getValueAt(selectedRow, 0).toString());
            itemsdir.deleteItem(item);
	    JOptionPane.showMessageDialog(jPanel1, "Item deleted from the Menu");
            populateTable();
    }//GEN-LAST:event_btndeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btndelete;
    private javax.swing.JComboBox<String> clothingjComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable menuJTable;
    private javax.swing.JTextField tfItemDescription;
    private javax.swing.JTextField tfItemName;
    private javax.swing.JTextField tfPrice;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtSellerTailorName;
    private javax.swing.JTextField txtState;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) menuJTable.getModel();
        model.setRowCount(0);
        for(Items i : itemsdir.getItemsList()){
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
