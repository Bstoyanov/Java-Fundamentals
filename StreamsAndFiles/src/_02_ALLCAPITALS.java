import java.io.*;
import java.util.ArrayList;

public class _02_ALLCAPITALS {
    public static void main(String[] args) {
        ArrayList<String> originaContent = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("resources/text.txt"))) {
            String line = reader.readLine();
            while (line != null){
                originaContent.add(line.toUpperCase());
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Cannot find file");
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
        try (  BufferedWriter writer = new BufferedWriter(new PrintWriter("resources/text.txt"))){
            for (int i = 0; i < originaContent.size(); i++) {
                 writer.write(originaContent.get(i));
                writer.newLine();

            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
