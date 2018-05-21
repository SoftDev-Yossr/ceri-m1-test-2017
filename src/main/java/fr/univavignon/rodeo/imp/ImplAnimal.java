package fr.univavignon.rodeo.imp;

import fr.univavignon.rodeo.api.IAnimal;

public class ImplAnimal  extends ImplNamedObject implements IAnimal {
	

		private boolean boss,endangered,secret;
		private int xp;
		
		public ImplAnimal(String nom, int x,boolean a,boolean b,boolean c) {
			super(nom);
			xp=x;
			boss=a;
			endangered=b;
			secret=c;
		}
		

		public int getXP() {
			return xp;
		}

		public boolean isSecret() {
			return secret;
		}

		public boolean isEndangered() {
			return endangered;
		}

		public boolean isBoss() {
			return boss;
		}

	}

