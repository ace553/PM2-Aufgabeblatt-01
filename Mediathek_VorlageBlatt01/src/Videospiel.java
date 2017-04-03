public class Videospiel implements Medium
{

	private String _titel;
	private String _kommentar;
	private String _platform;

	/**
	 * Initialisiert ein neus Exemplar.
	 * 
	 * @param titel Der Titel des Videospiels
	 * @param kommentar Ein Kommentar zu dem Videospiel
	 * @param platform Die Platform des Videospiels
	 * 
	 * @require titel != null
	 * @require kommentar != null
	 * @require platform != null
	 * 
	 * @ensure getTitel() == titel
	 * @ensure getKommentar() == kommentar
	 * @ensure getPlatform() == platform
	 */
	public Videospiel(String titel, String kommentar, String platform)
	{
		_titel = titel;
		_kommentar = kommentar;
		_platform = platform;
	}


	@Override
	public String getKommentar()
	{
		return _kommentar;
	}

	@Override
	public String getMedienBezeichnung()
	{
		return "Videospiel";
	}

	@Override
	public String getTitel()
	{
		return _titel;
	}

	/**
	 * Gibt die Platform auf dem das Videospiel laeuft zureuck.
	 * 
	 * @return Die Platform des Videospiels
	 * 
	 * @ensure result != null
	 */
	public String getPlatform()
	{
		return _platform;
	}
}
