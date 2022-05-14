package phidgetsrover;

//Add Phidgets Library
import com.phidget22.*;

public class Challenge {
    public static void main(String[] args) throws Exception {

        //Connect to wireless rover
        Net.addServer("", "192.168.100.1", 5661, "", 0);

        //Create
        DCMotor leftMotors = new DCMotor();
        DCMotor rightMotors = new DCMotor();
        DistanceSensor sonar = new DistanceSensor();

        //Address
        leftMotors.setChannel(0);
        rightMotors.setChannel(1);

        //Open
        leftMotors.open(5000);
        rightMotors.open(5000);
        sonar.open(5000);

        while (true) {
        	
        	System.out.println("Distance: " + sonar.getDistance() + " mm");

        	  if (sonar.getDistance() < 200) {

                  //Turn 180 degrees
                  leftMotors.setTargetVelocity(-1);
                  rightMotors.setTargetVelocity(1);
                  
                  Thread.sleep(5000);
                  
              } else {
                  
            	  leftMotors.setTargetVelocity(1);
                  rightMotors.setTargetVelocity(1);

                  Thread.sleep(10000);
                  
                  leftMotors.setTargetVelocity(1);
                  rightMotors.setTargetVelocity(-1);
                  
                  Thread.sleep(5000);
            	  
              }

              //Wait for 100 milliseconds
              Thread.sleep(100);

        }
    }
}
