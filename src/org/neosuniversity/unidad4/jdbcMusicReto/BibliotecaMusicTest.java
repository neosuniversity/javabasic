package org.neosuniversity.unidad4.jdbcMusicReto;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BibliotecaMusicTest {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UtilityMysqlDB db = new UtilityMysqlDB();
        db.MySQLConnect();
        List<Disco> lstDiscos = new ArrayList<>();
        List<Cantante> lstCantante= db.getCantantesDB();

        for(int i=0;i <lstCantante.size() ;i++){
            List<Cancion> lstCanciones =  db.getCancionesByCantanteDB(lstCantante.get(i).getNombreCantante());
            lstDiscos.add(db.getDiscoDB(lstCantante.get(i),lstCanciones));
        }

        BibliotecaMusic biblioteca= new BibliotecaMusic(lstDiscos);
        Collections.sort(biblioteca.getLstDiscos());

        imprimeTotalDiscos(biblioteca);
        List<Disco> discos= biblioteca.getLstDiscos();
        for(int i=0;i < discos.size();i++){
            Disco disco = discos.get(i);
            imprimeDisco(disco,i);
            Collections.sort(disco.getLstCanciones());
            List<Cancion> canciones = disco.getLstCanciones();
            for(int j=0; j< canciones.size();j++){
                imprimeCanciones(canciones.get(j),j);
            }
        }
        db.closeDB();

    }
    public static void imprimeTotalDiscos(BibliotecaMusic biblioteca){
        System.out.println("Numero de discos en la biblioteca: " + biblioteca.getLstDiscos().size());
    }

    public static void imprimeDisco( Disco disco, int contador){
        System.out.println((contador +1) + " - "+"Disco: " + disco.getNombreDisco().toUpperCase()+ " #Cantante: " +disco.getCantante().getNombreCantante().toUpperCase() );
    }

    public static void imprimeCanciones( Cancion cancion, int contador){
        System.out.println("\t"+(contador +1) + " - "+"Canción: " +cancion.getNombreCancion().toUpperCase());
    }
}
