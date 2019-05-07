class MyArrayDataException extends Exception {

    String[][] mas;

    MyArrayDataException(String msg, String[][] mas){
        super(msg);
        this.mas = mas;
    }
}
