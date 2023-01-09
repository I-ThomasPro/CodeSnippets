public class Main
{
    public static void main(String[] args)
    {
        System.out.println(Utils.add(4,1));
        Utils.print_one_through_ten();

        try
        {
            Utils.divide_by_zero();
        }
        catch (ArithmeticException ae)
        {
            System.err.println("Can't divide by zero.");
        }
    }
}