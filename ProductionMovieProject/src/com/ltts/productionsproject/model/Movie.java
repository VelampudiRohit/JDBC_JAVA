package com.ltts.productionsproject.model;

public class Movie {
	
	private int movieid;
	private String Moviename;
	private String Heroname;
	private String Heroine;
	private String Releaseddate;
	private String Language;
	private int Length;
	private String Movietype;
	private int Productionid;
	

	public Movie() {
		super();
	}

	
	

	public Movie(int movieid, String moviename, String heroname, String heroine, String releaseddate, String language,
			int length, String movietype, int productionid) {
		super();
		this.movieid = movieid;
		Moviename = moviename;
		Heroname = heroname;
		Heroine = heroine;
		Releaseddate = releaseddate;
		Language = language;
		Length = length;
		Movietype = movietype;
		Productionid = productionid;
	}




	public String getHeroine() {
		return Heroine;
	}

	public void setHeroine(String heroine) {
		Heroine = heroine;
	}

	public int getMovieid() {
		return movieid;
	}

	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}

	public String getMoviename() {
		return Moviename;
	}

	public void setMoviename(String moviename) {
		Moviename = moviename;
	}

	public String getHeroname() {
		return Heroname;
	}

	public void setHeroname(String heroname) {
		Heroname = heroname;
	}

	public String getReleaseddate() {
		return Releaseddate;
	}

	public void setReleaseddate(String releaseddate) {
		Releaseddate = releaseddate;
	}

	public String getLanguage() {
		return Language;
	}

	public void setLanguage(String language) {
		Language = language;
	}

	public int getLength() {
		return Length;
	}

	public void setLength(int length) {
		Length = length;
	}

	public String getMovietype() {
		return Movietype;
	}

	public void setMovietype(String movietype) {
		Movietype = movietype;
	}

	public int getProductionid() {
		return Productionid;
	}

	public void setProductionid(int productionid) {
		Productionid = productionid;
	}




	@Override
	public String toString() {
		return "Movie [movieid=" + movieid + ", Moviename=" + Moviename + ", Heroname=" + Heroname + ", Heroine="
				+ Heroine + ", Releaseddate=" + Releaseddate + ", Language=" + Language + ", Length=" + Length
				+ ", Movietype=" + Movietype + ", Productionid=" + Productionid + "]";
	}
	
	
	
	
	


}
