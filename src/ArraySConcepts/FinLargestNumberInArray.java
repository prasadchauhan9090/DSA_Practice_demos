package ArraySConcepts;

public class FinLargestNumberInArray {

    public static void main(String args[])
    {


        int arr[]={2,345,67,75,43,2};
        int largestNumber=arr[0];
        int arrayLenth=arr.length;

        for(int i=0;i<arrayLenth;i++)
        {

            if(arr[i]>largestNumber)
            {
                largestNumber=arr[i];
            }
        }

        System.out.println("largestNumber is:  "+largestNumber);



    }



}

