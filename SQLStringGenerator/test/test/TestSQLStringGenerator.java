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
		String[] columns = { "column" };
		String where = "column < 100";

		SQLStringGenerator sql = new SQLStringGenerator(oneArgParser);

		String query = sql.select(columns, tableName).where(where).getSQL();
		String expected = "select " + columns[0] + " from " + tableName + " where " + where;

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

	@Test
	public void whereStatementShouldBeAddedToInsertQuery() {
		String[] values = { "test_value" };
		String where = "test > 9";

		SQLStringGenerator sql = new SQLStringGenerator(oneArgParser);

		String query = sql.insert(tableName, values).where(where).getSQL();
		String expected = "insert into " + tableName + " values (" + values[0] + ") where " + where;

		assertEquals(expected, query);
	}

	@Test
	public void updateQueryShouldSetTableNameAndUpdatedRow() {
		String updatedRow = "test = -10";

		SQLStringGenerator sql = new SQLStringGenerator(oneArgParser);

		String query = sql.update(tableName, updatedRow).getSQL();
		String expected = "update " + tableName + " set " + updatedRow;

		assertEquals(expected, query);
	}

	@Test
	public void whereStatementShouldBeAddedToUpdateQuery() {
		String updatedRow = "test = -10";
		String where = "car_amount = 10";

		SQLStringGenerator sql = new SQLStringGenerator(oneArgParser);

		String query = sql.update(tableName, updatedRow).where(where).getSQL();
		String expected = "update " + tableName + " set " + updatedRow + " where " + where;

		assertEquals(expected, query);
	}

	@Test
	public void deleteQueryShouldSetTableName() {
		SQLStringGenerator sql = new SQLStringGenerator(oneArgParser);

		String query = sql.delete(tableName).getSQL();
		String expected = "delete from " + tableName;

		assertEquals(expected, query);
	}

	// Stub implementation of SQLArgsParser for the case when only
	// one column or value parameter is passed.
	// In this case code remains simple and is working correctly
	class OneArgParser implements SQLArgsParser {
		public String parseColumns(String[] columns) {
			return columns[0];
		}

		public String parseValues(String[] values) {
			return "(" + values[0] + ")";
		}
	}
}
