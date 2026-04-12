package org.bagon.examples.map;

import java.util.*;

public class MainTreeMap {
    public static void main(String[] args) {
        Map<String, Object> person = new TreeMap<>(Comparator.comparing(String::length).reversed());
        person.put("name", "Diego");
        person.put("surnames", "Bautista González");
        person.put("email", "diego.bautista@officemax.com.mx");
        person.put("age", "23");

        Map<String, String> address = new TreeMap<>();
        address.put("country", "México");
        address.put("city", "Estado de México");
        address.put("municipality", "Huixquilucan");
        address.put("colony", "La Pera");
        address.put("street", "Camnino Nuevo a La Pera");
        address.put("number", "5");

        person.put("address", address);

        System.out.println(person);
    }
}