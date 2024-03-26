package org.example.March17ExamQuestion;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReadFromExcelFile {
    public static void main(String[] args) {
        List<Employee> employee1List = new ArrayList<>();
        try {
            File file = new File("C:\\Users\\raajs\\Zorba_Exam_Submission\\JDBCExam\\src\\main\\resources\\employee (1).xlsx");
            FileInputStream fileInputStream = new FileInputStream(file);
            XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
            int noOfSheets = xssfWorkbook.getNumberOfSheets();
            for (int i = 0; i < noOfSheets; i++) {
                XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(i);
                System.out.println(xssfSheet.getPhysicalNumberOfRows());
                Iterator<Row> rowIterator = xssfSheet.iterator();
                while (rowIterator.hasNext()) {
                    Row row = rowIterator.next();
                    Employee employee1 = new Employee();
                    Iterator<Cell> cellIterator = row.iterator();
                    if (row.getRowNum() != 0) {
                        while (cellIterator.hasNext()) {
                            Cell cell = cellIterator.next();
                            switch (cell.getColumnIndex()) {
                                case 0:
                                    Double var = Double.parseDouble(String.valueOf(cell.getNumericCellValue()));
                                    employee1.setEmpId(var.intValue());
                                    break;
                                case 1:
                                    employee1.setEmpName(cell.getStringCellValue());
                                    break;
                                case 2:
                                    employee1.setEmpAddress(cell.getStringCellValue());
                                    break;
                                case 3:
                                    employee1.setEmpEmail(cell.getStringCellValue());
                                    break;
                                case 4:
                                    Double var1 = Double.parseDouble(String.valueOf(cell.getNumericCellValue()));
                                    employee1.setEmpExperience(var1.intValue());
                                    break;

                            }

                        }
                        employee1List.add(employee1);
                    }


                }
                System.out.println(employee1List);
            }
            //calculate emp Salary
            List<Employee> updatedList = calculateSalary(employee1List);
            System.out.println(updatedList);

            //write back to excelSheet
            WriteToExcelFile writeToExcelFile = new WriteToExcelFile();
            writeToExcelFile.writeToExcel(updatedList, file, xssfWorkbook);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static List<Employee> calculateSalary(List<Employee> receivedEmpList){
        for (Employee emp: receivedEmpList) {
            double salaryRate = 0.0d;
            if (emp.getEmpExperience() <= 5) {
                salaryRate = 1000.0d;
            } else if (emp.getEmpExperience() > 5 && emp.getEmpExperience() <= 10) {
                salaryRate= 2500.0d;
            } else if (emp.getEmpExperience() > 10 && emp.getEmpExperience() <= 20) {
                salaryRate = 5000.0d;
            } else if (emp.getEmpExperience() > 20) {
                salaryRate = 8000.0d;
            }
            double finalSalary = salaryRate * 5;
            emp.setEmpSalary(finalSalary);
        }
        return receivedEmpList;
    }
}