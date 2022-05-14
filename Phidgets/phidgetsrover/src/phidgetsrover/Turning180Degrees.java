package phidgetsrover;

//Add Phidgets Library
import com.phidget22.*;

public class Turning180Degrees {
    public static void main(String[] args) throws Exception {

        //Connect to wireless rover
        Net.addServer("", "192.168.100.1", 5661, "", 0);

        //Create
        DCMotor leftMotors = new DCMotor();
        DCMotor rightMotors = new DCMotor();

        //Address
        leftMotors.setChannel(0);
        rightMotors.setChannel(1);

        //Open
        leftMotors.open(5000);
        rightMotors.open(5000);

        //Move forward
        leftMotors.setTargetVelocity(1);
        rightMotors.setTargetVelocity(1);

        //Wait for 2 second
        Thread.sleep(2000);
        
        //Turn 180 degrees
        leftMotors.setTargetVelocity(-1);
        rightMotors.setTargetVelocity(1);
        
        //Wait for 5 second
        Thread.sleep(5000);
        
        //Move back to starting position
        leftMotors.setTargetVelocity(1);
        rightMotors.setTargetVelocity(1);

        //Wait for 2 second
        Thread.sleep(2000);

        //Stop motors
        leftMotors.setTargetVelocity(0);
        rightMotors.setTargetVelocity(0);
    }
}
