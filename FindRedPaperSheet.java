import lejos.nxt.*;

public class FindRedPaperSheet {
	public static void main(String[] args) throws InterruptedException {
		UltrasonicSensor distanceSensor = new UltrasonicSensor(SensorPort.S2);
		ColorSensor colorSensor = new ColorSensor(SensorPort.S3);
		int distance = 20;

		while (distanceSensor.getDistance() > distance) {
			Motor.B.rotate(30);
			Motor.C.rotate(30);
		}

		Motor.C.rotate(650);
		while (colorSensor.getColorID() != Color.RED) {
		  while((distanceSensor.getDistance() > distance) && (colorSensor.getColorID()!=Color.RED)) {
			Motor.B.rotate(30);
			Motor.C.rotate(30);
		  }

		  Motor.C.rotate(650);
		  distance += 10;
		}
	}
}
