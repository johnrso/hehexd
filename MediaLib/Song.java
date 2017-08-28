public class Song
{
    // fields
    
    private int rating;
    private String title;
    
    /**
     * Constructor for objects of class Song
     */
    public Song() {
        rating = 0;
        title = "";
        
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String t) {
        title = t;
    }
    
    public void setRating(int i) {
        rating = i;
    }
    
    public int getRating() {
        return rating;
    }
    
}
