package org.neosuniversity.unidad2.musicReto;


import java.util.Arrays;

/**
 * Created by camus on 02/06/2018.
 */
public class BibliotecaMusicaTest {

    public static void main(String[] args){

        Cantante cantante1 = new Cantante("Alexander Acha", 25);
        Cantante cantante2 = new Cantante("Pedro Fernandez", 48, "Jalisco Mexico");
        Cantante cantante3 = new Cantante("Luis Miguel",50);
        Cantante cantante4 = new Cantante("Erik Rubi", 48);
        Cantante cantante5 = new Cantante("Aranza", 39, "Ciudad de Mexico");

        Cancion cancion1 = new Cancion("Te amo",4.56f);
        Cancion cancion2 = new Cancion("Amor sincero", 5.23f);
        Cancion cancion3 = new Cancion("la de la mochila azul",3.58f);
        Cancion cancion4 = new Cancion("la incondicional",4.23f);
        Cancion cancion5 = new Cancion("princesa tibetana",4.45f);
        Cancion cancion6 = new Cancion("mentiras",3.56f);
        Cancion cancion7 = new Cancion("luz de luna",4.10f);
        Cancion cancion8 = new Cancion("amor divino",4.56f);
        Cancion cancion9 = new Cancion("mexico en la sangre",4.23f);
        Cancion cancion10 = new Cancion("corro vuelo", 4.56f);

        Cancion lstCanciones1[] = {cancion1,cancion2};
        Cancion lstCanciones2[] = {cancion3,cancion8};
        Cancion lstCanciones3[] = {cancion4,cancion9};
        Cancion lstCanciones4[] = {cancion5,cancion10};
        Cancion lstCanciones5[] = {cancion6,cancion7};


        Disco disco1 = new Disco("la vida es",2011, cantante1, lstCanciones1);
        Disco disco2 = new Disco("voy", 2008,cantante2, lstCanciones2);
        Disco disco3 = new Disco("No culpes a la noche",2009,cantante3, lstCanciones3);
        Disco disco4 = new Disco("la casa del amor",1993,cantante4, lstCanciones4);
        Disco disco5 = new Disco("mi isla desierta",1995,cantante5, lstCanciones5);
        Disco[] lstDiscos = {disco1,disco2,disco3,disco4,disco5};


        BibliotecaMusica biblioteca= new BibliotecaMusica(lstDiscos);
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

    }
    public static void imprimeTotalDiscos(BibliotecaMusica biblioteca){
        System.out.println("Numero de discos en la biblioteca: " + biblioteca.getLstDiscos().length);
    }

    public static void imprimeDisco( Disco disco, int contador){
        System.out.println((contador +1) + " - "+"Disco: " + disco.getNombreDisco().toUpperCase()+ " #Cantante: " +disco.getCantante().getNombreCantante().toUpperCase() );
    }

    public static void imprimeCanciones( Cancion cancion, int contador){
        System.out.println("\t"+(contador +1) + " - "+"Canción: " +cancion.getNombreCancion().toUpperCase());
    }

}
