package UsingExcel;

import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook("data/excelData.xlsx");
        XSSFSheet sheet = workbook.getSheetAt(0);
        System.out.println("Num of rows: "+sheet.getPhysicalNumberOfRows());

        //getting cell data
        DataFormatter formatter = new DataFormatter();
        Object value = formatter.formatCellValue(sheet.getRow(2).getCell(1));
        System.out.println(value);

        //iterate values
        for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(formatter.formatCellValue(sheet.getRow(i).getCell(j))+"\t");
            }
            System.out.println();
        }
    }
}
