package onlineStore;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class ChoiceMenuImpl implements ChoiceMenu{
    @Override
    public void choice() {
        boolean flag = true;
        Integer number;

        IOUserDataImpl ioUserData = new IOUserDataImpl();

            try(Scanner scanner = new Scanner(System.in)) {
                while (flag==true) {

                    number = scanner.nextInt();

                    switch (number) {
                    case 1:
                        System.out.println("Main menu");
                        break;
                    case 2:
                        System.out.println("Show goods");
                        break;
                    case 3:
                        System.out.println("Log in");
                        ioUserData.inputData();
                        break;
                    case 4:
                        System.out.println("Exit");
                        flag = false;
                        break;
                    default:
                        System.out.println("Error");
                        break;

                }
            }
        } catch (NoSuchElementException e){
                System.out.println("ERROR  ChoiceMenu");
                e.printStackTrace();
            }


    }

    @Override
    public void exit() {

    }
}
