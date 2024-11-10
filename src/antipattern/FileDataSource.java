package antipattern;
import java.io.*;

public class FileDataSource {
    protected String name;

    public FileDataSource(String name) {
        this.name = name;
    }

    public void writeData(String data) {
        try (OutputStream fos = new FileOutputStream(name)) {
            fos.write(data.getBytes(), 0, data.length());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public String readData() {
        char[] buffer = null;
        File file = new File(name);
        try (FileReader reader = new FileReader(file)) {
            buffer = new char[(int) file.length()];
            reader.read(buffer);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return new String(buffer);
    }
}