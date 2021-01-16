public class Peaks extends Mountains implements IsCreatingByNature {

    public Peaks(String name, String type, Part part, Adjectives adjective) {
        super(name, type, part, adjective);
        this.part = Part.PEAKS;
    }

    public void darkened(Adjectives adjective, SnowLine snowLine){
        System.out.print(adjective.getName()+"темневшим над "+snowLine.getType()+", ");
    }

}
