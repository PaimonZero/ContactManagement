package model;

public class PhoneList extends Contact {

    private String Phone;

    public PhoneList(String FullName, String FirstName, String LastName, String Group, String Address, String Phone) {
        super(FullName, FirstName, LastName, Group, Address);
        this.Phone = Phone;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }
}
