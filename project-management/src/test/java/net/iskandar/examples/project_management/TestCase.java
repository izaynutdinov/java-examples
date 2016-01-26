/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iskandar.examples.project_management;

import javax.annotation.security.RunAs;
import org.junit.After;
import org.junit.AfterClass;
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
        System.out.println("===================================== before class ======================================================");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("===================================== after class =======================================================");
    }

    @Before
    public void setUp(){
        System.out.println("===================================== setUp =============================================================");
    }
    
    @After
    public void tearDown(){
        System.out.println("===================================== tearDown ==========================================================");
    }

    @Test
    public void test1(){
        System.out.println("===================================== test1 =============================================================");
    }
    
    @Test
    public void test2(){
        System.out.println("===================================== test2 =============================================================");
    }
    
}
