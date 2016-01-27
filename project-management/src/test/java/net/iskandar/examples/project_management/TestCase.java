/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iskandar.examples.project_management;

import javax.annotation.security.RunAs;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import org.junit.runners.Suite;

/**
 *
 * @author iskandar
 */
@RunWith(JUnit4.class)
public class TestCase {

    @BeforeClass
    public static void beforeClass(){

    }

    @AfterClass
    public static void afterClass(){

    }

    @Before
    public void setUp(){

    }
    
    @After
    public void tearDown(){

    }

    @Test
    public void test1(){
        System.err.println("TEST OUTPUT");
        Assert.fail("Failed!");
    }
    
    @Test
    public void test2(){
        Assert.fail("Failed!");
    }
    
}
