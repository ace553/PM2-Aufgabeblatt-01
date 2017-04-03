import java.util.List;

import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * Ein MedienDetailAnzeigerWerkzeug ist ein Werkzeug um die Details von Medien
 * anzuzeigen.
 * 
 * @author SE2-Team, PM2-Team
 * @version SoSe 2017
 */
class MedienDetailAnzeigerWerkzeug
{
	private MedienDetailAnzeigerUI _ui;

	/**
	 * Initialisiert ein neues MedienDetailAnzeigerWerkzeug.
	 */
	public MedienDetailAnzeigerWerkzeug()
	{
		_ui = new MedienDetailAnzeigerUI();
	}

	/**
	 * Setzt die Liste der Medien deren Details angezeigt werden sollen.
	 * 
	 * @param medien
	 *            Eine Liste von Medien.
	 * 
	 * @require (medien != null)
	 */
	public void setMedien(List<Medium> medien)
	{
		assert medien != null : "Vorbedingung verletzt: (medien != null)";
		StringBuilder builder = new StringBuilder();
		for(Medium m : medien)
		{
			builder.append(m.getFormatiertenString());
			builder.append("\n");
		}
		JTextArea selectedMedienTextArea = _ui.getMedienAnzeigerTextArea();
		selectedMedienTextArea.setText(builder.toString());
	}
	
/*	
 	public void setMedien(List<Medium> medien)
	{
		assert medien != null : "Vorbedingung verletzt: (medien != null)";

		StringBuilder medString = new StringBuilder();
		for (Medium m : medien)
		{
			medString.append(m.getMedienBezeichnung() +"\n");
			medString.append("Titel:\t"+m.getTitel()+"\n");
			medString.append("Kommentar:\t"+m.getKommentar()+"\n");
			
			if(m instanceof CD)
			{
				CD cd = (CD) m;
				medString.append("Interpret:\t"+cd.getInterpret()+"\n");
				medString.append("Spiellänge:\t"+cd.getSpiellaenge() +" Minuten\n");
			}
			else if(m instanceof DVD)
			{
				DVD dvd = (DVD) m;
				medString.append("Regisseur:\t"+dvd.getRegisseur()+"\n");
				medString.append("Laufzeit:\t"+dvd.getLaufzeit()+" Minuten\n");
			}
			else if(m instanceof Videospiel)
			{
				Videospiel videospiel = (Videospiel) m;
				medString.append("Platform:\t"+videospiel.getPlatform()+"\n");
			}
			medString.append("\n");
		}
		JTextArea selectedMedienTextArea = _ui.getMedienAnzeigerTextArea();
		selectedMedienTextArea.setText(medString.toString());
	}
*/
	
	/**
	 * Gibt das Panel dieses Subwerkzeugs zurück.
	 * 
	 * @ensure result != null
	 */
	public JPanel getUIPanel()
	{
		return _ui.getUIPanel();
	}
}
