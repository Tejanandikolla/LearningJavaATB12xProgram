//Task 3: "Multilevel Login System"
//📄 Description: (Multilevel Inheritance)
//Create a class User with a method login().
//Extend it with a class AdminUser that adds a method accessAdminPanel().
//Then create a SuperAdmin class that extends AdminUser and adds a method shutdownSystem().
//Use an object of SuperAdmin to call all three

package Task9thjuly_inheritence;
class User{
    void login(){
        System.out.println("login done here ");
    }
}
class AdminUser extends User{
    void accessAdminPanel(){
        System.out.println("Accessing  admin panel");
    }
}
class SuperAdmin extends AdminUser{
    void shutdownSystem(){
        System.out.println("shutting downSystem");
    }
}

public class multilevelloginsys {
    public static void main(String[] args) {
        SuperAdmin s=new SuperAdmin();
        s.login();
        s.accessAdminPanel();
        s.shutdownSystem();
    }
}
