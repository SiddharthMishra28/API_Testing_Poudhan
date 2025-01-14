package com.restassured.serialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.restassured.composition.Car;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
//        Person person = new Person("Sid", "Mishra", "sid@test.com", "12083021", 32);
//        String json = new Main().convertToJson(person);
//        System.out.println(json);

        String jsonData = "{\n" +
                "    \"model\": \"Scorpio\",\n" +
                "    \"engine\": {\n" +
                "        \"maxCapacityInCc\": 2200,\n" +
                "        \"make\": \"Mahindra\",\n" +
                "        \"model\": \"MHawk\",\n" +
                "        \"transmission\": {\n" +
                "            \"type\": \"CVT\",\n" +
                "            \"numGears\": 6,\n" +
                "            \"maxTorque\": 650\n" +
                "        }\n" +
                "    }\n" +
                "}";
        ObjectMapper mapper = new ObjectMapper();
        Car scorpio = mapper.readValue(jsonData, Car.class);
        System.out.println(scorpio.getEngine().getModel());
    }

    public String convertToJson(Object data) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String jsonObj = mapper.writeValueAsString(data);
        return jsonObj;
    }


}
