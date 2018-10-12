package org.neosuniversity.unidad4.jdbcMusic;

import java.sql.*;

public class UtilityMysqlDB {

    Connection conexion = null;
    Statement stmt = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public Connection mySQLConnect() throws ClassNotFoundException, SQLException {
        //Driver JDBC
        Class.forName("com.mysql.jdbc.Driver");

        String servidor = "jdbc:mysql://localhost:3306/biblioteca?useSSL=false";

        String usuario = "root";
        String pass = "TU_PASSWORD";


        return conexion = DriverManager.getConnection(servidor, usuario, pass);

    }

    public Cantante[] getCantantesDB() throws SQLException {
        Cantante[] arrayCantante = new Cantante[10];


        int countCantante = 0;

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

            Cantante cantanteDB = new Cantante(cantante, edad, direccion);
            arrayCantante[countCantante] = cantanteDB;
            countCantante++;
        }
        return arrayCantante;
    }

    public int updateCantanteDB(String cantante, String direccion, int idCantante) throws SQLException {
        int rows = 0;
        String queryUpdateCantante =
                "UPDATE cantante " +
                        " SET   CANTANTE = ?, direccion= ? " +
                        " WHERE ID_CANTANTE= ? ";


        pst = conexion.prepareStatement(queryUpdateCantante);
        pst.setString(1, cantante);
        pst.setString(2, direccion);
        pst.setInt(3, idCantante);
        rows = pst.executeUpdate();

        return rows;
    }

    public int insertCantanteDB(String cantante, int edad, String direccion) throws SQLException {
        int rows = 0;
        String queryInsertCantante =
                " INSERT INTO cantante (`CANTANTE`, `EDAD`, `DIRECCION` ) " +
                        " VALUES (?, ?, ?)";

        pst = conexion.prepareStatement(queryInsertCantante);
        pst.setString(1, cantante);
        pst.setInt(2, edad);
        pst.setString(3, direccion);

        rows = pst.executeUpdate();

        return rows;
    }

    public int deleteCantanteDB(String cantante) throws SQLException {
        int rows = 0;
        String queryDeleteCantante =
                " DELETE FROM cantante " +
                        " WHERE CANTANTE= ?";

        pst = conexion.prepareStatement(queryDeleteCantante);
        pst.setString(1, cantante);
        rows = pst.executeUpdate();

        return rows;
    }

    public void closeDB() {
        if (conexion != null) {
            try {
                conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (pst != null) {
            try {
                pst.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}

