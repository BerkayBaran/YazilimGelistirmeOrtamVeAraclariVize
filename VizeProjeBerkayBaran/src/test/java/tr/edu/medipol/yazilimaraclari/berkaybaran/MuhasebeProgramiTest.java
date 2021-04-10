package tr.edu.medipol.yazilimaraclari.berkaybaran;

import org.junit.*;

public class MuhasebeProgramiTest {

	@Test 
	public void ucrethesapla_test() {
		
	int	calisilan_saat = 20;
	int saat_ucrt = 30;
	
	int sonuc = MuhasebeProgrami.ucret_Hesaplama_islemleri(calisilan_saat, saat_ucrt);
	
	Assert.assertEquals(600, sonuc );
	}
	
}
