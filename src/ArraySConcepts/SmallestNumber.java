package ArraySConcepts;

public class SmallestNumber {


    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,6,7,8,9};

        int smallNumber=arr[0];

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<smallNumber)
            {
                smallNumber=arr[i];
            }
        }
        System.out.println("smallestNumber is:  "+smallNumber);



    }
}

