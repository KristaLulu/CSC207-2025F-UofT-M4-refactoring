package theater;

/**
 * Class representing a play.
 */

public class Play {

    private String name;
    private String type;

    /**
     * Constructs a new Play with the given name and type.
     * @param name the name of the play
     * @param type the type of the play
     */
    public Play(String name, String type) {
        this.name = name;
        this.type = type;
    }

    /**
     * Returns the play's name.
     * @return the name of the play
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the type of the play.
     * @return the type of the play
     */
    public String getType() {
        return type;
    }
}
