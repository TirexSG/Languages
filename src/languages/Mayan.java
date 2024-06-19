package languages;

class Mayan extends Language {

	  Mayan(String lanName, int nSpeakers){
	    super(lanName, nSpeakers, "Central America", "verb-object-subject");
	    this.name = lanName;
	    this.numSpeakers = nSpeakers;
	  }

	  @Override
	  public void getInfo(){
	    System.out.println(this.name + (" is spoken by ") + this.numSpeakers + (" people mainly in ") + this.regionsSpoken + (".\nThe language follows the word order: ") + this.wordOrder + "\nFun fact: " + this.name + " is an ergative language");
	  }









	}