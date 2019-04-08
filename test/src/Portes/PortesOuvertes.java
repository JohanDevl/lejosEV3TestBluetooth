package Portes;

import lejos.hardware.motor.Motor;
import lejos.hardware.motor.NXTRegulatedMotor;

public class PortesOuvertes implements EtatPortes{

	Portail portail;
	
	public PortesOuvertes(Portail newPortail, NXTRegulatedMotor moteur1, NXTRegulatedMotor moteur2) {
		portail = newPortail;
	}
	

	@Override
	public void ouvrirPortes() {
		portail.setEtatPortes(portail.getPortesMouvementsFermetures());
		
	}

	@Override
	public void fermerPortes() {
		//porte gauche
		Motor.A.setAcceleration(50);
		Motor.A.backward();
				
		//porte droite
		Motor.B.setAcceleration(50);
		Motor.B.backward();
		portail.setEtatPortes(portail.getPortesMouvementsFermetures());
	}

	@Override
	public void ouvrirgauche() {
		portail.setEtatPortes(portail.getPortesMouvementsFermetures());
	}

	@Override
	public void bloquer() {
		portail.setEtatPortes(portail.getPortesBloquees());
		
	}

}
