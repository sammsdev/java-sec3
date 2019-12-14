/*package Sec9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MainInnerAbstractInterfaces {

    public static void main(String[] args) {

        Player tim = new Player("Tim", 10, 15);
        saveObject(tim);
        System.out.println(tim);
        loadObject(tim);

    }

    public static  void saveObject (ISaveable objectToSave) {
        for(int i=0; i < objectToSave.write().size(); i++){
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static  void loadObject (ISaveable objectToLoad) {
        ArrayList<String> values = inputValues();
        objectToLoad.read(values);
    }

    public static ArrayList<String> inputValues(){
        ArrayList<String> values = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose \n" + "1 to enter a string\n" + "0 to quit");
        while(!quit) {
            System.out.println("Option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index,stringInput);
                    index++;
                    break;
            }
        }

        return values;
    }
}*/
