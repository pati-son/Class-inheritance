package lab_3.matrixes;
import lab_3.exceptions.*;
public class DopMatrix extends Matrix{

	public DopMatrix(int row, int column){
		super(row, 1);
		this.column = column;
	}
	public int getElement(int r, int c){
		return matrix[r][0] + c;
	}

	public void setElement(int r, int c, int value){
		if(c != 0) {
			throw new MatrixException("Error, you can't change this element");
		}
		else
			matrix[r][0] = value; 
	}
}
