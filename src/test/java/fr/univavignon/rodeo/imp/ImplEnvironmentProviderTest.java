package fr.univavignon.rodeo.imp;

import java.util.ArrayList;

import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.IEnvironmentProvider;
import fr.univavignon.rodeo.api.IEnvironmentProviderTest;
import fr.univavignon.rodeo.api.IEnvironmentTest;

public class ImplEnvironmentProviderTest extends IEnvironmentProviderTest{

	

		@Override
		public IEnvironmentProvider getIEnvironmentProviderInstance() {
			
			ArrayList<IEnvironment> _environments;
			_environments = new ArrayList<IEnvironment>();
			_environments.add(IEnvironmentTest.getIEnvironmentMock());
			return new ImplEnvironmentProvider(_environments);
		}

}