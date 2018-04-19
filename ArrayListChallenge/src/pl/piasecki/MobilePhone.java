package pl.piasecki;

import java.util.ArrayList;

/**
 * Created by Patrick on 18 kwi 2018
 */
public class MobilePhone {
    private ArrayList<Contact> contacts;

    public MobilePhone() {
        this.contacts = new ArrayList<Contact>();
    }

    public void addContact(String name, String phoneNumber){
        if (!isContactExist(name)){
            Contact contact = new Contact(name, phoneNumber);
            contacts.add(contact);
        } else {
            System.out.println("Contact with " + name + " name already exists.");
        }
    }

    public void printListOfContacts(){
        for (Contact contact : contacts) {
            System.out.println("Contact name: " + contact.getName()
                    + ", phone number: " + contact.getPhoneNumber());
        }
    }

    public void searchForContact(String name){
        if (isContactExist(name)){
            Contact contact = contacts.get(findContact(name));
            System.out.println("Contact name: " + contact.getName()
                    + ", phone number: " + contact.getPhoneNumber());
        } else {
            System.out.println("Contact with " + name + " name do not exist.");
        }
    }

    public void modifyContact(String name, String newName, String newNumber){
        if (isContactExist(name)){
            if(!isContactExist(newName) || newName.equals(name)){
                Contact contact = contacts.get(findContact(name));
                contact.setName(newName);
                contact.setPhoneNumber(newNumber);
            } else {
                System.out.println("Contact with " + newName + " name already exists.");
            }
        } else {
            System.out.println("Contact with " + name + " name do not exist.");
        }
    }

    public void modifyContactName(String name, String newName){
        if (isContactExist(name)){
            if(!isContactExist(newName)){
                Contact contact = contacts.get(findContact(name));
                contact.setName(newName);
            } else {
                System.out.println("Contact with " + newName + " name already exists.");
            }
        } else {
            System.out.println("Contact with " + name + " name do not exist.");
        }
    }

    public void modifyContactPhoneNumber(String name, String newNumber){
        if (isContactExist(name)){
            Contact contact = contacts.get(findContact(name));
            contact.setPhoneNumber(newNumber);
        } else {
            System.out.println("Contact with " + name + " name do not exist.");
        }
    }

    public void removeContact(String name){
        if (isContactExist(name)){
            contacts.remove(findContact(name));
        } else {
            System.out.println("Contact with " + name + " name do not exist.");
        }
    }

    private int findContact(String name){
        for (int i = 0; i<contacts.size(); i++){
            if (contacts.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    private boolean isContactExist(String name){
        return findContact(name) >= 0;
    }
}
