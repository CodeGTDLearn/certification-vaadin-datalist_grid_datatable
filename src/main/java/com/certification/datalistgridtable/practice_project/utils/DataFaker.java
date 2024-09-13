package com.certification.datalistgridtable.practice_project.utils;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataFaker {

  private static final Random random = new Random();

  private static final String MAX_MIN_ERROR_MESSAGE = "minValue must be less than maxValue";

  private static final String[] ADDRESS = {
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

  private static final String[] ANIMAL = {
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

  private static final String[] HOLLYWOOD_ACTOR_ACTRESS = {
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

  private static final String[] BARCODE = {
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

  private static final String[] BEER = {
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

  private static final String[] BOOK_TITLES = {
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

  private static final String[] CAT_BREED = {
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

  private static final String[] DOG_BREED = {
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


  private static final String[] CURRENCY = {
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

  private static final String[] DISEASE = {
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

  private static final String[] SPORT = {
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

  private static final String[] GENDER = {
       "Male",
       "Female",
       "Other"
  };

  private static final String[] HOBBY = {
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

  private static final String[] MUSIC_STYLES = {
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

  private static final String[] FIRST_NAME = {
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

  private static final String[] LAST_NAME = {
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

  private static final String[] NATION = {
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

  private static final String[] NUMBER_WRITTENS = {
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

  private static final String[] PHONE_NUMBER = {
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

  private static final String[] PROGRAMMING_LANGUAGE = {
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

  private static final String[] SUPER_HERO = {
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

  private static final String[] TEAM_NAMES = {
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

  private static final String[] WEATHER = {
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

  private static final String[] UNIVERSITY_NAMES = {
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

  private static final String[] BUSINESS_COMPANIES = {
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

  private static final String[] POSTAL_CODE = {
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

  private static final String[] JOBS = {
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


  private static final String[] ASIN = {
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


  private static final String[] COLOR_NAMES = {
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

  private static final String[] DEPARTMENTS = {
       "Books",
       "Movies",
       "Music",
       "Games",
       "Electronics",
       "Computers",
       "Home",
       "Garden",
       "Tools",
       "Grocery"
  };

  private static final String[] PRODUCT_NAME_ADJECTIVES = {
       "Small",
       "Ergonomic",
       "Rustic",
       "Intelligent",
       "Gorgeous",
       "Incredible",
       "Fantastic",
       "Practical",
       "Sleek",
       "Awesome"
  };

  private static final String[] MATERIALS = {
       "Steel",
       "Wooden",
       "Concrete",
       "Plastic",
       "Cotton",
       "Granite",
       "Rubber",
       "Leather",
       "Silk",
       "Wool"
  };

  private static final String[] PRODUCTS = {
       "Chair",
       "Car",
       "Computer",
       "Gloves",
       "Pants",
       "Shirt",
       "Table",
       "Shoes",
       "Hat",
       "Plate"
  };

  private static final String[] PROMOTION_CODE_ADJECTIVES = {
       "Amazing",
       "Awesome",
       "Cool",
       "Good",
       "Great",
       "Incredible",
       "Killer",
       "Premium",
       "Special",
       "Stellar"
  };

  private static final String[] PROMOTION_CODE_NOUNS = {
       "Code",
       "Deal",
       "Discount",
       "Price",
       "Promo",
       "Promotion",
       "Sale",
       "Savings",
       "Super Sale",
       "Black Friday"
  };

  private static final String[] BUZZWORDS = {
       "Adaptive",
       "Advanced",
       "Ameliorated",
       "Assimilated",
       "Automated",
       "Balanced",
       "Business-focused",
       "Centralized",
       "Cloned",
       "Compatible"
  };

  private static final String[] NOUNS = {
       "ability",
       "access",
       "adapter",
       "algorithm",
       "alliance",
       "analyzer",
       "application",
       "approach",
       "architecture",
       "archive"
  };

  private static final String[] VERBS = {
       "implement",
       "utilize",
       "integrate",
       "streamline",
       "optimize",
       "evolve",
       "transform",
       "embrace",
       "enable",
       "orchestrate"
  };

  private static final String[] WORDS = {
       "synergies",
       "web-readiness",
       "paradigms",
       "markets",
       "partnerships",
       "infrastructures",
       "platforms",
       "initiatives",
       "channels",
       "eyeballs"
  };

  private static final String[] INDUSTRY = {
       "Defense & Space",
       "Computer Hardware",
       "Computer Software",
       "Computer Networking",
       "Internet",
       "Semiconductors",
       "Telecommunications",
       "Law Practice",
       "Legal Services",
       "Management Consulting"
  };

  private static final String[] PROFESSION = {
       "teacher",
       "actor",
       "musician",
       "philosopher",
       "writer",
       "doctor",
       "accountant",
       "agriculturist",
       "architect",
       "economist"
  };

  private static final String[] COMPANY_TYPE = {
       "Public Company",
       "Educational Institution",
       "Self-Employed",
       "Government Agency",
       "Nonprofit",
       "Sole Proprietorship",
       "Privately Held",
       "Partnership"
  };

  private static final String[] SIC_CODE = {
       "0111",
       "0112",
       "0115",
       "0116",
       "0119",
       "0131",
       "0132",
       "0133",
       "0134",
       "0139",
       "0161"
  };


  private static final String[] NATIONALITY = {
       "Afghan",
       "Albanian",
       "Algerian",
       "American",
       "Andorran",
       "Angolan",
       "Argentine",
       "Armenian",
       "Aromanian",
       "Aruban"
  };

  private static final String[] EDUCATIONAL_ATTAINMENT = {
       "No schooling completed",
       "Nursery school",
       "Kindergarten",
       "Grade 1 though 11",
       "12th grade - No Diploma",
       "Regular high school diploma",
       "GED or alternative credential",
       "Some college",
       "Associate's degree",
       "Bachelor's degree"
  };

  private static final String[] MARITAL_STATUS = {
       "Married",
       "Widowed",
       "Divorced",
       "Separated",
       "Never married"
  };

  private static final String[] EDUCATOR_NAMES = {
       "Marblewald",
       "Mallowtown",
       "Brookville",
       "Flowerlake",
       "Falconholt",
       "Ostbarrow",
       "Lakeacre",
       "Clearcourt",
       "Ironston",
       "Mallowpond"
  };

  private static final String[] SECONDARY_SCHOOLS = {
       "High School",
       "Secondary College",
       "High"
  };

  private static final String[] DEGREE_SUBJECTS = {
       "Arts",
       "Business",
       "Education",
       "Applied Science (Psychology)",
       "Architectural Technology",
       "Biological Science",
       "Biomedical Science",
       "Commerce",
       "Communications",
       "Creative Arts"
  };

  private static final String[] FILE_EXTENSIONS = {
       "flac",
       "mp3",
       "wav",
       "bmp",
       "gif",
       "jpeg",
       "jpg",
       "png",
       "tiff",
       "css"
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

  private static final String[] FAMOUS_LAST_WORDS = {
       "I don't know.",
       "No comment.",
       "Van Halen!",
       "Is it not meningitis?",
       "I love you too, honey. Good luck with your show.",
       "Am I dying, or is this my birthday?",
       "I want your bunk!",
       "I went the distance.",
       "Goodnight, my darlings, I'll see you tomorrow.",
       "I am confound."
  };

  private static final String[] FRUITS = {
       "Apple",
       "Banana",
       "Orange",
       "Grapes",
       "Strawberry",
       "Mango",
       "Pineapple",
       "Watermelon",
       "Cherry",
       "Blueberry",
       "Peach",
       "Pear",
       "Kiwi",
       "Lemon",
       "Plum"
  };

  private static final String[] VEGETABLES = {
       "Carrot",
       "Broccoli",
       "Spinach",
       "Tomato",
       "Cucumber",
       "Bell Pepper",
       "Onion",
       "Garlic",
       "Potato",
       "Lettuce",
       "Cabbage",
       "Zucchini",
       "Eggplant",
       "Celery",
       "Radish"
  };

  private static final String[] CAR_BRANDS = {
       "Toyota",
       "Ford",
       "Honda",
       "Chevrolet",
       "Nissan",
       "Volkswagen",
       "BMW",
       "Mercedes-Benz",
       "Audi",
       "Hyundai",
       "Kia",
       "Subaru",
       "Mazda",
       "Lexus",
       "Tesla"
  };

  private static final String[] MOVIE_GENRES = {
       "Action",
       "Comedy",
       "Drama",
       "Sci-Fi",
       "Horror",
       "Romance",
       "Thriller",
       "Adventure",
       "Fantasy",
       "Mystery",
       "Crime",
       "Animation",
       "Documentary",
       "Western",
       "Musical"
  };

  private static final String[] SOCIAL_MEDIA_PLATFORMS = {
       "Facebook",
       "Instagram",
       "Twitter",
       "LinkedIn",
       "YouTube",
       "TikTok",
       "Pinterest",
       "Snapchat",
       "Reddit",
       "WhatsApp",
       "WeChat",
       "Telegram",
       "Viber",
       "Line",
       "KakaoTalk"
  };

  private static final String[] TECHNOLOGY_COMPANIES = {
       "Apple",
       "Microsoft",
       "Google",
       "Amazon",
       "Facebook",
       "IBM",
       "Oracle",
       "Samsung",
       "Intel",
       "Cisco",
       "HP",
       "Dell",
       "Sony",
       "Lenovo",
       "Huawei"
  };

  private static final String[] COUNTRIES = {
       "United States",
       "Canada",
       "Mexico",
       "Brazil",
       "Argentina",
       "United Kingdom",
       "Germany",
       "France",
       "Italy",
       "Spain",
       "Russia",
       "China",
       "Japan",
       "India",
       "Australia"
  };

  private static final String[] CITIES = {
       "New York",
       "Los Angeles",
       "Chicago",
       "Houston",
       "Phoenix",
       "Philadelphia",
       "San Antonio",
       "San Diego",
       "Dallas",
       "San Jose",
       "Austin",
       "Jacksonville",
       "Fort Worth",
       "Columbus",
       "San Francisco"
  };

  private static final String[] LANGUAGES = {
       "English",
       "Spanish",
       "French",
       "German",
       "Italian",
       "Portuguese",
       "Russian",
       "Chinese",
       "Japanese",
       "Korean",
       "Arabic",
       "Hindi",
       "Bengali",
       "Punjabi",
       "Turkish"
  };

  private static final String[] SPORTS_TEAMS = {
       "Real Madrid",
       "Barcelona",
       "Manchester United",
       "Bayern Munich",
       "Juventus",
       "Liverpool",
       "Paris Saint-Germain",
       "Chelsea",
       "Arsenal",
       "Manchester City",
       "Atletico Madrid",
       "Inter Milan",
       "AC Milan",
       "Borussia Dortmund",
       "Tottenham Hotspur"
  };

  private static final String[] BOOK_GENRES = {
       "Fiction",
       "Non-fiction",
       "Mystery",
       "Science Fiction",
       "Fantasy",
       "Romance",
       "Thriller",
       "Horror",
       "Biography",
       "History",
       "Self-help",
       "Poetry",
       "Children's",
       "Young Adult",
       "Graphic Novel"
  };

  private static final String[] MUSIC_GENRES = {
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

  private static final String[] TV_SHOWS = {
       "Game of Thrones",
       "Breaking Bad",
       "The Walking Dead",
       "Stranger Things",
       "The Office",
       "Friends",
       "Seinfeld",
       "The Simpsons",
       "South Park",
       "Family Guy",
       "The Big Bang Theory",
       "How I Met Your Mother",
       "Modern Family",
       "Grey's Anatomy",
       "The Sopranos"
  };

  private static final String[] CELEBRITIES = {
       "Brad Pitt",
       "Angelina Jolie",
       "Leonardo DiCaprio",
       "Jennifer Lawrence",
       "Dwayne Johnson",
       "Emma Watson",
       "Robert Downey Jr.",
       "Scarlett Johansson",
       "Chris Hemsworth",
       "Gal Gadot",
       "Ryan Reynolds",
       "Emma Stone",
       "Chris Evans",
       "Margot Robbie",
       "Tom Holland"
  };

  private static final String[] FOOD_DISHES = {
       "Pizza",
       "Burger",
       "Sushi",
       "Pasta",
       "Tacos",
       "Steak",
       "Salad",
       "Sandwich",
       "Fried Chicken",
       "Ice Cream",
       "Cake",
       "Cookies",
       "Pancakes",
       "Waffles",
       "Omelette"
  };

  private static final String[] DRINKS = {
       "Water",
       "Coffee",
       "Tea",
       "Soda",
       "Juice",
       "Milk",
       "Beer",
       "Wine",
       "Whiskey",
       "Vodka",
       "Rum",
       "Gin",
       "Tequila",
       "Cocktail",
       "Smoothie"
  };

  private static final String[] HOLIDAYS = {
       "Christmas",
       "New Year's Day",
       "Easter",
       "Thanksgiving",
       "Halloween",
       "Valentine's Day",
       "Independence Day",
       "Labor Day",
       "Memorial Day",
       "Veterans Day",
       "Martin Luther King Jr. Day",
       "Presidents' Day",
       "St. Patrick's Day",
       "Mother's Day",
       "Father's Day"
  };

  private static final String[] PLANETS = {
       "Mercury",
       "Venus",
       "Earth",
       "Mars",
       "Jupiter",
       "Saturn",
       "Uranus",
       "Neptune",
       "Pluto",
       "Ceres",
       "Eris",
       "Makemake",
       "Haumea",
       "Sedna",
       "Orcus"
  };

  private static final String[] ANIMAL_SPECIES = {
       "Lion",
       "Tiger",
       "Elephant",
       "Giraffe",
       "Zebra",
       "Kangaroo",
       "Koala",
       "Panda",
       "Gorilla",
       "Rhinoceros",
       "Hippopotamus",
       "Crocodile",
       "Alligator",
       "Polar Bear",
       "Grizzly Bear"
  };

  private static final String[] PLANT_SPECIES = {
       "Rose",
       "Tulip",
       "Sunflower",
       "Daisy",
       "Lily",
       "Orchid",
       "Cactus",
       "Fern",
       "Bamboo",
       "Palm",
       "Maple",
       "Oak",
       "Pine",
       "Birch",
       "Willow"
  };

  private static final String[] HOTEL_NAMES = {
       "Marriott",
       "Hilton",
       "Hyatt",
       "Sheraton",
       "InterContinental",
       "Four Seasons",
       "Ritz-Carlton",
       "Westin",
       "Waldorf Astoria",
       "JW Marriott",
       "St. Regis",
       "Park Hyatt",
       "Grand Hyatt",
       "Mandarin Oriental",
       "Shangri-La"
  };

  private static final String[] AIRLINE_COMPANIES = {
       "American Airlines",
       "Delta Air Lines",
       "United Airlines",
       "Southwest Airlines",
       "British Airways",
       "Lufthansa",
       "Air France",
       "Emirates",
       "Qatar Airways",
       "Singapore Airlines",
       "Cathay Pacific",
       "Japan Airlines",
       "KLM",
       "Air Canada",
       "Qantas"
  };

  private static final String[] AIRPORT_CODES = {
       "JFK",
       "LAX",
       "ORD",
       "DFW",
       "DEN",
       "ATL",
       "SFO",
       "CLT",
       "LHR",
       "CDG",
       "FRA",
       "AMS",
       "NRT",
       "HND",
       "PEK"
  };

  private static final String[] RESTAURANT_NAMES = {
       "McDonald's",
       "Burger King",
       "KFC",
       "Subway",
       "Pizza Hut",
       "Taco Bell",
       "Starbucks",
       "Dunkin'",
       "Wendy's",
       "Chipotle",
       "Domino's",
       "Papa John's",
       "Chick-fil-A",
       "Panera Bread",
       "Arby's"
  };

  private static final String[] SHOPPING_MALLS = {
       "Westfield",
       "Simon Property Group",
       "Unibail-Rodamco",
       "Klépierre",
       "Intu Properties",
       "CapitaLand",
       "Scentre Group",
       "Brookfield Properties",
       "GGP",
       "Taubman Centers",
       "Macquarie Centre",
       "West Edmonton Mall",
       "Mall of America",
       "Dubai Mall",
       "Westfield London"
  };

  private static final String[] BANK_NAMES = {
       "JPMorgan Chase",
       "Bank of America",
       "Citigroup",
       "Wells Fargo",
       "Goldman Sachs",
       "Morgan Stanley",
       "HSBC",
       "Barclays",
       "Deutsche Bank",
       "Credit Suisse",
       "UBS",
       "BNP Paribas",
       "Santander",
       "BBVA",
       "ING Group"
  };

  private static final String[] INSURANCE_COMPANIES = {
       "Allianz",
       "AXA",
       "Ping An Insurance",
       "Prudential plc",
       "MetLife",
       "AIA Group",
       "Manulife",
       "General Insurance",
       "Zurich Insurance Group",
       "China Life Insurance",
       "Prudential Financial",
       "Munich Re",
       "Assicurazioni Generali",
       "Nippon Life Insurance",
       "Legal & General"
  };

  private static final String[] HOSPITAL_NAMES = {
       "Mayo Clinic",
       "Cleveland Clinic",
       "Johns Hopkins Hospital",
       "Massachusetts General Hospital",
       "UCLA Medical Center",
       "NewYork-Presbyterian Hospital",
       "Cedars-Sinai Medical Center",
       "Stanford Health Care",
       "Houston Methodist Hospital",
       "UPMC Presbyterian Shadyside",
       "Mount Sinai Hospital",
       "Brigham and Women's Hospital",
       "Northwestern Memorial Hospital",
       "University of Michigan Hospitals",
       "Duke University Hospital"
  };

  private static final String[] UNIVERSITY_COURSES = {
       "Computer Science",
       "Business Administration",
       "Engineering",
       "Medicine",
       "Law",
       "Psychology",
       "Economics",
       "Biology",
       "Chemistry",
       "Physics",
       "Mathematics",
       "History",
       "Philosophy",
       "Sociology",
       "Anthropology"
  };

  private static final String[] COMPUTER_BRANDS = {
       "Apple",
       "Dell",
       "HP",
       "Lenovo",
       "Acer",
       "Asus",
       "Samsung",
       "Microsoft",
       "Sony",
       "Toshiba",
       "Fujitsu",
       "LG",
       "MSI",
       "Razer",
       "Alienware"
  };

  private static final String[] SOFTWARE_APPLICATIONS = {
       "Microsoft Office",
       "Adobe Creative Suite",
       "Google Workspace",
       "Slack",
       "Zoom",
       "Trello",
       "Asana",
       "Jira",
       "Confluence",
       "Notion",
       "Evernote",
       "Dropbox",
       "OneDrive",
       "Google Drive",
       "Box"
  };

  private static final String[] CLOTHING_BRANDS = {
       "Nike",
       "Adidas",
       "Puma",
       "Under Armour",
       "Levi's",
       "Gucci",
       "Prada",
       "Chanel",
       "Louis Vuitton",
       "Zara",
       "H&M",
       "Uniqlo",
       "Gap",
       "Ralph Lauren",
       "Tommy Hilfiger"
  };

  private static final String[] JEWELRY_BRANDS = {
       "Tiffany & Co.",
       "Cartier",
       "Bulgari",
       "Van Cleef & Arpels",
       "Harry Winston",
       "Chopard",
       "Graff",
       "Bvlgari",
       "Piaget",
       "David Yurman",
       "Mikimoto",
       "Pandora",
       "Swarovski",
       "Alex and Ani",
       "Kay Jewelers"
  };

  private static final String[] PERFUME_BRANDS = {
       "Chanel",
       "Dior",
       "Gucci",
       "Yves Saint Laurent",
       "Giorgio Armani",
       "Tom Ford",
       "Jo Malone",
       "Versace",
       "Calvin Klein",
       "Ralph Lauren",
       "Burberry",
       "Hugo Boss",
       "Dolce & Gabbana",
       "Marc Jacobs",
       "Prada"
  };

  private static final String[] COSMETIC_BRANDS = {
       "L'Oréal",
       "Estée Lauder",
       "Clinique",
       "MAC",
       "Maybelline",
       "Revlon",
       "NARS",
       "Bobbi Brown",
       "Lancôme",
       "Chanel",
       "Dior",
       "Guerlain",
       "Shiseido",
       "Clarins",
       "La Mer"
  };

  private static final String[] FURNITURE_BRANDS = {
       "IKEA",
       "Ashley Furniture",
       "Wayfair",
       "Pottery Barn",
       "Crate & Barrel",
       "West Elm",
       "La-Z-Boy",
       "Ethan Allen",
       "Restoration Hardware",
       "Herman Miller",
       "Steelcase",
       "Knoll",
       "Bassett Furniture",
       "Raymour & Flanigan",
       "Rooms To Go"
  };

  private static final String[] ELECTRONICS_BRANDS = {
       "Sony",
       "Samsung",
       "LG",
       "Panasonic",
       "Philips",
       "Sharp",
       "Toshiba",
       "Hitachi",
       "Bose",
       "Sennheiser",
       "JBL",
       "Beats",
       "Sonos",
       "Dyson",
       "Braun"
  };

  private static final String[] TOY_BRANDS = {
       "Lego",
       "Mattel",
       "Hasbro",
       "Fisher-Price",
       "Barbie",
       "Hot Wheels",
       "Nerf",
       "Playmobil",
       "Transformers",
       "My Little Pony",
       "Monster High",
       "L.O.L. Surprise!",
       "PAW Patrol",
       "Peppa Pig",
       "Thomas & Friends"
  };

  private static final String[] BOOK_AUTHORS = {
       "J.K. Rowling",
       "Stephen King",
       "Agatha Christie",
       "Dan Brown",
       "J.R.R. Tolkien",
       "George Orwell",
       "Harper Lee",
       "Ernest Hemingway",
       "F. Scott Fitzgerald",
       "Mark Twain",
       "Charles Dickens",
       "Jane Austen",
       "William Shakespeare",
       "Leo Tolstoy",
       "Gabriel García Márquez"
  };

  private static final String[] MOVIE_DIRECTORS = {
       "Steven Spielberg",
       "Martin Scorsese",
       "Christopher Nolan",
       "Quentin Tarantino",
       "James Cameron",
       "Alfred Hitchcock",
       "Stanley Kubrick",
       "Francis Ford Coppola",
       "Ridley Scott",
       "George Lucas",
       "Peter Jackson",
       "Tim Burton",
       "David Fincher",
       "Wes Anderson",
       "Guillermo del Toro"
  };

  private static final String[] FOOD_INGREDIENTS = {
       "Flour",
       "Sugar",
       "Salt",
       "Olive Oil",
       "Butter",
       "Eggs",
       "Milk",
       "Cheese",
       "Tomatoes",
       "Onions",
       "Garlic",
       "Carrots",
       "Potatoes",
       "Chicken",
       "Beef"
  };

  private static final String[] COOKING_METHODS = {
       "Boiling",
       "Frying",
       "Grilling",
       "Baking",
       "Roasting",
       "Sautéing",
       "Steaming",
       "Broiling",
       "Poaching",
       "Simmering",
       "Braising",
       "Stir-frying",
       "Barbecuing",
       "Smoking",
       "Marinating"
  };

  private static final String[] RECIPES = {
       "Spaghetti Bolognese",
       "Chicken Curry",
       "Beef Stroganoff",
       "Vegetable Stir-fry",
       "Chocolate Cake",
       "Apple Pie",
       "Pancakes",
       "Omelette",
       "Fried Rice",
       "Chicken Soup",
       "Lasagna",
       "Pizza Margherita",
       "Sushi Rolls",
       "Tacos Al Pastor",
       "Burger with Fries"
  };

  private static final String[] KITCHEN_APPLIANCES = {
       "Refrigerator",
       "Oven",
       "Stove",
       "Microwave",
       "Dishwasher",
       "Blender",
       "Toaster",
       "Coffee Maker",
       "Food Processor",
       "Slow Cooker",
       "Rice Cooker",
       "Air Fryer",
       "Waffle Maker",
       "Juicer",
       "Mixer"
  };

  private static final String[] COOKWARE = {
       "Pots",
       "Pans",
       "Skillets",
       "Saucepans",
       "Woks",
       "Griddles",
       "Dutch Ovens",
       "Casserole Dishes",
       "Baking Sheets",
       "Muffin Tins",
       "Cake Pans",
       "Pizza Stones",
       "Roasting Pans",
       "Steamers",
       "Colanders"
  };

  private static final String[] TABLEWARE = {
       "Plates",
       "Bowls",
       "Cups",
       "Glasses",
       "Forks",
       "Knives",
       "Spoons",
       "Chopsticks",
       "Serving Spoons",
       "Ladles",
       "Tongs",
       "Cutting Boards",
       "Mixing Bowls",
       "Measuring Cups",
       "Measuring Spoons"
  };

  private static final String[] BEVERAGES = {
       "Water",
       "Soda",
       "Juice",
       "Milk",
       "Coffee",
       "Tea",
       "Hot Chocolate",
       "Lemonade",
       "Iced Tea",
       "Smoothie",
       "Energy Drink",
       "Sports Drink",
       "Coconut Water",
       "Sparkling Water",
       "Fruit Punch"
  };

  private static final String[] COFFEE_TYPES = {
       "Espresso",
       "Cappuccino",
       "Latte",
       "Americano",
       "Mocha",
       "Macchiato",
       "Flat White",
       "Cortado",
       "Affogato",
       "Irish Coffee",
       "Vienna Coffee",
       "Café au Lait",
       "Café Bombón",
       "Café de Olla",
       "Café Cubano"
  };

  private static final String[] TEA_TYPES = {
       "Black Tea",
       "Green Tea",
       "Oolong Tea",
       "White Tea",
       "Herbal Tea",
       "Chamomile Tea",
       "Peppermint Tea",
       "Ginger Tea",
       "Rooibos Tea",
       "Matcha Tea",
       "Chai Tea",
       "Earl Grey Tea",
       "Darjeeling Tea",
       "Assam Tea",
       "Pu-erh Tea"
  };

  private static final String[] JUICE_FLAVORS = {
       "Orange Juice",
       "Apple Juice",
       "Grape Juice",
       "Pineapple Juice",
       "Mango Juice",
       "Cranberry Juice",
       "Tomato Juice",
       "Carrot Juice",
       "Beet Juice",
       "Pomegranate Juice",
       "Grapefruit Juice",
       "Lemon Juice",
       "Lime Juice",
       "Coconut Juice",
       "Watermelon Juice"
  };

  private static final String[] SMOOTHIE_INGREDIENTS = {
       "Banana",
       "Strawberry",
       "Blueberry",
       "Raspberry",
       "Mango",
       "Pineapple",
       "Spinach",
       "Kale",
       "Almond Milk",
       "Coconut Milk",
       "Yogurt",
       "Honey",
       "Peanut Butter",
       "Chia Seeds",
       "Protein Powder"
  };

  private static final String[] BAKERY_ITEMS = {
       "Bread",
       "Croissant",
       "Muffin",
       "Bagel",
       "Donut",
       "Cake",
       "Pie",
       "Cookie",
       "Brownie",
       "Scone",
       "Danish",
       "Éclair",
       "Macaron",
       "Cinnamon Roll",
       "Baguette"
  };

  private static final String[] DESSERTS = {
       "Ice Cream",
       "Chocolate Cake",
       "Cheesecake",
       "Tiramisu",
       "Crème Brûlée",
       "Apple Pie",
       "Brownie",
       "Macaron",
       "Éclair",
       "Panna Cotta",
       "Mousse",
       "Trifle",
       "Fruit Salad",
       "Sorbet",
       "Parfait"
  };

  private static final String[] SNACKS = {
       "Chips",
       "Popcorn",
       "Pretzels",
       "Nuts",
       "Crackers",
       "Granola Bars",
       "Fruit Snacks",
       "Yogurt",
       "Trail Mix",
       "Rice Cakes",
       "Beef Jerky",
       "Hummus",
       "Guacamole",
       "Salsa",
       "Cheese Puffs"
  };

  private static final String[] CONDIMENTS = {
       "Ketchup",
       "Mustard",
       "Mayonnaise",
       "Soy Sauce",
       "Hot Sauce",
       "BBQ Sauce",
       "Salsa",
       "Guacamole",
       "Hummus",
       "Tahini",
       "Pesto",
       "Chutney",
       "Relish",
       "Jam",
       "Jelly"
  };

  private static final String[] SPICES = {
       "Salt",
       "Pepper",
       "Garlic Powder",
       "Onion Powder",
       "Paprika",
       "Cumin",
       "Cinnamon",
       "Nutmeg",
       "Ginger",
       "Turmeric",
       "Cayenne Pepper",
       "Chili Powder",
       "Oregano",
       "Basil",
       "Thyme"
  };

  private static final String[] HERBS = {
       "Basil",
       "Oregano",
       "Thyme",
       "Rosemary",
       "Parsley",
       "Cilantro",
       "Dill",
       "Mint",
       "Sage",
       "Tarragon",
       "Chives",
       "Lavender",
       "Lemon Balm",
       "Marjoram",
       "Bay Leaf"
  };

  private static final String[] SAUCES = {
       "Tomato Sauce",
       "Alfredo Sauce",
       "Pesto Sauce",
       "Marinara Sauce",
       "BBQ Sauce",
       "Hot Sauce",
       "Soy Sauce",
       "Teriyaki Sauce",
       "Hoisin Sauce",
       "Curry Sauce",
       "Peanut Sauce",
       "Tahini Sauce",
       "Hollandaise Sauce",
       "Béarnaise Sauce",
       "Béchamel Sauce"
  };

  private static final String[] CHEESE_TYPES = {
       "Cheddar",
       "Mozzarella",
       "Gouda",
       "Brie",
       "Parmesan",
       "Feta",
       "Blue Cheese",
       "Swiss Cheese",
       "Provolone",
       "Camembert",
       "Edam",
       "Havarti",
       "Muenster",
       "Ricotta",
       "Cottage Cheese"
  };

  private static final String[] MEAT_TYPES = {
       "Beef",
       "Chicken",
       "Pork",
       "Lamb",
       "Turkey",
       "Duck",
       "Venison",
       "Bison",
       "Rabbit",
       "Goat",
       "Veal",
       "Mutton",
       "Buffalo",
       "Ostrich",
       "Kangaroo"
  };

  private static final String[] SEAFOOD_TYPES = {
       "Salmon",
       "Tuna",
       "Shrimp",
       "Cod",
       "Lobster",
       "Crab",
       "Oyster",
       "Mussel",
       "Scallop",
       "Swordfish",
       "Mackerel",
       "Sardine",
       "Anchovy",
       "Herring",
       "Halibut"
  };

  private static final String[] PASTA_TYPES = {
       "Spaghetti",
       "Penne",
       "Fettuccine",
       "Macaroni",
       "Lasagna",
       "Ravioli",
       "Tortellini",
       "Fusilli",
       "Rigatoni",
       "Angel Hair",
       "Linguine",
       "Orzo",
       "Couscous",
       "Gnocchi",
       "Rotini"
  };

  private static final String[] RICE_TYPES = {
       "White Rice",
       "Brown Rice",
       "Basmati Rice",
       "Jasmine Rice",
       "Sushi Rice",
       "Wild Rice",
       "Arborio Rice",
       "Black Rice",
       "Red Rice",
       "Sticky Rice",
       "Parboiled Rice",
       "Long Grain Rice",
       "Short Grain Rice",
       "Medium Grain Rice",
       "Instant Rice"
  };

  private static final String[] BREAD_TYPES = {
       "White Bread",
       "Whole Grain Bread",
       "Sourdough Bread",
       "Rye Bread",
       "Pumpernickel Bread",
       "Ciabatta Bread",
       "Focaccia Bread",
       "Baguette",
       "Challah Bread",
       "Brioche Bread",
       "Naan Bread",
       "Pita Bread",
       "Tortilla",
       "English Muffin",
       "Bagel"
  };

  private static final String[] SALAD_INGREDIENTS = {
       "Lettuce",
       "Spinach",
       "Kale",
       "Arugula",
       "Tomato",
       "Cucumber",
       "Bell Pepper",
       "Onion",
       "Carrot",
       "Avocado",
       "Olives",
       "Croutons",
       "Bacon",
       "Chicken",
       "Feta Cheese"
  };

  private static final String[] SOUP_TYPES = {
       "Chicken Soup",
       "Tomato Soup",
       "Vegetable Soup",
       "Beef Soup",
       "Miso Soup",
       "Clam Chowder",
       "French Onion Soup",
       "Minestrone Soup",
       "Lentil Soup",
       "Potato Soup",
       "Cream of Mushroom Soup",
       "Cream of Chicken Soup",
       "Cream of Tomato Soup",
       "Cream of Broccoli Soup",
       "Cream of Asparagus Soup"
  };

  private static final String[] PIZZA_TOPPINGS = {
       "Pepperoni",
       "Mushrooms",
       "Onions",
       "Sausage",
       "Bacon",
       "Extra Cheese",
       "Black Olives",
       "Green Peppers",
       "Pineapple",
       "Spinach",
       "Tomatoes",
       "Garlic",
       "Anchovies",
       "Jalapeños",
       "Ham"
  };

  private static final String[] SANDWICH_INGREDIENTS = {
       "Ham",
       "Turkey",
       "Chicken",
       "Roast Beef",
       "Salami",
       "Bologna",
       "Tuna",
       "Egg",
       "Cheese",
       "Lettuce",
       "Tomato",
       "Cucumber",
       "Onion",
       "Pickles",
       "Mayonnaise"
  };

  private static final String[] BURGER_TOPPINGS = {
       "Lettuce",
       "Tomato",
       "Onion",
       "Pickles",
       "Cheese",
       "Bacon",
       "Avocado",
       "Mushrooms",
       "Jalapeños",
       "Fried Egg",
       "BBQ Sauce",
       "Ketchup",
       "Mustard",
       "Mayonnaise",
       "Relish"
  };

  private static final String[] TACO_INGREDIENTS = {
       "Beef",
       "Chicken",
       "Pork",
       "Fish",
       "Shrimp",
       "Lettuce",
       "Tomato",
       "Onion",
       "Cilantro",
       "Avocado",
       "Sour Cream",
       "Salsa",
       "Guacamole",
       "Cheese",
       "Lime"
  };

  private static final String[] SUSHI_INGREDIENTS = {
       "Rice",
       "Nori",
       "Salmon",
       "Tuna",
       "Cucumber",
       "Avocado",
       "Crab",
       "Shrimp",
       "Eel",
       "Cream Cheese",
       "Soy Sauce",
       "Wasabi",
       "Ginger",
       "Sesame Seeds",
       "Tempura Flakes"
  };

  private static final String[] CURRY_TYPES = {
       "Chicken Curry",
       "Beef Curry",
       "Vegetable Curry",
       "Thai Green Curry",
       "Thai Red Curry",
       "Massaman Curry",
       "Panang Curry",
       "Korma Curry",
       "Rogan Josh Curry",
       "Vindaloo Curry",
       "Biryani Curry",
       "Butter Chicken Curry",
       "Tikka Masala Curry",
       "Jalfrezi Curry",
       "Madras Curry"
  };

  private static final String[] STEW_TYPES = {
       "Beef Stew",
       "Chicken Stew",
       "Lamb Stew",
       "Vegetable Stew",
       "Irish Stew",
       "Brunswick Stew",
       "Goulash Stew",
       "Chili Stew",
       "Cassoulet Stew",
       "Bouillabaisse Stew",
       "Cioppino Stew",
       "Jambalaya Stew",
       "Paella Stew",
       "Ratatouille Stew",
       "Tagine Stew"
  };

  private static final String[] GRILL_ITEMS = {
       "Steak",
       "Burger",
       "Chicken",
       "Sausage",
       "Hot Dog",
       "Ribs",
       "Shrimp",
       "Fish",
       "Vegetables",
       "Kebab",
       "Corn on the Cob",
       "Pizza",
       "Quesadilla",
       "Grilled Cheese",
       "Grilled Sandwich"
  };

  private static final String[] BARBECUE_ITEMS = {
       "Ribs",
       "Brisket",
       "Pulled Pork",
       "Chicken",
       "Burger",
       "Hot Dog",
       "Sausage",
       "Steak",
       "Shrimp",
       "Fish",
       "Vegetables",
       "Corn on the Cob",
       "Kebab",
       "BBQ Sauce",
       "Coleslaw"
  };

  private static final String[] BREAKFAST_ITEMS = {
       "Eggs",
       "Bacon",
       "Sausage",
       "Pancakes",
       "Waffles",
       "Oatmeal",
       "Cereal",
       "Toast",
       "Bagel",
       "Muffin",
       "Yogurt",
       "Fruit",
       "Juice",
       "Coffee",
       "Tea"
  };

  private static final String[] LUNCH_ITEMS = {
       "Sandwich",
       "Salad",
       "Soup",
       "Pizza",
       "Burger",
       "Wrap",
       "Quesadilla",
       "Taco",
       "Sushi",
       "Pasta",
       "Rice",
       "Chicken",
       "Fish",
       "Vegetables",
       "Fruit"
  };

  private static final String[] DINNER_ITEMS = {
       "Steak",
       "Chicken",
       "Fish",
       "Pasta",
       "Rice",
       "Vegetables",
       "Salad",
       "Soup",
       "Pizza",
       "Burger",
       "Taco",
       "Sushi",
       "Curry",
       "Stew",
       "Grilled Items"
  };

  private static final String[] DELI_ITEMS = {
       "Ham",
       "Turkey",
       "Roast Beef",
       "Salami",
       "Bologna",
       "Pastrami",
       "Cheese",
       "Lettuce",
       "Tomato",
       "Onion",
       "Pickles",
       "Mayonnaise",
       "Mustard",
       "Sandwich",
       "Wrap"
  };

  private static final String[] FAST_FOOD_ITEMS = {
       "Burger",
       "Fries",
       "Pizza",
       "Chicken Nuggets",
       "Hot Dog",
       "Taco",
       "Sandwich",
       "Wrap",
       "Fried Chicken",
       "Onion Rings",
       "Mozzarella Sticks",
       "Chicken Wings",
       "Nachos",
       "Salad",
       "Soda"
  };

  public static LocalDate[] randomDate() {

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

  public static LocalTime[] randomTimes() {

    LocalTime[] times = new LocalTime[15];

    for (int i = 0; i < times.length; i++) {

      int hour = random.nextInt(24);
      int min = random.nextInt(60);
      int sec = random.nextInt(60);

      times[i] = LocalTime.of(hour, min, sec);

    }

    return times;
  }

  public static String stringFromRegex(String regex) {

    StringBuilder generatedString = new StringBuilder();

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

  public static String artist() {

    return randomOption(EN_ARTIST_NAMES);
  }

  public static String sinId() {

    return randomOption(ASIN);
  }

  public static String address() {

    return randomOption(ADDRESS);
  }

  public static String animal() {

    return randomOption(ANIMAL);
  }

  public static String hollywoodActorActress() {

    return randomOption(HOLLYWOOD_ACTOR_ACTRESS);
  }

  public static String catName() {

    return randomOption(CAT_NAMES);
  }

  public static String dogName() {

    return randomOption(DOG_NAMES);
  }

  public static String creditCardNumer() {

    return randomOption(CREDIT_CARD_NUMBERS);
  }

  public static String disease() {

    return randomOption(DISEASE);
  }

  public static String numberWrittens() {

    return randomOption(NUMBER_WRITTENS);
  }

  public static String phoneNumber() {

    return randomOption(PHONE_NUMBER);
  }

  public static String superHero() {

    return randomOption(SUPER_HERO);
  }

  public static String color() {

    return randomOption(COLOR_NAMES);
  }

  public static double randomDouble(double minValue, double maxValue) {

    if (minValue >= maxValue) {
      throw new IllegalArgumentException(MAX_MIN_ERROR_MESSAGE);
    }

    return minValue + (random.nextDouble() * (maxValue - minValue));
  }

  public static double randomDouble() {

    return random.nextDouble();
  }

  public static long randomLong(long minValue, long maxValue) {

    if (minValue >= maxValue) {
      throw new IllegalArgumentException(MAX_MIN_ERROR_MESSAGE);
    }


    return minValue + (random.nextLong() * (maxValue - minValue));
  }

  public static long randomLong() {


    return random.nextLong();
  }

  public static int randomInteger(int minValue, int maxValue) {

    if (minValue >= maxValue) {
      throw new IllegalArgumentException(MAX_MIN_ERROR_MESSAGE);
    }

    return minValue + (random.nextInt() * (maxValue - minValue));
  }

  public static Integer randomInteger() {

    return random.nextInt();
  }

  public static String barcode() {

    return randomOption(BARCODE);
  }

  public static String beer() {

    return randomOption(BEER);
  }

  public static String book() {

    return randomOption(BOOK_TITLES);
  }

  public static String catBreed() {

    return randomOption(CAT_BREED);
  }

  public static String dogBreed() {

    return randomOption(DOG_BREED);
  }

  public static String currency() {

    return randomOption(CURRENCY);
  }

  public static String date() {


    int year = random.nextInt(100) + 2000;
    int month = random.nextInt(12) + 1;
    int day = random.nextInt(31) + 1;
    LocalDate randomDate = LocalDate.of(year, month, day);
    return randomDate.toString();
  }

  public static String time() {


    int hour = random.nextInt(24);
    int minute = random.nextInt(60);
    int second = random.nextInt(60);

    LocalTime randomTime = LocalTime.of(hour, minute, second);
    return randomTime.toString();
  }

  public static String sport() {

    return randomOption(SPORT);
  }

  public static String gender() {

    return randomOption(GENDER);
  }

  public static String hobby() {

    return randomOption(HOBBY);
  }

  public static String music() {

    return randomOption(MUSIC_STYLES);
  }

  public static String fullName() {

    return randomOption(FIRST_NAME)
         .concat(" ")
         .concat(lastName());
  }

  public static String firstName() {

    return randomOption(FIRST_NAME);
  }

  public static String lastName() {

    return randomOption(LAST_NAME);
  }

  public static String nation() {

    return randomOption(NATION);
  }

  public static String number() {

    return randomOption(NUMBER_WRITTENS);
  }

  public static String programmingLanguage() {

    return randomOption(PROGRAMMING_LANGUAGE);
  }

  public static String sinNumber() {

    return randomOption(SIN_NUMBERS);
  }

  public static String superhero() {

    return randomOption(SUPER_HERO);
  }

  public static String team() {

    return randomOption(TEAM_NAMES);
  }

  public static String weather() {

    return randomOption(WEATHER);
  }

  public static String university() {

    return randomOption(UNIVERSITY_NAMES);
  }

  public static String business() {

    return randomOption(BUSINESS_COMPANIES);
  }

  public static String postalCode() {

    return randomOption(POSTAL_CODE);
  }

  public static String jobOptions() {

    return randomOption(JOBS);
  }

  public static String departments() {

    return randomOption(DEPARTMENTS);
  }

  public static String productNameAdjectives() {

    return randomOption(PRODUCT_NAME_ADJECTIVES);
  }

  public static String promotionCodeAdjectives() {

    return randomOption(PROMOTION_CODE_ADJECTIVES);
  }

  public static String promotionCodeNouns() {

    return randomOption(PROMOTION_CODE_NOUNS);
  }

  public static String materials() {

    return randomOption(MATERIALS);
  }

  public static String buzzwords() {

    return randomOption(BUZZWORDS);
  }

  public static String verbs() {

    return randomOption(VERBS);
  }

  public static String nouns() {

    return randomOption(NOUNS);
  }

  public static String famousLastWords() {

    return randomOption(FAMOUS_LAST_WORDS);
  }

  public static String fileExtensions() {

    return randomOption(FILE_EXTENSIONS);
  }

  public static String degree() {

    return randomOption(DEGREE_SUBJECTS);
  }

  public static String educator() {

    return randomOption(EDUCATOR_NAMES);
  }

  public static String educationAttainment() {

    return randomOption(EDUCATIONAL_ATTAINMENT);
  }

  public static String nationality() {

    return randomOption(NATIONALITY);
  }

  public static String secondarySchools() {

    return randomOption(SECONDARY_SCHOOLS);
  }

  public static String sicCode() {

    return randomOption(SIC_CODE);
  }

  public static String companyType() {

    return randomOption(COMPANY_TYPE);
  }

  public static String profession() {

    return randomOption(PROFESSION);
  }

  public static String job() {

    return randomOption(PRODUCTS);
  }

  public static String words() {

    return randomOption(WORDS);
  }

  public static String industry() {

    return randomOption(INDUSTRY);
  }

  public static String maritalStatus() {

    return randomOption(MARITAL_STATUS);
  }

  public static String fruit() {

    return randomOption(FRUITS);
  }

  public static String vegetable() {

    return randomOption(VEGETABLES);
  }

  public static String carBrand() {

    return randomOption(CAR_BRANDS);
  }

  public static String movieGenre() {

    return randomOption(MOVIE_GENRES);
  }

  public static String socialMediaPlatform() {

    return randomOption(SOCIAL_MEDIA_PLATFORMS);
  }

  public static String technologyCompany() {

    return randomOption(TECHNOLOGY_COMPANIES);
  }

  public static String country() {

    return randomOption(COUNTRIES);
  }

  public static String city() {

    return randomOption(CITIES);
  }

  public static String language() {

    return randomOption(LANGUAGES);
  }

  public static String sportsTeam() {

    return randomOption(SPORTS_TEAMS);
  }

  public static String bookGenre() {

    return randomOption(BOOK_GENRES);
  }

  public static String musicGenre() {

    return randomOption(MUSIC_GENRES);
  }

  public static String tvShow() {

    return randomOption(TV_SHOWS);
  }

  public static String celebrity() {

    return randomOption(CELEBRITIES);
  }

  public static String foodDish() {

    return randomOption(FOOD_DISHES);
  }

  public static String drink() {

    return randomOption(DRINKS);
  }

  public static String holiday() {

    return randomOption(HOLIDAYS);
  }

  public static String planet() {

    return randomOption(PLANETS);
  }

  public static String animalSpecies() {

    return randomOption(ANIMAL_SPECIES);
  }

  public static String plantSpecies() {

    return randomOption(PLANT_SPECIES);
  }

  public static String hotelName() {

    return randomOption(HOTEL_NAMES);
  }

  public static String airlineCompany() {

    return randomOption(AIRLINE_COMPANIES);
  }

  public static String airportCode() {

    return randomOption(AIRPORT_CODES);
  }

  public static String restaurantName() {

    return randomOption(RESTAURANT_NAMES);
  }

  public static String shoppingMall() {

    return randomOption(SHOPPING_MALLS);
  }

  public static String bankName() {

    return randomOption(BANK_NAMES);
  }

  public static String insuranceCompany() {

    return randomOption(INSURANCE_COMPANIES);
  }

  public static String hospitalName() {

    return randomOption(HOSPITAL_NAMES);
  }

  public static String universityCourse() {

    return randomOption(UNIVERSITY_COURSES);
  }

  public static String computerBrand() {

    return randomOption(COMPUTER_BRANDS);
  }

  public static String softwareApplication() {

    return randomOption(SOFTWARE_APPLICATIONS);
  }

  public static String clothingBrand() {

    return randomOption(CLOTHING_BRANDS);
  }

  public static String jewelryBrand() {

    return randomOption(JEWELRY_BRANDS);
  }

  public static String perfumeBrand() {

    return randomOption(PERFUME_BRANDS);
  }

  public static String cosmeticBrand() {

    return randomOption(COSMETIC_BRANDS);
  }

  public static String furnitureBrand() {

    return randomOption(FURNITURE_BRANDS);
  }

  public static String electronicsBrand() {

    return randomOption(ELECTRONICS_BRANDS);
  }

  public static String toyBrand() {

    return randomOption(TOY_BRANDS);
  }

  public static String bookAuthor() {

    return randomOption(BOOK_AUTHORS);
  }

  public static String movieDirector() {

    return randomOption(MOVIE_DIRECTORS);
  }

  public static String foodIngredient() {
    return randomOption(FOOD_INGREDIENTS);
  }

  public static String cookingMethod() {
    return randomOption(COOKING_METHODS);
  }

  public static String recipe() {
    return randomOption(RECIPES);
  }

  public static String kitchenAppliance() {
    return randomOption(KITCHEN_APPLIANCES);
  }

  public static String cookware() {
    return randomOption(COOKWARE);
  }

  public static String tableware() {
    return randomOption(TABLEWARE);
  }

  public static String beverage() {
    return randomOption(BEVERAGES);
  }

  public static String coffeeType() {
    return randomOption(COFFEE_TYPES);
  }

  public static String teaType() {
    return randomOption(TEA_TYPES);
  }

  public static String juiceFlavor() {
    return randomOption(JUICE_FLAVORS);
  }

  public static String smoothieIngredient() {
    return randomOption(SMOOTHIE_INGREDIENTS);
  }

  public static String bakeryItem() {
    return randomOption(BAKERY_ITEMS);
  }

  public static String dessert() {
    return randomOption(DESSERTS);
  }

  public static String snack() {
    return randomOption(SNACKS);
  }

  public static String condiment() {
    return randomOption(CONDIMENTS);
  }

  public static String spice() {
    return randomOption(SPICES);
  }

  public static String herb() {
    return randomOption(HERBS);
  }

  public static String sauce() {
    return randomOption(SAUCES);
  }

  public static String cheeseType() {
    return randomOption(CHEESE_TYPES);
  }

  public static String meatType() {
    return randomOption(MEAT_TYPES);
  }

  public static String seafoodType() {
    return randomOption(SEAFOOD_TYPES);
  }

  public static String pastaType() {
    return randomOption(PASTA_TYPES);
  }

  public static String riceType() {
    return randomOption(RICE_TYPES);
  }

  public static String breadType() {
    return randomOption(BREAD_TYPES);
  }

  public static String saladIngredient() {
    return randomOption(SALAD_INGREDIENTS);
  }

  public static String soupType() {
    return randomOption(SOUP_TYPES);
  }

  public static String pizzaTopping() {
    return randomOption(PIZZA_TOPPINGS);
  }

  public static String sandwichIngredient() {
    return randomOption(SANDWICH_INGREDIENTS);
  }

  public static String burgerTopping() {
    return randomOption(BURGER_TOPPINGS);
  }

  public static String tacoIngredient() {
    return randomOption(TACO_INGREDIENTS);
  }

  public static String sushiIngredient() {
    return randomOption(SUSHI_INGREDIENTS);
  }

  public static String curryType() {
    return randomOption(CURRY_TYPES);
  }

  public static String stewType() {
    return randomOption(STEW_TYPES);
  }

  public static String grillItem() {
    return randomOption(GRILL_ITEMS);
  }

  public static String barbecueItem() {
    return randomOption(BARBECUE_ITEMS);
  }

  public static String breakfastItem() {
    return randomOption(BREAKFAST_ITEMS);
  }

  public static String lunchItem() {
    return randomOption(LUNCH_ITEMS);
  }

  public static String dinnerItem() {
    return randomOption(DINNER_ITEMS);
  }

  public static String deliItem() {
    return randomOption(DELI_ITEMS);
  }

  public static String fastFoodItem() {
    return randomOption(FAST_FOOD_ITEMS);
  }

  public static String[] randomOptions(String[] options) {

    final int totalItemsToBeReturned = 3;
    String[] finalList = new String[totalItemsToBeReturned];

    for (int i = 0; i < totalItemsToBeReturned; i++) {
      finalList[i] = options[i];
    }

    return finalList;
  }

  public static String randomOption(String[] options) {

    int index = random.nextInt(options.length);
    return options[index];
  }
}