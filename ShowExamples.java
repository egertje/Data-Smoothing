/**
 * A class which holds all the instantiations for episodes, show summaries, and shows
 * as well as the test cases for the organizeShow methods
 * @author Emma Gertje and Serena Raso
 */
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import java.util.LinkedList;
import java.util.Arrays;

public class ShowExamples 
{
	ShowManager1 sm1 = new ShowManager1();
	ShowManager2 sm2 = new ShowManager2();
	
	LinkedList<Show> emptyShows = new LinkedList<Show>();
	LinkedList<Show> shows = new LinkedList<Show>();
	LinkedList<Show> shows2 = new LinkedList<Show>();
	LinkedList<Show> shows3 = new LinkedList<Show>();
	LinkedList<Show> shows4 = new LinkedList<Show>();
	LinkedList<Show> shows5 = new LinkedList<Show>();
	LinkedList<Show> shows6 = new LinkedList<Show>();
	LinkedList<Show> shows7 = new LinkedList<Show>();
	LinkedList<Show> shows8 = new LinkedList<Show>();
	
	ShowSummary report1 = new ShowSummary();
	ShowSummary report2 = new ShowSummary();
	ShowSummary report3 = new ShowSummary();
	ShowSummary report4 = new ShowSummary();
	ShowSummary report5 = new ShowSummary();
	ShowSummary report6 = new ShowSummary();
	ShowSummary report7 = new ShowSummary();
	ShowSummary report8 = new ShowSummary();
	
	public ShowExamples()
	{
		LinkedList<Episode> eps1 = new LinkedList<Episode>();
		eps1.add(new Episode("Best of Both Worlds", 88));
		eps1.add(new Episode("The Ultimate Computer", 49));
		eps1.add(new Episode("Trials and Tribble-ations", 43));		
		Show s1 = new Show("Star Trek", 1800, eps1, false);
		shows.add(s1);
		report1.primetime.add(s1);
		
		LinkedList<Episode> eps2 = new LinkedList<Episode>();
		eps2.add(new Episode("Fear of a Bot Planet", 23));
		eps2.add(new Episode("The Why of Fry", 21));
		eps2.add(new Episode("Roswell that Ends Well", 23));
		eps2.add(new Episode("Meanwhile", 22));
		Show s2 = new Show("Futurama", 1900, eps2, false);
		shows.add(s2);
		report1.primetime.add(s2);
		
		LinkedList<Episode> eps3 = new LinkedList<Episode>();
		eps3.add(new Episode("Yakko's World", 4));
		eps3.add(new Episode("Hello Nice Warners", 8));
		eps3.add(new Episode("Where Rodents Dare", 9));
		Show s3 = new Show("Animaniacs", 1630, eps3, false);
		shows.add(s3);
		report1.daytime.add(s3);
		
		LinkedList<Episode> eps4 = new LinkedList<Episode>();
		eps4.add(new Episode("The Letter W", 59));
		eps4.add(new Episode("The Letter P", 57));
		eps4.add(new Episode("The Letter I", 58));
		Show s4 = new Show("Sesame Street", 900, eps4, false);
		shows.add(s4);
		report1.daytime.add(s4);
	}
	  
	 //Shows where every is special
	  @Before
	  public void ShowExamples2() {
		  LinkedList<Episode> eps5 = new LinkedList<Episode>();
			eps5.add(new Episode("The One with the Video Tape", 10));
			eps5.add(new Episode("The One with Giant Poking Device", 20));
			eps5.add(new Episode("The One with Ross' Tan", 30));
			Show s5 = new Show("Friends", 1830, eps5, true);
			shows2.add(s5);
			
			LinkedList<Episode> eps6 = new LinkedList<Episode>();
			eps6.add(new Episode("Hello World", 10));
			eps6.add(new Episode("This is my test", 20));
			eps6.add(new Episode("What's up", 30));
			eps6.add(new Episode("Beanbags", 40));
			Show s6 = new Show("Edge case test", 1900, eps6, true);
			shows2.add(s6);
			
			LinkedList<Episode> eps7 = new LinkedList<Episode>();
			eps7.add(new Episode("Yakko's", 10));
			eps7.add(new Episode("Hello", 20));
			eps7.add(new Episode("Where", 30));
			Show s7 = new Show("Animals", 1700, eps7, true);
			shows2.add(s7);
			
			LinkedList<Episode> eps8 = new LinkedList<Episode>();
			eps8.add(new Episode("W", 10));
			eps8.add(new Episode("P", 20));
			eps8.add(new Episode("I", 30));
			Show s8 = new Show("WPI", 1100, eps8, true);
			shows2.add(s8);
		}
	  
	  //Shows were every show is non-special and either prime time, daytime, or late night
	  @Before
	  public void ShowExamples3() {
		  LinkedList<Episode> eps9 = new LinkedList<Episode>();
			eps9.add(new Episode("The One with the Tea Leaves", 150));
			eps9.add(new Episode("The One with Pricess Consuela", 200));
			eps9.add(new Episode("The One with the Bird Mother", 250));		
			Show s9 = new Show("Friends", 2100, eps9, false);
			shows3.add(s9);
			report3.primetime.add(s9);
			
			LinkedList<Episode> eps10 = new LinkedList<Episode>();
			eps10.add(new Episode("Java", 200));
			eps10.add(new Episode("Python", 210));
			eps10.add(new Episode("C", 210));
			eps10.add(new Episode("C++", 200));
			Show s10 = new Show("Programming Languages", 2000, eps10, false);
			shows3.add(s10);
			report3.primetime.add(s10);
			
			LinkedList<Episode> eps11 = new LinkedList<Episode>();
			eps11.add(new Episode("Leaving Storybrooke", 180));
			eps11.add(new Episode("Homecoming", 190));
			eps11.add(new Episode("Where", 200));
			Show s11 = new Show("Sisterhood", 700, eps11, false);
			shows3.add(s11);
			report3.daytime.add(s11);
		}
	  
	  //Shows where every show is over night
	  @Before
	  public void ShowExamples4() {
		  LinkedList<Episode> eps12 = new LinkedList<Episode>();
			eps12.add(new Episode("How your mother met me", 22));
			eps12.add(new Episode("Unpause", 23));
			eps12.add(new Episode("Slapsgiving", 24));		
			Show s12 = new Show("How I Met Your Mother", 300, eps12, false);
			shows4.add(s12);

			LinkedList<Episode> eps13 = new LinkedList<Episode>();
			eps13.add(new Episode("Hello", 44));
			eps13.add(new Episode("Test", 44));
			eps13.add(new Episode("Maybe", 50));
			eps13.add(new Episode("Cool", 50));
			Show s13 = new Show("Words", 400, eps13, true);
			shows4.add(s13);
			
			LinkedList<Episode> eps14 = new LinkedList<Episode>();
			eps14.add(new Episode("Beaver", 21));
			eps14.add(new Episode("Giraffe", 23));
			eps14.add(new Episode("Ostrich", 25));
			Show s14 = new Show("Animals", 230, eps14, true);
			shows4.add(s14);
			
			LinkedList<Episode> eps15 = new LinkedList<Episode>();
			eps15.add(new Episode("W", 28));
			eps15.add(new Episode("P", 27));
			eps15.add(new Episode("I", 29));
			Show s15 = new Show("WPI", 200, eps15, false);
			shows4.add(s15);
	  }
	  
	//Shows where every show is non-special and over night
	  @Before
	  public void ShowExamples5() {
		  LinkedList<Episode> eps16 = new LinkedList<Episode>();
		  Show s16 = new Show("Bates Motel", 130, eps16, false);
		  shows5.add(s16);
			
			LinkedList<Episode> eps17 = new LinkedList<Episode>();
			eps17.add(new Episode("Hello", 44));
			eps17.add(new Episode("Test", 44));
			eps17.add(new Episode("Maybe", 50));
			Show s17 = new Show("Words", 200, eps17, false);
			shows5.add(s17);
			
			LinkedList<Episode> eps18 = new LinkedList<Episode>();
			eps18.add(new Episode("Beaver", 21));
			eps18.add(new Episode("Giraffe", 23));
			eps18.add(new Episode("Ostrich", 25));
			Show s18 = new Show("Animals", 400, eps18, false); 
			shows5.add(s18);
			
	  }
	  
	  //Shows when some are over night and some are either prime time, day time, and late night and none are special
	  @Before
	  public void ShowExamples6() {
		  LinkedList<Episode> eps19 = new LinkedList<Episode>();
			eps19.add(new Episode("Hello", 44));
			eps19.add(new Episode("Test", 44));
			eps19.add(new Episode("Maybe", 50));
			Show s19 = new Show("Words", 1900, eps19, false);
			shows6.add(s19);
			report6.primetime.add(s19);
			
			LinkedList<Episode> eps20 = new LinkedList<Episode>();
			eps20.add(new Episode("Best of Both Worlds", 88));
			eps20.add(new Episode("The Ultimate Computer", 49));
			eps20.add(new Episode("Trials and Tribble-ations", 43));		
			Show s20 = new Show("Star Trek", 700, eps20, false);
			shows6.add(s20);
			report6.daytime.add(s20);
			
			LinkedList<Episode> eps21 = new LinkedList<Episode>();
			eps21.add(new Episode("Fear of a Bot Planet", 23));
			eps21.add(new Episode("The Why of Fry", 21));
			eps21.add(new Episode("Roswell that Ends Well", 23));
			eps21.add(new Episode("Meanwhile", 22));
			Show s21 = new Show("Futurama", 300, eps21, false);
			shows6.add(s21);
			
			}
	  
	  //Shows when nothing is overnight but some are special and some are not
	  @Before
	  public void ShowExamples7() {
		  LinkedList<Episode> eps22 = new LinkedList<Episode>();
			eps22.add(new Episode("How your mother met me", 22));
			eps22.add(new Episode("Unpause", 23));
			eps22.add(new Episode("Slapsgiving", 24));		
			Show s22 = new Show("How I Met Your Mother", 1300, eps22, false);
			shows7.add(s22);
			report7.daytime.add(s22);

			LinkedList<Episode> eps23 = new LinkedList<Episode>();
			eps23.add(new Episode("Hello", 44));
			eps23.add(new Episode("Test", 44));
			eps23.add(new Episode("Maybe", 50));
			eps23.add(new Episode("Cool", 50));
			Show s23 = new Show("Words", 2300, eps23, true);
			shows7.add(s23);
			
			LinkedList<Episode> eps24 = new LinkedList<Episode>();
			eps24.add(new Episode("Beaver", 21));
			eps24.add(new Episode("Giraffe", 23));
			eps24.add(new Episode("Ostrich", 25));
			Show s24 = new Show("Animals", 1230, eps24, true);
			shows7.add(s24);
			
			LinkedList<Episode> eps25 = new LinkedList<Episode>();
			eps25.add(new Episode("W", 28));
			eps25.add(new Episode("P", 27));
			eps25.add(new Episode("I", 29));
			Show s25 = new Show("WPI", 2230, eps25, false);
			shows7.add(s25);
			report7.latenight.add(s25);
	  }
	  
	  //Shows when some things are over night and special and some are non-special and either 
	  //daytime, late night, or prime time
	  @Before
	  public void ShowExamples8() {
		  LinkedList<Episode> eps26 = new LinkedList<Episode>();
			eps26.add(new Episode("How your mother met me", 22));
			eps26.add(new Episode("Unpause", 23));
			eps26.add(new Episode("Slapsgiving", 24));		
			Show s26 = new Show("How I Met Your Mother", 1300, eps26, false);
			shows8.add(s26);
			report8.daytime.add(s26);

			LinkedList<Episode> eps27 = new LinkedList<Episode>();
			eps27.add(new Episode("Hello", 44));
			eps27.add(new Episode("Test", 44));
			eps27.add(new Episode("Maybe", 50));
			eps27.add(new Episode("Cool", 50));
			Show s27 = new Show("Words", 2300, eps27, true);
			shows8.add(s27);
			
			LinkedList<Episode> eps28 = new LinkedList<Episode>();
			eps28.add(new Episode("Beaver", 21));
			eps28.add(new Episode("Giraffe", 23));
			eps28.add(new Episode("Ostrich", 25));
			Show s28 = new Show("Animals", 230, eps28, false);
			shows8.add(s28);
			
			LinkedList<Episode> eps29 = new LinkedList<Episode>();
			eps29.add(new Episode("W", 28));
			eps29.add(new Episode("P", 27));
			eps29.add(new Episode("I", 29));
			Show s29 = new Show("WPI", 2230, eps29, false);
			shows8.add(s29);
			report8.latenight.add(s29);
	  }
	  
	  //
	  //Tests for ShowSummary1
	@Test
	public void instructorTestOrganizeShows() 
	{
		ShowSummary report2 = sm1.organizeShows(shows);
		assertEquals(report1, report2);
	}
	
	//Test for edge case when every show is special
	@Test
	public void showSummary11() {
		
		ShowSummary report3 = sm1.organizeShows(shows2);
		assertEquals(report3, report2);
	}
	
	//Test for when all of the shows are non-special and either late night, prime time, or daytime
	@Test
	public void showSummary21() {
		
		ShowSummary report4 = sm1.organizeShows(shows3);
		assertEquals(report4, report3);
	}
	
	//Test for edge case when all of the shows are over night
	@Test
	public void showSummary31() {
		
		ShowSummary report5 = sm1.organizeShows(shows4);
		assertEquals(report5, report4);
	}
	
	//Test for edge case when the list of shows is empty
	@Test
	public void showSummary41() {
		
		ShowSummary report6 = sm1.organizeShows(emptyShows);
		assertEquals(report6, report4);
	}
	
	//Test for the case when every show is non-special and overnight 
	@Test
	public void showSummary51() {
		
		ShowSummary report7 = sm1.organizeShows(shows5);
		assertEquals(report7, report5);
	}
	
	//Test for the case when everything is non-special but some are over night and some are not
	@Test
	public void showSummary61() {
		
		ShowSummary report8 = sm1.organizeShows(shows6);
		assertEquals(report8, report6);
	}
	
	//Test for the case when everything is not over night but some are special
	@Test
	public void showSummary71() {
		
		ShowSummary report9 = sm1.organizeShows(shows7);
		assertEquals(report9, report7);
	}
	
	//Test for the case when some things are special and some things are non-special
	//and when some things are over night and some things are either prime time, late night, or daytime
	@Test
	public void showSummary81() {
		
		ShowSummary report10 = sm1.organizeShows(shows8);
		assertEquals(report10, report8);
	}
	
	
	  //
	  //Tests for ShowSummary2
	@Test
	public void instructorTestOrganizeShows2() 
	{
		ShowSummary report2 = sm2.organizeShows(shows);
		assertEquals(report1, report2);
	}
	
	//Test for edge case when every show is special
	@Test
	public void showSummary12() {
		
		ShowSummary report3 = sm2.organizeShows(shows2);
		assertEquals(report3, report2);
	}
	
	//Test for when all of the shows are non-special and either late night, prime time, or daytime
	@Test
	public void showSummary22() {
		
		ShowSummary report4 = sm2.organizeShows(shows3);
		assertEquals(report4, report3);
	}
	
	//Test for edge case when all of the shows are over night
	@Test
	public void showSummary32() {
		
		ShowSummary report5 = sm2.organizeShows(shows4);
		assertEquals(report5, report4);
	}
	
	//Test for edge case when the list of shows is empty
	@Test
	public void showSummary42() {
		
		ShowSummary report6 = sm2.organizeShows(emptyShows);
		assertEquals(report6, report4);
	}
	
	//Test for the case when every show is non-special and overnight 
	@Test
	public void showSummary52() {
		
		ShowSummary report7 = sm2.organizeShows(shows5);
		assertEquals(report7, report5);
	}
	
	//Test for the case when everything is non-special but some are over night and some are not
	@Test
	public void showSummary62() {
		
		ShowSummary report8 = sm2.organizeShows(shows6);
		assertEquals(report8, report6);
	}
	
	//Test for the case when everything is not over night but some are special
	@Test
	public void showSummary72() {
		
		ShowSummary report9 = sm2.organizeShows(shows7);
		assertEquals(report9, report7);
	}
	
	//Test for the case when some things are special and some things are non-special
	//and when some things are over night and some things are either prime time, late night, or daytime
	@Test
	public void showSummary82() {
		
		ShowSummary report10 = sm2.organizeShows(shows8);
		assertEquals(report10, report8);
	}
	
}

//Subtasks for Problem 1:
	//-Sort through the list of shows
		//determine all of the shows that are daytime, night time, and prime time
		//determine if the daytime, prime time, and late night shows are non-special
	//-make a ShowSummary of all the daytime, prime time, and late night shows that are non-special
	//-make the order of the shows in each list in the same order as the original list
