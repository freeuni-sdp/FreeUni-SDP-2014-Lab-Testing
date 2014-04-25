package logic;

public interface SQLArgsParser {
	String parseColumns(String[] columns);
	
	String parseValues(String[] values);
}
