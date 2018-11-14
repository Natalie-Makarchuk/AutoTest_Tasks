package Task_06;

public class ColourBulb extends Bulb {

    private Bulb bulbState;
    private Colour bulbColour;


    public ColourBulb(Bulb State, int colourSet) {
        this.bulbColour = Colour.values(colourSet)

    }
}