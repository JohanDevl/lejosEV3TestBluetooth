package Portes;

import lejos.hardware.motor.Motor;
import lejos.hardware.motor.NXTRegulatedMotor;

public class PortesFermees implements EtatPortes {
	Portail portail;
	
	public PortesFermees(Portail portail, NXTRegulatedMotor moteur1, NXTRegulatedMotor moteur2) {
		this.portail=portail;
	}

	@Override
	public void ouvrirPortes() {
		//porte gauche
		Motor.A.setAcceleration(50);
		Motor.A.forward();
				
		//porte droite
		Motor.B.setAcceleration(50);
		Motor.B.forward();
		portail.setEtatPortes(portail.getPortesMouvementsOuverture());
		
	}

	@Override
	public void fermerPortes() {
		portail.setEtatPortes(portail.getPortesFermees());
	}

	@Override
	public void ouvrirgauche() {
		portail.setEtatPortes(portail.getPortesGaucheMouvementOuvertes());
	}

	@Override
	public void bloquer() {
		portail.setEtatPortes(portail.getPortesBloquees());
	}

}
