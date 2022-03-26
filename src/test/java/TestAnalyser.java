import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import censusanalyser.InvalidFile;
import censusanalyser.StateCensusAnalyser;

public class TestAnalyser {
	StateCensusAnalyser analyser;

	@Before
	public void initialization() {
		analyser = new StateCensusAnalyser();
	}

	@Test
	public void testRecordMatch() throws InvalidFile {
		analyser.loadData("src/test/resources/IndiaStateCensusData.csv");
		assertEquals(true, analyser.checkData());
	}
	@Test
	public void testFileCheckSad() throws InvalidFile {
		analyser.loadData("src/test/resources/IndiaStateCensus.csv");
	}
	@Test
	public void testTypeCheckSad() throws InvalidFile {
		analyser.loadData("src/test/resources/IndiaStateCensusDataWrong.csv");
	}
}
