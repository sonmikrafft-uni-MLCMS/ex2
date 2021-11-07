package org.vadere.state.attributes.models;

import java.util.Arrays;
import java.util.List;

import org.vadere.annotation.factories.attributes.ModelAttributeClass;
import org.vadere.state.attributes.Attributes;

@ModelAttributeClass
public class AttributesSIRG extends Attributes {

	private int infectionsAtStart = 0;
	private double infectionRate = 0.01;
	private double infectionMaxDistance = 1;

	// if false, then infectionRate is interpreted as per simulated step.
	// then it is coupled with the `simTimeStepLength`.
	// set this to true to interpret the infectionRate as per second.
	private boolean isInfectionRatePerSecond = false;

	public int getInfectionsAtStart() { return infectionsAtStart; }

	public double getInfectionRate() {
		return infectionRate;
	}

	public double getInfectionMaxDistance() {
		return infectionMaxDistance;
	}

	public boolean getIsInfectionRatePerSecond() { return isInfectionRatePerSecond; }

}
