import javax.swing.text.html.MinimalHTMLWriter;

/**
 * integer range range means begining one integer including "[" end another excluding
 * ")"
 * 
 * @author saba
 * 
 */
public class IntegerRange {
	// integer from where begins the range
	private int begining;
	// integer where (excluding) ends the range
	private int end;

	
	/**
	 * constructor
	 * checks if range is correct
	 * if not throws UncorrectRangeException
	 * @param begining
	 * @param end
	 * @throws UncorrectRangeException
	 */
	public IntegerRange(int begining, int end) throws UncorrectRangeException {
		if (begining >= end) {
			throw new UncorrectRangeException("begining : " + begining + " end " + end
					+ "is not correct range");
		}
		this.end = end;
		this.begining = begining;
	}
	
	public int getBegining() {
		return begining;
	}
	
	public int getEnd() {
		return end;
	}
	
	/**
	 * checks if number is in this range
	 * @param num
	 * @return
	 */
	boolean isInRange(int num) {
		if (num >= begining && num < end) {
			return true;
		}
		return false;
	}

	/**
	 * intersects 2 ranges returns intersection of this ranges
	 * 
	 * @param range
	 * @return
	 * @throws UncorrectRangeException 
	 */
	public IntegerRange intersectWithRange(IntegerRange range) throws UncorrectRangeException {
		int resBegining = Math.max(range.getBegining(),begining);
		int resEnd = Math.min(range.getEnd(),end);
		IntegerRange res = new IntegerRange(resBegining,resEnd);
		return res;
	}
}
