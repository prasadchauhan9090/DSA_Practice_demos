package ArraySConcepts;

public class Demo {

    public static void main(String arg[])
    {
        int arr[]={1,2,3,4,5,6,7,8,9};

        int sum=0;
        int larg=arr[0];

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>larg)
            {
                larg=arr[i];
            }
        }

        System.out.println("The largest number in the array is: "+larg);

    }
}
