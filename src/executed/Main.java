package executed;

import controller.Controller;
import model.Contact;
import view.Menu;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();
        Menu<Contact> contactMenu = createContactMenu();

        int choice;
        do {
            contactMenu.display();
            choice = contactMenu.getChoice();

            switch (choice) {
                case 1:
                    System.out.println("----------Add a Contact----------");
                    controller.addContact();
                    break;
                case 2:
                    controller.displayContact(controller.getCurrentPhoneList());
                    break;
                case 3:
                    System.out.println("----------Delete a Contact----------");
                    controller.deleteContact();
                    break;
                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        } while (choice != 4);
    }

    private static Menu<Contact> createContactMenu() {
        String[] menuItems = {
            "Add a Contact",
            "Display all Contacts",
            "Delete a Contact",
            "Exit"
        };
        return new Menu<>("========= Contact program =========", menuItems) {
            @Override
            public void execute(int choice) {
                // The execution logic is handled in the main loop switch statement.
            }
        };
    }
}
