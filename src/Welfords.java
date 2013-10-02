
public class Welfords {
	public double xbar=0;
	public double vi=0;
	public int lastI;
	public  void welford(float x, int i){
		vi= (vi+((i-1)/i)*Math.pow((x-xbar),2));
		xbar+=1/i*(x-xbar);
		lastI=i;
	}
	public double getVariance(){
		return vi/lastI;
	}
	public double getAverage(){
		return xbar;
	}
	
}
