public enum MatrixError {
    SIZE_DISMATCH("rows must match columns"),
    SIZE_INVALID("Invalid size"),
    RANGE_INVALID("Invalid range");

    private String error;

    private MatrixError(String errorString){
        this.error = errorString;
    }

    public String getErrorString(){
        return error;
    }


}