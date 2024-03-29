package generatedbyassl.as.aes.host.aeself_management.self_healing;

import java.io.Serializable;
import generatedbyassl.as.*;

/**
 * Generated by ASSL Framework
 * 
 * This is the Java class generated for 'InUnFunctionalitySimulation' (specified as FLUENT ASSL tier).
 */
public class INUNFUNCTIONALITYSIMULATION
	extends ASSLFLUENT
	implements  Serializable
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * This is a reference to the unique instance of 'INUNFUNCTIONALITYSIMULATION' class.
	 */
	static private INUNFUNCTIONALITYSIMULATION oInstance = null;
	/**
	 * Generated by ASSL Framework
	 * 
	 * Needed by the class because it implements the Serializable interface.
	 */
	static final long serialVersionUID = 0001L;

	/**
	 * Generated by ASSL Framework
	 * 
	 * Because this is a singleton class its constructor is private.
	 */
	private  INUNFUNCTIONALITYSIMULATION (  )
	{
		vInitiatedByEvents.add( generatedbyassl.as.aes.host.events.TIMETOSIMULATEUNFUNCTIONALITY.getInstance() );
		generatedbyassl.as.aes.host.events.TIMETOSIMULATEUNFUNCTIONALITY.getInstance().addEventCatcher(this); //**** fluent registers for that event
		vTerminatedByEvents.add( generatedbyassl.as.aes.host.events.UNFUNCTIONALITY.getInstance() );
		generatedbyassl.as.aes.host.events.UNFUNCTIONALITY.getInstance().addEventCatcher(this); //**** fluent registers for that event
		vTerminatedByEvents.add( generatedbyassl.as.aes.host.events.HOSTINUNFUNCTIONAL.getInstance() );
		generatedbyassl.as.aes.host.events.HOSTINUNFUNCTIONAL.getInstance().addEventCatcher(this); //**** fluent registers for that event
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method returns the unique instance of 'INUNFUNCTIONALITYSIMULATION' class.
	 */
	static public INUNFUNCTIONALITYSIMULATION getInstance (  )
	{
		if ( null == oInstance ) 
		{
			oInstance = new INUNFUNCTIONALITYSIMULATION();
		}
		return oInstance;
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method calls all the fluent-mapped actions in sequence.
	 */
	protected synchronized void callFluentActions (  )
	{
	}

}