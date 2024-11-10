import antipattern.EncryptedCompressedFileDataSource;
import antipattern.FileDataSource;

class Main {
    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";

        FileDataSource dataSource = new EncryptedCompressedFileDataSource("src/out/test.txt");
        dataSource.writeData(salaryRecords);

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Stored --------------");
        System.out.println(new FileDataSource("src/out/test.txt").readData());
        System.out.println("- Decoded --------------");
        System.out.println(dataSource.readData());
    }
}