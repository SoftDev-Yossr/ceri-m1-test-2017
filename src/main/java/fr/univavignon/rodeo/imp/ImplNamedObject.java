package fr.univavignon.rodeo.imp;

import fr.univavignon.rodeo.api.INamedObject;

public class ImplNamedObject implements INamedObject {
	
		private String name;
		public ImplNamedObject(String nom) {
			name=nom;
		}
		public String getName() {
			return name;
		}

	}

