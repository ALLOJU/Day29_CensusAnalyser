import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import censusanalyser.InvalidDelimiter;
import censusanalyser.InvalidFile;
import censusanalyser.StateCensusAnalyser;

public class TestAnalyser {
	StateCensusAnalyser analyser;

	@Before
	public void initialization() {
		analyser = new StateCensusAnalyser();
	}

	@Test
	public void testRecordMatch() throws InvalidFile, InvalidDelimiter {
		analyser.loadData("src/test/resources/IndiaStateCensusData.csv");
		assertEquals(true, analyser.checkData());
	}
	@Test
	public void testFileCheckSad() throws InvalidFile, InvalidDelimiter {
		analyser.loadData("src/test/resources/IndiaStateCensus.csv");
	}
	@Test
	public void testTypeCheckSad() throws InvalidFile, InvalidDelimiter {
		analyser.loadData("src/test/resources/IndiaStateCensusDataWrong.csv");
	}
	@Test
	public void testDelimiterCheckSad() throws InvalidFile, InvalidDelimiter  {
		analyser.loadData("src/test/resources/IndiaStateCensusDataWrongDeliminator.csv");
	}
	@Test
	public void testHeaderCheckSad() throws InvalidFile, InvalidDelimiter {
		analyser.loadData("src/test/resources/IndiaStateCensusData.csv");
	}
	
}
