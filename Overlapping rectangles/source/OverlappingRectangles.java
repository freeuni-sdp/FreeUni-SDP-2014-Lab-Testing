package source;

public class OverlappingRectangles {
	public static boolean Check(Rectangle first, Rectangle second){
		Point[] arr = first.getVertices();
		for(int i = 0; i < arr.length; i++){//check if at least one vertex is inseide second
			if(second.isInside(arr[i]))
				return true;
		}
		arr = second.getVertices();
		for(int i = 0; i < arr.length; i++){
			if(first.isInside(arr[i]))
				return true;
		}
		return false;
	}
}
