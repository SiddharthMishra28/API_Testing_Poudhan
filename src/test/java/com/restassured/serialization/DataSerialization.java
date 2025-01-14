package com.restassured.serialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataSerialization {
    public static List<User> userList = new ArrayList<>();
    public static void main(String[] args) throws JsonProcessingException {
        ReadExcel("src/test/resources/testdata.xlsx");
        String jsonData = convertToJson(userList);
        System.out.println(jsonData);
    }

    public static void ReadExcel(String path) {
        try {
            FileInputStream fis = new FileInputStream(new File(path));
            Workbook wb = new XSSFWorkbook(fis);
            Sheet sh = wb.getSheet("users");
            int rowCount = sh.getLastRowNum();
            int colCount = sh.getRow(0).getLastCellNum();
            for(int i=1 ; i<=rowCount; i++) {
                User user = new User();
                for(int j=0; j<colCount; j++) {
                    user.setUserid(sh.getRow(i).getCell(j).getStringCellValue());
                }
                userList.add(user);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String convertToJson(Object data) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String jsonObj = mapper.writeValueAsString(data);
        return jsonObj;
    }
}
