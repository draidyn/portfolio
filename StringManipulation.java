public class StringManipulation {
    /**
     * This is meant to cut out all the unnecessary spaces in a line
     */
    public static void main (String[] args) {
        String line = "this    is  the line"; //this is the char[] representation of a word
        char[]toProcess = line.toCharArray(); //pass to the method that cuts the char array into the desired line
        cut(toProcess); //pass the char array to the method 'cut' for processing
    }

    /**
     * method that runs the string manipulation aspect of the code
     * @param line - the string representation of the word that needs to be parsed
     * @return - cleaned up string
     */
    public static char[] cut (char[] line) {
        int writer = 0; //the writer pointer
        for (int reader = 0; reader < line.length; reader++) {
            if (line.charAt[reader] == ' ') {
                reader++;
                writer = reader;
                while (line[reader] == ' ') {
                    reader++;
                } 
                
            }
        }
    }
}