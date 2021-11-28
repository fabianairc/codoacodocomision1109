package config;

import java.sql.*;

/**
 *
 * @author FabianaUsuario
 */
public class Conexion {
    public String driver = "com.mysql.cj.jdbc.Driver";
    public Connection getConection(){

        Connection conexion = null;
        try{
            Class.forName(driver);
            conexion = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/comision1109",
                    "admin", "123456");
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e.toString());
        }
            return conexion;
    }
/* public static void main (String regulo[]) throws SQLException{
        Connection c = null;
        Conexion con = new Conexion();
        c = con.getConection();
        PreparedStatement ps;
        ResultSet rs;
        
        ps = c.prepareStatement("SELECT * FROM finalp");
        rs = ps.executeQuery ();
        
        while (rs.next ()){
            int id = rs.getInt ("id");
            String nombre = rs.getString ("nombre");
            String apellido = rs.getString ("apellido");
            String email = rs.getString ("email");
            String telefono = rs.getString ("telefono");
        
            System.out.println( "id:" + id + "nombre:" + nombre + "apellido:" +apellido +
                    "email:" + email + "telefono" + telefono);
        
        }
        
}*/
}