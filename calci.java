import java.util.Scanner;
class calci extends extra
{
    public static void main(String[] args)
     {
        Scanner in = new Scanner(System.in);

        /*System.out.println("--::BASIC ARITHMETIC OPARATIONS::--");
        System.out.println("Enter first number:");
        int p = in.nextInt();
        System.out.println("Enter second number");
        int q = in.nextInt();*/
        int p=20;
        int q=10;

        System.out.println("\nSUM         " + p + " + " + q + " = " + Sum(p, q));
        System.out.println("DIFFERENCE  " + p + " - " + q + " = " + Sub(p, q));
        System.out.println("PRODUCT     " + p + " * " + q + " = " + Mul(p, q));
        System.out.println("QUOTIENT    " + p + " / " + q + " = " + Div(p, q));
        System.out.println("Square of "+q+" is ="+mySquare(p));
        System.out.println("Cube of "+q+" is ="+myCube(q));
     }
    // To make sum of two numbers
    public static int Sum(int x, int y) {
        return x + y;
    }

    // To make subtraction of two numbers
    public static int Sub(int x, int y) {
        return x - y;
    }

    // To make multilication of two numbers
    public static int Mul(int x, int y) {
        return x * y;
    }

    // To make division of two numbers
    public static float Div(int x, int y) {
        return x / y;
    }

     
}