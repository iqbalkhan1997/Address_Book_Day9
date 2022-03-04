package com.blz.addressBook;
    import jdk.internal.icu.text.UnicodeSet;

    import java.util.*;
public class AddressBookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Address Book Program");
        AddressBook addressBook = new AddressBook();
        System.out.println("Enter no of student you want to add");
        int contactsCount = scanner.nextInt();
        for (int i = 0; i < contactsCount; i++) {
            addressBook.addContacts();
        }
        for(int i=0;i<contactsCount;i++) {
            System.out.println(AddressBook.contacts.get(i));
        }
    }
}