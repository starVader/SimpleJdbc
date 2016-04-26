import java.sql.*;

public class SQLiteJDBC1
{
  public static void main( String args[] )
  {
    Connection c = null; //Connectin variable
    Statement stmt = null; // Statement variable for executing statements
    try {
      Class.forName("org.sqlite.JDBC");
      //Getting the Connection
      c = DriverManager.getConnection("jdbc:sqlite:test.db");
      System.out.println("Opened database successfully");
      //cREATING A STATEMENT
      stmt = c.createStatement();
      //Statement string
      String sql = "CREATE TABLE COMPANY " +
                   "(ID INT PRIMARY KEY     NOT NULL," +
                   " NAME           TEXT    NOT NULL, " + 
                   " AGE            INT     NOT NULL, " + 
                   " ADDRESS        CHAR(50), " + 
                   " SALARY         REAL)"; 
      //Executing the statement
      stmt.executeUpdate(sql);
      //Closing Everyting
      stmt.close();
      c.close();
    } catch ( Exception e ) {
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      System.exit(0);
    }
    System.out.println("Table created successfully");
  }
}