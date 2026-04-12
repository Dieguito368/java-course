package org.bagon.examples.map;

import java.util.*;

public class MainHasMap {
    public static void main(String[] args) {
        Map<String, Object> person = new HashMap<>();
        person.put("name", "Diego");
        person.put("surnames", "Bautista González");
        person.put("email", "diego.bautista@officemax.com.mx");
        person.put("age", "23");

        System.out.println(person);

        System.out.println("\n<--- Remove key --->");
        String age = (String) person.remove("age");
        boolean bool = person.remove("email", "diego.bautista@officemax.com.mx");

        System.out.println(age);
        System.out.println("Was it removed? " + bool);
        System.out.println(person);

        System.out.println("\nDoes the value Diego appear on the map? " + person.containsValue("Diego"));
        System.out.println("Does the value 23 appear on the map? " + person.containsValue("23"));

        System.out.println();

        Set<String> keys = person.keySet();
        keys.forEach(key -> System.out.println("K = " + key));

        System.out.println();

        Collection<Object> values = person.values();
        values.forEach(value -> System.out.println("V = " + value));

        System.out.println("\n<--- 1st way to print --->");

        for(Map.Entry<String, Object> pair  : person.entrySet()) {
            System.out.println(pair.getKey() + " = " + pair.getValue());
        }

        System.out.println("\n<--- 2nd way to print --->");

        for(String key : person.keySet()) {
            System.out.println(key + " = " +   person.get(key));
        }

        System.out.println("\n<--- 3rd way to print --->");

        person.forEach((key, value) -> System.out.println(key + " = " + value));

        System.out.println("\nTotal = " + person.size());
        System.out.println("\nIs empty? = " + person.isEmpty());

        System.out.println();

        person.replace("name", "Juan");
        System.out.println(person.get("name"));
        person.replace("name", "Diego");

        System.out.println();

        Map<String, String> address = new HashMap<>();
        address.put("country", "México");
        address.put("city", "Estado de México");
        address.put("municipality", "Huixquilucan");
        address.put("colony", "La Pera");
        address.put("street", "Camnino Nuevo a La Pera");
        address.put("number", "5");

        person.put("address", address);
        System.out.println(person);

        System.out.println();

        for(String key : person.keySet()) {
            Object value = person.get(key);

            if(person.get(key) instanceof Map) {
                Map<String, String> addressMap = (Map<String, String>) value;

                for(String key2 : addressMap.keySet()) {
                    System.out.println(key2 + " = " +   addressMap.get(key2));
                }
            } else {
                System.out.println(key + " = " +   value);
            }
        }
    }
}