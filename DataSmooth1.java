
/**
 * A class which holds the dataSmooth method and its helper function
 * @author Emma Gertje and Serena Raso
 *
 */
import java.util.LinkedList;

class DataSmooth1 {
  DataSmooth1(){}
  
  /**
   * to produce a list of smoothed show run times from a list of average run times for each show
   * 
   * @param shows - A Linked List of shows
   * @return a Linked List of Doubles which holds the smoothed show run times
   */
  
  public LinkedList<Double> dataSmooth(LinkedList<Show> shows) {
	  LinkedList<Double> episodeLengthList = new LinkedList<Double>();
	  LinkedList<Double> averageRunList = averageRunTimes(shows);
	  for(int i = 0; i < averageRunList.size() - 1; i = i + 1) {
		  if(i == 0) {
			  episodeLengthList.add(averageRunList.get(i));
		  }
		  else if(i == averageRunList.size() - 1) {
			  episodeLengthList.add(averageRunList.get(i));
		  }
		  else if(i >= 1 && i < averageRunList.size() - 1) {
			  episodeLengthList.add((averageRunList.get(i) + averageRunList.get(i - 1) + averageRunList.get(i + 1))/3);
		  }
	  }
	  return episodeLengthList;  
	  }
  
  /**
   * to find the average of the run times for each show 
   * 
   * @param data - a Linked List of Shows
   * @return a Linked List of Doubles which holds the average run times for each show
   */
  //Helper function that makes a list of the average run times
  public LinkedList<Double> averageRunTimes(LinkedList<Show> data) {
	  LinkedList<Double> averageTimeList = new LinkedList<Double>();
	  for(Show currentShow: data) {
		  double showTimes = 0;
		  int counter = 0;
		  if(currentShow.episodes.size() == 0) {
			  return averageTimeList;
		  }
		  for(Episode currentEpisode: currentShow.episodes) {
			  counter++;
			  showTimes = showTimes + currentEpisode.runTime;
		  }
		  averageTimeList.add(showTimes/(double)counter);
	  }
	  return averageTimeList;
  }
  }
