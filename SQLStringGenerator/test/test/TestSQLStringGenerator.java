package test;

import static org.junit.Assert.fail;
import logic.SQLStringGenerator;

import org.junit.Before;
import org.junit.Test;

public class TestSQLStringGenerator {
	private SQLStringGenerator sql;

	@Before
	public void initialize() {
		sql = new SQLStringGenerator();
	}

	@Test
	public void selectQueryShouldSetColumnsAndTableName() {
		fail("Not yet implemented");
	}

}
