package onlineStore;

import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class IOUserDataImpl implements IOdata{

    private IOdata iOdata;

    public IOUserDataImpl(IOdata iOdata) {
        this.iOdata = iOdata;
    }

    public IOUserDataImpl() {

    }

    public IOdata getiOdata() {
        return iOdata;
    }

    public void setiOdata(IOdata iOdata) {
        this.iOdata = iOdata;
    }

    @Override
    public void entrance() {
        System.out.println("Hello, yuo are in the Best site of Belarus!! Make your choice,please!!");
        System.out.println("You are in Main menu");
        System.out.println("1 - Main menu ");
        System.out.println("2 - Show goods");
        System.out.println("3 - Log in");
        System.out.println("4 - Exit");
        ChoiceMenuImpl choiceMenu = new ChoiceMenuImpl();
        choiceMenu.choice();

    }

    @Override
    public void inputData() {


            System.out.println("Hello my friend!!");
            System.out.println("Enter your nickname please!");

            try(Scanner scanner = new Scanner(System.in)){
            String nickname = scanner.next();
            System.out.println("Enter please number - your password");
            Integer password = scanner.nextInt();
            DataBase.setVisitors(nickname,password);
            }



    }

    @Override
    public void outputData() {

    }
}
