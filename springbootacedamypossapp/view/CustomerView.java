/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lk.springbootacedamypossapp.view;

import com.mysql.jdbc.Driver;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PLUSVISION PC
 */
public class CustomerView extends javax.swing.JFrame {

    /**
     * Creates new form CustomerView
     */
    public CustomerView() {
        initComponents();
        searchAllCustomers();
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
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CusIdLbl1 = new javax.swing.JLabel();
        CusIdTxt = new javax.swing.JTextField();
        CusIdLbl = new javax.swing.JLabel();
        CusNameTxt = new javax.swing.JTextField();
        CusIdLbl2 = new javax.swing.JLabel();
        CusNicTxt = new javax.swing.JTextField();
        CusIdLbl3 = new javax.swing.JLabel();
        CusContactTxt = new javax.swing.JTextField();
        AddBtn = new javax.swing.JButton();
        SearchBtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        CusTbl = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CUSTOMER FORM");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        CusIdLbl1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CusIdLbl1.setText("Customer Id");
        CusIdLbl1.setOpaque(true);
        jPanel1.add(CusIdLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 110, 20));
        jPanel1.add(CusIdTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 210, 20));

        CusIdLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CusIdLbl.setText("Customer Name");
        CusIdLbl.setOpaque(true);
        jPanel1.add(CusIdLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 110, 20));
        jPanel1.add(CusNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 210, 20));

        CusIdLbl2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CusIdLbl2.setText("Customer Nic");
        CusIdLbl2.setOpaque(true);
        jPanel1.add(CusIdLbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 110, 20));
        jPanel1.add(CusNicTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 210, 20));

        CusIdLbl3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CusIdLbl3.setText("Customer Contact");
        CusIdLbl3.setOpaque(true);
        jPanel1.add(CusIdLbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 110, 20));
        jPanel1.add(CusContactTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 210, 20));

        AddBtn.setBackground(new java.awt.Color(153, 255, 153));
        AddBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AddBtn.setText("ADD");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });
        jPanel1.add(AddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 80, 30));

        SearchBtn.setBackground(new java.awt.Color(153, 255, 153));
        SearchBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        SearchBtn.setText("SEARCH");
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });
        jPanel1.add(SearchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 100, 30));

        UpdateBtn.setBackground(new java.awt.Color(153, 255, 153));
        UpdateBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UpdateBtn.setText("UPDATE");
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });
        jPanel1.add(UpdateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 110, 30));

        CusTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Name", "Nic", "Contact"
            }
        ));
        jScrollPane2.setViewportView(CusTbl);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 350, 300));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/springbootacedamypossapp/view/1.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 460, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        String id=CusIdTxt.getText();
        String name= CusNameTxt.getText();
        String nic= CusNicTxt.getText();
        int contact=Integer.parseInt(CusContactTxt.getText());
        
        Connection connection=null;
        PreparedStatement preparedStatement =null;
        try {
            //get database connection
           
          String Sql= "INSERT INTO customer VALUES(?,?,?,?)";
            Class.forName("com.mysql.cj.jdbc.Driver");
           connection= DriverManager.getConnection ("jdbc:mysql://localhost:3306/springbootposdb","root","8917");
            preparedStatement=connection.prepareStatement(Sql);
            preparedStatement.setString(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, nic);
            preparedStatement.setInt(4, contact);
            
            int result=preparedStatement.executeUpdate();
            if(result>0){
            JOptionPane.showMessageDialog(this, "Added Sucessfully");
            clearCustomerFiled();
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }finally{
            try{
            if(connection!=null){
            connection.close();
            }
            if(preparedStatement!=null){
            preparedStatement.close();
            }
            
            }catch(SQLException ex){
                
            JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        
        
        }
        
        
    }//GEN-LAST:event_AddBtnActionPerformed

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
         
        String id=CusIdTxt.getText();
        
        Connection connection=null;
        PreparedStatement preparedStatement =null;
         ResultSet resultSet=  null;

        
        String sql="SELECT*FROM customer WHERE id=?";
        
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
             connection= DriverManager.getConnection ("jdbc:mysql://localhost:3306/springbootposdb","root","8917");
             preparedStatement=connection.prepareStatement(sql);
             preparedStatement.setString(1,id);
             resultSet=  preparedStatement.executeQuery();
        
            if(resultSet.next()){
                String rsId=resultSet.getString("id");
                String rsName=resultSet.getString("name");
                String rsNic=resultSet.getString("nic");
                int rsContact=resultSet.getInt("contact");
                
                CusNameTxt.setText(rsName);
                CusNicTxt.setText(rsNic);
                CusContactTxt.setText(" "+rsContact);
                
            
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerView.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try{
            if(connection!=null){
            connection.close();
            }
            if(preparedStatement!=null){
            preparedStatement.close();
            }
            if(resultSet != null){
            resultSet.close();
            }
            
            }catch(SQLException ex){
                
            JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        
        
        }
    }//GEN-LAST:event_SearchBtnActionPerformed

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        String id=CusIdTxt.getText();
        String name= CusNameTxt.getText();
        String nic= CusNicTxt.getText();
        int contact=Integer.parseInt(CusContactTxt.getText());
        
        //Establish Connection and prepared statement
        
        Connection connection=null;
        PreparedStatement preparedStatement =null;
        
        //SQL update query
        String sql="UPDATE customer SET name=?,nic=?,contact=?  WHERE id= ? ";
        
        try {
            //Load Driver Package
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection= DriverManager.getConnection ("jdbc:mysql://localhost:3306/springbootposdb","root","8917");
            
            
            preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, nic);
            preparedStatement.setInt(3, contact);
            preparedStatement.setString(4, id);
            
            int result=preparedStatement.executeUpdate();
            
            if(result>0){
            JOptionPane.showMessageDialog(this, "Updated Sucessfully");
            clearCustomerFiled();
            }else{
             JOptionPane.showMessageDialog(this, "Not Found Customer");
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CustomerView.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try{
            if(connection!=null){
            connection.close();
            }
            if(preparedStatement!=null){
            preparedStatement.close();
            }
            
            }catch(SQLException ex){
                
            JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        
        
        }
        
    }//GEN-LAST:event_UpdateBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JTextField CusContactTxt;
    private javax.swing.JLabel CusIdLbl;
    private javax.swing.JLabel CusIdLbl1;
    private javax.swing.JLabel CusIdLbl2;
    private javax.swing.JLabel CusIdLbl3;
    private javax.swing.JTextField CusIdTxt;
    private javax.swing.JTextField CusNameTxt;
    private javax.swing.JTextField CusNicTxt;
    private javax.swing.JTable CusTbl;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    public void clearCustomerFiled (){
       CusIdTxt.setText("");
       CusNameTxt.setText("");
       CusNicTxt.setText("");
       CusContactTxt.setText("");
    
    }
    public void searchAllCustomers(){
    Connection connection=null;
    PreparedStatement preparedStatement=null;
    ResultSet resultSet=null;
    
    String sql="SELECT * FROM customer";
    
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
             connection= DriverManager.getConnection ("jdbc:mysql://localhost:3306/springbootposdb","root","8917");
             preparedStatement=connection.prepareStatement(sql);
             
            resultSet=preparedStatement.executeQuery();
            DefaultTableModel dtm= (DefaultTableModel) CusTbl.getModel();
            dtm.setRowCount(0);
            while(resultSet.next()){
                String rsId=resultSet.getString("id");
                String rsName=resultSet.getString("name");
                String rsNic=resultSet.getString("nic");
                int rsContact=resultSet.getInt("contact");
                
                dtm.addRow(new Object []{rsId,rsName,rsNic,rsContact});
                
                
            
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerView.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    
    
    
    }




}
