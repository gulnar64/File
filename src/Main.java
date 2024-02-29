import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Date;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        String filePath = "output.txt";
        writeWithFileWriter(filePath);
    }

    private static void writeWithFileWriter(String filePath) throws IOException {
        FileWriter output = new FileWriter(filePath, false);
        String data = "Welcome  togfg\ndsdvdfmbgl";
        for (int i = 0; i < data.length(); i++) {
            output.append(data.charAt(i));
        }
        output.close();
    }

    private static void writewithWriteMehtod(String filePath) throws IOException {
        File file = new File(filePath);
        Path path = file.toPath();
        byte[] byteArr = "safnasolvmdflbgmdfl".getBytes();
        Path write = Files.write(path, byteArr);
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