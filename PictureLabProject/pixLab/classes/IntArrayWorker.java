public class IntArrayWorker
{
    /** two dimensional matrix */
    private int[][] matrix = null;

    /** set the matrix to the passed one
     * @param theMatrix the one to use
     */
    public void setMatrix(int[][] theMatrix)
    {
        matrix = theMatrix;
    }

    /**
     * Method to return the total 
     * @return the total of the values in the array
     */
    public int getTotal()
    {
        int total = 0;
        for (int row = 0; row < matrix.length; row++)
        {
            for (int col = 0; col < matrix[0].length; col++)
            {
                total = total + matrix[row][col];
            }
        }
        return total;
    }

    public int getTotalNested()
    {
        int total = 0;
        for (int[] rowArray : matrix)
        {
            for (int item : rowArray)
            {
                total = total + item;
            }
        }
        return total;
    }

    public void loadEvensOdds(int[][] matrix)
    {
        for (int row = 0; row < matrix.length; row++)
        {
            for (int col = 0; col < matrix.length; col++){
                if (col < matrix[0].length/2){
                    matrix[row][col] = 2;
                }
                else{

                    matrix[row][col] = 3;
                }
            }   
        }
    }
    
    public void flipVertical(int[][] matrix)
    {
        for (int row = 0; row < matrix.length; row++)
        {
            for (int col = 0; col < matrix.length; col++){
                if (col < matrix[0].length/2){
                    matrix[row][col] = 2;
                }
                else{

                    matrix[row][col] = 3;
                }
            }   
        }
    }

    /**
     * Method to fill with an increasing count
     */
    public void fillCount(){
        {
            int numCols = matrix[0].length;
            int count = 1;
            for (int row = 0; row < matrix.length; row++)
            {
                for (int col = 0; col < numCols; col++)
                {
                    matrix[row][col] = count;
                    count++;
                }
            }
        }
    }

    /**
     * will get count of how many times a item is in the 2d array
     */
    public int getCount()
    {
        int count = 0;
        for (int i = 0; i < matrix.length; i++){
            for (int c = 0; c < matrix[i].length; c++){
                if (matrix[i][c] == count){
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * will get count of how many times a item is in the 2d array
     */
    public int getLargest()
    {
        int count = 0;
        for (int i = 0; i < matrix.length; i++){
            for (int c = 0; c < matrix[i].length; c++){
                if (matrix[i][c] == count){
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * print the values in the array in rows and columns
     */
    public void print()
    {
        for (int row = 0; row < matrix.length; row++)
        {
            for (int col = 0; col < matrix[0].length; col++)
            {
                System.out.print( matrix[row][col] + " " );
            }
            System.out.println();
        }
        System.out.println();
    }

    /** 
     * fill the array with a pattern
     */
    public void fillPattern1(){
        for (int row = 0; row < matrix.length; row++)
        {
            for (int col = 0; col < matrix[0].length; 
            col++)
            {
                if (row < col){
                    matrix[row][col] = 1;
                }

                else if (row == col)
                    matrix[row][col] = 2;
                else
                    matrix[row][col] = 3;
            }
        }
    }
}

