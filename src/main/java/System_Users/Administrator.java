package System_Users;
import java.util.Scanner;
public class Administrator extends Person {
   private String password;
   private String username;
    public Administrator (String name,String phone_number,String national_id,String gender,String password) {
        super(name, phone_number, national_id, gender);
    }
    public Administrator (String password,String username){
        this.password=password;
        this.username=username;
    }

    public String get_username () {
        return this.username;
    }

    public String get_password () {
        return this.password;
    }

    public void set_username (String username) {
        this.username=username;
    }
    public void set_password (String password) {
        this.password=password;
    }

    public void login () {

            username = "farah";
            password = "123";

            Scanner Username = new Scanner(System.in);
            System.out.println("Please Enter Username : ");
            String user = Username.next();

            Scanner Password = new Scanner(System.in);
            System.out.println("Please Enter Password : ");
            String pass = Password.next();

            if (username.equals(user) && password.equals(pass)) {

                System.out.println("Logged In");
            }

            else if (username.equals(user)) {
                System.out.println("Invalid Password!");
            } else if (password.equals(pass)) {
                System.out.println("Invalid Username!");
            } else {
                System.out.println("Invalid Username And Password!");
            }

        }

    }
