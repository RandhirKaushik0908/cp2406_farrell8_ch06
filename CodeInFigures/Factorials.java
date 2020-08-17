public class Factorials
{
    public static void main (String[] args)
    {
        int i, j, factorial;
        for (i = 1; i <= 10; i++)
        {
            factorial = i;
            for (j = i - 1; j > 0; --j)
                factorial = factorial * j;
            System.out.println("The factorial of " + i + " is " + factorial);
        }
    }
}
