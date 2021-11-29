// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package loqate_bankverification.proxies;

public class International_Interactive_Validate_v1_Request extends loqate_bankverification.proxies.Request
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Loqate_BankVerification.International_Interactive_Validate_v1_Request";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		IBAN("IBAN"),
		Key("Key");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public International_Interactive_Validate_v1_Request(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Loqate_BankVerification.International_Interactive_Validate_v1_Request"));
	}

	protected International_Interactive_Validate_v1_Request(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject international_Interactive_Validate_v1_RequestMendixObject)
	{
		super(context, international_Interactive_Validate_v1_RequestMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("Loqate_BankVerification.International_Interactive_Validate_v1_Request", international_Interactive_Validate_v1_RequestMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Loqate_BankVerification.International_Interactive_Validate_v1_Request");
	}

	/**
	 * @deprecated Use 'International_Interactive_Validate_v1_Request.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static loqate_bankverification.proxies.International_Interactive_Validate_v1_Request initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return loqate_bankverification.proxies.International_Interactive_Validate_v1_Request.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static loqate_bankverification.proxies.International_Interactive_Validate_v1_Request initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new loqate_bankverification.proxies.International_Interactive_Validate_v1_Request(context, mendixObject);
	}

	public static loqate_bankverification.proxies.International_Interactive_Validate_v1_Request load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return loqate_bankverification.proxies.International_Interactive_Validate_v1_Request.initialize(context, mendixObject);
	}

	/**
	 * @return value of IBAN
	 */
	public final java.lang.String getIBAN()
	{
		return getIBAN(getContext());
	}

	/**
	 * @param context
	 * @return value of IBAN
	 */
	public final java.lang.String getIBAN(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.IBAN.toString());
	}

	/**
	 * Set value of IBAN
	 * @param iban
	 */
	public final void setIBAN(java.lang.String iban)
	{
		setIBAN(getContext(), iban);
	}

	/**
	 * Set value of IBAN
	 * @param context
	 * @param iban
	 */
	public final void setIBAN(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String iban)
	{
		getMendixObject().setValue(context, MemberNames.IBAN.toString(), iban);
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final loqate_bankverification.proxies.International_Interactive_Validate_v1_Request that = (loqate_bankverification.proxies.International_Interactive_Validate_v1_Request) obj;
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
		return "Loqate_BankVerification.International_Interactive_Validate_v1_Request";
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
