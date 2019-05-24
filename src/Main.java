public class Main {

    public static void main(String[] args) {
        // write your code here
        //1.класс matrix констр. (кол-во строк, кол-во столб, мин. знач., макс. знач.)
        //init - ArrayList<ArrayList<float>>...тип float
        //констр();
        //методы void setItemValue(x,y,value), float getItemValue(x,y);
        //getMatrix() - ?
        //Main - вызов Matrix, создать кв.матрицу разм. >3 и нечетную, вывод
        //найти среднее знач. элем. на гл., побочной диагонали
        //сравнить их и большее из них поставить в центр матрицы
        final int ROWS = 7;
        final int COLUMNS = 7;
        final int MIN = 7;
        final int MAX = 49;
        try {
            Matrix matrix = new Matrix(ROWS, COLUMNS, MIN, MAX);
            matrix.print();

            float valueMain = matrix.avgMainValue();
            float valueScnd = matrix.avgScndValue();
            System.out.println("\n\nAverage value on Main: " + valueMain);
            System.out.println("Average value on Secondary: " + valueScnd);

            if (valueMain >= valueScnd)
                matrix.setItemValue(ROWS/2, COLUMNS/2, valueMain);
            else matrix.setItemValue(ROWS/2, COLUMNS/2, valueScnd);

            matrix.print();
        } catch (MatrixException e) {
            System.out.println("Error: " + e.getError().getErrorString());
        }
    }
}