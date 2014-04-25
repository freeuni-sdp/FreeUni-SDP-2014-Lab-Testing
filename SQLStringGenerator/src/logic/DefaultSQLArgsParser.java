package logic;

import java.util.Arrays;

public class DefaultSQLArgsParser implements SQLArgsParser {

	public String parseColumns(String[] columns) {
		return Arrays.toString(columns).replace("[", "").replace("]", "");
	}

	public String parseValues(String[] values) {
		StringBuilder builder = new StringBuilder();
		builder.append("(").append(parseColumns(values)).append(")");
		return builder.toString();
	}

}
