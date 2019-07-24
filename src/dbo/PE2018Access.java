
package dbo;
public class PE2018Access extends DBAccess{
    final String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    final String url = "jdbc:sqlserver://localhost:1433;" + "databasename=PE2018; user=sa; password=123";

    public PE2018Access() {
        super();
        connectDB(driver,url);
    }
    
    
}
