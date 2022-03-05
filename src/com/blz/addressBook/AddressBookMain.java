package com.blz.addressBook;
    import java.util.*;
public class AddressBookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Address Book Program");
        AddressBook addressBook = new AddressBook();

        System.out.println("1.Add Contact");
        System.out.println("2.Edit Contact");
        System.out.println("0.Exit");
        int options = scanner.nextInt();
        while (options != 0) {
            switch (options) {
                case 1:
                    System.out.println("Enter no of student you want to add");
                    int contactsCount = scanner.nextInt();
                    for (int i = 0; i < contactsCount; i++) {
                        addressBook.addContacts();
                    }
                    for (int i = 0; i < contactsCount; i++) {
                        System.out.println(AddressBook.contacts.get(i));
                    }
                    break;
                case 2:
                    System.out.println("enter the first name you want to edit");
                    String check = scanner.next();
                    addressBook.editContact(check);
                    break;
            }
            System.out.println("1.Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("0.Exit");
            options = scanner.nextInt();
        }
    }
}