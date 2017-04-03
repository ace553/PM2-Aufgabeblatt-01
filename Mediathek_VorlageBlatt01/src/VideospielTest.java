import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class VideospielTest
{

	private static final String TITEL = "Sims3";
	private static final String KOMMENTAR = "Kommentar";
	private static final String VS_BEZEICHNUNG = "Videospiel";

	private static final Platform PLATFORM = Platform.PC;

	private Videospiel _vs1;
	private Videospiel _vs2;
	
	public VideospielTest()
	{
		_vs1 = getMedium();
		_vs2 = getMedium();
	}
	
	@Test
	public void testKonstruktor()
	{
        assertEquals(TITEL, _vs1.getTitel());
        assertEquals(KOMMENTAR, _vs1.getKommentar());
        assertEquals(PLATFORM.getLesbarenName(), _vs1.getPlatform());
	}
	
    @Test
    public void testGetMedienBezeichnung()
    {
        String vsBezeichnung = VS_BEZEICHNUNG;
        assertEquals(vsBezeichnung, _vs1.getMedienBezeichnung());
    }
    
    @Test
    /*
     * Von ein und dem selben Videospiel kann es mehrere Exemplare geben, die von
     * unterschiedlichen Personen ausgeliehen werden können.
     */
    public void testEquals()
    {
        assertFalse("Mehrere Exemplare des gleichen Videospiels sind ungleich",
                _vs1.equals(_vs2));
        assertTrue("Dasselbe Exemplare des gleichen Videospiels ist gleich",
                _vs1.equals(_vs1));
    }
	
    private Videospiel getMedium()
    {
        return new Videospiel(TITEL, KOMMENTAR, PLATFORM);
        
    }

}
