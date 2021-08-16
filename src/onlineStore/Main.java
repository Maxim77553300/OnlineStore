package onlineStore;

public class Main {
    public static void main(String[] args) {

//        UserService userService = new UserService("Stepan",new UserDaoImpl());
////        UserService userService = new UserService("Stepan",new UserDaoImpl());
//        userService.print();

        IOUserDataImpl user = new IOUserDataImpl();

        user.entrance();


    }
}
