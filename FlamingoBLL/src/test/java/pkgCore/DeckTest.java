package pkgCore;


import static org.junit.Assert.*;

import java.util.ArrayList;

import javax.swing.plaf.synth.SynthSpinnerUI;

import org.apache.poi.ddf.EscherColorRef.SysIndexSource;
import org.junit.Test;

public class DeckTest {

	@Test
	public void TestDeck() {
		int size=0;
		
		Deck Deck1 = new Deck(1);
		assertEquals(Deck1.deckSize(),52);	
		
		Deck Deck6 = new Deck(6);
		assertEquals(Deck6.deckSize(),312);	

		
	}
}
		
			
		
		
	

	


