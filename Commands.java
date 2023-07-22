import java.util.Scanner;

public class Commands {
    private UserDao userDao;

    public Commands(UserDao userDao) {
        this.userDao = userDao;
    }

    public void addUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        User newUser = new User(username, email);
        userDao.addUser(newUser);
    }

    public void removeUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username of the user to remove: ");
        String username = scanner.nextLine();

        User userToRemove = null;
        for (User user : userDao.getUsers()) {
            if (user.getUsername().equals(username)) {
                userToRemove = user;
                break;
            }
        }

        if (userToRemove != null) {
            userDao.removeUser(userToRemove);
        } else {
            System.out.println("User not found.");
        }
    }

    // Add code for other commands (e.g., editUser, listUsers) here
}
