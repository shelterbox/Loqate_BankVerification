// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package loqate_bankverification.proxies.constants;

import com.mendix.core.Core;

public class Constants
{
	// These are the constants for the Loqate_BankVerification module

	public static java.lang.String getServiceKey()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("Loqate_BankVerification.ServiceKey");
	}
}