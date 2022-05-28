public class Array2DExercises 
{
    // returns the maximum value in the 2d parameter array 
    public static int max(int[][] a) 
    {
        int max = -100000;
        for (int i=0; i<a.length; i++)
        {
            for (int j=0; j<a[i].length; j++)
            {
                if (a[i][j] > max)
                {
                    max = a[i][j];
                }
            }
        }
        return max;
        
    }

    // returns the sum of the elements in row r of a. 
    public static int rowSum(int[][] a, int r)
    {
        int sum = 0;
        for (int i=0; i<a[r].length; i++)
        {
            sum = sum+a[r][i];
        }
        return sum;
    }

    // returns the sum of the elements in column c of a (careful with rows of different lengths!).
    public static int columnSum(int[][] a, int c)
    {
        int sum = 0;
        for (int i=0; i<a.length; i++)
        {
            if (c<a[i].length)
            {
                sum = sum+a[i][c];
            }
        }
        return sum;
    }

    // calculates the row sum for every row and returns each of the values in an array. 
    // index i of the return array contains the sum of elements in row i.
    public static int[] allRowSums(int[][] a)
    {
        int sums[] = new int [a.length];
        for (int i=0; i<a.length; i++)
        {
            sums [i] = 0;
            for (int j=0; j<a[i].length; j++)
            {
                sums [i] = sums [i] + a[i][j];
            }
        }
        return sums;
    }
        
    // checks if the array is row-magic (this means that every row has the same row sum).
    public static boolean isRowMagic(int[][] a)
    {
        boolean magic = true;
        int sums[] = new int [a.length];
        for (int i=0; i<a.length; i++)
        {
            sums [i] = 0;
            for (int j=0; j<a[i].length; j++)
            {
                sums [i] = sums [i] + a[i][j];
            }
        }
        for (int x=1; x<a.length; x++)
        {
            if (sums[x-1] != sums[x])
            {
                magic = false;
            }
        }
        return magic;
    }

    // checks if the array is column-magic (this means that every column has the same column sum).
    public static boolean isColumnMagic(int[][] a)
    {
        boolean magic = true;
        int sums[] = new int [a[0].length];
        
        for (int c=0; c<a[0].length; c++)
        {
            sums[c] = 0;
            for (int i=0; i<a.length; i++)
            {
                if (c<a[i].length)
                {
                    sums[c] = sums[c] +a[i][c];
                }
            }
        }
        
        
        for (int x=1; x<a.length; x++)
        {
            if (sums[x-1] != sums[x])
            {
                magic = false;
            }
        }
        return magic;
    }
    
    // checks if the array is square (i.e. every row has the same length as a itself).
    public static boolean isSquare(int[][] a)
    {
        boolean square = true;
        for (int i=1; i<a.length; i++)
        {
            if (a[i-1].length != a[i].length)
            {
                square = false;
            }
        }
        return square;
    }

    // checks if the array is a magic square. This means that it must be square, 
    // and that all row sums, all column sums, and the two diagonal-sums must all be equal.
    public static boolean isMagic(int[][] a)
    {
        boolean square = true;
        for (int i=1; i<a.length; i++)
        {
            if (a[i-1].length != a[i].length)
            {
                square = false;
            }
        }
        
        boolean row_magic = true;
        int row_sums[] = new int [a.length];
        for (int i=0; i<a.length; i++)
        {
            row_sums [i] = 0;
            for (int j=0; j<a[i].length; j++)
            {
                row_sums [i] = row_sums [i] + a[i][j];
            }
        }
        for (int x=1; x<a.length; x++)
        {
            if (row_sums[x-1] != row_sums[x])
            {
                row_magic = false;
            }
        }
        
        boolean magic = true;
        int sums[] = new int [a[0].length];
        
        for (int c=0; c<a[0].length; c++)
        {
            sums[c] = 0;
            for (int i=0; i<a.length; i++)
            {
                if (c<a[i].length)
                {
                    sums[c] = sums[c] +a[i][c];
                }
            }
        }
        
        
        for (int x=1; x<a.length; x++)
        {
            if (sums[x-1] != sums[x])
            {
                magic = false;
            }
        }
        
        boolean magicSquare = false;
        if ((square==true) && (row_magic==true) && (magic==true))
        {
            magicSquare = true;
        }
        
        return magicSquare;
        
    }


 
}