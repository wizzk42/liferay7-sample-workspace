/*
 * Copyright (c) [j]karef GmbH year .
 */

package com.jkaref.examples.liferay.helloworld.impl;

import com.jkaref.examples.liferay.helloworld.api.EchoService;
import com.jkaref.examples.liferay.helloworld.api.HelloWorldService;
import org.osgi.service.component.annotations.Component;

/**
 * @author Matthias Muenzner <matthias.muenzner@jkaref.com>
 */
@Component(
        immediate = true,
        service = HelloWorldService.class
)
public class HelloWorldServiceImpl implements HelloWorldService, EchoService {

    @Override
    public String sayHello() {
        return "Hello Shit";
    }

    @Override
    public String echo(String input) {
        return String.format("%s %s", input, input);
    }
}

//
//    private ServiceRegistration registration;
//
//    @Override
//    public void start(BundleContext context) throws Exception {
//
//        registration = context.registerService(HelloWorldService.class.getName(), new HelloWorldServiceImpl(), null);
//        System.out.println("###########Service Registered Successfully##############");
//    }
//
//    @Override
//    public void stop(BundleContext context) throws Exception {
//        registration.unregister();
//        System.out.println("###########Service Unregistered##############");
//
//    }
