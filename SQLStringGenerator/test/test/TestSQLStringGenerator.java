package test;

import static org.junit.Assert.assertEquals;
import logic.SQLArgsParser;
import logic.SQLStringGenerator;

import org.junit.Test;

public class TestSQLStringGenerator {
	@Test
	public void selectQueryShouldSetColumnsAndTableName() {
		String tableName = "test_table";
		String[] columns = { "col1", "col2" };
		
		// SQLArgsParser stub that will be injected to CUT
		SQLArgsParser parser = new SQLArgsParser() {
			public String parseColumns(String[] columns) {
				return columns[0] + ", " + columns[1];
			}
		};
		SQLStringGenerator sql = new SQLStringGenerator(parser);

		String query = sql.select(columns, tableName);
		String expected = "select " + columns[0] + ", " + columns[1] + " from " + tableName;

		assertEquals(expected, query);
	}

}
