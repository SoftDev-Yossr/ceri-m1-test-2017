package fr.univavignon.rodeo.imp;

import java.util.*;
import java.io.*;

import fr.univavignon.rodeo.api.*;
import fr.univavignon.rodeo.api.ISpecie;

public class ImplSpecies extends ImplNamedObject implements ISpecie{
	
		private List<IAnimal> animals;
		private int area;

		public ImplSpecies(String _name,int _area,List<IAnimal> _animals) {
			super(_name);
			animals =new ArrayList<IAnimal>();
			area=_area;
			animals.addAll(_animals);
		}

		public int getArea() {
			return area;
		}

		public List<IAnimal> getAnimals() {
			return animals;
		}


}
