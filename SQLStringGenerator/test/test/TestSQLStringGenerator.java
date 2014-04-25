package test;

import static org.junit.Assert.assertEquals;
import logic.SQLArgsParser;
import logic.SQLStringGenerator;

import org.junit.Before;
import org.junit.Test;

public class TestSQLStringGenerator {
	private String tableName = "test_table";
	private OneArgParser oneArgParser;

	@Before
	public void initialize() {
		oneArgParser = new OneArgParser();
	}

	@Test
	public void selectQueryShouldSetColumnsAndTableName() {
		String[] columns = { "col1", "col2" };

		final String parsedCols = columns[0] + ", " + columns[1];

		// SQLArgsParser stub that will be injected to CUT
		SQLArgsParser parser = new SQLArgsParser() {
			public String parseColumns(String[] columns) { return parsedCols; }
			public String parseValues(String[] values) { return null; }
		};
		SQLStringGenerator sql = new SQLStringGenerator(parser);

		String query = sql.select(columns, tableName).getSQL();
		String expected = "select " + parsedCols + " from " + tableName;

		assertEquals(expected, query);
	}

	@Test
	public void whereStatementShouldBeAdded() {
		SQLStringGenerator sql = new SQLStringGenerator(oneArgParser);

		String statement = "A.x > B.x";
		String query = sql.where(statement).getSQL();
		String expected = " where " + statement;

		assertEquals(expected, query);
	}

	@Test
	public void whereStatementShouldBeAddedToSelectQuery() {
		String[] column = { "column" };
		String where = "column < 100";
		SQLStringGenerator sql = new SQLStringGenerator(oneArgParser);

		String query = sql.select(column, tableName).where(where).getSQL();
		String expected = "select " + column[0] + " from " + tableName + " where " + where;

		assertEquals(expected, query);
	}

	@Test
	public void insertQueryShouldSetTableNameAndValues() {
		String[] values = { "1", "2", "3", "4" };

		final String parsedValues = "(" + values[0] + ", " + values[1] + ", " + values[1] + ", " + values[1] + ")";

		// SQLArgsParser stub that will be injected to CUT
		SQLArgsParser parser = new SQLArgsParser() {
			public String parseValues(String[] values) { return parsedValues; }
			public String parseColumns(String[] columns) { return null; }
		};
		SQLStringGenerator sql = new SQLStringGenerator(parser);

		String query = sql.insert(tableName, values).getSQL();
		String expected = "insert into " + tableName + " values " + parsedValues;

		assertEquals(expected, query);
	}

	// Stub implementation of SQLArgsParser where only one column and value parameter is passed
	// so that code remains simple and is working correctly
	class OneArgParser implements SQLArgsParser {
		public String parseColumns(String[] columns) {
			return columns[0];
		}

		public String parseValues(String[] values) {
			return values[0];
		}
	}
}
