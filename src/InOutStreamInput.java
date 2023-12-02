import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class InOutStreamInput {
    public static void main(String[] args) {
        Path inputPath = Paths.get("C:\\Users\\chris\\Documents\\txt\\ejemplo.txt");
        Path outputPath = Paths.get("C:\\Users\\chris\\Documents\\txt\\ejemplo2.txt");
        try {
            InputStream inputStream = Files.newInputStream(inputPath, StandardOpenOption.READ);

            Files.newOutputStream(outputPath, StandardOpenOption.CREATE);

            OutputStream outputStream = Files.newOutputStream(outputPath, StandardOpenOption.WRITE);

            int i;

            byte[] data = new byte[1024];
            while ((i = inputStream.read(data)) != -1) {
                outputStream.write(data);

            }
            inputStream.close();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
