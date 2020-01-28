/**
 * This class is used to perform a unit test on the
 * ArrayPractice class.  
 * 
 * DO NOT ALTER THIS CLASS UNTIL INSTRUCTED TO DO SO.  
 *
 * @author Prof. White, modified by (your names)
 * @version Fall 2019
 */
public class UnitTestArrayPractice
{
    public static void main(String args[])
    {
        Double dArr[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        Integer iArr[] = {1, 5, 4, 2, 3};
        Boolean bArr[] = {true, false, false, true, true, true};
        String sArr[] = {"Hello", "World!"};

        //Test 0
        System.out.println("***Testing ArrayPractice.sum(Double[])***\n");
        printArray(dArr);
        System.out.println("Expected:  Sum of elements:  16.5");
        System.out.println("Actual:    Sum of elements:  " + ArrayPractice.sum(dArr));
        System.out.println("\n***End test ArrayPractice.sum(Double[])***\n");

        //Test 1
        System.out.println("***Testing ArrayPractice.sum(Integer[])***\n");
        printArray(iArr);
        System.out.println("Expected:  Sum of elements:  15");
        System.out.println("Actual:    Sum of elements:  " + ArrayPractice.sum(iArr));
        System.out.println("\n***End test ArrayPractice.sum(Integer[])***\n");

        //Test 2
        System.out.println("***Testing ArrayPractice.largest(Integer[])***\n");
        printArray(iArr);
        System.out.println("Expected:  Largest:  5");
        System.out.println("Actual:    Largest:  " + ArrayPractice.largest(iArr));
        System.out.println("\n***End test ArrayPractice.largest(Integer[])***\n");

        //Test 3
        System.out.println("***Testing ArrayPractice.countLarger(Integer[], int)***\n");
        System.out.print("values larger than 3 in ");
        printArray(iArr);
        System.out.println("Expected:  Larger:  2");
        System.out.println("Actual:    Larger:  " + ArrayPractice.countLarger(iArr, 3));
        System.out.println("\n***End test ArrayPractice.countLarger(Integer[], int)***\n");

        //Test 4
        System.out.println("***Testing ArrayPractice.countTrue(Boolean[])***\n");
        printArray(bArr);
        System.out.println("Expected:  Count:  4");
        System.out.println("Actual:    Count:  " + ArrayPractice.countTrue(bArr));
        System.out.println("\n***End test ArrayPractice.countTrue(Boolean[])***\n");

        //Test 5
        System.out.println("***Testing ArrayPractice.stringLengths(String[])***\n");
        printArray(sArr);
        System.out.println("Expected:  Lengths:  5 6");
        System.out.print("Actual:    Lengths:  ");
        printArray(ArrayPractice.stringLengths(sArr));
        System.out.println("\n***End test ArrayPractice.stringLengths(String[])***\n");
    }

    /**
     * This method will print the values of the input array, 
     * each on the same line, separated by spaces.
     * 
     * @param obj[] The input array.
     */
    private static void printArray(Object objArr[])
    {
        if (objArr != null)
        {
            for(Object obj : objArr)
            {
                System.out.print(obj + " ");
            }
            System.out.println();
        }
    }
}