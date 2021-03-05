import java.util.List;

public class Output {

    /**
     * Return printable version of Integer list
     * @param resultSet List<Integer> Prime numbers
     * @return String
     */
    public String print(List<Integer> resultSet) {
        String printable = "";
        if (resultSet.size() == 0) {
            printable = "No primes in range";
        } else {
            printable = resultSet.toString().
                    replaceAll(", ", "\n").
                    replace('[', '\n').
                    replace(']', '\n');
        }
        return printable;
    }
}
