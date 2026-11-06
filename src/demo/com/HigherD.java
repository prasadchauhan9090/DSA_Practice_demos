package demo.com;

public class HigherD {


    public static void main(String args[])
    {
        int number=548;
        int org=number;

        int higer = 0;

        while(org>0)
        {
            int rem =  org%10;
            if(rem>higer)
            {

                higer=rem;
            }
            org=org/10;
        }

        System.out.println(higer);
    }
}
