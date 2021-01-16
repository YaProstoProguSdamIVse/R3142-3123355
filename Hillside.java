public class Hillside extends Mountains implements IsCreatingByNature {

    public Hillside(String name, String type, Part part, Adjectives adjective) {
        super(name, type, part, adjective);
        this.part = Part.HILLSIDE;
    }

}
