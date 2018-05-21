package fr.univavignon.rodeo.api;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class IEnvironmentProviderTest {
	private static IEnvironmentProvider iEnvironmentProvider;
	public static  IEnvironment iEnvironment=IEnvironmentTest.getIEnvironmentMock();

	/**
	 * get IEnvironement Mock
	 * @return
	 */
	public static IEnvironmentProvider getIEnvironmentProviderMock() {
		iEnvironmentProvider = mock(IEnvironmentProvider.class);
		
        when(iEnvironmentProvider.getEnvironment("envtest")).thenReturn(iEnvironment);
		doThrow(new IllegalArgumentException()).when(iEnvironmentProvider).getEnvironment(null);
        
		List<String> environments =  new ArrayList<String>();
		environments.add("envtest");
		// defining the value of getAvailableEnvironments
        when(iEnvironmentProvider.getAvailableEnvironments()).thenReturn(environments);
          
		return  iEnvironmentProvider;
	}

	
	/**
	 * IllegalArgumentException If the given <tt>name</tt> is null.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testGetEnvironmentNotFound(){ 
		
		iEnvironmentProvider=getIEnvironmentProviderInstance();
		iEnvironmentProvider.getEnvironment(null);    
        
	}	
	
	/**
	 * get IEnvironementProvider Instance
	 * @return
	 */
	public  IEnvironmentProvider getIEnvironmentProviderInstance() {
		return getIEnvironmentProviderMock();
	}
	/**
	 * return nothing
	 */
	@Test
	public void testGetEnvironmentFound(){ 
		
		iEnvironmentProvider=getIEnvironmentProviderInstance();
        assertEquals(iEnvironmentProvider.getEnvironment("envtest").getName(), iEnvironment.getName());
	}
	
	/**
	 * Testing of Get Areas
	 */
	@Test
	public void testGetAreas() {
		// init IEnvironment
		iEnvironmentProvider=getIEnvironmentProviderInstance();
				
        //test the getEnvironment
        assertEquals(iEnvironmentProvider.getEnvironment("envtest").getName(), iEnvironment.getName());
	}
	
	/**
	 * Testing of getAvailableEnvironments
	 */
	@Test
	public void testGetAvailableEnvironments() {
		// init IEnvironment
		iEnvironmentProvider=getIEnvironmentProviderInstance();
		
		List<String> environments =  new ArrayList<String>();
		environments.add("envtest");
        //test the getEnvironment
        assertEquals(iEnvironmentProvider.getAvailableEnvironments(), environments);
	}
}
