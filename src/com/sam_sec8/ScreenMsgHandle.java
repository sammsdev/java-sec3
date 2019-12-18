package com.sam_sec8;

import java.util.ArrayList;

public class ScreenMsgHandle {

    public static void printLnMsg(String msg) {
        System.out.println(msg);
    }

    public static void printError() {
        System.out.println("Error. Contact Not found! Please check the inputs.");
    }

    public static void printArrayOnScreen(ArrayList contacts) {
        if (contacts.size() >= 0) {
            for (int i = 0; i < contacts.size(); i++) {
                System.out.println((i + 1) + ". " + contacts.get(i).toString());
            }
        } else
            ScreenMsgHandle.printLnMsg("Nenhum contato encontrado.");
    }

    public static void printMenu() {
        String str = "\n" + "-------------------Menu-------------------" + "\n" +
                "(1) Add Contact" + "\n" +
                "(2) Update Existing Contact" + "\n" +
                "(3) Remove Contact" + "\n" +
                "(4) Exhibit List of Contacts" + "\n" +
                "(5) Exit" + "\n";
        System.out.println(str);
    }
}
