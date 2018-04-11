package Chapter08;

public class LinearEquation {
	
	private double a,b,c,d,e,f;
	
	LinearEquation(double a,double b,double c,double d,double e,double f){
		
		this.setA(a);
		this.setB(b);
		this.setC(c);
		this.setD(d);
		this.setE(e);
		this.setF(f);
	}

   
	public double getA() {
		return a;
	}

	public void setA(double a2) {
		this.a = a2;
	}

	public double getB() {
		return b;
	}

	public void setB(double b2) {
		this.b = b2;
	}

	public double getC() {
		return c;
	}

	public void setC(double c2) {
		this.c = c2;
	}

	public double getD() {
		return d;
	}

	public void setD(double d2) {
		this.d = d2;
	}

	public double getE() {
		return e;
	}

	public void setE(double e2) {
		this.e = e2;
	}

	public double getF() {
		return f;
	}

	public void setF(double f2) {
		this.f = f2;
	}
	
	public boolean isSolvable(){
		
		if(a*d-b*c != 0){
			return true;
		}
		return false;
	}
	
	public double getX(){
		return (e*d-b*f)*1.0/(a*d-b*c);
	}
	
	public double getY(){
		return (a*f-e*c)*1.0/(a*d-b*c);
	}
}
