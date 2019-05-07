public class Main {
    private static void sum(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int num;
        int result = 0;
        int fix = 4;

        if(arr.length != fix ) throw new MyArraySizeException("Недопустимый размер массива", arr);
        for(String[] i : arr){
            if(i.length != fix)  throw new MyArraySizeException("Недопустимый размер массива", arr);
        }
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(!isNumber(arr[i][j])) throw new MyArrayDataException("Ячейка массива [" + i + "][" + j + "] не является числом", arr);
                num = Integer.parseInt(arr[i][j]);
                result += num;
            }
        }
        System.out.println(result);
    }

    private static boolean isNumber(String num){
        return num.matches("[-+]?\\d*\\.?\\d+");
    }

    public static void main(String[] args) {

        String[][] arr1 = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"2", "3", "3", "1"}, {"6", "3", "2", "2"}};
        String[][] arr2 = {{"1", "2", "3", "4"}, {"5", "6", "8"}, {"2", "3", "3", "1"}, {"6", "3", "2", "2"}};
        String[][] arr3 = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"2", "d", "3", "1"}, {"6", "3", "2", "2"}};

        try {
            sum(arr1);
        } catch (MyArraySizeException | MyArrayDataException e){
            e.printStackTrace();
        }

        try {
            sum(arr2);
        } catch (MyArraySizeException | MyArrayDataException e){
            e.printStackTrace();
        }

        try {
            sum(arr3);
        } catch (MyArraySizeException | MyArrayDataException e){
            e.printStackTrace();
        }
    }
}