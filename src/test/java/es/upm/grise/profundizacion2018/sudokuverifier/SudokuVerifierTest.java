package es.upm.grise.profundizacion2018.sudokuverifier;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SudokuVerifierTest {
    
	@Test
	public void testGeneralVerifyTrue() {
		assertEquals(0, SudokuVerifier.verify("278539164"
				+ "534216987"
				+ "916874352"
				+ "783452691"
				+ "149687523"
				+ "625193748"
				+ "452761839"
				+ "897325416"
				+ "361948275"));
    }
	
	@Test
	public void testGeneralVerifyFRule1() {
		assertEquals(-1, SudokuVerifier.verify("278539164"
				+ "534216987"
				+ "916874352"
				+ "783402691"
				+ "149687523"
				+ "625193748"
				+ "452761839"
				+ "897325416"
				+ "361948275"));
    }
	@Test
	public void testGeneralVerifyFRule2() {
		assertEquals(-2, SudokuVerifier.verify("278539164"
				+ "524216987"
				+ "916874352"
				+ "783452691"
				+ "149687523"
				+ "625193748"
				+ "452761839"
				+ "897325416"
				+ "361948275"));
    }
	@Test
	public void testGeneralVerifyFRule3() {
		assertEquals(-3, SudokuVerifier.verify("278539164"
				+ "534216587"
				+ "916874392"
				+ "783452691"
				+ "149687523"
				+ "625193748"
				+ "452761839"
				+ "897325416"
				+ "361948275"));
    }
	@Test
	public void testGeneralVerifyFRule4() {
		assertEquals(-4, SudokuVerifier.verify("278539164"
				+ "534216957"
				+ "916874382"
				+ "783452691"
				+ "149687523"
				+ "625193748"
				+ "452761839"
				+ "897325416"
				+ "361948275"));
    }
	//ANSWER
	//278539164
	//534216987
	//916874352
	//783452691
	//149687523
	//625193748
	//452761839
	//897325416
	//361948275
}
