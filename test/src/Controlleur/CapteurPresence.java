package Controlleur;

import lejos.hardware.sensor.BaseSensor;
import lejos.hardware.sensor.NXTTouchSensor;
import lejos.hardware.sensor.SensorMode;

public class CapteurPresence {

	private Controlleur controlleur;
	private BaseSensor sensor;
	
	public CapteurPresence(BaseSensor sensor) {
		controlleur = null;
		this.sensor = sensor;
	}
	
	public void alerteCollision() {
		this.controlleur.bloquer();
	}

	public void setControlleur(Controlleur controlleur) {
		this.controlleur = controlleur;
		
	}

}
