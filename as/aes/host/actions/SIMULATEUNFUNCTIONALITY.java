package generatedbyassl.as.aes.host.actions;

import java.io.Serializable;
import generatedbyassl.as.ASSLACTION;

/**
 * Generated by ASSL Framework
 * 
 * This is the Java class generated for 'SimulateUnFunctionality' (specified as ACTION ASSL tier).
 */
public class SIMULATEUNFUNCTIONALITY
	extends ASSLACTION
	implements  Serializable
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * This is a reference to the unique instance of 'SIMULATEUNFUNCTIONALITY' class.
	 */
	static private SIMULATEUNFUNCTIONALITY oInstance = null;
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
	private  SIMULATEUNFUNCTIONALITY (  )
	{
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method returns the unique instance of 'SIMULATEUNFUNCTIONALITY' class.
	 */
	static public SIMULATEUNFUNCTIONALITY getInstance (  )
	{
		if ( null == oInstance ) 
		{
			oInstance = new SIMULATEUNFUNCTIONALITY();
		}
		return oInstance;
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Provides conditions to be fulfilled before processing the action.
	 */
	public boolean GUARDS (  )
	{
		boolean bResult = true;
		bResult =  generatedbyassl.as.aes.host.aeself_management.self_healing.INUNFUNCTIONALITYSIMULATION.getInstance().isFluentInitiated()  &&  generatedbyassl.as.aes.host.metrics.NETWORKMETRIC.getInstance().isValid()  ;
		return bResult;
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Embeds statements to be performed by the action if the GURADS conditions are fulfilled.
	 */
	public void DOES (  )
	{
		super.DOES();
		//generatedbyassl.as.aes.host.metrics.NETWORKMETRIC.getInstance().VALUE = 0.0001 ;
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Triggers events in case the action is not successfully performed.
	 */
	public void ONERR_TRIGGERS (  )
	{
		generatedbyassl.as.aes.host.events.HOSTINUNFUNCTIONAL.getInstance().triggerEvent();
	}

}