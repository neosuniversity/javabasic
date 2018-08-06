package org.neosuniversity.unidad4.jdbcMusicPart2;

import java.sql.*;

public class UtilityMysqlDB {

    Connection conexion = null;
    Statement stmt = null;
    ResultSet rs=null;
    PreparedStatement pst=null;

    public Connection MySQLConnect() {

        try {
            //Driver JDBC
            Class.forName("org.mariadb.jdbc.Driver");

            String servidor = "jdbc:mariadb://localhost:3306/biblioteca";

            String usuario = "root";
            String pass = "TU_PASSWORD";

            conexion = DriverManager.getConnection(servidor, usuario, pass);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            conexion = null;
        } catch (SQLException e) {
            e.printStackTrace();
            conexion = null;
        } catch (Exception e) {
            e.printStackTrace();
            conexion = null;
        } finally {

            System.out.println("EXITO");
            return conexion;
        }
    }

    public Cantante[] executeCantante(){
        Cantante[] arrayCantante = new Cantante[10];


        int countCantante=0;

        try {
            String queryCantantes=
                    "SELECT ID_CANTANTE,CANTANTE,EDAD, DIRECCION " +
                    "FROM CANTANTE " +
                    "ORDER BY CANTANTE ";


            stmt = conexion.createStatement();
            rs = stmt.executeQuery(queryCantantes);
            while (rs.next()) {
                int idCante = rs.getInt("ID_CANTANTE");
                String cantante = rs.getString("CANTANTE");
                int edad = rs.getInt("EDAD");
                String direccion= rs.getString("DIRECCION");

                Cantante cantanteDB = new Cantante(cantante, edad);
                arrayCantante[countCantante]=cantanteDB;
                countCantante++;
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return arrayCantante;
    }
    public Cancion[] executeCancionesByCantante(String cantante){

        Cancion[]  arrayCancion = new Cancion[2];
        int countCancion=0;
        String queryCanciones=
                "SELECT cancion.ID_CANCION,cancion.CANCION,cancion.DURACION " +
                        "FROM   cantante as cantante, disco as disco, cancion as cancion " +
                        "WHERE  cantante.ID_CANTANTE=disco.ID_CANTANTE AND " +
                        "       disco.ID_DISCO=cancion.ID_DISCO AND" +
                        "       cantante.CANTANTE= ? " +
                        "       ORDER BY disco.DISCO,cancion.CANCION";
        try {

            pst =  conexion.prepareStatement(queryCanciones);
            pst.setString(1,cantante);
            rs= pst.executeQuery();
            while (rs.next()) {
                int idCancion = rs.getInt("ID_CANCION");
                String cancion = rs.getString("CANCION");
                float duracion = rs.getFloat("DURACION");

                Cancion cancionDB = new Cancion(cancion, duracion);
                arrayCancion[countCancion] = cancionDB;
                countCancion++;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  arrayCancion;
    }
    public Disco executeDisco(Cantante cantante,Cancion[] arrayCancion){


        Disco discoDB=null;
        String queryCanciones=
                "SELECT disco.ID_DISCO,disco.DISCO,disco.ANNO_LANZAMIENTO " +
                        "FROM   cantante as cantante, disco as disco, cancion as cancion " +
                        "WHERE  cantante.ID_CANTANTE=disco.ID_CANTANTE AND  " +
                        "       disco.ID_DISCO=cancion.ID_DISCO AND " +
                        "       cantante.CANTANTE= ? " +
                        "       GROUP BY disco.DISCO";
        try {

            pst =  conexion.prepareStatement(queryCanciones);
            pst.setString(1,cantante.getNombreCantante());
            rs= pst.executeQuery();
            while (rs.next()) {
                int idDisco= rs.getInt("ID_DISCO");
                String disco = rs.getString("DISCO");
                int lanzamiento = rs.getInt("ANNO_LANZAMIENTO");
                discoDB = new Disco(disco,lanzamiento,cantante,arrayCancion);

            }

        } catch (SQLException e) {
            e.printStackTrace();
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

