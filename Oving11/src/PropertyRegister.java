import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PropertyRegister {

  List<Property> propertyRegister;

  public PropertyRegister() {
    this.propertyRegister = new ArrayList<>();
  }

  public PropertyRegister(Property property) {
    this.propertyRegister = new ArrayList<>();
    this.propertyRegister.add(property);
  }

  public PropertyRegister(Property[] propertyRegister) {
    this.propertyRegister = new ArrayList<>();
    this.propertyRegister.addAll(Arrays.asList(propertyRegister));
  }

  public boolean registerProperty(
      int municipalityNumber,
      String municipalityName,
      int lotNumber,
      int sectionNumber,
      String name,
      double area,
      String nameOfOwner
  ) {
    Property property = new Property(
        municipalityNumber,
        municipalityName,
        lotNumber,
        sectionNumber,
        name,
        area,
        nameOfOwner
    );
    for (Property _property : this.propertyRegister) {
      if (_property.getId().equals(property.getId())) {
        return false;
      }
    }
    this.propertyRegister.add(property);

    return true;
  }

  public boolean registerProperty(Property property) {
    for (Property _property : this.propertyRegister) {
      if (_property.getId().equals(property.getId())) {
        return false;
      }
    }
    this.propertyRegister.add(property);

    return true;
  }

  public boolean deleteProperty(String id) {
    for (Property property : this.propertyRegister) {
      if (property.getId().equals(id)) {
        this.propertyRegister.remove(property);
        return true;
      }
    }

    return false;
  }

  public int getNumberOfProperties() {
    return this.propertyRegister.size();
  }

  public Property[] getRegisteredProperties() {
    return this.propertyRegister.toArray(new Property[0]);
  }

  public Property getPropertyBasedOnId(String id) {
    for (Property property : this.propertyRegister) {
      if (property.getId().equals(id)) {
        return property;
      }
    }

    return null;
  }

  public double getAvgAreaOfProperties() {
    double sum = 0;
    for (Property property : this.propertyRegister) {
      sum += property.getArea();
    }

    return sum / this.propertyRegister.size();
  }

  public Property[] getPropertiesWithLotNumber(int lotNumber) {
    List<Property> properties = new ArrayList<>();
    for (Property property : this.propertyRegister) {
      if (property.getLotNumber() == lotNumber) {
        properties.add(property);
      }
    }

    return properties.toArray(new Property[0]);
  }
}
