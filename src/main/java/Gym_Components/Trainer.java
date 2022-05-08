package Gym_Components;
import System_Users.Person;
import java.util.*;


public class Trainer extends Person {
    private List<Gym_Class> gymClasses;
    private List<Member> members;


    public Trainer(String name, String national_id, String gender, String phone_number) {
        super(name.toUpperCase(Locale.ROOT), national_id, gender, phone_number);
        this.gymClasses = new ArrayList();
        this.members = new ArrayList();
    }

    public List<Gym_Class> getGymClasses() {
        return gymClasses;
    }

    public void setGymClasses(List<Gym_Class> gymClasses) {
        this.gymClasses = gymClasses;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }
}