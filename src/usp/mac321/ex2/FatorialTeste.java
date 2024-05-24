package usp.mac321.ex2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import usp.mac321.ex1.FatorialView;

public class FatorialTeste {

	@Test
	void TestFatorialThreeShouldBeSix() {
		FatorialView calc = new FatorialView();
		
		calc.setVisible(true);
		boolean calcActiveWindow = true;
		
		/* O teste TOTALMENTE AUTOMATIZADO seria assim.
		  
		try {
			Thread.sleep(1000);
			calc.setLabelValue("3");
			Thread.sleep(2000);
			calc.clickButton();
			Thread.sleep(2000);
			assertEquals("Resultado: 6", calc.getResult()); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		*/
		
		
		// Neste caso, o usuario devera inserir o valor 3 e clicar no botao "calcular" 
    	while(calcActiveWindow) {
    		try {
    			Thread.sleep(10);
    			
    			if(calc.getIsButtonPressed()) {
    				calc.setVisible(false);
        			calcActiveWindow = false;
    				assertEquals("Resultado: 6", calc.getResult());
    			}
	
    		} catch(InterruptedException e) {
    			calc.setVisible(false);
    			calcActiveWindow = false;
    			assertTrue(false);
    		}
    	}
	}
	
	@Test
	void TestFatorialNegativeNumberThrowException() {
		FatorialView calc2 = new FatorialView();
		
		calc2.setVisible(true);
		boolean calcActiveWindow = true;
	
		
		// Neste caso, o usuario devera inserir um valor negativo e clicar no botao "calcular" 
    	while(calcActiveWindow) {
    		try {
    			Thread.sleep(10);

    			if(calc2.getIsButtonPressed()) {
    				String inputText = calc2.getLabelTextString();
                    int number = Integer.parseInt(inputText);

                    if (number < 0) {
                        throw new IllegalArgumentException("O número deve ser não negativo.");
                    }
                    
                    calc2.setVisible(false);
        			calcActiveWindow = false;
        			
        			assertTrue(false);
    			}
	
    		} catch(InterruptedException e) {
    			calc2.setVisible(false);
    			calcActiveWindow = false;
    		} catch(NumberFormatException e) {
    			calc2.setVisible(false);
    			calcActiveWindow = false;
    			assertTrue(false);
    		} catch (IllegalArgumentException e) {
    			calc2.setVisible(false);
    			calcActiveWindow = false;
    			assertTrue(true);
    		} 
    	}
	}
	
	@Test
	void TestFatorialNoNumberThrowException() {
		FatorialView calc = new FatorialView();
		
		calc.setVisible(true);
		boolean calcActiveWindow = true;
	
		
		// Neste caso, o usuario nao devera inserir um número e clicar no botao "calcular" 
    	while(calcActiveWindow) {
    		try {
    			Thread.sleep(10);

    			if(calc.getIsButtonPressed()) {
    				String inputText = calc.getLabelTextString();
                    int number = Integer.parseInt(inputText);
                    
                    if (number < 0) {
                        throw new IllegalArgumentException("O número deve ser não negativo.");
                    }

                    calc.setVisible(false);
        			calcActiveWindow = false;
        			assertTrue(false);
    			}
    		} catch(InterruptedException e) {
    			calc.setVisible(false);
    			calcActiveWindow = false;
    		} catch(NumberFormatException e) {
    			calc.setVisible(false);
    			calcActiveWindow = false;
    			assertTrue(true);
    		} catch (IllegalArgumentException e) {
    			calc.setVisible(false);
    			calcActiveWindow = false;
    			assertTrue(false);
    		} 
    	}
	}
}
