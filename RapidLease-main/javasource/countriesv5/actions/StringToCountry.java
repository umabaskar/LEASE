// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package countriesv5.actions;

import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

public class StringToCountry extends CustomJavaAction<java.lang.String>
{
	private java.lang.String value;

	public StringToCountry(IContext context, java.lang.String value)
	{
		super(context);
		this.value = value;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
		
		try {
			return countriesv5.proxies.Countries.valueOf(this.value).toString();
		}
		catch (Exception e) {
			Core.getLogger(this.toString()).warn("Invalid country: " + this.value);
			return "";
		}
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "StringToCountry";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
