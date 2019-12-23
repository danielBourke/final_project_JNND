
import java.sql.*;


public class JDBCPrimer {
    public static void main(String[] args){
    try{
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/reviews?user=root&password=new_password")){
            System.out.println("Connected to" + conn.getMetaData().getDatabaseProductName());

            try (Statement stmt = conn.createStatement()) {

                try (ResultSet rs = stmt.executeQuery("SELECT REVIEW_ID, CUSTOMER_NAME FROM reviews")){
                    System.out.println("Executed SQL query");
                    while(rs.next()) {
                        int reviewId = rs.getInt("REVIEW_ID");
                        String customerName = rs.getString("CUSTOMER_NAME");

                        System.out.println("ID: " + reviewId);
                        System.out.println("Customer name: " + customerName);
                    }
                }

                ResultSet rs = stmt.executeQuery("SELECT REVIEW_ID, CUSTOMER_NAME FROM reviews");

                System.out.println("Executed SQL query");
            }
        }
    } catch (SQLException ex){
        System.out.println("SQLException: " + ex.getMessage());
        System.out.println("SQLState: " + ex.getSQLState());
        System.out.println("VendorError " + ex.getErrorCode());
    }}
}
