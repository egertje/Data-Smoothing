/**
 * a class that holds the method dataSmooth and its helper functions
 * @author Emma Gertje and Serena Raso
 */
import java.util.LinkedList;

class DataSmooth2 {
  DataSmooth2(){}
  
  /**
   * to produce a list of smoothed show run times from a list of average run times for each show
   * 
   * @param shows - A Linked List of shows
   * @return a Linked List of Doubles which holds the smoothed show run times
   */
  public LinkedList<Double> dataSmooth(LinkedList<Show> shows) 
  {
	LinkedList<Double> runAverages = averagesList(shows); 
	LinkedList<Triples> triplesList = makeListOfTriples(runAverages);
	LinkedList<Double> smoothedTriples = smoothedList(triplesList);
	LinkedList<Double> smoothedData = new LinkedList<Double>();
	
	for(int i = 0; i < smoothedTriples.size() - 1; i++) {
		if(i == 0) {
			smoothedData.add(runAverages.get(i));
		}
		else if (i == smoothedTriples.size() - 1) {
			smoothedData.add(runAverages.get(i));
		}
		else if (i >= 1 && i < smoothedTriples.size() - 2) {
			smoothedData.add(smoothedTriples.get(i));
		}
	}
	return smoothedData;
  }

  /**
   * to use the smoothTriples functi0n and create a list of smoothed triples
   * @param triples - a Linked List of Triples
   * @return a Linked List of Doubles which is a list of smoothed triples
   */
  //Helper function that uses the smoothed triples function and creates a list of smoothed triples
  public LinkedList<Double> smoothedList(LinkedList<Triples> triples) {
	  LinkedList<Double> smoothedTriples = new LinkedList<Double>();
	  for(Triples triple: triples) {
		  smoothedTriples.add(smoothTriples(triple));
	  }
	  return smoothedTriples;
  }
  
  /**
   * to find the average of each Triple
   * @param value - a Triple 
   * @return a double which is the average of the three parts of a triple
   */
  //Helper function that finds the average of each triple
  public double smoothTriples(Triples value) {
	  return (value.a + value.b + value.c)/3;
  }
  
  /**
   * to break a list of averages up into a list of triples
   * @param averages - a Linked List of doubles
   * @return a Linked List of Triples in which the triples consist of average run times
   */
  //Helper function that breaks the list of averages up into triples
  public LinkedList<Triples> makeListOfTriples(LinkedList<Double> averages) {
	  LinkedList<Triples> tripleList = new LinkedList<Triples>();
	  for(int i = 0; i < averages.size() - 2; i++) {
		  tripleList.add(new Triples(averages.get(i), averages.get(i + 1), averages.get(i + 2)));
	  }
	  return tripleList;
  }
  
  /**
   * to put all the average run times of each show into one list
   * @param shows - a Linked List of Shows
   * @return a list of average run times for each show
   */
  //Helper function that adds all the average run times to one list
  public LinkedList<Double> averagesList(LinkedList<Show> shows) {
	  LinkedList<Double> listOfAverages = new LinkedList<Double>();
	  
	  for(Show show: shows) {
		  listOfAverages.add(calculateAverages(show.episodes));
	  }
	  
	  return listOfAverages;
  }
 
  /**
   * to calculate the average run time for each show
   * @param episodes - a Linked List of Episodes
   * @return a double which is the average run time for a specific show
   */
  //Helper function that calculates the average run time for each show
  public double calculateAverages(LinkedList<Episode> episodes) {
	  double sum = 0;
	  int counter = 0;
	  
	  if(episodes.size() == 0) {
		  sum = 0;
		  counter = 1;
	  }
	  else for(Episode episode: episodes) {
		  sum = sum + episode.runTime;
		  counter++;
	  }
	  
	  return sum/(double)counter;
  }
}