package org.neosuniversity.unidad4.jdbcMusicReto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

    public class UtilityMysqlDB {

    Connection conexion = null;
    Statement stmt = null;
    ResultSet rs=null;
    PreparedStatement pst=null;

        public Connection MySQLConnect() throws ClassNotFoundException, SQLException {

            //Driver JDBC
            Class.forName("com.mysql.jdbc.Driver");

            String servidor = "jdbc:mysql://localhost:3306/biblioteca?useSSL=false";

            String usuario = "root";
            String pass = "discom";

            return conexion = DriverManager.getConnection(servidor, usuario, pass);

        }

        public List<Cantante> getCantantesDB() throws SQLException {
            List<Cantante> lstCantante = new ArrayList<>();

            String queryCantantes =
                    "SELECT ID_CANTANTE,CANTANTE,EDAD, DIRECCION " +
                            "FROM CANTANTE " +
                            "ORDER BY CANTANTE ";

            stmt = conexion.createStatement();
            rs = stmt.executeQuery(queryCantantes);
            while (rs.next()) {
                int idCante = rs.getInt("ID_CANTANTE");
                String cantante = rs.getString("CANTANTE");
                int edad = rs.getInt("EDAD");
                String direccion = rs.getString("DIRECCION");

                Cantante cantanteDB = new Cantante(cantante, edad);
                lstCantante.add(cantanteDB);
            }

            return lstCantante;
        }

    public List<Cancion> getCancionesByCantanteDB(String cantante) throws SQLException {

        List<Cancion>  listCancion = new ArrayList<>();

        String queryCanciones=
                "SELECT cancion.ID_CANCION,cancion.CANCION,cancion.DURACION " +
                        "FROM   cantante as cantante, disco as disco, cancion as cancion " +
                        "WHERE  cantante.ID_CANTANTE=disco.ID_CANTANTE AND " +
                        "       disco.ID_DISCO=cancion.ID_DISCO AND" +
                        "       cantante.CANTANTE= ? " +
                        "       ORDER BY disco.DISCO,cancion.CANCION";

            pst =  conexion.prepareStatement(queryCanciones);
            pst.setString(1,cantante);
            rs= pst.executeQuery();
            while (rs.next()) {
                int idCancion = rs.getInt("ID_CANCION");
                String cancion = rs.getString("CANCION");
                float duracion = rs.getFloat("DURACION");

                Cancion cancionDB = new Cancion(cancion, duracion);
                listCancion.add(cancionDB);
            }
        return  listCancion;
    }

    public Disco getDiscoDB(Cantante cantante,List<Cancion> lstCancion) throws SQLException {


        Disco discoDB=null;
        String queryCanciones=
                "SELECT disco.ID_DISCO,disco.DISCO,disco.ANNO_LANZAMIENTO " +
                        "FROM   cantante as cantante, disco as disco, cancion as cancion " +
                        "WHERE  cantante.ID_CANTANTE=disco.ID_CANTANTE AND  " +
                        "       disco.ID_DISCO=cancion.ID_DISCO AND " +
                        "       cantante.CANTANTE= ? " +
                        "       GROUP BY disco.DISCO";

            pst =  conexion.prepareStatement(queryCanciones);
            pst.setString(1,cantante.getNombreCantante());
            rs= pst.executeQuery();
            while (rs.next()) {
                int idDisco= rs.getInt("ID_DISCO");
                String disco = rs.getString("DISCO");
                int lanzamiento = rs.getInt("ANNO_LANZAMIENTO");
                discoDB = new Disco(disco,lanzamiento,cantante,lstCancion);

            }
        return  discoDB;
    }

    public void closeDB(){
        if(conexion!=null){
            try {
                conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(stmt!=null){
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(pst!=null){
            try {
                pst.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}

