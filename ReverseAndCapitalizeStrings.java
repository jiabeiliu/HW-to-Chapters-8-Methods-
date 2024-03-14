public class ReverseAndCapitalizeStrings {

    public static void main(String[] args) {
        // First array
        String[] array1 = {"Anne", "John", "Alex", "Jessica"};
        System.out.println("Original array 1:");
        printArray(array1);
        String[] resultArray1 = invertAndReverseStrings(array1);
        System.out.println("Resultant array 1:");
        printArray(resultArray1);

        // Second array
        String[] array2 = {"Sun", "Mercury", "Venis", "Earth", "Mars", "Jupiter"};
        System.out.println("Original array 2:");
        printArray(array2);
        String[] resultArray2 = invertAndReverseStrings(array2);
        System.out.println("Resultant array 2:");
        printArray(resultArray2);
    }

    private static String[] invertAndReverseStrings(String[] inputArray) {
        String[] invertedArray = new String[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            // Invert the order and reverse each string
            String reversed = new StringBuilder(inputArray[inputArray.length - 1 - i]).reverse().toString();
            // Capitalize the first letter and make others lowercase
            invertedArray[i] = reversed.substring(0, 1).toUpperCase() + reversed.substring(1).toLowerCase();
        }
        return invertedArray;
    }

    private static void printArray(String[] array) {
        for (String element : array) {
            System.out.println("\"" + element + "\",");
        }
        System.out.println("End of the array\n");
    }
}
