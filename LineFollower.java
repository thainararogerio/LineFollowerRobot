import lejos.nxt.*;

public class LineFollower {
	public static void main(String[] args) throws InterruptedException {
		ColorSensor color = new ColorSensor(SensorPort.S3);		
		while(true){ 
			if(color.getColorID()==Color.WHITE||color.getColorID()==Color.YELLOW){ 
				Motor.B.rotate(12, true);	
			} else {
				Motor.C.rotate(20, true);
			}
		}
	}
}
