package com.blz.addressBook;
    import java.util.*;
public class AddressBook {
    Scanner scanner = new Scanner(System.in);
    public static List<Contact> contacts = new ArrayList<>();

    public  void addContacts(){

        System.out.println("Enter the contact details");
        Contact contact = new Contact();

        System.out.println("Enter the first name");
        contact.setFirstName(scanner.next());

        System.out.println("Enter the last name");
        contact.setLastName(scanner.next());

        System.out.println("Enter the address");
        contact.setAddress(scanner.next());

        System.out.println("Enter the city name");
        contact.setCity(scanner.next());

        System.out.println("Enter the zip code");
        contact.setZip(scanner.nextInt());

        System.out.println("Enter the phone number");
        contact.setPhoneNumber(scanner.nextLong());

        System.out.println("Enter the email");
        contact.setEmail(scanner.next());

        contacts.add(contact);
    }

    public  void editContact(String edit){
        System.out.println(AddressBook.contacts);
        for(int i=0;i<contacts.size();i++){

            Contact contact=(Contact)contacts.get(i);
            System.out.println(contact);
           // contact.setFirstName(edit);
            if(contact.getFirstName().equals(edit)){
                System.out.println("What data you want to edit?");
                System.out.println("1.edit first name");
                System.out.println("2.edit phone num");
                switch (scanner.nextInt()) {
                    case 1:
                        contact.setFirstName(scanner.next());
                        break;
                    case 2:
                        contact.setPhoneNumber(scanner.nextLong());
                        break;

                }
//                contacts.add(contact);
            }
            System.out.println(AddressBook.contacts);
        }
    }

}
