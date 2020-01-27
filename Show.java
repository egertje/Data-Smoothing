/**
 *A class which holds all the information for a TV Show
 *@author Emma Gertje and Serena Raso
 */
import java.util.LinkedList;

class Show {

	String title;
	double broadcastTime;
	LinkedList<Episode> episodes;
	double avgLength;
	boolean isSpecial;
	
	public Show(String title, double broadcastTime, LinkedList<Episode> episodes, boolean isSpecial)
	{
		this.title = title;
		this.broadcastTime = broadcastTime;
		this.episodes = episodes;
		this.isSpecial = isSpecial;
	}
	
	public void setAvgLength(double avgLength)
	{
		this.avgLength = avgLength;
	}
	
}
