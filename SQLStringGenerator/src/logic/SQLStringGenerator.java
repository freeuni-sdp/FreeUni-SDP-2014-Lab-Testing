package logic;

public class SQLStringGenerator {
	private static final String SQL_SELECT = "select";
	private static final String SQL_FROM = "from";

	private SQLArgsParser parser;
	private String sql;

	public SQLStringGenerator(SQLArgsParser parser) {
		this.parser = parser;
		sql = "";
	}

	public SQLStringGenerator select(String[] columns, String tableName) {
		StringBuilder builder = new StringBuilder();

		builder.append(SQL_SELECT).append(" ")
			.append(parser.parseColumns(columns)).append(" ")
			.append(SQL_FROM).append(" ")
			.append(tableName);

		sql = builder.toString();

		return this;
	}

	public SQLStringGenerator where(String query) {
		return this;
	}

	public String getSQL() {
		return sql;
	}

}
