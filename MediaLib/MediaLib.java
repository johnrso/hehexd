/**
 * Write a description of class MediaLib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MediaLib
{
    public static void main () {
        System.out.println("Welcome to your media library");
        Song song1 = new Song();
        Book book1 = new Book();
        Movie movie1 = new Movie();
        
        song1.setTitle("Johnny B. Goode");
        book1.setTitle("Communist Manifesto");
        movie1.setTitle("Sharknado");
        
        System.out.println(song1.getTitle());
        System.out.println(book1.getTitle());
        System.out.println(movie1.getTitle());
    }
}
