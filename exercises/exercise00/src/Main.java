public class Main {
    public static void main(String[] args) {
        System.out.println("INFO 5100 exercise00");

    }

    // Class 0
    public class Student {
        private int id;
        private String major;
        private String name;
        private int age;
        private String gender;
        private String address;
        private float GPA;
        private String skill;

        public String getName() {
            return name;
        }
        public int getAge() {
            return age;
        }
        public String getGender() {
            return gender;
        }

        //Nested class 1
        public static class Laptop {
            private String model;
            private String price;

            public void recharge() {
                // recharge the laptop method body
            }
        }

        //Nested class 2
        public static class WaterBottle {
            private int height;
            private String brand;

            public void refuel() {
                // refuel the water bottle method body
            }
        }
        // Constructor
        public Student(int id) {
            this.id=id;
            System.out.println("This student's id is " + this.id);
        }

        public void main(int[] args) {
            // Instantiate 3 objects
            Student student = new Student(2688811);
            Student student1 = new Student(2688812);
            Student student2 = new Student(2688813);
        }

    }
    // Class 1
    public class Cellphone {
        private String material;
        private int width;
        private int weight;
        private int price;
        private String color;
        private String brand;
        private String system;

        public void charge() {
            // charge method body
        }
        public void download() {
            // download method body
        }
        public void fix() {
            // fix cellphone method body
        }

        // Constructor
        public Cellphone(String brand) {
            this.brand=brand;
            System.out.println("This cellphone's brand is " + this.brand);
        }

        // Instantiate 3 objects
        public void main(String[] args) {
            Cellphone cp = new Cellphone("Sony");
            Cellphone cp1 = new Cellphone("Apple");
            Cellphone cp2 = new Cellphone("Samsung");
        }
    }
    // Class 2
    public class Restaurant {
        private String name;
        private String address;
        private String cuisine;
        private boolean isOpen;
        int tableNumber;
        int sales;
        Double price;
        String style;

        public void openRestaurant() {
            // open the restaurant method
        }
        public void cleanRestaurant() {
            // clean the restaurant method body
        }
        public void refund() {
            // refund customer method
        }
        // Constructor
        public Restaurant(String name) {
            this.name=name;
            System.out.println("This restaurant's name is " + this.name);
        }

        // Instantiate 3 objects
        public void main(String[] args) {
            Restaurant res = new Restaurant("Panda");
            Restaurant res1 = new Restaurant("Pho");
            Restaurant res2 = new Restaurant("Sushi");
        }
    }
    // Class 3
    public class Kitchen {
        // Properties
        private boolean isOpen;
        private String styleOfFood;
        private double pricePerMeal;
        private int numOfBranches;
        private float yelpRate;
        private boolean isVegetarian;
        private boolean hasOven;
        private boolean hasFridge;

        // Methods
        public void furnish() {
            // furnish the kitchen method
        }
        public void cookMeal() {
            // cook the meal method
        }
        public void cleanKitchen() {
            // clean after operation method
        }

        // Constructor
        public Kitchen(float yelpRate) {
            this.yelpRate=yelpRate;
            System.out.println("This kitchen's yelp rate is " + this.yelpRate);
        }

        // Instantiate 3 objects
        public void main(float[] args) {
            Kitchen kit = new Kitchen(4.1F);
            Kitchen kit1 = new Kitchen(3.8F);
            Kitchen kit2 = new Kitchen(3.0F);
        }
    }
    // Class 4
    public class Car {
        int miles;
        int seats;
        boolean hasRoof;
        int doors;
        String type;
        String brand;
        float gasPerMile;
        int yearsUsed;

        public void startEngine() {
            // start engine method
        }
        public void speedUp() {
            // seed up method
        }
        public void brick() {
            // brick method
        }
        // Constructor
        public Car(int miles) {
            this.miles=miles;
            System.out.println("This car has run for " + this.miles);
        }

        public void main(int[] args) {
            Car car = new Car(200_000);
            Car car1 = new Car(380_00);
            Car car2 = new Car(190_100);
        }

    }
    // Class 5
    public class Laptop {
        private String manufacturer;
        private String model;
        private String size;
        private String processor;
        private byte numOfCores;
        private boolean isRefurnished;
        private String storage;
        private int price;

        // Methods
        public void charge() {
            // charge method
        }
        public void turnOff() {
            System.out.println("Turn off");
        }
        public void reboot() {
            // reboot method
        }
        // Constructor
        public Laptop(String model) {
            this.model=model;
            System.out.println("This laptop's model is " + this.model);
        }
        // Instantiate 3 objects
        public void main(String[] args) {
            Laptop laptop = new Laptop("Apple");
            Laptop laptop1 = new Laptop("Dell");
            Laptop laptop2 = new Laptop("Thinkpad");
        }
    }
    // Class 6
    public class ShoppingMall {
        private String location;
        private int numberOfStores;
        private int totalArea;
        private int numberOfFloors;
        private int parkingSpaces;
        private boolean hasFoodCourt;
        private boolean hasCinema;
        private boolean hasGamingArcade;

        public boolean getHasCinema() {
            return hasCinema;
        }
        public void rebrand() {
            // mall rebrand method
        }
        public void deal() {
            // deal method
        }

        // Constructor
        public ShoppingMall(String location) {
            this.location=location;
            System.out.println("This Shopping Mall's location is " + this.location);
        }

        // Instantiate 3 objects
        public void main(String[] args) {
            ShoppingMall mall = new ShoppingMall("Milpitas");
            ShoppingMall mall1 = new ShoppingMall("San Jose");
            ShoppingMall mall2 = new ShoppingMall("Santa Clara");
        }
    }
    // Class 7
    public class DentalClinic {

        String address;
        String email;
        Integer phoneNumber;
        String name;
        Boolean isOpen;
        int OpeningHour;
        int ClosingHour;
        String Website;

        // Methods
        public void makeAppointment() {
            // appointment method
        }
        public void cancelAppointment() {
            // cancell method
        }
        public void treat() {
            // treat method
        }

        // Constructor
        public DentalClinic(String address) {
            this.address=address;
            System.out.println("This dental clinic's address is " + this.address);
        }
        // Instantiate 3 objects
        public void main(String[] args) {
            DentalClinic clinic = new DentalClinic("Jackson Ave");
            DentalClinic clinic1 = new DentalClinic("King Ave");
            DentalClinic clinic2 = new DentalClinic("Alum Ave");
        }
    }
    // Class 8
    public class Hotel {
        private String name;
        private String address;
        private int numOfRooms;
        private int rating;
        private boolean isAvailable;
        private String phone;
        private String website;
        private int yearsOfBuilt;

        public String getAddress() {
            return address;
        }
        public int getRating() {
            return rating;
        }
        public boolean isAvailable() {
            return isAvailable;
        }

        // Parameterized constructor
        public Hotel(String name) {
            this.name = name;
            System.out.println("This hotel's name is " + this.name);
        }
        // Instantiate 3 objects
        public void main(String[] args) {
            Hotel hotel = new Hotel("W");
            Hotel hotel1 = new Hotel("Marriott");
            Hotel hotel2 = new Hotel("Hilton");
        }
    }
    // Class 9
    public class School {
        private String name;
        private String campus;
        private int numOfStudents;
        private int numOfMajor;
        private boolean accredited;
        private boolean hasScholar;
        private byte usRanking;
        private float requiredGPA;
        public void openNewCampus() {
            // open new campus method
        }
        public void rateGrade(){
            // rate the grade method
        }
        public void checkAttendance(){
            // check students' attendance method
        }
        public School(String campus, int numOfStudents) {
            this.campus = campus;
            this.numOfStudents = numOfStudents;
            System.out.println("Created a school instance with id " + campus);
        }

        // Instantiate 3 objects
        public void main(String[] args) {
            School campus = new School("SV", 3000);
            School campus1 = new School("Boston", 35_000);
            School campus2 = new School("Portland", 2000);
        }
    }
}