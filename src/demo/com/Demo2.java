package demo.com;

public class Demo2 {


    public static void main(String args[])
    {
        int a=590;
        int num=0;
        int temp=a;
        int higer=0;

        while(temp>0)
        {
            int rem=temp%10;

            if(rem>higer)
            {
                higer=rem;
            }
            temp=temp/10;
        }

        System.out.println(higer);





    }
}
