package coding;

public class Swap {
    public static void main(String[] args) {

        //swap with third variable

//        int a = 10;
//        int b = 20;
//        int temp=  a;
//        a=b;
//        b=temp;
//        System.out.println(a+"  "+b);

        //swap without third variable

//        int a = 10;
//        int b = 20;
//        int temp=  a;
//        a=a+b; //30
//        b=a-b;
//        a=a-b;
//        System.out.println(a+"  "+b);


        //swap without third variable using multiplication and division
        int a = 10;
        int b = 20;
        int temp=  a;
        a=a*b; //30
        b=a/b;
        a=a/b;
        System.out.println(a+"  "+b);

    }
}
