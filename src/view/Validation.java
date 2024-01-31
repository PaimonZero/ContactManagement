package view;

import java.util.Scanner;

public class Validation {

    public int getInt(String inputMsg) {
        Scanner sc = new Scanner(System.in);
        int result;

        do {
            try {
                System.out.print(inputMsg);
                result = Integer.parseInt(sc.nextLine());

                if (result > 0) {
                    return result;
                } else {
                    System.err.println("Value must be > 0");
                }
            } catch (NumberFormatException e) {
                System.err.println("Please enter a positive integer! Try again!");
            }
        } while (true);
    }

    public String getString(String inputMsg) {
        Scanner sc = new Scanner(System.in);
        String result;
        do {
            try {
                System.out.print(inputMsg);
                result = sc.nextLine().trim();
                if (result.isEmpty() == true) {
                    System.out.println(">>You input nothing?");
                } else {
                    return result;
                }
            } catch (Exception e) {
                System.err.println("Pls enter again!");
            }
        } while (true);
    }

    public boolean checkInputYN(String inputMsg) {
        while (true) {
            try {
                String result = getString(inputMsg);
                if (result.equalsIgnoreCase("Y")) {
                    return true;
                } else if (result.equalsIgnoreCase("N")) {
                    return false;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Please input y/Y or n/N.");
            }
        }
    }
    
    public String checkValidPhoneNum(String inputMsg) {
        Scanner sc = new Scanner(System.in);
        String result;
        do{
            try {
                System.out.print(inputMsg);
                result = sc.nextLine().trim();
                if(result.isEmpty() == true) {
                    System.out.println(">>You input nothing?");
                } else if(result.matches("^(\\(\\d{3}\\)|\\d{3})[-\\.\\s]?\\d{3}[-\\.\\s]?\\d{4}(\\s?(ext|x)\\d{4})?$")) {
                    return result;
                } else{
                    System.out.println("Wrong phone number!");
                }
            } catch (Exception e) {
                System.err.println("Pls enter again!");
            }
        } while (true);
    }
    
    public String getName(String inputMsg) {
        Scanner sc = new Scanner(System.in);
        String result;
        do {
            try {
                System.out.print(inputMsg);
                result = sc.nextLine().trim();
                if (result.isEmpty() == true) {
                    System.out.println(">>You input nothing?");
                } else if(result.contains(" ")) {
                    return result;
                } else {
                    System.out.println(">>Full name pls!!!");
                }
            } catch (Exception e) {
                System.err.println("Pls enter again!");
            }
        } while (true);
    }
}
