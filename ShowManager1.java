/**
 * A class which has the organizeShows method
 */
import java.util.LinkedList;

class ShowManager1 {
	
	ShowManager1() {}

	/**
	 * to make a show summary which only consists of prime time, daytime, and late night shows that are not specials
	 * 
	 * @param shows - A Linked List of Shows
	 * @return a Show Summary of all the late night, prime time, and daytime non-special shows in a list
	 */
	public ShowSummary organizeShows(LinkedList<Show> shows)
	{
		LinkedList<Show> dayTimeShows = new LinkedList<Show>();
		LinkedList<Show> primeTimeShows = new LinkedList<Show>();
		LinkedList<Show> lateNightShows = new LinkedList<Show>();
		ShowSummary showSummary = new ShowSummary(dayTimeShows, primeTimeShows, lateNightShows);
		
		for(Show currentShow: shows) {
			if(currentShow.broadcastTime < 1700 && currentShow.broadcastTime >= 600) {
				if(!currentShow.isSpecial) {
					dayTimeShows.add(currentShow);
				}
			}
			else if(currentShow.broadcastTime >= 1700 && currentShow.broadcastTime < 2200) {
				if(!currentShow.isSpecial) {
					primeTimeShows.add(currentShow);
				}
			}
			else if(currentShow.broadcastTime >= 2200 || currentShow.broadcastTime < 100) {
				if(!currentShow.isSpecial) {
					lateNightShows.add(currentShow);
				}
			}
			
		}
		
		return showSummary;
	}
	
}
