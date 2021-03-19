public class Input {

    private final String INVALID_MSG = "Invalid input: must enter 2 positive integers";
    private final String OVERFLOW_MSG = "Invalid input: input value overflowed int";

    /**
     * Check if values provided by user are valid
     * @param values String[] User input
     * @return boolean
     */
    public boolean isValid(String[] values){

            if (!validArgNum(values) || !validNum(values)) {
                //kdp
                return false;
            }
            return true;
    }

    /**
     * Prepare validated user input
     * @param values String[] Validated user input
     * @return Integer[] Ordered values
     */
    public Integer[] prepareArgs(String[] values) {
        Integer[] numValues = convertToInt(values);
        return checkOrder(numValues);
    }

    /**
     * Converting String[] to Integer[]
     * @param values String[] Validated user input
     * @return Integer[]
     */
    private Integer[] convertToInt(String[] values) {
        Integer[] numValues = new Integer[values.length];
        for (int i = 0; i < values.length; i++) {
            numValues[i] = Integer.parseInt(values[i]);
        }
        return numValues;
    }

    /**
     * Check to make sure lesser value is at index 0
     * @param values Integer[] Bounds
     * @return Integer[]
     */
    private Integer[] checkOrder(Integer[] values) {
        Integer[] orderedValues = new Integer[values.length];
        if (values[0] > values[1]) {
            orderedValues[0] = values[1];
            orderedValues[1] = values[0];
        } else return values;
        return orderedValues;
    }


    /**
     * Validate input is acceptable integer
     * @param values String[] User input
     * @return boolean
     */
    private boolean validNum (String[] values) {
        int temp;
        for (int i = 0; i < 2; i++) {
            try {
                temp = Integer.parseInt(values[i]);
                if (temp < 0) return false;
            } catch (NumberFormatException e) {
                if (values[i].matches("[0-9]+")) {
                    System.out.println(OVERFLOW_MSG);
                } else {
                    System.out.println(INVALID_MSG);
                }
                return false;
            }
        }
        return true;
    }

    /**
     * Verify user has provided exactly 2 arguments
     * @param values String[] User input
     * @return boolean
     */
    private boolean validArgNum(String[] values) {
        if (values.length != 2) {
            System.out.println(INVALID_MSG);
            return false;
        }
        return true;
    }
}
