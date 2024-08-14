/**
 * swap_5_ways
 */
public class swap_5_ways {

    public static void main(String[] args) {
        int a=10 , b=20;
        System.out.println("Before the swapping the number " + a +" ," + b);

        // Logic_1  // use 3rd variable as temp.     
        // int temp = a;
        // a = b;
        // b = temp;

        // Logic_2 // use operators + , -  

        // a= a+b;    10+20=30
        // b= a-b;    30-20=10
        // a= a-b;    30-50=20

        // Logic_2 // use operators + , -  

        // a= a*b;   
        // b= a/b;   
        // a= a/b;   


        // Logic_4 // use bitwise operator Xor 00=0 10=1 01=1 11=0

       // a = a^b; // this will convert decimal to binary 
       // b = a^b;
       // a = a^b;
 
        System.out.println("After the swapping the number " + a +" ," + b);
    }
}



