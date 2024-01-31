package controller;

import java.util.ArrayList;
import model.Contact;
import model.PhoneList;
import view.Validation;

public class Controller {

    private ArrayList<Contact> ctList = new ArrayList<>();
    private Validation val = new Validation();

    public ArrayList<Contact> getCurrentPhoneList() {
        return ctList;
    }

    public void addContact() {
        String name = val.getName("Enter Name: ");
        String[] nameTemp = name.split(" ");
        String FirstName = nameTemp[nameTemp.length - 1];
        String LastName = nameTemp[0];
        String Group = val.getString("Enter Group: ");
        String Address = val.getString("Enter Address: ");

        String Phone = val.checkValidPhoneNum("Enter Phone: ");
        Contact newCt = new PhoneList(name, FirstName, LastName, Group, Address, Phone);
        ctList.add(newCt);
    }

    public void displayContact(ArrayList<Contact> list) {
        System.out.println("--------------------------------- Display all Contact ----------------------------");
        System.out.printf("%-4s  %-20s  %-12s  %-12s  %-6s  %-15s  %-12s\n",
                "ID", "Name", "First Name", "Last Name", "Group", "Address", "Phone");

        for (Contact ct : list) {
            if (ct instanceof PhoneList phoneList) {
                System.out.printf("%-4s  %-20s  %-12s  %-12s  %-6s  %-15s  %-12s\n",
                        ct.getID(), ct.getFullName(), ct.getFirstName(),
                        ct.getLastName(), ct.getGroup(), ct.getAddress(), phoneList.getPhone());
            }
        }
    }

    public void deleteContact() {
        int idToDelete = val.getInt("Enter the ID of the contact to delete: ");

        boolean contactFound = false;
        for (Contact ct : ctList) {
            if (ct.getID() == idToDelete) {
                ctList.remove(ct);
                contactFound = true;
                System.out.println("Contact deleted successfully.");
                break; // Exit the loop after deleting the contact
            }
        }

        if (!contactFound) {
            System.out.println("Contact with ID " + idToDelete + " not found.");
        }
    }

}
