package czarnotalukasz.cwiczeniaRozne.wzorceProjektowe;

interface Robot{
    void work();
}
interface RobotFactory {
    Robot GetRobot();
}
class AccountingRobot implements Robot{
    private AccountingRobot(){}
    public void work(){
        System.out.println("I'm Accounting Robot and I'm counting");
    }
    public static RobotFactory factory = () -> new AccountingRobot();
}
class DrillingRobot implements Robot {
    private DrillingRobot(){}
    public void work(){
        System.out.println("I'm Drilling Robot and i'm drilling");
    }
    public static RobotFactory factory = () -> new DrillingRobot();
}
class JokeRobot implements Robot {
    private JokeRobot(){}
    public void work(){
        System.out.println("I'm Joke Robot and I've bad joke");
    }
    public static RobotFactory factory = JokeRobot::new;
}
public class FabrykaPrzykładRobota {
    public static void robotConsumer(RobotFactory fact) {
        Robot rob = fact.GetRobot();
        rob.work();
    }

    public static void main(String[] args) {
        robotConsumer(AccountingRobot.factory);
        robotConsumer(JokeRobot.factory);
        robotConsumer(DrillingRobot.factory);
    }
}
