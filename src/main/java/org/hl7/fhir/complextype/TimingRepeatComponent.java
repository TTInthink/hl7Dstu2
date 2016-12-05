package org.hl7.fhir.complextype;

import org.hl7.fhir.BoundsChoiceType;
import org.hl7.fhir.primitivetype.DecimalType;
import org.hl7.fhir.primitivetype.IntegerType;
import org.hl7.fhir.primitivetype.restriction.CodeType;
import org.hl7.fhir.primitivetype.restriction.controlledstring.EventTiming;
import org.hl7.fhir.primitivetype.restriction.controlledstring.UnitsOfTime;
import org.hl7.fhir.type.Element;


public class TimingRepeatComponent extends Element{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1165355865812495444L;
	private BoundsChoiceType bounds;
	private IntegerType count;
//	duration SHALL be a non-negative value
	private DecimalType duration;
//	How long when it happens (Max)
	private DecimalType durationMax;
//	s | min | h | d | wk | mo | a - unit of time (UCUM) UnitsOfTime
	private CodeType<UnitsOfTime> durationUnits;
	private IntegerType frequency;
	private IntegerType frequencyMax;
	private DecimalType period;
	private DecimalType periodMax;
	//UnitsOfTime
	private CodeType<UnitsOfTime> periodUnits;
	//EventTiming
	private CodeType<EventTiming> when;
	public BoundsChoiceType getBounds() {
		return bounds;
	}
	public void setBounds(BoundsChoiceType bounds) {
		this.bounds = bounds;
	}
	public IntegerType getCount() {
		return count;
	}
	public void setCount(IntegerType count) {
		this.count = count;
	}
	public DecimalType getDuration() {
		return duration;
	}
	public void setDuration(DecimalType duration) {
		this.duration = duration;
	}
	public DecimalType getDurationMax() {
		return durationMax;
	}
	public void setDurationMax(DecimalType durationMax) {
		this.durationMax = durationMax;
	}
	public CodeType<UnitsOfTime> getDurationUnits() {
		return durationUnits;
	}
	public void setDurationUnits(CodeType<UnitsOfTime> durationUnits) {
		this.durationUnits = durationUnits;
	}
	public IntegerType getFrequency() {
		return frequency;
	}
	public void setFrequency(IntegerType frequency) {
		this.frequency = frequency;
	}
	public IntegerType getFrequencyMax() {
		return frequencyMax;
	}
	public void setFrequencyMax(IntegerType frequencyMax) {
		this.frequencyMax = frequencyMax;
	}
	public DecimalType getPeriod() {
		return period;
	}
	public void setPeriod(DecimalType period) {
		this.period = period;
	}
	public DecimalType getPeriodMax() {
		return periodMax;
	}
	public void setPeriodMax(DecimalType periodMax) {
		this.periodMax = periodMax;
	}
	public CodeType<UnitsOfTime> getPeriodUnits() {
		return periodUnits;
	}
	public void setPeriodUnits(CodeType<UnitsOfTime> periodUnits) {
		this.periodUnits = periodUnits;
	}
	public CodeType<EventTiming> getWhen() {
		return when;
	}
	public void setWhen(CodeType<EventTiming> when) {
		this.when = when;
	}
	
	
}
