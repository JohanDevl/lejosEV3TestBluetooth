package test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import Controlleur.CapteurPresence;
import Controlleur.Controlleur;
import Controlleur.Lumiere;
import Portes.Portail;
import lejos.hardware.Bluetooth;
import lejos.hardware.ev3.LocalEV3;
import lejos.hardware.port.AnalogPort;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.Port;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.NXTColorSensor;
import lejos.hardware.sensor.NXTLightSensor;
import lejos.hardware.sensor.NXTTouchSensor;
import lejos.remote.nxt.BTConnection;
import lejos.remote.nxt.BTConnector;
import lejos.remote.nxt.NXTConnection;
import lejos.robotics.EncoderMotor;

public class mainTest {
	
	private static DataOutputStream dataOut; 
	private static DataInputStream dataIn;
	private static BTConnection BTLink;
	private static int transmitReceived=0;
	private static int power = 50;
	private static boolean app_alive;
	
	private static EncoderMotor motorLeft;
	private static EncoderMotor motorRight;

	public static void main(String[] args) throws Exception {
			
		connect();
		
		//motorLeft = new NXTMotor (MotorPort.A);
		//motorRight = new NXTMotor (MotorPort.B);
//		motorLeft.setPower(power);
//	    motorRight.setPower(power);
//	    motorLeft.stop();
//	    motorRight.stop();
		AnalogPort port1 = (AnalogPort) LocalEV3.get().getPort("S1");
		AnalogPort port2 = (AnalogPort) LocalEV3.get().getPort("S2");
		AnalogPort port3 = (AnalogPort) LocalEV3.get().getPort("S3");
	    NXTTouchSensor touchSens = new NXTTouchSensor(port1);
	    NXTLightSensor lightSens = new NXTLightSensor(port2);
	    NXTColorSensor colorSens = new NXTColorSensor(port3);
	    Portail portail1 = new Portail();
	    Lumiere lumiere = new Lumiere();
	    CapteurPresence capteur1 = new CapteurPresence(touchSens), capteur2 = new CapteurPresence(lightSens), capteur3 = new CapteurPresence(colorSens);
	    
	    Controlleur control = new Controlleur(portail1, lumiere, capteur1, capteur2, capteur3);
//	    
	    while(true){
			  try {
			       transmitReceived = (int) dataIn.readByte();
			       System.out.println("Received " + transmitReceived);
			       switch(transmitReceived){
			       // Forwards
			       case 1:
			    	   System.out.println("recu 1");
			    	   break;
			    	   
			       // Backwards
			       case 2: 
			    	   System.out.println("recu 2");
			    	   break;
		    	   }
			   }
			    
			       catch (IOException ioe) {
			       System.out.println("IO Exception readInt");
			   }
		}
	    
//	    motorLeft.flt();
//		motorRight.flt();	
	
}
	public static void connect()
	 {  
	    System.out.println("Listening");
	    BTConnector ncc = (BTConnector) Bluetooth.getNXTCommConnector();
	    BTLink = (BTConnection) ncc.waitForConnection(30000, NXTConnection.RAW);
	    dataOut = BTLink.openDataOutputStream();
	    dataIn = BTLink.openDataInputStream();
	 }
}

	