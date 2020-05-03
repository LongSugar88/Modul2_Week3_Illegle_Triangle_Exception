class IllegleTriangleExceptionc extends RuntimeException {
    public IllegleTriangleExceptionc(){
        super("error");
    }
    public IllegleTriangleExceptionc(String note){
        super(note);
    }
}
