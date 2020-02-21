

public class TestBox {
	double width;
	double height;
	double depth;
	TestBox(double w, double h, double d){
		width = w;
		height = h;
		depth = d;
	}
	double Volume(){
		double v;
		v = width*height*depth;
		return v;
		
	}
	
	public static void main(String args[]){
		TestBox box1 = new TestBox(10,20,30);
		System.out.println("Volume 1(10,20,30) : " + box1.Volume() );
		
		TestBox box2 = new TestBox(5,8,9);
		System.out.println("Volume 2 (5,8,9) : " + box2.Volume() );
		
	}

}
