// This file was generated by Mendix Modeler 7.0.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package testslackconnector.proxies.constants;

import com.mendix.core.Core;

public class Constants
{
	// These are the constants for the TestSlackConnector module

	public static java.lang.String getAuthenticationToken()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("TestSlackConnector.AuthenticationToken");
	}
}