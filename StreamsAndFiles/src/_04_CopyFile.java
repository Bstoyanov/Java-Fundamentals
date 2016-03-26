import java.io.*;

public class _04_CopyFile {
    public static void main(String[] args) {
        readBufferedBytes();



    }
    private static void readBufferedBytes() {
        try (
                BufferedInputStream bfis =
                        new BufferedInputStream(new FileInputStream("resources/ascii.jpg"));
                BufferedOutputStream bfos =
                        new BufferedOutputStream(new FileOutputStream("resources/ascii2.jpg"))
        ){
            int i;
            while ((i = bfis.read()) != -1) {
                bfos.write(i);
            }
        }
        catch (IOException ioe) {
            System.out.println(ioe.toString());
        }
    }


}
