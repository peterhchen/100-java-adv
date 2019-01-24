public class GenericDemo {

    public static < E > void printArr (E[] inputArr) {
        for (E eArr: inputArr) {
            System.out.printf ("%s ", eArr);

        }
        System.out.println();
    }
    public static void main (String [] args) {
        Integer[] iArr = {1, 2, 3, 4, 5};
        Double[] dArr = {1.0, 2.0, 3.0, 4.0, 5.0};
        Character[] cArr = {'H', 'E', 'L', 'L', 'O'};
        printArr (iArr);
        printArr(dArr);
        printArr(cArr);
    }
}
