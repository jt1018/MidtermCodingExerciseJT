package pkgShape;

public class Cuboid extends Rectangle {
	private int iDepth;

	public int getiDepth() {
		return iDepth;
	}
	public void setiDepth(int iDepth) {
		this.iDepth = iDepth;
	}
	public double volume() {
		/* I set the condition to <=0 instead of just <0 because if the depth is 0, it would just be a flat
		 2D shape and not a cuboid.*/
		if(iDepth < 0) {
			throw new IllegalArgumentException();
			}
		// width * length * depth
		return this.getiWidth() * this.getiLength() * iDepth;
	}
 	@Override
	public double area() {
		if(iDepth <= 0) {
			throw new IllegalArgumentException();
			}
		// In this case should give us surface area.
		return (super.area() * 2) + ((this.getiWidth() * iDepth) * 2) + ((this.getiLength() * iDepth) * 2);
	}
 	@Override
 	public double perimeter() {
		// Throws “UnsupportedOperationException” when this is called for a cuboid. 
		throw new UnsupportedOperationException();
	}
		
	
}
