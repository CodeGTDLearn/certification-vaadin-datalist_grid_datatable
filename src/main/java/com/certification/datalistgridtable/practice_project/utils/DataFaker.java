package com.certification.datalistgridtable.practice_project.utils;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataFaker {

  private static final Random random = new Random();

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
       "Manx"
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


  public static final String[] DOG_IMAGE_URLS = {
       "https://images.unsplash.com/photo-1518791841217-8f162f1e1131",
       "https://images.unsplash.com/photo-1537151625747-768eb6cf92b2",
       "https://images.unsplash.com/photo-1552053831-71594a27632d",
       "https://images.unsplash.com/photo-1543466835-00a7907e9de1",
       "https://images.unsplash.com/photo-1517849845537-4d257902454a",
       "https://images.unsplash.com/photo-1558788353-f76d92427f16",
       "https://images.unsplash.com/photo-1561037404-61cd46aa615b",
       "https://images.unsplash.com/photo-1568572933382-74d440642117",
       "https://images.unsplash.com/photo-1583511655813-c66c0a234a1e",
       "https://images.unsplash.com/photo-1592194946308-fb1a62b0f48b",
       "https://images.unsplash.com/photo-1608848461952-0f624a650b8b",
       "https://images.unsplash.com/photo-1615751075525-55abb6a7b5c5",
       "https://images.unsplash.com/photo-1623387648306-f1d15e9f5b79",
       "https://images.unsplash.com/photo-1626154863299-f08532f1f390",
       "https://images.unsplash.com/photo-1633114128353-8f13e2b500b8"
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

  private static final String[] MARITAL_STATUS = {
       "Married",
       "Widowed",
       "Divorced",
       "Separated",
       "Never married"
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

  private static final String[] SECONDARY_SCHOOLS = {
       "High School",
       "Secondary College",
       "High"
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

  private static final String[] AIRLINE_COMPANIES = {
       "Air Canada",
       "Air France",
       "American Airlines",
       "British Airways",
       "Cathay Pacific",
       "Delta Air Lines",
       "Emirates",
       "Japan Airlines",
       "KLM",
       "Lufthansa",
       "Qantas",
       "Qatar Airways",
       "Singapore Airlines",
       "Southwest Airlines",
       "United Airlines"
  };

  private static final String[] AIRPORT_CODES = {
       "AMS",
       "ATL",
       "CDG",
       "CLT",
       "DFW",
       "DEN",
       "FRA",
       "HND",
       "JFK",
       "LAX",
       "LHR",
       "NRT",
       "ORD",
       "PEK",
       "SFO"
  };

  private static final String[] BAKERY_ITEMS = {
       "Bagel",
       "Baguette",
       "Brownie",
       "Cake",
       "Cookie",
       "Croissant",
       "Danish",
       "Donut",
       "Éclair",
       "Macaron",
       "Muffin",
       "Pie",
       "Scone",
       "Bread",
       "Cinnamon Roll"
  };

  private static final String[] BANK_NAMES = {
       "Bank of America",
       "Barclays",
       "BBVA",
       "BNP Paribas",
       "Citigroup",
       "Credit Suisse",
       "Deutsche Bank",
       "Goldman Sachs",
       "HSBC",
       "ING Group",
       "JPMorgan Chase",
       "Morgan Stanley",
       "Santander",
       "UBS",
       "Wells Fargo"
  };

  private static final String[] BARBECUE_ITEMS = {
       "BBQ Sauce",
       "Brisket",
       "Burger",
       "Chicken",
       "Coleslaw",
       "Corn on the Cob",
       "Fish",
       "Hot Dog",
       "Kebab",
       "Pulled Pork",
       "Ribs",
       "Sausage",
       "Shrimp",
       "Steak",
       "Vegetables"
  };

  private static final String[] BEVERAGES = {
       "Coconut Water",
       "Coffee",
       "Energy Drink",
       "Fruit Punch",
       "Hot Chocolate",
       "Iced Tea",
       "Juice",
       "Lemonade",
       "Milk",
       "Smoothie",
       "Soda",
       "Sparkling Water",
       "Sports Drink",
       "Tea",
       "Water"
  };

  private static final String[] BOOK_AUTHORS = {
       "Agatha Christie",
       "Charles Dickens",
       "Dan Brown",
       "Ernest Hemingway",
       "F. Scott Fitzgerald",
       "Gabriel García Márquez",
       "George Orwell",
       "Harper Lee",
       "J.K. Rowling",
       "J.R.R. Tolkien",
       "Jane Austen",
       "Leo Tolstoy",
       "Mark Twain",
       "Stephen King",
       "William Shakespeare"
  };

  private static final String[] BREAD_TYPES = {
       "Bagel",
       "Baguette",
       "Brioche Bread",
       "Challah Bread",
       "Ciabatta Bread",
       "English Muffin",
       "Focaccia Bread",
       "Naan Bread",
       "Pita Bread",
       "Pumpernickel Bread",
       "Rye Bread",
       "Sourdough Bread",
       "Tortilla",
       "Whole Grain Bread",
       "White Bread"
  };

  private static final String[] BREAKFAST_ITEMS = {
       "Bagel",
       "Bacon",
       "Cereal",
       "Coffee",
       "Eggs",
       "Fruit",
       "Juice",
       "Muffin",
       "Oatmeal",
       "Pancakes",
       "Sausage",
       "Tea",
       "Toast",
       "Waffles",
       "Yogurt"
  };

  private static final String[] BURGER_TOPPINGS = {
       "Avocado",
       "Bacon",
       "BBQ Sauce",
       "Cheese",
       "Fried Egg",
       "Jalapeños",
       "Ketchup",
       "Lettuce",
       "Mayonnaise",
       "Mushrooms",
       "Mustard",
       "Onion",
       "Pickles",
       "Relish",
       "Tomato"
  };

  private static final String[] CHEESE_TYPES = {
       "Blue Cheese",
       "Brie",
       "Camembert",
       "Cheddar",
       "Cottage Cheese",
       "Edam",
       "Feta",
       "Gouda",
       "Havarti",
       "Mozzarella",
       "Muenster",
       "Parmesan",
       "Provolone",
       "Ricotta",
       "Swiss Cheese"
  };

  private static final String[] CLOTHING_BRANDS = {
       "Adidas",
       "Chanel",
       "Dolce & Gabbana",
       "Gap",
       "Gucci",
       "H&M",
       "Levi's",
       "Louis Vuitton",
       "Nike",
       "Prada",
       "Puma",
       "Ralph Lauren",
       "Tommy Hilfiger",
       "Under Armour",
       "Uniqlo"
  };

  private static final String[] COFFEE_TYPES = {
       "Affogato",
       "Americano",
       "Café au Lait",
       "Café Bombón",
       "Café Cubano",
       "Café de Olla",
       "Café Cubano",
       "Cappuccino",
       "Cortado",
       "Espresso",
       "Flat White",
       "Irish Coffee",
       "Latte",
       "Macchiato",
       "Mocha"
  };

  private static final String[] COMPUTER_BRANDS = {
       "Acer",
       "Alienware",
       "Apple",
       "Asus",
       "Dell",
       "Fujitsu",
       "HP",
       "LG",
       "Lenovo",
       "Microsoft",
       "MSI",
       "Razer",
       "Samsung",
       "Sony",
       "Toshiba"
  };

  private static final String[] CONDIMENTS = {
       "BBQ Sauce",
       "Chutney",
       "Guacamole",
       "Hummus",
       "Hot Sauce",
       "Jam",
       "Jelly",
       "Ketchup",
       "Mayonnaise",
       "Mustard",
       "Pesto",
       "Relish",
       "Salsa",
       "Tahini",
       "Soy Sauce"
  };

  private static final String[] COOKING_METHODS = {
       "Baking",
       "Barbecuing",
       "Boiling",
       "Braising",
       "Broiling",
       "Frying",
       "Grilling",
       "Marinating",
       "Poaching",
       "Roasting",
       "Sautéing",
       "Simmering",
       "Smoking",
       "Steaming",
       "Stir-frying"
  };

  private static final String[] COOKWARE = {
       "Baking Sheets",
       "Cake Pans",
       "Casserole Dishes",
       "Colanders",
       "Dutch Ovens",
       "Griddles",
       "Muffin Tins",
       "Pans",
       "Pizza Stones",
       "Pots",
       "Roasting Pans",
       "Skillets",
       "Saucepans",
       "Steamers",
       "Woks"
  };

  private static final String[] COSMETIC_BRANDS = {
       "Bobbi Brown",
       "Chanel",
       "Clarins",
       "Clinique",
       "Dior",
       "Estée Lauder",
       "Guerlain",
       "La Mer",
       "L'Oréal",
       "Lancôme",
       "MAC",
       "Maybelline",
       "NARS",
       "Revlon",
       "Shiseido"
  };

  private static final String[] CURRY_TYPES = {
       "Beef Curry",
       "Biryani Curry",
       "Butter Chicken Curry",
       "Chicken Curry",
       "Jalfrezi Curry",
       "Korma Curry",
       "Madras Curry",
       "Massaman Curry",
       "Panang Curry",
       "Rogan Josh Curry",
       "Thai Green Curry",
       "Thai Red Curry",
       "Tikka Masala Curry",
       "Vegetable Curry",
       "Vindaloo Curry"
  };

  public static final String[] CURRENCIES = {
       "USD",
       "EUR",
       "GBP",
       "JPY",
       "AUD",
       "CAD",
       "CHF",
       "CNY",
       "SEK",
       "NZD",
       "BRL",
       "INR",
       "RUB",
       "MXN",
       "SGD"
  };

  private static final String[] DELI_ITEMS = {
       "Bologna",
       "Cheese",
       "Ham",
       "Lettuce",
       "Mayonnaise",
       "Mustard",
       "Onion",
       "Pastrami",
       "Pickles",
       "Roast Beef",
       "Salami",
       "Sandwich",
       "Tomato",
       "Turkey",
       "Wrap"
  };

  private static final String[] DESSERTS = {
       "Apple Pie",
       "Brownie",
       "Cheesecake",
       "Chocolate Cake",
       "Crème Brûlée",
       "Éclair",
       "Fruit Salad",
       "Ice Cream",
       "Macaron",
       "Mousse",
       "Parfait",
       "Panna Cotta",
       "Sorbet",
       "Tiramisu",
       "Trifle"
  };

  private static final String[] DINNER_ITEMS = {
       "Burger",
       "Chicken",
       "Curry",
       "Fish",
       "Grilled Items",
       "Pasta",
       "Pizza",
       "Rice",
       "Salad",
       "Soup",
       "Steak",
       "Stew",
       "Sushi",
       "Taco",
       "Vegetables"
  };

  private static final String[] ELECTRONICS_BRANDS = {
       "Beats",
       "Bose",
       "Braun",
       "Dyson",
       "Hitachi",
       "JBL",
       "LG",
       "Panasonic",
       "Philips",
       "Samsung",
       "Sennheiser",
       "Sharp",
       "Sonos",
       "Sony",
       "Toshiba"
  };

  private static final String[] FAST_FOOD_ITEMS = {
       "Burger",
       "Chicken Nuggets",
       "Chicken Wings",
       "Fried Chicken",
       "Fries",
       "Hot Dog",
       "Mozzarella Sticks",
       "Nachos",
       "Onion Rings",
       "Pizza",
       "Salad",
       "Sandwich",
       "Soda",
       "Taco",
       "Wrap"
  };

  private static final String[] FOOD_INGREDIENTS = {
       "Beef",
       "Butter",
       "Carrots",
       "Cheese",
       "Chicken",
       "Eggs",
       "Flour",
       "Garlic",
       "Milk",
       "Olive Oil",
       "Onions",
       "Potatoes",
       "Salt",
       "Sugar",
       "Tomatoes"
  };

  private static final String[] FURNITURE_BRANDS = {
       "Ashley Furniture",
       "Bassett Furniture",
       "Crate & Barrel",
       "Ethan Allen",
       "Herman Miller",
       "IKEA",
       "Knoll",
       "La-Z-Boy",
       "Pottery Barn",
       "Raymour & Flanigan",
       "Restoration Hardware",
       "Rooms To Go",
       "Steelcase",
       "Wayfair",
       "West Elm"
  };

  private static final String[] GRILL_ITEMS = {
       "Burger",
       "Chicken",
       "Corn on the Cob",
       "Fish",
       "Grilled Cheese",
       "Grilled Sandwich",
       "Hot Dog",
       "Kebab",
       "Pizza",
       "Quesadilla",
       "Ribs",
       "Shrimp",
       "Steak",
       "Vegetables",
       "Sausage"
  };

  private static final String[] HERBS = {
       "Basil",
       "Bay Leaf",
       "Chives",
       "Cilantro",
       "Dill",
       "Lavender",
       "Lemon Balm",
       "Marjoram",
       "Mint",
       "Oregano",
       "Parsley",
       "Rosemary",
       "Sage",
       "Tarragon",
       "Thyme"
  };

  private static final String[] HOSPITAL_NAMES = {
       "Brigham and Women's Hospital",
       "Cedars-Sinai Medical Center",
       "Cleveland Clinic",
       "Duke University Hospital",
       "Houston Methodist Hospital",
       "Johns Hopkins Hospital",
       "Massachusetts General Hospital",
       "Mayo Clinic",
       "Mount Sinai Hospital",
       "NewYork-Presbyterian Hospital",
       "Northwestern Memorial Hospital",
       "Stanford Health Care",
       "UPMC Presbyterian Shadyside",
       "UCLA Medical Center",
       "University of Michigan Hospitals"
  };

  private static final String[] INSURANCE_COMPANIES = {
       "AIA Group",
       "Allianz",
       "Assicurazioni Generali",
       "AXA",
       "China Life Insurance",
       "General Insurance",
       "Legal & General",
       "Manulife",
       "MetLife",
       "Munich Re",
       "Nippon Life Insurance",
       "Ping An Insurance",
       "Prudential Financial",
       "Prudential plc",
       "Zurich Insurance Group"
  };

  private static final String[] JEWELRY_BRANDS = {
       "Alex and Ani",
       "Bvlgari",
       "Bulgari",
       "Cartier",
       "Chopard",
       "David Yurman",
       "Graff",
       "Harry Winston",
       "Kay Jewelers",
       "Mikimoto",
       "Pandora",
       "Piaget",
       "Swarovski",
       "Tiffany & Co.",
       "Van Cleef & Arpels"
  };

  private static final String[] JUICE_FLAVORS = {
       "Apple Juice",
       "Beet Juice",
       "Carrot Juice",
       "Coconut Juice",
       "Cranberry Juice",
       "Grape Juice",
       "Grapefruit Juice",
       "Lemon Juice",
       "Lime Juice",
       "Mango Juice",
       "Orange Juice",
       "Pineapple Juice",
       "Pomegranate Juice",
       "Tomato Juice",
       "Watermelon Juice"
  };

  private static final String[] KITCHEN_APPLIANCES = {
       "Air Fryer",
       "Blender",
       "Coffee Maker",
       "Dishwasher",
       "Food Processor",
       "Juicer",
       "Microwave",
       "Mixer",
       "Oven",
       "Refrigerator",
       "Rice Cooker",
       "Slow Cooker",
       "Stove",
       "Toaster",
       "Waffle Maker"
  };

  private static final String[] LUNCH_ITEMS = {
       "Burger",
       "Chicken",
       "Fish",
       "Fruit",
       "Pasta",
       "Pizza",
       "Quesadilla",
       "Rice",
       "Salad",
       "Sandwich",
       "Soup",
       "Sushi",
       "Taco",
       "Vegetables",
       "Wrap"
  };

  private static final String[] MEAT_TYPES = {
       "Beef",
       "Bison",
       "Buffalo",
       "Chicken",
       "Duck",
       "Goat",
       "Kangaroo",
       "Lamb",
       "Mutton",
       "Ostrich",
       "Pork",
       "Rabbit",
       "Turkey",
       "Veal",
       "Venison"
  };

  private static final String[] MOVIE_DIRECTORS = {
       "Alfred Hitchcock",
       "Christopher Nolan",
       "David Fincher",
       "Francis Ford Coppola",
       "George Lucas",
       "Guillermo del Toro",
       "James Cameron",
       "Martin Scorsese",
       "Peter Jackson",
       "Quentin Tarantino",
       "Ridley Scott",
       "Steven Spielberg",
       "Tim Burton",
       "Wes Anderson",
       "Stanley Kubrick"
  };

  private static final String[] PASTA_TYPES = {
       "Angel Hair",
       "Couscous",
       "Fettuccine",
       "Fusilli",
       "Gnocchi",
       "Lasagna",
       "Linguine",
       "Macaroni",
       "Orzo",
       "Penne",
       "Ravioli",
       "Rigatoni",
       "Rotini",
       "Spaghetti",
       "Tortellini"
  };

  private static final String[] PERFUME_BRANDS = {
       "Burberry",
       "Calvin Klein",
       "Chanel",
       "Dior",
       "Dolce & Gabbana",
       "Giorgio Armani",
       "Gucci",
       "Hugo Boss",
       "Jo Malone",
       "Marc Jacobs",
       "Prada",
       "Ralph Lauren",
       "Tom Ford",
       "Versace",
       "Yves Saint Laurent"
  };

  private static final String[] PIZZA_TOPPINGS = {
       "Anchovies",
       "Bacon",
       "Black Olives",
       "Extra Cheese",
       "Garlic",
       "Green Peppers",
       "Ham",
       "Jalapeños",
       "Mushrooms",
       "Onions",
       "Pepperoni",
       "Pineapple",
       "Sausage",
       "Spinach",
       "Tomatoes"
  };

  private static final String[] RECIPES = {
       "Apple Pie",
       "Burger with Fries",
       "Chicken Curry",
       "Chicken Soup",
       "Chocolate Cake",
       "Fried Rice",
       "Lasagna",
       "Omelette",
       "Pancakes",
       "Pizza Margherita",
       "Spaghetti Bolognese",
       "Sushi Rolls",
       "Tacos Al Pastor",
       "Vegetable Stir-fry",
       "Beef Stroganoff"
  };

  private static final String[] RESTAURANT_NAMES = {
       "Arby's",
       "Burger King",
       "Chick-fil-A",
       "Chipotle",
       "Dunkin'",
       "Domino's",
       "KFC",
       "McDonald's",
       "Panera Bread",
       "Papa John's",
       "Pizza Hut",
       "Starbucks",
       "Subway",
       "Taco Bell",
       "Wendy's"
  };

  private static final String[] RICE_TYPES = {
       "Arborio Rice",
       "Basmati Rice",
       "Black Rice",
       "Brown Rice",
       "Instant Rice",
       "Jasmine Rice",
       "Long Grain Rice",
       "Medium Grain Rice",
       "Parboiled Rice",
       "Red Rice",
       "Short Grain Rice",
       "Sushi Rice",
       "Sticky Rice",
       "Wild Rice",
       "White Rice"
  };

  private static final String[] SALAD_INGREDIENTS = {
       "Avocado",
       "Bacon",
       "Bell Pepper",
       "Carrot",
       "Chicken",
       "Croutons",
       "Cucumber",
       "Feta Cheese",
       "Kale",
       "Lettuce",
       "Olives",
       "Onion",
       "Spinach",
       "Tomato",
       "Arugula"
  };

  private static final String[] SANDWICH_INGREDIENTS = {
       "Bologna",
       "Cheese",
       "Chicken",
       "Cucumber",
       "Egg",
       "Ham",
       "Lettuce",
       "Mayonnaise",
       "Onion",
       "Pickles",
       "Roast Beef",
       "Salami",
       "Tomato",
       "Tuna",
       "Turkey"
  };

  private static final String[] SAUCES = {
       "Alfredo Sauce",
       "Béarnaise Sauce",
       "Béchamel Sauce",
       "BBQ Sauce",
       "Curry Sauce",
       "Hollandaise Sauce",
       "Hoisin Sauce",
       "Hot Sauce",
       "Marinara Sauce",
       "Peanut Sauce",
       "Pesto Sauce",
       "Soy Sauce",
       "Tahini Sauce",
       "Teriyaki Sauce",
       "Tomato Sauce"
  };

  private static final String[] SEAFOOD_TYPES = {
       "Anchovy",
       "Crab",
       "Cod",
       "Halibut",
       "Herring",
       "Lobster",
       "Mackerel",
       "Mussel",
       "Oyster",
       "Salmon",
       "Sardine",
       "Scallop",
       "Shrimp",
       "Swordfish",
       "Tuna"
  };

  private static final String[] SHOPPING_MALLS = {
       "Brookfield Properties",
       "CapitaLand",
       "Dubai Mall",
       "GGP",
       "Intu Properties",
       "Klépierre",
       "Macquarie Centre",
       "Mall of America",
       "Scentre Group",
       "Simon Property Group",
       "Taubman Centers",
       "Unibail-Rodamco",
       "West Edmonton Mall",
       "Westfield",
       "Westfield London"
  };

  private static final String[] SMOOTHIE_INGREDIENTS = {
       "Banana",
       "Strawberry",
       "Blueberry",
       "Spinach",
       "Almond Milk",
       "Yogurt",
       "Honey",
       "Chia Seeds",
       "Mango",
       "Pineapple",
       "Coconut Water",
       "Protein Powder",
       "Kale",
       "Apple",
       "Orange"
  };

  private static final String[] SNACKS = {
       "Beef Jerky",
       "Cheese Puffs",
       "Chips",
       "Crackers",
       "Fruit Snacks",
       "Granola Bars",
       "Guacamole",
       "Hummus",
       "Nuts",
       "Popcorn",
       "Pretzels",
       "Rice Cakes",
       "Salsa",
       "Trail Mix",
       "Yogurt"
  };

  private static final String[] SOFTWARE_APPLICATIONS = {
       "Adobe Creative Suite",
       "Asana",
       "Box",
       "Confluence",
       "Dropbox",
       "Evernote",
       "Google Drive",
       "Google Workspace",
       "Jira",
       "Microsoft Office",
       "Notion",
       "OneDrive",
       "Slack",
       "Trello",
       "Zoom"
  };

  private static final String[] SOUP_TYPES = {
       "Beef Soup",
       "Chicken Soup",
       "Clam Chowder",
       "Cream of Asparagus Soup",
       "Cream of Broccoli Soup",
       "Cream of Chicken Soup",
       "Cream of Mushroom Soup",
       "Cream of Tomato Soup",
       "French Onion Soup",
       "Lentil Soup",
       "Minestrone Soup",
       "Miso Soup",
       "Potato Soup",
       "Tomato Soup",
       "Vegetable Soup"
  };

  private static final String[] SPICES = {
       "Basil",
       "Bay Leaf",
       "Cayenne Pepper",
       "Chili Powder",
       "Cinnamon",
       "Cumin",
       "Garlic Powder",
       "Ginger",
       "Nutmeg",
       "Onion Powder",
       "Oregano",
       "Paprika",
       "Pepper",
       "Salt",
       "Thyme"
  };

  private static final String[] STEW_TYPES = {
       "Beef Stew",
       "Bouillabaisse Stew",
       "Brunswick Stew",
       "Chicken Stew",
       "Chili Stew",
       "Cioppino Stew",
       "Goulash Stew",
       "Irish Stew",
       "Jambalaya Stew",
       "Lamb Stew",
       "Paella Stew",
       "Ratatouille Stew",
       "Tagine Stew",
       "Vegetable Stew",
       "Cassoulet Stew"
  };

  private static final String[] SUSHI_INGREDIENTS = {
       "Avocado",
       "Cream Cheese",
       "Crab",
       "Cucumber",
       "Eel",
       "Ginger",
       "Nori",
       "Rice",
       "Salmon",
       "Sesame Seeds",
       "Shrimp",
       "Soy Sauce",
       "Tempura Flakes",
       "Tuna",
       "Wasabi"
  };

  private static final String[] TACO_INGREDIENTS = {
       "Avocado",
       "Beef",
       "Cheese",
       "Chicken",
       "Cilantro",
       "Fish",
       "Guacamole",
       "Lettuce",
       "Lime",
       "Onion",
       "Pork",
       "Salsa",
       "Shrimp",
       "Sour Cream",
       "Tomato"
  };

  private static final String[] TABLEWARE = {
       "Bowls",
       "Chopsticks",
       "Cups",
       "Cutting Boards",
       "Forks",
       "Glasses",
       "Knives",
       "Ladles",
       "Measuring Cups",
       "Measuring Spoons",
       "Mixing Bowls",
       "Plates",
       "Serving Spoons",
       "Spoons",
       "Tongs"
  };

  private static final String[] TEA_TYPES = {
       "Assam Tea",
       "Black Tea",
       "Chai Tea",
       "Chamomile Tea",
       "Darjeeling Tea",
       "Earl Grey Tea",
       "Ginger Tea",
       "Green Tea",
       "Herbal Tea",
       "Matcha Tea",
       "Oolong Tea",
       "Peppermint Tea",
       "Pu-erh Tea",
       "Rooibos Tea",
       "White Tea"
  };

  private static final String[] TOY_BRANDS = {
       "Barbie",
       "Fisher-Price",
       "Hasbro",
       "Hot Wheels",
       "L.O.L. Surprise!",
       "Lego",
       "Mattel",
       "Monster High",
       "My Little Pony",
       "Nerf",
       "PAW Patrol",
       "Peppa Pig",
       "Playmobil",
       "Thomas & Friends",
       "Transformers"
  };

  private static final String[] UNIVERSITY_COURSES = {
       "Anthropology",
       "Biology",
       "Business Administration",
       "Chemistry",
       "Computer Science",
       "Economics",
       "Engineering",
       "History",
       "Law",
       "Mathematics",
       "Medicine",
       "Philosophy",
       "Physics",
       "Psychology",
       "Sociology"
  };


  public static String address() {

    return randomOption(ADDRESS);
  }

  public static String airlineCompany() {

    return randomOption(AIRLINE_COMPANIES);
  }

  public static String airportCode() {

    return randomOption(AIRPORT_CODES);
  }

  public static String animal() {

    return randomOption(ANIMAL);
  }

  public static String artist() {

    return randomOption(EN_ARTIST_NAMES);
  }

  public static String bakeryItem() {

    return randomOption(BAKERY_ITEMS);
  }

  public static String bankName() {

    return randomOption(BANK_NAMES);
  }

  public static String barbecueItem() {

    return randomOption(BARBECUE_ITEMS);
  }

  public static String barcode() {

    return randomOption(BARCODE);
  }

  public static String beer() {

    return randomOption(BEER);
  }

  public static String beverage() {

    return randomOption(BEVERAGES);
  }

  public static String book() {

    return randomOption(BOOK_TITLES);
  }

  public static String bookAuthor() {

    return randomOption(BOOK_AUTHORS);
  }

  public static String bookGenre() {

    return randomOption(BOOK_GENRES);
  }

  public static String breakfastItem() {

    return randomOption(BREAKFAST_ITEMS);
  }

  public static String burgerTopping() {

    return randomOption(BURGER_TOPPINGS);
  }

  public static String business() {

    return randomOption(BUSINESS_COMPANIES);
  }

  public static String buzzwords() {

    return randomOption(BUZZWORDS);
  }

  public static String carBrand() {

    return randomOption(CAR_BRANDS);
  }

  public static String catBreed() {

    return randomOption(CAT_BREED);
  }

  public static String catName() {

    return randomOption(CAT_NAMES);
  }

  public static String celebrity() {

    return randomOption(CELEBRITIES);
  }

  public static String cheeseType() {

    return randomOption(CHEESE_TYPES);
  }

  public static String city() {

    return randomOption(CITIES);
  }

  public static String clothingBrand() {

    return randomOption(CLOTHING_BRANDS);
  }

  public static String coffeeType() {

    return randomOption(COFFEE_TYPES);
  }

  public static String color() {

    return randomOption(COLOR_NAMES);
  }

  public static String companyType() {

    return randomOption(COMPANY_TYPE);
  }

  public static String computerBrand() {

    return randomOption(COMPUTER_BRANDS);
  }

  public static String condiment() {

    return randomOption(CONDIMENTS);
  }

  public static String cookingMethod() {

    return randomOption(COOKING_METHODS);
  }

  public static String cookware() {

    return randomOption(COOKWARE);
  }

  public static String cosmeticBrand() {

    return randomOption(COSMETIC_BRANDS);
  }

  public static String country() {

    return randomOption(COUNTRIES);
  }

  public static String creditCardNumer() {

    return randomOption(CREDIT_CARD_NUMBERS);
  }

  public static String currency() {

    return randomOption(CURRENCIES);
  }

  public static String curryType() {

    return randomOption(CURRY_TYPES);
  }

  public static String date() {

    int year = random.nextInt(100) + 2000;
    int month = random.nextInt(12) + 1;
    int day = random.nextInt(31) + 1;
    LocalDate randomDate = LocalDate.of(year, month, day);
    return randomDate.toString();
  }

  public static String degree() {

    return randomOption(DEGREE_SUBJECTS);
  }

  public static String deliItem() {

    return randomOption(DELI_ITEMS);
  }

  public static String departments() {

    return randomOption(DEPARTMENTS);
  }

  public static String dessert() {

    return randomOption(DESSERTS);
  }

  public static String dinnerItem() {

    return randomOption(DINNER_ITEMS);
  }

  public static String disease() {

    return randomOption(DISEASE);
  }

  public static String dogBreed() {

    return randomOption(DOG_BREED);
  }

  public static String dogName() {

    return randomOption(DOG_NAMES);
  }

  public static String imageDog() {

    return randomOption(DOG_IMAGE_URLS);
  }

  public static String drink() {

    return randomOption(DRINKS);
  }

  public static String educator() {

    return randomOption(EDUCATOR_NAMES);
  }

  public static String educationAttainment() {

    return randomOption(EDUCATIONAL_ATTAINMENT);
  }

  public static String electronicsBrand() {

    return randomOption(ELECTRONICS_BRANDS);
  }

  public static String famousLastWords() {

    return randomOption(FAMOUS_LAST_WORDS);
  }

  public static String fastFoodItem() {

    return randomOption(FAST_FOOD_ITEMS);
  }

  public static String fileExtensions() {

    return randomOption(FILE_EXTENSIONS);
  }

  public static String firstName() {

    return randomOption(FIRST_NAME);
  }

  public static String foodDish() {

    return randomOption(FOOD_DISHES);
  }

  public static String foodIngredient() {

    return randomOption(FOOD_INGREDIENTS);
  }

  public static String fruit() {

    return randomOption(FRUITS);
  }

  public static String fullName() {

    return randomOption(FIRST_NAME)
         .concat(" ")
         .concat(lastName());
  }

  public static String furnitureBrand() {

    return randomOption(FURNITURE_BRANDS);
  }

  public static String gender() {

    return randomOption(GENDER);
  }

  public static String grillItem() {

    return randomOption(GRILL_ITEMS);
  }

  public static String herb() {

    return randomOption(HERBS);
  }

  public static String hobby() {

    return randomOption(HOBBY);
  }

  public static String holiday() {

    return randomOption(HOLIDAYS);
  }

  public static String hollywoodActorActress() {

    return randomOption(HOLLYWOOD_ACTOR_ACTRESS);
  }

  public static String hospitalName() {

    return randomOption(HOSPITAL_NAMES);
  }

  public static String hotelName() {

    return randomOption(HOTEL_NAMES);
  }

  public static String industry() {

    return randomOption(INDUSTRY);
  }

  public static String insuranceCompany() {

    return randomOption(INSURANCE_COMPANIES);
  }

  public static String jewelryBrand() {

    return randomOption(JEWELRY_BRANDS);
  }

  public static String job() {

    return randomOption(PRODUCTS);
  }

  public static String jobOptions() {

    return randomOption(JOBS);
  }

  public static String juiceFlavor() {

    return randomOption(JUICE_FLAVORS);
  }

  public static String kitchenAppliance() {

    return randomOption(KITCHEN_APPLIANCES);
  }

  public static String language() {

    return randomOption(LANGUAGES);
  }

  public static String lastName() {

    return randomOption(LAST_NAME);
  }

  public static String lunchItem() {

    return randomOption(LUNCH_ITEMS);
  }

  public static String maritalStatus() {

    return randomOption(MARITAL_STATUS);
  }

  public static String materials() {

    return randomOption(MATERIALS);
  }

  public static String meatType() {

    return randomOption(MEAT_TYPES);
  }

  public static String movieDirector() {

    return randomOption(MOVIE_DIRECTORS);
  }

  public static String movieGenre() {

    return randomOption(MOVIE_GENRES);
  }

  public static String music() {

    return randomOption(MUSIC_STYLES);
  }

  public static String musicGenre() {

    return randomOption(MUSIC_GENRES);
  }

  public static String nation() {

    return randomOption(NATION);
  }

  public static String nationality() {

    return randomOption(NATIONALITY);
  }

  public static String nouns() {

    return randomOption(NOUNS);
  }

  public static String number() {

    return randomOption(NUMBER_WRITTENS);
  }

  public static String numberWrittens() {

    return randomOption(NUMBER_WRITTENS);
  }

  public static String pastaType() {

    return randomOption(PASTA_TYPES);
  }

  public static String perfumeBrand() {

    return randomOption(PERFUME_BRANDS);
  }

  public static String phoneNumber() {

    return randomOption(PHONE_NUMBER);
  }

  public static String pizzaTopping() {

    return randomOption(PIZZA_TOPPINGS);
  }

  public static String planet() {

    return randomOption(PLANETS);
  }

  public static String plantSpecies() {

    return randomOption(PLANT_SPECIES);
  }

  public static String postalCode() {

    return randomOption(POSTAL_CODE);
  }

  public static String profession() {

    return randomOption(PROFESSION);
  }

  public static String programmingLanguage() {

    return randomOption(PROGRAMMING_LANGUAGE);
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

  public static String recipe() {

    return randomOption(RECIPES);
  }

  public static String restaurantName() {

    return randomOption(RESTAURANT_NAMES);
  }

  public static String riceType() {

    return randomOption(RICE_TYPES);
  }

  public static String saladIngredient() {

    return randomOption(SALAD_INGREDIENTS);
  }

  public static String sandwichIngredient() {

    return randomOption(SANDWICH_INGREDIENTS);
  }

  public static String sauce() {

    return randomOption(SAUCES);
  }

  public static String seafoodType() {

    return randomOption(SEAFOOD_TYPES);
  }

  public static String secondarySchools() {

    return randomOption(SECONDARY_SCHOOLS);
  }

  public static String shoppingMall() {

    return randomOption(SHOPPING_MALLS);
  }

  public static String sicCode() {

    return randomOption(SIC_CODE);
  }

  public static String sinId() {

    return randomOption(ASIN);
  }

  public static String sinNumber() {

    return randomOption(SIN_NUMBERS);
  }

  public static String smoothieIngredient() {

    return randomOption(SMOOTHIE_INGREDIENTS);
  }

  public static String snack() {

    return randomOption(SNACKS);
  }

  public static String socialMediaPlatform() {

    return randomOption(SOCIAL_MEDIA_PLATFORMS);
  }

  public static String softwareApplication() {

    return randomOption(SOFTWARE_APPLICATIONS);
  }

  public static String soupType() {

    return randomOption(SOUP_TYPES);
  }

  public static String spice() {

    return randomOption(SPICES);
  }

  public static String sport() {

    return randomOption(SPORT);
  }

  public static String sportsTeam() {

    return randomOption(SPORTS_TEAMS);
  }

  public static String stewType() {

    return randomOption(STEW_TYPES);
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

  public static String superHero() {

    return randomOption(SUPER_HERO);
  }

  public static String sushiIngredient() {

    return randomOption(SUSHI_INGREDIENTS);
  }

  public static String tableware() {

    return randomOption(TABLEWARE);
  }

  public static String tacoIngredient() {

    return randomOption(TACO_INGREDIENTS);
  }

  public static String team() {

    return randomOption(TEAM_NAMES);
  }

  public static String teaType() {

    return randomOption(TEA_TYPES);
  }

  public static String technologyCompany() {

    return randomOption(TECHNOLOGY_COMPANIES);
  }

  public static String time() {

    int hour = random.nextInt(24);
    int minute = random.nextInt(60);
    int second = random.nextInt(60);

    LocalTime randomTime = LocalTime.of(hour, minute, second);
    return randomTime.toString();
  }

  public static String toyBrand() {

    return randomOption(TOY_BRANDS);
  }

  public static String tvShow() {

    return randomOption(TV_SHOWS);
  }

  public static String university() {

    return randomOption(UNIVERSITY_NAMES);
  }

  public static String universityCourse() {

    return randomOption(UNIVERSITY_COURSES);
  }

  public static String vegetable() {

    return randomOption(VEGETABLES);
  }

  public static String verbs() {

    return randomOption(VERBS);
  }

  public static String weather() {

    return randomOption(WEATHER);
  }

  public static String words() {

    return randomOption(WORDS);
  }

  // ------------------------------------------------------------------- //
  //                            Image AREA
  // ------------------------------------------------------------------- //
  public static final String[] CAT_IMAGE_URLS = {
       "https://images.unsplash.com/photo-1518791841217-8f162f1e1131",
       "https://images.unsplash.com/photo-1537151625747-768eb6cf92b2",
       "https://images.unsplash.com/photo-1552053831-71594a27632d",
       "https://images.unsplash.com/photo-1543466835-00a7907e9de1",
       "https://images.unsplash.com/photo-1517849845537-4d257902454a",
       "https://images.unsplash.com/photo-1558788353-f76d92427f16",
       "https://images.unsplash.com/photo-1561037404-61cd46aa615b",
       "https://images.unsplash.com/photo-1568572933382-74d440642117",
       "https://images.unsplash.com/photo-1583511655813-c66c0a234a1e",
       "https://images.unsplash.com/photo-1592194946308-fb1a62b0f48b"
  };

  public static final String[] BIRD_IMAGE_URLS = {
       "https://images.unsplash.com/photo-1518791841217-8f162f1e1131",
       "https://images.unsplash.com/photo-1537151625747-768eb6cf92b2",
       "https://images.unsplash.com/photo-1552053831-71594a27632d",
       "https://images.unsplash.com/photo-1543466835-00a7907e9de1",
       "https://images.unsplash.com/photo-1517849845537-4d257902454a",
       "https://images.unsplash.com/photo-1558788353-f76d92427f16",
       "https://images.unsplash.com/photo-1561037404-61cd46aa615b",
       "https://images.unsplash.com/photo-1568572933382-74d440642117",
       "https://images.unsplash.com/photo-1583511655813-c66c0a234a1e",
       "https://images.unsplash.com/photo-1592194946308-fb1a62b0f48b"
  };

  public static final String[] ZOO_ANIMAL_IMAGE_URLS = {
       "https://images.unsplash.com/photo-1518791841217-8f162f1e1131",
       "https://images.unsplash.com/photo-1537151625747-768eb6cf92b2",
       "https://images.unsplash.com/photo-1552053831-71594a27632d",
       "https://images.unsplash.com/photo-1543466835-00a7907e9de1",
       "https://images.unsplash.com/photo-1517849845537-4d257902454a",
       "https://images.unsplash.com/photo-1558788353-f76d92427f16",
       "https://images.unsplash.com/photo-1561037404-61cd46aa615b",
       "https://images.unsplash.com/photo-1568572933382-74d440642117",
       "https://images.unsplash.com/photo-1583511655813-c66c0a234a1e",
       "https://images.unsplash.com/photo-1592194946308-fb1a62b0f48b"
  };

  public static final String[] AIRPLANE_IMAGE_URLS = {
       "https://images.unsplash.com/photo-1518791841217-8f162f1e1131",
       "https://images.unsplash.com/photo-1537151625747-768eb6cf92b2",
       "https://images.unsplash.com/photo-1552053831-71594a27632d",
       "https://images.unsplash.com/photo-1543466835-00a7907e9de1",
       "https://images.unsplash.com/photo-1517849845537-4d257902454a",
       "https://images.unsplash.com/photo-1558788353-f76d92427f16",
       "https://images.unsplash.com/photo-1561037404-61cd46aa615b",
       "https://images.unsplash.com/photo-1568572933382-74d440642117",
       "https://images.unsplash.com/photo-1583511655813-c66c0a234a1e",
       "https://images.unsplash.com/photo-1592194946308-fb1a62b0f48b"
  };

  public static final String[] BAKERY_ITEM_IMAGE_URLS = {
       "https://images.unsplash.com/photo-1518791841217-8f162f1e1131",
       "https://images.unsplash.com/photo-1537151625747-768eb6cf92b2",
       "https://images.unsplash.com/photo-1552053831-71594a27632d",
       "https://images.unsplash.com/photo-1543466835-00a7907e9de1",
       "https://images.unsplash.com/photo-1517849845537-4d257902454a",
       "https://images.unsplash.com/photo-1558788353-f76d92427f16",
       "https://images.unsplash.com/photo-1561037404-61cd46aa615b",
       "https://images.unsplash.com/photo-1568572933382-74d440642117",
       "https://images.unsplash.com/photo-1583511655813-c66c0a234a1e",
       "https://images.unsplash.com/photo-1592194946308-fb1a62b0f48b"
  };

  public static final String[] BREAKFAST_ITEM_IMAGE_URLS = {
       "https://images.unsplash.com/photo-1518791841217-8f162f1e1131",
       "https://images.unsplash.com/photo-1537151625747-768eb6cf92b2",
       "https://images.unsplash.com/photo-1552053831-71594a27632d",
       "https://images.unsplash.com/photo-1543466835-00a7907e9de1",
       "https://images.unsplash.com/photo-1517849845537-4d257902454a",
       "https://images.unsplash.com/photo-1558788353-f76d92427f16",
       "https://images.unsplash.com/photo-1561037404-61cd46aa615b",
       "https://images.unsplash.com/photo-1568572933382-74d440642117",
       "https://images.unsplash.com/photo-1583511655813-c66c0a234a1e",
       "https://images.unsplash.com/photo-1592194946308-fb1a62b0f48b"
  };

  public static final String[] CAR_IMAGE_URLS = {
       "https://images.unsplash.com/photo-1518791841217-8f162f1e1131",
       "https://images.unsplash.com/photo-1537151625747-768eb6cf92b2",
       "https://images.unsplash.com/photo-1552053831-71594a27632d",
       "https://images.unsplash.com/photo-1543466835-00a7907e9de1",
       "https://images.unsplash.com/photo-1517849845537-4d257902454a",
       "https://images.unsplash.com/photo-1558788353-f76d92427f16",
       "https://images.unsplash.com/photo-1561037404-61cd46aa615b",
       "https://images.unsplash.com/photo-1568572933382-74d440642117",
       "https://images.unsplash.com/photo-1583511655813-c66c0a234a1e",
       "https://images.unsplash.com/photo-1592194946308-fb1a62b0f48b"
  };

  public static final String[] MOTORCYCLE_IMAGE_URLS = {
       "https://images.unsplash.com/photo-1518791841217-8f162f1e1131",
       "https://images.unsplash.com/photo-1537151625747-768eb6cf92b2",
       "https://images.unsplash.com/photo-1552053831-71594a27632d",
       "https://images.unsplash.com/photo-1543466835-00a7907e9de1",
       "https://images.unsplash.com/photo-1517849845537-4d257902454a",
       "https://images.unsplash.com/photo-1558788353-f76d92427f16",
       "https://images.unsplash.com/photo-1561037404-61cd46aa615b",
       "https://images.unsplash.com/photo-1568572933382-74d440642117",
       "https://images.unsplash.com/photo-1583511655813-c66c0a234a1e",
       "https://images.unsplash.com/photo-1592194946308-fb1a62b0f48b"
  };

  public static final String[] FLAG_COUNTRY_IMAGE_URLS = {
       "https://images.unsplash.com/photo-1518791841217-8f162f1e1131",
       "https://images.unsplash.com/photo-1537151625747-768eb6cf92b2",
       "https://images.unsplash.com/photo-1552053831-71594a27632d",
       "https://images.unsplash.com/photo-1543466835-00a7907e9de1",
       "https://images.unsplash.com/photo-1517849845537-4d257902454a",
       "https://images.unsplash.com/photo-1558788353-f76d92427f16",
       "https://images.unsplash.com/photo-1561037404-61cd46aa615b",
       "https://images.unsplash.com/photo-1568572933382-74d440642117",
       "https://images.unsplash.com/photo-1583511655813-c66c0a234a1e",
       "https://images.unsplash.com/photo-1592194946308-fb1a62b0f48b"
  };

  public static final String[] FAST_FOOD_ITEM_IMAGE_URLS = {
       "https://images.unsplash.com/photo-1518791841217-8f162f1e1131",
       "https://images.unsplash.com/photo-1537151625747-768eb6cf92b2",
       "https://images.unsplash.com/photo-1552053831-71594a27632d",
       "https://images.unsplash.com/photo-1543466835-00a7907e9de1",
       "https://images.unsplash.com/photo-1517849845537-4d257902454a",
       "https://images.unsplash.com/photo-1558788353-f76d92427f16",
       "https://images.unsplash.com/photo-1561037404-61cd46aa615b",
       "https://images.unsplash.com/photo-1568572933382-74d440642117",
       "https://images.unsplash.com/photo-1583511655813-c66c0a234a1e",
       "https://images.unsplash.com/photo-1592194946308-fb1a62b0f48b"
  };

  public static final String[] PLANT_IMAGE_URLS = {
       "https://images.unsplash.com/photo-1518791841217-8f162f1e1131",
       "https://images.unsplash.com/photo-1537151625747-768eb6cf92b2",
       "https://images.unsplash.com/photo-1552053831-71594a27632d",
       "https://images.unsplash.com/photo-1543466835-00a7907e9de1",
       "https://images.unsplash.com/photo-1517849845537-4d257902454a",
       "https://images.unsplash.com/photo-1558788353-f76d92427f16",
       "https://images.unsplash.com/photo-1561037404-61cd46aa615b",
       "https://images.unsplash.com/photo-1568572933382-74d440642117",
       "https://images.unsplash.com/photo-1583511655813-c66c0a234a1e",
       "https://images.unsplash.com/photo-1592194946308-fb1a62b0f48b"
  };

  public static final String[] FISH_IMAGE_URLS = {
       "https://images.unsplash.com/photo-1518791841217-8f162f1e1131",
       "https://images.unsplash.com/photo-1537151625747-768eb6cf92b2",
       "https://images.unsplash.com/photo-1552053831-71594a27632d",
       "https://images.unsplash.com/photo-1543466835-00a7907e9de1",
       "https://images.unsplash.com/photo-1517849845537-4d257902454a",
       "https://images.unsplash.com/photo-1558788353-f76d92427f16",
       "https://images.unsplash.com/photo-1561037404-61cd46aa615b",
       "https://images.unsplash.com/photo-1568572933382-74d440642117",
       "https://images.unsplash.com/photo-1583511655813-c66c0a234a1e",
       "https://images.unsplash.com/photo-1592194946308-fb1a62b0f48b"
  };

  public static final String[] SPORT_IMAGE_URLS = {
       "https://images.unsplash.com/photo-1518791841217-8f162f1e1131",
       "https://images.unsplash.com/photo-1537151625747-768eb6cf92b2",
       "https://images.unsplash.com/photo-1552053831-71594a27632d",
       "https://images.unsplash.com/photo-1543466835-00a7907e9de1",
       "https://images.unsplash.com/photo-1517849845537-4d257902454a",
       "https://images.unsplash.com/photo-1558788353-f76d92427f16",
       "https://images.unsplash.com/photo-1561037404-61cd46aa615b",
       "https://images.unsplash.com/photo-1568572933382-74d440642117",
       "https://images.unsplash.com/photo-1583511655813-c66c0a234a1e",
       "https://images.unsplash.com/photo-1592194946308-fb1a62b0f48b"
  };

  public static final String[] KITCHEN_APPLIANCE_IMAGE_URLS = {
       "https://images.unsplash.com/photo-1518791841217-8f162f1e1131",
       "https://images.unsplash.com/photo-1537151625747-768eb6cf92b2",
       "https://images.unsplash.com/photo-1552053831-71594a27632d",
       "https://images.unsplash.com/photo-1543466835-00a7907e9de1",
       "https://images.unsplash.com/photo-1517849845537-4d257902454a",
       "https://images.unsplash.com/photo-1558788353-f76d92427f16",
       "https://images.unsplash.com/photo-1561037404-61cd46aa615b",
       "https://images.unsplash.com/photo-1568572933382-74d440642117",
       "https://images.unsplash.com/photo-1583511655813-c66c0a234a1e",
       "https://images.unsplash.com/photo-1592194946308-fb1a62b0f48b"
  };

  public static final String[] ITALIAN_PASTA_IMAGE_URLS = {
       "https://images.unsplash.com/photo-1518791841217-8f162f1e1131",
       "https://images.unsplash.com/photo-1537151625747-768eb6cf92b2",
       "https://images.unsplash.com/photo-1552053831-71594a27632d",
       "https://images.unsplash.com/photo-1543466835-00a7907e9de1",
       "https://images.unsplash.com/photo-1517849845537-4d257902454a",
       "https://images.unsplash.com/photo-1558788353-f76d92427f16",
       "https://images.unsplash.com/photo-1561037404-61cd46aa615b",
       "https://images.unsplash.com/photo-1568572933382-74d440642117",
       "https://images.unsplash.com/photo-1583511655813-c66c0a234a1e",
       "https://images.unsplash.com/photo-1592194946308-fb1a62b0f48b"
  };

  public static final String[] PROFESSION_IMAGE_URLS = {
       "https://images.unsplash.com/photo-1518791841217-8f162f1e1131",
       "https://images.unsplash.com/photo-1537151625747-768eb6cf92b2",
       "https://images.unsplash.com/photo-1552053831-71594a27632d",
       "https://images.unsplash.com/photo-1543466835-00a7907e9de1",
       "https://images.unsplash.com/photo-1517849845537-4d257902454a",
       "https://images.unsplash.com/photo-1558788353-f76d92427f16",
       "https://images.unsplash.com/photo-1561037404-61cd46aa615b",
       "https://images.unsplash.com/photo-1568572933382-74d440642117",
       "https://images.unsplash.com/photo-1583511655813-c66c0a234a1e",
       "https://images.unsplash.com/photo-1592194946308-fb1a62b0f48b"
  };

  public static final String[] SALAD_INGREDIENT_IMAGE_URLS = {
       "https://images.unsplash.com/photo-1518791841217-8f162f1e1131",
       "https://images.unsplash.com/photo-1537151625747-768eb6cf92b2",
       "https://images.unsplash.com/photo-1552053831-71594a27632d",
       "https://images.unsplash.com/photo-1543466835-00a7907e9de1",
       "https://images.unsplash.com/photo-1517849845537-4d257902454a",
       "https://images.unsplash.com/photo-1558788353-f76d92427f16",
       "https://images.unsplash.com/photo-1561037404-61cd46aa615b",
       "https://images.unsplash.com/photo-1568572933382-74d440642117",
       "https://images.unsplash.com/photo-1583511655813-c66c0a234a1e",
       "https://images.unsplash.com/photo-1592194946308-fb1a62b0f48b"
  };

  public static final String[] SMOOTHY_INGREDIENT_IMAGE_URLS = {
       "https://images.unsplash.com/photo-1518791841217-8f162f1e1131",
       "https://images.unsplash.com/photo-1537151625747-768eb6cf92b2",
       "https://images.unsplash.com/photo-1552053831-71594a27632d",
       "https://images.unsplash.com/photo-1543466835-00a7907e9de1",
       "https://images.unsplash.com/photo-1517849845537-4d257902454a",
       "https://images.unsplash.com/photo-1558788353-f76d92427f16",
       "https://images.unsplash.com/photo-1561037404-61cd46aa615b",
       "https://images.unsplash.com/photo-1568572933382-74d440642117",
       "https://images.unsplash.com/photo-1583511655813-c66c0a234a1e",
       "https://images.unsplash.com/photo-1592194946308-fb1a62b0f48b"
  };

  public static final String[] SUPER_HERO_IMAGE_URLS = {
       "https://images.unsplash.com/photo-1518791841217-8f162f1e1131",
       "https://images.unsplash.com/photo-1537151625747-768eb6cf92b2",
       "https://images.unsplash.com/photo-1552053831-71594a27632d",
       "https://images.unsplash.com/photo-1543466835-00a7907e9de1",
       "https://images.unsplash.com/photo-1517849845537-4d257902454a",
       "https://images.unsplash.com/photo-1558788353-f76d92427f16",
       "https://images.unsplash.com/photo-1561037404-61cd46aa615b",
       "https://images.unsplash.com/photo-1568572933382-74d440642117",
       "https://images.unsplash.com/photo-1583511655813-c66c0a234a1e",
       "https://images.unsplash.com/photo-1592194946308-fb1a62b0f48b"
  };

  public static final String[] VEGETABLE_IMAGE_URLS = {
       "https://images.unsplash.com/photo-1518791841217-8f162f1e1131",
       "https://images.unsplash.com/photo-1537151625747-768eb6cf92b2",
       "https://images.unsplash.com/photo-1552053831-71594a27632d",
       "https://images.unsplash.com/photo-1543466835-00a7907e9de1",
       "https://images.unsplash.com/photo-1517849845537-4d257902454a",
       "https://images.unsplash.com/photo-1558788353-f76d92427f16",
       "https://images.unsplash.com/photo-1561037404-61cd46aa615b",
       "https://images.unsplash.com/photo-1568572933382-74d440642117",
       "https://images.unsplash.com/photo-1583511655813-c66c0a234a1e",
       "https://images.unsplash.com/photo-1592194946308-fb1a62b0f48b"
  };

  public static final String[] SEAFOOD_TYPE_IMAGE_URLS = {
       "https://images.unsplash.com/photo-1518791841217-8f162f1e1131",
       "https://images.unsplash.com/photo-1537151625747-768eb6cf92b2",
       "https://images.unsplash.com/photo-1552053831-71594a27632d",
       "https://images.unsplash.com/photo-1543466835-00a7907e9de1",
       "https://images.unsplash.com/photo-1517849845537-4d257902454a",
       "https://images.unsplash.com/photo-1558788353-f76d92427f16",
       "https://images.unsplash.com/photo-1561037404-61cd46aa615b",
       "https://images.unsplash.com/photo-1568572933382-74d440642117",
       "https://images.unsplash.com/photo-1583511655813-c66c0a234a1e",
       "https://images.unsplash.com/photo-1592194946308-fb1a62b0f48b"
  };

  public static final String[] PIZZA_TOPPING_IMAGE_URLS = {
       "https://images.unsplash.com/photo-1518791841217-8f162f1e1131",
       "https://images.unsplash.com/photo-1537151625747-768eb6cf92b2",
       "https://images.unsplash.com/photo-1552053831-71594a27632d",
       "https://images.unsplash.com/photo-1543466835-00a7907e9de1",
       "https://images.unsplash.com/photo-1517849845537-4d257902454a",
       "https://images.unsplash.com/photo-1558788353-f76d92427f16",
       "https://images.unsplash.com/photo-1561037404-61cd46aa615b",
       "https://images.unsplash.com/photo-1568572933382-74d440642117",
       "https://images.unsplash.com/photo-1583511655813-c66c0a234a1e",
       "https://images.unsplash.com/photo-1592194946308-fb1a62b0f48b"
  };

  public static final String[] PLANET_IMAGE_URLS = {
       "https://images.unsplash.com/photo-1518791841217-8f162f1e1131",
       "https://images.unsplash.com/photo-1537151625747-768eb6cf92b2",
       "https://images.unsplash.com/photo-1552053831-71594a27632d",
       "https://images.unsplash.com/photo-1543466835-00a7907e9de1",
       "https://images.unsplash.com/photo-1517849845537-4d257902454a",
       "https://images.unsplash.com/photo-1558788353-f76d92427f16",
       "https://images.unsplash.com/photo-1561037404-61cd46aa615b",
       "https://images.unsplash.com/photo-1568572933382-74d440642117",
       "https://images.unsplash.com/photo-1583511655813-c66c0a234a1e",
       "https://images.unsplash.com/photo-1592194946308-fb1a62b0f48b"
  };

  public static String catImage() {

    return randomOption(CAT_IMAGE_URLS);
  }

  public static String birdImage() {

    return randomOption(BIRD_IMAGE_URLS);
  }

  public static String zooAnimalImage() {

    return randomOption(ZOO_ANIMAL_IMAGE_URLS);
  }

  public static String airplaneImage() {

    return randomOption(AIRPLANE_IMAGE_URLS);
  }

  public static String bakeryItemImage() {

    return randomOption(BAKERY_ITEM_IMAGE_URLS);
  }

  public static String breakfastItemImage() {

    return randomOption(BREAKFAST_ITEM_IMAGE_URLS);
  }

  public static String carImage() {

    return randomOption(CAR_IMAGE_URLS);
  }

  public static String motorcycleImage() {

    return randomOption(MOTORCYCLE_IMAGE_URLS);
  }

  public static String flagCountryImage() {

    return randomOption(FLAG_COUNTRY_IMAGE_URLS);
  }

  public static String fastFoodItemImage() {

    return randomOption(FAST_FOOD_ITEM_IMAGE_URLS);
  }

  public static String plantImage() {

    return randomOption(PLANT_IMAGE_URLS);
  }

  public static String fishImage() {

    return randomOption(FISH_IMAGE_URLS);
  }

  public static String sportImage() {

    return randomOption(SPORT_IMAGE_URLS);
  }

  public static String kitchenApplianceImage() {

    return randomOption(KITCHEN_APPLIANCE_IMAGE_URLS);
  }

  public static String italianPastaImage() {

    return randomOption(ITALIAN_PASTA_IMAGE_URLS);
  }

  public static String professionImage() {

    return randomOption(PROFESSION_IMAGE_URLS);
  }

  public static String saladIngredientImage() {

    return randomOption(SALAD_INGREDIENT_IMAGE_URLS);
  }

  public static String smoothyIngredientImage() {

    return randomOption(SMOOTHY_INGREDIENT_IMAGE_URLS);
  }

  public static String superHeroImage() {

    return randomOption(SUPER_HERO_IMAGE_URLS);
  }

  public static String vegetableImage() {

    return randomOption(VEGETABLE_IMAGE_URLS);
  }

  public static String seafoodTypeImage() {

    return randomOption(SEAFOOD_TYPE_IMAGE_URLS);
  }

  public static String pizzaToppingImage() {

    return randomOption(PIZZA_TOPPING_IMAGE_URLS);
  }

  public static String planetImage() {

    return randomOption(PLANET_IMAGE_URLS);
  }

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

  public static String[] randomOptions(int total, String...options) {

    if(total > options.length) total = options.length;

    String[] totalList = new String[total];

    for (int i = 0; i < totalList.length; i++) totalList[i] = options[i];

    return totalList;
  }

  public static String randomOption(String[] options) {

    int index = random.nextInt(options.length);
    return options[index];
  }
}