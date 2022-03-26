import org.junit.Test;

import censusanalyser.StateCensusAnalyser;

public class TestAnalyser {
	@Test
	public void testCensusAnalyser() {
		StateCensusAnalyser analyser = new StateCensusAnalyser();
		analyser.loadData();
	}
}
