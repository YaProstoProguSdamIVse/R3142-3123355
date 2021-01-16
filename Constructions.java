import java.sql.SQLOutput;

public class Constructions implements IsCreatingByPeople {
    private String name;
    Adjectives adjective;
    String consists;

    public Constructions(String name, Adjectives adjective, String consists) {
        this.name = name;
        this.adjective = adjective;
        this.consists = consists;
    }


    public void clenched(Hillside hillside, Constructions constructions){
        System.out.print("прилепившихся к " + Hillside.getType() + constructions.adjective.getName() + constructions.getName() + ", ");
    }

    public void consists(Adjectives adjective, Constructions constructions, String part, Rocks rocks){
        System.out.print(adjective.getName() + constructions.getName() + "состояли ");

        if (part == "MOSTLY") {
            System.out.print("по большей части ");
        }
        if (part == "PARTLY") {
            System.out.print("от части ");
        }
        if (part == "LITTLE") {
            System.out.print("совсем немного из ");
        }

        System.out.print("из " + rocks.adjective2.getName() + rocks.getName());
    }

    public void imagination(Humans human, Frequency frequency, Constructions constructions){
        System.out.print("Волновали и дразнили " + human.pronoun.getPossessive() + "воображение ");
        System.out.println(frequency.getName() + "все эти " + constructions.adjective.getName() + constructions.getConsists() + ".");
    }

    public String getName() {
        return name;
    }
    public String getConsists() {
        return consists;
    }

}
