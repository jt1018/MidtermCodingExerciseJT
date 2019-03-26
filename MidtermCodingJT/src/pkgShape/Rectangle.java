package pkgShape;

public class Rectangle extends Shape {
	private int iWidth;
	private int iLength;

	public int getiWidth() {
		return iWidth;
	}
	public void setiWidth(int iWidth) {
		this.iWidth = iWidth;
	}
	
	public int getiLength() {
		 return iLength;
	}
	public void setiLength(int iLength) {
		this.iLength = iLength;
	}
	public double area() {
		if(iWidth < 0 || iLength < 0) {
			throw new IllegalArgumentException();
			}
		return iWidth * iLength;
	}
	
	public double perimeter() {
		if(iWidth < 0 || iLength < 0) {
			throw new IllegalArgumentException();
			}
		return (iWidth * 2) + (iLength * 2);
	}


}
