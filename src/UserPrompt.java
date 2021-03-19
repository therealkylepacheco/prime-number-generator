import java.util.Scanner;

public class UserPrompt {

    public String[] prompt() {
        String[] input = {};
        input[0] = promptUser("Enter first bound:");
        input[1] = promptUser("Enter second bound:");
        return input;
    }

    private String promptUser(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(msg);
        return scanner.nextLine();
    }
}
