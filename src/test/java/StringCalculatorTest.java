import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    private final InputForJunit inputForJunit = new InputForJunit();

    @Test
    void input() {

        inputForJunit.systemIn("2 + 3 * 4 / 2");

        Scanner scanner = new Scanner(System.in);

        String value = scanner.nextLine();

        String[] values = value.split(" ");
        for ( String i: values) {
            System.out.println("i = " + i);
        }
    }

}