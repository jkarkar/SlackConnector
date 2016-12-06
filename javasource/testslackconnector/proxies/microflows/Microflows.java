// This file was generated by Mendix Modeler 6.10.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package testslackconnector.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the TestSlackConnector module
	public static testslackconnector.proxies.SlackMessages createNewSlackMessage(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "TestSlackConnector.CreateNewSlackMessage", params);
			return result == null ? null : testslackconnector.proxies.SlackMessages.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void onSlackMessage(IContext context, java.lang.String _channel, java.lang.String _sender, java.lang.String _text)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Channel", _channel);
			params.put("Sender", _sender);
			params.put("Text", _text);
			Core.execute(context, "TestSlackConnector.OnSlackMessage", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void postSlackMessage(IContext context, testslackconnector.proxies.SlackMessages _slackMessage)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("SlackMessage", _slackMessage == null ? null : _slackMessage.getMendixObject());
			Core.execute(context, "TestSlackConnector.PostSlackMessage", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void registerSlackListener(IContext context, testslackconnector.proxies.SlackMessages _slackMessages)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("SlackMessages", _slackMessages == null ? null : _slackMessages.getMendixObject());
			Core.execute(context, "TestSlackConnector.RegisterSlackListener", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void sendDirectSlackMessage(IContext context, testslackconnector.proxies.SlackMessages _slackMessage)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("SlackMessage", _slackMessage == null ? null : _slackMessage.getMendixObject());
			Core.execute(context, "TestSlackConnector.SendDirectSlackMessage", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean startup(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			return (java.lang.Boolean)Core.execute(context, "TestSlackConnector.Startup", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}