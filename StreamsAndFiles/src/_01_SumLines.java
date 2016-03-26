import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class _01_SumLines {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("resources/lines.txt"))) {
            String line = reader.readLine();
            while (line != null) {
                int sum = 0;
                for (int i = 0; i < line.length(); i++) {
                    sum += line.charAt(i);

                }
                System.out.println(sum);
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
