package methodExamples;

public class MethodExamples {
	
	double length;
	double width;
	double height;
	
	public double volume(){
		return length*width*height;
	}
	public MethodExamples(double length, double width) {
		this.length=length;
		this.width=width;
	}
	
	public MethodExamples(double length,double width,double height){
		this.width=width;
		this.length=length;
		this.height=height;
	}
	public double area(){
		return length*width;
	}

	public static void main(String[] args) {
		MethodExamples me1 = new MethodExamples(2,3);
		MethodExamples me2 = new MethodExamples(2,2,2);
				
		double area = me1.area();
		System.out.println("area: "+area);
		double vol = me2.volume();
		System.out.println(vol);
	}

}
