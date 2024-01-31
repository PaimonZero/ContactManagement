package model;

public class Contact {
    private static int countId = 1;
    private int ID;
    private String FirstName;
    private String LastName;
    private String FullName;
    private String Group;
    private String Address;

    public Contact() {
    }

    public Contact(String FullName, String FirstName, String LastName, String Group, String Address) {
        this.ID = countId++;
        this.FullName = FullName;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Group = Group;
        this.Address = Address;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getGroup() {
        return Group;
    }

    public void setGroup(String Group) {
        this.Group = Group;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getAddress() {
        return Address;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public static int getCountId() {
        return countId;
    }

    public static void setCountId(int countId) {
        Contact.countId = countId;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }
}
