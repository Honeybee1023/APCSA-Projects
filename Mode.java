
import java.util.Arrays;

public class Mode
{
    public static int[] generate ()
    {
        int[] array = new int[100]; 
        for (int i=0; i<100; i++)
        {
            array[i] = (int) (Math.random()*100);
        }
        return array;
    }
    
    public static void mode (int[] array)
    {
        int num = array [0];
        int count = 0;
        int max_num1 = 0;
        int max_num2 = 0;
        int max_num3 = 0;
        int max_num4 = 0;
        int max_num5 = 0;
        int max_count = 0;
        for (int i=0; i<100; i++)
        {
            if (array [i] == num)
            {
                count = count + 1;
                if (count > max_count)
                {
                    max_count = count;
                    max_num1 = num;
                    max_num2 = 0;
                    max_num3 = 0;
                    max_num4 = 0;
                    max_num5 = 0;
                }
                else if (count == max_count)
                {
                    max_count = count;
                    if (max_num2 == 0)
                    {
                        max_num2=num;
                    }
                    else if (max_num3 == 0)
                    {
                        max_num3=num;
                    }
                    else if (max_num4 == 0)
                    {
                        max_num4=num;
                    }
                    else
                    {
                        max_num5=num;
                    }
                }
            }
            else
            {
                num = array [i];
                count = 1;
            }
        }
        
        System.out.println("");
        System.out.print("Mode: ");
        if (max_num1 != 0)
        {
            System.out.print(max_num1 + " ");
        }
        if (max_num2 != 0)
        {
            System.out.print(max_num2 + " ");
        }
        if (max_num3 != 0)
        {
            System.out.print(max_num3 + " ");
        }
        if (max_num4 != 0)
        {
            System.out.print(max_num4 + " ");
        }
        if (max_num5 != 0)
        {
            System.out.print(max_num5 + " ");
        }
        
        System.out.println("");
        System.out.println("Frequency: " + max_count);
    }
    
    public static void main (String[] args)
    {
        int[] array = new int[100];
        array = generate();
        System.out.println("Original Array: ");
        for (int i=0; i<100; i++)
        {
            System.out.print(array[i] + " ");
        }
        
        Arrays.sort(array);
        System.out.println("");
        System.out.println("Sorted Array: ");
        for (int j=0; j<100; j++)
        {
            System.out.print(array[j] + " ");
        }
        
        mode(array);
    }
}
