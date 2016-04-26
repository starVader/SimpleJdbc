import java.sql.*;

public class SQLiteJDBC
{
  public static void main( String args[] )
  {
    //The Connection variable
    Connection c = null;
    try {
      Class.forName("org.sqlite.JDBC");
      //Getting the connection
      c = DriverManager.getConnection("jdbc:sqlite:test.db");
      //End 
    } catch ( Exception e ) {
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      System.exit(0);
    }
    System.out.println("Opened database successfully");
  }
}