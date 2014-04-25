package logic;

import java.util.Arrays;

public class DefaultSQLArgsParser implements SQLArgsParser {

	public String parseColumns(String[] columns) {
		return Arrays.toString(columns).replace("[", "").replace("]", "");
	}

	public String parseValues(String[] values) {
		return null;
	}

}
