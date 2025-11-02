package com.campusdual.classroom;

import java.util.HashMap;
import java.util.Map;

public class Exercise {

    public static Map<String, Person> createHashMap() {
        Map<String, Person> peopleMap = new HashMap<>();
        Person person = new Person("John", "Smith");
        Person teacher = new Teacher("María", "Montessori", "Educación");
        Person police = new PoliceOfficer("Jake", "Peralta", "B-99");
        Person doctor = new Doctor("Gregory", "House", "Nefrología e infectología");


        peopleMap.put("person", person);
        peopleMap.put("teacher", teacher);
        peopleMap.put("police", police);
        peopleMap.put("doctor", doctor);

        return  peopleMap;
    }

    public static Person addMapValue(Map<String, Person> map, String key, Person value) {
        map.put(key, value);

        return value;
    }

    public static void printMapValues(Map<String, Person> map) {
        for (Map.Entry<String, Person> entry : map.entrySet()){
            System.out.println("Key: " + entry.getKey());
            entry.getValue().getDetails();
        }
    }

    public static void main(String[] args) {
        Map<String, Person> newMap;
        Person newPolice = new PoliceOfficer("Charles", "Boyle", "B-99");

        newMap = createHashMap();
        addMapValue(newMap, "police", newPolice);
        printMapValues(newMap);
    }
}