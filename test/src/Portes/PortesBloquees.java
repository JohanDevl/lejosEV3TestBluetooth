package Portes;

import lejos.hardware.motor.NXTRegulatedMotor;

public class PortesBloquees implements EtatPortes {
	private Portail portail;
	
	public PortesBloquees(Portail portail, NXTRegulatedMotor moteur1, NXTRegulatedMotor moteur2) {
		this.portail = portail;
	}

	@Override
	public void ouvrirPortes() {
		portail.setEtatPortes(portail.getPortesMouvementsFermetures());
	}

	@Override
	public void fermerPortes() {
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
