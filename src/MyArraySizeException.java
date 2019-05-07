class MyArraySizeException extends Exception {

    String[][] mas;


    MyArraySizeException(String msg, String[][] mas){
        super(msg);
        this.mas = mas;
    }
}
