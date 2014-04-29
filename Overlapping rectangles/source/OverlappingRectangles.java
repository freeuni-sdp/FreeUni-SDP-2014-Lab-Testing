package source;

public class OverlappingRectangles {
	public static boolean Check(Rectangle first, Rectangle second){
		Point[] arr = new Point[4];//create array of vertices
		arr[0] = first.getL();
		arr[1] = new Point(first.getL().getX() + first.getWidht(), first.getL().getY());
		arr[2] = new Point(first.getL().getX(), first.getL().getY() + first.getHeight());
		arr[3] = first.getR();
		for(int i = 0; i < arr.length; i++){//check if at least one vertex is inseide second
			if(second.isInside(arr[i]))
				return true;
		}
		return false;
	}
}
