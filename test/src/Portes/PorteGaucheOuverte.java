package Portes;

import lejos.hardware.motor.Motor;
import lejos.hardware.motor.NXTRegulatedMotor;

public class PorteGaucheOuverte implements EtatPortes{
	Portail portail;
	
	public PorteGaucheOuverte(Portail portail, NXTRegulatedMotor moteur1, NXTRegulatedMotor moteur2) {
		this.portail = portail;
	}

	@Override
	public void ouvrirPortes() {
		portail.setEtatPortes(portail.getPortesMouvementsOuverture());
		
	}

	@Override
	public void fermerPortes() {
		//porte gauche
		Motor.A.setAcceleration(50);
		Motor.A.forward();	
		portail.setEtatPortes(portail.getPortesMouvementsFermetures());
		
	}

	@Override
	public void ouvrirgauche() {
		portail.setEtatPortes(portail.getPortesMouvementsOuverture());
		
	}

	@Override
	public void bloquer() {
		
		portail.setEtatPortes(portail.getPortesBloquees());
		
	}

}
