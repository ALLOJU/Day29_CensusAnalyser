package censusanalyser;
/**
 * Custom exception for invalid file
 * @author nani
 *
 */
public class InvalidFile extends Exception {
	public InvalidFile() {
		super();
	}
	
	public InvalidFile(String message) {
		super(message);
	}
}
