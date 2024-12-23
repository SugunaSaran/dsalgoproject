package DataProvider;
import org.apache.poi.ss.usermodel.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class ExcelReader {
	public static Object[][] readExcelData(String filePath, String sheetName) throws IOException {
        FileInputStream file = new FileInputStream(new File(filePath));
        Workbook workbook = WorkbookFactory.create(file);
        Sheet sheet = workbook.getSheet(sheetName);
        
        Iterator<Row> rowIterator = sheet.iterator();
        int rowCount = 0;
        int columnCount = sheet.getRow(0).getPhysicalNumberOfCells();
        
        // Count rows
        while (rowIterator.hasNext()) {
            rowIterator.next();
            rowCount++;
        }

        Object[][] data = new Object[rowCount - 1][columnCount];
        rowIterator = sheet.iterator();
        int i = 0;
        rowIterator.next(); 

        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            for (int j = 0; j < columnCount; j++) {
                data[i][j] = row.getCell(j).toString();
            }
            i++;
        }
        workbook.close();
        return data;
    }
}
