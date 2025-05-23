/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Jframes;

/**
 *
 * @author John Chris Ledama 
 */
import com.formdev.flatlaf.FlatDarculaLaf;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import Database.DBConnection;
import java.sql.PreparedStatement;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class SelectBook extends javax.swing.JDialog {

    /**
     * Creates new form SelectBook
     */
    private IssueBook issueBookForm;
    
    public SelectBook(IssueBook issueBookForm, java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.issueBookForm = issueBookForm;  // Now the reference is correctly assigned
        initComponents();  // Initialize the components
        loadBooksToTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        searchTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        issuedBooksTable = new javax.swing.JTable();
        selectButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel2.setText("Search:");

        searchTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextFieldActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(25, 25, 25));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/search.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        issuedBooksTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Book ID", "Book Name", "Author", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        issuedBooksTable.getTableHeader().setReorderingAllowed(false);
        issuedBooksTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                issuedBooksTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(issuedBooksTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(203, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(searchTextField, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        selectButton.setText("Select Book");
        selectButton.setBackground(new java.awt.Color(110, 110, 110));
        selectButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        selectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectButtonActionPerformed(evt);
            }
        });

        jButton3.setText("Cancel");
        jButton3.setBackground(new java.awt.Color(110, 110, 110));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(selectButton)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectButton)
                    .addComponent(jButton3))
                .addGap(0, 21, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTextFieldActionPerformed

    private void selectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectButtonActionPerformed
        // TODO add your handling code here:
        // Get selected row from the table
        int selectedRow = issuedBooksTable.getSelectedRow();

        if (selectedRow != -1) {
            // Get the book ID and other details from the selected row
            String bookId = issuedBooksTable.getValueAt(selectedRow, 0).toString();
            String bookName = issuedBooksTable.getValueAt(selectedRow, 1).toString();
            String author = issuedBooksTable.getValueAt(selectedRow, 2).toString();
            String quantity = issuedBooksTable.getValueAt(selectedRow, 3).toString();

            // Pass the selected book details back to the main form (assuming you have a method to set the book info)
            issueBookForm.setSelectedBook(bookId, bookName, author, quantity);

            // Close the dialog
            this.dispose();
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Please select a book from the table.");
        }
    }//GEN-LAST:event_selectButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String searchTerm = searchTextField.getText().trim();
        searchBooks(searchTerm);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void issuedBooksTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_issuedBooksTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_issuedBooksTableMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    FlatDarculaLaf.setup();
    
    // Create a dummy parent frame (JFrame for testing)
    IssueBook dummyIssueBook = new IssueBook(); // Create a dummy IssueBook (or any Frame subclass)
    
    /* Create and display the dialog */
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            SelectBook dialog = new SelectBook(dummyIssueBook, dummyIssueBook, true); // Pass IssueBook as parent
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true); // Show the dialog
        }
    });
}
    
    private void searchBooks(String searchTerm) {
    // Search for books where the book ID, book name, or author name matches the search term
    String sql = "SELECT * FROM books WHERE book_id LIKE ? OR book_name LIKE ? OR author_name LIKE ?";
    
    try {
        // Connect to the database
        Connection conn = DBConnection.connect();
        
        // Prepare the SQL statement
        PreparedStatement stmt = conn.prepareStatement(sql);
        String searchPattern = "%" + searchTerm + "%";  // Add wildcards for partial matching
        
        // Set the search term for all three fields
        stmt.setString(1, searchPattern);  // Book ID
        stmt.setString(2, searchPattern);  // Book Name
        stmt.setString(3, searchPattern);  // Author Name

        // Execute the query and get the results
        ResultSet rs = stmt.executeQuery();

        // Clear the table before adding new search results
        DefaultTableModel model = (DefaultTableModel) issuedBooksTable.getModel();
        model.setRowCount(0);  // Clear table

        // Loop through the results and add them to the table
        while (rs.next()) {
            String bookId = rs.getString("book_id");
            String bookName = rs.getString("book_name");
            String author = rs.getString("author_name");
            String quantity = rs.getString("quantity");
            model.addRow(new Object[]{bookId, bookName, author, quantity});
        }
    } catch (SQLException e) {
        e.printStackTrace();  // Handle any database-related exceptions
    }
}

    private void loadBooksToTable() {
        Connection conn = DBConnection.connect();
        DefaultTableModel model = (DefaultTableModel) issuedBooksTable.getModel();
        model.setRowCount(0);

        try {
            String sql = "SELECT * FROM books";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("book_id");
                String name = rs.getString("book_name");
                String author = rs.getString("author_name");
                int quantity = rs.getInt("quantity");

                // Add row to table
                model.addRow(new Object[]{id, name, author, quantity});
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable issuedBooksTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JButton selectButton;
    // End of variables declaration//GEN-END:variables
}
