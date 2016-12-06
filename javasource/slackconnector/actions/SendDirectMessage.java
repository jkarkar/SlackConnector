// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package slackconnector.actions;

import com.mendix.core.Core;
import com.mendix.logging.ILogNode;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import slackconnector.impl.SlackConnector;

public class SendDirectMessage extends CustomJavaAction<Boolean>
{
	private String AuthenticationToken;
	private String Username;
	private String DirectSlackMessage;

	public SendDirectMessage(IContext context, String AuthenticationToken, String Username, String DirectSlackMessage)
	{
		super(context);
		this.AuthenticationToken = AuthenticationToken;
		this.Username = Username;
		this.DirectSlackMessage = DirectSlackMessage;
	}

	@Override
	public Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
        ILogNode logger = Core.getLogger(PostMessageToChannel.class.getName());
        SlackConnector connector = new SlackConnector(AuthenticationToken);
        connector.setLogger(logger);
        connector.sendDirectMessage(this.Username, this.DirectSlackMessage);
        return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "SendDirectMessage";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
