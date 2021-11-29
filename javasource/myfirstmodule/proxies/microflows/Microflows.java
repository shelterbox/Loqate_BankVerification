// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;

public class Microflows
{
	// These are the microflows for the MyFirstModule module
	public static void tEST_BatchValidateV1(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("MyFirstModule.TEST_BatchValidateV1").withParams(params).execute(context);
	}
	public static void tEST_InteractiveRetrieveBySortcodeV1(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("MyFirstModule.TEST_InteractiveRetrieveBySortcodeV1").withParams(params).execute(context);
	}
	public static boolean tEST_InteractiveValidateV2_Failing(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("MyFirstModule.TEST_InteractiveValidateV2_Failing").withParams(params).execute(context);
	}
	public static boolean tEST_InteractiveValidateV2_Passing(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("MyFirstModule.TEST_InteractiveValidateV2_Passing").withParams(params).execute(context);
	}
	public static boolean tEST_InternationalInteractiveValidateV1_Failing(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("MyFirstModule.TEST_InternationalInteractiveValidateV1_Failing").withParams(params).execute(context);
	}
	public static boolean tEST_InternationalInteractiveValidateV1_Passing(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("MyFirstModule.TEST_InternationalInteractiveValidateV1_Passing").withParams(params).execute(context);
	}
}