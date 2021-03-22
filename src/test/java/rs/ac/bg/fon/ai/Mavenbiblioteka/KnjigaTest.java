package rs.ac.bg.fon.ai.Mavenbiblioteka;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

 public class KnjigaTest {

	@BeforeEach
	public void setUp() {
	}

	@AfterEach
	public	void tearDown()  {
	}

	@Test
	public void testsetNaslov() {
		
		Knjiga k = new Knjiga () ;
		
		k.setNaslov("Naslov 1");
		assertEquals("Naslov 1", k.getNaslov());
	}

}
