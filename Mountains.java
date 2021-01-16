public abstract class Mountains implements IsCreatingByNature {

    static String name;
    private static String type;
    Part part;
    public Adjectives adjective;

    public Mountains(String name, String type, Part part, Adjectives adjective) {
        this.name = name;
        this.type = type;
        this.part = part;
        this.adjective = adjective;
    }

    public enum Part {
        PEAKS,
        SNOWLINE,
        HILLSIDE,
        FOOTHILLS,
        SYNONYMS
    }

    public static String getName() {
        return name;
    }

    public Part getPart() {
        return part;
    }

    public static String getType() {
        return type;
    }

    public Adjectives getAdjective() {
        return adjective;
    }
}
