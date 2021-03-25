package param.temperature;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ConversorTemperaturaTest {
	
	private double celsius;
	private double fahrenheit;

	
	public ConversorTemperaturaTest(double celsius, double fahrenheit) {
		
		this.celsius = celsius;
		this.fahrenheit = fahrenheit;
	}
	@Parameters(name = "{index}: grau em Celsius: {0} , convertido em Fahrenheit ficará: {1}")
	public static Object[][] addedNumbers(){
		return new Double[][] {
			{1.0, 33.8},
			{2.0, 35.6},
			{3.0, 37.4},
			{4.0, 39.2},
			{5.0, 41.0},
			
		};
	}
	

	@Test
	public void testConverte() throws TempException{
		
		ConversorTemperatura temp = new ConversorTemperatura();
		
		Celsius c = new Celsius();
		c.setValue(celsius);
		
		Fahrenheit f = new Fahrenheit();
		f.setValue(fahrenheit);
		
		double converttoFahrenheit = temp.converte(c).getValue();
		double converttoCelsius = temp.converte(f).getValue();
		
		assertEquals(fahrenheit, converttoFahrenheit, 0.1);
		//assertEquals(celsius, converttoCelsius, 1.0);
	}

}
