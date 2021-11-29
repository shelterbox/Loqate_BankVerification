// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package loqate_bankverification.proxies;

public class Request
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject requestMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Loqate_BankVerification.Request";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
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

	public Request(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Loqate_BankVerification.Request"));
	}

	protected Request(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject requestMendixObject)
	{
		if (requestMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Loqate_BankVerification.Request", requestMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Loqate_BankVerification.Request");

		this.requestMendixObject = requestMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Request.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static loqate_bankverification.proxies.Request initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return loqate_bankverification.proxies.Request.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static loqate_bankverification.proxies.Request initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		if (com.mendix.core.Core.isSubClassOf("Loqate_BankVerification.Batch_Validate_v1_Request", mendixObject.getType()))
			return loqate_bankverification.proxies.Batch_Validate_v1_Request.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("Loqate_BankVerification.Interactive_RetrieveBySortcode_v1_Request", mendixObject.getType()))
			return loqate_bankverification.proxies.Interactive_RetrieveBySortcode_v1_Request.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("Loqate_BankVerification.Interactive_Validate_v2_Request", mendixObject.getType()))
			return loqate_bankverification.proxies.Interactive_Validate_v2_Request.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("Loqate_BankVerification.International_Interactive_Validate_v1_Request", mendixObject.getType()))
			return loqate_bankverification.proxies.International_Interactive_Validate_v1_Request.initialize(context, mendixObject);

		return new loqate_bankverification.proxies.Request(context, mendixObject);
	}

	public static loqate_bankverification.proxies.Request load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return loqate_bankverification.proxies.Request.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Key
	 */
	public final java.lang.String getKey()
	{
		return getKey(getContext());
	}

	/**
	 * @param context
	 * @return value of Key
	 */
	public final java.lang.String getKey(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Key.toString());
	}

	/**
	 * Set value of Key
	 * @param key
	 */
	public final void setKey(java.lang.String key)
	{
		setKey(getContext(), key);
	}

	/**
	 * Set value of Key
	 * @param context
	 * @param key
	 */
	public final void setKey(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String key)
	{
		getMendixObject().setValue(context, MemberNames.Key.toString(), key);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return requestMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final loqate_bankverification.proxies.Request that = (loqate_bankverification.proxies.Request) obj;
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
		return "Loqate_BankVerification.Request";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
