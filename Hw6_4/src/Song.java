public class Song {
	String title;
	String artist;
	int year;
	String country;
	public Song() {
		this("", "", 0, "");
	}
	
	public Song(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	
	public void show() {
		System.out.printf("%d�� %s������ %s�� �θ� %s", year, country, artist, title);
	}
	
	public static void main(String[] args) {
		Song fabrito = new Song("Dancing Queen", "ABBA", 1978, "������");
		fabrito.show();
	}
}
