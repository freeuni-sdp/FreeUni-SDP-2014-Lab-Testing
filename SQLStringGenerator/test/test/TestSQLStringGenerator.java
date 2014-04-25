package test;

import static org.junit.Assert.assertEquals;
import logic.SQLArgsParser;
import logic.SQLStringGenerator;

import org.junit.Before;
import org.junit.Test;

public class TestSQLStringGenerator {
	private String tableName = "test_table";
	private OneColumnArgParser oneColParser;

	@Before
	public void initialize() {
		oneColParser = new OneColumnArgParser();
	}

	@Test
	public void selectQueryShouldSetColumnsAndTableName() {
		String[] columns = { "col1", "col2" };

		// SQLArgsParser stub that will be injected to CUT
		SQLArgsParser parser = new SQLArgsParser() {
			public String parseColumns(String[] columns) {
				return columns[0] + ", " + columns[1];
			}
		};
		SQLStringGenerator sql = new SQLStringGenerator(parser);

		String query = sql.select(columns, tableName).getSQL();
		String expected = "select " + columns[0] + ", " + columns[1] + " from " + tableName;

		assertEquals(expected, query);
	}

	@Test
	public void whereStatementShouldBeAdded() {
		SQLStringGenerator sql = new SQLStringGenerator(oneColParser);

		String statement = "A.x > B.x";
		String query = sql.where(statement).getSQL();
		String expected = " where " + statement;

		assertEquals(expected, query);
	}

	@Test
	public void whereStatementShouldBeAddedToSelectQuery() {
		String[] column = { "column" };
		String where = "column < 100";
		SQLStringGenerator sql = new SQLStringGenerator(oneColParser);

		String query = sql.select(column, tableName).where(where).getSQL();
		String expected = "select " + column[0] + " from " + tableName + " where " + where;

		assertEquals(expected, query);
	}

	// Stub implementation of SQLArgsParser where only one column parameter is passed
	// so that code remains simple and is working correctly
	class OneColumnArgParser implements SQLArgsParser {
		public String parseColumns(String[] columns) {
			return columns[0];
		}
	}
}
