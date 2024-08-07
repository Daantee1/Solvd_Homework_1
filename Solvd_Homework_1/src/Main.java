public class Main {
    public static void main(String[] args) {


        if (args.length < 4) {
            System.out.println("Please provide user information: <FirstName> <LastName> <Email> <City>");
            return;
        }

        String firstName = args[0];
        String lastName = args[1];
        String email = args[2];
        String city = args[3];

        UserInfo userInfo = new UserInfo(firstName, lastName, email, city);
        userInfo.printInfo();



    }
}
