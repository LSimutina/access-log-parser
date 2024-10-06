import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

//import static java.lang.System.out;

public class Main {
    public static void main(String[] args) throws IOException {

//        Обработка исключений. Задание 1
        System.out.println("Введите путь до файла и нажмите <Enter>: ");
        String path = new Scanner(System.in).nextLine();
        //путь C:\Users\LSimutina\Desktop\For_Work\Avto_QA\AccessLogParser\access.log
        File file = new File(path);
        boolean fileExists = file.exists();
        boolean isDirectory = file.isDirectory();
        if (!fileExists) {
            System.out.println("Путь указан  не верно, или файл не существует");
        }
        if ((fileExists) && (isDirectory)) {
            System.out.println("Это директория");
        }
        if ((fileExists) && (!isDirectory)) {
            BufferedReader reader = null;
            try {
                FileReader fileReader = new FileReader(path);
                reader = new BufferedReader(fileReader);
            } catch (FileNotFoundException f) {
                System.out.println("FileNotFound");
            }

            String line;
            int count = 0;
            int length = 0;
            int lengthMax = 0;
            int lengthMin = 0;

            if (reader.readLine() != null) lengthMin = reader.readLine().length();

            while ((line = reader.readLine()) != null) {
                length = line.length();
                if (length > 1024) {
                    throw new RuntimeException("Строка должна быть не больше 1024 символов");
                }
                try {
                    length = line.length();
                    if (length > lengthMax) lengthMax = length;
                    if (length < lengthMin) lengthMin = length;
                    count++;
                } catch (RuntimeException r) {
                    System.out.println("Строка должна быть не больше 1024 символов");
                }
            }
            System.out.println("Общее количество строк в файле: " + count);
            System.out.println("Самая длинная строка в файле: " + lengthMax);
            System.out.println("Самая короткая строка в файле: " + lengthMin);
        }
    }
}