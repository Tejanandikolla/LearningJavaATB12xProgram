    //Task 4: Login Functionality
    //Title: Different login behaviors for users
    //Description:
    //Create a class User with method login() that prints “User login”.
    //Create subclasses AdminUser and RegularUser, each overriding login() with their own logic/messages.
    //Demonstrate calling the login() method using base class reference to highlight runtime polymorphism.

package Task10thjuly.MethodOverriding;
class User{
    public void login(){
        System.out.println("User login");
    }
}
class AdminUser extends User{
    public void login(){
        System.out.println("This is Admin User login with admin privileges");

    }
}
class RegularUser extends User{
    public void login(){
        System.out.println("This is Regular user login with basic privileges ");
    }
}

public class Loginfunc {
    public static void main(String[] args) {
        User admin=new AdminUser();
        admin.login();
        User regular=new RegularUser();
        regular.login();
        User user=new User();
        user.login();

    }
}
