package Assignment2.External_Coupling;
/*
    External coupling occurs when one or more modules use an external data, interface ,library or
    communication protocol that is imposed upon them. Using third party libraries is a part of external
    coupling. Any change onto those libraries can modify the  behavior of the module.

    In the following example, the whole code of external_coupling dependent on the java.sql package.
    Any change on the package can have significant impact in the class. Although, in order to work with
    sql we can not avoid this.
 */
import java.sql.*;
public class External_Coupling {
    public static void main(String args[]) {
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("driver loaded");
        } catch (Exception e1) {
            System.err.println("couldn't find driver");
            System.err.println(e1);
            System.exit(1);
        }
        System.out.println("done.");
        java.util.Properties props = new java.util.Properties();
        props.setProperty("user","me");
        props.setProperty("password","mypassword");
        String database = "jdbc:postgresql://myhost.org:5432/test";
        try (Connection conn = DriverManager.getConnection(database, props)) {
            System.out.println("connection created");
        } catch (Exception e2) {
            System.err.println("sql operations failed");
            System.err.println(e2);
            System.exit(2);
        }
        System.out.println("connection closed");
    }
}
