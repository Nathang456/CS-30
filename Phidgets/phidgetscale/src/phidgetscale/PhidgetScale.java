package phidgetscale;

//Add Phidgets Library
import com.phidget22.*;

public class PhidgetScale {
	
    public static void main(String[] args) throws Exception{

        //Create
        VoltageRatioInput scale = new VoltageRatioInput();
        
        //Open
        scale.open(1000);
        System.out.println("Calculating Offset");

	  	int length = 63;
  		double sample = scale.getVoltageRatio();

  		for(int i=0;i<length;i++){
  			sample = sample + scale.getVoltageRatio();	   				
	    }

  		double offsetValue = sample / length;
        System.out.println("Offset Value: " + offsetValue); 

        //Use your Phidgets
        while(true){

            //Calculate Weight (kg)
            double weight = 4697 * (scale.getVoltageRatio() - offsetValue);
            //Convert kg to grams
            double grams = weight * 1000;
			//Convert kg to pounds
			double lbs = weight * 2.205;            

            //Display Weight
            System.out.println(String.format("%.3f kg", weight, " grams", grams, " lbs", lbs));      
            
            Thread.sleep(250);
        }
    }    
}
