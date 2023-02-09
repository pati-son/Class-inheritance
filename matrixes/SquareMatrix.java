package lab_3.matrixes;
import lab_3.exceptions.*;
public class SquareMatrix extends Matrix{
	
	public SquareMatrix(int size){
		
		super(size, size);
		if(size <= 0)
			throw new MatrixException("Inncorect matrix size");
		else{
			row = size;
			column = size;
			matrix = new int[size][size];

			for(int i = 0; i < size; i++)
			for(int j = 0; j < size; j++)
	
				if(i ==	j) matrix[i][j] = 1;
				else matrix[i][j] = 0;
		}
	}

	public SquareMatrix sum(SquareMatrix m){
		
		SquareMatrix matrix = new SquareMatrix(row);
			for(int i = 0; i < row; i++)
				for(int j = 0; j < column; j++)
					matrix.setElement(i, j, 0);

		if(row != m.row || column != m.column){
			throw new MatrixException("Error. Matrixes must be the same size");
		}
		else{
			for(int i = 0; i < row; i++)
				for(int j = 0; j < column; j++)
					matrix.setElement(i, j, this.getElement(i, j) + m.getElement(i, j));
		}
		System.out.println(matrix);
		return matrix;
		
	}
}

	
	
	