/*
 * Copyright (c) [j]karef GmbH year .
 */

package com.liferay.arquillian.test;

import com.liferay.arquillian.sample.service.SampleService;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.core.api.annotation.Inject;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.jboss.shrinkwrap.osgi.api.BndProjectBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.File;

@RunWith(Arquillian.class)
public class BasePortletIntegrationTest {

    @Deployment
    public static JavaArchive create() {

        BndProjectBuilder bndProjectBuilder = ShrinkWrap.create(
                BndProjectBuilder.class
        );

        bndProjectBuilder.setBndFile(new File(
                "bnd.bnd"
        ));

        bndProjectBuilder.generateManifest(true);

        return bndProjectBuilder.as(JavaArchive.class);

    }

    @Test
    public void testAdd() throws Exception {
        int result = service.add(1, 3);

        Assert.assertEquals(4, result);
    }

    @Inject
    private SampleService service;

}