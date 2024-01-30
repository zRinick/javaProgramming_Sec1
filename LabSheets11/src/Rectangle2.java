
public class Rectangle2 implements Shape2 {

	private double width,length;
	
	Rectangle2(double width,double length){
		this.width=width;
		this.length=length;
		
	}
	@Override
	public double getArea() {	
		return this.width*this.length;
	}
	public String toString() {
		return "Ractangle[width= "+this.width
				+ ",length= "+this.length;
	}
	public double getWidth() {
		return this.getWidth();
	}
	public double getLength() {
		return this.getLength();
	}
	
	
}
