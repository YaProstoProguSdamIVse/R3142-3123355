import java.sql.SQLOutput;

public class Humans {
    private String name;
    private int age;
    private Male male;
    protected Pronoun pronoun;
    private boolean pilotAbillity;

    public Humans(String name, int age, Male male, Pronoun pronoun, boolean pilotAbillity) {
        this.name = name;
        this.male = male;
        this.age = age;
        this.pronoun = pronoun;
        this.pilotAbillity = pilotAbillity;
    }

    public enum Male {
        MALE,
        FEMALE,
        UNKNOWN
    }

    public enum Pronoun {
        I("я ","мне ","мой "),
        HE("он ","ему ","его "),
        WE("мы ","нам ","наш ");

        private String normal;
        private String objective;
        private String possessive;

        Pronoun(String normal, String objective, String possessive) {
            this.normal = normal;
            this.objective = objective;
            this.possessive = possessive;
        }

        public void approaching(Peaks peak) {
            System.out.print("Приближаясь к "+peak.adjective.getName()+peak.getType()+", ");
        }

        public void notice(Pronoun pronoun, Frequency frequency) {
            System.out.print(pronoun.getNormal()+"замечал");
            if (pronoun.equals(pronoun.WE)) {
                System.out.print("и "); }
            else { System.out.print(" "); }
            System.out.print(frequency.getName());
        }

//        public void understood(Pronoun pronoun){
//            System.out.print(pronoun.getNormal()+" уже понял");
//            if (pronoun.equals(pronoun.WE)) {
//                System.out.print("и, "); }
//            else { System.out.print(", "); }
//            System.out.print("что ");
//        }

        public String getNormal() {
            return normal;
        }
        public String getObjective() {
            return objective;
        }
        public String getPossessive() {
            return possessive;
        }
    }

    public void remember(Humans human, Frequency frequency){
        System.out.print("и "+frequency.getName()+"вспоминал");
        if (human.pronoun.equals(human.pronoun.WE)) {
            System.out.print("и "); }
        else { System.out.print(" "); }
    }

    public void pilot(Humans human, Machine machine) {
        System.out.print(human.getName()+" вел "+machine.getType().getName());
    }

    public void considered(Humans human, Instruments instrument) {
        if (human.pronoun.equals(human.pronoun.I)) {
            System.out.print(", а " + human.pronoun.getNormal() + " рассматривал их " + instrument.getType() + ", "); }
        if (human.pronoun.equals(human.pronoun.HE)) {
            System.out.println("полюбоваться "+instrument.getType()+"на все эти диковины "); }
    }

    public void click(Instruments instrument, Frequency frequency) {
        System.out.print(frequency.getName()+"щелкая "+instrument.getType()+" ");
    }

    public void replace(Humans human2, Frequency frequency) {
        System.out.print("и "+frequency.getName()+"замещая у руля "+human2.getName()+"а ");  //товарищА
    }

    public void toenable(Humans human2) {
        if (human2.pronoun.equals(human2.pronoun.HE)) {
            System.out.print("чтобы и ему дать возможность "); }
        if (human2.pronoun.equals(human2.pronoun.I)) {
            System.out.print("чтобы и мне дать возможность "); }
    }

    public void pilotingDuration(IntroductoryWords introductoryWords, Humans human) {
        System.out.print(introductoryWords.getName());
        if (human.pilotAbillity==true) {
            System.out.print("достаточно долго, "); }
        else {
            System.out.print("ненадолго, "); }

        if (human.pronoun.equals(human.pronoun.I)) {
            System.out.print("ибо мое искусство пилотирования "); }
        else if (human.pronoun.equals(human.pronoun.HE)) {
            System.out.print("ибо его искусство пилотирования "); }

        if (human.pilotAbillity==true) {
            System.out.println("было на высоте."); }
        else {
            System.out.println("оставляло желать лучшего."); }

    }

    public void understood(Humans human){
        System.out.print(human.getName()+" уже понял");
        if (human.pronoun.equals(human.pronoun.WE)) {
            System.out.print("и, "); }
        else { System.out.print(", "); }
        System.out.print("что ");
    }

    public String getName() {
        return name;
    }
}
