/*
 * Copyright (c) [j]karef GmbH year .
 */

package com.jkaref.opensource.liferay.portlets.helloworld;

import com.jkaref.opensource.liferay.helloworld.contract.EchoService;
import com.jkaref.opensource.liferay.helloworld.contract.HelloWorldService;
import com.jkaref.opensource.liferay.portlets.constants.HelloWorldPortletConstants;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author jkaref
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=hello-world-portlet Portlet",
		"javax.portlet.name=" + HelloWorldPortletConstants.HelloWorldPortlet,
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class HelloWorldPortlet extends GenericPortlet {

	@Override
	protected void doView(
			RenderRequest renderRequest, RenderResponse renderResponse)
		throws IOException, PortletException
	{

		PrintWriter printWriter = renderResponse.getWriter();
		printWriter.print("Service responds with: " + helloWorldService.sayHello());

		printWriter.print("Service echoes with: " +
				echoService.echo(helloWorldService.sayHello())
		);
	}

	@Reference
	public void setHelloWorldService(HelloWorldService service) {
		this.helloWorldService = service;
	}

	@Reference
	public void setEchoService(EchoService service) {
		this.echoService = service;
	}

	private EchoService echoService;
	private HelloWorldService helloWorldService;
}