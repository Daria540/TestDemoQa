package testdata;


import com.github.javafaker.Faker;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class TestData {

    public static Faker faker = new Faker(new Locale("en"));
    public static String name = faker.name().firstName();
    public static String lastName = faker.name().lastName();
    public static String email = faker.internet().emailAddress();
    public static String gender = faker.options().option("Male", "Female", "Other");
    public static String mobile = faker.phoneNumber().subscriberNumber(10);
    static Date fakerDate = faker.date().birthday();
    static SimpleDateFormat day = new SimpleDateFormat("d", Locale.ENGLISH);
    static SimpleDateFormat month = new SimpleDateFormat("MMMM", Locale.ENGLISH);
    static SimpleDateFormat year = new SimpleDateFormat("y", Locale.ENGLISH);
    public static String dayOfBirth = day.format(fakerDate);
    public static String monthOfBirth = month.format(fakerDate);
    public static String yearOfBirth = year.format(fakerDate);
    public static String setProfession = faker.options().option("Physics", "Hindi", "English", "Maths", "Chemistry", "Economics");
    public static String hobby = faker.options().option("Sports", "Reading", "Music");
    public static String address = faker.address().fullAddress();
    public static String state = faker.options().option("NCR", "Uttar Pradesh", "Haryana", "Rajasthan");
    public static String city = randomCity();

    public static String randomCity() {
        return switch (state) {
            case ("NCR") -> new Faker().options().option("Delhi", "Gurgaon", "Noida");
            case ("Uttar Pradesh") -> new Faker().options().option("Agra", "Lucknow", "Merrut");
            case ("Haryana") -> new Faker().options().option("Karnal", "Panipat");
            case ("Rajasthan") -> new Faker().options().option("Jaipur", "Jaiselmer");
            default -> null;
        };
    }
}