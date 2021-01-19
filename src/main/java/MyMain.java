public class MyMain {

    // Returns the mean of the 2D array mat
    public static double mean(double[][] mat) { 
        // YOUR CODE HERE
        int cells = 0;
        int total = 0;
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[0].length; j++){
                total += mat[i][j];
                cells += 1;
            }
        }
        return ((double) total / (double) cells);
    }

    // Returns the median of the 2D array mat
    public static double median(double[][] mat) { 
        int j = mat.length;
        int i = mat[0].length;
        if (j % 2 == 0){
            return (((mat [j / 2] [0]) + (mat [(j - 1) / 2] [i - 1])) / 2 );
        }
        else{
            return (((mat  [j / 2] [i / 2]) + (mat [j / 2] [(i - 1) / 2])) / 2);
        }
        
    }
    

    // Returns the mode of the 2D array mat
    public static double mode(double[][] mat) { 
        int most1 = 0;
        int most2 = 0;
        double mostnum = 0;
        double last = -1;
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[0].length; j++){
                if (mat[i][j] == last){
                    most1 += 1;
                    mostnum = last;
                }
                else{
                    if (most1 > most2){
                        most2 = most1;
                        most1 = 0;
                        mostnum = last;
                    }
                    else{
                        most1 = 0;
                        
                    }
                }
                last = mat [i] [j];
            }
        }
        return mostnum;


    }


    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}
