/*
 * Copyright (c) [j]karef GmbH year .
 */

package com.jkaref.opensource.liferay.helloworld.impl;

import com.jkaref.opensource.liferay.helloworld.api.EchoService;
import org.osgi.service.component.annotations.Component;

/**
 * @author Matthias Muenzner <matthias.muenzner@jkaref.com>
 */
@Component(
        immediate = true,
        service = EchoService.class
)
public class EchoServiceImpl implements EchoService {

    @Override
    public String echo(String input) {
        return String.format("%s %s", input, input);
    }

}
