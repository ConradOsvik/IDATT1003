import java.util.Scanner;

public class Main {

  private static final PropertyRegister propertyRegister = new PropertyRegister();
  private static final Scanner in = new Scanner(System.in);
  private static int input;

  public static void input() {
    try {
      System.out.println("1. Add property");
      System.out.println("2. Delete property");
      System.out.println("3. List all properties");
      System.out.println("4. Search property by ID");
      System.out.println("5. Calculate average area");
      System.out.println("6. Get properties by lot ID");
      System.out.println("7. Exit");

      input = Integer.parseInt(in.nextLine());
      validateInput(input);

      if (input == 7) {
        exit(0);
      }
    } catch (Exception e) {
      System.out.println("Invalid input, input must be integer between 1 and 8");
      System.err.println(e);
      input();
    }
  }

  private static void validateInput(int input) throws IllegalArgumentException {
    if (input < 1 || input > 7) {
      throw new IllegalArgumentException("Input must be integer between "
          + "1 and 7");
    }
  }

  private static void registerProperty() {
    System.out.println("Enter municipality number: ");
    int municipalityNumber = Integer.parseInt(in.nextLine());
    System.out.println("Enter municipality name: ");
    String municipalityName = in.nextLine();
    System.out.println("Enter lot number: ");
    int lotNumber = Integer.parseInt(in.nextLine());
    System.out.println("Enter section number: ");
    int sectionNumber = Integer.parseInt(in.nextLine());
    System.out.println("Enter name: ");
    String name = in.nextLine();
    System.out.println("Enter area: ");
    double area = Double.parseDouble(in.nextLine());
    System.out.println("Enter name of owner: ");
    String nameOfOwner = in.nextLine();

    Property property = new Property(municipalityNumber, municipalityName, lotNumber,
        sectionNumber, name, area, nameOfOwner);
    boolean hasRegistered = propertyRegister.registerProperty(property);

    if (hasRegistered) {
      System.out.println("Property has been registered");
    } else {
      System.out.println(
          "Property has not been registered, property with same ID already exists");
    }
  }

  private static void deleteProperty() {
    System.out.println("Enter ID of property to delete: ");
    String id = in.nextLine();

    boolean hasDeleted = propertyRegister.deleteProperty(id);

    if (hasDeleted) {
      System.out.println("Property has been deleted");
    } else {
      System.out.println("Property has not been deleted, property with ID does not exist");
    }
  }

  private static void listAllProperties() {
    System.out.println("Properties: ");
    for (Property propertyId : propertyRegister.getRegisteredProperties()) {
      System.out.println(propertyId.toString());
    }
  }

  private static void searchPropertyById() {
    System.out.println("Enter ID of property to search for: ");
    String id = in.nextLine();

    Property property = propertyRegister.getPropertyBasedOnId(id);

    if (property != null) {
      System.out.println(property.toString());
    } else {
      System.out.println("Property with ID does not exist");
    }
  }

  private static void calculateAverageArea() {
    System.out.println("Average area: " + propertyRegister.getAvgAreaOfProperties());
  }

  private static void getPropertiesByLotId() {
    System.out.println("Enter lot ID: ");
    int lotId = Integer.parseInt(in.nextLine());

    Property[] properties = propertyRegister.getPropertiesWithLotNumber(lotId);

    if (properties.length > 0) {
      for (Property property : properties) {
        System.out.println(property.toString());
      }
    } else {
      System.out.println("No properties with lot ID");
    }
  }

  private static void exit(int status) {
    System.exit(status);
  }

  private static void init() {
    propertyRegister.registerProperty(
        1445,
        "Gloppen",
        77,
        631,
        "",
        1017.6,
        "Jens Olsen"
    );
    propertyRegister.registerProperty(
        1445,
        "Gloppen",
        77,
        131,
        "Syningom",
        661.3,
        "Nicolay Madsen"
    );
    propertyRegister.registerProperty(1445,
        "Gloppen",
        75,
        19,
        "fugletun",
        650.6,
        "Evilyn Jensen"
    );
    propertyRegister.registerProperty(
        1445,
        "Gloppen",
        74,
        188,
        "",
        1457.2,
        "karl Ove Bråten"
    );
    propertyRegister.registerProperty(
        1445,
        "Gloppen",
        69,
        47,
        "Høiberg",
        1339.4,
        "Elsa Indregård"
    );
  }

  private static void output() {
    switch (input) {
      case 1:
        registerProperty();
        break;
      case 2:
        deleteProperty();
        break;
      case 3:
        listAllProperties();
        break;
      case 4:
        searchPropertyById();
        break;
      case 5:
        calculateAverageArea();
        break;
      case 6:
        getPropertiesByLotId();
        break;
    }
  }

  public static void main(String[] args) {
    init();

    while (true) {
      input();
      output();
    }
  }
}