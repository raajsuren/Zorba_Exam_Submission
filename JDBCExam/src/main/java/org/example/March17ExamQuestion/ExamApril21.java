package org.example.March17ExamQuestion;

import com.mysql.cj.result.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class ExamApril21 {
    public static void main(String[] args) throws IOException {


        File file = new File(" C:\\Users\\raajs\\Zorba_Exam_Submission\\JDBCExamMarch31\\src\\main\\resources\\Exam_info.xlsx");
        FileInputStream fileInputStream= new FileInputStream();

    XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
    // by default of XSSFWorkbook=>HSSFWorkbook hssfWorkbook=new HSSFWorkbook(fileInputStream);
    int noOfSheet = xssfWorkbook.getNumberOfSheets();
        System.out.println("no of sheet in the excel file " + noOfSheet);

        for (int i = 0; i < noOfSheet; i++) {
        XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(i);
        System.out.println("no of rows present in the sheet " + (i + 1) + ": "
                + xssfSheet.getPhysicalNumberOfRows());

        Iterator<org.apache.poi.ss.usermodel.Row> rowIterator = xssfSheet.iterator();
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            System.out.println("no of column in each row: " + row.getPhysicalNumberOfCells());

            Iterator<Cell> cellIterator = row.cellIterator();
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                System.out.println("Column data type:" + (cell.getColumnIndex() + 1));

                switch (cell.getCellType()) {
                    case STRING:
                        System.out.println(cell.getStringCellValue());
                        break;
                    case NUMERIC:
                        System.out.println(cell.getNumericCellValue());
                        break;
                    case BOOLEAN:
                        System.out.println(cell.getBooleanCellValue());
                        break;
                }


            }
        }
    }
}


}
}
