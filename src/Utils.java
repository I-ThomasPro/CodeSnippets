import java.util.ArrayList;
import java.util.List;

public class Utils
{
    public static int add(int x, int y)
    {
        return x+y;
    }

    public static void print_one_through_ten()
    {
        List<Integer> numbers = new ArrayList<>();
        for(int i=1; i<=10; i++)
            numbers.add(i);
        for(int i : numbers)
            System.out.println(i);
    }

    public static void divide_by_zero()
    {
        double x = 5 / 0;
    }
}
