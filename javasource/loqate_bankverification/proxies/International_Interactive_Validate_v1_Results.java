// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package loqate_bankverification.proxies;

public class International_Interactive_Validate_v1_Results
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject international_Interactive_Validate_v1_ResultsMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Loqate_BankVerification.International_Interactive_Validate_v1_Results";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		IsCorrect("IsCorrect"),
		International_Interactive_Validate_v1_Results_International_Interactive_Validate_v1_Response("Loqate_BankVerification.International_Interactive_Validate_v1_Results_International_Interactive_Validate_v1_Response");

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

	public International_Interactive_Validate_v1_Results(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Loqate_BankVerification.International_Interactive_Validate_v1_Results"));
	}

	protected International_Interactive_Validate_v1_Results(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject international_Interactive_Validate_v1_ResultsMendixObject)
	{
		if (international_Interactive_Validate_v1_ResultsMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Loqate_BankVerification.International_Interactive_Validate_v1_Results", international_Interactive_Validate_v1_ResultsMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Loqate_BankVerification.International_Interactive_Validate_v1_Results");

		this.international_Interactive_Validate_v1_ResultsMendixObject = international_Interactive_Validate_v1_ResultsMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'International_Interactive_Validate_v1_Results.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static loqate_bankverification.proxies.International_Interactive_Validate_v1_Results initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return loqate_bankverification.proxies.International_Interactive_Validate_v1_Results.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static loqate_bankverification.proxies.International_Interactive_Validate_v1_Results initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new loqate_bankverification.proxies.International_Interactive_Validate_v1_Results(context, mendixObject);
	}

	public static loqate_bankverification.proxies.International_Interactive_Validate_v1_Results load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return loqate_bankverification.proxies.International_Interactive_Validate_v1_Results.initialize(context, mendixObject);
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
	 * @return value of IsCorrect
	 */
	public final java.lang.Boolean getIsCorrect()
	{
		return getIsCorrect(getContext());
	}

	/**
	 * @param context
	 * @return value of IsCorrect
	 */
	public final java.lang.Boolean getIsCorrect(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsCorrect.toString());
	}

	/**
	 * Set value of IsCorrect
	 * @param iscorrect
	 */
	public final void setIsCorrect(java.lang.Boolean iscorrect)
	{
		setIsCorrect(getContext(), iscorrect);
	}

	/**
	 * Set value of IsCorrect
	 * @param context
	 * @param iscorrect
	 */
	public final void setIsCorrect(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean iscorrect)
	{
		getMendixObject().setValue(context, MemberNames.IsCorrect.toString(), iscorrect);
	}

	/**
	 * @return value of International_Interactive_Validate_v1_Results_International_Interactive_Validate_v1_Response
	 */
	public final loqate_bankverification.proxies.International_Interactive_Validate_v1_Response getInternational_Interactive_Validate_v1_Results_International_Interactive_Validate_v1_Response() throws com.mendix.core.CoreException
	{
		return getInternational_Interactive_Validate_v1_Results_International_Interactive_Validate_v1_Response(getContext());
	}

	/**
	 * @param context
	 * @return value of International_Interactive_Validate_v1_Results_International_Interactive_Validate_v1_Response
	 */
	public final loqate_bankverification.proxies.International_Interactive_Validate_v1_Response getInternational_Interactive_Validate_v1_Results_International_Interactive_Validate_v1_Response(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		loqate_bankverification.proxies.International_Interactive_Validate_v1_Response result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.International_Interactive_Validate_v1_Results_International_Interactive_Validate_v1_Response.toString());
		if (identifier != null)
			result = loqate_bankverification.proxies.International_Interactive_Validate_v1_Response.load(context, identifier);
		return result;
	}

	/**
	 * Set value of International_Interactive_Validate_v1_Results_International_Interactive_Validate_v1_Response
	 * @param international_interactive_validate_v1_results_international_interactive_validate_v1_response
	 */
	public final void setInternational_Interactive_Validate_v1_Results_International_Interactive_Validate_v1_Response(loqate_bankverification.proxies.International_Interactive_Validate_v1_Response international_interactive_validate_v1_results_international_interactive_validate_v1_response)
	{
		setInternational_Interactive_Validate_v1_Results_International_Interactive_Validate_v1_Response(getContext(), international_interactive_validate_v1_results_international_interactive_validate_v1_response);
	}

	/**
	 * Set value of International_Interactive_Validate_v1_Results_International_Interactive_Validate_v1_Response
	 * @param context
	 * @param international_interactive_validate_v1_results_international_interactive_validate_v1_response
	 */
	public final void setInternational_Interactive_Validate_v1_Results_International_Interactive_Validate_v1_Response(com.mendix.systemwideinterfaces.core.IContext context, loqate_bankverification.proxies.International_Interactive_Validate_v1_Response international_interactive_validate_v1_results_international_interactive_validate_v1_response)
	{
		if (international_interactive_validate_v1_results_international_interactive_validate_v1_response == null)
			getMendixObject().setValue(context, MemberNames.International_Interactive_Validate_v1_Results_International_Interactive_Validate_v1_Response.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.International_Interactive_Validate_v1_Results_International_Interactive_Validate_v1_Response.toString(), international_interactive_validate_v1_results_international_interactive_validate_v1_response.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return international_Interactive_Validate_v1_ResultsMendixObject;
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
			final loqate_bankverification.proxies.International_Interactive_Validate_v1_Results that = (loqate_bankverification.proxies.International_Interactive_Validate_v1_Results) obj;
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
		return "Loqate_BankVerification.International_Interactive_Validate_v1_Results";
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