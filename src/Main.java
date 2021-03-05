import java.util.List;

public class Main {

    public static void main(String[] args) {
	// Declaring class instances
        Input inputHandler      = new Input();
        Output outputHandler    = new Output();
        PNG png                 = new PNG();

        if(inputHandler.isValid(args)) {
            Integer[] numValues = inputHandler.prepareArgs(args);
            List<Integer> resultSet = png.generate(numValues[0], numValues[1]);
            System.out.println(outputHandler.print(resultSet));
        }
    }
}
