import java.util.Scanner;

public class need {
    public static void main(String[] args) {
        //Q:store a number
        /*
        we can store a number easily
        now if we want to store a colletion of the same data
        type then we use a array
        array is a non perimitivve;

         */
    /*
    Syntax
    data type[] name = new datatype[size]
        */
        Scanner sc = new Scanner(System.in);
//        int a= sc.nextInt();
//        int check = 0;
//        while(a>0){
//           check++;
//           a=a/10;
//        }
//        System.out.println(check);
String a =sc.next();
        String b="";
for(int i= 0;i<a.length()-1;i++){

    b= String.valueOf(a.charAt(a.length()-i-1));
}
        System.out.println(a);
        System.out.println(b);



    }
}