package Sec8;

import java.util.Scanner;

public class MainChallenge1 {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();
    public static void main(String[] args) {

        int action = 0;
        do{
            ScreenMsgHandle.printMenu();
            action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 1:
                    getInputContact();
                    break;
                case 2:
                    getInputModifyContact();
                    break;
                case 3:
                    getInputRemoveContact();
                    break;
                case 4:
                    printMobilePhoneList();
                    break;
                default:
                    ScreenMsgHandle.printLnMsg("Opcao Invalida! Tente novamente.");
                    break;
            }
        } while ( action != 5);


    }

    private static void getInputContact() {
        ScreenMsgHandle.printLnMsg("Digite o nome: ");
        String name = scanner.nextLine();
        ScreenMsgHandle.printLnMsg("Digite o celular/telefone: ");
        String phone = scanner.nextLine();
        mobilePhone.addContact(buildContact(name, phone));
    }

    private static void getInputModifyContact() {
        ScreenMsgHandle.printLnMsg("Digite o nome do contato que deseja alterar: ");
        String contactToModify = scanner.nextLine();
        ScreenMsgHandle.printLnMsg("Digite o nome do novo contato: ");
        String newName = scanner.nextLine();
        ScreenMsgHandle.printLnMsg("Digite o novo celular/telefone: ");
        String phone = scanner.nextLine();
        mobilePhone.updateContact(contactToModify, buildContact(newName, phone));
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
