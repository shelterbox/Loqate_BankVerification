// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package loqate_bankverification.proxies;

public class Interactive_RetrieveBySortcode_v1_Response extends loqate_bankverification.proxies.Response
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Loqate_BankVerification.Interactive_RetrieveBySortcode_v1_Response";

	public Interactive_RetrieveBySortcode_v1_Response(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Loqate_BankVerification.Interactive_RetrieveBySortcode_v1_Response"));
	}

	protected Interactive_RetrieveBySortcode_v1_Response(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject interactive_RetrieveBySortcode_v1_ResponseMendixObject)
	{
		super(context, interactive_RetrieveBySortcode_v1_ResponseMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("Loqate_BankVerification.Interactive_RetrieveBySortcode_v1_Response", interactive_RetrieveBySortcode_v1_ResponseMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Loqate_BankVerification.Interactive_RetrieveBySortcode_v1_Response");
	}

	/**
	 * @deprecated Use 'Interactive_RetrieveBySortcode_v1_Response.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static loqate_bankverification.proxies.Interactive_RetrieveBySortcode_v1_Response initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return loqate_bankverification.proxies.Interactive_RetrieveBySortcode_v1_Response.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static loqate_bankverification.proxies.Interactive_RetrieveBySortcode_v1_Response initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new loqate_bankverification.proxies.Interactive_RetrieveBySortcode_v1_Response(context, mendixObject);
	}

	public static loqate_bankverification.proxies.Interactive_RetrieveBySortcode_v1_Response load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return loqate_bankverification.proxies.Interactive_RetrieveBySortcode_v1_Response.initialize(context, mendixObject);
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final loqate_bankverification.proxies.Interactive_RetrieveBySortcode_v1_Response that = (loqate_bankverification.proxies.Interactive_RetrieveBySortcode_v1_Response) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "Loqate_BankVerification.Interactive_RetrieveBySortcode_v1_Response";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Override
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
