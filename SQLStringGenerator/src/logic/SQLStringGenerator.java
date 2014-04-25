package logic;

public class SQLStringGenerator {
	private static final String SQL_SELECT = "select";
	private static final String SQL_FROM = "from";
	private static final String SQL_INSERT = "insert";
	private static final String SQL_INTO = "into";
	private static final String SQL_VALUES = "values";

	private SQLArgsParser parser;
	private StringBuilder sqlBuilder;

	public SQLStringGenerator(SQLArgsParser parser) {
		this.parser = parser;
		sqlBuilder = new StringBuilder();
	}

	public SQLStringGenerator select(String[] columns, String tableName) {
		sqlBuilder = new StringBuilder();

		sqlBuilder.append(SQL_SELECT).append(" ")
			.append(parser.parseColumns(columns)).append(" ")
			.append(SQL_FROM).append(" ")
			.append(tableName);

		return this;
	}

	public SQLStringGenerator insert(String tableName, String[] values) {
		sqlBuilder = new StringBuilder();

		sqlBuilder.append(SQL_INSERT).append(" ")
			.append(SQL_INTO).append(" ")
			.append(tableName).append(" ")
			.append(SQL_VALUES).append(" ")
			.append(parser.parseValues(values));

		return this;
	}

	public SQLStringGenerator where(String query) {
		sqlBuilder.append(" where ").append(query);
		return this;
	}

	public String getSQL() {
		return sqlBuilder.toString();
	}

	public SQLStringGenerator update(String tableName, String updatedRow) {
		return this;
	}

}
