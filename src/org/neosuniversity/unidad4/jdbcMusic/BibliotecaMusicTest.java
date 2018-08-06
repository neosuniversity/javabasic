package org.neosuniversity.unidad4.jdbcMusic;

public class BibliotecaMusicTest {
    public static void main(String[] args) {
        UtilityMysqlDB db = new UtilityMysqlDB();
        db.MySQLConnect();

        //cosulta la base de datos
        imprimeCantantes(db.getCantantesDB());

        //modifica un registro en la base de datos
        int rowsUptate= db.updateCantanteDB("ERIK RUBI","CIUDAD DE MEXICO",4);
        System.out.println("Numero de rows modificadas: " + rowsUptate);
        System.out.println("--------------------------------------");
        imprimeCantantes(db.getCantantesDB());

        //inserta un registro en la base de datos
        int rowsInsert= db.insertCantanteDB("JOSE JOSE",70,"CIUDAD DE MEXICO");
        System.out.println("Numero de rows insertadas: " + rowsInsert);
        System.out.println("--------------------------------------");
        imprimeCantantes(db.getCantantesDB());

        //borra un registro en la base de datos
        int rowsDelete= db.deleteCantanteDB("JOSE JOSE");
        System.out.println("Numero de rows borradas: " + rowsDelete);
        System.out.println("--------------------------------------");
        imprimeCantantes(db.getCantantesDB());

        //cierra conexiones a la BD
        db.closeDB();

    }

    private static void imprimeCantantes(Cantante[] arrayCantante){
        for(int i=0; i<arrayCantante.length;i++){
            if(arrayCantante[i]!=null){
                System.out.println(i+ 1+".-Nombre:"+arrayCantante[i].getNombreCantante() +"- Edad:" +arrayCantante[i].getEdad()+ "- direccion:"+ arrayCantante[i].getDireccion());
            }
        }
        System.out.println("--------------------------------------");
    }

}
