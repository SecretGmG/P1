//Sigrist Cedric 22-120-844
//Moritz Scholz 22-122-071

package book;
import java.util.Date;
import java.text.*;
//import java.time.Duration;
import myIO.Prompt;

public class Book
{
	public static final String DATE_FORMAT = "dd.MM.yyyy";
	public static final long MILIS_PER_DAY = 1000*60*60*24; 
	
	private int id;
	private String title;
	private String author;
	private Date dateOfPublication;
	
	/** Constructs a Book from an id, title, author and dateOfPublicatiion*/
	public Book(int id, String title, String author, Date dateOfPublication) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.dateOfPublication = dateOfPublication;
	}
	/** Constructs a Book from an id, title, author and a formatted string dd.MM.yyyy */
	public Book(int id, String title, String author, String formattedDate) {
		this(id, title, author, stringToDate(formattedDate));
	}

	/** Returns the age of the book in days since publication */
	public int age() {
		long durationInMilis = System.currentTimeMillis() - dateOfPublication.getTime();
		return (int) (durationInMilis / MILIS_PER_DAY);
		/*
		* Alternative solution:
		* Duration duration = Duration.between(dateOfPublication.toInstant(), new Date().toInstant());
		* return (int) duration.toDays();
		*/
	}
	
	
	/** Returns a String representation of the book */
	public String toString()
	{
		return String.format(
			"ID: %d Title: %s Author: %s DateOfPublication: %s",
			id,title,author,dateToString(dateOfPublication)
		);
        
	}
	
	/** Instantiates a new book using user inputs */
	public static Book fromInput() {
		Book newBook = new Book(0,null,null,(Date)null); //cast null to date to not confuse the compiler
		newBook.input();
		return newBook;		
	}
	
	/** Reads all book data from user input */
	public void input() 
	{
		setId(Prompt.promptInt("Enter ID:"));
		setTitle(Prompt.promptString("Enter a title:"));
		setAuthor(Prompt.promptString("Enter an Author"));
		String date = Prompt.promptString("Enter a date in this format:" +DATE_FORMAT+":");
		setDateOfPublication(stringToDate(date));   
	}

	//--- Get-/Set-methods ---
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getDateOfPublication() {
		return dateOfPublication;
	}

	public void setDateOfPublication(Date dateOfPublication) {
		this.dateOfPublication = dateOfPublication;
	}


	

	//--- helper methods -- DO NOT CHANGE ------------------------------------
	/** Converts the Date object d into a String object */
	public static String dateToString( Date d )
	{
		SimpleDateFormat fmt = new SimpleDateFormat( DATE_FORMAT );
		return fmt.format( d );
	}

	/** Converts the String object s into a Date object */
	public static Date stringToDate( String s ) 
	{
		Date r = null;
		try {
			SimpleDateFormat fmt = new SimpleDateFormat( DATE_FORMAT );
			r = fmt.parse( s );
		} catch ( ParseException e ){
			System.err.println( e );
			System.exit(1);
		}
		return r;
	}
}
