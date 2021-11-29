// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package loqate_bankverification.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the Loqate_BankVerification module
	public static java.util.List<loqate_bankverification.proxies.Batch_Validate_v1_Results> batchValidateV1(IContext context, loqate_bankverification.proxies.Batch_Validate_v1_Request _request)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Request", _request == null ? null : _request.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("Loqate_BankVerification.BatchValidateV1").withParams(params).execute(context);
		java.util.List<loqate_bankverification.proxies.Batch_Validate_v1_Results> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(loqate_bankverification.proxies.Batch_Validate_v1_Results.initialize(context, obj));
		}
		return result;
	}
	public static java.lang.String cALC_ServiceKey(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.String) Core.microflowCall("Loqate_BankVerification.CALC_ServiceKey").withParams(params).execute(context);
	}
	public static loqate_bankverification.proxies.Interactive_RetrieveBySortcode_v1_Results interactiveRetrieveBySortcodeV1(IContext context, loqate_bankverification.proxies.Interactive_RetrieveBySortcode_v1_Request _request)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Request", _request == null ? null : _request.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("Loqate_BankVerification.InteractiveRetrieveBySortcodeV1").withParams(params).execute(context);
		return result == null ? null : loqate_bankverification.proxies.Interactive_RetrieveBySortcode_v1_Results.initialize(context, result);
	}
	public static loqate_bankverification.proxies.Interactive_Validate_v2_Results interactiveValidateV2(IContext context, loqate_bankverification.proxies.Interactive_Validate_v2_Request _request)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Request", _request == null ? null : _request.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("Loqate_BankVerification.InteractiveValidateV2").withParams(params).execute(context);
		return result == null ? null : loqate_bankverification.proxies.Interactive_Validate_v2_Results.initialize(context, result);
	}
	public static boolean internationalInteractiveValidateV1(IContext context, loqate_bankverification.proxies.International_Interactive_Validate_v1_Request _request)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Request", _request == null ? null : _request.getMendixObject());
		return (java.lang.Boolean) Core.microflowCall("Loqate_BankVerification.InternationalInteractiveValidateV1").withParams(params).execute(context);
	}
}