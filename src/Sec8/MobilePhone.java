package Sec8;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> contacts = new ArrayList<Contact>();

    public void addContact(Contact contact) {

        if (!onFile(contact)) {
            ScreenMsgHandle.printLnMsg("Contact added with success.");
            this.contacts.add(contact);
        } else {
            ScreenMsgHandle.printLnMsg("Contact already in the file.");
        }

    }

    public void updateContact(String name, Contact newContact) {
        int index = searchContactIndex(name);
        if (index >= 0) {
            updateContact(index, newContact);
            ScreenMsgHandle.printLnMsg("Contact modified with success.");
        } else {
            ScreenMsgHandle.printError();
        }
    }

    private void updateContact(int index, Contact newContact) {
        this.contacts.set(index, newContact);
    }


    public void removeContact(String name) {
        int index = searchContactIndex(name);
        if (index >= 0) {
            removeContact(contacts.get(index));
            ScreenMsgHandle.printLnMsg("Contact removed with success");
        } else
            ScreenMsgHandle.printError();
    }

    private void removeContact(Contact contact) {
        this.contacts.remove(contact);
    }

    private int searchContactIndex(String name) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equals(name)) {
                return searchContactIndex(contacts.get(i));
            }
        }
        return -1;
    }

    private int searchContactIndex(Contact contactToFind) {
        return this.contacts.indexOf(contactToFind);
    }

    private boolean onFile(Contact contactToFind) {
        return searchContactIndex(contactToFind.getName()) >= 0;
    }

    public void printContacts() {
        ScreenMsgHandle.printArrayOnScreen(this.contacts);
    }
}
