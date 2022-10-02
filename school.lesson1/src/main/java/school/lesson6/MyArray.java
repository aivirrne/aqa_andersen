package school.lesson6;

public class MyArray {
    public static int sum2DArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4) throw new MyArraySizeException();
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            if (array[i].length != 4) throw new MyArraySizeException();
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException ex) {
                    throw new MyArrayDataException(i, j, array[i][j]);
                }
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        String[][] valid = new String[][]{{"1", "1", "1", "1"}, {"2", "2", "2", "2"}, {"3", "3", "3", "3"}, {"4", "4", "4", "4"}};
        String[][] invalidNRows = new String[][]{{"1", "1", "1", "1"}, {"2", "2", "2", "2"}, {"3", "3", "3", "3"}};
        String[][] invalidNCols = new String[][]{{"1", "1", "1"}, {"2", "2", "2", "2"}, {"3", "3", "3", "3"}, {"4", "4", "4", "4"}};
        String[][] invalidValue = new String[][]{{"1", "1", "1", "z"}, {"2", "2", "2", "2"}, {"3", "3", "3", "3"}, {"4", "4", "4", "4"}};
        String[][][] arrays = new String[][][]{valid, invalidNRows, invalidNCols, invalidValue};

        for (String[][] arr : arrays) {
            try {
                System.out.println("The sum of array is " + sum2DArray(arr));
            } catch (Exception e) {
                //noinspection ThrowablePrintedToSystemOut
                System.out.println(e);
            }
        }
    }
}

class MyArraySizeException extends Exception {
    public MyArraySizeException() {
        super("Wrong size of the array.");
    }
}

class MyArrayDataException extends Exception {
    public MyArrayDataException(int i, int j, String value) {
        super("In row " + i + " and column " + j + " value is not an integer, it is: " + value);
    }
}

