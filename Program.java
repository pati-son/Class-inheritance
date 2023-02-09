package lab_3;
import lab_3.matrixes.*;
public class Program{

	public static void main(String [] args){

		DopMatrix m2 = new DopMatrix(3, 3);
		System.out.println(m2);

		m2.setElement(2, 0, 4);
		System.out.println(m2);

		SquareMatrix m1 = new SquareMatrix(3);
		m1.setElement(0,1,-3);
		m1.setElement(0,2,-1);
		m1.setElement(1,0,5);
		
		System.out.println(m1);

		m1.sum(m2);
		m1.product(m2);

		DopMatrix m3 = new DopMatrix(3, 4);
		Matrix m4 = new Matrix (4, 1);
		m4.setElement(3, 0, 1);
		System.out.println(m3);
		System.out.println(m4);

		m3.product(m4);

		m2.sum(m3);
		
		
	}
}