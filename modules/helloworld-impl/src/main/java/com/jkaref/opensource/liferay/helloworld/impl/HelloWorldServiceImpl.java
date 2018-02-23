/*
 * Copyright (c) [j]karef GmbH year .
 */

package com.jkaref.opensource.liferay.helloworld.impl;

import com.jkaref.opensource.liferay.helloworld.contract.HelloWorldService;
import org.osgi.service.component.annotations.Component;

/**
 * @author Matthias Muenzner <matthias.muenzner@jkaref.com>
 */
@Component(
        immediate = true,
        service = HelloWorldService.class
)
public class HelloWorldServiceImpl implements HelloWorldService {

    @Override
    public String sayHello() {
        return "Hello Shit";
    }

}
