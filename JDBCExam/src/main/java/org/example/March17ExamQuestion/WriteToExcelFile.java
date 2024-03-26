package org.example.March17ExamQuestion;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

public class WriteToExcelFile {
    public void writeToExcel (List<Employee> receivedList, File file, XSSFWorkbook xssfWorkbook){
        try {
            //get the sheet
            int noOfSheet = xssfWorkbook.getNumberOfSheets();
            for (int i = 0; i < noOfSheet; i++) {
                XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(i);
                System.out.println("No of Rows in the Sheet : " + (i + 1) + " :: " + xssfSheet.getPhysicalNumberOfRows());
                for (int j = 0; j <= receivedList.size(); j++) {
                    Row row = xssfSheet.getRow(j);
                    //System.out.println(row.getLastCellNum());
                    Cell cell = row.createCell(row.getLastCellNum());
                    //header of the last column
                    if (j == 0) {
                        cell.setCellValue("Employee Monthly Salary");
                    } else {
                        Employee employee = receivedList.get(j - 1);
                        cell.setCellValue(employee.getEmpSalary());
                    }
                }
            }

            FileOutputStream outputStream = new FileOutputStream(file);
            xssfWorkbook.write(outputStream);
            outputStream.close();
            System.out.println("Successfully able to write back to excel file");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}