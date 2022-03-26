import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import censusanalyser.CSVStateCode;
import censusanalyser.InvalidDelimiter;
import censusanalyser.InvalidFile;
import censusanalyser.StateCensusAnalyser;

public class TestAnalyser {
	StateCensusAnalyser analyser;
	CSVStateCode codeAnalyser;
	@Before
	public void initialization() {
		analyser = new StateCensusAnalyser();
		codeAnalyser = new CSVStateCode();
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
	
	@Test
	public void testCodeRecordMatch() throws Exception {
		codeAnalyser.loadData("src/test/resources/IndiaStateCode.csv");
		assertEquals(true, codeAnalyser.checkData(37));
	}
	
}
