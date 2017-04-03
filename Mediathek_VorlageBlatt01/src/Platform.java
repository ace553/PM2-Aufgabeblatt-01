
public enum Platform {
	PC("PC"), XBOX_ONE("Xbox One"), PS4("Playstation 4"), WII_U("WII U"), HTC_VIVE("HTC Vive");

	private String _lesbarerName;

	Platform(String lesbarerName) 
	{
		_lesbarerName = lesbarerName;
	}

	public String getLesbarenName() 
	{
		return _lesbarerName;
	}

	/**
	 * Gibt die passende Platform zu dem lesbaren namen an
	 * @param lesbarerName
	 * Der Name zu der das Platform Exemplar zurueck gegeben werden soll.
	 * @return
	 * Das Platform Exemplar zu dem lesbaren Namen.
	 * Wenn lesbarerName zu keiner Platform passt wird null zurueck gegeben.
	 * 
	 * @require lesbarerName != null
	 */
	public static Platform getVonLesbaremNamen(String lesbarerName) 
	{
		for(Platform p : values())
		{
			if(p.getLesbarenName().equals(lesbarerName))
			{
				return p;
			}
		}
		return null;
	}
}
