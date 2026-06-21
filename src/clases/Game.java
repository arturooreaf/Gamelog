package clases;

import enumerados.GameStatus;
import jdk.jshell.Snippet;


public class Game {
    //region attributes/fields
    private String title;
    private int releaseYear;
    private Developer developer;
    private GameStatus status;

    //endregion
//region Getters and Setters
    public String getTitle() {
        return title;
    }

    public Developer getDeveloper() {
        return developer;
    }

    public void setDeveloper(Developer developer) {
       validateDeveloper(developer);
        this.developer = developer;
    }

    public GameStatus getStatus() {
        return status;
    }

    public void setStatus(GameStatus status) {
        validateStatus(status);
        this.status = status;
    }

    public void setTitle(String title) {
        validateTitle(title);
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        validateReleaseYear(releaseYear);
        this.releaseYear = releaseYear;
    }

    //endregion
//region Constructor
    public Game(String title, int releaseYear, Developer developer, GameStatus status) {
        validateTitle(title);
        validateReleaseYear(releaseYear);
        validateStatus(status);
        validateDeveloper(developer);
        this.title = title; // "el atributo de este objeto = el valor que me pasaron
        this.releaseYear = releaseYear;
        this.developer = developer;
        this.status = status;
    }



    //endregion
    //region Methods
    @Override
    public String toString() {
        return "The game is: " + this.title + " (" + this.releaseYear + ") | " + this.developer;
    }
//endregion
    private void validateReleaseYear(int releaseYear) {
        if (releaseYear < 1958 || releaseYear >= 2050) {
            throw new IllegalArgumentException("The game must have been released in a positive year");
        }
    }

    private void validateTitle(String title) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("A game must have a title");
        }
    }
private void validateStatus(GameStatus status){
    if (status == null) throw new IllegalArgumentException("status cannot null ");
}
    private void validateDeveloper(Developer developer) {
        if (developer == null) throw new IllegalArgumentException("developer cannot null ");
    }
}

