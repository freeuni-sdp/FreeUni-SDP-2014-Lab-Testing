package logic;

public class SQLStringGenerator {
	private static final String SQL_SELECT = "select";
	private static final String SQL_FROM = "from";

	private SQLArgsParser parser;

	public SQLStringGenerator(SQLArgsParser parser) {
		this.parser = parser;
	}

	public String select(String[] columns, String tableName) {
		StringBuilder builder = new StringBuilder();
		
		builder.append(SQL_SELECT).append(" ")
			.append(parser.parseColumns(columns)).append(" ")
			.append(SQL_FROM).append(" ")
			.append(tableName);
		
		return builder.toString();
	}

}
