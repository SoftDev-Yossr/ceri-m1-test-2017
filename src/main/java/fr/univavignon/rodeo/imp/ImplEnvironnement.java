package fr.univavignon.rodeo.imp;

import java.util.List;
import java.util.ArrayList;

import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.ISpecie;

public class ImplEnvironnement extends ImplNamedObject implements IEnvironment{
	

		private int areas;
		private ArrayList<ISpecie> species;

		public ImplEnvironnement(String nom,int x,List<ISpecie> species) {
			super(nom);
			species =new ArrayList<ISpecie>();
			areas=x;
			species.addAll(species);
		}

		public int getAreas() {
			return areas;
		}

		public List<ISpecie> getSpecies() {
			return species;
		}
}
