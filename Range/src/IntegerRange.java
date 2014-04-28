/**
 * integer range
 * range means from one integer including "[" to another excluding  ")"
 * @author saba
 *
 */
public class IntegerRange{
	//integer where the from
	int from; 
	int to;
	public IntegerRange(int from,int to) {
		this.to = to;
		this.from = from;
	}

	boolean isInRange(int num){
		if(num>=from && num<to){
			return true;
		}
		return false;
	}
	
	/**
	 * intersects 2 ranges
	 * returns intersection of this ranges
	 * @param range
	 * @return
	 */
	public IntegerRange intersectWithRange(IntegerRange range) {
		// TODO Auto-generated method stub
		return null;
	}
}
