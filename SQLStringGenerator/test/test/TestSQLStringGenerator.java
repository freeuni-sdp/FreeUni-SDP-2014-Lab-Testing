package test;

import static org.junit.Assert.assertEquals;
import logic.SQLStringGenerator;

import org.junit.Before;
import org.junit.Test;

public class TestSQLStringGenerator {
	private SQLStringGenerator sql;

	@Before
	public void initialize() {
		sql = new SQLStringGenerator();
	}

	@Test
	public void selectQueryShouldSetColumnsAndTableName() {
		String tableName = "test_table";
		String[] columns = { "col1", "col2" };
		String query = sql.select(columns, tableName);
		assertEquals("select " + columns[0] + ", " + columns[1] + " from " + tableName, query);
	}

}
