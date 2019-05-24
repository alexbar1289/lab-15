import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Matrix {
    private List<List<Float>> matrix = new ArrayList<>();
    private int rows;
    private int columns;
    private Random random = new Random();


    public Matrix(int rows, int columns, int min, int max) throws MatrixException {
        if (rows != columns)
            throw new MatrixException(MatrixError.SIZE_DISMATCH);
        else if (rows <= 0)
            throw new MatrixException(MatrixError.SIZE_INVALID);
        else if (max < min)
            throw new MatrixException(MatrixError.RANGE_INVALID);
        this.rows = rows;
        this.columns = columns;
        init(min, max);
    }

    private void init(int min, int max){
        //init
        for (int i = 0; i < rows; i++){
            matrix.add(new ArrayList<>());
        }

        //fill
        for (int r = 0; r < rows; r++){
            for (int c = 0; c < columns; c++){
                matrix.get(r).add(min + random.nextFloat() * (max - min));
            }
        }
    }

    public void setItemValue(int row, int column, float value){
        matrix.get(row).set(column, value);
    }

    public Float getItemValue(int row, int column){
        return matrix.get(row).get(column);
    }

    public void print() {
        for (List<Float> list: matrix) {
            System.out.println();
            for (Float value: list){
                System.out.printf("%07.4f ", value);
            }

        }
    }

    public float avgMainValue(){
        float avg = 0;
        for (int i = 0; i < rows; i++) {
            avg += matrix.get(i).get(i);
        }
        return avg/rows;
    }

    public float avgScndValue(){
        float avg = 0;
        for (int i = 0; i < rows; i++) {
            avg += matrix.get(i).get(rows - i - 1);
        }
        return avg/rows;
    }
}