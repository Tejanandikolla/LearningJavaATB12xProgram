package Task7thjuneinheritence.Hierarchical;

public class TC {
    public static void main(String[] args) {
        login_fun l1 =new login_fun();
        Browserclose b1 =new Browserclose();
        l1.launch_browser();
        l1.loginfunction();
        b1.launch_browser();
        b1.close();
    }
}
