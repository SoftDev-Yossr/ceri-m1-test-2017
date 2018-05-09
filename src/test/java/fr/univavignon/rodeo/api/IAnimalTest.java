package fr.univavignon.rodeo.api;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;


public class IAnimalTest{

	public static IAnimal createAnimal(int getXP, boolean isSecret, boolean isEndangered, boolean isBoss) {
		IAnimal animalMock = Mockito.mock(IAnimal.class);
		Mockito.when(animalMock.getXP()).thenReturn(getXP);
		Mockito.when(animalMock.isSecret()).thenReturn(isSecret);
		Mockito.when(animalMock.isEndangered()).thenReturn(isEndangered);
		Mockito.when(animalMock.isBoss()).thenReturn(isBoss);
		return animalMock;
}
	
	protected IAnimal animalMok(){
		return createAnimal(2,true,false,false);
		
	}
	
	@Test
public void getXP() {
		assertEquals(2,animalMok().getXP());
	

}
  @Test
public void isBossTest(){
	
		assertEquals(false,animalMok().isBoss());

}
  @Test
public void isEndangeredTest(){
	
	  assertEquals(false,animalMok().isEndangered());
}
  @Test
public void isSecretTest(){
	
	
	  assertEquals(true,animalMok().isEndangered());

}

}
