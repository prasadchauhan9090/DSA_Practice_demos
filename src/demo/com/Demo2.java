package demo.com;

public class Demo2 {


    public static void main(String args[])
    {
        int a=590;
        int num=0;
        int temp=a; //590
        int higer=0;

        while(temp>0)
        {
            int rem=temp%10; //590 --> 0 // 59 --> 5.9 // --> 0.5
            if(rem>higer)
            {
                higer=rem; //0 //9
            }
            temp=temp/10;
        }

        System.out.println(higer);





    }
}
