/**
 * integer range range means from one integer including "[" to another excluding
 * ")"
 * 
 * @author saba
 * 
 */
public class IntegerRange {
	// integer from where begins the range
	int from;
	// integer where (excluding) ends the range
	int to;

	/**
	 * constructor
	 * checks if range is correct
	 * if not throws UncorrectRangeException
	 * @param from
	 * @param to
	 * @throws UncorrectRangeException
	 */
	public IntegerRange(int from, int to) throws UncorrectRangeException {
		if (from >= to) {
			throw new UncorrectRangeException("from : " + from + " to " + to
					+ "is not correct range");
		}
		this.to = to;
		this.from = from;
	}
	/**
	 * checks if number is in this range
	 * @param num
	 * @return
	 */
	boolean isInRange(int num) {
		if (num >= from && num < to) {
			return true;
		}
		return false;
	}

	/**
	 * intersects 2 ranges returns intersection of this ranges
	 * 
	 * @param range
	 * @return
	 */
	public IntegerRange intersectWithRange(IntegerRange range) {
		// TODO Auto-generated method stub
		return null;
	}
}
