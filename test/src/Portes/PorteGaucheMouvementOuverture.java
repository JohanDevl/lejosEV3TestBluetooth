package Portes;
import lejos.hardware.motor.BaseRegulatedMotor;
import lejos.hardware.motor.Motor;
import lejos.hardware.motor.NXTRegulatedMotor;


public class PorteGaucheMouvementOuverture implements EtatPortes {
	Portail portail;
	
	public PorteGaucheMouvementOuverture(Portail portail, NXTRegulatedMotor moteur1, NXTRegulatedMotor moteur2) {
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
	
		
	}

	@Override
	public void bloquer() {
		portail.setEtatPortes(portail.getPortesBloquees());
		
	}

}
