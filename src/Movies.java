
public class Movies {

	private String movieTitle;
	private String movieCategory;

	public Movies(String movieTitle, String movieCategory) {
		this.movieTitle = movieTitle;
		this.movieCategory = movieCategory;
	}

	public String getMovieTitle() {
		return movieTitle;
	}

	public void setMovieTitle() {
		this.movieTitle = movieTitle;
	}

	public String getMovieCategory() {
		return movieCategory;
	}

	public void setMovieCategory() {
		this.movieCategory = movieCategory;
	}

	public String toString() {
		return "Movies [" + movieTitle + ", " + movieCategory + "]";
	}
}
