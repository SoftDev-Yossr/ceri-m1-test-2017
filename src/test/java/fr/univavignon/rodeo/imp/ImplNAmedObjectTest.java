package fr.univavignon.rodeo.imp;

import fr.univavignon.rodeo.api.INAmedObjectTest;
import fr.univavignon.rodeo.api.INamedObject;

public class ImplNAmedObjectTest extends INAmedObjectTest {

	
		
		@Override
		public  INamedObject getINamedObjectInstance() {
			return  new ImplNamedObject("myName");
		}
}
