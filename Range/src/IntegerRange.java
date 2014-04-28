
/**
 * range  is set of integers from one integer including "[" to another excluding
 * ")"
 * where beginning must be less then ending
 * @author saba
 * 
 */
public class IntegerRange {
	// integer from where begins the range
	private int beginning;
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
	public IntegerRange(int beginning, int end) throws UncorrectRangeException {
		if (beginning >= end) {
			throw new UncorrectRangeException("begining : " + beginning + " end " + end
					+ "is not correct range");
		}
		this.end = end;
		this.beginning = beginning;
	}
	
	public int getBegining() {
		return beginning;
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
		if (num >= beginning && num < end) {
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
		int resBegining = Math.max(range.getBegining(),beginning);
		int resEnd = Math.min(range.getEnd(),end);
		IntegerRange res = new IntegerRange(resBegining,resEnd);
		return res;
	}
}
