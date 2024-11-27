package calculo;

public class Multiplicacion {
	
	private int num1;
	private int num2;
	private int area;
	private int perimetro;
	
	public Multiplicacion(String n1, String n2) {
		this.setNum1(Integer.parseInt(n1));
		this.setNum2(Integer.parseInt(n2));
	}
	
	public void calculodelarea() {
		int m = this.getNum1() * this.getNum2()/2;
		this.setArea(m);
	}
	public void calculodelperimetro() {
		int m = 3 * this.getNum1();
		this.setPerimetro(m);
	}
	
	public int getNum1() {
		return num1;
	}
	
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	
	public int getNum2() {
		return num2;
	}
	
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public int getArea() {
		return area;
	}
	
	public void setArea(int area) {
		this.area = area;
	}
	
	public int getPerimetro() {
		return perimetro;
	}
	
	public void setPerimetro(int perimetro) {
		this.perimetro = perimetro;
	}
}
