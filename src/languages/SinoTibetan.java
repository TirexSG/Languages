package languages;

class SinoTibetan extends Language{

	  SinoTibetan(String lanName, int nSpeakers){
	    super(lanName, nSpeakers, "Asia", "subject-object-verb");
	    this.name = lanName;
	    this.numSpeakers = nSpeakers;
	    if (this.name.contains("Chinese")){
	      this.wordOrder = "subject-verb-object";
	    }
	  }

	  



	}