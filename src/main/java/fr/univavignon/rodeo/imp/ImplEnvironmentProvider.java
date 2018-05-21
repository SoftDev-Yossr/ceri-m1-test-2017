package fr.univavignon.rodeo.imp;

import java.util.List;
import java.util.*;

import fr.univavignon.rodeo.api.*;

public class ImplEnvironmentProvider implements IEnvironmentProvider{
	
		
		private ArrayList<IEnvironment> environments;

		public ImplEnvironmentProvider(ArrayList<IEnvironment> _environments) {
			environments =new ArrayList<IEnvironment>();
			environments = _environments;
		}
		public List<String> getAvailableEnvironments() {
			List<String> av_environments = new ArrayList<String>();
			
			for (IEnvironment environment : environments) {
				av_environments.add(environment.getName());
			}
			return av_environments;
		}

		public IEnvironment getEnvironment(String name) throws IllegalArgumentException {
			IEnvironment environment_return =null;
			if (name==null) {
				throw new IllegalArgumentException();
			}else {
				for (IEnvironment environment : environments) 
					if (environment.getName().equals(name))
						environment_return=environment;
				
			}
			return environment_return;
		}


}
