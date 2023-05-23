import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int res=sum(a,b);
        int res2=sub(a,b);
       // int res3=mul(a,b);
       // int res4 =div(a,b);
        System.out.println("result of sum :" +res);
        System.out.println("result of sub :" +res2);
       // System.out.println("result of mul :" +res3);
       // System.out.println("result of dic :" +res4);*/
    }
    public static int sum(int a,int b){
       int c= a+b;
       return c;
    }
    public static int sub(int a,int b){
        int c=b-a;
        return c;
    }
/*
    public static int mul(int a,int b){
        int c=a*b;
        return c;
    }

    public static int div(int a,int b){
        int c=a/b;
        return c;
    }*/
}