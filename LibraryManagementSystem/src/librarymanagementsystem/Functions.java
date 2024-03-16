
package librarymanagementsystem;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.*;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Functions extends javax.swing.JFrame {
    public Functions() {
        initComponents();
    }

     public Functions(String name) {
        initComponents(); 
        l1.setText("Welcome " + name);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        l1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(166, 177, 225));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        l1.setBackground(new java.awt.Color(91, 251, 238));
        l1.setFont(new java.awt.Font("Georgia", 2, 24)); // NOI18N
        l1.setForeground(new java.awt.Color(49, 245, 248));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l1, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        jPanel2.setBackground(new java.awt.Color(220, 214, 247));

        jButton1.setBackground(new java.awt.Color(195, 190, 240));
        jButton1.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(49, 29, 63));
        jButton1.setText("View Books");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(195, 190, 240));
        jButton2.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(49, 29, 63));
        jButton2.setText("View Users");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(195, 190, 240));
        jButton3.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(49, 29, 63));
        jButton3.setText("View Issued Books");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(195, 190, 240));
        jButton4.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(49, 29, 63));
        jButton4.setText("Issue Books");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(195, 190, 240));
        jButton5.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(49, 29, 63));
        jButton5.setText("Add Users");
        jButton5.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                jButton5ComponentMoved(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(195, 190, 240));
        jButton6.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(49, 29, 63));
        jButton6.setText("Add Books");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(195, 190, 240));
        jButton7.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(49, 29, 63));
        jButton7.setText("Return Books");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(195, 190, 240));
        jButton8.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(49, 29, 63));
        jButton8.setText("Exit");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      new BookDetails().setVisible(true);
     setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     new UserDetails().setVisible(true);
     setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       JFrame userFrame = new JFrame("Add User"); // Frame to enter user details
    JLabel l1, l2;
    l1 = new JLabel("Username");
    l1.setBounds(30, 15, 100, 30);

    l2 = new JLabel("Password");
    l2.setBounds(30, 50, 100, 30);

    JTextField F_user = new JTextField();
    F_user.setBounds(110, 15, 200, 30);

    JPasswordField F_pass = new JPasswordField();
    F_pass.setBounds(110, 50, 200, 30);

    JRadioButton a1 = new JRadioButton("Admin");
    a1.setBounds(55, 80, 200, 30);

    JRadioButton a2 = new JRadioButton("User");
    a2.setBounds(130, 80, 200, 30);

    ButtonGroup bg = new ButtonGroup();
    bg.add(a1);
    bg.add(a2);

    JButton Add_but = new JButton("Add");
    Add_but.setBounds(130, 130, 80, 25);
    Add_but.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String username = F_user.getText();
            String password = F_pass.getText();
            boolean admin = false;
            if (a1.isSelected()) {
                admin = true;
            }
           
            try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/library?useSSL=false", "root", "");
    Statement stmt = con.createStatement();
    stmt.executeUpdate("USE LIBRARY");
    stmt.executeUpdate("INSERT INTO USER(USERNAME,PASSWORD,ADMIN) VALUES ('" + username + "','" + password + "'," + admin + ")");
    JOptionPane.showMessageDialog(null, "User added!");
    userFrame.dispose();
} catch (SQLException e1) {
    JOptionPane.showMessageDialog(null, "SQL Error: " + e1.getMessage());
    e1.printStackTrace(); // Log the stack trace for debugging purposes
} catch (ClassNotFoundException ex) {
    JOptionPane.showMessageDialog(null, "Database driver not found: " + ex.getMessage());
    ex.printStackTrace(); // Log the stack trace for debugging purposes
}

        }
    });

    userFrame.add(Add_but);
    userFrame.add(a2);
    userFrame.add(a1);
    userFrame.add(l1);
    userFrame.add(l2);
    userFrame.add(F_user);
    userFrame.add(F_pass);
    userFrame.setSize(350, 200);
    userFrame.setLayout(null);
    userFrame.setVisible(true);
    userFrame.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
 JFrame bookFrame = new JFrame("Enter Book Details");
    JLabel l1, l2, l3, l4, l5;
    l1 = new JLabel("Title");
    l1.setBounds(30, 15, 100, 30);

    l2 = new JLabel("Author");
    l2.setBounds(30, 53, 100, 30);

    l3 = new JLabel("Status");
    l3.setBounds(30, 90, 100, 30);

    l4 = new JLabel("Quantity");
    l4.setBounds(30, 127, 100, 30);

    l5 = new JLabel("Price");
    l5.setBounds(30, 164, 100, 30);

    JTextField F_title = new JTextField();
    F_title.setBounds(110, 15, 200, 30);

    JTextField F_author = new JTextField();
    F_author.setBounds(110, 53, 200, 30);

    JTextField F_status = new JTextField();
    F_status.setBounds(110, 90, 200, 30);

    JTextField F_quantity = new JTextField();
    F_quantity.setBounds(110, 127, 200, 30);

    JTextField F_price = new JTextField();
    F_price.setBounds(110, 164, 200, 30);

    JButton create_but = new JButton("Submit");
    create_but.setBounds(130, 200, 80, 25);
    create_but.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String title = F_title.getText();
            String author = F_author.getText();
            String status = F_status.getText();
            int quantity = Integer.parseInt(F_quantity.getText());
            double price = Double.parseDouble(F_price.getText());

            

            try {
                 Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/library?useSSL=false", "root", "");
                Statement stmt = con.createStatement();
                stmt.executeUpdate("USE LIBRARY");
                String insertQuery = "INSERT INTO book (Title, Author, Status, Quantity, Price) VALUES ('" + title + "', '" + author + "', '" + status + "', " + quantity + ", " + price + ")";
                stmt.executeUpdate(insertQuery);
                JOptionPane.showMessageDialog(null, "Book added!");
                bookFrame.dispose();
            } catch (SQLException e1) {
                JOptionPane.showMessageDialog(null, "SQL Error: " + e1.getMessage());
                e1.printStackTrace(); // Log the stack trace for debugging purposes
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Functions.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    });

    bookFrame.add(create_but);
    bookFrame.add(l1);
    bookFrame.add(l2);
    bookFrame.add(l3);
    bookFrame.add(l4);
    bookFrame.add(l5);
    bookFrame.add(F_title);
    bookFrame.add(F_author);
    bookFrame.add(F_status);
    bookFrame.add(F_quantity);
    bookFrame.add(F_price);
    bookFrame.setSize(350, 270);
    bookFrame.setLayout(null);
    bookFrame.setVisible(true);
bookFrame.setLocationRelativeTo(null);

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jButton5ComponentMoved
        
    }//GEN-LAST:event_jButton5ComponentMoved

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                                         
    JFrame f = new JFrame("Users List");
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/library?useSSL=false", "root", ""); 
        Statement stmt = con.createStatement();
        stmt.executeUpdate("USE LIBRARY");
        ResultSet rs = stmt.executeQuery("SELECT * FROM issue");
        ResultSetMetaData metaData = (ResultSetMetaData) rs.getMetaData();
        int columnCount = metaData.getColumnCount();
        String[] columnNames = new String[columnCount];
        for (int i = 0; i < columnCount; i++) {
            columnNames[i] = metaData.getColumnName(i + 1);
        }
        List<Object[]> data = new ArrayList<>();
        while (rs.next()) {
            Object[] row = new Object[columnCount];
            for (int i = 0; i < columnCount; i++) {
                row[i] = rs.getObject(i + 1);
            }
            data.add(row);
        }
        JTable bookList = new JTable(data.toArray(new Object[0][]), columnNames);
        JScrollPane scrollPane = new JScrollPane(bookList);
        f.add(scrollPane); 
        f.setSize(800, 400);
        f.setVisible(true);
        f.setLocationRelativeTo(null); // Center JFrame on screen
    } catch (ClassNotFoundException | SQLException e1) {
        // Handle exceptions
        JOptionPane.showMessageDialog(null, e1);
    
    }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      JFrame g = new JFrame("Enter Details");
                //g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //create labels
                JLabel l1,l2,l3,l4;  
                l1=new JLabel("Book ID(BID)");  // Label 1 for Book ID
                l1.setBounds(30,15, 100,30); 
                 
                 
                l2=new JLabel("User ID(UID)");  //Label 2 for user ID
                l2.setBounds(30,53, 100,30); 
                 
                l3=new JLabel("Period(days)");  //Label 3 for period
                l3.setBounds(30,90, 100,30); 
                 
                l4=new JLabel("Issued Date(DD-MM-YYYY)");  //Label 4 for issue date
                l4.setBounds(30,127, 150,30); 
                 
                JTextField F_bid = new JTextField();
                F_bid.setBounds(110, 15, 200, 30);
                 
                 
                JTextField F_uid=new JTextField();
                F_uid.setBounds(110, 53, 200, 30);
                 
                JTextField F_period=new JTextField();
                F_period.setBounds(110, 90, 200, 30);
                 
                JTextField F_issue=new JTextField();
                F_issue.setBounds(180, 130, 130, 30);   
 
                 
                JButton create_but=new JButton("Submit");//creating instance of JButton  
                create_but.setBounds(130,170,80,25);//x axis, y axis, width, height 
                create_but.addActionListener(new ActionListener() {
                     
                    public void actionPerformed(ActionEvent e){
                     
                    String uid = F_uid.getText();
                    String bid = F_bid.getText();
                    String period = F_period.getText();
                    String issued_date = F_issue.getText();
 
                    int period_int = Integer.parseInt(period);
                     
                    try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/library?useSSL=false", "root", "");   
                        Statement stmt = con.createStatement();
                        stmt.executeUpdate("USE LIBRARY");
                        stmt.executeUpdate("INSERT INTO ISSUE(User_ID,Book_ID,ISSUE_DATE,PERIOD) VALUES ('"+uid+"','"+bid+"','"+issued_date+"',"+period_int+")");
                        JOptionPane.showMessageDialog(null,"Book Issued!");
                        g.dispose();
                      
                    }
                     
                    catch (SQLException e1) {
                        // TODO Auto-generated catch block
                         JOptionPane.showMessageDialog(null, e1);
                    }   catch (ClassNotFoundException ex) {   
                            Logger.getLogger(Functions.class.getName()).log(Level.SEVERE, null, ex);
                        }   
                     
                    }
                     
                });
                   g.add(l3);
                    g.add(l4);
                    g.add(create_but);
                    g.add(l1);
                    g.add(l2);
                    g.add(F_uid);
                    g.add(F_bid);
                    g.add(F_period);
                    g.add(F_issue);
                    g.setSize(350,250); 
                    g.setLayout(null);  
                    g.setVisible(true);
                    g.setLocationRelativeTo(null);
                 
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
          JFrame g = new JFrame("Enter Details");
        JLabel l1, l4;
        l1 = new JLabel("Issue ID(IID)"); 
        l1.setBounds(30, 15, 100, 30);

        l4 = new JLabel("Return Date(yyyy-MM-dd)");
        l4.setBounds(30, 50, 150, 30);

        JTextField F_iid = new JTextField();
        F_iid.setBounds(110, 15, 200, 30);

        JTextField F_return = new JTextField();
        F_return.setBounds(180, 50, 130, 30);

        JButton create_but = new JButton("Return");
        create_but.setBounds(130, 170, 80, 25);
        create_but.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String iid = F_iid.getText();
                String return_date = F_return.getText();

                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/library?useSSL=false", "root", "");
                    Statement stmt = con.createStatement();
                    stmt.executeUpdate("USE LIBRARY");
                    ResultSet rs = stmt.executeQuery("SELECT RETURN_DATE FROM ISSUE WHERE Issue_ID=" + iid);
                    if (rs.next() && rs.getString(1) != null) {
                        JOptionPane.showMessageDialog(null, "This book has already been returned.");
                            return;
                    }

                    String date1 = null;
                    String date2 = return_date; 
                    rs = stmt.executeQuery("SELECT ISSUE_DATE FROM ISSUE WHERE Issue_ID=" + iid);
                    while (rs.next()) {
                        date1 = rs.getString(1);
                    }

                    try {
                        Date date_1 = new SimpleDateFormat("yyyy-MM-dd").parse(date1);
                        Date date_2 = new SimpleDateFormat("yyyy-MM-dd").parse(date2);
                        long diff = date_2.getTime() - date_1.getTime();
                        long daysDifference = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
                        ResultSet rs1 = stmt.executeQuery("SELECT PERIOD FROM ISSUE WHERE Issue_ID=" + iid);
                        int diff_int = 0;
                        if (rs1.next()) {
                            diff_int = rs1.getInt(1);
                        }
                        stmt.executeUpdate("UPDATE ISSUE SET RETURN_DATE='" + return_date + "' WHERE Issue_ID=" + iid);

                        if (daysDifference > diff_int) { 
                            int fine = (int) (daysDifference - diff_int) * 20; 
                            stmt.executeUpdate("UPDATE ISSUE SET FINE=" + fine + " WHERE Issue_ID=" + iid);
                            String fine_str = ("Fine: Rs. " + fine);
                            JOptionPane.showMessageDialog(null, fine_str);
                        }

                        JOptionPane.showMessageDialog(null, "Book Returned!");

                    } catch (ParseException | SQLException e1) {
                        JOptionPane.showMessageDialog(null, e1);
                    }

                } catch (SQLException | ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
        });
        
        g.add(l1);
        g.add(l4);
        g.add(F_iid);
        g.add(F_return);
        g.add(create_but);
        g.setSize(350, 250);
        g.setLayout(null);
        g.setVisible(true);
        g.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       new Login().setVisible(true);
       setVisible(false);
       dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Functions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel l1;
    // End of variables declaration//GEN-END:variables
}
