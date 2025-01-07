package DataProvider;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellUtil;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelReader {
	public static int totalRow;

	public List<Map<String, String>> getData(String excelFilePath, String sheetName)
			throws InvalidFormatException, IOException {

		Workbook workbook = WorkbookFactory.create(new File(excelFilePath));
		Sheet sheet = workbook.getSheet(sheetName);
		workbook.close();
		return readSheet(sheet);
	}

	private List<Map<String, String>> readSheet(Sheet sheet) {

		Row row;
		Cell cell;
		
		if(sheet==null)
			return null;

		totalRow = sheet.getLastRowNum();

		List<Map<String, String>> excelRows = new ArrayList<Map<String, String>>();

		for (int currentRow = 1; currentRow <= totalRow; currentRow++) {

			row = sheet.getRow(currentRow);
			if (row != null) {

				int totalColumn = row.getLastCellNum();

				LinkedHashMap<String, String> columnMapdata = new LinkedHashMap<String, String>();

				for (int currentColumn = 0; currentColumn < totalColumn; currentColumn++) {

					cell = row.getCell(currentColumn);
					if (cell != null && cell.getStringCellValue() !=null) {
						// cell=CellUtil.getCell(row,currentColumn);

						String columnHeaderName = sheet.getRow(sheet.getFirstRowNum()).getCell(currentColumn)
								.getStringCellValue();

						columnMapdata.put(columnHeaderName, cell.getStringCellValue());
					}

				}

				excelRows.add(columnMapdata);
			}

		}

		return excelRows;
	}

	public int countRow() {

		return totalRow;
	}

}
