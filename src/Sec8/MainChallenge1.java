package Sec8;

import java.util.ArrayList;
import java.util.Scanner;

public class MainChallenge1 {
    private static Scanner scanner = new Scanner(System.in); //instance Scanner
    private static MobilePhone mobilePhone = new MobilePhone(); //instance mobilePhone

    public static void main(String[] args) {
        int action = 0;  //
        do{

            ScreenMsgHandle.printMenu();
            //printMobilePhoneList();
            action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 1:
                    getInputContact(); //handle inputs to Add contact
                    break;
                case 2:
                    getInputUpdateContact(); //handle inputs to Update contact
                    break;
                case 3:
                    getInputRemoveContact(); //handle inputs to Remove contact;
                    break;
                case 4:
                    printMobilePhoneList(); //print list of contacts
                    break;
                default:
                    ScreenMsgHandle.printLnMsg("Opcao Invalida! Tente novamente.");
                    break;
            }
        } while ( action <= 4 || action > 0);
    }

    private static void getInputContact() {
        ScreenMsgHandle.printLnMsg("Digite o nome: ");
        String name = scanner.nextLine();
        ScreenMsgHandle.printLnMsg("Digite o celular/telefone: ");
        String phone = scanner.nextLine();
        //buildContact() receive name and phone as parameters and return a new contact object;
        mobilePhone.addContact(buildContact(name, phone));
        // addContact() -> newContact;
    }

    private static void getInputUpdateContact() {
        ScreenMsgHandle.printLnMsg("Digite o nome do contato que deseja alterar: ");
        String contactToModify = scanner.nextLine();
        ScreenMsgHandle.printLnMsg("Digite o nome do novo contato: ");
        String newName = scanner.nextLine();
        ScreenMsgHandle.printLnMsg("Digite o novo celular/telefone: ");
        String phone = scanner.nextLine();

        mobilePhone.updateContact(contactToModify, buildContact(newName, phone));
        //updateContact() -> contact already in the list, new contact;
    }

    private static void getInputRemoveContact() {
        ScreenMsgHandle.printLnMsg("Digite o nome do contato que deseja remover: ");
        String contatToRemove = scanner.nextLine();
        mobilePhone.removeContact(contatToRemove);
    }

    public static Contact buildContact(String name, String phone) {
        return new Contact(name, phone);
    }

    public static void printMobilePhoneList() {
        mobilePhone.printContacts();
    }

}
