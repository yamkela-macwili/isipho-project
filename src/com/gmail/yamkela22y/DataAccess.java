/*DataAccess.java
    Gives connects to the database.
    And execute the queries.
*/

package com.gmail.yamkela22y;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Yamkela Macwili
 */
public class DataAccess {

    static final String DATABASE_URL = "jdbc:mysql://localhost/isipho_db";
    static final String USER = "root";
    static final String PASS = "yamkela22y!";
/**
 *  
 * @return connection to the database based on the URL, username and password
 * @throws SQLException 
 * @throws java.lang.ClassNotFoundException 
 */
    
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Connection conn;
       // Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection(DATABASE_URL, USER, PASS);
        return conn;
    }
    /**
     *  Close all resources to the data database
     * @param con database connection
     * @param s statement - prepareStatement, callable statement
     * @param r ResultSet
     * @throws SQLException 
     */
    public static void close(Connection con, Statement s, ResultSet r) throws SQLException{
      try{
          if(r !=null){
              r.close();
              r=null;
          }
          if(s !=null){
              s.close();
             s=null;
          }
          if(con !=null){
              con.close();
              con=null;
          }
      } catch(SQLException ex){
          throw ex;
      }
        
    }
    /**
     * 
     * @param gift to be added to the database
     * @return true is the product is added, false if the product is not added.
     * @throws SQLException 
     * @throws java.lang.ClassNotFoundException 
     */
    public static boolean add(Gift gift) throws SQLException, ClassNotFoundException {
        PreparedStatement pstmt;
        Connection conn;
        boolean isInserted=false;
        
         Date date = new Date();
        java.sql.Date mysqlDate =new java.sql.Date(date.getTime());
        
        try {
            //String SQL = "INSERT INTO isipho_db.isipho(fName, lName,village, cellNo) VALUES(?,?,?,?)";
            String SQL = "INSERT INTO isipho_db.isipho2(Name, Surname,village, cellNo, Date) VALUES(?,?,?,?,?)";
            conn = getConnection();
            pstmt = conn.prepareStatement(SQL);
            
//            pstmt.setString(1,gift.getfName());
//            pstmt.setString(2,gift.getlName());
//            pstmt.setString(3,gift.getVill());
//            pstmt.setString(4,gift.getcellNo());

            pstmt.setString(1,gift.getfName());
            pstmt.setString(2,gift.getlName());
            pstmt.setString(3,gift.getVill());
            pstmt.setString(4,gift.getcellNo());
            pstmt.setDate(5, mysqlDate);
            int status = pstmt.executeUpdate(); //use executeUpdate delete, insert update create
            if(status>0){
                isInserted=true;
            }
            close(conn,pstmt,null);
            
        } catch (SQLException e) {
            throw e;
        } finally {
            
        }
        return isInserted;
        
    }
    /**
     *  
     * @param gift
     * @throws SQLException 
     * @throws java.lang.ClassNotFoundException 
     */
    public static void remove(Gift gift) throws ClassNotFoundException, SQLException{
        PreparedStatement pstmt;
        Connection conn ;

        try {
            String SQL = "DELETE FROM isipho_db.isipho2 WHERE cellNo=?";
            conn = getConnection();
            pstmt = conn.prepareStatement(SQL);
            pstmt.setString(1,gift.getfName());
            pstmt.setString(2,gift.getlName());
            pstmt.setString(3,gift.getVill());
            pstmt.setString(4,gift.getcellNo());
            pstmt.executeUpdate(); //use executeUpdate delete, insert update create
            
            JOptionPane.showMessageDialog(null,"Register Updated");
            close(conn,pstmt,null);
            
        } catch (SQLException e) {
            throw e;
        } 
        
    }
    /**
     * 
     * @param gift
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
     public static void delete(Gift gift) throws SQLException, ClassNotFoundException {
        PreparedStatement pstmt;
        Connection conn;
        try {
            String SQL = "DELETE FROM isipho_db.isipho2 WHERE cellNo=?";
            conn = getConnection();
            pstmt = conn.prepareStatement(SQL);
            pstmt.setString(1,gift.getcellNo());
            pstmt.executeUpdate(); //use executeUpdate delete, insert update create
            
                JOptionPane.showMessageDialog(null, "Deleted successfully");
            
            close(conn,pstmt,null);
            
        } catch (SQLException e) {
            throw e;
        } finally {
            
        }
        
    }
     /**
      * 
     * @param gift
     * @throws java.lang.ClassNotFoundException
      * @throws SQLException 
      */
      public static void upDate(Gift gift) throws ClassNotFoundException, SQLException{
        PreparedStatement pstmt;
        Connection conn ;

        try {
            String SQL = "update isipho2 set Name = ?, Surname = ?, village = ? where cellno = ?";
            conn = getConnection();
            pstmt = conn.prepareStatement(SQL);
            pstmt.setString(1,gift.getfName());
            pstmt.setString(2,gift.getlName());
            pstmt.setString(3,gift.getVill());
            pstmt.setString(4,gift.getcellNo());
            pstmt.executeUpdate(); //use executeUpdate delete, insert update create
            
            JOptionPane.showMessageDialog(null,"Register Updated");
            close(conn,pstmt,null);
            
        } catch (SQLException e) {
            throw e;
        } 
     }
    /**
     *  
     * @return ArrayList This method returns a list of products
     * @throws SQLException 
     * @throws java.lang.ClassNotFoundException 
     */
    public static ArrayList<Gift> getApplicants() throws SQLException, ClassNotFoundException {
        PreparedStatement pstmt;
        Connection conn;
        ArrayList<Gift> listofApplicants;
        try {
            String SQL = "SELECT  fName,lName, village, cellNo FROM isipho_db.isipho2 ORDER by Name";
            conn = getConnection();
            pstmt = conn.prepareStatement(SQL);
            listofApplicants = new ArrayList<>();      
            ResultSet rs= pstmt.executeQuery(); //use exectuteQuery for select
           // String name = null;
            while(rs.next()){
                
                //here we have the data from the database
                Gift g = new Gift(rs.getString("fname"), rs.getString("lName"),rs.getString("village"),rs.getString("cellNo"));
                listofApplicants.add(g);
          }  
        } catch (SQLException e) {
            throw e;
        } 
        return listofApplicants;
    }
}