package generatedbyassl.as.aes.host.aeip.messages;

import java.io.Serializable;
import generatedbyassl.as.ASSLMESSAGE;

/**
 * Generated by ASSL Framework
 * 
 * This is the Java class generated for 'FunctionalityMsg' (specified as MESSAGE ASSL tier).
 */
public class FUNCTIONALITYMSG
	extends ASSLMESSAGE
	implements  Serializable
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * This is a reference to the unique instance of 'FUNCTIONALITYMSG' class.
	 */
	static private FUNCTIONALITYMSG oInstance = null;
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
	private  FUNCTIONALITYMSG (  )
	{
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method returns the unique instance of 'FUNCTIONALITYMSG' class.
	 */
	static public FUNCTIONALITYMSG getInstance (  )
	{
		if ( null == oInstance ) 
		{
			oInstance = new FUNCTIONALITYMSG();
		}
		return oInstance;
	}

}