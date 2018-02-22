/*
 * Copyright (c) [j]karef GmbH year .
 */

package com.jkaref.examples.liferay.helloworld.api;

/**
 * @author Matthias Muenzner <matthias.muenzner@jkaref.com>
 */
public interface EchoService {

    /**
     * output = 2 * input :)
     *
     * @param input
     * @return
     */
    String echo(final String input);

}
