/*
 * Copyright (c) [j]karef GmbH year .
 */

package com.jkaref.opensource.liferay.helloworld.contract;

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
