package Test.Strumienie;

public class Flat {

    private String town;
    private String district;
    private String street;
    private int rooms;
    private float surface;
    private boolean cellar;
    private int price;

    public Flat(String town, String district, String street, int rooms, float surface, boolean cellar, int price) {
        this.town = town;
        this.district = district;
        this.street = street;
        this.rooms = rooms;
        this.surface = surface;
        this.cellar = cellar;
        this.price = price;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public float getSurface() {
        return surface;
    }

    public void setSurface(float surface) {
        this.surface = surface;
    }

    public boolean isCellar() {
        return cellar;
    }

    public void setCellar(boolean cellar) {
        this.cellar = cellar;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Flat{" +
                "town='" + town + '\'' +
                ", district='" + district + '\'' +
                ", street='" + street + '\'' +
                ", rooms=" + rooms +
                ", surface=" + surface +
                ", cellar=" + cellar +
                ", price=" + price +
                '}';
    }
}
