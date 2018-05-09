package fr.univavignon.rodeo.api;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;


public class IAnimalTest{

	//Mock creation  
	public static IAnimal createAnimal(int getXP, boolean isSecret, boolean isEndangered, boolean isBoss) {
		IAnimal animal = Mockito.mock(IAnimal.class);
		Mockito.when(animal.getXP()).thenReturn(getXP);
		Mockito.when(animal.isSecret()).thenReturn(isSecret);
		Mockito.when(animal.isEndangered()).thenReturn(isEndangered);
		Mockito.when(animal.isBoss()).thenReturn(isBoss);
		return animal;
}
	
	protected IAnimal animal(){
		return createAnimal(2,true,false,false);
		
	}
	
	@Test
public void getXP() {
		assertEquals(2,animal().getXP());
	

}
  @Test
public void isBossTest(){
	
		assertEquals(false,animal().isBoss());

}
  @Test
public void isEndangeredTest(){
	
	  assertEquals(false,animal().isEndangered());
}
  @Test
public void isSecretTest(){
	
	
	  assertEquals(true,animal().isEndangered());

}

}
