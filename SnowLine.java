public class SnowLine extends Mountains implements IsCreatingByNature {

    public SnowLine(String name, String type, Part part, Adjectives adjective) {
        super(name, type, part, adjective);
        this.part = Part.SNOWLINE;
    }

    public void separating(Rocks rocks, Glacier glacier){
        System.out.print("отделявшей " + rocks.adjective1.getName() + rocks.getType() + "от " + glacier.age.getAge() + glacier.getName() + ", ");
    }

}
