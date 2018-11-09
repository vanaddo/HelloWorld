import java.awt.*;
import java.security.PublicKey;
//awt = abstract window toolkit library imports everything from awt and recognizes the "Color" data type

public class Car {
  double averageMilesPerGallon;
  String licensePlate;
  Color paintColor;
  boolean areTailLightsWorking;

   public Car(
              double inputAveragMPG,
              String  inputLicensePlate,
              Color inputPaintColor,
              boolean inputAreTailLightsWorking){
    this.averageMilesPerGallon = inputAveragMPG;
    this.licensePlate = inputLicensePlate;
    this.paintColor = inputPaintColor;
    this.areTailLightsWorking = inputAreTailLightsWorking;
   }

   public void changePaintColor(Color newPaintColor){

     this.paintColor = newPaintColor;
   }

  public double speedingUp(double currentSpeed){
     currentSpeed += 100;
     return currentSpeed;
  }
}
