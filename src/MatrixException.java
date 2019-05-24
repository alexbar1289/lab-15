public class MatrixException extends Exception {
    private MatrixError error;

    public MatrixException() {
        super();
    }

    public MatrixException(MatrixError error) {
        this.error = error;
    }

    public MatrixError getError() {
        return error;
    }
}