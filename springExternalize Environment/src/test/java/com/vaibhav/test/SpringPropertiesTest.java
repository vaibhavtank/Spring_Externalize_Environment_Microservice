package com.vaibhav.test;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.vaibhav.prop.DatabaseProperties;
import com.vaibhav.prop.GenericEnv;
import com.vaibhav.prop.JmsProperties;

/**
 * @author ashraf
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
//Change it to your desired profile
@ActiveProfiles(profiles = "dev")
@ContextConfiguration("classpath:spring/xml-config-context.xml")
public class SpringPropertiesTest extends TestCase {
	
	@Autowired
	private GenericEnv env;
	
	@Autowired
	private DatabaseProperties dbProp;
	
	@Autowired
	private JmsProperties jmsProp;
	
	@Test
	public void testAppProperties() {
		
		System.out.println("Running Database ...");
		
		System.out.println("Environment        : " + env.toString());
		
		System.out.println("Database Properties: " + dbProp.toString());
		
		//System.out.println("JMS Properties     : " + jmsProp.toString());
	
	}
	
}
