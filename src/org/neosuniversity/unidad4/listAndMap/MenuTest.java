package org.neosuniversity.unidad4.listAndMap;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;


public class MenuTest {

    public static void main(String args[]){

        List<Platillo> lstMenu = Arrays.asList(buildPlatilloInfo());

        List<Platillo> lstMenuAltoCalorias = new ArrayList<>();
        for(Platillo platillo: lstMenu){
            if(platillo.getCalorias()>350){
                lstMenuAltoCalorias.add(platillo);
            }
        }
        Collections.sort(lstMenuAltoCalorias, new Comparator<Platillo>() {
            @Override
            public int compare(Platillo platillo1, Platillo platillo2) {
                return Integer.compare(platillo1.getCalorias(),platillo2.getCalorias());
            }
        });

        List<String> lstNombrePlatillo = new ArrayList<>();
        for(Platillo platillo: lstMenuAltoCalorias){
            lstNombrePlatillo.add(platillo.getNombre());
        }

        Map<Integer,String> mapPlatillos = new HashMap<>();
        for(int i =0; i<lstNombrePlatillo.size();i++){
            mapPlatillos.put(new Integer(i+1),lstNombrePlatillo.get(i));
        }

        for (Map.Entry<Integer, String> entry : mapPlatillos.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key +" : " + value);
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
