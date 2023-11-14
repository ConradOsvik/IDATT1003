public class Property {

  private int municipalityNumber;
  private String municipalityName;
  private int lotNumber;
  private int sectionNumber;
  private String name;
  private double area;
  private String nameOfOwner;

  public Property(int municipalityNumber, String municipalityName, int lotNumber, int sectionNumber,
      String name, double area, String nameOfOwner) {
    this.municipalityNumber = municipalityNumber;
    this.municipalityName = municipalityName;
    this.lotNumber = lotNumber;
    this.sectionNumber = sectionNumber;
    this.name = name;
    this.area = area;
    this.nameOfOwner = nameOfOwner;
  }

  public int getMunicipalityNumber() {
    return municipalityNumber;
  }

  public String getMunicipalityName() {
    return municipalityName;
  }

  public int getLotNumber() {
    return lotNumber;
  }

  public int getSectionNumber() {
    return sectionNumber;
  }

  public void setName(String name){
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public double getArea() {
    return area;
  }

  public void setNameOfOwner(String nameOfOwner){
    this.nameOfOwner = nameOfOwner;
  }

  public String getNameOfOwner() {
    return nameOfOwner;
  }

  public String getId(){
    return this.municipalityNumber + "-" + this.lotNumber + "/" + this.sectionNumber;
  }

  @Override
  public String toString() {
    return this.getId();
  }
}
