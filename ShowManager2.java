/**
 * A class which holds the organizeShows method and its helper functions
 * @author Emma Gertje
 */
import java.util.LinkedList;

class ShowManager2 {
	
	ShowManager2() {}

	/**
	 * to make a show summary which only consists of prime time, daytime, and late night shows that are not specials
	 * 
	 * @param shows - A Linked List of Shows
	 * @return a Show Summary of all the late night, prime time, and daytime non-special shows in a list
	 */
	public ShowSummary organizeShows(LinkedList<Show> shows)
	{
		LinkedList<Show> cleanedData = clean(shows);
		LinkedList<Show> dayTimeShows = new LinkedList<Show>();
		LinkedList<Show> primeTimeShows = new LinkedList<Show>();
		LinkedList<Show> lateNightShows = new LinkedList<Show>();
		ShowSummary showSummary = new ShowSummary(dayTimeShows, primeTimeShows, lateNightShows);
		
		for(Show currentShow: cleanedData ) {
			if(currentShow.broadcastTime < 1700 && currentShow.broadcastTime >= 600) {
				dayTimeShows.add(currentShow);
			}
			else if(currentShow.broadcastTime >= 1700 && currentShow.broadcastTime < 2200) {
				primeTimeShows.add(currentShow);
			}
			else if(currentShow.broadcastTime >= 2200 || currentShow.broadcastTime < 100) {
					lateNightShows.add(currentShow);
			}
		}
		
		return showSummary;
	}
		
/**
 * to get rid of all the over night and special shows that won't be part of the show summary	
 * @param data- a Linked List of Shows
 * @return a Linked List of shows that doesn't have over night and special shows
 */
	//Helper Function, clean data by getting rid of all over night shows and special shows
	LinkedList<Show> clean(LinkedList<Show> data) {
		LinkedList<Show> cleanedData = new LinkedList<Show>();
		
		for(Show show: data) {
			if(show.broadcastTime < 100 || show.broadcastTime >= 600) {
				if(!show.isSpecial) {
					cleanedData.add(show);
				}
			}
		}
		return cleanedData;
	}
	
}
