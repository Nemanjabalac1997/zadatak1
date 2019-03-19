package glavnipaket;

public class korisnik {
       private  String ime;
       private String prezime;
       private int godine;
       
       public korisnik();
       
        public korisnik(String ime, String prezime, int godine)
       {
    	   this.ime  = ime;
    	   this.prezime  = prezime;
    	   this.godine  = godine;
       }

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}
	
	
}
