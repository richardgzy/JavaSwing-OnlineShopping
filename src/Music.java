


/**
 * Created by Richard's Surface on 9/21/2016.
 */
public class Music extends Product{

    private String singer;
    private String genre;
    private int year;
    private int numOfSongs;

    public Music(String name, float price, int quantity, ProductType type) {
        super(name, price, quantity, type);
    }

    public Music(ProductType type, String name, float price, int year, String genre, String singer, int quantity, int numOfSongs){
        super(name, price, quantity, type);
        this.singer = singer;
        this.genre = genre;
        this.year = year;
        this.numOfSongs = numOfSongs;
      //Add and show extra property (by Richard)
        this.setProperty("year", "Year", year);
		this.setProperty("genre", "Genre", genre);
		this.setProperty("singer", "Singer", singer);
		this.setProperty("numOfSongs", "NumOfSongs", numOfSongs);
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumOfSongs() {
        return numOfSongs;
    }

    public void setNumOfSongs(int numOfSongs) {
        this.numOfSongs = numOfSongs;
    }

    @Override
    public String toString(){
        //-name,singer,genre,year,quantity,numOfSongs,price
        return this.getName() + FileHandler.SPLIT_COMMA +
                this.getSinger() +FileHandler.SPLIT_COMMA +
                this.getGenre() + FileHandler.SPLIT_COMMA +
                this.getYear() + FileHandler.SPLIT_COMMA +
                this.getQuantity()	+ FileHandler.SPLIT_COMMA +
                this.getNumOfSongs()+ FileHandler.SPLIT_COMMA +
                this.getPrice();
    }

}