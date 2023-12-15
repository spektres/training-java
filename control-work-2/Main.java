import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class UserData {
    String lastName;
    String firstName;
    String middleName;
    Date birthDate;
    long phoneNumber;
    char gender;

    public UserData(String lastName, String firstName, String middleName, Date birthDate, long phoneNumber, char gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        return String.format("%s%s%s %s %d %c", lastName, firstName, middleName, dateFormat.format(birthDate), phoneNumber, gender);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите данные в формате: Фамилия Имя Отчество дд.мм.гггг номер_телефона пол");
        String input = scanner.nextLine();

        try {
            UserData userData = parseUserData(input);
            saveUserDataToFile(userData);
            System.out.println("Данные успешно сохранены в файл.");
        } catch (IllegalArgumentException | ParseException | IOException e) {
            System.err.println("Ошибка: " + e.getMessage());
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }

    private static UserData parseUserData(String input) throws ParseException {
        String[] parts = input.split("\\s+");
        if (parts.length != 6) {
            throw new IllegalArgumentException("Неверное количество данных. Введите данные в правильном формате.");
        }

        String lastName = parts[0];
        String firstName = parts[1];
        String middleName = parts[2];

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date birthDate = dateFormat.parse(parts[3]);

        long phoneNumber = Long.parseLong(parts[4]);

        char gender = parts[5].charAt(0);
        if (gender != 'f' && gender != 'm') {
            throw new IllegalArgumentException("Неверный формат пола. Используйте 'f' или 'm'.");
        }

        return new UserData(lastName, firstName, middleName, birthDate, phoneNumber, gender);
    }

    private static void saveUserDataToFile(UserData userData) throws IOException {
        String fileName = userData.lastName + ".txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(userData.toString() + "\n");
        }
    }
}
