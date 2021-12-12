/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Role.AdminRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sakshi
 * @author Netra
 * @author tarushukla
 */
public class ManageEnterpriseAdminJPanel extends javax.swing.JPanel {

      private JPanel userProcessContainer;
    private EcoSystem system;

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public ManageEnterpriseAdminJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.system = system;
        
        populateTable();
        populateNetworkComboBox();

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
        enterpriseJTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        networkJComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        enterpriseJComboBox = new javax.swing.JComboBox();
        usernameJTextField = new javax.swing.JTextField();
        passwordJPasswordField = new javax.swing.JPasswordField();
        nameJTextField = new javax.swing.JTextField();
        btnEnterpriseAdminAdd = new javax.swing.JButton();
        btnEnterpriseAdminDelete = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Enterprise Admin");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 16, 150, 30));

        enterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Enterprise Name", "Network", "Username", "password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(enterpriseJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 700, 160));

        jLabel2.setForeground(new java.awt.Color(0, 102, 204));
        jLabel2.setText("Network");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, -1, -1));

        networkJComboBox.setBackground(new java.awt.Color(0, 102, 204));
        networkJComboBox.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        networkJComboBox.setForeground(new java.awt.Color(255, 255, 255));
        networkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });
        add(networkJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 250, 136, -1));

        jLabel3.setForeground(new java.awt.Color(0, 102, 204));
        jLabel3.setText("Enterprise");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, -1, -1));

        jLabel4.setForeground(new java.awt.Color(0, 102, 204));
        jLabel4.setText("Username");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, -1, -1));

        jLabel5.setForeground(new java.awt.Color(0, 102, 204));
        jLabel5.setText("Password");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 400, 70, -1));

        jLabel6.setForeground(new java.awt.Color(0, 102, 204));
        jLabel6.setText("Name");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, -1, -1));

        enterpriseJComboBox.setBackground(new java.awt.Color(0, 102, 204));
        enterpriseJComboBox.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        enterpriseJComboBox.setForeground(new java.awt.Color(255, 255, 255));
        enterpriseJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(enterpriseJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 298, 136, -1));
        add(usernameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 346, 136, -1));
        add(passwordJPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 392, 134, -1));
        add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 438, 136, -1));

        btnEnterpriseAdminAdd.setText("Add");
        btnEnterpriseAdminAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterpriseAdminAddActionPerformed(evt);
            }
        });
        add(btnEnterpriseAdminAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 520, -1, -1));

        btnEnterpriseAdminDelete.setText("Delete");
        btnEnterpriseAdminDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterpriseAdminDeleteActionPerformed(evt);
            }
        });
        add(btnEnterpriseAdminDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 520, -1, -1));

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed

        Network network = (Network) networkJComboBox.getSelectedItem();
        if (network != null){
            populateEnterpriseComboBox(network);
        }

    }//GEN-LAST:event_networkJComboBoxActionPerformed

    private void btnEnterpriseAdminAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterpriseAdminAddActionPerformed
        // TODO add your handling code here:
        Enterprise enterprise;
        String username = usernameJTextField.getText();
        String password;
        String name;
        if(!usernameJTextField.getText().isEmpty()){
               username = usernameJTextField.getText();
          }
          else{
               JOptionPane.showMessageDialog(this, "User Name is empty","ERROR",JOptionPane.ERROR_MESSAGE);
               return;
        }
         if(!String.valueOf(passwordJPasswordField.getPassword()).isEmpty()){
               password = String.valueOf(passwordJPasswordField.getPassword());
          }
          else{
               JOptionPane.showMessageDialog(this, "Password is empty","ERROR",JOptionPane.ERROR_MESSAGE);
               return;
        }
        if(!nameJTextField.getText().isEmpty()){
               name = nameJTextField.getText();
          }
          else{
               JOptionPane.showMessageDialog(this, "Name is empty","ERROR",JOptionPane.ERROR_MESSAGE);
               return;
        }
        boolean flag1;
        flag1 = name.matches("(?i)(^[a-z])((?![ .,'-]$)[a-z .,'-]){0,24}$");

        if(!flag1) {
            JOptionPane.showMessageDialog(this, "Enter valid name");
            return;
        }
        if(!enterpriseJComboBox.getSelectedItem().toString().isEmpty()){
               enterprise = (Enterprise) enterpriseJComboBox.getSelectedItem();
          }
          else{
               JOptionPane.showMessageDialog(this, "Enterprise is empty","ERROR",JOptionPane.ERROR_MESSAGE);
               return;
        }
//        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        boolean flag = enterprise.getUserAccountDirectory().checkIfUsernameIsUnique(username);
        if(flag == false){
            JOptionPane.showMessageDialog(usernameJTextField, "User name already exists");
        }
        else{
            Employee employee = enterprise.getEmployeeDirectory().createEmployee(name);
            UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new AdminRole());
                JOptionPane.showMessageDialog(nameJTextField, "Enterprise Admin Added Successfully");
            populateTable();
        }
	
	usernameJTextField.setText("");
	passwordJPasswordField.setText("");
	nameJTextField.setText("");
    }//GEN-LAST:event_btnEnterpriseAdminAddActionPerformed

    private void btnEnterpriseAdminDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterpriseAdminDeleteActionPerformed
        // TODO add your handling code here:
        int selectedrow = enterpriseJTable.getSelectedRow();
        if(selectedrow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String name = enterpriseJTable.getValueAt(selectedrow, 0).toString();
        for (Network n : system.getNetworkList()){
            Enterprise e = n.getEnterpriseDirectory().getEnterprise(name);
            n.getEnterpriseDirectory().removeEnterprise(e);
        }
        populateTable();
        
    }//GEN-LAST:event_btnEnterpriseAdminDeleteActionPerformed

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
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEnterpriseAdminAdd;
    private javax.swing.JButton btnEnterpriseAdminDelete;
    private javax.swing.JComboBox enterpriseJComboBox;
    private javax.swing.JTable enterpriseJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JPasswordField passwordJPasswordField;
    private javax.swing.JTextField usernameJTextField;
    // End of variables declaration//GEN-END:variables

    private void populateEnterpriseComboBox(Network network) {
        enterpriseJComboBox.removeAllItems();
        
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
            enterpriseJComboBox.addItem(enterprise);
        }
    }

    private void populateTable() {
    
    DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    Object[] row = new Object[4];
                    row[0] = enterprise.getOrgName();
                    row[1] = network.getName();
                    row[2] = userAccount.getUsername();
                    row[3] = userAccount.getPassword();

                    model.addRow(row);
                }
            }
        }
    }

    private void populateNetworkComboBox() {
    
    networkJComboBox.removeAllItems();
        
        for (Network network : system.getNetworkList()){
            networkJComboBox.addItem(network);
        }
    }
}
