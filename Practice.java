public class Practice {
    public static void main(String[] args) {
        //generate the matrix with values
        int[][] matrix = new int[5][2];
        matrix[0][0] = 5;
        matrix[0][1] = 8;
        matrix[1][0] = 9;
        matrix[1][1] = 7;
        matrix[2][0] = 7;
        matrix[2][1] = 4;
        matrix[3][0] = 8;
        matrix[3][1] = 11;
        matrix[4][0] = 11;
        matrix[4][1] = 4;
        

        printMatrix(matrix);
        
    }

    /**
     * Prints the matrix 
     * @param matrix - the matrix being sent
     */
    public static void printMatrix (int[][] matrix) {
        for (int c1 = 0; c1 < matrix.length; c1++) {
            System.out.println("[ " + matrix[c1][0] + " " + matrix[c1][1] + " ]");
        }
    }
    /**
     * Parses the matrix looking for duplcate endings in one column
     * @param matrix
     * @return
     */
    public static int[][] formulate(int[][] matrix) {
        int[][] ultered; //the matrix to be returned
        if (matrix.length < 1) return null; //if matrix is empty
        else if (matrix.length == 1) return matrix; //matrix only has one value
        else { //start parsing through the matrix, beginning with the second one, and looking back to the first element
            //to ensure not going past the bounds of the array
            List<int[]> modMatrix = new ArrayList<int[]>();

            for (int counter = 1; counter < matrix.length; counter++) { //counter at one to avoid going out of bounds
                int[] reader1 = matrix[counter]; //elements of the array being looked at
                int[] reader2 = matrix[counter - 1];
                if (reader1[0] == reader2[1]) {

                }
            }
        }
        //loop runs through the columns of the matrix, beginning at 0, to end
        
        return ultered;
    }
    
}