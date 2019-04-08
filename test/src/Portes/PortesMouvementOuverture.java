package Portes;

import lejos.hardware.motor.Motor;
import lejos.hardware.motor.NXTRegulatedMotor;

public class PortesMouvementOuverture implements EtatPortes {
	Portail portail;
	
	public PortesMouvementOuverture(Portail portail, NXTRegulatedMotor moteur1, NXTRegulatedMotor moteur2) {
		this.portail = portail;
	}

	@Override
	public void ouvrirPortes() {
		
		portail.setEtatPortes(portail.getPortesBloquees());
		
	}

	@Override
	public void fermerPortes() {
		portail.setEtatPortes(portail.getPortesBloquees());
		
	}

	@Override
	public void ouvrirgauche() {
		portail.setEtatPortes(portail.getPortesBloquees());
		
	}

	@Override
	public void bloquer() {
		portail.setEtatPortes(portail.getPortesBloquees());
		
	}

}
