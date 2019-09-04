/**
 * a class which holds all the instantiations and test cases for 
 * the dataSmooth methods
 * @author Emma Gertje and Serena Raso																							
 */
import static org.junit.Assert.*;
import org.junit.*;
import java.util.LinkedList;

public class DataSmoothExamples 
{  
	//Show lists
	LinkedList<Show> emptyShows = new LinkedList<Show>();
	LinkedList<Show> shows = new LinkedList<Show>();
	LinkedList<Show> shows2 = new LinkedList<Show>();
	LinkedList<Show> shows3 = new LinkedList<Show>();
	LinkedList<Show> shows4 = new LinkedList<Show>();
	LinkedList<Show> shows5 = new LinkedList<Show>();
	LinkedList<Show> shows6 = new LinkedList<Show>();
	LinkedList<Show> shows7 = new LinkedList<Show>();
  
	//data smoothing lists
	LinkedList<Double> emptyShowResults = new LinkedList<Double>();
	LinkedList<Double> showResults = new LinkedList<Double>();
	LinkedList<Double> showResults2 = new LinkedList<Double>();
	LinkedList<Double> showResults3 = new LinkedList<Double>();
	LinkedList<Double> showResults4 = new LinkedList<Double>();
	LinkedList<Double> showResults5 = new LinkedList<Double>();
	LinkedList<Double> showResults6 = new LinkedList<Double>();
	LinkedList<Double> showResults7 = new LinkedList<Double>();
  
  DataSmooth1 D1 = new DataSmooth1();
  DataSmooth2 D2 = new DataSmooth2();
  
  public DataSmoothExamples() 
  {
	  //Instructor Episodes
		LinkedList<Episode> eps1 = new LinkedList<Episode>();
		eps1.add(new Episode("Best of Both Worlds", 88));
		eps1.add(new Episode("The Ultimate Computer", 49));
		eps1.add(new Episode("Trials and Tribble-ations", 43));		
		shows.add(new Show("Star Trek", 1800, eps1, false));
		
		LinkedList<Episode> eps2 = new LinkedList<Episode>();
		eps2.add(new Episode("Fear of a Bot Planet", 23));
		eps2.add(new Episode("The Why of Fry", 21));
		eps2.add(new Episode("Roswell that Ends Well", 23));
		eps2.add(new Episode("Meanwhile", 22));
		shows.add(new Show("Futurama", 1900, eps2, false));
		
		LinkedList<Episode> eps3 = new LinkedList<Episode>();
		eps3.add(new Episode("Yakko's World", 4));
		eps3.add(new Episode("Hello Nice Warners", 8));
		eps3.add(new Episode("Where Rodents Dare", 9));
		shows.add(new Show("Animaniacs", 1630, eps3, false));
		
		LinkedList<Episode> eps4 = new LinkedList<Episode>();
		eps4.add(new Episode("The Letter W", 59));
		eps4.add(new Episode("The Letter P", 57));
		eps4.add(new Episode("The Letter I", 58));
		shows.add(new Show("Sesame Street", 900, eps4, false));

	    showResults.add(60.0);
	    showResults.add(29.75);
	    showResults.add(29.08333);
	    showResults.add(58.0);
  }
  
 //Episodes where every length is 0
  @Before
  public void DataSmoothExamples2() {
	  LinkedList<Episode> eps5 = new LinkedList<Episode>();
		eps5.add(new Episode("The One with the Video Tape", 0));
		eps5.add(new Episode("The One with Giant Poking Device", 0));
		eps5.add(new Episode("The One with Ross' Tan", 0));		
		shows2.add(new Show("Friends", 1830, eps5, false));
		
		LinkedList<Episode> eps6 = new LinkedList<Episode>();
		eps6.add(new Episode("Hello World", 0));
		eps6.add(new Episode("This is my test", 0));
		eps6.add(new Episode("What's up", 0));
		eps6.add(new Episode("Beanbags", 0));
		shows2.add(new Show("Edge case test", 1900, eps6, false));
		
		LinkedList<Episode> eps7 = new LinkedList<Episode>();
		eps7.add(new Episode("Yakko's", 0));
		eps7.add(new Episode("Hello", 0));
		eps7.add(new Episode("Where", 0));
		shows2.add(new Show("Animals", 1700, eps7, false));
		
		LinkedList<Episode> eps8 = new LinkedList<Episode>();
		eps8.add(new Episode("W", 0));
		eps8.add(new Episode("P", 0));
		eps8.add(new Episode("I", 0));
		shows2.add(new Show("WPI", 1100, eps8, false));

	  showResults2.add(0.0);
	  showResults2.add(0.0);
	  showResults2.add(0.0);
	  showResults2.add(0.0);
	}
  
  //Episodes where every episode is very long
  @Before
  public void DataSmoothExamples3() {
	  LinkedList<Episode> eps9 = new LinkedList<Episode>();
		eps9.add(new Episode("The One with the Tea Leaves", 150));
		eps9.add(new Episode("The One with Pricess Consuela", 200));
		eps9.add(new Episode("The One with the Bird Mother", 250));		
		shows3.add(new Show("Friends", 2100, eps9, false));
		
		LinkedList<Episode> eps10 = new LinkedList<Episode>();
		eps10.add(new Episode("Java", 200));
		eps10.add(new Episode("Python", 210));
		eps10.add(new Episode("C", 210));
		eps10.add(new Episode("C++", 200));
		shows3.add(new Show("Programming Languages", 2000, eps10, false));
		
		LinkedList<Episode> eps11 = new LinkedList<Episode>();
		eps11.add(new Episode("Leaving Storybrooke", 180));
		eps11.add(new Episode("Homecoming", 190));
		eps11.add(new Episode("Where", 200));
		shows3.add(new Show("Sisterhood", 600, eps11, false));

	  showResults3.add(200.0);
	  showResults3.add(198.333);
	  showResults3.add(190.0);
	}
  
  //Episodes with average run times
  @Before
  public void DataSmoothExamples4() {
	  LinkedList<Episode> eps12 = new LinkedList<Episode>();
		eps12.add(new Episode("How your mother met me", 22));
		eps12.add(new Episode("Unpause", 23));
		eps12.add(new Episode("Slapsgiving", 24));		
		shows4.add(new Show("How I Met Your Mother", 1300, eps12, false));
		
		LinkedList<Episode> eps13 = new LinkedList<Episode>();
		eps13.add(new Episode("Hello", 44));
		eps13.add(new Episode("Test", 44));
		eps13.add(new Episode("Maybe", 50));
		eps13.add(new Episode("Cool", 50));
		shows4.add(new Show("Words", 1900, eps13, false));
		
		LinkedList<Episode> eps14 = new LinkedList<Episode>();
		eps14.add(new Episode("Beaver", 21));
		eps14.add(new Episode("Giraffe", 23));
		eps14.add(new Episode("Ostrich", 25));
		shows4.add(new Show("Animals", 500, eps14, false));
		
		LinkedList<Episode> eps15 = new LinkedList<Episode>();
		eps15.add(new Episode("W", 28));
		eps15.add(new Episode("P", 27));
		eps15.add(new Episode("I", 29));
		shows4.add(new Show("WPI", 1100, eps15, false));

	  showResults4.add(23.0);
	  showResults4.add(31.0);
	  showResults4.add(32.67);
	  showResults4.add(28.0);
  }
  
  //List of shows where one show has no episodes
  @Before
  public void DataSmoothExamples5() {
	  LinkedList<Episode> eps16 = new LinkedList<Episode>();
	  
	  shows5.add(new Show("Bates Motel", 1300, eps16, false));
		
		LinkedList<Episode> eps17 = new LinkedList<Episode>();
		eps17.add(new Episode("Hello", 44));
		eps17.add(new Episode("Test", 44));
		eps17.add(new Episode("Maybe", 50));
		shows5.add(new Show("Words", 1900, eps17, false));
		
		LinkedList<Episode> eps18 = new LinkedList<Episode>();
		eps18.add(new Episode("Beaver", 21));
		eps18.add(new Episode("Giraffe", 23));
		eps18.add(new Episode("Ostrich", 25));
		shows5.add(new Show("Animals", 500, eps18, false)); 
		
		showResults5.add(0.0);
		showResults5.add(23.0);
		showResults5.add(23.0);
  }
  
  //List when there is only one show
  @Before
  public void DataSmoothExamples6() {
	  LinkedList<Episode> eps19 = new LinkedList<Episode>();
		eps19.add(new Episode("Hello", 44));
		eps19.add(new Episode("Test", 44));
		eps19.add(new Episode("Maybe", 50));
		shows6.add(new Show("Words", 1900, eps19, false));
		
		showResults6.add(46.0);
		}
  
  //List when there are only two shows
  @Before
  public void DataSmoothExamples7() {
	  LinkedList<Episode> eps20 = new LinkedList<Episode>();
		eps20.add(new Episode("Best of Both Worlds", 88));
		eps20.add(new Episode("The Ultimate Computer", 49));
		eps20.add(new Episode("Trials and Tribble-ations", 43));		
		shows7.add(new Show("Star Trek", 1800, eps20, false));
		
		LinkedList<Episode> eps21 = new LinkedList<Episode>();
		eps21.add(new Episode("Fear of a Bot Planet", 23));
		eps21.add(new Episode("The Why of Fry", 21));
		eps21.add(new Episode("Roswell that Ends Well", 23));
		eps21.add(new Episode("Meanwhile", 22));
		shows7.add(new Show("Futurama", 1900, eps21, false));
		
		showResults7.add(60.0);
		showResults7.add(22.25);
  }
  
  //
  //Tests for DataSmooth1
  @Test
  public void instructorTestDS() 
  {
	  LinkedList<Double> runtimes = D1.dataSmooth(shows);
	  
	  for(int i = 0; i < runtimes.size(); i++)
	  {
		  assertEquals(runtimes.get(i), showResults.get(i), .01);
	  }
  }
  
  //tests edge case when all episodes are 0
  @Test
  public void DataSmoothTest11() {
	  LinkedList<Double> runtimes1 = D1.dataSmooth(shows2);
	  
	  for(int i = 0; i < runtimes1.size(); i++) {
		  assertEquals(runtimes1.get(i), showResults2.get(i), 0.001);
	  }
  }
  
  //test case when all episodes are long
  @Test
  public void DataSmoothTest21() {
	  LinkedList<Double> runtimes2 = D1.dataSmooth(shows3);
	  
	  for(int i = 0; i < runtimes2.size(); i++ ) {
		  assertEquals(runtimes2.get(i), showResults3.get(i), 0.01);
	  }
  }
  
  //Test where episodes have an average length
  @Test
  public void DataSmoothTest31() {
	  LinkedList<Double> runtimes3 = D1.dataSmooth(shows4);
	  
	  for(int i = 0; i < runtimes3.size(); i++) {
		  assertEquals(runtimes3.get(i), showResults4.get(i), 0.01);
	  }
  }
  
//Test where the list of shows is empty
  @Test
  public void DataSmoothTest41() {
	  LinkedList<Double> runtimes4 = D1.dataSmooth(emptyShows);
	  
	  for(int i = 0; i < runtimes4.size(); i++) {
		  assertEquals(runtimes4.get(i), emptyShowResults.get(i), 0.01);
	  }
  }
  
  //Test where a list of episodes is empty
  @Test
  public void DataSmoothTest51() {
	  LinkedList<Double> runtimes5 = D1.dataSmooth(shows5);
	  
	  for(int i = 0; i < runtimes5.size(); i++) {
		  assertEquals(runtimes5.get(i), showResults5.get(i), 0.01);
	  }
  }
  
  //Test where there is only one show in the list
  @Test
  public void DataSmoothTest61() {
	  LinkedList<Double> runtimes6 = D1.dataSmooth(shows6);
	  
	  for(int i = 0; i < runtimes6.size(); i++) {
		  assertEquals(runtimes6.get(i), showResults6.get(i), 0.01);
	  }
  }
  
  //Test where there are only two shows in the list
  @Test
  public void DataSmoothTest71() {
	  LinkedList<Double> runtimes7 = D1.dataSmooth(shows7);
	  
	  for(int i = 0; i < runtimes7.size(); i++) {
		  assertEquals(runtimes7.get(i), showResults7.get(i), 0.01);
	  }
  }
  
  
  //
  //Tests for DataSmooth2
  @Test
  public void instructorTestDS2() 
  {
	  LinkedList<Double> runtimes = D2.dataSmooth(shows);
	  
	  for(int i = 0; i < runtimes.size(); i++)
	  {
		  assertEquals(runtimes.get(i), showResults.get(i), .01);
	  }
  }
  
  //tests edge case when all episode lengths are 0
  @Test
  public void DataSmoothTest12() {
	  LinkedList<Double> runtimes1 = D2.dataSmooth(shows2);
	  
	  for(int i = 0; i < runtimes1.size(); i++) {
		  assertEquals(runtimes1.get(i), showResults2.get(i), 0.001);
	  }
  }
  
//test case when all episodes are long
  @Test
  public void DataSmoothTest22() {
	  LinkedList<Double> runtimes2 = D2.dataSmooth(shows3);
	  
	  for(int i = 0; i < runtimes2.size(); i++ ) {
		  assertEquals(runtimes2.get(i), showResults3.get(i), 0.0001);
	  }
  }
  
//Test where episodes have an average length
  @Test
  public void DataSmoothTest32() {
	  LinkedList<Double> runtimes3 = D2.dataSmooth(shows4);
	  
	  for(int i = 0; i < runtimes3.size(); i++) {
		  assertEquals(runtimes3.get(i), showResults4.get(i), 0.01);
	  }
  }
  
  //Test where the list of shows is empty
  @Test
  public void DataSmoothTest42() {
	  LinkedList<Double> runtimes4 = D2.dataSmooth(emptyShows);
	  
	  for(int i = 0; i < runtimes4.size(); i++) {
		  assertEquals(runtimes4.get(i), emptyShowResults.get(i), 0.01);
	  }
  }
  
//Test where a list of episodes is empty
  @Test
  public void DataSmoothTest52() {
	  LinkedList<Double> runtimes5 = D2.dataSmooth(shows5);
	  
	  for(int i = 0; i < runtimes5.size(); i++) {
		  assertEquals(runtimes5.get(i), showResults5.get(i), 0.01);
	  }
}
  //Test where there is only one show in the list
  @Test
  public void DataSmoothTest62() {
	  LinkedList<Double> runtimes6 = D2.dataSmooth(shows6);
	  
	  for(int i = 0; i < runtimes6.size(); i++) {
		  assertEquals(runtimes6.get(i), showResults6.get(i), 0.01);
	  }
  }
  
//Test where there are only two shows in the list
  @Test
  public void DataSmoothTest72() {
	  LinkedList<Double> runtimes7 = D2.dataSmooth(shows7);
	  
	  for(int i = 0; i < runtimes7.size(); i++) {
		  assertEquals(runtimes7.get(i), showResults7.get(i), 0.01);
	  }
  }
}

//Subtasks:
	//-calculate the average run time for each show
	//-put the average run times for each show in a list
	//-smooth out the list of average run times:
		//have the first value and the last value remain the same in the smooth list
		//find all the triples in the list
		//replace each internal value in the average run time list with the average of the predecessor, the successor, and the value itself (the average of each triple)