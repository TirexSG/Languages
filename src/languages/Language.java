package languages;

public class Language {

	  protected String name;
	  protected int numSpeakers;
	  protected String regionsSpoken;
	  protected String wordOrder;

	   Language(String lanName, int nSpeakers, String regSpoken, String woOrder){
	      this.name = lanName;
	      this.numSpeakers = nSpeakers;
	      this.regionsSpoken = regSpoken;
	      this.wordOrder = woOrder;
	    }

	  public void getInfo(){
	    System.out.println(this.name + (" is spoken by ") + this.numSpeakers + (" people mainly in ") + this.regionsSpoken + (".\nThe language follows the word order: ") + this.wordOrder);
	  }

	  public static void main(String[] args){
	    Language spanish = new Language("Spanish", 599405122, "Spain, Latin America and Equatorial Guinea", "subject-verb-object");
	    spanish.getInfo();

	    Language qeqchi = new Mayan("Q'eqchi'", 1371606);
	    qeqchi.getInfo();

	    Language mandarin = new SinoTibetan("Mandarin Chinese", 940000000);
	    mandarin.getInfo();

	    Language burmese = new SinoTibetan("Burmese", 33000000);
	    burmese.getInfo();
	    



	  }
	}

