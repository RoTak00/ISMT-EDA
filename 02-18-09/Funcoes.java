import java.util.Scanner;



public class Funcoes
{
    static void printMessage(String message)
    {
        System.out.println(message);
    }
    static boolean is_prime(long n)
    {
        if(n > 2 && n % 2 == 0) return false;

        for(int i = 3; i * i <= n; i += 2)
        {
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args)
    {

        
        printMessage("Welcome");

        long x = 5;

        if(is_prime(x))
        {
            printMessage(Long.toString(x) + " é primo");
        }
        else
        {
            printMessage(Long.toString(x) + "nao é primo");
        }

        printMessage(Long.toString(x) + (is_prime(x) ? " " : " nao ") + "e primo");


    }
}