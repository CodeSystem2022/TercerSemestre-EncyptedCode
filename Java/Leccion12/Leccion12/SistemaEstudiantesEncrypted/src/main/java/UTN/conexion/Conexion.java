package UTN.conexion;


import java.sql.Connection;
import java.sql.SQLException;

public class Conexion {
    public static Connection getConnection(){
        Connection conexion = null;
        //Variables para conectarnos a la base de datos
        var baseDatos = "encrypted";
        var url = "jdbc:mysql://localhost:3306/"+baseDatos;
        var usuario= "root";
        var password = "admin";
        //cargamos la clase del driver de mysql en memoria
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, password);
        } catch (ClassNotFoundException | SQLException e){
            System.out.println("Ocurrio un error en la conexion: "+e.getMessage());
        }//Fin catch
        return conexion;
    }//Fin Metodo connection
}