package org.neosuniversity.unidad6.streams;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;


public class MenuTest {

    public static void main(String args[]){

        List<Platillo> lstMenu = Arrays.asList(buildPlatilloInfo());

        List<String> lstNombrePlatillo =
                lstMenu.stream()
                .filter(platillo -> platillo.getCalorias()>350)
                .sorted(Comparator.comparing(Platillo::getCalorias))
                .map(Platillo::getNombre).collect(Collectors.toList());

        AtomicInteger autoIncrment = new AtomicInteger(0);
        Map<Integer, String> mapPlatillos =
                lstNombrePlatillo.stream()
                        .collect(Collectors.toMap(value->autoIncrment.incrementAndGet(),Function.identity()));
        mapPlatillos.forEach((key, value) -> System.out.println( key +" : " + value));

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