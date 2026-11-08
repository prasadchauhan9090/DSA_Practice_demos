package ArraySConcepts;

public class Demo {

    public static void main(String arg[]) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int largestNumber = arr[0];
        int secondLargestNumber = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largestNumber) {
                secondLargestNumber = largestNumber;
                largestNumber = arr[i];
            } else if (arr[i] > secondLargestNumber && arr[i] < largestNumber) {
                secondLargestNumber = arr[i];

            }
        }
            System.out.println("largestNumber is:  " + largestNumber);
            System.out.println("secondLargestNumber is:  " + secondLargestNumber);

        }

}
