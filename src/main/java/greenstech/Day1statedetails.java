package greenstech;

public class Day1statedetails extends Day1langinfo{

	private static Day1statedetails lang;
	public void southindia(){
		System.out.println("south india");
	}
	public void northindia(){
		System.out.println("North India");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Day1statedetails.lang=new Day1statedetails();
	lang.english();
	lang.hindi();
	lang.tamil();	
	lang.northindia();
	lang.southindia();
	}

}
