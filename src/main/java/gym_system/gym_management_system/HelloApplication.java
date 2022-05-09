package gym_system.gym_management_system;

//import Gym_Components.Gym_Class;
import Gym_Components.Gym_Class;
import Gym_Components.Member;
import Gym_Components.Trainer;
import System_Users.Administrator;
import System_Users.Employee;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

//import static Gym_Components.Member.getMemberList;
//import static Gym_Components.Member.getMemberList;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

List <Employee> employees = new ArrayList<>();
List <Trainer> trainers =new ArrayList<>();
List <Administrator> admins= new ArrayList<>();
List <Gym_Class> gym_classes =new ArrayList<>();

/**
 * admin methods
 *
 */
// phone number handling
Administrator admin1=new Administrator("Farah" ,"3020", "female","0101000" , "123" , "farouha" );
Administrator admin2=new Administrator("sara" ,"358", "female","0101000" , "189" , "sarsoura" );
admins.add(admin1);
admins.add(admin2);
Trainer trainer1=new Trainer("Ahmed" ,"302050", "female","01010600");
trainers.add(trainer1);
//System.out.println(admin1.findTrainer(trainers , "302050"));
//admin1.edit_trainer(trainers);
//System.out.println(trainer1.get_name());
//Instant start_time = Gym_Class.get_instant();
//Instant end_time = Gym_Class.get_instant();
//Gym_Class class1=new Gym_Class("yoga","low",10,start_time,end_time);
////System.out.println(class1.getStart_time());
//    admin1.assign_trainer_to_class(trainer1,class1);
//    System.out.println(trainer1.getGymClasses());
        while (true){
        admin1.login(admins);}




// Employee methods
// *
// */

//
//        System.out.println("Testing Output");
//        Gym_Class Fitness= new Gym_Class("Fitness","Fitness",5, null, null);
//        Administrator admin = new Administrator("zeko","zeko");
//        Administrator.getGymClassesList().add(Fitness);
//        Member member= new Member("mohamed", "100", "male", "0101010",1);
//        Employee.addMemberToList(member);
//        Employee.addMemberToClass(member,Fitness);
//        Employee.viewMemberClasses(member);
////        System.out.println(Employee.viewMemberList());
//        Member gira= new Member("gira", "99", "male", "0101010",2);
//        Employee.addMemberToList(gira);
//        System.out.println(Employee.viewMemberList());




        //launch();
    }
}