package test;

import static org.junit.Assert.*;
import logic.DefaultSQLArgsParser;
import logic.SQLArgsParser;

import org.junit.Before;
import org.junit.Test;

public class TestSQLArgsParser {
	private SQLArgsParser parser;

	@Before
	public void initialize() {
		parser = new DefaultSQLArgsParser();
	}

	@Test
	public void shouldReturnStringOfColumnNamesSeparatedByCommas() {
		String[] columns = { "col1", "col2", "col3" };

		String expected = columns[0] + ", " + columns[1] + ", " + columns[2];

		assertEquals(expected, parser.parseColumns(columns));
	}
	
	@Test
	public void shouldReturnEmptyStringWhenEmptyColumnNamesArrayIsPassed() {
		String[] columns = {};

		String expected = "";

		assertEquals(expected, parser.parseColumns(columns));
	}

}
