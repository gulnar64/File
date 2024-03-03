import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    //1 - file reader println all line, print only last
    //2 - convert byte[] to string

    public static void main(String[] args) throws Exception {
        String filePath = "C:\\Users\\User\\Desktop\\Projects\\d1\\d2";
        System.out.println( deleteIfExists(filePath));
    }

    private static void deleteFile(String filePath) throws IOException {
        Path path = Path.of(filePath);
        Files.delete(path);
    }

    private static boolean deleteIfExists(String filePath) throws IOException {
        Path path = Path.of(filePath);
        return Files.deleteIfExists(path);
    }

    private static void writeFileOutputWriterObject(String filePath) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(filePath, false);
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
        outputStream.writeObject(new User(1l, "Esma", "email", "surname"));
        fileOutputStream.close();
    }

    private static User readFileInputReaderObject(String filePath) throws Exception {
        FileInputStream fileInputStream = new FileInputStream(filePath);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        return (User) objectInputStream.readObject();
    }

    private static void writeFileOutputWriter(String filePath) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(filePath, true);
        byte[] bytes = "\n\n\n setir 3 asdgjhkjhgdfsfghjlkjhgfhjk,nm.".getBytes();
        fileOutputStream.write(bytes);
        fileOutputStream.close();
    }

    private static byte[] readFileInputStream(String filePath) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(filePath);
        return fileInputStream.readAllBytes();
    }

    private static void writeBufferWriter(String filePath) throws IOException {
        FileWriter fileWriter = new FileWriter(filePath);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("asdfgbnhmj,hjgfgn");
        bufferedWriter.close();
    }

    private static List<String> readBufferReader(String filePath) throws IOException {
        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        return bufferedReader.lines().toList();
    }

    private static String readScanner(String filePath) throws IOException {
        FileReader fileReader = new FileReader(filePath);
        Scanner scanner = new Scanner(fileReader);
        return scanner.nextLine();
    }

    private static void readBufferReader2(String filePath) throws IOException {
        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
    }

    private static void writeWithFileWriter(String filePath) throws IOException {
        FileWriter output = new FileWriter(filePath, StandardCharsets.US_ASCII, false);
        String data = "Welcome  togfg\ndsdvdfmbgl";
        for (int i = 0; i < data.length(); i++) {
            output.append(data.charAt(i));
        }
        System.out.println(output.getEncoding());
        output.close();
    }

    private static String readWithFileReader(String filePath) throws IOException {
        FileReader fileReader = new FileReader(filePath);
        int chr;
        String result = "";
        while ((chr = fileReader.read()) != -1) {
            System.out.println("");
            System.out.print(((char) chr));
        }
        fileReader.close();
        return result;
    }

    private static void writewithWriteMehtod(String filePath) throws IOException {
        File file = new File(filePath);
        Path path = file.toPath();
        byte[] byteArr = "safnasolvmdflbgmdfl".getBytes();
        Path write = Files.write(path, byteArr);
    }

    private static List<String> readwithReadMehtod(String filePath) throws IOException {
        File file = new File(filePath);
        Path path = file.toPath();
        return Files.readAllLines(path);
    }

    private static void fileMethod() throws IOException {
        File file = new File("C:\\Users\\User\\Desktop\\Projects");
        System.out.println("createTempFile: " + File.createTempFile("   ", "  "));
        System.out.println("roots:" + Arrays.stream(File.listRoots()).collect(Collectors.toList()));
        System.out.println("pathSeparatorChar: " + File.pathSeparatorChar);
        System.out.println("pathSeparator: " + File.pathSeparator);
        System.out.println("separator: " + File.separator);
        System.out.println("separatorChar: " + File.separatorChar);
        System.out.println("exists: " + file.exists());
        System.out.println("setExecutable: " + file.setExecutable(true));
        System.out.println("Execute: " + file.canExecute());
        System.out.println("setWritable: " + file.setWritable(true));
        System.out.println("canWrite: " + file.canWrite());
        System.out.println("getAbsolutePath: " + file.getAbsolutePath());
        System.out.println("getName: " + file.getName());
        File file1 = file.getAbsoluteFile();
        System.out.println("file1.getName: " + file1.getName());
        File file2 = file.getParentFile();
        System.out.println("file2.getName: " + file2.getName());
        System.out.println("getPath: " + file.getPath());
        System.out.println("getParent: " + file.getParent());
        System.out.println("getFreeSpace: " + file.getFreeSpace());
        System.out.println("getTotalSpace: " + file.getTotalSpace());
        System.out.println("getUsableSpace: " + file.getUsableSpace());
        System.out.println("isAbsolute: " + file.isAbsolute());
        System.out.println("isDirectory: " + file.isDirectory());
        System.out.println("isFile: " + file.isFile());
        System.out.println("isHidden: " + file.isHidden());
        System.out.println("lastModified: " + new Date(file.lastModified()));
        System.out.println("length: " + file.length());
        System.out.println("list: " + Arrays.toString(file.list()));
        file = new File("C:\\Users\\User\\Desktop\\Projects\\d1\\d2");
        System.out.println("mkdir: " + file.mkdir());
        file = new File("C:\\Users\\User\\Desktop\\Projects\\s1\\s2");
        System.out.println("mkdirs: " + file.mkdirs());
        file1 = new File("C:\\Users\\User\\Desktop\\Projects\\strName33.txt");
        file2 = new File("C:\\Users\\User\\Desktop\\test.txt");
        System.out.println("file1 canWrite: " + file1.canWrite());
        System.out.println("file2 canWrite: " + file2.canWrite());
        System.out.println("renameTo: " + file1.renameTo(file2));
        System.out.println("toURI: " + file.toURI());
        System.out.println("toPath: " + file.toPath());
    }
}