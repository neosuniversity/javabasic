package org.neosuniversity.unidad4.treemap;

import java.util.*;

public class MenuTest {

    public static void main(String args[]){

        List<Platillo> lstMenu = Arrays.asList(buildPlatilloInfo());

        Map<Platillo,String> mapPlatillos =  new TreeMap<>();

        for(int i =0; i<lstMenu.size();i++){
            mapPlatillos.put(lstMenu.get(i),lstMenu.get(i).getNombre());
        }

        for (Map.Entry<Platillo, String> entry : mapPlatillos.entrySet()) {
            Platillo key = entry.getKey();
            String value = entry.getValue();
            System.out.println("calorias: "+ key.getCalorias() +" : " + value);
        }
    }

    private static Platillo[] buildPlatilloInfo(){
        Platillo platillo1 = new Platillo("CERDO",false,800,"CARNE");
        Platillo platillo2 = new Platillo("RES",false,700,"CARNE");
        Platillo platillo3 = new Platillo("POLLO",false,400,"CARNE");
        Platillo platillo4 = new Platillo("ARROZ",true,350,"CARNE");
        Platillo platillo5 = new Platillo("PIZZA",true,550,"CARNE");
        Platillo platillo6 = new Platillo("SALMON",true,450,"CARNE");
        Platillo platillo7 = new Platillo("FRIJOLES",true,350,"CARNE");
        Platillo platillo8 = new Platillo("CONEJO",false,600,"CARNE");
        return new Platillo[]{platillo1, platillo2, platillo3, platillo4, platillo5, platillo6, platillo7, platillo8};
    }
}
