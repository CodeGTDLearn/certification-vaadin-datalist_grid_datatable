package com.certification.datalistgridtable.practice_project.utils;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataFaker {
  public static class Fake {

    private static final Random random = new Random();

    private static final String[] ADDRESS_OPTIONS = {
         "123 Main St",
         "456 Elm Ave",
         "789 Oak Blvd",
         "987 Pine Rd",
         "543 Maple Ln",
         "876 Cedar Dr",
         "210 Birch Ct",
         "654 Redwood St",
         "765 Juniper Rd",
         "432 Spruce Blvd",
         "876 Acacia Ln",
         "109 Chestnut Dr",
         "234 Laurel Ave",
         "567 Poplar Rd"
    };

    private static final String[] ANIMAL_OPTIONS = {
         "Dog",
         "Cat",
         "Elephant",
         "Lion",
         "Tiger",
         "Giraffe",
         "Monkey",
         "Kangaroo",
         "Bear",
         "Penguin",
         "Dolphin",
         "Panda",
         "Gorilla",
         "Zebra",
         "Koala"
    };

    private static final String[] HOLLYWOOD_ACTOR_ACTRESS_OPTIONS = {
         "Tom Hanks",
         "Meryl Streep",
         "Leonardo DiCaprio",
         "Scarlett Johansson",
         "Robert Downey Jr.",
         "Jennifer Lawrence",
         "Brad Pitt",
         "Natalie Portman",
         "Johnny Depp",
         "Angelina Jolie",
         "Denzel Washington",
         "Charlize Theron",
         "Will Smith",
         "Cate Blanchett",
         "Chris Hemsworth"
    };

    private static final String[] BARCODE_OPTIONS = {
         "123456789012",
         "987654321098",
         "543210987651",
         "192837465012",
         "567890123456",
         "654321098765",
         "987612345890",
         "890123456789",
         "098765432109",
         "234567890123",
         "456789012345",
         "012345678901",
         "109876543210",
         "345678901234",
         "890123456790"
    };

    private static final String[] BEER_OPTIONS = {
         "IPA",
         "Stout",
         "Pilsner",
         "Porter",
         "Wheat Beer",
         "Lager",
         "Amber Ale",
         "Sour Beer",
         "Pale Ale",
         "Belgian Ale",
         "Brown Ale",
         "Cream Ale",
         "Red Ale",
         "Scotch Ale",
         "Saison"
    };

    private static final String[] BOOK_OPTIONS = {
         "To Kill a Mockingbird",
         "1984",
         "The Great Gatsby",
         "Pride and Prejudice",
         "The Catcher in the Rye",
         "The Lord of the " +
         "Rings",
         "The Hobbit",
         "Moby-Dick",
         "Jane Eyre",
         "Animal Farm",
         "Brave New World",
         "The Odyssey",
         "Fahrenheit 451",
         "The Alchemist"
    };

    private static final String[] CAT_BREED_OPTIONS = {
         "Siamese",
         "Maine Coon",
         "Persian",
         "Ragdoll",
         "Bengal",
         "Sphynx",
         "Abyssinian",
         "British Shorthair",
         "Scottish Fold",
         "Siberian",
         "Birman",
         "Norwegian Forest",
         "Oriental",
         "Devon Rex",
         "Manx"};

    private static final String[] DOG_BREED_OPTIONS = {
         "Labrador Retriever",
         "German Shepherd",
         "Golden Retriever",
         "French Bulldog",
         "Bulldog",
         "Poodle",
         "Beagle",
         "Rottweiler",
         "Yorkshire Terrier",
         "Boxer",
         "Dachshund",
         "Siberian Husky",
         "Shih Tzu",
         "Great Dane",
         "Pomeranian"
    };


    private static final String[] CURRENCY_OPTIONS = {
         "USD",
         "EUR",
         "JPY",
         "GBP",
         "AUD",
         "CAD",
         "CHF",
         "CNY",
         "SEK",
         "NZD",
         "KRW",
         "SGD",
         "NOK",
         "MXN",
         "INR"
    };

    private static final String[] DISEASE_OPTIONS = {
         "COVID-19",
         "Influenza",
         "Diabetes",
         "Cancer",
         "Hypertension",
         "Alzheimer's",
         "Parkinson's",
         "Asthma",
         "Arthritis",
         "Obesity",
         "Malaria",
         "HIV/AIDS",
         "Tuberculosis",
         "Epilepsy",
         "Heart Disease"
    };

    private static final String[] SPORT_OPTIONS = {
         "Soccer",
         "Basketball",
         "Tennis",
         "Golf",
         "Cricket",
         "Baseball",
         "Swimming",
         "Running",
         "Cycling",
         "Boxing",
         "Volleyball",
         "Ice Hockey",
         "Rugby",
         "Skiing",
         "Martial Arts"
    };

    private static final String[] GENDER_OPTIONS = {
         "Male",
         "Female",
         "Other"
    };

    private static final String[] HOBBY_OPTIONS = {
         "Reading",
         "Cooking",
         "Painting",
         "Gardening",
         "Photography",
         "Playing an Instrument",
         "Writing",
         "Hiking",
         "Dancing",
         "Yoga",
         "Fishing",
         "Gaming",
         "Traveling",
         "Knitting",
         "Collecting"
    };

    private static final String[] MUSIC_OPTIONS = {
         "Pop",
         "Rock",
         "Hip-Hop",
         "Electronic",
         "Country",
         "Jazz",
         "Classical",
         "R&B",
         "Reggae",
         "Metal",
         "Folk",
         "Blues",
         "Indie",
         "Latin",
         "Alternative"
    };

    private static final String[] FIRST_NAME_OPTIONS = {
         "James",
         "Mary",
         "John",
         "Patricia",
         "Robert",
         "Jennifer",
         "Michael",
         "Linda",
         "William",
         "Elizabeth",
         "David",
         "Barbara",
         "Richard",
         "Susan",
         "Joseph"
    };

    private static final String[] LAST_NAME_OPTIONS = {
         "Smith",
         "Johnson",
         "Williams",
         "Jones",
         "Brown",
         "Davis",
         "Miller",
         "Wilson",
         "Moore",
         "Taylor",
         "Anderson",
         "Jackson",
         "White",
         "Harris",
         "Martin"
    };

    private static final String[] NATION_OPTIONS = {
         "United States",
         "China",
         "India",
         "Brazil",
         "Pakistan",
         "Nigeria",
         "Bangladesh",
         "Russia",
         "Mexico",
         "Japan",
         "Ethiopia",
         "Philippines",
         "Egypt",
         "Vietnam",
         "DR Congo"
    };

    private static final String[] NUMBER_OPTIONS = {
         "One",
         "Two",
         "Three",
         "Four",
         "Five",
         "Six",
         "Seven",
         "Eight",
         "Nine",
         "Ten",
         "Eleven",
         "Twelve",
         "Thirteen",
         "Fourteen",
         "Fifteen"
    };

    private static final String[] PHONE_NUMBER_OPTIONS = {
         "+01 123-456-7890",
         "+44 020 1234 5678",
         "+81 003 1234 5678",
         "+86 010 1234 5678",
         "+33 123 0045 6789",
         "+55 110 1234 5678",
         "+49 030 1234 5678",
         "+07 495 1230 4567",
         "+39 064 1234 5678",
         "+01 212 0555 1234",
         "+44 205 7123 4567",
         "+33 145 2345 6789",
         "+49 304 1234 5678",
         "+61 256 8765 4321",
         "+57 495 123 4567",
         "+55 11 3456 7890",
         "+39 06 1234 5678"
    };

    private static final String[] PROGRAMMING_LANGUAGE_OPTIONS = {
         "Java",
         "Python",
         "C++",
         "JavaScript",
         "C#",
         "Ruby",
         "Swift",
         "Go",
         "PHP",
         "Kotlin",
         "Rust",
         "Scala",
         "TypeScript",
         "Haskell",
         "Perl"
    };

    private static final String[] SUPERHERO_OPTIONS = {
         "Superman",
         "Batman",
         "Spider-Man",
         "Wonder Woman",
         "Iron Man",
         "Captain America",
         "Thor",
         "Black Widow",
         "Hulk",
         "Aquaman",
         "Black Panther",
         "Flash",
         "Green Lantern",
         "Wolverine",
         "Doctor Strange"
    };

    private static final String[] TEAM_OPTIONS = {
         "Crimson Crew",
         "Solar Sentinels",
         "Lunar Legends",
         "Aqua Avengers",
         "Thunder Tribe",
         "Emerald Enforcers",
         "Celestial Challengers",
         "Mystic Mavericks",
         "Sapphire Swarm",
         "Rising Phoenix",
         "Golden Guardians",
         "Galactic Gladiators",
         "Eternal Emissaries",
         "Velvet Vortex",
         "Nova Knights"
    };

    private static final String[] WEATHER_OPTIONS = {
         "Sunny",
         "Cloudy",
         "Rainy",
         "Windy",
         "Snowy",
         "Foggy",
         "Stormy",
         "Hazy",
         "Clear",
         "Overcast",
         "Partly Cloudy",
         "Misty",
         "Breezy",
         "Drizzling",
         "Hot"
    };

    private static final String[] UNIVERSITY_OPTIONS = {
         "Harvard University",
         "Stanford University",
         "Massachusetts Institute of Technology",
         "California Institute of Technology",
         "University of Oxford",
         "University of Cambridge",
         "ETH Zurich",
         "University of Chicago",
         "Princeton University",
         "Imperial College London",
         "Yale University",
         "Columbia University",
         "University of Pennsylvania",
         "University of California, Berkeley",
         "University of Toronto"
    };

    private static final String[] BUSINESS_OPTIONS = {
         "Apple Inc.",
         "Microsoft Corporation",
         "Amazon.com Inc.",
         "Alphabet Inc. (Google)",
         "Facebook Inc.",
         "Tesla Inc.",
         "Visa Inc.",
         "Samsung Electronics Co. Ltd.",
         "Walmart Inc.",
         "JP Morgan Chase & Co.",
         "Berkshire Hathaway Inc.",
         "Johnson & Johnson",
         "Procter & Gamble Co."
    };

    private static final String[] POSTAL_CODE_OPTIONS = {
         "A1A 1A1",
         "B2B 2B2",
         "C3C 3C3",
         "D4D 4D4",
         "E5E 5E5",
         "F6F 6F6",
         "G7G 7G7",
         "H8H 8H8",
         "I9I 9I9",
         "J0J 0J0",
         "K1K 1K1",
         "L2L 2L2",
         "M3M 3M3",
         "N4N 4N4",
         "O5O 5O5"
    };

    private static final String[] JOB_OPTIONS = {
         "Software Engineer",
         "Doctor",
         "Teacher",
         "Marketing Manager",
         "Sales Representative",
         "Graphic Designer",
         "Data Analyst",
         "Nurse",
         "Accountant",
         "Chef",
         "Mechanical Engineer",
         "Writer",
         "Lawyer",
         "Electrician",
         "Architect"
    };

    private static final String[] EN_ARTIST_NAMES = {
         "Donatello",
         "Botticelli",
         "Michelangelo",
         "Raphael",
         "Titian",
         "Durer",
         "Caravaggio",
         "Rubens",
         "Bernini",
         "Rembrandt",
         "Pissarro",
         "Manet",
         "Degas",
         "Cezanne"
    };


    private static final String[] ASIN_LIST = {
         "B000BJ20TO",
         "B000BJ0Z50",
         "B000BUYO60",
         "B000HGWGHW",
         "B000II6WOW",
         "B000AMNV8G",
         "B000HDT0BU",
         "B000HGNY7I",
         "B000I6VQX6",
         "B0002I6HKW",
         "B00067POW6",
         "B0000VFDCY",
         "B0000W4I2O",
         "B00026IESC",
         "B000GWIHF2"
    };


    private static final String[] COLOR_NAME_LIST = {
         "red",
         "green",
         "blue",
         "yellow",
         "purple",
         "mint green",
         "teal",
         "white",
         "black",
         "orange",
         "pink",
         "grey",
         "maroon",
         "violet",
         "turquoise"
    };

    private static final String[] CREDIT_CARD_NUMBERS = {
         "4111 3330 4963 1019",
         "5500 0000 0000 0004",
         "6011 1111 1111 1117",
         "3782 8224 6310 0005",
         "3714 4963 5398 5431",
         "3625 9600 0055 4963",
         "5610 5910 8101 8250",
         "5019 7170 1010 3742",
         "6331 1019 9999 0016",
         "3566 0020 2036 0505",
         "6333 8101 5610 0001",
         "3530 1113 3330 3714",
         "6304 5431 7170 8224",
         "3056 9309 0259 0594",
         "3852 5610 0232 8937"
    };

    private static final String[] DOG_NAMES = {
         "Buddy",
         "Max",
         "Charlie",
         "Jack",
         "Cooper",
         "Rocky",
         "Bear",
         "Duke",
         "Toby",
         "Tucker",
         "Finn",
         "Bentley",
         "Milo",
         "Leo",
         "Beau"
    };

    private static final String[] CAT_NAMES = {
         "Luna",
         "Bella",
         "Lucy",
         "Chloe",
         "Daisy",
         "Molly",
         "Lily",
         "Sophie",
         "Charlie",
         "Stella",
         "Oliver",
         "Simba",
         "Jack",
         "Milo",
         "Leo"
    };

    private static final String[] SIN_NUMBERS = {
         "123 456 789",
         "234 567 890",
         "345 678 901",
         "456 789 012",
         "567 890 123",
         "678 901 234",
         "789 012 345",
         "890 123 456",
         "901 234 567",
         "012 345 678",
         "123 567 901",
         "234 678 012",
         "345 789 123",
         "456 890 234",
         "567 901 345"
    };

    public static double RandomDouble(double minValue, double maxValue) {

      if (minValue >= maxValue) {
        throw new IllegalArgumentException("minValue must be less than maxValue");
      }

      Random random = new Random();
      return minValue + (random.nextDouble() * (maxValue - minValue));
    }

    public static double RandomDouble() {

      Random random = new Random();
      return random.nextDouble();
    }

    public static long RandomLong(long minValue, long maxValue) {

      if (minValue >= maxValue) {
        throw new IllegalArgumentException("minValue must be less than maxValue");
      }

      Random random = new Random();
      return minValue + (long) (random.nextDouble() * (maxValue - minValue));
    }

    public static long RandomLong() {

      Random random = new Random();
      return random.nextLong();
    }

    public static Integer RandomInteger(int minValue, int maxValue) {

      if (minValue >= maxValue) {
        throw new IllegalArgumentException("minValue must be less than maxValue");
      }

      Random random = new Random();
      return minValue + (int) (random.nextDouble() * (maxValue - minValue));
    }

    public static long RandomInteger() {

      Random random = new Random();
      return random.nextInt();
    }

    public static LocalDate[] RandomDate() {

      LocalDate[] dates = new LocalDate[15];
      int minYear = 1970;
      int maxYear = LocalDate.now()
                             .getYear();

      for (int i = 0; i < dates.length; i++) {

        int year = random.nextInt(maxYear - minYear + 1) + minYear;
        int dayOfYear = random.nextInt(
             LocalDate.ofYearDay(year, 1)
                      .lengthOfYear()) + 1;

        dates[i] = LocalDate.ofYearDay(year, dayOfYear);
      }
      return dates;
    }

    public static LocalTime[] RandomTimes() {

      LocalTime[] times = new LocalTime[15];

      for (int i = 0; i < times.length; i++) {

        int hour = random.nextInt(24);
        int min = random.nextInt(60);
        int sec = random.nextInt(60);

        times[i] = LocalTime.of(hour, min, sec);

      }

      return times;
    }

    public static String StringFromRegex(String regex) {

      StringBuilder generatedString = new StringBuilder();
      Random random = new Random();

      while (true) {
        char randomChar = (char) (random.nextInt(128)); // Generating printable ASCII characters
        String candidateString = generatedString.toString() + randomChar;

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(candidateString);

        if (matcher.matches()) {
          generatedString.append(randomChar);
        }

        if (generatedString.length() >= candidateString.length()) {
          break;
        }
      }

      return generatedString.toString();
    }

    public static String color() {

      return RandomOption(COLOR_NAME_LIST);
    }

    public static String artist() {

      return RandomOption(EN_ARTIST_NAMES);
    }

    public static String SinId() {

      return RandomOption(ASIN_LIST);
    }

    public static String Address() {

      return RandomOption(ADDRESS_OPTIONS);
    }

    public static String Animal() {

      return RandomOption(ANIMAL_OPTIONS);
    }

    public static String HollywoodActorActress() {

      return RandomOption(HOLLYWOOD_ACTOR_ACTRESS_OPTIONS);
    }

    public static String Barcode() {

      return RandomOption(BARCODE_OPTIONS);
    }

    public static String Beer() {

      return RandomOption(BEER_OPTIONS);
    }

    public static String Book() {

      return RandomOption(BOOK_OPTIONS);
    }

    public static String CatBreed() {

      return RandomOption(CAT_BREED_OPTIONS);
    }

    public static String CatName() {

      return RandomOption(CAT_NAMES);
    }

    public static String DogBreed() {

      return RandomOption(DOG_BREED_OPTIONS);
    }

    public static String DogName() {

      return RandomOption(DOG_NAMES);
    }

    public static String CreditCardNumer() {

      return RandomOption(CREDIT_CARD_NUMBERS);
    }

    public static String Currency() {

      return RandomOption(CURRENCY_OPTIONS);
    }

    public static String Disease() {

      return RandomOption(DISEASE_OPTIONS);
    }

    public static String Sport() {

      return RandomOption(SPORT_OPTIONS);
    }

    public static String Gender() {

      return RandomOption(GENDER_OPTIONS);
    }

    public static String Hobby() {

      return RandomOption(HOBBY_OPTIONS);
    }

    public static String Music() {

      return RandomOption(MUSIC_OPTIONS);
    }

    public static String FullName() {

      return RandomOption(FIRST_NAME_OPTIONS).concat(" ")
                                             .concat(LastName());
    }

    public static String FirstName() {

      return RandomOption(FIRST_NAME_OPTIONS);
    }

    public static String LastName() {

      return RandomOption(LAST_NAME_OPTIONS);
    }

    public static String Nation() {

      return RandomOption(NATION_OPTIONS);
    }

    public static String NumberSpelled() {

      return RandomOption(NUMBER_OPTIONS);
    }

    public static String PhoneNumber() {

      return RandomOption(PHONE_NUMBER_OPTIONS);
    }

    public static String ProgrammingLanguage() {

      return RandomOption(PROGRAMMING_LANGUAGE_OPTIONS);
    }

    public static String SinNumber() {

      return RandomOption(SIN_NUMBERS);
    }

    public static String Superhero() {

      return RandomOption(SUPERHERO_OPTIONS);
    }

    public static String Team() {

      return RandomOption(TEAM_OPTIONS);
    }

    public static String Weather() {

      return RandomOption(WEATHER_OPTIONS);
    }

    public static String University() {

      return RandomOption(UNIVERSITY_OPTIONS);
    }

    public static String Business() {

      return RandomOption(BUSINESS_OPTIONS);
    }

    public static String PostalCode() {

      return RandomOption(POSTAL_CODE_OPTIONS);
    }

    public static String Job() {

      return RandomOption(JOB_OPTIONS);
    }

    public static String RandomOption(String[] options) {

      int index = random.nextInt(options.length);
      return options[index];
    }

    public static String[] RandomOptions(String[] options) {

      final int totalItemsToBeReturned = 3;
      String[] finalList = new String[totalItemsToBeReturned];

      for (int i = 0; i < totalItemsToBeReturned; i++) {
        finalList[i] = options[i];
      }

      return finalList;
    }
  }
}