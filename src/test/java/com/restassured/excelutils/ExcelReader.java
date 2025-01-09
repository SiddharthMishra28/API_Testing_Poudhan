package com.restassured.excelutils;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReader {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream(new File("src/test/resources/testdata.xlsx"));
            Workbook wb = new XSSFWorkbook(fis);
            Sheet sh = wb.getSheet("login_credentials");
            int rowCount = sh.getLastRowNum();
            int colCount = sh.getRow(0).getLastCellNum();
            for(int i=0 ; i<=rowCount; i++) {
                for(int j=0; j<colCount; j++) {
                    System.out.println(sh.getRow(i).getCell(j).getStringCellValue());
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
