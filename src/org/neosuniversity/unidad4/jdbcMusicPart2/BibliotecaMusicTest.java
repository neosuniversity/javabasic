package org.neosuniversity.unidad4.jdbcMusicPart2;

import java.util.Arrays;

public class BibliotecaMusicTest {
    public static void main(String[] args) {
        UtilityMysqlDB db = new UtilityMysqlDB();
        db.MySQLConnect();
        Disco[] lstDiscos = new Disco[5];
        Cantante[] arrayCantante= db.getCantantesDB();

        for(int i=0;i <5 ;i++){
            Cancion[] arrayCanciones =  db.getCancionesByCantanteDB(arrayCantante[i].getNombreCantante());
            lstDiscos[i]=db.getDiscoDB(arrayCantante[i],arrayCanciones);
        }

        BibliotecaMusic biblioteca= new BibliotecaMusic(lstDiscos);
        Arrays.sort(biblioteca.getLstDiscos());

        imprimeTotalDiscos(biblioteca);
        Disco[] discos= biblioteca.getLstDiscos();
        for(int i=0;i < discos.length;i++){
            Disco disco = discos[i];
            imprimeDisco(disco,i);
            Arrays.sort(disco.getLstCanciones());
            Cancion[] canciones = disco.getLstCanciones();
            for(int j=0; j< canciones.length;j++){
                imprimeCanciones(canciones[j],j);
            }
        }
        db.closeDB();

    }
    public static void imprimeTotalDiscos(BibliotecaMusic biblioteca){
        System.out.println("Numero de discos en la biblioteca: " + biblioteca.getLstDiscos().length);
    }

    public static void imprimeDisco( Disco disco, int contador){
        System.out.println((contador +1) + " - "+"Disco: " + disco.getNombreDisco().toUpperCase()+ " #Cantante: " +disco.getCantante().getNombreCantante().toUpperCase() );
    }

    public static void imprimeCanciones( Cancion cancion, int contador){
        System.out.println("\t"+(contador +1) + " - "+"Canción: " +cancion.getNombreCancion().toUpperCase());
    }
}